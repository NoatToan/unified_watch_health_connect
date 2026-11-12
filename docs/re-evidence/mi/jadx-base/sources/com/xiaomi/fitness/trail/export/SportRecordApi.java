package com.xiaomi.fitness.trail.export;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&J*\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&J*\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0013H&J*\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u001f0\u001e2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019H&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\"2\u0006\u0010#\u001a\u00020$H&J\u001e\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)H&J\u0010\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0013H&J\u0018\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH&¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/trail/export/SportRecordApi;", "", "goSportRecordList", "", "context", "Landroid/content/Context;", "activityOptions", "Landroid/app/ActivityOptions;", "category", "", "tabPosition", "", "(Landroid/content/Context;Landroid/app/ActivityOptions;Ljava/lang/String;Ljava/lang/Integer;)V", "getIntentToSportRecordListPage", "Landroid/content/Intent;", "goSportDetail", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "deviceIsConnect", "", "flag", "goExportTrackActivity", "getTestData", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "goEcoSportBicycleDetail", "it", "getDivePointDetailMapLiveDataByIds", "Landroidx/lifecycle/LiveData;", "", "idList", "downloadResourcesAndGetIfDoneLiveData", "Landroidx/lifecycle/MutableLiveData;", "fragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "checkExternalStoragePermissionIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "callback", "Lkotlin/Function0;", "getSportReportCourseName", "report", "getHrSectionStr", "sectionType", "section", "sport-record-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportRecordApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void goSportDetail$default(SportRecordApi sportRecordApi, Context context, Bundle bundle, SportBasicReport sportBasicReport, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goSportDetail");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            sportRecordApi.goSportDetail(context, bundle, sportBasicReport, z);
        }

        public static /* synthetic */ void goSportRecordList$default(SportRecordApi sportRecordApi, Context context, ActivityOptions activityOptions, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goSportRecordList");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            sportRecordApi.goSportRecordList(context, activityOptions, str, num);
        }
    }

    void checkExternalStoragePermissionIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> callback);

    @NotNull
    MutableLiveData<Boolean> downloadResourcesAndGetIfDoneLiveData(@NotNull BaseFragment fragment);

    @NotNull
    LiveData<Map<Integer, String>> getDivePointDetailMapLiveDataByIds(@NotNull List<Integer> idList);

    @NotNull
    String getHrSectionStr(int sectionType, int section);

    @NotNull
    Intent getIntentToSportRecordListPage();

    @NotNull
    String getSportReportCourseName(@NotNull SportBasicReport report);

    @NotNull
    List<Location> getTestData();

    void goEcoSportBicycleDetail(@NotNull Context context, @NotNull Bundle bundle, @NotNull SportBasicReport it);

    void goExportTrackActivity(@NotNull Context context, @NotNull Bundle bundle);

    void goSportDetail(@NotNull Context context, int flag, @NotNull Bundle bundle, @NotNull SportBasicReport sportReport);

    void goSportDetail(@NotNull Context context, @NotNull Bundle bundle, @Nullable ActivityOptions activityOptions, @NotNull SportBasicReport sportReport);

    void goSportDetail(@NotNull Context context, @NotNull Bundle bundle, @NotNull SportBasicReport sportReport, boolean deviceIsConnect);

    void goSportDetail(@NotNull Context context, @NotNull SportBasicReport sportReport);

    void goSportRecordList(@NotNull Context context, @Nullable ActivityOptions activityOptions, @Nullable String category, @Nullable Integer tabPosition);
}
