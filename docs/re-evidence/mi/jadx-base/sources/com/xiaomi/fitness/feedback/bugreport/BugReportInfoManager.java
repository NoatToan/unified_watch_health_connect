package com.xiaomi.fitness.feedback.bugreport;

import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.a0j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/BugReportInfoManager;", "", "<init>", "()V", "getMIUIBugReport", "Landroid/content/Intent;", "userCoreInfo", "Lcom/xiaomi/accountsdk/account/data/XiaomiUserCoreInfo;", "generateCustomInfo", "", "addDeviceInfo4CustomObj", "", "customObj", "Lcom/google/gson/JsonObject;", "addExtraInfo4CustomObj", "generateExtraString", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BugReportInfoManager {

    @NotNull
    public static final BugReportInfoManager INSTANCE = new BugReportInfoManager();

    private BugReportInfoManager() {
    }

    private final void addDeviceInfo4CustomObj(JsonObject customObj) {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) {
            return;
        }
        customObj.addProperty(Column.BATTERY, Integer.valueOf(deviceInfo.getBattery()));
        customObj.addProperty("did", deviceInfo.getDid());
        customObj.addProperty("mac", deviceInfo.getMac());
        customObj.addProperty("model", deviceInfo.getModel());
        customObj.addProperty("firmwareVersion", deviceInfo.getFirmwareVersion());
    }

    private final void addExtraInfo4CustomObj(JsonObject customObj, XiaomiUserCoreInfo userCoreInfo) {
        customObj.addProperty("extra", generateExtraString(userCoreInfo));
    }

    private final String generateCustomInfo(XiaomiUserCoreInfo userCoreInfo) {
        JsonObject jsonObject = new JsonObject();
        addDeviceInfo4CustomObj(jsonObject);
        addExtraInfo4CustomObj(jsonObject, userCoreInfo);
        return new Gson().toJson((JsonElement) jsonObject);
    }

    private final String generateExtraString(XiaomiUserCoreInfo userCoreInfo) {
        if (userCoreInfo == null) {
            return "";
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uId", userCoreInfo.userId);
        jsonObject.addProperty("uName", userCoreInfo.userName);
        jsonObject.addProperty("uEmail", userCoreInfo.avatarAddress);
        jsonObject.addProperty("uPhone", userCoreInfo.safePhone);
        jsonObject.addProperty("uLocal", userCoreInfo.locale);
        String json = new Gson().toJson((JsonElement) jsonObject);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            Intrinsics.checkNotNull(json);
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return ByteUtil.byteToString(messageDigest.digest(bytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Nullable
    public final Intent getMIUIBugReport(@NotNull XiaomiUserCoreInfo userCoreInfo) {
        Intrinsics.checkNotNullParameter(userCoreInfo, "userCoreInfo");
        Intent intent = new Intent("miui.intent.action.BUGREPORT");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            intent.putExtra("packageName", "com.xiaomi.wearable");
        } else {
            intent.putExtra("packageName", "com.mi.health");
        }
        intent.putExtra(TSMAuthContants.PARAM_APP_TITLE_FEEDBACK, ResourceExtKt.getString(a0j.y));
        intent.putExtra("isUploadLog", true);
        intent.putExtra("customInfo", generateCustomInfo(userCoreInfo));
        return intent;
    }
}
