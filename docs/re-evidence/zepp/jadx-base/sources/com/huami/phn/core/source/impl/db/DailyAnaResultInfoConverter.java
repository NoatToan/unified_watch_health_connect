package com.huami.phn.core.source.impl.db;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/phn/core/source/impl/db/DailyAnaResultInfoConverter;", "", "", "value", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "jsonString2Object", "objectToJsonString", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DailyAnaResultInfoConverter {
    @TypeConverter
    @Nullable
    public final PHNDailyAnalysisResult.DailyAnaResultInfo jsonString2Object(@NotNull String value) {
        return (PHNDailyAnalysisResult.DailyAnaResultInfo) new Gson().fromJson(value, PHNDailyAnalysisResult.DailyAnaResultInfo.class);
    }

    @TypeConverter
    @Nullable
    public final String objectToJsonString(@Nullable PHNDailyAnalysisResult.DailyAnaResultInfo value) {
        return new Gson().toJson(value);
    }
}
