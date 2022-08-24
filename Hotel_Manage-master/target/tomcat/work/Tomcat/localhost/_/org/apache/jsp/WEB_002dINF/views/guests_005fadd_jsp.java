/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-15 05:33:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guests_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"zh\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    <title>住客入住</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../views/static/common/layui/css/layui.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../views/static/admin/css/style.css\">\n");
      out.write("    <script src=\"../views/static/common/layui/layui.js\"></script>\n");
      out.write("    <script src=\"../views/static/common/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"../views/static/common/vue.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        window.onload = function(){\n");
      out.write("            function getDate(){\n");
      out.write("                debugger;\n");
      out.write("                var today = new Date();\n");
      out.write("                var date;\n");
      out.write("                date = (today.getFullYear()) +\"-\" + (today.getMonth() + 1 ) + \"-\" + today.getDate() + \"-\" + today.toLocaleTimeString();\n");
      out.write("                return date;\n");
      out.write("            }\n");
      out.write("            window.setInterval(function(){\n");
      out.write("                document.getElementById(\"getTime\").value=getDate();\n");
      out.write("            }, 1000);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"app\">\n");
      out.write("    <!--顶栏-->\n");
      out.write("    <header>\n");
      out.write("        <div style=\"float:left;\"><img src=\"../views/static/admin/img/tubiao.png\" width=\"152\" height=\"55\" /></div>\n");
      out.write("        <div style=\"float: right\">\n");
      out.write("            <i  class=\"layui-icon  layui-anim layui-anim-rotate layui-anim-loop\" style=\"font-size: 30px; color: #969baa;\">&#xe614;</i>&nbsp; &nbsp; &nbsp;\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"main\" id=\"app\">\n");
      out.write("        <!--左栏-->\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <ul class=\"cl\" >\n");
      out.write("                <!--顶级分类-->\n");
      out.write("                <li v-for=\"vo,index in menu\" :class=\"{hidden:vo.hidden}\">\n");
      out.write("                    <a href=\"javascript:;\"  :class=\"{active:vo.active}\"  @click=\"onActive(index)\">\n");
      out.write("                        <i class=\"layui-icon\" v-html=\"vo.icon\"></i>\n");
      out.write("                        <span v-text=\"vo.name\"></span>\n");
      out.write("                        <i class=\"layui-icon arrow\" v-show=\"vo.url.length==0\">&#xe61a;</i> <i v-show=\"vo.active\" class=\"layui-icon active\">&#xe623;</i>\n");
      out.write("                    </a>\n");
      out.write("                    <!--子级分类-->\n");
      out.write("                    <div v-for=\"vo2,index2 in vo.list\">\n");
      out.write("                        <a href=\"javascript:;\" :class=\"{active:vo2.active}\" @click=\"onActive(index,index2)\" v-text=\"vo2.name\"></a>\n");
      out.write("                        <i v-show=\"vo2.active\" class=\"layui-icon active\">&#xe623;</i>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--右侧-->\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <fieldset class=\"layui-elem-field layui-field-title\">\n");
      out.write("                <legend>添加住客</legend>\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form class=\"layui-form \" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/guests/add\">\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">姓名</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <input type=\"text\" name=\"Name\" required  placeholder=\"请输入姓名\" autocomplete=\"off\" class=\"layui-input\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">性别</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <select name=\"Sex\" class=\"layui-input\" autocomplete=\"off\" required >\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            <option value=\"男\">男</option>\n");
      out.write("                            <option value=\"女\">女</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">身份证号</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <input type=\"number\" name=\"Card\" oninput=\"if(value.length>18)value=value.slice(0,18)\" required  placeholder=\"请填写身份证号\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">手机号</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <input type=\"number\" name=\"Phone\" oninput=\"if(value.length>11)value=value.slice(0,11)\" required  placeholder=\"请填写手机号\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\" >\n");
      out.write("                    <label class=\"layui-form-label\">入住时间</label>\n");
      out.write("                    <div class=\"layui-input-block\" >\n");
      out.write("                        <input type=\"text\" name=\"EnterTime\" required  id=\"getTime\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">退房时间</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <input type=\"text\" name=\"ExitTime\" required  id=\"\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">房间类型</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <select name=\"H_Type\" class=\"layui-input\" autocomplete=\"off\" required >\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            <option value=\"豪华大床房\">豪华大床房</option>\n");
      out.write("                            <option value=\"高级大床房\">高级大床房</option>\n");
      out.write("                            <option value=\"普通大床房\">普通大床房</option>\n");
      out.write("                            <option value=\"豪华套房\">豪华套房</option>\n");
      out.write("                            <option value=\"标准套房\">标准套房</option>\n");
      out.write("                            <option value=\"高级三人间\">高级三人间</option>\n");
      out.write("                            <option value=\"普通三人间\">普通三人间</option>\n");
      out.write("                            <option value=\"豪华双床房\">豪华双床房</option>\n");
      out.write("                            <option value=\"高级双床房\">高级双床房</option>\n");
      out.write("                            <option value=\"普通双床房\">普通双床房</option>\n");
      out.write("                            <option value=\"豪华圆床房\">豪华圆床房</option>\n");
      out.write("                            <option value=\"豪华水床房\">豪华水床房</option>\n");
      out.write("                            <option value=\"高级电脑房\">高级电脑房</option>\n");
      out.write("                            <option value=\"大床钟点房（四小时）\">大床钟点房（四小时）</option>\n");
      out.write("                            <option value=\"双床终点房（四小时）\">双床终点房（四小时）</option>\n");
      out.write("                            <option value=\"大床钟点房（三小时）\">大床钟点房（三小时）</option>\n");
      out.write("                            <option value=\"双床终点房（三小时）\">双床终点房（三小时）</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <label class=\"layui-form-label\">房间号</label>\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <input type=\"text\" name=\"Num\" required  placeholder=\"请输入已有房间号\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"layui-form-item\">\n");
      out.write("                    <div class=\"layui-input-block\">\n");
      out.write("                        <button class=\"layui-btn\" type=\"submit\">立即提交</button>\n");
      out.write("                        <button class=\"layui-btn layui-btn-danger\" type=\"reset\">清空内容</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"../views/static/admin/js/config.js\"></script>\n");
      out.write("<script src=\"../views/static/admin/js/script.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
