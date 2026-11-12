package o5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy", v = 1)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f129150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f129151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f129151b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129150a = obj;
        this.f129152c |= Integer.MIN_VALUE;
        return this.f129151b.a(0.0f, this);
    }
}
