package jf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsViewModel", f = "RunningToleranceReportsViewModel.kt", l = {132}, m = "hasRunningToleranceShownOnHome", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f98709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f98709b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98708a = obj;
        this.f98710c |= Integer.MIN_VALUE;
        return b.x4(this.f98709b, this);
    }
}
