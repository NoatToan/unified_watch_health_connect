package com.huami.sky.service;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/huami/sky/service/SkyNavigation;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sky/service/SkyPlayFromEvent;", "eventParams", "", "launchSkyMainPage", "launchIntroPage", "launchWebIntroPage", "", "surveyUrl", "launchSurveyPage", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public interface SkyNavigation {
    void launchIntroPage(@NotNull Context context);

    void launchSkyMainPage(@NotNull Context context, @NotNull SkyPlayFromEvent eventParams);

    void launchSurveyPage(@NotNull Context context, @NotNull String surveyUrl);

    void launchWebIntroPage();
}
