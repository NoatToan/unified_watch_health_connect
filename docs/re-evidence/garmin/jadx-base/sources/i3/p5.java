package i3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li3/p5;", "Lh5/m;", "Lh5/h;", "Lh5/i1;", "La2/i;", "interactionSource", "", "bounded", "Lg6/f;", "radius", "Lo4/j0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(La2/i;ZFLo4/j0;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p5 extends h5.m implements h5.h, h5.i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.i f89273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f89274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f89275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.j0 f89276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3.a f89277g;

    private p5(a2.i iVar, boolean z14, float f14, o4.j0 j0Var) {
        this.f89273c = iVar;
        this.f89274d = z14;
        this.f89275e = f14;
        this.f89276f = j0Var;
    }

    @Override // h4.r.c
    public final void onAttach() {
        h5.j1.a(this, new n5(this, 0));
    }

    @Override // h5.i1
    public final void x1() {
        h5.j1.a(this, new n5(this, 0));
    }

    public /* synthetic */ p5(a2.i iVar, boolean z14, float f14, o4.j0 j0Var, p005kotlin.jvm.internal.j jVar) {
        this(iVar, z14, f14, j0Var);
    }
}
