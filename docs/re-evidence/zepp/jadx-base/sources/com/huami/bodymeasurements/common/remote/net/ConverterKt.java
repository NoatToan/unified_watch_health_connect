package com.huami.bodymeasurements.common.remote.net;

import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKitContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/Response;", "Ljava/lang/reflect/Type;", "type", "deserializeByType", "(Lokhttp3/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "common_release"}, k = 2, mv = {1, 5, 1})
public final class ConverterKt {
    public static final /* synthetic */ <T> T deserializeByType(Response response, Type type) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            com.huami.http.ConverterKt.checkToken(response, com.huami.http.ConverterKt.responseToJsonStr(response));
            if (response.isSuccessful()) {
                return (T) HttpKitContext.INSTANCE.getConverter().convert(response.body(), type);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(null);
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                return null;
            }
            return (T) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }
}
