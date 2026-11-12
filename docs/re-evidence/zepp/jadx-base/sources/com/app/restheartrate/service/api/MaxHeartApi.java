package com.app.restheartrate.service.api;

import com.app.restheartrate.service.entity.MaxHeartRate;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/app/restheartrate/service/api/MaxHeartApi;", "", "", "date", "Lcom/app/restheartrate/service/entity/MaxHeartRate;", "getHeartRateByDate", "", "list", "", "saveHeartRateData", "Lorg/json/JSONObject;", "getMaxHeartJson", "summaryList", "parseAndSaveMaxHeartFromSummary", "restheartrate-service_release"}, k = 1, mv = {1, 5, 1})
public interface MaxHeartApi {
    @Nullable
    MaxHeartRate getHeartRateByDate(@NotNull String date);

    @Nullable
    JSONObject getMaxHeartJson(@NotNull String date);

    void parseAndSaveMaxHeartFromSummary(@NotNull List<String> summaryList);

    void saveHeartRateData(@Nullable List<MaxHeartRate> list);
}
