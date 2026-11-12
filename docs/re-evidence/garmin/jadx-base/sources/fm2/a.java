package fm2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.garmin.device.datatypes.DeviceProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class a implements ea2.a.InterfaceC1344a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f72102i = {"com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f72103a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f72105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DeviceProfile f72106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k7.b<Boolean> f72108f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f72104b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f72109g = c.FACTORY_RESET_STAGE_1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1467a f72110h = new C1467a();

    /* JADX INFO: renamed from: fm2.a$a, reason: collision with other inner class name */
    public class C1467a extends BroadcastReceiver {
        public C1467a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED".equals(intent.getAction())) {
                a.this.d(true);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72112a;

        static {
            int[] iArr = new int[c.values().length];
            f72112a = iArr;
            try {
                iArr[c.FACTORY_RESET_STAGE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72112a[c.FACTORY_RESET_STAGE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum c {
        FACTORY_RESET_STAGE_1,
        FACTORY_RESET_STAGE_2
    }

    public a(Context context, DeviceProfile deviceProfile, int i14, k7.b<Boolean> bVar) {
        this.f72105c = context.getApplicationContext();
        this.f72106d = deviceProfile;
        this.f72107e = i14;
        this.f72108f = bVar;
        this.f72103a = LoggerFactory.getLogger(oa2.d.b("GDI#", "FactoryResetListenerImpl", deviceProfile.getMacAddress(), deviceProfile.getF92746j(), this));
    }

    @Override // ea2.a.InterfaceC1344a
    public final void a() {
        d(false);
    }

    @Override // ea2.a.InterfaceC1344a
    public final void b() {
        d(true);
    }

    public final void c(boolean z14) {
        k7.b<Boolean> bVar = this.f72108f;
        if (bVar != null) {
            bVar.accept(Boolean.valueOf(z14));
            return;
        }
        Bundle bundle = new Bundle();
        DeviceProfile deviceProfile = this.f72106d;
        bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfile);
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", deviceProfile.getMacAddress());
        bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", deviceProfile.getF92746j());
        Context context = this.f72105c;
        if (z14) {
            oa2.b.a(context, "com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTED", oa2.d.b("GDI#", "FactoryResetListenerImpl", deviceProfile.getMacAddress(), deviceProfile.getF92746j(), this), bundle);
        } else {
            oa2.b.a(context, "com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTING_FAILURE", oa2.d.b("GDI#", "FactoryResetListenerImpl", deviceProfile.getMacAddress(), deviceProfile.getF92746j(), this), bundle);
        }
    }

    public final void d(boolean z14) {
        String str = "processReceivedEvent: currentOperation=" + this.f72109g;
        Logger logger = this.f72103a;
        logger.debug(str);
        c cVar = this.f72109g;
        if (cVar != null) {
            int i14 = b.f72112a[cVar.ordinal()];
            C1467a c1467a = this.f72110h;
            Context context = this.f72105c;
            if (i14 != 1) {
                if (i14 != 2) {
                    return;
                }
                logger.debug("unregisterBroadcastReceiver");
                try {
                    context.unregisterReceiver(c1467a);
                } catch (Exception unused) {
                }
                this.f72104b.postDelayed(new eh2.b(this, 6), this.f72107e);
                return;
            }
            if (!z14) {
                c(false);
                this.f72109g = null;
                return;
            }
            logger.debug("registerBroadcastReceiver");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f72102i[0]);
            a7.b.registerReceiver(context, c1467a, intentFilter, oa2.b.d(context), null, 4);
            this.f72109g = c.FACTORY_RESET_STAGE_2;
        }
    }
}
