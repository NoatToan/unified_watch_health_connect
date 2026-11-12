package defpackage;

import com.xiaomi.onetrack.api.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public class k04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f23285a = String.valueOf('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23286b = String.valueOf(Typography.dollar);
    public static final Map c;
    public static final Map d;
    public static final Map e;
    public static final Map f;
    public static /* synthetic */ Class g;
    public static /* synthetic */ Class h;
    public static /* synthetic */ Class i;
    public static /* synthetic */ Class j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static /* synthetic */ Class f23287k;
    public static /* synthetic */ Class l;
    public static /* synthetic */ Class m;
    public static /* synthetic */ Class n;

    static {
        HashMap map = new HashMap();
        c = map;
        Class cls = Boolean.TYPE;
        Class clsB = g;
        if (clsB == null) {
            clsB = b("java.lang.Boolean");
            g = clsB;
        }
        map.put(cls, clsB);
        Class cls2 = Byte.TYPE;
        Class clsB2 = h;
        if (clsB2 == null) {
            clsB2 = b("java.lang.Byte");
            h = clsB2;
        }
        map.put(cls2, clsB2);
        Class cls3 = Character.TYPE;
        Class clsB3 = i;
        if (clsB3 == null) {
            clsB3 = b("java.lang.Character");
            i = clsB3;
        }
        map.put(cls3, clsB3);
        Class cls4 = Short.TYPE;
        Class clsB4 = j;
        if (clsB4 == null) {
            clsB4 = b("java.lang.Short");
            j = clsB4;
        }
        map.put(cls4, clsB4);
        Class cls5 = Integer.TYPE;
        Class clsB5 = f23287k;
        if (clsB5 == null) {
            clsB5 = b("java.lang.Integer");
            f23287k = clsB5;
        }
        map.put(cls5, clsB5);
        Class cls6 = Long.TYPE;
        Class clsB6 = l;
        if (clsB6 == null) {
            clsB6 = b("java.lang.Long");
            l = clsB6;
        }
        map.put(cls6, clsB6);
        Class cls7 = Double.TYPE;
        Class clsB7 = m;
        if (clsB7 == null) {
            clsB7 = b("java.lang.Double");
            m = clsB7;
        }
        map.put(cls7, clsB7);
        Class cls8 = Float.TYPE;
        Class clsB8 = n;
        if (clsB8 == null) {
            clsB8 = b("java.lang.Float");
            n = clsB8;
        }
        map.put(cls8, clsB8);
        Class cls9 = Void.TYPE;
        map.put(cls9, cls9);
        d = new HashMap();
        for (Class cls10 : map.keySet()) {
            Class cls11 = (Class) c.get(cls10);
            if (!cls10.equals(cls11)) {
                d.put(cls11, cls10);
            }
        }
        e = new HashMap();
        f = new HashMap();
        a("int", "I");
        a("boolean", "Z");
        a("float", "F");
        a("long", "J");
        a("short", "S");
        a("byte", c.f13755a);
        a("double", "D");
        a("char", "C");
    }

    public static void a(String str, String str2) {
        e.put(str, str2);
        f.put(str2, str);
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static String c(Class cls) {
        return cls == null ? "" : d(cls.getName());
    }

    public static String d(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        eio eioVar = new eio();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                eioVar.f(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
        }
        Map map = f;
        if (map.containsKey(str)) {
            str = (String) map.get(str);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace(Typography.dollar, '.');
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strSubstring);
        stringBuffer.append(eioVar);
        return stringBuffer.toString();
    }
}
