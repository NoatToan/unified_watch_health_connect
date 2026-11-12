package a3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La3/g0;", "Lh5/m;", "Lh5/h;", "Lh5/i1;", "La2/i;", "interactionSource", "", "bounded", "Lg6/f;", "radius", "Lo4/j0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(La2/i;ZFLo4/j0;Lkotlin/jvm/internal/j;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 extends h5.m implements h5.h, h5.i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.i f666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.j0 f669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3.a f670g;

    private g0(a2.i iVar, boolean z14, float f14, o4.j0 j0Var) {
        this.f666c = iVar;
        this.f667d = z14;
        this.f668e = f14;
        this.f669f = j0Var;
    }

    @Override // h4.r.c
    public final void onAttach() {
        h5.j1.a(this, new e0(this, 0));
    }

    @Override // h5.i1
    public final void x1() {
        h5.j1.a(this, new e0(this, 0));
    }

    public /* synthetic */ g0(a2.i iVar, boolean z14, float f14, o4.j0 j0Var, p005kotlin.jvm.internal.j jVar) {
        this(iVar, z14, f14, j0Var);
    }
}
