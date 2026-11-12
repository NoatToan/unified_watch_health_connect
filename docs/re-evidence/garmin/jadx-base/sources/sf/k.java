package sf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w63.e f158795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f158797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f158798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f158797c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158796b = obj;
        this.f158798d |= Integer.MIN_VALUE;
        return i.b(this.f158797c, null, this);
    }
}
