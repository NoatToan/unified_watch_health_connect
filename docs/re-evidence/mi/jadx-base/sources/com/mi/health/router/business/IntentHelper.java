package com.mi.health.router.business;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.heartrate.export.HeartrateExportExtKt;
import com.xiaomi.fitness.heartrate.export.HeartrateMeasurer;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.running.group.export.RunningGroupApiKt;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.kki;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/mi/health/router/business/IntentHelper;", "", "<init>", "()V", "KEY_ACTION", "", "KEY_ORIGIN", "KEY_BACK_STACK_BASE_TAB_INDEX", "TAG", "HEARING_HOME_ACTION", "ACTION_APP_HOME", "ACTION_RAINBOW", "ACTION_SLEEP", "ACTION_STEPS", "ACTION_CHECK_MY_EVENTS", "ACTION_CHECK_SPORT_RECORDS", "ACTION_CALORIE", "RELATIVE_CARE_INVITATION", "FAMILY_SERVICE_DETAIL", "FAMILY_SERVICE_HOME", "parseFitnessIntent", "Landroid/content/Intent;", "intent", "getFitnessIntentByAction", "actionValue", "srcIntent", "getRouterIntentByAction", "getStringVal", "key", "addBackStabTabIndexToIntent", "tabIndex", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentHelper.kt\ncom/mi/health/router/business/IntentHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
public final class IntentHelper {

    @NotNull
    public static final String ACTION_APP_HOME = "app_home";

    @NotNull
    private static final String ACTION_CALORIE = "calorie";

    @NotNull
    private static final String ACTION_CHECK_MY_EVENTS = "check_my_events";

    @NotNull
    private static final String ACTION_CHECK_SPORT_RECORDS = "check_sport_records";

    @NotNull
    public static final String ACTION_RAINBOW = "rainbow";

    @NotNull
    public static final String ACTION_SLEEP = "sleep_home";

    @NotNull
    public static final String ACTION_STEPS = "steps";

    @NotNull
    private static final String FAMILY_SERVICE_DETAIL = "family_service_detail";

    @NotNull
    private static final String FAMILY_SERVICE_HOME = "family_service_home";

    @NotNull
    public static final String HEARING_HOME_ACTION = "hearing_home";

    @NotNull
    public static final IntentHelper INSTANCE = new IntentHelper();

    @NotNull
    private static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_BACK_STACK_BASE_TAB_INDEX = "key_tab";

    @NotNull
    private static final String KEY_ORIGIN = "origin";

    @NotNull
    private static final String RELATIVE_CARE_INVITATION = "invite_friends";

    @NotNull
    private static final String TAG = "IntentHelper";

    private IntentHelper() {
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0262  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Intent getFitnessIntentByAction(String actionValue, Intent srcIntent) {
        Bundle bundle;
        HeartrateMeasurer heartrateExportExtKt;
        Logger.i(TAG, "getFitnessIntentByAction:" + actionValue);
        if (actionValue == null || actionValue.length() == 0) {
            return null;
        }
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        String stringVal = srcIntent == null ? null : getStringVal(srcIntent, "origin");
        if (stringVal == null || StringsKt__StringsKt.isBlank(stringVal)) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("origin", stringVal);
        }
        if (actionValue == null) {
            return null;
        }
        switch (actionValue.hashCode()) {
            case -2144685302:
                if (actionValue.equals(HEARING_HOME_ACTION)) {
                    return healthPageExtKt.getHearingPageIntent(bundle);
                }
                return null;
            case -1990995816:
                if (!actionValue.equals("exercise_detail")) {
                    return null;
                }
                return healthPageExtKt.getStepPageIntent(bundle);
            case -1933147868:
                if (actionValue.equals(FAMILY_SERVICE_HOME)) {
                    return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).getIntentForRelativeCareHomePage(srcIntent);
                }
                return null;
            case -1775618011:
                if (!actionValue.equals("heart_rate_home")) {
                    return null;
                }
                return healthPageExtKt.getHeartRatePageIntent(bundle);
            case -1754202447:
                if (!actionValue.equals("first_aid_home")) {
                    return null;
                }
                return SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).getMedicalIdHomePageIntent();
            case -1738262920:
                if (!actionValue.equals("WEIGHT")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getWeightPageIntent$default(healthPageExtKt, bundle, false, 2, null);
            case -1699503361:
                if (!actionValue.equals("heart_rate_detection")) {
                    return null;
                }
                heartrateExportExtKt = HeartrateExportExtKt.getInstance(HeartrateMeasurer.INSTANCE);
                if (heartrateExportExtKt != null) {
                    return heartrateExportExtKt.launchIntent(AppUtil.getApp());
                }
                return null;
            case -1614368015:
                if (!actionValue.equals("FIRST_AID_HOME")) {
                    return null;
                }
                return SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).getMedicalIdHomePageIntent();
            case -1509787023:
                if (actionValue.equals("pk_invite_receive")) {
                    return ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).getInviteReceiveIntent(srcIntent);
                }
                return null;
            case -1457290880:
                if (actionValue.equals(ACTION_CHECK_SPORT_RECORDS)) {
                    return addBackStabTabIndexToIntent(SportRecordApiKt.getSportRecordApi().getIntentToSportRecordListPage(), MainTab.INSTANCE.getINDEX_HEALTH());
                }
                return null;
            case -1286611032:
                if (!actionValue.equals("stand_home")) {
                    return null;
                }
                return healthPageExtKt.getStandPageIntent(bundle);
            case -791592328:
                if (!actionValue.equals("weight")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getWeightPageIntent$default(healthPageExtKt, bundle, false, 2, null);
            case -771966008:
                if (!actionValue.equals("STAND_HOME")) {
                    return null;
                }
                return healthPageExtKt.getStandPageIntent(bundle);
            case -480502540:
                if (!actionValue.equals("BLOOD_PRESSURE_HOME")) {
                    return null;
                }
                return healthPageExtKt.getBloodPressurePageIntent(bundle);
            case -384619193:
                if (!actionValue.equals(ACTION_SLEEP)) {
                    return null;
                }
                return healthPageExtKt.getSleepPageIntent(bundle);
            case -230140652:
                if (!actionValue.equals("blood_pressure_home")) {
                    return null;
                }
                return healthPageExtKt.getBloodPressurePageIntent(bundle);
            case -168965370:
                if (!actionValue.equals("calories")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getIntentToCaloriePage$default(healthPageExtKt, null, 1, null);
            case -19749213:
                if (!actionValue.equals("MENSTRUATION_HOME")) {
                    return null;
                }
                return healthPageExtKt.getMensesPageIntent(bundle);
            case 32478883:
                if (!actionValue.equals("menstruation_home")) {
                    return null;
                }
                return healthPageExtKt.getMensesPageIntent(bundle);
            case 79223559:
                if (!actionValue.equals("STEPS")) {
                    return null;
                }
                return healthPageExtKt.getStepPageIntent(bundle);
            case 109761319:
                if (!actionValue.equals("steps")) {
                    return null;
                }
                return healthPageExtKt.getStepPageIntent(bundle);
            case 121212053:
                if (actionValue.equals(ACTION_CHECK_MY_EVENTS)) {
                    return addBackStabTabIndexToIntent(MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).getIntentToMyEventsPage(), MainTab.INSTANCE.getINDEX_ME());
                }
                return null;
            case 130025831:
                if (!actionValue.equals("SLEEP_HOME")) {
                    return null;
                }
                return healthPageExtKt.getSleepPageIntent(bundle);
            case 211956465:
                if (!actionValue.equals("gotoWeb")) {
                    return null;
                }
                String stringVal2 = srcIntent == null ? null : getStringVal(srcIntent, "web_url");
                Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) (Intrinsics.areEqual(srcIntent != null ? getStringVal(srcIntent, "supportShare") : null, "1") ? HealthWebViewActivity.class : WebViewActivity.class));
                intent.putExtra(WebViewActivity.COLLAPSE_TITLE, true);
                intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, kki.d);
                intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
                intent.putExtra("URL", stringVal2);
                return intent;
            case 249497260:
                if (!actionValue.equals("LADY_DAYS")) {
                    return null;
                }
                return healthPageExtKt.getMensesPageIntent(bundle);
            case 514582271:
                if (!actionValue.equals("HEART_RATE_DETECTION")) {
                    return null;
                }
                heartrateExportExtKt = HeartrateExportExtKt.getInstance(HeartrateMeasurer.INSTANCE);
                if (heartrateExportExtKt != null) {
                    return heartrateExportExtKt.launchIntent(AppUtil.getApp());
                }
                return null;
            case 548738829:
                if (!actionValue.equals("calorie")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getIntentToCaloriePage$default(healthPageExtKt, null, 1, null);
            case 613661446:
                if (!actionValue.equals("CALORIES")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getIntentToCaloriePage$default(healthPageExtKt, null, 1, null);
            case 973576630:
                if (actionValue.equals("rainbow")) {
                    return healthPageExtKt.getRainbowPageIntent(bundle);
                }
                return null;
            case 1167482941:
                if (actionValue.equals(ACTION_APP_HOME)) {
                    return healthPageExtKt.getAppHomeIntent();
                }
                return null;
            case 1266721517:
                if (!actionValue.equals("CALORIE")) {
                    return null;
                }
                return IHealthPage.DefaultImpls.getIntentToCaloriePage$default(healthPageExtKt, null, 1, null);
            case 1282170478:
                if (actionValue.equals("group_info")) {
                    return RunningGroupApiKt.getRunningGroupApi().getRunningGroupDetailIntent(srcIntent);
                }
                return null;
            case 1460012639:
                if (actionValue.equals(RELATIVE_CARE_INVITATION)) {
                    return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).getIntentToConfirmUserInfoPage(srcIntent);
                }
                return null;
            case 1672669189:
                if (!actionValue.equals("HEART_RATE_HOME")) {
                    return null;
                }
                return healthPageExtKt.getHeartRatePageIntent(bundle);
            case 1715148053:
                if (actionValue.equals("deskclock")) {
                    return healthPageExtKt.getSleepSettingIntent(bundle);
                }
                return null;
            case 1728317100:
                if (!actionValue.equals("lady_days")) {
                    return null;
                }
                return healthPageExtKt.getMensesPageIntent(bundle);
            case 1756550296:
                if (!actionValue.equals("EXERCISE_DETAIL")) {
                    return null;
                }
                return healthPageExtKt.getStepPageIntent(bundle);
            case 1842194262:
                if (actionValue.equals(FAMILY_SERVICE_DETAIL)) {
                    return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).getIntentForFamilyService(srcIntent);
                }
                return null;
            default:
                return null;
        }
    }

    private final String getStringVal(Intent intent, String key) {
        Bundle extras = intent.getExtras();
        if ((extras != null ? extras.get(key) : null) != null) {
            return String.valueOf(extras.get(key));
        }
        Uri data = intent.getData();
        if (data != null) {
            return data.getQueryParameter(key);
        }
        return null;
    }

    @NotNull
    public final Intent addBackStabTabIndexToIntent(@NotNull Intent intent, int tabIndex) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (tabIndex != -1) {
            intent.putExtra("key_tab", tabIndex);
        }
        return intent;
    }

    @NotNull
    public final Intent getRouterIntentByAction(@NotNull String actionValue) {
        Intrinsics.checkNotNullParameter(actionValue, "actionValue");
        Intent intent = new Intent(AppUtil.getApp().getPackageName() + ".action.ROUTER");
        Logger.i(TAG, "getRawIntentByAction:" + actionValue);
        intent.putExtra("action", actionValue);
        return intent;
    }

    @Nullable
    public final Intent parseFitnessIntent(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        IntentHelper intentHelper = INSTANCE;
        Intent fitnessIntentByAction = intentHelper.getFitnessIntentByAction(intentHelper.getStringVal(intent, "action"), intent);
        if (fitnessIntentByAction != null) {
            String stringVal = intentHelper.getStringVal(intent, "origin");
            if (stringVal != null) {
                fitnessIntentByAction.putExtra("origin", stringVal);
            }
            fitnessIntentByAction.addFlags(intent.getFlags());
            Bundle extras = intent.getExtras();
            if (extras != null) {
                fitnessIntentByAction.putExtras(extras);
            }
        }
        return fitnessIntentByAction;
    }
}
