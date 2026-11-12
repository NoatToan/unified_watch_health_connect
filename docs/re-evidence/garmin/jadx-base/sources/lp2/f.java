package lp2;

import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationListFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationListFragment$selectVerificationMethod$1", f = "FitPayCardVerificationListFragment.kt", l = {214}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationListFragment f114239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dq2.f f114240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FitPayCardVerificationListFragment fitPayCardVerificationListFragment, dq2.f fVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f114239b = fitPayCardVerificationListFragment;
        this.f114240c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f114239b, this.f114240c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114238a;
        FitPayCardVerificationListFragment fitPayCardVerificationListFragment = this.f114239b;
        try {
            if (i14 == 0) {
                r.b(obj);
                fitPayCardVerificationListFragment.w6().debug("selectVerificationMethod");
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayCardVerificationListFragment.f51510g;
                if (bVar == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar.x(true);
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = fitPayCardVerificationListFragment.f51505b;
                if (aVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                dq2.f fVar = this.f114240c;
                this.f114238a = 1;
                if (aVar2.D4(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            fitPayCardVerificationListFragment.w6().error("selectVerificationMethod: failed to select verification method ", (Throwable) e4);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar2 = fitPayCardVerificationListFragment.f51510g;
            if (bVar2 == null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            bVar2.P0(new FitPayCardVerificationActivity.a.h(true));
        }
        return Unit.INSTANCE;
    }
}
