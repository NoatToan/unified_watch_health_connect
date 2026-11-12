package ey1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel", f = "SetupStrengthTrainingPlanViewModel.kt", l = {742}, m = "initStatesForRestartedSTP", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l22.a f67308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ix1.h f67309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mx1.f f67310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f67311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f67312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f67312e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67311d = obj;
        this.f67313f |= Integer.MIN_VALUE;
        return a.x4(this.f67312e, null, this);
    }
}
