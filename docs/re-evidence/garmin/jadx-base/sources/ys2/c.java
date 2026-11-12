package ys2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.CompressedFileSender", f = "CompressedFileSender.kt", l = {140}, m = "sendFileChunk")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.p f199199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f199200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f199201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f199202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Closeable f199203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteArrayOutputStream f199204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Closeable f199205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nz2.f f199206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f199207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p0 f199208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p0 f199209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p0 f199210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f199211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f199212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f199213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a f199214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f199215q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f199214p = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199213o = obj;
        this.f199215q |= Integer.MIN_VALUE;
        return this.f199214p.c(0, 0, false, null, this);
    }
}
