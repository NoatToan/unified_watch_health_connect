package com.huami.sky.service;

import androidx.annotation.WorkerThread;
import com.huami.sky.entry.SkyCardEntry;
import com.huami.sky.entry.SkySurveyEntry;
import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'¨\u0006\t"}, d2 = {"Lcom/huami/sky/service/SkyCardService;", "", "", WebConstant.QueryParam.LAST_SHOW_AT, "Lcom/huami/sky/entry/SkyCardEntry;", "getSkyCardEntry", "(Ljava/lang/Long;)Lcom/huami/sky/entry/SkyCardEntry;", "Lcom/huami/sky/entry/SkySurveyEntry;", "getSkyQuestionnaireUrl", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public interface SkyCardService {
    @WorkerThread
    @NotNull
    SkyCardEntry getSkyCardEntry(@Nullable Long lastUpgradeInfoShowedAt);

    @WorkerThread
    @Nullable
    SkySurveyEntry getSkyQuestionnaireUrl();
}
