package p90;

import java.util.ArrayList;
import o53.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.o0;
import p3.p1;
import p3.x3;
import rs2.t;
import vd0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136499a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f136500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f136502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f136503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f136504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f136505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f136506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f136507i;

    public /* synthetic */ f(o0 o0Var, boolean z14, m0 m0Var, d dVar, rs2.c cVar, t tVar, q53.t tVar2, l90.b bVar) {
        this.f136501c = o0Var;
        this.f136500b = z14;
        this.f136502d = m0Var;
        this.f136503e = dVar;
        this.f136504f = cVar;
        this.f136505g = tVar;
        this.f136506h = tVar2;
        this.f136507i = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f136499a) {
            case 0:
                o0 o0Var = (o0) this.f136501c;
                m0 m0Var = (m0) this.f136502d;
                d dVar = (d) this.f136503e;
                rs2.c cVar = (rs2.c) this.f136504f;
                t tVar = (t) this.f136505g;
                e.a(o0Var, (q53.t) this.f136506h, (l90.b) this.f136507i, o0Var.f105806a, false, 112);
                if (this.f136500b) {
                    m0Var.f105804a = true;
                }
                dVar.f136471c.w(cVar.getF92746j(), tVar);
                break;
            default:
                e23.a aVar = (e23.a) this.f136501c;
                b0 b0Var = (b0) this.f136502d;
                x3 x3Var = (x3) this.f136503e;
                p1 p1Var = (p1) this.f136504f;
                x3 x3Var2 = (x3) this.f136505g;
                p1 p1Var2 = (p1) this.f136506h;
                oe0.l lVar = (oe0.l) this.f136507i;
                if (!((Boolean) x3Var.getF182175a()).booleanValue()) {
                    ge1.b.T(b0Var, null, null, new g0(lVar, aVar, null), 3);
                } else if (this.f136500b) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    i53.c cVar2 = (i53.c) x3Var2.getF182175a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : cVar2) {
                        if (((pe0.h) obj).f137444c == je0.j.ACTIVE) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() >= 10) {
                        p1Var2.setValue(Boolean.TRUE);
                    } else {
                        aVar.invoke();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(boolean z14, e23.a aVar, b0 b0Var, x3 x3Var, p1 p1Var, x3 x3Var2, p1 p1Var2, oe0.l lVar) {
        this.f136500b = z14;
        this.f136501c = aVar;
        this.f136502d = b0Var;
        this.f136503e = x3Var;
        this.f136504f = p1Var;
        this.f136505g = x3Var2;
        this.f136506h = p1Var2;
        this.f136507i = lVar;
    }
}
