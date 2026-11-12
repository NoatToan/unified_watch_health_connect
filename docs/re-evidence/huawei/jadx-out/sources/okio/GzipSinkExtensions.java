package okio;

import com.huawei.openalliance.ad.constant.Constants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, d2 = {Constants.GZIP, "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        zcp.c(sink, "");
        return new GzipSink(sink);
    }
}
