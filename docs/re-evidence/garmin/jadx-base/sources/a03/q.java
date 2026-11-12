package a03;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.FlexibleSheetState", f = "FlexibleSheetState.kt", l = {149, 150, SyslogConstants.LOG_LOCAL3}, m = "fullyExpand")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f161c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160b = obj;
        this.f162d |= Integer.MIN_VALUE;
        return this.f161c.b(this);
    }
}
