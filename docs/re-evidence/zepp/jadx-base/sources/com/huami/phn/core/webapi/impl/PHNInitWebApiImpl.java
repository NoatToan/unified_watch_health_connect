package com.huami.phn.core.webapi.impl;

import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.phn.core.webapi.PHNInitWebApi;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/phn/core/webapi/impl/PHNInitWebApiImpl;", "Lcom/huami/phn/core/webapi/PHNInitWebApi;", "Lcom/huami/http/HttpKit;", "", "jsonData", PHNInitWebApiImpl.PARAM_PHN_ALGO_VERSION, "postPHNInitData", "<init>", "()V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNInitWebApiImpl implements PHNInitWebApi, HttpKit {

    @NotNull
    public static final String PARAM_JSON_ROOT = "data";

    @NotNull
    public static final String PARAM_PHN_ALGO_VERSION = "algoVersion";

    @NotNull
    public static final String PARAM_PHN_QUEST_FORM = "quest_form";

    @NotNull
    public static final String PARAM_PHN_SETTING = "setting";

    @NotNull
    public static final String TAG = "PHNInitWebApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a.getMessage());
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

    @Override // com.huami.phn.core.webapi.PHNInitWebApi
    @NotNull
    public String postPHNInitData(@NotNull String jsonData, @NotNull String algoVersion) {
        String strString;
        HMLog.i(TAG, "gaobq postPHNInitData", new Object[0]);
        try {
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, "v1/phn/init", RequestBody.create(MediaType.parse("application/json"), new JSONObject(jsonData).getJSONObject("data").toString()), q.mapOf(TuplesKt.to(PARAM_PHN_ALGO_VERSION, algoVersion)), null, 8, null);
            HMLog.i(TAG, "gaobq resp:" + responseHttpPost$default, new Object[0]);
            ResponseBody responseBodyBody = responseHttpPost$default.body();
            return (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
        } catch (Exception e) {
            HMLog.warn$default(null, null, new a(e), 3, null);
            return "";
        }
    }
}
