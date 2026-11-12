package com.xiaomi.fitness.webview;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.webview.bean.PageData;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import defpackage.xpd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/webview/WebPageUtil;", "", "<init>", "()V", "TAG", "", "gotoPage", "", "context", "Landroid/content/Context;", "pageDataJson", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebPageUtil {

    @NotNull
    public static final WebPageUtil INSTANCE = new WebPageUtil();

    @NotNull
    public static final String TAG = "WebPageUtil";

    private WebPageUtil() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void gotoPage(@NotNull Context context, @Nullable String pageDataJson) {
        PageData pageData;
        String targetPage;
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i(TAG, "gotoPage " + pageDataJson);
        if (pageDataJson == null || (pageData = (PageData) new Gson().fromJson(pageDataJson, PageData.class)) == null || (targetPage = pageData.getTargetPage()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("origin", PassportJsbWebViewPageConfig.ActionBarConfig.VAL_ACTION_BAR_STYLE_WEB);
        String orDefault = "";
        switch (targetPage.hashCode()) {
            case -1832420479:
                if (targetPage.equals("sportTab")) {
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
                    MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    return;
                }
                break;
            case -1287800591:
                if (targetPage.equals("onPayDialog")) {
                    try {
                        String pageParam = pageData.getPageParam();
                        if (pageParam == null) {
                            pageParam = "";
                        }
                        orDefault = xpd.e(pageParam).getOrDefault("webSource", "");
                    } catch (Exception e) {
                        Logger.e(TAG, e);
                    }
                    MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                    Intrinsics.checkNotNull(orDefault);
                    membershipHelperExtKt.showVipPurchaseDialog(orDefault);
                    return;
                }
                break;
            case -791592328:
                if (targetPage.equals("weight")) {
                    context.startActivity(IHealthPage.DefaultImpls.getWeightPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), bundle, false, 2, null));
                    return;
                }
                break;
            case -266803431:
                if (targetPage.equals("userInfo")) {
                    SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).startUserIndicatorsActivity(context);
                    return;
                }
                break;
            case 3537088:
                if (targetPage.equals("spo2")) {
                    context.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getSpo2PageIntent(bundle));
                    return;
                }
                break;
            case 3540684:
                if (targetPage.equals("step")) {
                    context.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getStepPageIntent(bundle));
                    return;
                }
                break;
            case 25198943:
                if (targetPage.equals("deviceTab")) {
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                    MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    return;
                }
                break;
            case 105867849:
                if (targetPage.equals("onPay")) {
                    MembershipHelper membershipHelperExtKt2 = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                    String pageParam2 = pageData.getPageParam();
                    membershipHelperExtKt2.onPay(context, pageParam2 != null ? pageParam2 : "");
                    return;
                }
                break;
            case 109522647:
                if (targetPage.equals("sleep")) {
                    context.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getSleepPageIntent(bundle));
                    return;
                }
                break;
            case 200416838:
                if (targetPage.equals("heartRate")) {
                    context.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getHeartRatePageIntent(bundle));
                    return;
                }
                break;
            case 780852260:
                if (targetPage.equals("deviceInfo")) {
                    SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceInfoPage(context);
                    return;
                }
                break;
            case 831011612:
                if (targetPage.equals("mainTab")) {
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_HEALTH());
                    MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    return;
                }
                break;
            case 1064394306:
                if (targetPage.equals("mineTab")) {
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_ME());
                    MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    return;
                }
                break;
            case 1404410493:
                if (targetPage.equals("cardManager")) {
                    NfcManagerExtKt.getInstance(NfcManager.INSTANCE).gotoCardManagerPage(context, false);
                    return;
                }
                break;
            case 1657282691:
                if (targetPage.equals("wechatBind")) {
                    AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoWechatAccessDeviceManagerActivity(context);
                    return;
                }
                break;
            case 1869477552:
                if (targetPage.equals("navigateToAllCourse")) {
                    CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), null, null, null, null, true, 15, null);
                    return;
                }
                break;
        }
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_HEALTH());
        MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
    }
}
