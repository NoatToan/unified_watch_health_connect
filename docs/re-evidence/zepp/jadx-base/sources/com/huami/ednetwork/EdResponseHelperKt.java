package com.huami.ednetwork;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.dev.Logcat;
import java.io.IOException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¨\u0006\u0012"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/Response;", "asEdResponse", "(Lokhttp3/Response;)Ljava/lang/Object;", "", "value", "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "json", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "action", "Lokhttp3/RequestBody;", "requestBody", "Lcom/huami/ednetwork/EdResponse;", "logcat", "ednetwork_release"}, k = 2, mv = {1, 4, 0})
public final class EdResponseHelperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ EdResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EdResponse edResponse) {
            super(0);
            this.a = edResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ednetwork error message: " + this.a.getMessage() + " code:" + this.a.getCode();
        }
    }

    public static final /* synthetic */ <T> T asEdResponse(@NotNull Response response) throws IOException {
        if (!response.isSuccessful() || response.body() == null) {
            int iCode = response.code();
            ResponseBody responseBodyBody = response.body();
            T t = (T) new EdResponse(iCode, responseBodyBody != null ? responseBodyBody.string() : null, null);
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t;
        }
        ResponseBody responseBodyBody2 = response.body();
        if (responseBodyBody2 == null) {
            Intrinsics.throwNpe();
        }
        String strString = responseBodyBody2.string();
        Gson gson = (Gson) LazyKt__LazyJVMKt.lazy(EdResponseHelperKt$fromJson$gson$2.INSTANCE).getValue();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(strString, new TypeToken<T>() { // from class: com.huami.ednetwork.EdResponseHelperKt$asEdResponse$$inlined$fromJson$1
        }.getType());
    }

    public static final /* synthetic */ <T> T fromJson(@NotNull String str) {
        Gson gson = (Gson) LazyKt__LazyJVMKt.lazy(EdResponseHelperKt$fromJson$gson$2.INSTANCE).getValue();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.ednetwork.EdResponseHelperKt.fromJson.1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> EdResponse<T> logcat(@NotNull EdResponse<? extends T> edResponse) {
        if (!edResponse.isSuccessful()) {
            Logcat.i(ConstantKt.TAG, new a(edResponse));
        }
        return edResponse;
    }

    @NotNull
    public static final RequestBody requestBody(@NotNull JSONObject jSONObject, @NotNull Function1<? super JSONObject, Unit> function1) {
        function1.invoke(jSONObject);
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    public static /* synthetic */ RequestBody requestBody$default(JSONObject jSONObject, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = new JSONObject();
        }
        return requestBody(jSONObject, function1);
    }
}
