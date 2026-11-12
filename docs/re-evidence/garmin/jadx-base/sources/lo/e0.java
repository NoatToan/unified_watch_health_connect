package lo;

import com.google.android.exoplayer2.audio.WavUtil;

/* JADX INFO: loaded from: classes7.dex */
public class e0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var) {
        super(f0Var, 0);
        this.f113731b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113731b;
        ((t) dVar).A6("calories_consumed", f0Var.D0.getButtonTopLabel(), f0Var.c0("calories_consumed"), 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        f0Var.f113810n2 = true;
    }
}
