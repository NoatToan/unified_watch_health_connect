package q31;

import e23.p;
import ew1.u1;
import i3.fe;
import l72.d3;
import o13.r;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentScreenKt$KomootConsentScreen$1$1$1", f = "KomootConsentScreen.kt", l = {54, 56}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f142416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f142417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f142418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f142419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f142420f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, boolean z15, fe feVar, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f142416b = z14;
            this.f142417c = z15;
            this.f142418d = feVar;
            this.f142419e = str;
            this.f142420f = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f142416b, this.f142417c, this.f142418d, this.f142419e, this.f142420f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            if (r6 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142415a;
            if (i14 == 0) {
                r.b(obj);
                if (this.f142416b) {
                    boolean z14 = this.f142417c;
                    fe feVar = this.f142418d;
                    if (z14) {
                        this.f142415a = 1;
                        obj = d3.c(feVar, this.f142419e, null, this);
                    } else {
                        this.f142415a = 2;
                        obj = d3.c(feVar, this.f142420f, null, this);
                    }
                    return aVar;
                }
            } else if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, d0, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f142421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f142422b;

        public b(boolean z14, e23.a<Unit> aVar) {
            this.f142421a = z14;
            this.f142422b = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            int i14 = 16;
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = n.f135158a;
                b82.c.b(null, null, z3.f.c(-175170402, new a42.e(this.f142421a, this.f142422b, i14), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(boolean z14, boolean z15, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 569876000);
        int i15 = (o0VarP.h(z15) ? 32 : 16) | i14 | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarP);
            }
            z02.b.a(false, null, null, null, false, z3.f.c(283030870, new u1(z14, z15, (fe) objQ, aVar, aVar2, 9), o0VarP), o0VarP, 196608, 31);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h62.f(z14, z15, aVar, aVar2, i14, 1);
        }
    }
}
