package ho2;

import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$validateInitializationState$1", f = "PushProvMainActivity.kt", l = {370}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84850b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$validateInitializationState$1$1", f = "PushProvMainActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PushProvMainActivity f84851a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PushProvMainActivity pushProvMainActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84851a = pushProvMainActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84851a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            PushProvMainActivity pushProvMainActivity = this.f84851a;
            try {
                rd2.j jVar = rd2.f.a().f152045a;
                m mVar = pushProvMainActivity.f51165i;
                if (mVar == null) {
                    s.m("pushProvViewModel");
                    throw null;
                }
                long j8 = mVar.f84872c;
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                if (fVarI == null) {
                    return Unit.INSTANCE;
                }
                pushProvMainActivity.f51163g = fVarI;
                return Unit.INSTANCE;
            } catch (Exception e4) {
                Logger logger = PushProvMainActivity.f51162v;
                m mVar2 = pushProvMainActivity.f51165i;
                if (mVar2 == null) {
                    s.m("pushProvViewModel");
                    throw null;
                }
                logger.error("validateInitializationState: can not get device record for " + mVar2.f84872c, (Throwable) e4);
                return Unit.INSTANCE;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84852a;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.UNDER_MAINTENANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84852a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PushProvMainActivity pushProvMainActivity, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f84850b = pushProvMainActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f84850b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84849a;
        PushProvMainActivity pushProvMainActivity = this.f84850b;
        if (i14 == 0) {
            r.b(obj);
            PushProvMainActivity.f51162v.debug("validateInitializationState");
            x53.c cVar = s0.f129406a;
            a aVar2 = new a(pushProvMainActivity, null);
            this.f84849a = 1;
            if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        sd2.f fVar = pushProvMainActivity.f51163g;
        t tVar = pushProvMainActivity.f51168l;
        if (fVar != null) {
            z0 z0Var = pushProvMainActivity.f51167k;
            if (z0Var == null) {
                vb.h.z("FitPayServiceProvider must not be null");
                return null;
            }
            if (z0Var.f205983e) {
                PushProvMainActivity.ca(pushProvMainActivity);
            } else {
                ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar.getValue()).x4();
                ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar.getValue()).f51575b.f(pushProvMainActivity, new c(pushProvMainActivity, 1));
            }
            return Unit.INSTANCE;
        }
        Logger logger = PushProvMainActivity.f51162v;
        m mVar = pushProvMainActivity.f51165i;
        if (mVar == null) {
            s.m("pushProvViewModel");
            throw null;
        }
        logger.error("validateInitializationState: can not get device record for " + mVar.f84872c);
        br2.c.h(br2.c.f19585a, pushProvMainActivity, null, new ho2.a(pushProvMainActivity, 9), 2);
        return Unit.INSTANCE;
    }
}
