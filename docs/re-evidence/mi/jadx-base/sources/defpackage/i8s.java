package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class i8s extends e8s {

    public static abstract class a implements e8s.a {
        @Override // e8s.a
        public final void a(e8s e8sVar) {
            f((i8s) e8sVar);
        }

        @Override // e8s.a
        public final boolean b(e8s e8sVar) {
            return e((i8s) e8sVar);
        }

        @Override // e8s.a
        public final boolean c(e8s e8sVar) {
            return d((i8s) e8sVar);
        }

        public abstract boolean d(i8s i8sVar);

        public abstract boolean e(i8s i8sVar);

        public abstract void f(i8s i8sVar);
    }

    public i8s(Context context, a aVar) {
        super(context, aVar);
    }

    public final float s() {
        return (float) (((Math.atan2(m(), l()) - Math.atan2(k(), j())) * 180.0d) / 3.141592653589793d);
    }
}
