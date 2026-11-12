package lu2;

import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import android.os.Build;
import android.os.Handler;
import bv2.g;
import java.util.Iterator;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.a1;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llu2/a;", "", "<init>", "()V", "a", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115014a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f115015b = LoggerFactory.getLogger(mu2.a.C2294a.a(mu2.a.f121120a, "CompanionDeviceUtil"));

    /* JADX INFO: renamed from: lu2.a$a, reason: collision with other inner class name */
    public interface InterfaceC2186a {
        void a(CharSequence charSequence);

        void b(IntentSender intentSender);
    }

    private a() {
    }

    public static boolean a(com.garmin.android.apps.connectmobile.c cVar, String str, InterfaceC2186a interfaceC2186a, Set set) {
        BluetoothDeviceFilter.Builder builder = new BluetoothDeviceFilter.Builder();
        builder.setAddress(str);
        AssociationRequest.Builder builder2 = new AssociationRequest.Builder();
        builder2.addDeviceFilter(builder.build());
        if (Build.VERSION.SDK_INT >= 31 && !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                builder2.setDeviceProfile((String) it.next());
            }
        }
        builder2.setSingleDevice(true);
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) cVar.getSystemService(CompanionDeviceManager.class);
        Logger logger = f115015b;
        if (companionDeviceManager == null) {
            com.airbnb.lottie.animation.keyframe.a.A("Unable to access CompanionDeviceManager for ", str, logger);
            return false;
        }
        com.airbnb.lottie.animation.keyframe.a.u("Companion Device(", str, ") -> Link triggered", logger);
        if (Build.VERSION.SDK_INT >= 33) {
            companionDeviceManager.associate(builder2.build(), new g(3), new b(str, interfaceC2186a));
            return true;
        }
        companionDeviceManager.associate(builder2.build(), new c(str, interfaceC2186a), (Handler) null);
        return true;
    }

    public static boolean b(com.garmin.android.apps.connectmobile.c cVar, String str, InterfaceC2186a interfaceC2186a, boolean z14) {
        str.getClass();
        return (Build.VERSION.SDK_INT < 31 || !z14) ? a(cVar, str, interfaceC2186a, l0.f134950a) : a(cVar, str, interfaceC2186a, a1.b("android.app.role.COMPANION_DEVICE_WATCH"));
    }
}
