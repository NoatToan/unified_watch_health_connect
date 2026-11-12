package com.google.android.gms.common;

import androidx.core.view.j;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes14.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i14) {
        int i15 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 104 + String.valueOf(i14).length() + 194);
        j.m(i15, i14, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb3);
        sb3.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i14, sb3.toString());
    }
}
