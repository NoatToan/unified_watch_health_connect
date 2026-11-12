package com.huami.assistant;

import android.content.Context;
import com.huami.assistant.dataexchange.IExchange;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0002H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u0014"}, d2 = {"Lcom/huami/assistant/IAssistantModule;", "", "", "isBleDevice", "Lcom/huami/assistant/dataexchange/IExchange;", "getExchange", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isDeviceConnected", "isSupportAlarm", "", "getAlarmCountLimit", "isSupportEvent", "isSupportPin", "isSupportFlight", "isSupportUpdates", "isOverSeaSchedule", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "getScheduleApi", "getCurrentSource", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface IAssistantModule {
    int getAlarmCountLimit(@NotNull Context context);

    int getCurrentSource(@NotNull Context context);

    @NotNull
    IExchange getExchange();

    @Nullable
    ScheduleRpcApi getScheduleApi();

    boolean isBleDevice();

    boolean isDeviceConnected(@NotNull Context context);

    boolean isOverSeaSchedule();

    boolean isSupportAlarm(@NotNull Context context);

    boolean isSupportEvent(@NotNull Context context);

    boolean isSupportFlight(@NotNull Context context);

    boolean isSupportPin(@NotNull Context context);

    boolean isSupportUpdates(@NotNull Context context);
}
