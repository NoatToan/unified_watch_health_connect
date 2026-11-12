package com.mi.fitness.course.schedule.web;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.google.gson.Gson;
import com.mi.fitness.course.schedule.bean.UserInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.iqc;
import defpackage.kad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/mi/fitness/course/schedule/web/CourseScheduleJavaScriptImpl;", "Lkad;", "", "getUserInfo", "()Ljava/lang/String;", "getAuthorization", "", "getAppVersion", "()J", "", Constants.EXTRA_CLOSE_TAI, "()V", "reload", "", "isDarkMode", "()Z", "isXiaomi", "Liqc;", "webViewPage", "Liqc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Liqc;)V", "Companion", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseScheduleJavaScriptImpl extends kad {

    @NotNull
    private static final String TAG = "CourseScheduleJavaScrip";

    @NotNull
    private final iqc webViewPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseScheduleJavaScriptImpl(@NotNull Context context, @NotNull iqc webViewPage) {
        super(context, webViewPage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViewPage, "webViewPage");
        this.webViewPage = webViewPage;
    }

    @JavascriptInterface
    public final void close() {
        Logger.i(TAG, Constants.EXTRA_CLOSE_TAI);
        this.webViewPage.finishFromWeb();
    }

    @JavascriptInterface
    public final long getAppVersion() {
        Logger.i(TAG, "getAppVersion");
        return AppUtil.getVersionCode();
    }

    @JavascriptInterface
    @NotNull
    public final String getAuthorization() {
        String did;
        Logger.i(TAG, "getAuthorization");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        return AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getAuthorization(did);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @JavascriptInterface
    @NotNull
    public final String getUserInfo() {
        String did;
        Logger.i(TAG, "getUserInfo");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            did = "";
        } else {
            did = DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? wearableDeviceModel.getDid() : AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getDeviceId(wearableDeviceModel.getDid());
            if (did == null) {
                did = "";
            }
        }
        String json = new Gson().toJson(new UserInfo(userId, did));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @JavascriptInterface
    public final boolean isDarkMode() {
        return UIUtils.isNightMode(ApplicationExtKt.getApplication());
    }

    @JavascriptInterface
    public final boolean isXiaomi() {
        return RomUtils.isXiaomi();
    }

    @JavascriptInterface
    public final void reload() {
        Logger.i(TAG, "reload");
    }
}
