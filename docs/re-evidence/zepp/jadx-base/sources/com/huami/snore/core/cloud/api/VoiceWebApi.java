package com.huami.snore.core.cloud.api;

import android.content.Context;
import com.huami.android.vo.ApiResponse;
import com.huami.snore.core.cloud.api.request.UploadVoiceDataRequest;
import com.huami.snore.core.cloud.api.response.SnoreDataFindOneResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataFindResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataUploadResponse;
import com.huami.tools.analytics.DbUtils;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&JY\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH&J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH&J\u001c\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0002H&J(\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H&¨\u0006)"}, d2 = {"Lcom/huami/snore/core/cloud/api/VoiceWebApi;", "", "", "fileName", "fileType", "Ljava/io/File;", "file", "Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", WebConst.Param.SNORE_DATA, "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/snore/core/cloud/api/response/SnoreDataUploadResponse;", "uploadInfo", "userId", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/snore/core/cloud/api/response/SnoreDataFindResponse;", "fetchList", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", WebConst.Param.FINDONE, "timestamp", "Lcom/huami/snore/core/cloud/api/response/SnoreDataFindOneResponse;", "findByTime", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "deleteInfo", "startTime", "endTime", "batchDeleteInfo", "url", "downloadZipFile", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/loopj/android/http/AsyncHttpResponseHandler;", "handler", "", "uploadZipfile", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface VoiceWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse fetchList$default(VoiceWebApi voiceWebApi, String str, Long l, Long l2, Long l3, Integer num, Boolean bool, int i, Object obj) {
            if (obj == null) {
                return voiceWebApi.fetchList(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? bool : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchList");
        }
    }

    @NotNull
    ApiResponse<String> batchDeleteInfo(@NotNull String userId, long startTime, long endTime);

    @NotNull
    ApiResponse<String> deleteInfo(@NotNull String userId, long timestamp);

    @Nullable
    File downloadZipFile(@NotNull File file, @Nullable String url);

    @NotNull
    ApiResponse<SnoreDataFindResponse> fetchList(@NotNull String userId, @Nullable Long from, @Nullable Long to, @Nullable Long next, @Nullable Integer limit, @Nullable Boolean reverse);

    @NotNull
    ApiResponse<SnoreDataFindOneResponse> findByTime(@NotNull String userId, @Nullable Boolean findOne, @Nullable Long timestamp);

    @NotNull
    ApiResponse<SnoreDataUploadResponse> uploadInfo(@NotNull String fileName, @NotNull String fileType, @NotNull File file, @NotNull UploadVoiceDataRequest snoreData);

    void uploadZipfile(@NotNull Context context, @NotNull File file, @NotNull String url, @NotNull AsyncHttpResponseHandler handler);
}
