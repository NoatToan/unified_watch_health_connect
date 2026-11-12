package gc0;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import g2.m1;
import org.koin.java.KoinJavaComponent;
import zb0.g0;

/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f76868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public im2.l f76869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.m f76870c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s2 f76872e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sd2.f f76871d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f76873f = new a();

    public class a extends xf0.b {
        public a() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            i2.a(a2.DEVICES, "DeviceUICommon", "DeviceConnectedEvent received");
            ((g0) i.this.f76868a).v6();
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            i2.a(a2.DEVICES, "DeviceUICommon", "DeviceDisconnectedEvent received");
            ((g0) i.this.f76868a).v6();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76875a;

        static {
            int[] iArr = new int[gc0.b.c.values().length];
            f76875a = iArr;
            try {
                iArr[gc0.b.c.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76875a[gc0.b.c.REMOVE_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76875a[gc0.b.c.SYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(androidx.fragment.app.m mVar, c cVar) {
        this.f76868a = null;
        this.f76870c = mVar;
        this.f76868a = cVar;
        try {
            this.f76872e = (s2) mVar;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "DeviceUICommon", mVar.getLocalClassName() + " should implement ProgressOverlayListener");
        }
    }

    public final void a(sd2.f fVar, boolean z14) {
        String string = this.f76870c.getResources().getString(R.string.device_action_msg_removing_device);
        s2 s2Var = this.f76872e;
        if (s2Var != null) {
            s2Var.showProgressOverlay(string);
        }
        String displayName = !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName();
        long unitID = fVar.getUnitID();
        if (fVar.d0() != null) {
            fVar.d0();
        } else if (fVar.Q() != null) {
            fVar.Q();
        }
        this.f76869b = ((lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null)).a(unitID, z14, new bn0.h(this, displayName, fVar, unitID, 4), new m1(4, this, displayName));
    }
}
