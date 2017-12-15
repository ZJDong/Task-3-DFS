/*
 * $RCSfile: HelpTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * <p>Title: HelpTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class HelpTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final HelpTemplate instance = new HelpTemplate();


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

        out.write(_jsp_string_0, 0, _jsp_string_0.length);
        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        out.write(_jsp_string_2, 0, _jsp_string_2.length);
        out.write(_jsp_string_3, 0, _jsp_string_3.length);
        out.write(_jsp_string_4, 0, _jsp_string_4.length);
        out.write(_jsp_string_5, 0, _jsp_string_5.length);
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        out.write(_jsp_string_11, 0, _jsp_string_11.length);
        this.write(out, request.getAttribute("requestURI"));
        out.write(_jsp_string_13, 0, _jsp_string_13.length);
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        out.write(_jsp_string_15, 0, _jsp_string_15.length);
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        out.write(_jsp_string_17, 0, _jsp_string_17.length);
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        out.write(_jsp_string_19, 0, _jsp_string_19.length);
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        out.write(_jsp_string_21, 0, _jsp_string_21.length);
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        out.write(_jsp_string_23, 0, _jsp_string_23.length);
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        out.write(_jsp_string_25, 0, _jsp_string_25.length);
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        out.write(_jsp_string_27, 0, _jsp_string_27.length);
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        out.write(_jsp_string_29, 0, _jsp_string_29.length);
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        out.write(_jsp_string_31, 0, _jsp_string_31.length);
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        out.write(_jsp_string_33, 0, _jsp_string_33.length);
        out.write(_jsp_string_34, 0, _jsp_string_34.length);
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        out.write(_jsp_string_36, 0, _jsp_string_36.length);
        out.write(_jsp_string_37, 0, _jsp_string_37.length);
        out.write(_jsp_string_38, 0, _jsp_string_38.length);
        out.write(_jsp_string_39, 0, _jsp_string_39.length);
        out.write(_jsp_string_40, 0, _jsp_string_40.length);
        out.write(_jsp_string_41, 0, _jsp_string_41.length);
        out.write(_jsp_string_42, 0, _jsp_string_42.length);
        out.write(_jsp_string_43, 0, _jsp_string_43.length);
        out.write(_jsp_string_44, 0, _jsp_string_44.length);
        out.write(_jsp_string_45, 0, _jsp_string_45.length);
        out.write(_jsp_string_46, 0, _jsp_string_46.length);
        out.write(_jsp_string_47, 0, _jsp_string_47.length);
        out.write(_jsp_string_48, 0, _jsp_string_48.length);
        out.write(_jsp_string_49, 0, _jsp_string_49.length);
        out.write(_jsp_string_50, 0, _jsp_string_50.length);
        out.write(_jsp_string_51, 0, _jsp_string_51.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_0 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_1 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_2 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Finder - Powered by Finder</title>\r\n");
    protected static final byte[] _jsp_string_3 = b("<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_4 = b("<style type=\"text/css\">\r\n.red{color: #ff0000;}\r\ndiv.wrap{margin: 0px auto; width: 980px;}\r\n");
    protected static final byte[] _jsp_string_5 = b("ul.list{list-style-type: disc;}\r\nul.list li{line-height: 24px; font-size: 13px;}\r\n");
    protected static final byte[] _jsp_string_6 = b("table tr.head td{font-size: 14px;}\r\ntable tr td{padding-left: 4px; height: 24px; font-size: 13px;}\r\n");
    protected static final byte[] _jsp_string_7 = b("</style>\r\n</head>\r\n<body>\r\n<div class=\"wrap\">\r\n    <div class=\"finder\">\r\n        <div class=\"menu-bar\" style=\"padding-top: 4px;\">\r\n");
    protected static final byte[] _jsp_string_8 = b("            <div style=\"float: left; width: 80px;\">\r\n                <a class=\"button disabled\" href=\"javascript:void(0)\"><span class=\"back-disabled\"></span></a>\r\n");
    protected static final byte[] _jsp_string_9 = b("                <a class=\"button\" href=\"javascript:void(0)\" onclick=\"window.location.reload();\" title=\"刷新\"><span class=\"refresh\"></span></a>\r\n");
    protected static final byte[] _jsp_string_10 = b("            </div>\r\n            <div style=\"float: left; height: 28px; position: relative;\"></div>\r\n");
    protected static final byte[] _jsp_string_11 = b("            <div style=\"float: right; width: 40px;\">\r\n                <a class=\"button\" href=\"");
    protected static final byte[] _jsp_string_13 = b("?action=finder.help\" title=\"帮助\"><span class=\"help\"></span></a>\r\n            </div>\r\n");
    protected static final byte[] _jsp_string_14 = b("        </div>\r\n    </div>\r\n    <div class=\"finder\">\r\n        <h1>Finder简介</h1>\r\n");
    protected static final byte[] _jsp_string_15 = b("        <p>Finder是一个高性能的Web版分布式文件管理工具，它具有体积小，易部署，功能强大等特点。</p>\r\n        <p>下载地址：<a href=\"http://www.finderweb.net\" target=\"_blank\">http://www.finderweb.net</a></p>\r\n");
    protected static final byte[] _jsp_string_16 = b("        <ul class=\"list\">\r\n            <li>(<span class=\"red\">程序员专用</span>) 支持集群部署，允许你同时管理多台机器上的文件或者查看不同机器上的日志；</li>\r\n");
    protected static final byte[] _jsp_string_17 = b("            <li>(<span class=\"red\">程序员专用</span>) grep支持，类似linux系统的grep命令，支持任意大小的文件，支持随时查看文件的任意位置，像播放器一样点击进度条的任意位置；</li>\r\n");
    protected static final byte[] _jsp_string_18 = b("            <li>(<span class=\"red\">程序员专用</span>) less支持，类似linux系统的less命令，支持任意大小的文件，支持随时查看文件的任意位置，像播放器一样点击进度条的任意位置；</li>\r\n");
    protected static final byte[] _jsp_string_19 = b("            <li>(<span class=\"red\">程序员专用</span>) tail支持，类似linux系统的tail命令，支持任意大小的文件；</li>\r\n");
    protected static final byte[] _jsp_string_20 = b("            <li><span class=\"red\">支持细粒度的权限控制，能满足不同的权限需求；IT运维或者公司内部资料分享，允许控制文件可见和文件的各种操作。</span></li>\r\n");
    protected static final byte[] _jsp_string_21 = b("            <li>支持全键盘操作，几乎所有操作均有对应的快捷键支持；</li>\r\n            <li>支持右键菜单，文件的常规操作都可以通过右键菜单完成；</li>\r\n");
    protected static final byte[] _jsp_string_22 = b("            <li>支持文件重命名，点击选中文件，然后按F2即可重命名文件；</li>\r\n            <li>支持大文件上传，超大文件会自动分段上传，默认设置每次上传5M；</li>\r\n");
    protected static final byte[] _jsp_string_23 = b("            <li>支持文件拖拽上传，可同时拖拽多个文件上传；</li>\r\n            <li>支持截图上传，截图之后按Ctrl + Shift + V；</li>\r\n");
    protected static final byte[] _jsp_string_24 = b("            <li>支持音频和视频播放（需支持H5的浏览器）；</li>\r\n            <li>体积小，只有不到3M，目前一般基于SSH的web应用，基本都在几十兆左右。Finder除了日志组件无任何第三方依赖（日志组件也不需要单独安装）;</li>\r\n");
    protected static final byte[] _jsp_string_25 = b("            <li>无数据库设计，免去部署数据库的麻烦，所有数据存储都存在本地文件系统，集群环境下分布式存储。</li>\r\n            <li>易于部署，直接扔到Tomcat里即可；</li>\r\n");
    protected static final byte[] _jsp_string_26 = b("            <li>基于web的文件管理，几乎所有的操作系统和服务器的防火墙默认都对HTTP开放，而FTP大多需要专门开通；不需要用户安装专门的客户端软件，使用浏览器即可。</li>\r\n");
    protected static final byte[] _jsp_string_27 = b("            <li>对网络环境无任何要求，不需要做任何特殊设置。出于安全考虑，几乎所有的服务器都限制单个HTTP请求体的大小，且默认值很小，一般在2M左右，并且限制连接时间。Finder不需要专门设置即可上传或者下载超大的文件，Finder所有的功能都使用短连接完成以避免服务器超时限制。对于大文件采用分片上传，一方面可以避免服务器的限制，另一方面在网络环境不好的情况下提高上传的成功率，因为大文件长时间连接一旦网络断掉就需要全部重传，Finder采用分片的方式，每次只上传一段数据，如果失败自动重新上传这一段，并且针对每一段都自动重试3次。</li>\r\n");
    protected static final byte[] _jsp_string_28 = b("        </ul>\r\n    </div>\r\n\r\n    <div class=\"finder\">\r\n        <h1>使用技巧</h1>\r\n        <ul class=\"list\">\r\n");
    protected static final byte[] _jsp_string_29 = b("            <li>文件列表页面 - 双击文件名可以打开文件。</li>\r\n            <li>文件列表页面 - 按住Ctrl键点击tail或者less可以在新窗口打开less和tail。</li>\r\n");
    protected static final byte[] _jsp_string_30 = b("            <li>文件列表页面 - 按住Ctrl键点击刷新可在新窗口打开文件列表页。</li>\r\n            <li>音频播放的同时可以继续其他操作，包括切换不同的文件夹。</li>\r\n");
    protected static final byte[] _jsp_string_31 = b("            <li>地址栏的suggest列表支持键盘上下键滚动。</li>\r\n        </ul>\r\n    </div>\r\n\r\n    <div class=\"finder\">\r\n");
    protected static final byte[] _jsp_string_32 = b("        <h1>剪切板</h1>\r\n        <p>Finder中有两种剪切板，一种是操作系统的剪切板，由于浏览器安全限制，Finder无法直接访问操作系统的剪切板，只能间接访问，当用户在Finder的界面上使用CTRL + V的时候，Finder可以访问到系统剪切板中的截图并上传。Finder无法访问剪切板中的文件。</p>\r\n");
    protected static final byte[] _jsp_string_33 = b("        <p>第二种剪切板是Finder自己的剪切板，用户在界面上选择多个文件拷贝或者剪切的时候，Finder将需要拷贝的文件信息放到自己的剪切板中，在用户使用Finder自己的右键菜单上点击粘贴的时候Finder从自己的剪切板中读取文件信息完成拷贝或者粘贴。</p>\r\n");
    protected static final byte[] _jsp_string_34 = b("        <p>所以CTRL + V只能上传操作系统剪切板中的截图。</p>\r\n    </div>\r\n\r\n    <div class=\"finder\">\r\n");
    protected static final byte[] _jsp_string_35 = b("        <h1>快捷键</h1>\r\n        <table>\r\n            <tr class=\"head\">\r\n                <td style=\"width: 480px; height: 30px; background-color: #efefef;\">操作</td>\r\n");
    protected static final byte[] _jsp_string_36 = b("                <td style=\"width: 300px; height: 30px; background-color: #efefef;\">快捷键</td>\r\n");
    protected static final byte[] _jsp_string_37 = b("            </tr>\r\n            <tr>\r\n                <td>重命名</td>\r\n                <td>F2</td>\r\n");
    protected static final byte[] _jsp_string_38 = b("            </tr>\r\n            <tr>\r\n                <td>向上滚动</td>\r\n                <td>UP</td>\r\n");
    protected static final byte[] _jsp_string_39 = b("            </tr>\r\n            <tr>\r\n                <td>向下滚动</td>\r\n                <td>DOWN</td>\r\n");
    protected static final byte[] _jsp_string_40 = b("            </tr>\r\n            <tr>\r\n                <td>向左滚动</td>\r\n                <td>LEFT</td>\r\n");
    protected static final byte[] _jsp_string_41 = b("            </tr>\r\n            <tr>\r\n                <td>向右滚动</td>\r\n                <td>RIGHT</td>\r\n");
    protected static final byte[] _jsp_string_42 = b("            </tr>\r\n            <tr>\r\n                <td>全选</td>\r\n                <td>CTRL + A</td>\r\n");
    protected static final byte[] _jsp_string_43 = b("            </tr>\r\n            <tr>\r\n                <td>剪切(Finder中的文件)</td>\r\n                <td>CTRL + X</td>\r\n");
    protected static final byte[] _jsp_string_44 = b("            </tr>\r\n            <tr>\r\n                <td>拷贝(Finder中的文件)</td>\r\n                <td>CTRL + C</td>\r\n");
    protected static final byte[] _jsp_string_45 = b("            </tr>\r\n            <tr>\r\n                <td>粘贴截图</td>\r\n                <td>CTRL + V</td>\r\n");
    protected static final byte[] _jsp_string_46 = b("            </tr>\r\n            <tr>\r\n                <td>多选</td>\r\n                <td>CTRL + CLICK</td>\r\n");
    protected static final byte[] _jsp_string_47 = b("            </tr>\r\n            <tr>\r\n                <td>多选</td>\r\n                <td>ALT + CLICK</td>\r\n");
    protected static final byte[] _jsp_string_48 = b("            </tr>\r\n            <tr>\r\n                <td>多选</td>\r\n                <td>CTRL + [UP|DOWN|LEFT|RIGHT]</td>\r\n");
    protected static final byte[] _jsp_string_49 = b("            </tr>\r\n            <tr>\r\n                <td>删除选中文件</td>\r\n                <td>DELETE</td>\r\n");
    protected static final byte[] _jsp_string_50 = b("            </tr>\r\n        </table>\r\n    </div>\r\n</div>\r\n<div style=\"height: 200px;\"></div>\r\n");
    protected static final byte[] _jsp_string_51 = b("</body>\r\n</html>\r\n");

}