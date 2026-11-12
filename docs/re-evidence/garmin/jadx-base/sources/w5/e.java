package w5;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load", v = 1)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f182081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f182082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f182084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f182085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f182086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f182087g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f182086f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f182085e = obj;
        this.f182087g |= Integer.MIN_VALUE;
        return this.f182086f.a(this);
    }
}
