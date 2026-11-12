package a5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {222, 224}, m = "dispatchPostFling-RZ2iAVY", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f1211b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f1210a = obj;
        this.f1212c |= Integer.MIN_VALUE;
        return this.f1211b.a(0L, 0L, this);
    }
}
