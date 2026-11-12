package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {822}, m = "updateClipboardEntry$foundation", v = 1)
public final class l2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f201679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f201681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f201682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(h2 h2Var, t13.d<? super l2> dVar) {
        super(dVar);
        this.f201681c = h2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201680b = obj;
        this.f201682d |= Integer.MIN_VALUE;
        return this.f201681c.C(this);
    }
}
