package xc0;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxc0/g;", "Lzw2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends zw2.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f189921g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f189923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f189924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ax2.a f189925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f189926f;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f189921g = gt2.b.f79005a.h("RTS-FindMyDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189922b = bVar;
        this.f189923c = bVar.f192449a;
        this.f189924d = bVar.f192451c;
    }

    @Override // zw2.f
    public final void j() {
        if (this.f189926f != null) {
            f189921g.debug("Unregister for find my device.");
            Handler handler = this.f189926f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            } else {
                p005kotlin.jvm.internal.s.m("findMyDeviceHandler");
                throw null;
            }
        }
    }

    @Override // zw2.h
    public final void l(Fragment fragment, ax2.a aVar) {
        fragment.getClass();
        Logger logger = f189921g;
        logger.debug("FindMyDevice clicked.");
        this.f189925e = aVar;
        this.f189926f = new Handler();
        aVar.c(gw2.d.IN_PROGRESS);
        if (hk0.p.k(this.f189923c)) {
            logger.debug("sendFindMyDeviceRequest: sending find my device request for " + this.f189924d + ".");
            xt2.a aVarM = m();
            if (aVarM != null) {
                aVarM.d(new h(this, fragment));
                return;
            }
            logger.warn("sendFindMyDeviceRequest: device not connected");
            Handler handler = this.f189926f;
            if (handler != null) {
                handler.post(new f(this, fragment, 0));
                return;
            }
            return;
        }
        logger.error("viewClicked: device is not connected, can not request find my device... .");
        ax2.a aVar2 = this.f189925e;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
            throw null;
        }
        aVar2.c(gw2.d.DEFAULT);
        Context context = this.f207282a;
        String string = context.getString(R.string.find_my_watch_device_not_connected_title);
        String strD = p6.b.d(context, R.string.find_my_watch_device_not_connected_msg, string);
        String string2 = context.getString(R.string.lbl_ok);
        string2.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity == null || !cx2.g.e(activity)) {
            return;
        }
        ew2.e.a.a(ew2.e.f66901a, activity, string, strD, new o13.p(string2, new wt0.i((byte) 0, 22)), null, 496).show();
    }

    public final xt2.a m() {
        da2.b bVarF = hk0.p.f();
        DeviceProfile deviceProfileD = bVarF.d(this.f189922b.f192450b);
        if (deviceProfileD == null) {
            return null;
        }
        String macAddress = deviceProfileD.getMacAddress();
        macAddress.getClass();
        return (xt2.a) bVarF.getCapability(macAddress, xt2.a.class);
    }

    public final void n(Fragment fragment) {
        Context context = this.f207282a;
        String string = context.getString(R.string.find_my_watch_device_not_connected_msg);
        String strD = p6.b.d(context, R.string.lbl_close, string);
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity == null || !cx2.g.e(activity)) {
            return;
        }
        ew2.e.a aVar = ew2.e.f66901a;
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        ew2.e.a.a(aVar, contextRequireContext, null, string, new o13.p(strD, new wt0.i((byte) 0, 23)), null, 498).show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxc0/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "FIND_MY_DEVICE_TIMEOUT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
