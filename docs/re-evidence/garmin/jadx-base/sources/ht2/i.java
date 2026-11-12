package ht2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper", f = "InAppUpdateCheckHelper.kt", l = {SyslogConstants.LOG_LOCAL7, 191, 201, 211, 219, 230}, m = "determinePromptType")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f85654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f85655b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85654a = obj;
        this.f85656c |= Integer.MIN_VALUE;
        return this.f85655b.b(null, this);
    }
}
