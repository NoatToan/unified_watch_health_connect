package p006l2;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", l = {200}, m = "getContextMenuItemsAvailability", v = 1)
public final class p0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f108696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108698c;

    public p0(d<? super p0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f108697b = obj;
        this.f108698c |= Integer.MIN_VALUE;
        return r0.d(null, this);
    }
}
