package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aim implements Serializable {
    protected static final aim e = new aim();
    private static final long serialVersionUID = 1;

    public boolean d(Class<?> cls) {
        return false;
    }

    public static aim c(Class<?>[] clsArr) {
        if (clsArr == null) {
            return e;
        }
        int length = clsArr.length;
        if (length == 0) {
            return e;
        }
        if (length == 1) {
            return new a(clsArr[0]);
        }
        return new b(clsArr);
    }

    static final class a extends aim {
        private static final long serialVersionUID = 1;
        private final Class<?> d;

        public a(Class<?> cls) {
            this.d = cls;
        }

        @Override // defpackage.aim
        public boolean d(Class<?> cls) {
            Class<?> cls2 = this.d;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    static final class b extends aim implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?>[] f473b;

        public b(Class<?>[] clsArr) {
            this.f473b = clsArr;
        }

        @Override // defpackage.aim
        public boolean d(Class<?> cls) {
            int length = this.f473b.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls2 = this.f473b[i];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
