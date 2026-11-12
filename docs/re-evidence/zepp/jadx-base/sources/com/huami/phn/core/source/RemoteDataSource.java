package com.huami.phn.core.source;

import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.webapi.RemoteResult;
import com.huami.phn.core.webapi.impl.PHNInitWebApiImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J-\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\bH&¨\u0006\u0018"}, d2 = {"Lcom/huami/phn/core/source/RemoteDataSource;", "", "", "jsonData", PHNInitWebApiImpl.PARAM_PHN_ALGO_VERSION, "Lcom/huami/phn/core/model/PHNProjectRecord;", "postPHNInit", "Lcom/huami/phn/core/webapi/RemoteResult;", "", "getPHNProjectRecord", "record", "", "pushPHNProjectRecord", "records", "", "queryTime", "", "limitSize", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "getPHNDailyAnalysis", "(Ljava/lang/Long;I)Lcom/huami/phn/core/webapi/RemoteResult;", "result", "pushPHNDailyAnalysis", "results", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface RemoteDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static RemoteResult<Boolean> pushPHNDailyAnalysis(@NotNull RemoteDataSource remoteDataSource, @NotNull PHNDailyAnalysisResult pHNDailyAnalysisResult) {
            return remoteDataSource.pushPHNDailyAnalysis(e.listOf(pHNDailyAnalysisResult));
        }

        @NotNull
        public static RemoteResult<Boolean> pushPHNProjectRecord(@NotNull RemoteDataSource remoteDataSource, @NotNull PHNProjectRecord pHNProjectRecord) {
            return remoteDataSource.pushPHNProjectRecord(e.listOf(pHNProjectRecord));
        }
    }

    @NotNull
    RemoteResult<List<PHNDailyAnalysisResult>> getPHNDailyAnalysis(@Nullable Long queryTime, int limitSize);

    @NotNull
    RemoteResult<List<PHNProjectRecord>> getPHNProjectRecord();

    @NotNull
    PHNProjectRecord postPHNInit(@NotNull String jsonData, @NotNull String algoVersion);

    @NotNull
    RemoteResult<Boolean> pushPHNDailyAnalysis(@NotNull PHNDailyAnalysisResult result);

    @NotNull
    RemoteResult<Boolean> pushPHNDailyAnalysis(@NotNull List<PHNDailyAnalysisResult> results);

    @NotNull
    RemoteResult<Boolean> pushPHNProjectRecord(@NotNull PHNProjectRecord record);

    @NotNull
    RemoteResult<Boolean> pushPHNProjectRecord(@NotNull List<PHNProjectRecord> records);
}
