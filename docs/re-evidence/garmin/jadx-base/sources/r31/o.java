package r31;

import c2.w;
import c2.x2;
import com.google.android.exoplayer2.C;
import kotlin.t1;
import p005kotlin.Unit;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f150052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f150053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q f150054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f150055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f150056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f150057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f150058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f150059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f150060j;

    public /* synthetic */ o(e23.q qVar, e23.q qVar2, e23.q qVar3, String str, String str2, String str3, x0 x0Var, x0 x0Var2, x0 x0Var3, int i14) {
        this.f150051a = i14;
        this.f150052b = qVar;
        this.f150053c = qVar2;
        this.f150054d = qVar3;
        this.f150055e = str;
        this.f150056f = str2;
        this.f150057g = str3;
        this.f150058h = x0Var;
        this.f150059i = x0Var2;
        this.f150060j = x0Var3;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g6.f fVarA;
        g6.f fVarA2;
        g6.f fVarA3;
        g6.f fVarA4;
        int i14 = this.f150051a;
        g6.f fVarA5 = null;
        e23.q qVar = this.f150054d;
        e23.q qVar2 = this.f150053c;
        e23.q qVar3 = this.f150052b;
        switch (i14) {
            case 0:
                w wVar = (w) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    float fS0 = ((g6.c) mVar.A(t1.f91490h)).s0(wVar.j());
                    if (qVar3 == null) {
                        mVar.C(1859185954);
                        mVar.f();
                        fVarA = null;
                    } else {
                        mVar.C(-1464046913);
                        float f14 = ((g6.f) qVar3.invoke(Float.valueOf(fS0), mVar, 0)).f75997a;
                        mVar.f();
                        fVarA = g6.f.a(f14);
                    }
                    if (qVar2 == null) {
                        mVar.C(1859252418);
                        mVar.f();
                        fVarA2 = null;
                    } else {
                        mVar.C(-1464044769);
                        float f15 = ((g6.f) qVar2.invoke(Float.valueOf(fS0), mVar, 0)).f75997a;
                        mVar.f();
                        fVarA2 = g6.f.a(f15);
                    }
                    if (qVar == null) {
                        mVar.C(1859322850);
                        mVar.f();
                    } else {
                        mVar.C(-1464042497);
                        float f16 = ((g6.f) qVar.invoke(Float.valueOf(fS0), mVar, 0)).f75997a;
                        mVar.f();
                        fVarA5 = g6.f.a(f16);
                    }
                    g6.f fVar = fVarA5;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    int i15 = b92.a.f16960b;
                    i70.b.a(this.f150055e, this.f150056f, this.f150057g, this.f150058h, this.f150059i, this.f150060j, fVarA, fVarA2, fVar, rVarD, mVar, C.ENCODING_PCM_32BIT, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                w wVar2 = (w) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(wVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    float fS1 = ((g6.c) mVar2.A(t1.f91490h)).s0(wVar2.j());
                    if (qVar3 == null) {
                        mVar2.C(1533209614);
                        mVar2.f();
                        fVarA3 = null;
                    } else {
                        mVar2.C(465100371);
                        float f17 = ((g6.f) qVar3.invoke(Float.valueOf(fS1), mVar2, 0)).f75997a;
                        mVar2.f();
                        fVarA3 = g6.f.a(f17);
                    }
                    if (qVar2 == null) {
                        mVar2.C(1533276078);
                        mVar2.f();
                        fVarA4 = null;
                    } else {
                        mVar2.C(465102515);
                        float f18 = ((g6.f) qVar2.invoke(Float.valueOf(fS1), mVar2, 0)).f75997a;
                        mVar2.f();
                        fVarA4 = g6.f.a(f18);
                    }
                    if (qVar == null) {
                        mVar2.C(1533346510);
                        mVar2.f();
                    } else {
                        mVar2.C(465104787);
                        float f19 = ((g6.f) qVar.invoke(Float.valueOf(fS1), mVar2, 0)).f75997a;
                        mVar2.f();
                        fVarA5 = g6.f.a(f19);
                    }
                    g6.f fVar2 = fVarA5;
                    h4.r rVarD2 = x2.d(h4.r.S, 1.0f);
                    int i16 = b92.a.f16960b;
                    i70.b.a(this.f150055e, this.f150056f, this.f150057g, this.f150058h, this.f150059i, this.f150060j, fVarA3, fVarA4, fVar2, rVarD2, mVar2, C.ENCODING_PCM_32BIT, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
