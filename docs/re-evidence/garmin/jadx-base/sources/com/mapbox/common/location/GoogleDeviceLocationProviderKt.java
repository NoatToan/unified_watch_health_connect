package com.mapbox.common.location;

import com.google.android.gms.common.GoogleApiAvailability;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.mapbox.common.movement.ProxyGoogleActivityRecognitionClient;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"googlePlayServicesHelper", "Lcom/mapbox/common/location/GooglePlayServicesHelper;", "getGooglePlayServicesHelper", "()Lcom/mapbox/common/location/GooglePlayServicesHelper;", "setGooglePlayServicesHelper", "(Lcom/mapbox/common/location/GooglePlayServicesHelper;)V", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GoogleDeviceLocationProviderKt {
    private static GooglePlayServicesHelper googlePlayServicesHelper = new GooglePlayServicesHelper() { // from class: com.mapbox.common.location.GoogleDeviceLocationProviderKt$googlePlayServicesHelper$1
        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayActivityRecognitionAvailable() {
            try {
                ProxyGoogleActivityRecognitionClient.Companion.verifyAndCacheMethods$common_release();
                return true;
            } catch (Throwable th3) {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Failed to load Activity Recognition client: " + th3);
                return false;
            }
        }

        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayServicesLocationAvailable() {
            return ProxyGoogleFusedLocationProviderClient.Companion.verifyAndCacheMethods$common_release();
        }

        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayServicesReady() {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MapboxSDKCommon.INSTANCE.getContext()) == 0;
        }
    };

    public static final GooglePlayServicesHelper getGooglePlayServicesHelper() {
        return googlePlayServicesHelper;
    }

    public static final void setGooglePlayServicesHelper(GooglePlayServicesHelper googlePlayServicesHelper2) {
        googlePlayServicesHelper2.getClass();
        googlePlayServicesHelper = googlePlayServicesHelper2;
    }
}
