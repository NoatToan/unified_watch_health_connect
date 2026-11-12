package defpackage;

import java.util.Hashtable;
import java.util.StringTokenizer;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class s69 {
    public static final Class[] e = new Class[0];
    public static final String[] f = new String[0];
    public static Hashtable g;
    public static Object[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f33338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClassLoader f33339b;
    public String c;
    public int d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        g = hashtable;
        hashtable.put("void", Void.TYPE);
        g.put("boolean", Boolean.TYPE);
        g.put("byte", Byte.TYPE);
        g.put("char", Character.TYPE);
        g.put("short", Short.TYPE);
        g.put("int", Integer.TYPE);
        g.put("long", Long.TYPE);
        g.put("float", Float.TYPE);
        g.put("double", Double.TYPE);
        h = new Object[0];
    }

    public s69(String str, Class cls) {
        this.c = str;
        this.f33338a = cls;
        this.f33339b = cls.getClassLoader();
    }

    public static Class a(String str, ClassLoader classLoader) {
        if (str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        Class cls = (Class) g.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static nrd b(nrd.a aVar, Object obj, Object obj2) {
        return new ord(aVar, obj, obj2, h);
    }

    public static nrd c(nrd.a aVar, Object obj, Object obj2, Object obj3) {
        return new ord(aVar, obj, obj2, new Object[]{obj3});
    }

    public static nrd d(nrd.a aVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new ord(aVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static nrd e(nrd.a aVar, Object obj, Object obj2, Object[] objArr) {
        return new ord(aVar, obj, obj2, objArr);
    }

    public auf f(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        int i = Integer.parseInt(str, 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i2 = 0; i2 < iCountTokens; i2++) {
            clsArr[i2] = a(stringTokenizer.nextToken(), this.f33339b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i3 = 0; i3 < iCountTokens2; i3++) {
            strArr[i3] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i4 = 0; i4 < iCountTokens3; i4++) {
            clsArr2[i4] = a(stringTokenizer3.nextToken(), this.f33339b);
        }
        return new buf(i, str2, cls, clsArr, strArr, clsArr2, a(str6, this.f33339b));
    }

    public auf g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return f(str, str2, a(str3, this.f33339b), str4, str5, str6, str7);
    }

    public nrd.a h(String str, obm obmVar, int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        return new ord.a(i2, str, obmVar, i(i, -1));
    }

    public t4n i(int i, int i2) {
        return new u4n(this.f33338a, this.c, i);
    }
}
