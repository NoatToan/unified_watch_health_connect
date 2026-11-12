package com.huami.apm.prod.service;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/huami/apm/prod/service/ApmApi;", "Lcom/huami/apm/prod/service/AbstractApmApi;", "", "", "", "params", "", "setupEnv", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "userId", "setUserId", "apm-prod-service_release"}, k = 1, mv = {1, 5, 1})
public interface ApmApi extends AbstractApmApi {
    void disable(@NotNull Context context);

    void enable(@NotNull Context context);

    void setUserId(@Nullable String userId);

    void setupEnv(@NotNull Map<String, ? extends Object> params);
}
