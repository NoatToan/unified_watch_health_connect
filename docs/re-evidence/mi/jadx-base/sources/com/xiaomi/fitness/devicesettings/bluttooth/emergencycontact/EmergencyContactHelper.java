package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import android.content.Intent;
import android.provider.Settings;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.dg4;
import defpackage.ig4;
import defpackage.s7r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0002J$\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00070\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactHelper;", "", "<init>", "()V", "TAG", "", "requestMIUISos", "", "isMIUISosOpen", "", "isMIUISosCanBeTrigger", "responseSos", "success", "requestAnimationJson", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "animationUrl", "Lkotlin/Function1;", "getBaseUrl", "getGuideParam", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmergencyContactHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactHelper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class EmergencyContactHelper {

    @NotNull
    public static final EmergencyContactHelper INSTANCE = new EmergencyContactHelper();

    @NotNull
    private static final String TAG = "EmergencyContactHelper";

    private EmergencyContactHelper() {
    }

    private final String getBaseUrl() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        if (currentRegion.length() == 0) {
            currentRegion = "cn";
        }
        if (Intrinsics.areEqual(currentRegion, "cn")) {
            return "https://hlth.io.mi.com/app/v1/resource/download?&data=";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) "https://hlth.io.mi.com/app/v1/resource/download?&data=", "://", 0, false, 6, (Object) null) + 3;
        String strSubstring = "https://hlth.io.mi.com/app/v1/resource/download?&data=".substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = "https://hlth.io.mi.com/app/v1/resource/download?&data=".substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring + currentRegion + "." + strSubstring2;
    }

    private final String getGuideParam(WearableDeviceModel deviceModel) {
        String str = "emergency_contact/device/" + DeviceModelExtKt.getModel(deviceModel);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "{\"module\":\"%s\",\"category\":\"%s\",\"name\":\"%s.json\"}", Arrays.copyOf(new Object[]{"user_guide", str, "guide_animation"}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private final boolean isMIUISosCanBeTrigger() {
        return isMIUISosOpen() && !(Settings.Secure.getInt(ApplicationExtKt.getApplication().getContentResolver(), "key_is_in_miui_sos_mode") == 1);
    }

    private final void responseSos(boolean success) {
        ig4 ig4Var = new ig4();
        ig4Var.c = !success ? 1 : 0;
        dg4 dg4Var = new dg4();
        dg4Var.w(ig4Var);
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 9;
        s7rVar.Q(dg4Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public final boolean isMIUISosOpen() {
        try {
            return Settings.Secure.getInt(ApplicationExtKt.getApplication().getContentResolver(), "key_miui_sos_enable") == 1;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(TAG, "miui sos not open, probably never used");
            return false;
        }
    }

    public final void requestAnimationJson(@NotNull WearableDeviceModel deviceModel, @NotNull final Function1<? super String, Unit> animationUrl) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(animationUrl, "animationUrl");
        String baseUrl = getBaseUrl();
        new OkHttpClient().newCall(new Request.Builder().get().url(baseUrl + getGuideParam(deviceModel)).header(NetConstants.COOKIE, "auth_key=rwelJuWBFJxmbMKD").build()).enqueue(new Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactHelper.requestAnimationJson.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                e.printStackTrace();
                Logger.i(EmergencyContactHelper.TAG, "get emergency fail: " + e);
                animationUrl.invoke2(null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                String url = response.request().url().getUrl();
                Logger.i(EmergencyContactHelper.TAG, "get emergency animation url: " + url);
                animationUrl.invoke2(url);
            }
        });
    }

    public final void requestMIUISos() {
        if (!isMIUISosCanBeTrigger()) {
            responseSos(false);
            return;
        }
        try {
            Intent intent = new Intent("miui.intent.action.LAUNCH_SOS");
            intent.setPackage(Constants.SETTINGS_PACKAGE);
            intent.addFlags(268435456);
            ApplicationExtKt.getApplication().startActivity(intent);
            responseSos(true);
        } catch (Exception e) {
            e.printStackTrace();
            responseSos(false);
        }
    }
}
