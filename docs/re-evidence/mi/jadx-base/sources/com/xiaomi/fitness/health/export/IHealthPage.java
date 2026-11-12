package com.xiaomi.fitness.health.export;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.aireco.IntentionType;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarLevel;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.health.pinganhealth.DepartmentType;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 m2\u00020\u0001:\u0001mJ\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0014\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\tH&J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"H&J\u0014\u0010#\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"H&J\b\u0010$\u001a\u00020\tH&J\n\u0010%\u001a\u0004\u0018\u00010&H&J\n\u0010'\u001a\u0004\u0018\u00010&H&J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020&0)2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H&J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020&0)2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H&J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u001dH&J\b\u00100\u001a\u000201H&J\b\u00102\u001a\u000203H&J*\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020 2\b\b\u0002\u00109\u001a\u00020 H&J \u0010:\u001a\u00020\u00162\u0006\u00105\u001a\u0002062\u0006\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\"H&J \u0010=\u001a\u00020\u00162\u0006\u00105\u001a\u0002062\u0006\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\"H&J\u001c\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0?2\u0006\u0010@\u001a\u00020AH&J$\u0010B\u001a\u00020\u00032\u0006\u00107\u001a\u00020\"2\u0006\u0010C\u001a\u00020 2\n\b\u0002\u00109\u001a\u0004\u0018\u00010 H&J\u0010\u0010D\u001a\u00020 2\u0006\u0010@\u001a\u00020AH&J\u0014\u0010E\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010F\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010G\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010H\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020A0)H&J\u0018\u0010J\u001a\u00020K2\u0006\u0010@\u001a\u00020A2\u0006\u0010L\u001a\u00020MH&J4\u0010N\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\"2\b\u0010O\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002062\u0006\u0010@\u001a\u00020A2\b\u0010P\u001a\u0004\u0018\u00010QH&J\u0010\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020TH&J\u0010\u0010U\u001a\u00020\u00162\u0006\u0010S\u001a\u00020TH&J\u0018\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020X2\u0006\u0010@\u001a\u00020AH&J\u001a\u0010Y\u001a\u00020\u00162\u0006\u00105\u001a\u0002062\b\b\u0001\u0010Z\u001a\u00020\u001dH&J\u0010\u0010[\u001a\u00020\u00162\u0006\u00105\u001a\u000206H&J\b\u0010\\\u001a\u00020\tH&J\u0010\u0010]\u001a\u00020\u00162\u0006\u0010^\u001a\u00020 H&J\b\u0010_\u001a\u00020\u0016H&J \u0010`\u001a\u00020\t2\f\b\u0001\u0010a\u001a\u00020b\"\u00020\u001d2\b\b\u0002\u0010c\u001a\u00020 H&J\u001a\u0010d\u001a\u00020\u00162\b\b\u0001\u0010a\u001a\u00020\u001d2\u0006\u0010c\u001a\u00020 H&J\u0010\u0010e\u001a\u00020 2\u0006\u0010f\u001a\u00020AH&J\u0016\u0010g\u001a\u00020\u00162\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00160iH&J\u0016\u0010j\u001a\u00020\u00162\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00160iH&J\b\u0010k\u001a\u00020\u0016H&J\u0010\u0010l\u001a\u00020\u00162\u0006\u0010O\u001a\u00020 H&¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/health/export/IHealthPage;", "", "getStepPageIntent", "Landroid/content/Intent;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "getSleepPageIntent", "getWeightPageIntent", "isFrom8Electrode", "", "getMensesPageIntent", "getBloodPressurePageIntent", "getStandPageIntent", "getHeartRatePageIntent", "getHeartRateDetectionPageIntent", "getHearingPageIntent", "getRainbowPageIntent", "getAppHomeIntent", "getSpo2PageIntent", "getSleepSettingIntent", "goBloodPressureMeasurePage", "notifyNewEcgRecordToUser", "", "ecgReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "notifyAbnormalGlucose", "item", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "level", "", "usedCurse", "getCurseTitle", "", "mills", "", "getCurseSubTitle", "hasPredictData", "getCurseLatestRecord", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "getCurseLatestPredict", "getCurseRecords", "", "startMills", "endMills", "getCursePredictRecords", "markCurseStatus", "targetMarkDate", "targetMarkType", "getWidgetProviderSampleBrief", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "getWidgetProviderEntryList", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "gotoRelativeHealthFragment", "context", "Landroid/content/Context;", "relativeUid", "relativeNote", "origin", "gotoRelativeHrmFragment", "timestamp", "relativeId", "gotoRelativeSpo2Fragment", "getHealthItemNameIconResIdPair", "Lkotlin/Pair;", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getIntentForRelativeHealthPage", "relativeNode", "getHealthDataTypeNameByHomeDataType", "goBloodGlucosePageIntent", "goBloodGlucoseRecordDetailPage", "getIntentToCaloriePage", "goHrAndPaceAllRecordPage", "getSupportedHomeDataTypesForTrainingIndex", "getTrainingIndexDataItem", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "goToTrainingIndexDataPage", "did", "activityOptions", "Landroid/app/ActivityOptions;", "showSyncSwitchOpenDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "showLoginConfirmDialog", "goToTrainingIndexUnderstandPage", "contextFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "goToHealthVisitDoctorPage", "deptType", "grantAndJumpToPinganRedirectUrl", "getGrantPingan", "setPingPanPageUrl", "url", "registerAirEcoIntentionHandler", "doSendAirEcoIntention", "intentionType", "", "callSite", "sendRevertIntentionToAirEco", "getDataTypeNoDataGuide", "dataType", "addWeightChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "removeWeightChangeListener", "notifyWeightChanged", "syncTemperatureFile", "Companion", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHealthPage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/export/IHealthPage$Companion;", "", "<init>", "()V", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean doSendAirEcoIntention$default(IHealthPage iHealthPage, int[] iArr, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doSendAirEcoIntention");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return iHealthPage.doSendAirEcoIntention(iArr, str);
        }

        public static /* synthetic */ Intent getBloodPressurePageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBloodPressurePageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getBloodPressurePageIntent(bundle);
        }

        public static /* synthetic */ String getCurseSubTitle$default(IHealthPage iHealthPage, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurseSubTitle");
            }
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return iHealthPage.getCurseSubTitle(j);
        }

        public static /* synthetic */ String getCurseTitle$default(IHealthPage iHealthPage, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurseTitle");
            }
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return iHealthPage.getCurseTitle(j);
        }

        public static /* synthetic */ Intent getHearingPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHearingPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getHearingPageIntent(bundle);
        }

        public static /* synthetic */ Intent getHeartRateDetectionPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHeartRateDetectionPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getHeartRateDetectionPageIntent(bundle);
        }

        public static /* synthetic */ Intent getHeartRatePageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHeartRatePageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getHeartRatePageIntent(bundle);
        }

        public static /* synthetic */ Intent getIntentForRelativeHealthPage$default(IHealthPage iHealthPage, long j, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntentForRelativeHealthPage");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return iHealthPage.getIntentForRelativeHealthPage(j, str, str2);
        }

        public static /* synthetic */ Intent getIntentToCaloriePage$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntentToCaloriePage");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getIntentToCaloriePage(bundle);
        }

        public static /* synthetic */ Intent getMensesPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMensesPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getMensesPageIntent(bundle);
        }

        public static /* synthetic */ Intent getRainbowPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRainbowPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getRainbowPageIntent(bundle);
        }

        public static /* synthetic */ Intent getSleepPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getSleepPageIntent(bundle);
        }

        public static /* synthetic */ Intent getSleepSettingIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepSettingIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getSleepSettingIntent(bundle);
        }

        public static /* synthetic */ Intent getSpo2PageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSpo2PageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getSpo2PageIntent(bundle);
        }

        public static /* synthetic */ Intent getStandPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStandPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getStandPageIntent(bundle);
        }

        public static /* synthetic */ Intent getStepPageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStepPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.getStepPageIntent(bundle);
        }

        public static /* synthetic */ Intent getWeightPageIntent$default(IHealthPage iHealthPage, Bundle bundle, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWeightPageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iHealthPage.getWeightPageIntent(bundle, z);
        }

        public static /* synthetic */ Intent goBloodGlucosePageIntent$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goBloodGlucosePageIntent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.goBloodGlucosePageIntent(bundle);
        }

        public static /* synthetic */ Intent goBloodGlucoseRecordDetailPage$default(IHealthPage iHealthPage, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goBloodGlucoseRecordDetailPage");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            return iHealthPage.goBloodGlucoseRecordDetailPage(bundle);
        }

        public static /* synthetic */ void gotoRelativeHealthFragment$default(IHealthPage iHealthPage, Context context, long j, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoRelativeHealthFragment");
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            iHealthPage.gotoRelativeHealthFragment(context, j, str, str2);
        }
    }

    void addWeightChangeListener(@NotNull Function0<Unit> listener);

    boolean doSendAirEcoIntention(@IntentionType @NotNull int[] intentionType, @NotNull String callSite);

    @NotNull
    Intent getAppHomeIntent();

    @NotNull
    Intent getBloodPressurePageIntent(@Nullable Bundle bundle);

    @Nullable
    Record getCurseLatestPredict();

    @Nullable
    Record getCurseLatestRecord();

    @NotNull
    List<Record> getCursePredictRecords(long startMills, long endMills);

    @NotNull
    List<Record> getCurseRecords(long startMills, long endMills);

    @Nullable
    String getCurseSubTitle(long mills);

    @Nullable
    String getCurseTitle(long mills);

    @NotNull
    String getDataTypeNoDataGuide(@NotNull HomeDataType dataType);

    boolean getGrantPingan();

    @NotNull
    String getHealthDataTypeNameByHomeDataType(@NotNull HomeDataType homeDataType);

    @NotNull
    Pair<Integer, Integer> getHealthItemNameIconResIdPair(@NotNull HomeDataType homeDataType);

    @NotNull
    Intent getHearingPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getHeartRateDetectionPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getHeartRatePageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getIntentForRelativeHealthPage(long relativeUid, @NotNull String relativeNode, @Nullable String origin);

    @NotNull
    Intent getIntentToCaloriePage(@Nullable Bundle bundle);

    @NotNull
    Intent getMensesPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getRainbowPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getSleepPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getSleepSettingIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getSpo2PageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getStandPageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent getStepPageIntent(@Nullable Bundle bundle);

    @NotNull
    List<HomeDataType> getSupportedHomeDataTypesForTrainingIndex();

    @NotNull
    TrainingIndexDataItem getTrainingIndexDataItem(@NotNull HomeDataType homeDataType, @NotNull DailyBasicReport report);

    @NotNull
    Intent getWeightPageIntent(@Nullable Bundle bundle, boolean isFrom8Electrode);

    @NotNull
    MenstrualWidgetEntryList getWidgetProviderEntryList();

    @NotNull
    MenstrualWidgetSampleBrief getWidgetProviderSampleBrief();

    @NotNull
    Intent goBloodGlucosePageIntent(@Nullable Bundle bundle);

    @NotNull
    Intent goBloodGlucoseRecordDetailPage(@Nullable Bundle bundle);

    @NotNull
    Intent goBloodPressureMeasurePage();

    @NotNull
    Intent goHrAndPaceAllRecordPage(@Nullable Bundle bundle);

    void goToHealthVisitDoctorPage(@NotNull Context context, @DepartmentType int deptType);

    void goToTrainingIndexDataPage(long timestamp, @Nullable String did, @NotNull Context context, @NotNull HomeDataType homeDataType, @Nullable ActivityOptions activityOptions);

    void goToTrainingIndexUnderstandPage(@NotNull BaseFragment contextFragment, @NotNull HomeDataType homeDataType);

    void gotoRelativeHealthFragment(@NotNull Context context, long relativeUid, @NotNull String relativeNote, @NotNull String origin);

    void gotoRelativeHrmFragment(@NotNull Context context, long timestamp, long relativeId);

    void gotoRelativeSpo2Fragment(@NotNull Context context, long timestamp, long relativeId);

    void grantAndJumpToPinganRedirectUrl(@NotNull Context context);

    boolean hasPredictData();

    int markCurseStatus(long targetMarkDate, int targetMarkType);

    void notifyAbnormalGlucose(@NotNull BloodSugarItem item, @BloodSugarLevel int level);

    void notifyNewEcgRecordToUser(@NotNull EcgMedicalItemReport ecgReport);

    void notifyWeightChanged();

    void registerAirEcoIntentionHandler();

    void removeWeightChangeListener(@NotNull Function0<Unit> listener);

    void sendRevertIntentionToAirEco(@IntentionType int intentionType, @NotNull String callSite);

    void setPingPanPageUrl(@NotNull String url);

    void showLoginConfirmDialog(@NotNull FragmentActivity activity);

    void showSyncSwitchOpenDialog(@NotNull FragmentActivity activity);

    void syncTemperatureFile(@NotNull String did);

    boolean usedCurse();
}
