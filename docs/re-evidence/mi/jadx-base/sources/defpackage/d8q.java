package defpackage;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.net.URLDecoder;
import cn.hutool.core.net.URLEncoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes.dex */
public class d8q {
    public static String a(String str, String str2) throws UtilException {
        return b(str, au3.a(str2));
    }

    public static String b(String str, Charset charset) {
        return charset == null ? str : URLDecoder.decode(str, charset);
    }

    public static String c(String str) throws UtilException {
        return d(str, au3.f3449b);
    }

    public static String d(String str, Charset charset) {
        if (tt3.G(str)) {
            return str;
        }
        if (charset == null) {
            charset = au3.c();
        }
        return URLEncoder.DEFAULT.encode(str, charset);
    }

    public static String e(String str, Charset charset) throws UtilException {
        return (charset == null || tt3.G(str)) ? str : URLEncoder.ALL.encode(str, charset);
    }

    public static String f(String str, Charset charset) {
        if (tt3.G(str)) {
            return str;
        }
        if (charset == null) {
            charset = au3.c();
        }
        return URLEncoder.PATH_SEGMENT.encode(str, charset);
    }

    public static String g(URL url) {
        String path = null;
        if (url == null) {
            return null;
        }
        try {
            path = l(url).getPath();
        } catch (UtilException unused) {
        }
        return path != null ? path : url.getPath();
    }

    public static JarFile h(URL url) {
        try {
            return ((JarURLConnection) url.openConnection()).getJarFile();
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static InputStream i(URL url) {
        qk1.t(url);
        try {
            return url.openStream();
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static URL j(File file) {
        qk1.u(file, "File is null !", new Object[0]);
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e) {
            throw new UtilException(e, "Error occured when get URL!", new Object[0]);
        }
    }

    public static URI k(String str, boolean z) throws UtilException {
        if (z) {
            str = c(str);
        }
        try {
            return new URI(tt3.r0(str));
        } catch (URISyntaxException e) {
            throw new UtilException(e);
        }
    }

    public static URI l(URL url) throws UtilException {
        return m(url, false);
    }

    public static URI m(URL url, boolean z) throws UtilException {
        if (url == null) {
            return null;
        }
        return k(url.toString(), z);
    }

    public static URL n(String str) {
        return o(str, null);
    }

    public static URL o(String str, URLStreamHandler uRLStreamHandler) {
        qk1.u(str, "URL must not be null", new Object[0]);
        if (str.startsWith("classpath:")) {
            return yz3.b().getResource(str.substring(10));
        }
        try {
            return new URL((URL) null, str, uRLStreamHandler);
        } catch (MalformedURLException e) {
            try {
                return new File(str).toURI().toURL();
            } catch (MalformedURLException unused) {
                throw new UtilException(e);
            }
        }
    }
}
