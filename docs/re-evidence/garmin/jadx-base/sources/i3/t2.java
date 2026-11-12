package i3;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89739a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f89742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f89743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f89745g;

    public /* synthetic */ t2(int i14, ph1.d dVar, a03.p pVar, o53.b0 b0Var, p3.n1 n1Var, e2.i0 i0Var) {
        this.f89740b = i14;
        this.f89742d = dVar;
        this.f89743e = pVar;
        this.f89744f = b0Var;
        this.f89745g = n1Var;
        this.f89741c = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f89739a) {
            case 0:
                a3 a3Var = (a3) this.f89742d;
                l3.e0 e0Var = (l3.e0) this.f89743e;
                l3.k0 k0Var = (l3.k0) this.f89744f;
                Locale locale = (Locale) this.f89745g;
                p3.p1 p1Var = (p3.p1) this.f89741c;
                return p3.p0.n(((x5.l0) p1Var.getF182175a()).f188878a.f157138b.length() > 0 ? a3Var.a(e0Var.j(((x5.l0) p1Var.getF182175a()).f188878a.f157138b, k0Var.f109298c, locale), this.f89740b, locale) : "");
            case 1:
                km0.e eVar = (km0.e) this.f89742d;
                String str = (String) this.f89743e;
                e23.l lVar = (e23.l) this.f89744f;
                p3.p1 p1Var2 = (p3.p1) this.f89741c;
                p3.p1 p1Var3 = (p3.p1) this.f89745g;
                boolean z14 = eVar instanceof km0.e.b;
                int i14 = this.f89740b;
                if (z14) {
                    p1Var2.setValue(new km0.e.a(i14, str));
                    p1Var3.setValue(Boolean.TRUE);
                } else {
                    lVar.invoke(new km0.e.a(i14, str));
                }
                return Unit.INSTANCE;
            case 2:
                e23.a aVar = (e23.a) this.f89742d;
                sm1.s sVar = (sm1.s) this.f89743e;
                p3.p1 p1Var4 = (p3.p1) this.f89741c;
                o53.b0 b0Var = (o53.b0) this.f89744f;
                Context context = (Context) this.f89745g;
                aVar.invoke();
                int i15 = this.f89740b;
                if (i15 != -1) {
                    DateTime dateTimeF = km1.b.f((km1.b) ((List) p1Var4.getF182175a()).get(i15));
                    Long lValueOf = dateTimeF != null ? Long.valueOf(dateTimeF.getMillis()) : null;
                    cw1.k0 k0Var2 = new cw1.k0(b0Var, i15, context, p1Var4, 8);
                    sVar.getClass();
                    if (lValueOf != null) {
                        ge1.b.T(androidx.lifecycle.v1.a(sVar), null, null, new sm1.x(sVar, lValueOf, k0Var2, null), 3);
                    }
                }
                return Unit.INSTANCE;
            default:
                ph1.d dVar = (ph1.d) this.f89742d;
                a03.p pVar = (a03.p) this.f89743e;
                o53.b0 b0Var2 = (o53.b0) this.f89744f;
                p3.n1 n1Var = (p3.n1) this.f89745g;
                e2.i0 i0Var = (e2.i0) this.f89741c;
                int intValue = n1Var.getIntValue();
                int i16 = this.f89740b;
                n1Var.t(intValue == i16 ? -1 : i16);
                dVar.invoke(Integer.valueOf(n1Var.getIntValue()));
                if (pVar.f158i.f177h.getF182175a() != a03.y.IntermediatelyExpanded) {
                    ge1.b.T(b0Var2, null, null, new po.q(pVar, i0Var, i16, null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t2(e23.a aVar, int i14, sm1.s sVar, p3.p1 p1Var, o53.b0 b0Var, Context context) {
        this.f89742d = aVar;
        this.f89740b = i14;
        this.f89743e = sVar;
        this.f89741c = p1Var;
        this.f89744f = b0Var;
        this.f89745g = context;
    }

    public /* synthetic */ t2(a3 a3Var, l3.e0 e0Var, l3.k0 k0Var, Locale locale, int i14, p3.p1 p1Var) {
        this.f89742d = a3Var;
        this.f89743e = e0Var;
        this.f89744f = k0Var;
        this.f89745g = locale;
        this.f89740b = i14;
        this.f89741c = p1Var;
    }

    public /* synthetic */ t2(km0.e eVar, int i14, String str, e23.l lVar, p3.p1 p1Var, p3.p1 p1Var2) {
        this.f89742d = eVar;
        this.f89740b = i14;
        this.f89743e = str;
        this.f89744f = lVar;
        this.f89741c = p1Var;
        this.f89745g = p1Var2;
    }
}
