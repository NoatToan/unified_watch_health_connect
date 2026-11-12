package c22;

import android.content.Context;
import android.location.Address;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/t1;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f23254a = new t1();

    private t1() {
    }

    public static final String a(Context context, Address address) {
        context.getClass();
        address.getClass();
        String strB = b(address);
        if (strB != null) {
            return strB;
        }
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            String string = context.getString(R.string.lbl_unknown);
            string.getClass();
            return string;
        }
        f23254a.getClass();
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("(%.4f°, %.4f°)", Arrays.copyOf(new Object[]{Double.valueOf(address.getLatitude()), Double.valueOf(address.getLongitude())}, 2));
    }

    public static final String b(Address address) {
        address.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (address.getLocality() != null) {
            sb3.append(address.getLocality());
        }
        String adminArea = address.getAdminArea();
        if (adminArea != null) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            sb3.append(adminArea);
        }
        if (sb3.length() <= 0) {
            sb3 = null;
        }
        if (sb3 != null) {
            return sb3.toString();
        }
        return null;
    }
}
