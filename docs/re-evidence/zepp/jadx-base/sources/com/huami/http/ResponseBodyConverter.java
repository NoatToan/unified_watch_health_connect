package com.huami.http;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/http/ResponseBodyConverter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/ResponseBody;", AbstractJSONTokenResponse.RESPONSE, "Ljava/lang/reflect/Type;", "type", "convert", "(Lokhttp3/ResponseBody;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public interface ResponseBodyConverter {
    <T> T convert(@NotNull ResponseBody response, @NotNull Type type);
}
