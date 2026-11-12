package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.InvalidUnitIDException;
import com.garmin.android.lib.connectdevicesync.exception.RemoteGdiServiceDeadException;
import com.garmin.device.datatypes.DeviceProfile;

/* JADX INFO: loaded from: classes11.dex */
public class z extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f184219x = 0;

    public class a implements ea2.a.d {
        public a() {
        }
    }

    public z(Context context, g0 g0Var) {
        super(context, "DeviceSyncTime", g0Var);
    }

    @Override // wb2.c
    public final String W() {
        return null;
    }

    public final void X(String str) {
        V();
        Intent intent = new Intent("com.garmin.android.lib.sync.DeviceSyncTime.action.ACTION_EXECUTED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.sync.DeviceSyncTime.extra.EXTRA_NAME_FAILURE_REASON", str);
        }
        P(v.b.EXECUTED);
        h0.c(this.f184159a, "notifyTimeExecuted".concat(TextUtils.isEmpty(str) ? "" : fb1.c.n(":aFailureReason=", str)), v.B(str));
        setChanged();
        notifyObservers(intent);
    }

    @Override // wb2.f0
    public final String a() {
        return null;
    }

    @Override // wb2.f0
    public final void b(Bundle bundle) {
        h hVar;
        boolean z14 = true;
        if (H() || C()) {
            if (I() || G()) {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_STATUS", 0);
            } else {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_STATUS", 1);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_TYPE", q());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_DETAIL", o());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_FAILURE_TRACE", p());
                hVar = this.f184172n;
                z14 = false;
            }
            v.J(bundle, z14, hVar);
        }
        bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_TIME_SYNC_STATUS", 2);
        hVar = null;
        v.J(bundle, z14, hVar);
    }

    @Override // wb2.f0
    public final String c() {
        return "com.garmin.android.lib.sync.DeviceSyncTime.action.ACTION_EXECUTED";
    }

    @Override // wb2.v, wb2.f0
    public final synchronized void cancel() {
    }

    @Override // wb2.f0
    public final void execute() {
        DeviceProfile deviceProfileM = m();
        Logger logger = this.f184159a;
        if (deviceProfileM != null && m().getConfigurationFlags().contains(71)) {
            logger.trace("execute: Not executing as device has CURRENT_TIME_REQUEST_SUPPORT capability");
            Q(v.c.SUCCESSFUL_NOTHING_TO_DO);
            X(null);
            return;
        }
        logger.trace("execute: begin");
        P(v.b.EXECUTING);
        try {
            ((n0) this.f184162d).l(l(), new a());
        } catch (InvalidUnitIDException e4) {
            X(e4.getMessage());
        } catch (RemoteGdiServiceDeadException e14) {
            X(e14.getMessage());
        }
        logger.trace("execute: end");
    }

    @Override // wb2.f0
    public final void prepare() {
    }

    @Override // wb2.v
    public final void w(String str) {
        X(str);
    }
}
