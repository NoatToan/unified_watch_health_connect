package defpackage;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class buf extends k34 implements auf {
    public Method n;
    public Class o;

    public buf(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.o = cls2;
    }

    @Override // defpackage.auf
    public Method a() {
        if (this.n == null) {
            Class clsG = g();
            try {
                this.n = clsG.getDeclaredMethod(k(), n());
            } catch (NoSuchMethodException unused) {
                HashSet hashSet = new HashSet();
                hashSet.add(clsG);
                this.n = p(clsG, k(), n(), hashSet);
            }
        }
        return this.n;
    }

    @Override // defpackage.pbm
    public String b(glo gloVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(gloVar.e(j()));
        if (gloVar.f19119b) {
            stringBuffer.append(gloVar.g(o()));
        }
        if (gloVar.f19119b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(gloVar.f(g(), h()));
        stringBuffer.append(".");
        stringBuffer.append(k());
        gloVar.a(stringBuffer, n());
        gloVar.b(stringBuffer, m());
        return stringBuffer.toString();
    }

    public Class o() {
        if (this.o == null) {
            this.o = e(6);
        }
        return this.o;
    }

    public final Method p(Class cls, String str, Class[] clsArr, Set set) {
        if (cls == null) {
            return null;
        }
        if (!set.contains(cls)) {
            set.add(cls);
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method methodP = p(cls.getSuperclass(), str, clsArr, set);
        if (methodP != null) {
            return methodP;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null) {
            for (Class<?> cls2 : interfaces) {
                Method methodP2 = p(cls2, str, clsArr, set);
                if (methodP2 != null) {
                    return methodP2;
                }
            }
        }
        return null;
    }
}
