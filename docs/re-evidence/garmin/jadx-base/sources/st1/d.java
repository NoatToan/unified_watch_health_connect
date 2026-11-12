package st1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase", f = "QuitActiveTrainingPlansUseCase.kt", l = {185, 186, 194}, m = "handleKeepMyEvent", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f160877b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160876a = obj;
        this.f160878c |= Integer.MIN_VALUE;
        return c.a(this.f160877b, null, null, this);
    }
}
