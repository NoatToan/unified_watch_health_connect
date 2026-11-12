package com.huami.core.device.wifi_settings.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/core/device/wifi_settings/utils/WiFiConnectErrorCode;", "", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WiFiConnectErrorCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = -1;
    private static final int b = 200;
    private static final int c = 201;
    private static final int d = 202;
    private static final int e = 203;
    private static final int f = 204;
    private static final int g = 205;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/huami/core/device/wifi_settings/utils/WiFiConnectErrorCode$Companion;", "", "", "UNKNOWN", LogUtil.I, "getUNKNOWN", "()I", "BEACON_TIMEOUT", "getBEACON_TIMEOUT", "NO_AP_FOUND", "getNO_AP_FOUND", "AUTH_FAIL", "getAUTH_FAIL", "ASSOC_FAIL", "getASSOC_FAIL", "HANDSHAKE_TIME_OUT", "getHANDSHAKE_TIME_OUT", "CONNECTION_FAIL", "getCONNECTION_FAIL", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getASSOC_FAIL() {
            return WiFiConnectErrorCode.e;
        }

        public final int getAUTH_FAIL() {
            return WiFiConnectErrorCode.d;
        }

        public final int getBEACON_TIMEOUT() {
            return WiFiConnectErrorCode.b;
        }

        public final int getCONNECTION_FAIL() {
            return WiFiConnectErrorCode.g;
        }

        public final int getHANDSHAKE_TIME_OUT() {
            return WiFiConnectErrorCode.f;
        }

        public final int getNO_AP_FOUND() {
            return WiFiConnectErrorCode.c;
        }

        public final int getUNKNOWN() {
            return WiFiConnectErrorCode.a;
        }
    }
}
