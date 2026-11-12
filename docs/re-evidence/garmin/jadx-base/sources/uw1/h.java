package uw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.network.TrainingPlansRepo", f = "TrainingPlansRepo.kt", l = {21}, m = "getTrainingPlans", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f173012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f173013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f173014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f173013b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173012a = obj;
        this.f173014c |= Integer.MIN_VALUE;
        return this.f173013b.b(this);
    }
}
