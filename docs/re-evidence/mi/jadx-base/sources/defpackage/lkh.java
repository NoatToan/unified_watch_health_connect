package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.ParcelImpl;
import com.smarthome.core.modelconfig.PluginDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public class lkh {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends lpq> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends lpq> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(lkh.class.getClassLoader());
            return (T) a(bundle2.getParcelable(PluginDeviceInfo.FMODEL));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, lpq lpqVar) {
        if (lpqVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(PluginDeviceInfo.FMODEL, d(lpqVar));
        bundle.putParcelable(str, bundle2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Parcelable d(lpq lpqVar) {
        return new ParcelImpl(lpqVar);
    }
}
