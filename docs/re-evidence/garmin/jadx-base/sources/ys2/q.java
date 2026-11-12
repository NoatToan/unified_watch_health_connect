package ys2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.StandardFileSender", f = "StandardFileSender.kt", l = {92}, m = "sendFileChunk")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f199262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f199263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f199264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f199265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f199264f = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199263e = obj;
        this.f199265g |= Integer.MIN_VALUE;
        return this.f199264f.c(0, 0, false, null, this);
    }
}
