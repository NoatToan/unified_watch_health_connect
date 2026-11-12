package o53;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "awaitCancellation")
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f129366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f129367b;

    public l0(t13.d<? super l0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129366a = obj;
        this.f129367b |= Integer.MIN_VALUE;
        return m0.a(this);
    }
}
