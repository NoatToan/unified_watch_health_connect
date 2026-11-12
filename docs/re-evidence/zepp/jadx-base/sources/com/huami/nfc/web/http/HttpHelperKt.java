package com.huami.nfc.web.http;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "asPayResponse", "(Lretrofit2/Response;)Ljava/lang/Object;", "", "value", "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "web_release"}, k = 2, mv = {1, 5, 1})
public final class HttpHelperKt {
    public static final /* synthetic */ <T> T asPayResponse(Response<ResponseBody> response) throws IOException {
        if (response.isSuccessful() && response.body() != null) {
            String strString = response.body().string();
            Gson gson = PayResponseKt.getGson();
            Intrinsics.needClassReification();
            return (T) gson.fromJson(strString, new TypeToken<T>() { // from class: com.huami.nfc.web.http.HttpHelperKt$asPayResponse$$inlined$fromJson$1
            }.getType());
        }
        String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(response.code()));
        ResponseBody responseBodyErrorBody = response.errorBody();
        T t = (T) new PayResponse(strStringPlus, PayResponseKt.getMessage(response, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    public static final /* synthetic */ <T> T fromJson(String str) {
        Gson gson = PayResponseKt.getGson();
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.nfc.web.http.HttpHelperKt.fromJson.1
        }.getType());
    }
}
