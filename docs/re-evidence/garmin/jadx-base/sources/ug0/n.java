package ug0;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.viewable.ViewableAccountsViewModel", f = "ViewableAccountsViewModel.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "getCachedUserProfileFrameData", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f170599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f170600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f170601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f170602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f170603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f170602d = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170601c = obj;
        this.f170603e |= Integer.MIN_VALUE;
        return this.f170602d.y4(null, this);
    }
}
