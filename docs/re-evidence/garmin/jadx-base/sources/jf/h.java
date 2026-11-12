package jf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {38}, m = "handle")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wf.f f98649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f98650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f98651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i.a aVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f98651c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98650b = obj;
        this.f98652d |= Integer.MIN_VALUE;
        return this.f98651c.a(null, null, this);
    }
}
