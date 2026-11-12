package com.mapbox.common;

import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/MapboxMapsAndroidLogger;", "", "()V", "SDK_IDENTIFIER", "", "internalLogD", "", HeaderParameterNames.AUTHENTICATION_TAG, "message", "internalLogD$sdk_base_release", "internalLogE", "internalLogE$sdk_base_release", "internalLogI", "internalLogI$sdk_base_release", "internalLogW", "internalLogW$sdk_base_release", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapsAndroidLogger {
    public static final MapboxMapsAndroidLogger INSTANCE = new MapboxMapsAndroidLogger();
    public static final String SDK_IDENTIFIER = "maps-android";

    private MapboxMapsAndroidLogger() {
    }

    public final void internalLogD$sdk_base_release(String tag, String message) {
        tag.getClass();
        message.getClass();
        try {
            Log.debug(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void internalLogE$sdk_base_release(String tag, String message) {
        tag.getClass();
        message.getClass();
        try {
            Log.error(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void internalLogI$sdk_base_release(String tag, String message) {
        tag.getClass();
        message.getClass();
        try {
            Log.info(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void internalLogW$sdk_base_release(String tag, String message) {
        tag.getClass();
        message.getClass();
        try {
            Log.warning(message, "maps-android\\".concat(tag));
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
