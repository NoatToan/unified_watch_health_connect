package com.huami.http;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.http.bean.CommonTokenBean;
import com.huami.http.exception.IllegalTokenException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0001\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\u00012\u0006\u0010\t\u001a\u00020\u0007\u001a\u0014\u0010\f\u001a\u00020\n*\u00020\u00012\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000e\u001a\u00020\r\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¨\u0006\u000f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/Response;", "deserialize", "(Lokhttp3/Response;)Ljava/lang/Object;", "deserializeOrThrow", "", "checkSuccessfulOrThrow", "", "responseToJsonStr", "json", "", "checkToken", "a", "Ljava/lang/reflect/Type;", "genericType", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class ConverterKt {
    private static final void a(Response response, String str) {
        Function2<Response, String, Boolean> tokenHandler = HttpKitContext.INSTANCE.getTokenHandler();
        boolean z = false;
        if (tokenHandler != null && tokenHandler.invoke(response, str).booleanValue()) {
            z = true;
        }
        if (z) {
            throw new IllegalTokenException(null, null, 3, null);
        }
    }

    public static final boolean checkSuccessfulOrThrow(@NotNull Response response) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(responseToJsonStr(response));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            return true;
        }
        checkToken(response, (String) objM3845constructorimpl);
        return true;
    }

    public static final void checkToken(@NotNull Response response, @NotNull String str) {
        Function1<CommonTokenBean, Unit> mutualLoginHandler;
        Function0<Unit> function0;
        a(response, str);
        try {
            Result.Companion companion = Result.Companion;
            HttpKitContext httpKitContext = HttpKitContext.INSTANCE;
            Map<String, Function0<Unit>> responsePreHandleMap = httpKitContext.getResponsePreHandleMap();
            CommonTokenBean commonTokenBean = (CommonTokenBean) new Gson().fromJson(str, CommonTokenBean.class);
            String code = commonTokenBean.getData().getCode();
            if (responsePreHandleMap.get(code) != null && (function0 = responsePreHandleMap.get(code)) != null) {
                function0.invoke();
            }
            if (Intrinsics.areEqual(code, "0108") && (mutualLoginHandler = httpKitContext.getMutualLoginHandler()) != null) {
                mutualLoginHandler.invoke(commonTokenBean);
            }
            throw new IllegalTokenException(commonTokenBean.getData().getCode(), commonTokenBean.getMessage());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            if (Result.m3850isFailureimpl(objM3845constructorimpl) && (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) instanceof IllegalTokenException)) {
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    throw ((IllegalTokenException) thM3848exceptionOrNullimpl);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.huami.http.exception.IllegalTokenException");
            }
        }
    }

    public static final /* synthetic */ <T> T deserialize(Response response) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            checkToken(response, responseToJsonStr(response));
            if (!response.isSuccessful()) {
                objM3845constructorimpl = Result.m3845constructorimpl(null);
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    return null;
                }
                return (T) objM3845constructorimpl;
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.needClassReification();
            return (T) converter.convert(responseBodyBody, new TypeToken<T>() { // from class: com.huami.http.ConverterKt$deserialize$lambda-0$$inlined$genericType$1
            }.getType());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final /* synthetic */ <T> T deserializeOrThrow(Response response) throws HttpError {
        checkToken(response, responseToJsonStr(response));
        if (!response.isSuccessful()) {
            throw new HttpError(response);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.needClassReification();
        return (T) converter.convert(responseBodyBody, new TypeToken<T>() { // from class: com.huami.http.ConverterKt$deserializeOrThrow$$inlined$genericType$1
        }.getType());
    }

    public static final /* synthetic */ <T> Type genericType() {
        Intrinsics.needClassReification();
        return new TypeToken<T>() { // from class: com.huami.http.ConverterKt.genericType.1
        }.getType();
    }

    @NotNull
    public static final String responseToJsonStr(@NotNull Response response) throws IOException {
        ResponseBody responseBodyBody = response.newBuilder().build().body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        BufferedSource bufferedSourceSource = responseBodyBody.source();
        bufferedSourceSource.request(Long.MAX_VALUE);
        String content = ResponseBodyKtxKt.parseContent(responseBodyBody, response.headers().get("Content-Encoding"), bufferedSourceSource.buffer().clone());
        if (content == null) {
            Intrinsics.throwNpe();
        }
        return content;
    }
}
