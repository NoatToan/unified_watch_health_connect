package vc0;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/j;", "Lei2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ei2.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f176990h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f176992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f176993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public di2.a f176994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f176995g;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f176990h = gt2.b.f79005a.h("DSL-FindMyDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176991c = fVar;
        this.f176992d = fVar.getUnitID();
        this.f176993e = fVar.getDisplayName();
    }

    public static xt2.a t(sd2.f fVar) {
        da2.b bVarF = hk0.p.f();
        DeviceProfile deviceProfileD = bVarF.d(fVar.d0());
        if (deviceProfileD == null && (deviceProfileD = bVarF.d(fVar.Q())) == null) {
            return null;
        }
        String macAddress = deviceProfileD.getMacAddress();
        macAddress.getClass();
        return (xt2.a) bVarF.getCapability(macAddress, xt2.a.class);
    }

    @Override // ei2.h
    public final void p() {
        if (this.f176995g != null) {
            f176990h.debug("Unregister for find my device.");
            Handler handler = this.f176995g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            } else {
                p005kotlin.jvm.internal.s.m("findMyDeviceHandler");
                throw null;
            }
        }
    }

    @Override // ei2.j
    public final void s(Fragment fragment, di2.a aVar) {
        Logger logger = f176990h;
        logger.debug("FindMyDevice clicked.");
        this.f176994f = aVar;
        this.f176995g = new Handler();
        aVar.e(mh2.j.IN_PROGRESS);
        if (hk0.p.k(this.f176992d)) {
            com.airbnb.lottie.animation.keyframe.a.u("sendFindMyDeviceRequest: sending find my device request for ", this.f176993e, ".", logger);
            xt2.a aVarT = t(this.f176991c);
            if (aVarT != null) {
                aVarT.d(new k(this, fragment));
                return;
            }
            logger.warn("sendFindMyDeviceRequest: device not connected");
            Handler handler = this.f176995g;
            if (handler != null) {
                handler.post(new h(this, fragment, 0));
                return;
            }
            return;
        }
        logger.error("viewClicked: device is not connected, can not request find my device... .");
        di2.a aVar2 = this.f176994f;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
            throw null;
        }
        aVar2.e(mh2.j.DEFAULT);
        Context context = this.f64388a;
        String string = context.getString(R.string.find_my_watch_device_not_connected_title);
        String strD = p6.b.d(context, R.string.find_my_watch_device_not_connected_msg, string);
        String string2 = context.getString(R.string.lbl_ok);
        string2.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity == null || !hi2.c.a(activity)) {
            return;
        }
        kh2.g.a.a(kh2.g.f104792a, activity, string, strD, new o13.p(string2, new uj1.a(29)), null, 496).show();
    }

    public final void u(Fragment fragment) {
        Context context = this.f64388a;
        String string = context.getString(R.string.find_my_watch_device_not_connected_msg);
        String strD = p6.b.d(context, R.string.lbl_close, string);
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity == null || !hi2.c.a(activity)) {
            return;
        }
        kh2.g.a aVar = kh2.g.f104792a;
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        kh2.g.a.a(aVar, contextRequireContext, null, string, new o13.p(strD, new i(0)), null, 498).show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvc0/j$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "FIND_MY_DEVICE_TIMEOUT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
