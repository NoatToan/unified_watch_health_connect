package com.xiaomi.fitness.blood_sugar;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import com.xiaomi.wearable.device.model.ThirdPartyDeviceInfo;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.wear.api.UnbindCallback;
import defpackage.kj2;
import defpackage.zd4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001:\u000289J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H&¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\tH&¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0014\u0010/\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0014\u00101\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010+R\u0014\u00103\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010+R\u001c\u00107\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010+\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice;", "", "", "init", "()V", "", "isLogin", "()Z", TrackConstants.LOGOUT, "", "userKey", "token", "Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$LoginCallback;", "loginCallback", "login", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$LoginCallback;)V", "mac", "Lkj2;", "bindCallback", "bindDevice", "(Ljava/lang/String;Lkj2;)V", "connectDevice", "Lzd4;", "connectCallback", "setConnectListener", "(Lzd4;)V", "Lcom/xiaomi/wearable/wear/api/UnbindCallback;", "unbindCallback", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/wearable/wear/api/UnbindCallback;)V", "syncData", "(Ljava/lang/String;Lcom/xiaomi/wearable/wear/api/UnbindCallback;Z)V", "disconnectDevice", "needReconnect", "Lcom/xiaomi/wearable/device/model/ThirdPartyDeviceInfo;", "getBindDeviceInfo", "()Lcom/xiaomi/wearable/device/model/ThirdPartyDeviceInfo;", "Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$OTACallback;", "callback", "setOtaCallback", "(Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$OTACallback;)V", "isConnected", "getVerifyName", "()Ljava/lang/String;", "getModel", "model", "getAppId", q.f13858b, "getThirdPartyAppId", "thirdPartyAppId", "getThirdPartyAppKey", "thirdPartyAppKey", "getThirdPartyToken", "setThirdPartyToken", "(Ljava/lang/String;)V", "thirdPartyToken", "LoginCallback", "OTACallback", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0})
public interface IBloodSugarDevice {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$LoginCallback;", "", "onLoginSuccess", "", "onLoginFail", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LoginCallback {
        void onLoginFail();

        void onLoginSuccess();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice$OTACallback;", "", LifecycleConstantKt.ON_START, "", "onSuccess", "onFail", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onUpgrade", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OTACallback {
        void onFail();

        void onProgress(int progress);

        void onStart();

        void onSuccess();

        void onUpgrade(int progress);
    }

    void bindDevice(@NotNull String mac, @NotNull kj2 bindCallback);

    void connectDevice();

    void disconnectDevice();

    @NotNull
    String getAppId();

    @NotNull
    ThirdPartyDeviceInfo getBindDeviceInfo();

    @NotNull
    String getModel();

    @NotNull
    String getThirdPartyAppId();

    @NotNull
    String getThirdPartyAppKey();

    @NotNull
    String getThirdPartyToken();

    @NotNull
    String getVerifyName();

    void init();

    boolean isConnected();

    boolean isLogin();

    void login(@NotNull String userKey, @NotNull String token, @NotNull LoginCallback loginCallback);

    void logout();

    boolean needReconnect();

    void setConnectListener(@NotNull zd4 connectCallback);

    void setOtaCallback(@Nullable OTACallback callback);

    void setThirdPartyToken(@NotNull String str);

    void unbindDevice(@NotNull String mac, @NotNull UnbindCallback unbindCallback);

    void unbindDevice(@NotNull String mac, @NotNull UnbindCallback unbindCallback, boolean syncData);
}
