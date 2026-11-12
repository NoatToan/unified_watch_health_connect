package com.huami.sky.service;

import android.content.Context;
import com.huami.sky.entry.SkySurveyState;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/service/SkySurveyService;", "", "Lcom/huami/sky/entry/SkySurveyState;", "state", "", "notifyState", "Lkotlinx/coroutines/flow/Flow;", "listenSkySurveyState", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "launchSurveyPage", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public interface SkySurveyService {
    void launchSurveyPage(@NotNull Context context);

    @NotNull
    Flow<SkySurveyState> listenSkySurveyState();

    void notifyState(@NotNull SkySurveyState state);
}
