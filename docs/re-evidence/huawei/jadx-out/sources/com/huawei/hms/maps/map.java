package com.huawei.hms.maps;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public abstract class map {
    public static Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            Parcelable parcelableA = a(bundle, "HuaweiMapOptions");
            if (parcelableA != null) {
                b(bundle2, "HuaweiMapOptions", parcelableA);
            }
            Parcelable parcelableA2 = a(bundle, "StreetViewOptions");
            if (parcelableA2 != null) {
                b(bundle2, "StreetViewOptions", parcelableA2);
            }
            Parcelable parcelableA3 = a(bundle, "CameraState");
            if (parcelableA3 != null) {
                b(bundle2, "CameraState", parcelableA3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
        }
        return bundle2;
    }

    public static void b(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(map.class.getClassLoader());
        bundle.putBundle("map_state", a(bundle, str, parcelable));
    }

    public static Bundle a(Bundle bundle, String str, Parcelable parcelable) {
        Bundle bundle2;
        if (bundle != null) {
            try {
                bundle2 = bundle.getBundle("map_state");
            } catch (Exception e) {
                Log.e("MapStateUtils", "getOrgMapState exception " + e.getMessage());
                bundle2 = null;
            }
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(map.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        return bundle2;
    }

    private static Parcelable a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(map.class.getClassLoader());
        Bundle bundle2 = (Bundle) bundle.get("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(map.class.getClassLoader());
        return bundle2.getParcelable(str);
    }
}
