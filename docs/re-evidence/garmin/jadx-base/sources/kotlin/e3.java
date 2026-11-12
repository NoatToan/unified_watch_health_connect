package kotlin;

import ch.qos.logback.core.net.SyslogConstants;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "establishTextInputSession", v = 1)
public final class e3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91170b;

    public e3(d<? super e3> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91169a = obj;
        this.f91170b |= Integer.MIN_VALUE;
        return d3.a(null, null, this);
    }
}
