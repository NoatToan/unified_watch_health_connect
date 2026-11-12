package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class sm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wz f33772b;
    public rm1 c;
    public pj4 d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final sm1 f33773a = new sm1();
    }

    public static sm1 b(Context context) {
        sm1 sm1Var = b.f33773a;
        sm1Var.f33771a = context;
        return sm1Var;
    }

    public pj4 a() {
        if (this.d == null) {
            pj4 pj4Var = new pj4();
            this.d = pj4Var;
            pj4Var.b(this.c);
        }
        return this.d;
    }

    public void c(wz wzVar) {
        this.f33772b = wzVar;
        rm1 rm1Var = this.c;
        if (rm1Var == null) {
            this.c = new rm1(wzVar);
        } else {
            rm1Var.c(wzVar);
        }
    }

    public sm1() {
    }
}
