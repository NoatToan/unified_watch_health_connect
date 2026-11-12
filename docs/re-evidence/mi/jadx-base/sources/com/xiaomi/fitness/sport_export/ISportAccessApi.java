package com.xiaomi.fitness.sport_export;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 ;2\u00020\u0001:\u0001;J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&J(\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH&J\"\u0010\u001b\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&J@\u0010&\u001a\u00020\u000326\u0010'\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030(H&J@\u0010-\u001a\u00020\u000326\u0010'\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030(H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0013H&J\u0016\u0010/\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u00100\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u00101\u001a\u00020\u0003H&J<\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u00020\"2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u00107\u001a\u00020\u0003H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/sport_export/ISportAccessApi;", "", "checkWearModeAndSwitchToBandModeIfNeed", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lkotlin/Function0;", "getMapboxInstance", "doAllNecessaryChecksAndGoToAidongSdkIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "fallbackFunction", "jumpSensingGamePageCheckActivity", "context", "Landroid/content/Context;", "launchSportBeanModeWearGuideActivity", "launchLaunchSportActivity", DailyRecordKey.sportType, "", "getSportPermissions", LifecycleConstantKt.TYPE_ACTIVITY, "launch", "addLaunchSportShortcut", "launchAbilityTrainingSport", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "launchHabitTrainingSport", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "isDeviceSupportTrainingPlan", "", "clickSportBanner", "getFirstLineStr", "", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSecondLineStr", "addSportChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "status", "type", "removeSportChangeListener", "notifySportChanged", "addSportDataChangeListener", "removeSportDataChangeListener", "notifySportDataChanged", "checkAndDownloadAudioFeedbackResourcesIfNeed", "showToast", "callSite", "onSuccess", "onFail", "unzipAndDeleteAudioFeedbackResZipFile", "initSupportCityData", "data", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "Companion", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportAccessApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_export/ISportAccessApi$Companion;", "", "<init>", "()V", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkAndDownloadAudioFeedbackResourcesIfNeed$default(ISportAccessApi iSportAccessApi, boolean z, String str, Function0 function0, Function0 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAndDownloadAudioFeedbackResourcesIfNeed");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                function0 = new Function0() { // from class: syc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 8) != 0) {
                function1 = new Function0() { // from class: tyc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            iSportAccessApi.checkAndDownloadAudioFeedbackResourcesIfNeed(z, str, function0, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void doAllNecessaryChecksAndGoToAidongSdkIfNeed$default(ISportAccessApi iSportAccessApi, FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doAllNecessaryChecksAndGoToAidongSdkIfNeed");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            iSportAccessApi.doAllNecessaryChecksAndGoToAidongSdkIfNeed(fragmentActivity, function0);
        }
    }

    void addLaunchSportShortcut();

    void addSportChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener);

    void addSportDataChangeListener(@NotNull Function0<Unit> listener);

    void checkAndDownloadAudioFeedbackResourcesIfNeed(boolean showToast, @NotNull String callSite, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFail);

    void checkWearModeAndSwitchToBandModeIfNeed(@NotNull FragmentManager fragmentManager, @NotNull Function0<Unit> callback);

    void clickSportBanner(@NotNull FragmentActivity fragmentActivity, int sportType);

    void doAllNecessaryChecksAndGoToAidongSdkIfNeed(@NotNull FragmentActivity fragmentActivity, @Nullable Function0<Unit> fallbackFunction);

    @NotNull
    String getFirstLineStr(@NotNull SportBasicReport report);

    void getMapboxInstance();

    @NotNull
    String getSecondLineStr(@NotNull SportBasicReport report);

    void getSportPermissions(@Nullable FragmentActivity activity, int sportType, @NotNull Function0<Unit> launch);

    void initSupportCityData(@NotNull RunningRouteSupportCityBean data);

    boolean isDeviceSupportTrainingPlan();

    void jumpSensingGamePageCheckActivity(@NotNull Context context);

    void launchAbilityTrainingSport(@Nullable FragmentActivity context, @NotNull AbilityDayPlanCourse abilityPlanCourse);

    void launchHabitTrainingSport(@Nullable FragmentActivity context, int sportType, @NotNull HabitDayPlan habitDayPlan);

    void launchLaunchSportActivity(int sportType, @NotNull Context context);

    void launchSportBeanModeWearGuideActivity(@NotNull Context context);

    void notifySportChanged(@NotNull String status, int type);

    void notifySportDataChanged();

    void removeSportChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener);

    void removeSportDataChangeListener(@NotNull Function0<Unit> listener);

    void unzipAndDeleteAudioFeedbackResZipFile();
}
