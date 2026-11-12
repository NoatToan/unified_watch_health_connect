package com.huami.sleep.sleephome.repo;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&¨\u0006\u0015"}, d2 = {"Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;", "", "Landroidx/lifecycle/MutableLiveData;", "", "getSyncStatus", "", "index", "", "getSleepLoadingStatus", "getInitSyncStatus", "getInitEditStatus", "Landroidx/lifecycle/LiveData;", "isSummaryAnalysisFinish", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "getSleepPromotionData", "", "initDetailPage", "deinitDetailPage", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepHomeRepo {
    void deinitDetailPage();

    boolean getInitEditStatus();

    @NotNull
    String getInitSyncStatus();

    boolean getSleepLoadingStatus(int index);

    @NotNull
    LiveData<List<SleepPromotionVo>> getSleepPromotionData(@NotNull Context context);

    @NotNull
    MutableLiveData<String> getSyncStatus();

    void initDetailPage();

    @NotNull
    LiveData<Boolean> isSummaryAnalysisFinish();
}
