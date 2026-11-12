package com.huami.core.device.wifi_settings.service;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.tools.analytics.DbUtils;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u000212J'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0007J\u0013\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012J\u0013\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0012J\u001b\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0012J\u001b\u0010\"\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0012J\u0014\u0010'\u001a\u00020\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H&J\b\u0010(\u001a\u00020\u0005H&J\b\u0010)\u001a\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0005H&J\u0018\u00100\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "", "", "ssid", "password", "", "setPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "securityType", "eapType", "phase2Type", LoseWeightPropertyKey.IDENTITY, "anonymousID", "addWiFi", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", g.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "accessToken", "region", "appPlatform", "appId", "appVersion", "setToken", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAp", "stopAp", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "getWiFiConnectState", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "getConfigWifiList", "deleteWiFi", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wifiConfigured", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$IWiFiControllerCallback;", "callback", "setWiFiControllerCallback", "isBluetoothEnable", "isDeviceConnect", "register", "eventBusConnect", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "type", "onClickHelp", "ClickType", "IWiFiControllerCallback", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public interface IWiFiControllerProxy {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "CONNECT_FAILED", "CONNECT_TIPS", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public enum ClickType {
        CONNECT_FAILED(1),
        CONNECT_TIPS(2);

        private final int value;

        ClickType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object addWiFi$default(IWiFiControllerProxy iWiFiControllerProxy, String str, String str2, int i, Integer num, Integer num2, String str3, String str4, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iWiFiControllerProxy.addWiFi(str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWiFi");
        }

        public static /* synthetic */ Object setPassword$default(IWiFiControllerProxy iWiFiControllerProxy, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPassword");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return iWiFiControllerProxy.setPassword(str, str2, continuation);
        }

        public static /* synthetic */ void setWiFiControllerCallback$default(IWiFiControllerProxy iWiFiControllerProxy, IWiFiControllerCallback iWiFiControllerCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWiFiControllerCallback");
            }
            if ((i & 1) != 0) {
                iWiFiControllerCallback = null;
            }
            iWiFiControllerProxy.setWiFiControllerCallback(iWiFiControllerCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$IWiFiControllerCallback;", "", "", "ssid", "", "onPwdRequest", "onAddWifiRequest", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "wifiStatus", "onWiFiStateChanged", "onCancel", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public interface IWiFiControllerCallback {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static void onAddWifiRequest(@NotNull IWiFiControllerCallback iWiFiControllerCallback, @Nullable String str) {
            }

            public static void onCancel(@NotNull IWiFiControllerCallback iWiFiControllerCallback) {
            }

            public static void onPwdRequest(@NotNull IWiFiControllerCallback iWiFiControllerCallback, @NotNull String str) {
            }

            public static void onWiFiStateChanged(@NotNull IWiFiControllerCallback iWiFiControllerCallback, @NotNull WiFiConnectStatus wiFiConnectStatus) {
            }
        }

        void onAddWifiRequest(@Nullable String ssid);

        void onCancel();

        void onPwdRequest(@NotNull String ssid);

        void onWiFiStateChanged(@NotNull WiFiConnectStatus wifiStatus);
    }

    @Nullable
    Object addWiFi(@NotNull String str, @Nullable String str2, int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object cancel(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteWiFi(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    void eventBusConnect(boolean register);

    @Nullable
    Object getConfigWifiList(@NotNull Continuation<? super List<WifiBean>> continuation);

    @Nullable
    Object getWiFiConnectState(@NotNull Continuation<? super WiFiConnectStatus> continuation);

    boolean isBluetoothEnable();

    boolean isDeviceConnect();

    void onClickHelp(@NotNull Context context, @NotNull ClickType type);

    @Nullable
    Object setPassword(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setToken(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super Unit> continuation);

    void setWiFiControllerCallback(@Nullable IWiFiControllerCallback callback);

    @Nullable
    Object startAp(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stopAp(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object wifiConfigured(@NotNull Continuation<? super Boolean> continuation);
}
