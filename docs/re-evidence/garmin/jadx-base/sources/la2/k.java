package la2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.datatypes.DeviceProfile;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lla2/k;", "Lla2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements la2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f111700b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f111701c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111702a;

    private k(Context context) {
        this.f111702a = context;
    }

    @Override // la2.a
    public final void onDeviceConnected(b bVar) {
        Bundle bundle = new Bundle();
        DeviceProfile deviceProfile = bVar.f111632a;
        bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfile);
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", deviceProfile.getMacAddress());
        bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", deviceProfile.getF172494b());
        oa2.b.a(this.f111702a, "com.garmin.android.gdi.ACTION_DEVICE_HANDSHAKE_COMPLETED", "LegacyConnectionCallback", bundle);
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(c cVar) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", cVar.f111633a);
        bundle.putString("com.garmin.android.gdi.EXTRA_FAILURE_CODE", cVar.f111634b.name());
        if (cVar.b()) {
            str = "com.garmin.android.gdi.ACTION_DEVICE_CONNECTING_TIMEOUT";
        } else {
            str = cVar.a() ? "com.garmin.android.gdi.ACTION_BAD_BLUETOOTH_LE_STATE" : "com.garmin.android.gdi.ACTION_DEVICE_CONNECTING_FAILURE";
        }
        oa2.b.a(this.f111702a, str, "LegacyConnectionCallback", bundle);
    }

    @Override // la2.a
    public final void onDeviceDisconnected(h hVar) {
        Bundle bundle = new Bundle();
        DeviceProfile deviceProfile = hVar.f111673a;
        bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfile);
        bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", deviceProfile.getMacAddress());
        bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", deviceProfile.getF172494b());
        bundle.putInt("com.garmin.android.gdi.EXTRA_GATT_STATUS_VALUE", hVar.f111674b);
        String str = oa2.b.f131086a;
        Context context = this.f111702a;
        if (context == null || TextUtils.isEmpty("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED")) {
            return;
        }
        Intent intent = new Intent("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED");
        intent.putExtras(bundle);
        intent.setPackage(context.getPackageName());
        LoggerFactory.getLogger(TextUtils.isEmpty("LegacyConnectionCallback") ? oa2.b.f131086a : "LegacyConnectionCallback").debug("Local & global broadcasting " + intent.getAction() + StringUtils.SPACE + intent.getExtras());
        z9.a.a(context).c(intent);
        context.sendBroadcast(intent, oa2.b.d(context));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lla2/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lla2/k;", "instance", "Lla2/k;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(Context context, p005kotlin.jvm.internal.j jVar) {
        this(context);
    }
}
