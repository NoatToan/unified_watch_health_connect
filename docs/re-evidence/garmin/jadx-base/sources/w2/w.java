package w2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1577, 1577}, m = "pasteAsPlainText", v = 1)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f181447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f181448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f181449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n nVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f181448b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181447a = obj;
        this.f181449c |= Integer.MIN_VALUE;
        return this.f181448b.z(this);
    }
}
