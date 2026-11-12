package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0001\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00052\u001f\u0010\n\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b¢\u0006\u0002\b\t\u001a \u0010\f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\f\u0010\r\u001aX\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u000e0\u00012:\u0010\u0014\u001a6\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\u001aX\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u000e0\u00012:\u0010\u0016\u001a6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u000f¢\u0006\u0002\b\t\u001aE\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00012%\u0010\u0014\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b\"\u001d\u0010\u001f\u001a\u00020\u001a8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Response;", "", "value", "getMessage", "Lcom/huami/nfc/base/PayResponse;", "toPayResponse", "R", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "data", SportAnalytics.ParamValue.MapButtonType.MAP, "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isSuccessful", TransportUri.ACTION_BLOCK, AbstractJSONTokenResponse.RESPONSE, "action", "responseRaw", "Lorg/json/JSONObject;", "json", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "getGson", "()Lcom/google/gson/Gson;", "gson", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class PayResponseKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    public static final /* synthetic */ <T> T fromJson(String str) {
        Gson gson = getGson();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.nfc.base.PayResponseKt.fromJson.1
        }.getType());
    }

    @NotNull
    public static final Gson getGson() {
        return (Gson) a.getValue();
    }

    @NotNull
    public static final <T> String getMessage(@NotNull Response<T> response, @Nullable String str) {
        return str == null ? response.message() : str;
    }

    @NotNull
    public static final <T, R> PayResponse<R> map(@NotNull PayResponse<? extends T> payResponse, @NotNull Function1<? super PayResponse<? extends T>, ? extends R> function1) {
        return new PayResponse<>(payResponse.getCode(), payResponse.getMessage(), function1.invoke(payResponse));
    }

    @NotNull
    public static final <T> PayResponse<T> response(@NotNull Response<ResponseBody> response, @NotNull Function2<? super Boolean, ? super String, ? extends T> function2) throws IOException {
        String strString = null;
        if (response.isSuccessful()) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                strString = responseBodyBody.string();
            }
        } else {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = responseBodyErrorBody.string();
            }
        }
        return response.isSuccessful() ? new PayResponse<>("0000", getMessage(response, response.message()), function2.invoke(Boolean.TRUE, strString)) : new PayResponse<>(Intrinsics.stringPlus("http", Integer.valueOf(response.code())), getMessage(response, strString), function2.invoke(Boolean.FALSE, strString));
    }

    @NotNull
    public static final <T> PayResponse<T> responseRaw(@NotNull Response<ResponseBody> response, @NotNull Function2<? super Response<ResponseBody>, ? super String, ? extends PayResponse<? extends T>> function2) throws IOException {
        String strString = null;
        if (response.isSuccessful()) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                strString = responseBodyBody.string();
            }
        } else {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = responseBodyErrorBody.string();
            }
        }
        return function2.invoke(response, strString);
    }

    @NotNull
    public static final <T> PayResponse<T> toPayResponse(@NotNull Response<PayResponse<T>> response) {
        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        }
        String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(response.code()));
        ResponseBody responseBodyErrorBody = response.errorBody();
        return new PayResponse<>(strStringPlus, getMessage(response, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
    }

    @NotNull
    public static final <T> PayResponse<T> toPayResponse(@NotNull Response<JSONObject> response, @NotNull Function1<? super JSONObject, ? extends T> function1) {
        if (response.isSuccessful()) {
            return new PayResponse<>("0000", getMessage(response, response.message()), function1.invoke(response.body()));
        }
        String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(response.code()));
        ResponseBody responseBodyErrorBody = response.errorBody();
        return new PayResponse<>(strStringPlus, getMessage(response, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), function1.invoke(response.body()));
    }
}
