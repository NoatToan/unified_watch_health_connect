package com.mapbox.maps;

import com.mapbox.common.MapboxMapsAndroidLogger;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\b"}, d2 = {"logD", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "message", "logE", "logI", "logW", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapboxLogger {
    public static final void logD(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogD$sdk_base_release(str, str2);
    }

    public static final void logE(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogE$sdk_base_release(str, str2);
    }

    public static final void logI(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogI$sdk_base_release(str, str2);
    }

    public static final void logW(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogW$sdk_base_release(str, str2);
    }
}
