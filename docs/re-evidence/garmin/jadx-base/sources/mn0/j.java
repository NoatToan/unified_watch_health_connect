package mn0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDetailsUseCase", f = "GetHealthStatusDetailsUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b63.o f119736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f119737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f119738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f119739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f119740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f119741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f119740e = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119739d = obj;
        this.f119741f |= Integer.MIN_VALUE;
        return this.f119740e.a(null, this);
    }
}
