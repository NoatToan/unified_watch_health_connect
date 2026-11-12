package com.huami.snore.core.cloud.api;

import android.content.Context;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.snore.core.cloud.api.request.UploadVoiceDataRequest;
import com.huami.snore.core.cloud.api.response.SnoreDataFindOneResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataFindResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataUploadResponse;
import com.huami.snore.core.cloud.api.response.SnoreEventsResponse;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.util.ZipUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ5\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/snore/core/cloud/api/RemoteVoiceDataImpl;", "Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;", "", "startTime", "endTime", "", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "syncSnoreData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeStamp", "findSnoreData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteSnoreData", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "filePath", "Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", "data", "Lcom/loopj/android/http/AsyncHttpResponseHandler;", "handler", "uploadSnoreData", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "snoreFile", "url", "downloadFile", "Lcom/huami/snore/core/cloud/api/VoiceWebApi;", "a", "Lcom/huami/snore/core/cloud/api/VoiceWebApi;", "webApi", "b", "Ljava/lang/String;", "mTag", "<init>", "(Lcom/huami/snore/core/cloud/api/VoiceWebApi;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class RemoteVoiceDataImpl implements RemoteVoiceDataApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "RemoteSnoreData";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load from server, startTime: " + this.a + "  endTime:  " + this.b;
        }
    }

    public RemoteVoiceDataImpl(@NotNull VoiceWebApi voiceWebApi) {
        this.webApi = voiceWebApi;
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public Object deleteSnoreData(@Nullable Long l, @NotNull Continuation<? super Unit> continuation) {
        if (l == null) {
            l = null;
        } else {
            l.longValue();
            this.webApi.deleteInfo(KoinExtKt.getUserInfo().getUserId(), l.longValue());
        }
        return l == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? l : Unit.INSTANCE;
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public File downloadFile(@NotNull File snoreFile, @Nullable String url) {
        if (!snoreFile.getParentFile().exists()) {
            snoreFile.getParentFile().mkdirs();
        }
        if (snoreFile.exists()) {
            snoreFile.delete();
        }
        return this.webApi.downloadZipFile(snoreFile, url);
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public Object findSnoreData(long j, @NotNull Continuation<? super SnoreEventsResponse> continuation) {
        ApiResponse<SnoreDataFindOneResponse> apiResponseFindByTime = this.webApi.findByTime(KoinExtKt.getUserInfo().getUserId(), Boxing.boxBoolean(true), Boxing.boxLong(j));
        if (apiResponseFindByTime instanceof ApiSuccessResponse) {
            return ((SnoreDataFindOneResponse) ((ApiSuccessResponse) apiResponseFindByTime).getBody()).getData();
        }
        return null;
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public Object syncSnoreData(long j, long j2, @NotNull Continuation<? super List<SnoreEventsResponse>> continuation) {
        HMLog.info(this.mTag, new a(j, j2));
        ApiResponse apiResponseFetchList$default = VoiceWebApi.DefaultImpls.fetchList$default(this.webApi, KoinExtKt.getUserInfo().getUserId(), Boxing.boxLong(j), Boxing.boxLong(j2), null, null, null, 56, null);
        return apiResponseFetchList$default instanceof ApiSuccessResponse ? ((SnoreDataFindResponse) ((ApiSuccessResponse) apiResponseFetchList$default).getBody()).getItems() : CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public Object uploadSnoreData(@NotNull Context context, @Nullable String str, @NotNull UploadVoiceDataRequest uploadVoiceDataRequest, @NotNull AsyncHttpResponseHandler asyncHttpResponseHandler, @NotNull Continuation<? super String> continuation) {
        if (str == null || str.length() == 0) {
            return "";
        }
        File fileZip = ZipUtil.zip(new File(str));
        ApiResponse<SnoreDataUploadResponse> apiResponseUploadInfo = this.webApi.uploadInfo(fileZip.getName(), WebConst.FileType.TYPE_SNORE, fileZip, uploadVoiceDataRequest);
        if (!(apiResponseUploadInfo instanceof ApiSuccessResponse)) {
            return "";
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseUploadInfo;
        this.webApi.uploadZipfile(context, fileZip, ((SnoreDataUploadResponse) apiSuccessResponse.getBody()).getPutURI(), asyncHttpResponseHandler);
        return ((SnoreDataUploadResponse) apiSuccessResponse.getBody()).getGetURI();
    }

    @Override // com.huami.snore.core.cloud.api.RemoteVoiceDataApi
    @Nullable
    public Object deleteSnoreData(long j, long j2, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.webApi.batchDeleteInfo(KoinExtKt.getUserInfo().getUserId(), j, j2) instanceof ApiSuccessResponse);
    }
}
