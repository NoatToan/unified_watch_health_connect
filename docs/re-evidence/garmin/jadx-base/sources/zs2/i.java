package zs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.fit.FITHandler", f = "FITHandler.kt", l = {244}, m = "send")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f206903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f206905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f206906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f206905c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f206904b = obj;
        this.f206906d |= Integer.MIN_VALUE;
        int i14 = h.f206893f;
        return this.f206905c.a(0, null, this);
    }
}
