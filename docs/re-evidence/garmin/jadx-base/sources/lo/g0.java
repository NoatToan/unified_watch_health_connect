package lo;

import com.google.android.exoplayer2.audio.WavUtil;

/* JADX INFO: loaded from: classes7.dex */
public class g0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var) {
        super(f0Var, 0);
        this.f113864b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113864b;
        ((t) dVar).A6("fluids_loss", f0Var.F0.getButtonTopLabel(), f0Var.c0("fluids_loss"), 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
    }
}
