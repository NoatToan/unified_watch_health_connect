package mz1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel", f = "EventDetailsViewModel.kt", l = {944, 947}, m = "submitActivityLinkDTO", v = 2)
public final class e1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f121725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(e0 e0Var, t13.d<? super e1> dVar) {
        super(dVar);
        this.f121727c = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121726b = obj;
        this.f121728d |= Integer.MIN_VALUE;
        return e0.a5(this.f121727c, 0L, null, this);
    }
}
