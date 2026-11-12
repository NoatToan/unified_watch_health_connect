package k90;

import android.content.Context;
import c22.e1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk90/s;", "", "Landroid/content/Context;", "applicationContext", "Lmv0/e;", "locationProvider", "<init>", "(Landroid/content/Context;Lmv0/e;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f103605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv0.e f103606b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103607a;

        static {
            int[] iArr = new int[j22.f.values().length];
            try {
                iArr[j22.f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.f.ALLOWED_WHILE_USING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103607a = iArr;
        }
    }

    static {
        new a(null);
    }

    public s(Context context, mv0.e eVar) {
        context.getClass();
        eVar.getClass();
        this.f103605a = context;
        this.f103606b = eVar;
    }

    public static l90.e a() {
        if (e1.a()) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CheckDeviceScanPermissionsUseCase", "Bluetooth is enabled");
            return l90.e.GRANTED;
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Bluetooth is disabled");
        return l90.e.BLUETOOTH_DISABLED;
    }

    public final l90.e b(boolean z14) {
        j22.b.f96736a.getClass();
        boolean zN = j22.b.n();
        Context context = this.f103605a;
        if (zN) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CheckDeviceScanPermissionsUseCase", "Checking Bluetooth permissions");
            if (j22.b.p(context, j22.g.f96759d)) {
                i2.a.b(a2Var, "CheckDeviceScanPermissionsUseCase", "Bluetooth permission granted");
                return a();
            }
            i2.a.b(a2Var, "CheckDeviceScanPermissionsUseCase", "Bluetooth permission denied");
            return l90.e.BLUETOOTH_PERMISSION_DENIED;
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Checking Location permissions");
        int i14 = b.f103607a[j22.b.j(context).ordinal()];
        if (i14 == 1) {
            i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Location permission granted ALL_TIME");
            return c();
        }
        if (i14 != 2) {
            i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Location permission denied");
            return l90.e.LOCATION_PERMISSION_DENIED;
        }
        i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Location permission granted WHILE_USING");
        return z14 ? l90.e.BACKGROUND_LOCATION_PERMISSION_DENIED : c();
    }

    public final l90.e c() {
        if (this.f103606b.a("CheckDeviceScanPermissionsUseCase")) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CheckDeviceScanPermissionsUseCase", "Location is enabled");
            return a();
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "CheckDeviceScanPermissionsUseCase", "Location is disabled");
        return l90.e.LOCATION_DISABLED;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
