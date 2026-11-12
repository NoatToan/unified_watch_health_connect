package xa1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$sendPowerGuideToAllDevices$1", f = "EditPowerGuideStrategyViewModel.kt", l = {402}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f189800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f189801c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$sendPowerGuideToAllDevices$1$1", f = "EditPowerGuideStrategyViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f189803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f189804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ab1.b f189805d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, long j8, ab1.b bVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f189803b = kVar;
            this.f189804c = j8;
            this.f189805d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f189803b, this.f189804c, this.f189805d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189802a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            sa1.m mVar = this.f189803b.f189755d;
            long deviceId = this.f189805d.getDeviceId();
            this.f189802a = 1;
            mVar.getClass();
            Object objJ = f0.J(mVar, new sa1.o(mVar, this.f189804c, deviceId, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar, long j8, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f189800b = kVar;
        this.f189801c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f189800b, this.f189801c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189799a;
        if (i14 == 0) {
            o13.r.b(obj);
            sa1.m mVar = this.f189800b.f189755d;
            this.f189799a = 1;
            mVar.getClass();
            obj = f0.J(mVar, new sa1.r(mVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            for (ab1.b bVar : (List) ((v2.b) v2Var).f47386a) {
                if (bVar.getPowerGuidanceCapable()) {
                    long j8 = this.f189801c;
                    k kVar = this.f189800b;
                    xy2.b.K(kVar, new a(kVar, j8, bVar, null));
                }
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }
}
