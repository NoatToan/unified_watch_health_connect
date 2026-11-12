package kotlin;

import ch.qos.logback.core.net.SyslogConstants;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {SyslogConstants.LOG_LOCAL7, 186}, m = "interceptedTextInputSession", v = 1)
public final class f3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91184b;

    public f3(d<? super f3> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91183a = obj;
        this.f91184b |= Integer.MIN_VALUE;
        return d3.b(null, null, null, this);
    }
}
