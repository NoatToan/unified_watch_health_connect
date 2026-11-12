package com.huami.pai_service;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\f"}, d2 = {"Lcom/huami/pai_service/PaiOutService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/flow/Flow;", "", "isPaiEnabled", "", "openPaiSetting", "", "lastUpdatedTime", "getPaiEnabled", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public interface PaiOutService {
    @WorkerThread
    boolean getPaiEnabled(@NotNull Context context);

    @NotNull
    Flow<Boolean> isPaiEnabled(@NotNull Context context);

    long lastUpdatedTime();

    void openPaiSetting(@NotNull Context context);
}
