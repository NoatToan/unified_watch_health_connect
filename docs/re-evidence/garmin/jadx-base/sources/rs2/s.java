package rs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.GuidMismatchHandler", f = "GuidMismatchHandler.kt", l = {36}, m = "overwrite")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f154454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f154454b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154453a = obj;
        this.f154455c |= Integer.MIN_VALUE;
        return this.f154454b.b(null, this);
    }
}
