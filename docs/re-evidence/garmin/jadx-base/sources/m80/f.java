package m80;

import android.bluetooth.le.ScanFilter;
import android.companion.AssociationInfo;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.BluetoothLeDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.companion.DeviceFilter;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.Handler;
import c22.t;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.concurrent.Executor;
import o13.q;
import o13.r;
import o53.b0;
import o53.j;
import o53.j2;
import o53.k;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/content/IntentSender;", "<anonymous>", "(Lo53/b0;)Landroid/content/IntentSender;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.data.CompanionDeviceRepositoryImpl$linkCompanionDevice$2", f = "CompanionDeviceRepositoryImpl.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super IntentSender>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f117148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f117149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f117150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f117151e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/content/IntentSender;", "<anonymous>", "(Lo53/b0;)Landroid/content/IntentSender;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.data.CompanionDeviceRepositoryImpl$linkCompanionDevice$2$1", f = "CompanionDeviceRepositoryImpl.kt", l = {396}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super IntentSender>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f117153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f117154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f117155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f117156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f117157f;

        /* JADX INFO: renamed from: m80.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class ExecutorC2224a implements Executor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ExecutorC2224a f117158a = new ExecutorC2224a();

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.getClass();
                runnable.run();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"m80/f$a$b", "Landroid/companion/CompanionDeviceManager$Callback;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends CompanionDeviceManager.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f117159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j<IntentSender> f117160b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(String str, j<? super IntentSender> jVar) {
                this.f117159a = str;
                this.f117160b = jVar;
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            public final void onAssociationCreated(AssociationInfo associationInfo) {
                associationInfo.getClass();
                a2 a2Var = a2.DEVICES;
                String strE = t.e(associationInfo.getId(), "Companion Device(", this.f117159a, ") -> onAssociationCreated(", ")");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", strE);
                super.onAssociationCreated(associationInfo);
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            public final void onAssociationPending(IntentSender intentSender) {
                intentSender.getClass();
                a2 a2Var = a2.DEVICES;
                String strM = am.j.m("Companion Device(", this.f117159a, ") -> onAssociationPending SUCCESS");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", strM);
                j<IntentSender> jVar = this.f117160b;
                if (jVar.isActive()) {
                    int i14 = q.f128596b;
                    jVar.resumeWith(intentSender);
                }
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            public final void onFailure(CharSequence charSequence) {
                a2 a2Var = a2.DEVICES;
                String str = "Companion Device(" + this.f117159a + ") -> onFailure(" + ((Object) charSequence) + ")";
                i2.f36769a.getClass();
                i2.a.f(a2Var, "CompanionDeviceRepository", str);
                j<IntentSender> jVar = this.f117160b;
                if (jVar.isActive()) {
                    int i14 = q.f128596b;
                    jVar.resumeWith(null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"m80/f$a$c", "Landroid/companion/CompanionDeviceManager$Callback;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends CompanionDeviceManager.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f117161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j<IntentSender> f117162b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, j<? super IntentSender> jVar) {
                this.f117161a = str;
                this.f117162b = jVar;
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            @o13.e
            public final void onDeviceFound(IntentSender intentSender) {
                intentSender.getClass();
                a2 a2Var = a2.DEVICES;
                String strM = am.j.m("Companion Device(", this.f117161a, ") -> onDeviceFound SUCCESS");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", strM);
                j<IntentSender> jVar = this.f117162b;
                if (jVar.isActive()) {
                    int i14 = q.f128596b;
                    jVar.resumeWith(intentSender);
                }
            }

            @Override // android.companion.CompanionDeviceManager.Callback
            public final void onFailure(CharSequence charSequence) {
                a2 a2Var = a2.DEVICES;
                String str = "Companion Device(" + this.f117161a + ") -> onFailure(" + ((Object) charSequence) + ")";
                i2.f36769a.getClass();
                i2.a.f(a2Var, "CompanionDeviceRepository", str);
                j<IntentSender> jVar = this.f117162b;
                if (jVar.isActive()) {
                    int i14 = q.f128596b;
                    jVar.resumeWith(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, String str, String str2, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f117154c = z14;
            this.f117155d = str;
            this.f117156e = str2;
            this.f117157f = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f117154c, this.f117155d, this.f117156e, this.f117157f, dVar);
            aVar.f117153b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super IntentSender> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            DeviceFilter<?> deviceFilterBuild;
            b0 b0Var = (b0) this.f117153b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117152a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f117153b = b0Var;
            this.f117152a = 1;
            k kVar = new k(u13.f.b(this), 1);
            kVar.q();
            boolean z14 = this.f117154c;
            String str = this.f117155d;
            if (z14) {
                deviceFilterBuild = new BluetoothLeDeviceFilter.Builder().setScanFilter(new ScanFilter.Builder().setDeviceAddress(str).build()).build();
                deviceFilterBuild.getClass();
            } else {
                deviceFilterBuild = new BluetoothDeviceFilter.Builder().setAddress(str).build();
                deviceFilterBuild.getClass();
            }
            AssociationRequest.Builder singleDevice = new AssociationRequest.Builder().addDeviceFilter(deviceFilterBuild).setSingleDevice(true);
            singleDevice.getClass();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 31) {
                m80.a.f117132a.getClass();
                if (m80.a.C2223a.a(this.f117156e)) {
                    singleDevice.setDeviceProfile("android.app.role.COMPANION_DEVICE_WATCH");
                }
            }
            CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117157f.getSystemService(CompanionDeviceManager.class);
            if (companionDeviceManager != null) {
                a2 a2Var = a2.DEVICES;
                String strM = am.j.m("Companion Device(", str, ") -> Link triggered");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", strM);
                if (i15 >= 33) {
                    companionDeviceManager.associate(singleDevice.build(), ExecutorC2224a.f117158a, new b(str, kVar));
                } else {
                    companionDeviceManager.associate(singleDevice.build(), new c(str, kVar), (Handler) null);
                }
            } else {
                a2 a2Var2 = a2.DEVICES;
                String strM2 = am.j.m("Companion Device(", str, ") -> CompanionDeviceManager is null");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "CompanionDeviceRepository", strM2);
                if (kVar.isActive()) {
                    int i16 = q.f128596b;
                    kVar.resumeWith(null);
                }
            }
            Object objP = kVar.p();
            return objP == aVar ? aVar : objP;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, String str, String str2, Context context, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f117148b = z14;
        this.f117149c = str;
        this.f117150d = str2;
        this.f117151e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f117148b, this.f117149c, this.f117150d, this.f117151e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super IntentSender> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117147a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        e53.c.a aVar2 = e53.c.f63094b;
        long jF = e53.e.f(AbstractComponentTracker.LINGERING_TIMEOUT, e53.f.MILLISECONDS);
        a aVar3 = new a(this.f117148b, this.f117149c, this.f117150d, this.f117151e, null);
        this.f117147a = 1;
        Object objC = j2.c(m0.e(jF), aVar3, this);
        return objC == aVar ? aVar : objC;
    }
}
