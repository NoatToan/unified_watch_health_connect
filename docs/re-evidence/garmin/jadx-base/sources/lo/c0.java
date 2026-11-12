package lo;

import com.google.android.exoplayer2.audio.WavUtil;

/* JADX INFO: loaded from: classes7.dex */
public class c0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var) {
        super(f0Var, 0);
        this.f113719b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113719b;
        ((t) dVar).A6("calories", f0Var.f113807n.getButtonTopLabel(), f0Var.c0("calories"), 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        f0Var.f113810n2 = true;
    }
}
