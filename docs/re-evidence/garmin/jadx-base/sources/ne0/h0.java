package ne0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.UpdateDogUseCase", f = "UpdateDogUseCase.kt", l = {41}, m = "updateAnimal", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public je0.f f125470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f125472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f125473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f125472c = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125471b = obj;
        this.f125473d |= Integer.MIN_VALUE;
        return i0.a(this.f125472c, null, false, this);
    }
}
