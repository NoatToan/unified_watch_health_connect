package rs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.GuidMismatchHandler", f = "GuidMismatchHandler.kt", l = {62}, m = "overWriteGuid$gfdi_release")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f154451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f154451b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154450a = obj;
        this.f154452c |= Integer.MIN_VALUE;
        return this.f154451b.a(null, this);
    }
}
