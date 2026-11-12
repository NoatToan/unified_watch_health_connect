package ne0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.CreateDogUseCase", f = "CreateDogUseCase.kt", l = {41}, m = "createAnimal", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public je0.f f125421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f125423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f125424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f125423c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125422b = obj;
        this.f125424d |= Integer.MIN_VALUE;
        return c.a(this.f125423c, null, false, this);
    }
}
