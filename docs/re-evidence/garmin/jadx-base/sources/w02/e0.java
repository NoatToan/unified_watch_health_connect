package w02;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.Scroller", f = "ReorderableLazyListState.kt", l = {SyslogConstants.LOG_LOCAL3, 153}, m = "stop", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f181099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f181100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f181101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, t13.d<? super e0> dVar) {
        super(dVar);
        this.f181100b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181099a = obj;
        this.f181101c |= Integer.MIN_VALUE;
        return this.f181100b.d(this);
    }
}
