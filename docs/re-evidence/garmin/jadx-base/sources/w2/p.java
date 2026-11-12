package w2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {676}, m = "detectCursorHandleDragGestures", v = 1)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f181426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f181427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f181428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f181429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f181430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f181429d = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181428c = obj;
        this.f181430e |= Integer.MIN_VALUE;
        return n.a(this.f181429d, null, this);
    }
}
