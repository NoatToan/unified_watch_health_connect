package com.xiaomi.fitness.relative;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.CurseResetActivity;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.pai.PaiFragment;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.relative.bloodpressure.BloodPressureRFragment;
import com.xiaomi.fitness.relative.calorie.CalorieRFragment;
import com.xiaomi.fitness.relative.hrm.HrmRFragment;
import com.xiaomi.fitness.relative.mhintensity.MHStrengthRFragment;
import com.xiaomi.fitness.relative.sleep.SleepRFragment;
import com.xiaomi.fitness.relative.spo2.Spo2RFragment;
import com.xiaomi.fitness.relative.stand.StandRFragment;
import com.xiaomi.fitness.relative.step.StepRFragment;
import com.xiaomi.fitness.relative.weight.WeightRFragment;
import defpackage.c0j;
import defpackage.dih;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J0\u0010\u0011\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/relative/RelativeUtil;", "", "<init>", "()V", "goDataPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "context", "Landroid/content/Context;", DailyRecordKey.sportType, "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "activityOptions", "Landroid/app/ActivityOptions;", "gotoCurseDetail", "gotoPage", "targetClazz", "Ljava/lang/Class;", "getWeekDateStr", "", "localDate", "Lorg/joda/time/LocalDate;", "relativeTrackReport", "type", "relativeUid", "isRemind", "", "getHomeTypeString", "dataType", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeUtil {

    @NotNull
    public static final RelativeUtil INSTANCE = new RelativeUtil();

    private RelativeUtil() {
    }

    private final String getHomeTypeString(int dataType) {
        if (dataType == 2) {
            return "calories";
        }
        if (dataType == 3) {
            return "steps";
        }
        if (dataType == 4) {
            return "heart_rate";
        }
        if (dataType == 5) {
            return FitnessPersistKey.ValidStand;
        }
        if (dataType == 6) {
            return "sleep";
        }
        if (dataType == 9) {
            return "curse";
        }
        if (dataType == 10000) {
            return "weight";
        }
        switch (dataType) {
            case 13:
                return "spo2";
            case 14:
                return "regular_target";
            case 15:
                return "intensity";
            case 16:
                return "blood_pressure";
            default:
                return "unknown";
        }
    }

    @JvmStatic
    @NotNull
    public static final String getWeekDateStr(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        LocalDate localDatePlusDays = localDate.plusDays(6);
        Intrinsics.checkNotNull(localDatePlusDays);
        return TimeDateUtil.getDateRangeFormat(localDate, localDatePlusDays);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoCurseDetail(Context context, ActivityOptions activityOptions) {
        if (CurseExtKt.curseReady()) {
            dih.a().c(context, CurseExtKt.isSettingMiss(CurseManager.INSTANCE.getInstance().getSetting()) ? CurseResetActivity.class : CurseMainActivity.class, null, activityOptions);
        } else if (context != null) {
            ToastExtKt.toast$default(context, c0j.common_hint_network_unavailable, 0, 0, 0L, 14, null);
        }
    }

    public static /* synthetic */ void relativeTrackReport$default(RelativeUtil relativeUtil, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        relativeUtil.relativeTrackReport(i, str, z);
    }

    public final void goDataPage(@NotNull final FragmentActivity activity, @Nullable final Context context, int sportType, @NotNull Bundle bundle, @Nullable final ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (sportType == 2) {
            gotoPage(context, CalorieRFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 3) {
            gotoPage(context, StepRFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 4) {
            gotoPage(context, HrmRFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 5) {
            gotoPage(context, StandRFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 6) {
            gotoPage(context, SleepRFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 9) {
            PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).showPrivacySensitiveDialogIfNeed(activity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.relative.RelativeUtil.goDataPage.1
                @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                public void onPrivacyAccepted() {
                    if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                        RelativeUtil.INSTANCE.gotoCurseDetail(context, activityOptions);
                    } else {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(activity);
                    }
                }
            });
            return;
        }
        if (sportType == 10) {
            gotoPage(context, PaiFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 13) {
            gotoPage(context, Spo2RFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 10000) {
            gotoPage(context, WeightRFragment.class, bundle, activityOptions);
        } else if (sportType == 15) {
            gotoPage(context, MHStrengthRFragment.class, bundle, activityOptions);
        } else {
            if (sportType != 16) {
                return;
            }
            gotoPage(context, BloodPressureRFragment.class, bundle, activityOptions);
        }
    }

    public final void gotoPage(@Nullable Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(context, fragmentParamsB, true, activityOptions);
    }

    public final void relativeTrackReport(int type, @NotNull String relativeUid, boolean isRemind) {
        Intrinsics.checkNotNullParameter(relativeUid, "relativeUid");
        String homeTypeString = getHomeTypeString(type);
        Map<String, ? extends Object> mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("name", "relatives_data_detail"), TuplesKt.to("data_type", homeTypeString), TuplesKt.to("tip", "56.55.1.1.25018"), TuplesKt.to("user_id", MD5Util.MD5(relativeUid)));
        if (Intrinsics.areEqual(homeTypeString, "heart_rate") || Intrinsics.areEqual(homeTypeString, "spo2")) {
            mapMutableMapOf.put("is_remind", Boolean.valueOf(isRemind));
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMutableMapOf);
    }
}
