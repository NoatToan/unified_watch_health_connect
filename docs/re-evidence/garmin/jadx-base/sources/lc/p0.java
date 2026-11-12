package lc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/p0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f111829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111830c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f111832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f111833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f111834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k23.d<?> f111835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f111836i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.a f111828a = new o0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111831d = -1;

    public static void a(p0 p0Var, Object obj) {
        p0Var.getClass();
        obj.getClass();
        p0Var.f111836i = obj;
        p0Var.f111833f = false;
        y0 y0VarI = kg.f.i(p0Var, -1);
        Unit unit = Unit.INSTANCE;
        p0Var.f111833f = y0VarI.f111914a;
        p0Var.f111834g = y0VarI.f111915b;
    }

    public final void b(int i14) {
        this.f111831d = i14;
        this.f111833f = false;
    }

    public final void c(String str) {
        if (str != null) {
            if (d53.w.J(str)) {
                vb.h.s("Cannot pop up to an empty route");
            } else {
                this.f111832e = str;
                this.f111833f = false;
            }
        }
    }
}
