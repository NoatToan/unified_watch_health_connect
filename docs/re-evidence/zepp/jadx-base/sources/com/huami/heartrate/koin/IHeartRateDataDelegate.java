package com.huami.heartrate.koin;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.huami.heartrate.Platform;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.tools.analytics.DbUtils;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\fH&J \u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH&J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u001e\u001a\u00020\u0007H&J\n\u0010 \u001a\u0004\u0018\u00010\u001fH&J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H&J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0011\u0010$\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b$\u0010%J.\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010(0\"2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006+"}, d2 = {"Lcom/huami/heartrate/koin/IHeartRateDataDelegate;", "", "Lcom/huami/heartrate/Platform;", "getPlatform", "", "dayFrom", "dayEnd", "", "userId", "", "", "getWholeDayHeartRateData", "", "isShowRestingHRItem", "date", "", "queryRestHeartRateByDay", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "userAge", "selectedDateTimeInMillis", "", "launchRestingHRActivity", "isSupportAtrialFib", "Landroidx/fragment/app/Fragment;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "item", "deleteRequestCode", "launchHeartRateDetailActivityForResult", "isOpenWholeDayHr", "getAppName", "Ljava/util/Calendar;", "getSyncTime", "preLoadAllData", "Lkotlinx/coroutines/flow/Flow;", "observeWholeDayHrDataChanged", "isWatchName", "()Ljava/lang/Boolean;", "dateFrom", "dateEnd", "", "Lcom/huami/heartrate/dto/RestingHeartRate;", "fetchRestingHeartRate", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateDataDelegate {
    @NotNull
    Flow<List<RestingHeartRate>> fetchRestingHeartRate(long dateFrom, long dateEnd, @NotNull String userId);

    @NotNull
    String getAppName();

    @NotNull
    Platform getPlatform();

    @Nullable
    Calendar getSyncTime();

    @Nullable
    Map<String, byte[]> getWholeDayHeartRateData(long dayFrom, long dayEnd, @NotNull String userId);

    boolean isOpenWholeDayHr(@NotNull Context context);

    boolean isShowRestingHRItem();

    boolean isSupportAtrialFib();

    @Nullable
    Boolean isWatchName();

    void launchHeartRateDetailActivityForResult(@NotNull Fragment context, @NotNull HeartRateEntity item, int deleteRequestCode);

    void launchRestingHRActivity(@NotNull Context context, @NotNull String userId, int userAge, long selectedDateTimeInMillis);

    @NotNull
    Flow<Boolean> observeWholeDayHrDataChanged(@NotNull String date, @NotNull String userId);

    void preLoadAllData(@NotNull String userId);

    int queryRestHeartRateByDay(@NotNull String date, @NotNull String userId);
}
