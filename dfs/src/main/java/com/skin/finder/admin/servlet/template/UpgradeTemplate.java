/*
 * $RCSfile: UpgradeTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.admin.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import com.skin.finder.cluster.Cluster;
import com.skin.finder.cluster.Host;


/**
 * <p>Title: UpgradeTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class UpgradeTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final UpgradeTemplate instance = new UpgradeTemplate();


    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public static void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        instance.service(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        OutputStream out = response.getOutputStream();


    Cluster cluster = (Cluster)(request.getAttribute("cluster"));
    List<Host> hosts = cluster.getHosts();

        out.write(_jsp_string_5, 0, _jsp_string_5.length);
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        out.write(_jsp_string_11, 0, _jsp_string_11.length);
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        out.write(_jsp_string_13, 0, _jsp_string_13.length);
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        out.write(_jsp_string_17, 0, _jsp_string_17.length);
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        out.write(_jsp_string_19, 0, _jsp_string_19.length);
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        out.write(_jsp_string_21, 0, _jsp_string_21.length);
        out.write(_jsp_string_22, 0, _jsp_string_22.length);

        for(Host host : hosts) {
    
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        this.write(out, (host.getName()));
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        this.write(out, (host.getName()));
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        this.write(out, (host.getName()));
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        this.write(out, (host.getDisplayName()));
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        out.write(_jsp_string_33, 0, _jsp_string_33.length);
        this.write(out, (host.getName()));
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        this.write(out, (host.getName()));
        out.write(_jsp_string_37, 0, _jsp_string_37.length);

        }
    
        out.write(_jsp_string_39, 0, _jsp_string_39.length);
        this.write(out, request.getAttribute("masterName"));
        out.write(_jsp_string_41, 0, _jsp_string_41.length);
        this.write(out, request.getAttribute("masterVersion"));
        out.write(_jsp_string_43, 0, _jsp_string_43.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_5 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_6 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_7 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Finder - Powered by Finder</title>\r\n");
    protected static final byte[] _jsp_string_8 = b("<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_9 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/admin/css/form.css\"/>\r\n");
    protected static final byte[] _jsp_string_10 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_11 = b("<script type=\"text/javascript\" src=\"?action=res&path=/admin/base.js\"></script>\r\n");
    protected static final byte[] _jsp_string_12 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/fileupload.js\"></script>\r\n");
    protected static final byte[] _jsp_string_13 = b("<script type=\"text/javascript\" src=\"?action=res&path=/admin/upgrade.js\"></script>\r\n");
    protected static final byte[] _jsp_string_14 = b("</head>\r\n<body contextPath=\"");
    protected static final byte[] _jsp_string_16 = b("\">\r\n<div class=\"menu-bar\">\r\n    <a class=\"button back\" href=\"javascript:void(0)\"><span class=\"back\"></span>返回</a>\r\n");
    protected static final byte[] _jsp_string_17 = b("    <a class=\"button refresh\" href=\"javascript:void(0)\"><span class=\"refresh\"></span>刷新</a>\r\n");
    protected static final byte[] _jsp_string_18 = b("    <span class=\"seperator\"></span>\r\n    <a class=\"button upgrade\" href=\"javascript:void(0)\"><span class=\"add\"></span>系统升级</a>\r\n");
    protected static final byte[] _jsp_string_19 = b("</div>\r\n<table id=\"host-table\" class=\"list\">\r\n    <tr class=\"head\">\r\n        <td class=\"w100 center\"><a id=\"checkall\" href=\"javascript:void(0)\">全 选</a> / <a id=\"uncheck\" href=\"javascript:void(0)\">取 消</a></td>\r\n");
    protected static final byte[] _jsp_string_20 = b("        <td class=\"w200\">Name</td>\r\n        <td class=\"w200\">Display Name</td>\r\n");
    protected static final byte[] _jsp_string_21 = b("        <td class=\"w100\">Version</td>\r\n        <td class=\"w150\">Start Time</td>\r\n");
    protected static final byte[] _jsp_string_22 = b("        <td>操作</td>\r\n    </tr>\r\n    ");
    protected static final byte[] _jsp_string_24 = b("    <tr class=\"disabled\" hostName=\"");
    protected static final byte[] _jsp_string_26 = b("\">\r\n        <td style=\"text-align: center;\"><input name=\"hostName\" type=\"checkbox\" disabled=\"true\" value=\"");
    protected static final byte[] _jsp_string_28 = b("\"/></td>\r\n        <td>");
    protected static final byte[] _jsp_string_30 = b("</td>\r\n        <td>");
    protected static final byte[] _jsp_string_32 = b("</td>\r\n        <td class=\"version\">...</td>\r\n        <td class=\"startTime\">...</td>\r\n");
    protected static final byte[] _jsp_string_33 = b("        <td>\r\n            <a class=\"btn sys-inf disabled\" href=\"javascript:void(0)\" hostName=\"");
    protected static final byte[] _jsp_string_35 = b("\">系统信息</a>\r\n            <a class=\"btn restart disabled\" href=\"javascript:void(0)\" hostName=\"");
    protected static final byte[] _jsp_string_37 = b("\">重新启动</a>\r\n        </td>\r\n    </tr>\r\n    ");
    protected static final byte[] _jsp_string_39 = b("</table>\r\n<div id=\"pageContext\" style=\"display: none;\" cluster-master-name=\"");
    protected static final byte[] _jsp_string_41 = b("\" cluster-master-version=\"");
    protected static final byte[] _jsp_string_43 = b("\"></div>\r\n</body>\r\n</html>\r\n");

}