package aq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.ThirdPartyUploadsViewModel", f = "ThirdPartyUploadsViewModel.kt", l = {15}, m = "getDataAsync", v = 2)
public final class i3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f12011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j3 j3Var, t13.d<? super i3> dVar) {
        super(dVar);
        this.f12011b = j3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12010a = obj;
        this.f12012c |= Integer.MIN_VALUE;
        return this.f12011b.y4(this);
    }
}
