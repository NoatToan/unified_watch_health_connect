package zb0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.concurrent.TimeUnit;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.GarminDeviceBroadcastReceiver$enqueueDeviceWork$1", f = "GarminDeviceBroadcastReceiver.kt", l = {46, 51}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceProfile f203671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f203672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f203673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f203674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f203675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f203676f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.GarminDeviceBroadcastReceiver$enqueueDeviceWork$1$1", f = "GarminDeviceBroadcastReceiver.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f203677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f203678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceProfile f203679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f203680d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, String str, DeviceProfile deviceProfile, byte[] bArr, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f203677a = j8;
            this.f203678b = str;
            this.f203679c = deviceProfile;
            this.f203680d = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f203677a, this.f203678b, this.f203679c, this.f203680d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            bb2.m mVarH = CacheDatabase.i().h();
            DeviceProfile deviceProfile = this.f203679c;
            mVarH.a(new bb2.l(this.f203677a, this.f203678b, deviceProfile.getF92746j(), GsonUtil.a(deviceProfile), this.f203680d));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lue/y;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lue/y;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.GarminDeviceBroadcastReceiver$enqueueDeviceWork$1$2", f = "GarminDeviceBroadcastReceiver.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super ue.y>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f203681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f203682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceProfile f203683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, Context context, DeviceProfile deviceProfile, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f203681a = j8;
            this.f203682b = context;
            this.f203683c = deviceProfile;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f203681a, this.f203682b, this.f203683c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ue.y> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            androidx.work.c.a aVar2 = new androidx.work.c.a();
            aVar2.f11467a.put("ARG_INPUT_TIMESTAMP", Long.valueOf(this.f203681a));
            ue.x xVarA = new ue.x.a((Class<? extends androidx.work.d>) GarminDeviceWakefulService.class).f(aVar2.a()).e(0L, TimeUnit.MILLISECONDS).a();
            ue.i0.f170088a.getClass();
            return ue.i0.a.a(this.f203682b).a(String.valueOf(this.f203683c.getF92746j()), ue.l.REPLACE, xVarA).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Intent intent, BroadcastReceiver.PendingResult pendingResult, Context context, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f203674d = intent;
        this.f203675e = pendingResult;
        this.f203676f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f203674d, this.f203675e, this.f203676f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (ge1.b.e0(r2, r11, r17) == r1) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Parcelable parcelable;
        long j8;
        DeviceProfile deviceProfile;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203673c;
        if (i14 != 0) {
            if (i14 == 1) {
                long j14 = this.f203672b;
                DeviceProfile deviceProfile2 = this.f203671a;
                o13.r.b(obj);
                deviceProfile = deviceProfile2;
                j8 = j14;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f203675e.finish();
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        Intent intent = this.f203674d;
        String action = intent.getAction();
        if (action == null) {
            return Unit.INSTANCE;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", DeviceProfile.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE");
            if (!(parcelableExtra instanceof DeviceProfile)) {
                parcelableExtra = null;
            }
            parcelable = (DeviceProfile) parcelableExtra;
        }
        DeviceProfile deviceProfile3 = (DeviceProfile) parcelable;
        if (deviceProfile3 == null) {
            return Unit.INSTANCE;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_FILE_CONTENT");
        long jCurrentTimeMillis = System.currentTimeMillis();
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(jCurrentTimeMillis, action, deviceProfile3, byteArrayExtra, null);
        this.f203671a = deviceProfile3;
        this.f203672b = jCurrentTimeMillis;
        this.f203673c = 1;
        if (ge1.b.e0(bVar, aVar2, this) != aVar) {
            j8 = jCurrentTimeMillis;
            deviceProfile = deviceProfile3;
        }
        return aVar;
        x53.c cVar2 = o53.s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        b bVar2 = new b(j8, this.f203676f, deviceProfile, null);
        this.f203671a = null;
        this.f203672b = j8;
        this.f203673c = 2;
    }
}
