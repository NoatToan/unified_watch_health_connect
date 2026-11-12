package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public interface b2f {

    public static class a implements b2f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Looper f3713a;

        public a(Looper looper) {
            this.f3713a = looper;
        }

        @Override // defpackage.b2f
        public boolean a() {
            return this.f3713a == Looper.myLooper();
        }

        @Override // defpackage.b2f
        public z4i b(ld8 ld8Var) {
            return new okb(ld8Var, this.f3713a, 10);
        }
    }

    boolean a();

    z4i b(ld8 ld8Var);
}
