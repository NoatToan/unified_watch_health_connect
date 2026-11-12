package pi;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", l = {SyslogConstants.LOG_LOCAL3, 157, PsExtractor.PRIVATE_STREAM_1, 199, 209, 213}, m = "supervise")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f137799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f137800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f137801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f137802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f137803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f137804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qi.e f137805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f137806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f137807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f137808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f137809k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f137808j = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137807i = obj;
        this.f137809k |= Integer.MIN_VALUE;
        return k.b(this.f137808j, null, this);
    }
}
