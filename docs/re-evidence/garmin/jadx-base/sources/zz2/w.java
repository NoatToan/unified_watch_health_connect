package zz2;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import lc.u0;
import o4.r1;
import o4.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class w implements e23.q<c2.t, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a03.p f207732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f207733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f207734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f207735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.a<a03.y> f207736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f207737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f207738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f207739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f207740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f207741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f207742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f207743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f207744m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207745a;

        static {
            int[] iArr = new int[a03.y.values().length];
            try {
                iArr[a03.y.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a03.y.FullyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a03.y.IntermediatelyExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a03.y.SlightlyExpanded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f207745a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(a03.p pVar, long j8, e23.a<Unit> aVar, h4.r rVar, a03.a<a03.y> aVar2, e23.l<? super Float, Unit> lVar, r1 r1Var, long j14, long j15, float f14, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, o53.b0 b0Var) {
        this.f207732a = pVar;
        this.f207733b = j8;
        this.f207734c = aVar;
        this.f207735d = rVar;
        this.f207736e = aVar2;
        this.f207737f = lVar;
        this.f207738g = r1Var;
        this.f207739h = j14;
        this.f207740i = j15;
        this.f207741j = f14;
        this.f207742k = pVar2;
        this.f207743l = qVar;
        this.f207744m = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Unit invoke(c2.t tVar, p3.m mVar, Integer num) {
        float f14;
        h4.r rVarH;
        float f15;
        c2.t tVar2 = tVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        tVar2.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= mVar2.B(tVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && mVar2.b()) {
            mVar2.e();
        } else {
            mVar2.L(2043135252);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                mVar2.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            mVar2.R();
            a03.p pVar = this.f207732a;
            boolean z14 = pVar.f158i.f183n.getF182175a() != 0;
            mVar2.L(1220123079);
            float f16 = ((Configuration) mVar2.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp;
            g6.f.a aVar = g6.f.f75994b;
            mVar2.R();
            a03.m mVar3 = pVar.f153d;
            float f17 = f16 * mVar3.f127a;
            int i14 = a.f207745a[((a03.y) pVar.f158i.f178i.getF182175a()).ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    f15 = mVar3.f127a;
                } else if (i14 == 3) {
                    f15 = mVar3.f128b;
                } else {
                    if (i14 != 4) {
                        u0.r();
                        return null;
                    }
                    f15 = mVar3.f129c;
                }
                f14 = f15 * f16;
            } else {
                f14 = 1;
            }
            if (pVar.f156g) {
                rVarH = x2.d(h4.r.S, 1.0f);
            } else {
                h4.r.a aVar2 = h4.r.S;
                if (((Boolean) p1Var.getF182175a()).booleanValue() || z14) {
                    f14 = f17;
                }
                rVarH = x2.h(aVar2, f14);
            }
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar2.c(rVarH, h4.d.a.f81531i);
            mVar2.L(2043171004);
            boolean zB = mVar2.B(pVar) | mVar2.h(z14);
            Object objQ2 = mVar2.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n(pVar, z14, p1Var, 0);
                mVar2.K(objQ2);
            }
            mVar2.R();
            c2.v.a(s0.a(rVarC, (e23.l) objQ2), null, false, z3.f.b(396416044, new v(this.f207732a, this.f207733b, this.f207734c, this.f207735d, z14, f17, f16, this.f207736e, this.f207737f, this.f207738g, this.f207739h, this.f207740i, this.f207741j, p1Var, this.f207742k, this.f207743l, this.f207744m), mVar2), mVar2, 3072, 6);
        }
        return Unit.INSTANCE;
    }
}
