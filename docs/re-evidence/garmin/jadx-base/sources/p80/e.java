package p80;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp80/e;", "", "", "linkDeviceMessageResId", "permissionInfoMessageResId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    DEFAULT(R.string.msg_link_device_info, R.string.msg_link_device_permission_info),
    SCREENLESS(R.string.msg_link_device_info_v2, R.string.msg_link_device_permission_info_v2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136367b;

    e(int i14, int i15) {
        this.f136366a = i14;
        this.f136367b = i15;
    }
}
