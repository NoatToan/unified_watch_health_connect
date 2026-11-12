package com.xiaomi.smarthome.core.server.internal.api;

import android.text.TextUtils;
import com.xiaomi.passport.utils.HttpHeaders;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R(\u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/smarthome/core/server/internal/api/ServiceHaltInterceptor;", "Lokhttp3/Interceptor;", "()V", "pathTimeCache", "", "", "Lkotlin/Pair;", "", "Lokhttp3/Response;", "showToastTime", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "smarthome-network-impl_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ServiceHaltInterceptor implements Interceptor {
    private static final int CODE_SERVICE_HALT = 429;
    private static final ResponseBody ERRORBODY = ResponseBody.create(MediaType.parse(HttpHeaders.CONTENT_TYPE_JSON), "{\"code\":-127,\"message\":\"service down\",\"result\":{}}");
    private static final int MESSAGE_API_LEVEL = -127;

    @NotNull
    private static final String TAG = "ServiceHaltInterceptor";

    @Nullable
    private Map<String, Pair<Long, Response>> pathTimeCache;
    private long showToastTime;

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String strString;
        Pair<Long, Response> pairPut;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String path = request.url().encodedPath();
        Map<String, Pair<Long, Response>> map = this.pathTimeCache;
        Pair<Long, Response> pair = map == null ? null : map.get(path);
        if (pair != null && pair.getFirst().longValue() >= System.currentTimeMillis()) {
            return pair.getSecond();
        }
        Response response = chain.proceed(request);
        if (response.code() == CODE_SERVICE_HALT) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                strString = "";
            }
            try {
                JSONObject jSONObject = new JSONObject(strString);
                if (jSONObject.optInt("code") == MESSAGE_API_LEVEL) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                    Long lValueOf = jSONObjectOptJSONObject != null ? Long.valueOf(jSONObjectOptJSONObject.optLong("wait_second", -1L)) : null;
                    if (lValueOf == null || lValueOf.longValue() == -1) {
                        Intrinsics.checkNotNullExpressionValue(response, "response");
                        return response;
                    }
                    long jLongValue = lValueOf.longValue() * ((long) 1000);
                    response = response.newBuilder().body(ERRORBODY).build();
                    synchronized (this) {
                        try {
                            if (this.pathTimeCache == null) {
                                this.pathTimeCache = new HashMap();
                            }
                            Map<String, Pair<Long, Response>> map2 = this.pathTimeCache;
                            Intrinsics.checkNotNull(map2);
                            Intrinsics.checkNotNullExpressionValue(path, "path");
                            pairPut = map2.put(path, new Pair<>(Long.valueOf(System.currentTimeMillis() + jLongValue), response));
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (pairPut == null) {
                        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "down level url " + ((Object) path) + ' ' + strString);
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("toast_message");
                    if (this.showToastTime + Math.max(jLongValue, 5000L) < System.currentTimeMillis() && !TextUtils.isEmpty(strOptString)) {
                        this.showToastTime = System.currentTimeMillis();
                        ToastUtil.show(MiJiaEnvironment.getAppContext(), strOptString, 0, GlobalHandlerManager.getInstance().getGlobalHandler());
                    }
                }
                Intrinsics.checkNotNullExpressionValue(response, "{\n                val st…          }\n            }");
            } catch (Exception unused) {
                Response.Builder builderNewBuilder = response.newBuilder();
                ResponseBody responseBodyBody2 = response.body();
                Response responseBuild = builderNewBuilder.body(ResponseBody.create(responseBodyBody2 != null ? responseBodyBody2.get$contentType() : null, strString)).build();
                Intrinsics.checkNotNullExpressionValue(responseBuild, "response.newBuilder().bo…tType(), string)).build()");
                return responseBuild;
            }
        } else {
            Map<String, Pair<Long, Response>> map3 = this.pathTimeCache;
            if ((map3 == null ? null : map3.get(path)) != null) {
                ArrayList arrayList = new ArrayList();
                synchronized (this) {
                    try {
                        Map<String, Pair<Long, Response>> map4 = this.pathTimeCache;
                        Intrinsics.checkNotNull(map4);
                        Iterator<Map.Entry<String, Pair<Long, Response>>> it = map4.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, Pair<Long, Response>> next = it.next();
                            if (next.getValue().getFirst().longValue() < System.currentTimeMillis()) {
                                arrayList.add(next.getKey());
                                it.remove();
                            }
                        }
                        Map<String, Pair<Long, Response>> map5 = this.pathTimeCache;
                        Intrinsics.checkNotNull(map5);
                        if (map5.size() == 0) {
                            this.pathTimeCache = null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                LogType logType = LogType.NETWORK;
                StringBuilder sb = new StringBuilder();
                sb.append("remove url ");
                sb.append(arrayList);
                sb.append(' ');
                sb.append(this.pathTimeCache == null);
                MiJiaLog.writeLogOnAll(logType, TAG, sb.toString());
            }
            Intrinsics.checkNotNullExpressionValue(response, "{//服务器返回了正常的code\n       …   response\n            }");
        }
        return response;
    }
}
