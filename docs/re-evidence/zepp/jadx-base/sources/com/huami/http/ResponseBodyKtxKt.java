package com.huami.http;

import com.loopj.android.http.AsyncHttpClient;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lokhttp3/ResponseBody;", "", "encoding", "Lokio/Buffer;", "clone", "parseContent", "Ljava/nio/charset/Charset;", "charset", "a", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class ResponseBodyKtxKt {
    private static final String a(Charset charset) {
        String string = charset.toString();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, "[", 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? string : string.substring(iIndexOf$default + 1, string.length() - 1);
    }

    @Nullable
    public static final String parseContent(@NotNull ResponseBody responseBody, @Nullable String str, @NotNull Buffer buffer) {
        Charset charsetForName = Charset.forName("UTF-8");
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (charsetForName = mediaTypeContentType.charset(charsetForName)) == null) {
            Intrinsics.throwNpe();
        }
        if (str == null || !m.equals(str, AsyncHttpClient.ENCODING_GZIP, true)) {
            return (str == null || !m.equals(str, "zlib", true)) ? buffer.readString(charsetForName) : ByteArrayKtxKt.decompressToStringForZlib(buffer.readByteArray(), a(charsetForName));
        }
        return ByteArrayKtxKt.decompressForGzip(buffer.readByteArray(), a(charsetForName));
    }
}
