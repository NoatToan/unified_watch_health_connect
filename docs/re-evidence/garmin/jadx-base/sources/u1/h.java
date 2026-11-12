package u1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {688, 720}, m = "applyToFling-BMRW4eQ", v = 1)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f167516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f167518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f167518c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167517b = obj;
        this.f167519d |= Integer.MIN_VALUE;
        return this.f167518c.c(0L, null, this);
    }
}
