package vz1;

import a42.a0;
import c2.q0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mc;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.presentation.factors.NoDataFactorKt$NoDataFactor$1$1$annotatedString$1$1$1$1", f = "NoDataFactor.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f180917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f180918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180917b = aVar;
            this.f180918c = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180917b, this.f180918c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180916a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f180917b.invoke();
                this.f180916a = 1;
                if (this.f180918c.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(mc mcVar, b0 b0Var, int i14, u4.d dVar, int i15, Integer num, int i16, e23.a<Unit> aVar, p3.m mVar, int i17) {
        int i18;
        b0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(710813729);
        if ((i17 & 6) == 0) {
            i18 = (o0VarE.B(mcVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i18 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i18 |= o0VarE.B(dVar) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i18 |= o0VarE.k(i15) ? 16384 : 8192;
        }
        if ((196608 & i17) == 0) {
            i18 |= o0VarE.B(num) ? 131072 : 65536;
        }
        if ((1572864 & i17) == 0) {
            i18 |= o0VarE.k(i16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i17) == 0) {
            i18 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i18 & 1, (4793491 & i18) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            int i19 = ((i18 >> 6) & 14) | 224256;
            int i24 = i18 << 3;
            i.a(i14, mcVar, b0Var, null, null, z3.f.c(1293980228, new a0(i15, num, i16, dVar, b0Var, aVar, mcVar), o0VarE), o0VarE, i19 | (i24 & 112) | (i24 & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(mcVar, b0Var, i14, dVar, i15, num, i16, aVar, i17);
        }
    }
}
