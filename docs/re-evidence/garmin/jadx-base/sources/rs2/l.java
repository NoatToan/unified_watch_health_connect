package rs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.GfdiDevice$Companion", f = "GfdiDevice.kt", l = {263, 267, 277}, m = "startCommunication")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public us2.b f154430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f154431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.r f154432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f154433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.a f154434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f154435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i.a aVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f154434e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154433d = obj;
        this.f154435f |= Integer.MIN_VALUE;
        return this.f154434e.d(null, null, null, this);
    }
}
