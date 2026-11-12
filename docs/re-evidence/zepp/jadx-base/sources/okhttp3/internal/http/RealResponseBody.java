package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes23.dex */
public final class RealResponseBody extends ResponseBody {

    @Nullable
    private final String b;
    private final long c;
    private final BufferedSource d;

    public RealResponseBody(@Nullable String str, long j, BufferedSource bufferedSource) {
        this.b = str;
        this.c = j;
        this.d = bufferedSource;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.b;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return this.d;
    }
}
