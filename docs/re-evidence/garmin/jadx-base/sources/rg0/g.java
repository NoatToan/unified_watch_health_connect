package rg0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f152546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f152547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f152548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f152549d;

        public a(String str, e23.a<Unit> aVar, String str2, e23.a<Unit> aVar2) {
            this.f152546a = str;
            this.f152547b = aVar;
            this.f152548c = str2;
            this.f152549d = aVar2;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(196210183, new b82.m(this.f152546a, this.f152547b, this.f152548c, this.f152549d, 1), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1250720059);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128) | (o0VarE.r(aVar4) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(495682639, new f(aVar, aVar2, aVar3, aVar4), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
