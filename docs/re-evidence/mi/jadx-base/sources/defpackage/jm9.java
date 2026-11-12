package defpackage;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.file.FileMode;
import cn.hutool.core.io.file.FileWriter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class jm9 extends fmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22920a = File.separator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f22921b = File.pathSeparator;

    public static boolean A(File file, File file2) {
        qk1.t(file);
        qk1.t(file2);
        return fmh.f(file.toPath(), file2.toPath());
    }

    public static boolean B() {
        return '\\' == File.separatorChar;
    }

    public static File C(File file) {
        if (file == null) {
            return null;
        }
        return D(file.getParentFile());
    }

    public static File D(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        String strR = tt3.R(tt3.R(str, "classpath:"), "file:");
        if (tt3.f0(strR, '~')) {
            strR = w() + strR.substring(1);
        }
        String strU0 = tt3.u0(strR.replaceAll("[/\\\\]+", "/"));
        if (str.startsWith("\\\\")) {
            strU0 = "\\" + strU0;
        }
        int iIndexOf = strU0.indexOf(":");
        String str2 = "";
        if (iIndexOf > -1) {
            int i = iIndexOf + 1;
            String strSubstring = strU0.substring(0, i);
            if (tt3.f0(strSubstring, '/')) {
                strSubstring = strSubstring.substring(1);
            }
            if (!strSubstring.contains("/")) {
                strU0 = strU0.substring(i);
                str2 = strSubstring;
            }
        }
        if (strU0.startsWith("/")) {
            str2 = str2 + "/";
            strU0 = strU0.substring(1);
        }
        List<String> listX = tt3.X(strU0, '/');
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (int size = listX.size() - 1; size >= 0; size--) {
            String str3 = listX.get(size);
            if (!".".equals(str3)) {
                if ("..".equals(str3)) {
                    i2++;
                } else if (i2 > 0) {
                    i2--;
                } else {
                    linkedList.add(0, str3);
                }
            }
        }
        if (i2 > 0 && tt3.G(str2)) {
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                linkedList.add(0, "..");
                i2 = i3;
            }
        }
        return str2 + CollUtil.k(linkedList, "/");
    }

    public static boolean F(File file, File file2) {
        if (B()) {
            try {
                return tt3.w(file.getCanonicalPath(), file2.getCanonicalPath());
            } catch (Exception unused) {
                return tt3.w(file.getAbsolutePath(), file2.getAbsolutePath());
            }
        }
        try {
            return tt3.u(file.getCanonicalPath(), file2.getCanonicalPath());
        } catch (Exception unused2) {
            return tt3.u(file.getAbsolutePath(), file2.getAbsolutePath());
        }
    }

    public static String G(RandomAccessFile randomAccessFile, Charset charset) {
        try {
            String line = randomAccessFile.readLine();
            if (line != null) {
                return au3.b(line, au3.f3448a, charset);
            }
            return null;
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static void H(RandomAccessFile randomAccessFile, Charset charset, dge dgeVar) {
        while (true) {
            try {
                String line = randomAccessFile.readLine();
                if (line == null) {
                    return;
                } else {
                    dgeVar.a(au3.b(line, au3.f3448a, charset));
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
    }

    public static String I(long j) {
        return bp5.a(j);
    }

    public static File J(File file) throws IORuntimeException {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            C(file);
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new IORuntimeException(e);
            }
        }
        return file;
    }

    public static File i(File file, String str) {
        String strReplace = str.replace(AbstractJsonLexerKt.STRING_ESC, '/');
        if (!B() && strReplace.lastIndexOf(47, strReplace.length() - 2) > 0) {
            int i = 0;
            List<String> listA0 = tt3.a0(strReplace, '/', false, true);
            int size = listA0.size() - 1;
            while (i < size) {
                File file2 = new File(file, listA0.get(i));
                i++;
                file = file2;
            }
            file.mkdirs();
            strReplace = listA0.get(size);
        }
        return new File(file, strReplace);
    }

    public static File j(File file, File file2) throws IllegalArgumentException {
        if (file != null && file2 != null) {
            try {
                if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    throw new IllegalArgumentException("New file is outside of the parent dir: " + file2.getName());
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
        return file2;
    }

    public static RandomAccessFile k(File file, FileMode fileMode) {
        try {
            return new RandomAccessFile(file, fileMode.name());
        } catch (FileNotFoundException e) {
            throw new IORuntimeException(e);
        }
    }

    public static boolean l(File file, File file2) throws IORuntimeException {
        qk1.t(file);
        qk1.t(file2);
        if (file.exists() && file2.exists()) {
            return fmh.a(file.toPath(), file2.toPath());
        }
        return (file.exists() || file2.exists() || !F(file, file2)) ? false : true;
    }

    public static String m(File file) {
        return vl9.a(file);
    }

    public static File n(File file, String str) {
        if (tt3.F(str)) {
            throw new NullPointerException("File path is blank!");
        }
        return j(file, i(file, str));
    }

    public static File o(String str) {
        if (str == null) {
            return null;
        }
        return new File(q(str));
    }

    public static File p(URL url) {
        return new File(d8q.l(url));
    }

    public static String q(String str) {
        return r(str, null);
    }

    public static String r(String str, Class<?> cls) {
        String strE;
        if (str == null) {
            strE = "";
        } else {
            strE = E(str);
            if (z(strE)) {
                return strE;
            }
        }
        URL urlB = irk.b(strE, cls);
        if (urlB != null) {
            return E(d8q.g(urlB));
        }
        String strE2 = i04.e();
        if (strE2 == null) {
            return str;
        }
        Objects.requireNonNull(str);
        return E(strE2.concat(str));
    }

    public static BufferedInputStream s(File file) throws IORuntimeException {
        return cid.q(cid.r(file));
    }

    public static String t(String str) {
        return vl9.c(str);
    }

    public static File u(File file, int i) {
        if (i < 1 || file == null) {
            return file;
        }
        try {
            File parentFile = file.getCanonicalFile().getParentFile();
            return 1 == i ? parentFile : u(parentFile, i - 1);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedReader v(File file, Charset charset) throws IORuntimeException {
        return cid.e(s(file), charset);
    }

    public static String w() {
        return System.getProperty("user.home");
    }

    public static File x() {
        String strE = i04.e();
        if (tt3.H(strE)) {
            return u(o(strE), 2);
        }
        return null;
    }

    public static BufferedWriter y(File file, Charset charset, boolean z) throws IORuntimeException {
        return FileWriter.create(file, charset).getWriter(z);
    }

    public static boolean z(String str) {
        if (tt3.G(str)) {
            return false;
        }
        return '/' == str.charAt(0) || str.matches("^[a-zA-Z]:([/\\\\].*)?");
    }
}
