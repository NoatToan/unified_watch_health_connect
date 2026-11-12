package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public class nv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Properties f28462a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final nv3 f28463a = new nv3();
    }

    public static nv3 c() {
        return b.f28463a;
    }

    public final String a(char c) {
        String property = d().getProperty(Integer.toHexString(c).toUpperCase());
        if (f(property)) {
            return property;
        }
        return null;
    }

    public String[] b(char c) {
        String strA = a(c);
        if (strA == null) {
            return null;
        }
        return strA.substring(strA.indexOf("(") + 1, strA.lastIndexOf(")")).split(",");
    }

    public final Properties d() {
        return this.f28462a;
    }

    public final void e() {
        try {
            g(new Properties());
            d().load(zqk.a("/pinyindb/unicode_to_hanyu_pinyin.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean f(String str) {
        return str != null && !str.equals("(none0)") && str.startsWith("(") && str.endsWith(")");
    }

    public final void g(Properties properties) {
        this.f28462a = properties;
    }

    public nv3() {
        this.f28462a = null;
        e();
    }
}
