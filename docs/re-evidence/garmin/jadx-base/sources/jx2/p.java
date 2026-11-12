package jx2;

import com.garmin.device.datatypes.DeviceProfile;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$recordFeatureEnabledAnalytic$1", f = "SaMDDeviceManager.kt", l = {287}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceProfile f101593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kx2.a f101594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx2.b f101595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Throwable f101596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f101597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f101598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f101599h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$recordFeatureEnabledAnalytic$1$1", f = "SaMDDeviceManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeviceProfile f101600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kx2.a f101601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kx2.b f101602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Throwable f101603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f101604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f101605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r f101606g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceProfile deviceProfile, kx2.a aVar, kx2.b bVar, Throwable th3, String str, long j8, r rVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f101600a = deviceProfile;
            this.f101601b = aVar;
            this.f101602c = bVar;
            this.f101603d = th3;
            this.f101604e = str;
            this.f101605f = j8;
            this.f101606g = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f101600a, this.f101601b, this.f101602c, this.f101603d, this.f101604e, this.f101605f, this.f101606g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                new hx2.b(hx2.a.ENABLE_APP_ON_GARMIN_DEVICE).e(this.f101600a, this.f101601b, this.f101602c, this.f101603d, this.f101604e);
                if (this.f101602c == null) {
                    qx2.a.f148445a.a(qx2.b.ANALYTIC_RECORDED_DEVICE_FEATURES_ENABLED, this.f101605f, this.f101601b);
                }
            } catch (Exception e4) {
                this.f101606g.e("recordFeatureEnabledAnalytic", e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DeviceProfile deviceProfile, kx2.a aVar, kx2.b bVar, Throwable th3, String str, long j8, r rVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f101593b = deviceProfile;
        this.f101594c = aVar;
        this.f101595d = bVar;
        this.f101596e = th3;
        this.f101597f = str;
        this.f101598g = j8;
        this.f101599h = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f101593b, this.f101594c, this.f101595d, this.f101596e, this.f101597f, this.f101598g, this.f101599h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101592a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f101593b, this.f101594c, this.f101595d, this.f101596e, this.f101597f, this.f101598g, this.f101599h, null);
            this.f101592a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
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
