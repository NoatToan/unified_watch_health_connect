package com.huami.moving.hkwebapi;

import android.content.Context;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.moving.utils.StrenthTrainingKeeper;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002R\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/huami/moving/hkwebapi/StrengthTrainingAPI;", "Lcom/huami/http/HttpKit;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getSportConfigAPI", "", "", "", "params", "a", "Ljava/lang/String;", "TAG", "b", "url", "c", StrengthTrainingAPI.LANGUAGE, "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class StrengthTrainingAPI implements HttpKit {

    @NotNull
    public static final StrengthTrainingAPI INSTANCE = new StrengthTrainingAPI();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "StrengthTrainingAPI";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String url = "sport/config/muscle";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String LANGUAGE = "LANGUAGE";

    private StrengthTrainingAPI() {
    }

    private final Map<String, String> a(Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final void getSportConfigAPI(@NotNull Context context) {
        Object objM3845constructorimpl;
        ResponseBody responseBodyBody;
        String strString;
        String country = Locale.getDefault().getCountry();
        StrengthTrainingAPI strengthTrainingAPI = INSTANCE;
        String runningUrl = HMServerDef.getRunningUrl(url);
        Map<String, ? extends Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(LANGUAGE, Locale.getDefault().getLanguage() + "_" + country);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(strengthTrainingAPI, runningUrl, strengthTrainingAPI.a(systemParams), null, 4, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.i(TAG, "error:" + thM3848exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        if (!Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            HMLog.i(TAG, "isFailure:" + Result.m3850isFailureimpl(objM3845constructorimpl), new Object[0]);
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
        HMLog.i(TAG, "StrengthTrainingAPI body:" + str, new Object[0]);
        StrenthTrainingKeeper.INSTANCE.setStrenthTrainingdData(context, str);
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
