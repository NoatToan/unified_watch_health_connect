package p006l2;

import e23.a;
import g6.c;
import i3.mc;
import km1.b;
import kotlin.o1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import v2.h2;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108558a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f108559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f108561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f108562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f108563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f108564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f108565h;

    public /* synthetic */ i(h2 h2Var, n nVar, w4.a aVar, o1 o1Var, q qVar, c cVar, boolean z14) {
        this.f108560c = h2Var;
        this.f108561d = nVar;
        this.f108562e = aVar;
        this.f108563f = o1Var;
        this.f108564g = qVar;
        this.f108565h = cVar;
        this.f108559b = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f108558a) {
            case 0:
                h2 h2Var = (h2) this.f108560c;
                n nVar = (n) this.f108561d;
                w4.a aVar = (w4.a) this.f108562e;
                o1 o1Var = (o1) this.f108563f;
                q qVar = (q) this.f108564g;
                c cVar = (c) this.f108565h;
                h2Var.getClass();
                boolean z14 = this.f108559b;
                if (!z14) {
                    nVar.w();
                }
                nVar.f181376l = aVar;
                nVar.f181373i = o1Var;
                nVar.f181377m = qVar;
                nVar.f181367c = cVar;
                nVar.f181374j = z14;
                nVar.f181375k = false;
                nVar.f181369e = false;
                break;
            default:
                b bVar = (b) this.f108560c;
                b0 b0Var = (b0) this.f108561d;
                p1 p1Var = (p1) this.f108562e;
                p1 p1Var2 = (p1) this.f108563f;
                p1 p1Var3 = (p1) this.f108564g;
                mc mcVar = (mc) this.f108565h;
                if (this.f108559b) {
                    if (s.g(b.f(bVar), (DateTime) p1Var.getF182175a()) && s.g(b.d(bVar), (DateTime) p1Var2.getF182175a())) {
                        ge1.b.T(b0Var, null, null, new pn1.b.C2622b(mcVar, null), 3);
                    } else {
                        p1Var3.setValue(Boolean.TRUE);
                    }
                } else if (((DateTime) p1Var.getF182175a()) == null && ((DateTime) p1Var2.getF182175a()) == null) {
                    ge1.b.T(b0Var, null, null, new pn1.b.c(mcVar, null), 3);
                } else {
                    p1Var3.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(boolean z14, b bVar, b0 b0Var, p1 p1Var, p1 p1Var2, p1 p1Var3, mc mcVar) {
        this.f108559b = z14;
        this.f108560c = bVar;
        this.f108561d = b0Var;
        this.f108562e = p1Var;
        this.f108563f = p1Var2;
        this.f108564g = p1Var3;
        this.f108565h = mcVar;
    }
}
