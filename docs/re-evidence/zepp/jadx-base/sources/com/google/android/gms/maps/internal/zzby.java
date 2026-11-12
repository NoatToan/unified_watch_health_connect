package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzby {
    private zzby() {
    }

    private static <T extends Parcelable> T a(@Nullable Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(zzby.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(zzby.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    public static void zza(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableA = a(bundle, "MapOptions");
        if (parcelableA != null) {
            zza(bundle2, "MapOptions", parcelableA);
        }
        Parcelable parcelableA2 = a(bundle, "StreetViewPanoramaOptions");
        if (parcelableA2 != null) {
            zza(bundle2, "StreetViewPanoramaOptions", parcelableA2);
        }
        Parcelable parcelableA3 = a(bundle, "camera");
        if (parcelableA3 != null) {
            zza(bundle2, "camera", parcelableA3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void zza(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(zzby.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(zzby.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
