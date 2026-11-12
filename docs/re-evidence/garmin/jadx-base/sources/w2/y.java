package w2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {537}, m = "startToolbarAndHandlesVisibilityObserver", v = 1)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f181467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f181468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f181469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n nVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f181468b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181467a = obj;
        this.f181469c |= Integer.MIN_VALUE;
        return this.f181468b.E(this);
    }
}
