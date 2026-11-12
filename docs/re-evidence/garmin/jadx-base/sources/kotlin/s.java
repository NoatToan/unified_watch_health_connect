package kotlin;

import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {860}, m = "textInputSession", v = 1)
public final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f91433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, d<? super s> dVar) {
        super(dVar);
        this.f91433b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91432a = obj;
        this.f91434c |= Integer.MIN_VALUE;
        return this.f91433b.s(null, this);
    }
}
