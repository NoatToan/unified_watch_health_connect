package r53;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "catchImpl")
public final class x<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f150934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150936c;

    public x(t13.d<? super x> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150935b = obj;
        this.f150936c |= Integer.MIN_VALUE;
        return s.h(null, null, this);
    }
}
