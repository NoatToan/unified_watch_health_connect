package p005kotlin.jvm.internal;

import com.google.maps.android.BuildConfig;
import e23.f;
import e23.g;
import e23.i;
import e23.j;
import e23.k;
import e23.l;
import e23.m;
import e23.n;
import e23.o;
import e23.p;
import e23.q;
import e23.r;
import e23.s;
import e23.t;
import e23.u;
import e23.v;
import e23.w;
import f23.a;
import f23.b;
import f23.c;
import f23.d;
import f23.e;
import i3.e5;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.h;

/* JADX INFO: loaded from: classes3.dex */
public class y0 {
    public static Collection a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            i(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e4) {
            s.j(e4, y0.class.getName());
            throw e4;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            i(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            s.j(e4, y0.class.getName());
            throw e4;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            i(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            s.j(e4, y0.class.getName());
            throw e4;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            i(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e4) {
            s.j(e4, y0.class.getName());
            throw e4;
        }
    }

    public static void e(int i14, Object obj) {
        if (obj == null || f(i14, obj)) {
            return;
        }
        i(obj, "kotlin.jvm.functions.Function" + i14);
        throw null;
    }

    public static boolean f(int i14, Object obj) {
        int arity;
        if (obj instanceof h) {
            if (obj instanceof o) {
                arity = ((o) obj).getArity();
            } else if (obj instanceof e23.a) {
                arity = 0;
            } else if (obj instanceof l) {
                arity = 1;
            } else if (obj instanceof p) {
                arity = 2;
            } else if (obj instanceof q) {
                arity = 3;
            } else if (obj instanceof r) {
                arity = 4;
            } else if (obj instanceof s) {
                arity = 5;
            } else if (obj instanceof t) {
                arity = 6;
            } else if (obj instanceof u) {
                arity = 7;
            } else if (obj instanceof v) {
                arity = 8;
            } else if (obj instanceof w) {
                arity = 9;
            } else if (obj instanceof e23.b) {
                arity = 10;
            } else if (obj instanceof e23.c) {
                arity = 11;
            } else if (obj instanceof e23.d) {
                arity = 12;
            } else if (obj instanceof e23.e) {
                arity = 13;
            } else if (obj instanceof f) {
                arity = 14;
            } else if (obj instanceof g) {
                arity = 15;
            } else if (obj instanceof e23.h) {
                arity = 16;
            } else if (obj instanceof i) {
                arity = 17;
            } else if (obj instanceof j) {
                arity = 18;
            } else if (obj instanceof k) {
                arity = 19;
            } else if (obj instanceof m) {
                arity = 20;
            } else if (obj instanceof n) {
                arity = 21;
            } else {
                arity = obj instanceof o ? 22 : -1;
            }
            if (arity == i14) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof a) || (obj instanceof c);
        }
        return false;
    }

    public static boolean h(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof a) || (obj instanceof d);
        }
        return false;
    }

    public static void i(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(e5.g(obj == null ? BuildConfig.TRAVIS : obj.getClass().getName(), " cannot be cast to ", str));
        s.j(classCastException, y0.class.getName());
        throw classCastException;
    }
}
