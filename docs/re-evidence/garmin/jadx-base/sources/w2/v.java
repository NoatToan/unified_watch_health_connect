package w2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1544, 1546, 1546}, m = "paste", v = 1)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1.a f181443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f181444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f181445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f181446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n nVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f181445c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181444b = obj;
        this.f181446d |= Integer.MIN_VALUE;
        return this.f181445c.y(this);
    }
}
