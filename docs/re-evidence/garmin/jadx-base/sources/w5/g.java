package w5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {314}, m = "loadWithTimeoutOrNull$ui_text", v = 1)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f182108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f182109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f182110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f182111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f182110c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f182109b = obj;
        this.f182111d |= Integer.MIN_VALUE;
        return this.f182110c.c(null, this);
    }
}
