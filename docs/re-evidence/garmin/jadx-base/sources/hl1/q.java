package hl1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel", f = "SelectActivityViewModel.kt", l = {99, 102}, m = "getSupportedActivityTypes", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f84457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f84457c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84456b = obj;
        this.f84458d |= Integer.MIN_VALUE;
        return n.x4(this.f84457c, this);
    }
}
