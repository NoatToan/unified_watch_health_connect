package pi;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@v13.e(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "run$suspendImpl")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f137828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f137829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f137831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f137831d = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137830c = obj;
        this.f137832e |= Integer.MIN_VALUE;
        return p.c(this.f137831d, this);
    }
}
