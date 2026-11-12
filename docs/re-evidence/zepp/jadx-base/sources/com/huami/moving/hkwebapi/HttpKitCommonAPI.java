package com.huami.moving.hkwebapi;

import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002J,\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/moving/hkwebapi/HttpKitCommonAPI;", "Lcom/huami/http/HttpKit;", "", "url", "", "trackId", "source", "Lcom/huami/moving/hkwebapi/HttpKitCommonAPI$DeleteHistoryRecordListener;", "deleteListener", "", "deleteHistoryRecordAPI", "resp", "c", "", "", "params", "b", "Lcom/huami/moving/hkwebapi/HttpKitCommonAPI$PutRequestListener;", "putSummaryListener", "putRequestAPI", "Lokhttp3/FormBody$Builder;", "a", "TRACK_ID", "Ljava/lang/String;", "SOURCE", "RESPONSE_CODE", "", "Z", "isDeleteSuccess", "<init>", "()V", "DeleteHistoryRecordListener", "PutRequestListener", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class HttpKitCommonAPI implements HttpKit {

    @NotNull
    public static final HttpKitCommonAPI INSTANCE = new HttpKitCommonAPI();

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String TRACK_ID = "trackid";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String RESPONSE_CODE = "code";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean isDeleteSuccess;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/moving/hkwebapi/HttpKitCommonAPI$DeleteHistoryRecordListener;", "", "", "isDeleteSuccess", "", "trackId", "", "source", "", "fetchTrackRecordSuccessListener", "(Ljava/lang/Boolean;JLjava/lang/String;)V", "isConnected", "fetchNetErrorListener", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface DeleteHistoryRecordListener {
        void fetchNetErrorListener(boolean isConnected);

        void fetchTrackRecordSuccessListener(@Nullable Boolean isDeleteSuccess, long trackId, @Nullable String source);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/hkwebapi/HttpKitCommonAPI$PutRequestListener;", "", "", "requestSuccessListener", "requestErrorListener", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface PutRequestListener {
        void requestErrorListener();

        void requestSuccessListener();
    }

    private HttpKitCommonAPI() {
    }

    private final FormBody.Builder a(Map<String, ? extends Object> params) {
        FormBody.Builder builder = new FormBody.Builder();
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            builder.add(entry.getKey(), entry.getValue().toString());
        }
        return builder;
    }

    private final Map<String, String> b(Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private final void c(String resp) {
        try {
            boolean z = true;
            if (new JSONObject(resp).getInt("code") != 1) {
                z = false;
            }
            isDeleteSuccess = z;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    public static final void deleteHistoryRecordAPI(@NotNull String url, long trackId, @NotNull String source, @NotNull DeleteHistoryRecordListener deleteListener) {
        Object objM3845constructorimpl;
        ResponseBody responseBodyBody;
        String strString;
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        HttpKitCommonAPI httpKitCommonAPI = INSTANCE;
        systemParams.put("trackid", String.valueOf(trackId));
        systemParams.put("source", source);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpDelete$default(httpKitCommonAPI, url, null, httpKitCommonAPI.b(systemParams), null, 10, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            deleteListener.fetchNetErrorListener(true);
        }
        if (!Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            deleteListener.fetchNetErrorListener(false);
            return;
        }
        String str = null;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Response response = (Response) objM3845constructorimpl;
        if (response != null && (responseBodyBody = response.body()) != null && (strString = responseBodyBody.string()) != null && (!m.isBlank(strString))) {
            str = strString;
        }
        INSTANCE.c(str);
        deleteListener.fetchTrackRecordSuccessListener(Boolean.valueOf(isDeleteSuccess), trackId, source);
    }

    @JvmStatic
    public static final void putRequestAPI(@NotNull String url, @NotNull Map<String, ? extends Object> params, @NotNull PutRequestListener putSummaryListener) {
        Object objM3845constructorimpl;
        HttpKitCommonAPI httpKitCommonAPI = INSTANCE;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPut$default(httpKitCommonAPI, url, httpKitCommonAPI.a(params).build(), null, null, 12, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            putSummaryListener.requestErrorListener();
        }
        if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            putSummaryListener.requestSuccessListener();
        } else {
            putSummaryListener.requestErrorListener();
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
