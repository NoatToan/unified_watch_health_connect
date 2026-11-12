package com.huami.ecg.core.web;

import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/ecg/core/web/ResponseLogInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "a", "Ljava/nio/charset/Charset;", UrlUtils.UTF8, "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class ResponseLogInterceptor implements Interceptor {
    private static final String b = "Ecg-Web";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Charset UTF8 = Charset.forName("UTF-8");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;
        public final /* synthetic */ Ref.ObjectRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response, Ref.ObjectRef objectRef) {
            super(0);
            this.a = response;
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "url:" + this.a.request().url() + "\nresponseCode:" + this.a.code() + "\nresponseMessage:" + this.a.message() + "\nbody" + ((String) this.b.element);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        if (responseBodyBody != null) {
            BufferedSource bufferedSourceSource = responseBodyBody.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            objectRef.element = bufferedSourceSource.buffer().clone().readUtf8();
        }
        HMLog.info(b, new a(responseProceed, objectRef));
        return responseProceed;
    }
}
