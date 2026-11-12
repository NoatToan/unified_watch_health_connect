package com.xiaomi.fitness.watch.face.base;

import android.os.Build;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/base/FaceCommonInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "getFaceHeaderParameter", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceCommonInterceptor implements Interceptor {
    private final String getFaceHeaderParameter() {
        return "_locale=" + Locale.getDefault().getCountry() + "&_language=" + Locale.getDefault().getLanguage() + "&_devtype=1&_ver=" + AppUtil.getVersionName() + "&_model=" + Build.MODEL + "&_osver=" + Build.VERSION.RELEASE + "&_pairos=Android&_buildId=" + Build.ID;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (!StringsKt__StringsKt.contains$default((CharSequence) request.url().host(), (CharSequence) "watch-appstore", false, 2, (Object) null)) {
            return chain.proceed(request);
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        builderNewBuilder.header("watch-appstore-common", getFaceHeaderParameter());
        Headers headers = builderNewBuilder.build().headers();
        StringBuilder sb = new StringBuilder();
        sb.append("intercept: ");
        sb.append(headers);
        return chain.proceed(builderNewBuilder.build());
    }
}
