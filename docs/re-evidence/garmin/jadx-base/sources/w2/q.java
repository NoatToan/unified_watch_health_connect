package w2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q0;
import p006l2.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1137}, m = "detectSelectionHandleDragGestures", v = 1)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f181431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f181432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l1 f181433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f181434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f181435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f181436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f181435e = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181434d = obj;
        this.f181436f |= Integer.MIN_VALUE;
        return n.b(this.f181435e, null, false, this);
    }
}
