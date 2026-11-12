package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.tools.analytics.internal.function.Function;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.tools.analytics.internal.utils.Crypto;
import com.huami.tools.analytics.internal.utils.JavaUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes15.dex */
class a0 {
    public static final String g = "https://api-analytics-test.huami.com/";
    public static final String h = "https://app-analytics.huami.com/";
    private static final String i = "api/v5/app/collect";
    private static final String j = "api/v5/app/collect_hm";
    private static final String k = "appid";
    private static final String l = "encrypt";
    private static final String m = "dataregion";
    private final String a;
    private OkHttpClient b;
    private volatile boolean c;
    private boolean d;
    private String e;
    private Function<String, String> f;

    public a0(@NonNull OkHttpClient okHttpClient, boolean z, boolean z2, @NonNull String str) {
        this.b = okHttpClient;
        this.c = z;
        this.d = z2;
        this.e = str;
        StringBuilder sb = new StringBuilder();
        sb.append(Const.LOG_TAG_PREFIX);
        sb.append(z2 ? "AnonymousWebRecorder" : "IdentifiedWebRecorder");
        this.a = sb.toString();
    }

    private String b() {
        String strApply;
        if (this.c) {
            strApply = "https://api-analytics-test.huami.com/";
        } else {
            Function<String, String> function = this.f;
            strApply = function != null ? function.apply("https://app-analytics.huami.com/") : null;
            if (strApply == null) {
                strApply = "https://app-analytics.huami.com/";
            }
        }
        return strApply + (this.d ? i : j);
    }

    @NonNull
    @VisibleForTesting
    public String a(d dVar, List<Event> list, boolean z) {
        return EventsToJsonConverter.INSTANCE.convertToJson(dVar, list, z);
    }

    public boolean c(@NonNull d dVar, @NonNull List<Event> list) {
        if (list.isEmpty()) {
            p.b().v(this.a, "无数据，不上传");
            return false;
        }
        String strA = a(dVar, list, this.d);
        if (JavaUtils.isEmpty(strA)) {
            return false;
        }
        return d(b(), strA);
    }

    public boolean d(String str, String str2) {
        return e(str, str2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Request$Builder] */
    /* JADX WARN: Type inference failed for: r0v1 */
    public boolean e(String str, String str2, boolean z) throws Throwable {
        Throwable th;
        boolean z2;
        Response responseExecute;
        IOException e;
        ResponseBody responseBodyBody;
        Response builder = new Request.Builder();
        builder.url(str).header("appid", this.e);
        if (z) {
            String pbkdf2Digest = Crypto.get().getPbkdf2Digest(str2);
            String strBase64Encode = Crypto.base64Encode(str2.getBytes(Crypto.UTF_8));
            builder.header(l, pbkdf2Digest);
            builder.post(RequestBody.create(MediaType.parse("application/json"), strBase64Encode));
        } else {
            builder.post(RequestBody.create(MediaType.parse("application/json"), str2));
        }
        try {
            try {
                responseExecute = FirebasePerfOkHttpClient.execute(this.b.newCall(builder.build()));
                try {
                    z2 = responseExecute.code() == 201;
                    try {
                        if (z2) {
                            p.b().d(this.a, "上传事件成功");
                        } else {
                            ResponseBody responseBodyBody2 = responseExecute.body();
                            p.b().w(this.a, String.format(Locale.CHINA, "上传事件失败, response code: %d, response body: %s, request body size: %s", Integer.valueOf(responseExecute.code()), responseBodyBody2 != null ? responseBodyBody2.string() : null, Integer.valueOf(str2.length())));
                        }
                        ResponseBody responseBodyBody3 = responseExecute.body();
                        if (responseBodyBody3 != null) {
                            responseBodyBody3.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        p.b().w(this.a, e, String.format(Locale.CHINA, "上传事件时发生异常, request body size: %s", Integer.valueOf(str2.length())));
                        if (responseExecute != null && (responseBodyBody3 = responseExecute.body()) != null) {
                        }
                        return z2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
                if (builder != 0 && (responseBodyBody = builder.body()) != null) {
                    responseBodyBody.close();
                }
                throw th;
            }
        } catch (IOException e4) {
            z2 = false;
            responseExecute = null;
            e = e4;
        } catch (Throwable th3) {
            builder = 0;
            th = th3;
            if (builder != 0) {
                responseBodyBody.close();
            }
            throw th;
        }
        return z2;
    }

    public void f(boolean z) {
        this.c = z;
    }

    public void g(@NonNull Function<String, String> function) {
        this.f = function;
    }
}
