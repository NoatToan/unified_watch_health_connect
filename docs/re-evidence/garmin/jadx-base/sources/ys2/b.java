package ys2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.CompressedFileSender", f = "CompressedFileSender.kt", l = {213, 228}, m = "sendCompressedData")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f199193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f199194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f199195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f199196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f199197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f199198j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f199197i = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199196h = obj;
        this.f199198j |= Integer.MIN_VALUE;
        a.C3733a c3733a = a.f199179i;
        return this.f199197i.d(0, 0, false, null, 0, false, this);
    }
}
