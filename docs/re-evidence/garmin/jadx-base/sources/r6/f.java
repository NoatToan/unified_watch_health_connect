package r6;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class f extends q6.d {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public t6.g f150974n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public HashMap<String, Float> f150975o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public HashMap<String, Float> f150976p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public HashMap<String, Float> f150977q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f150978r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f150979s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f150980t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f150981u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f150982v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f150983w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f150984x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f150985y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f150986z0;

    public f(q6.g gVar, q6.g.d dVar) {
        super(gVar, dVar);
        this.f150978r0 = 0;
        this.f150979s0 = -1;
        this.f150980t0 = -1;
        this.f150981u0 = -1;
        this.f150982v0 = -1;
        this.f150983w0 = -1;
        this.f150984x0 = -1;
        this.f150985y0 = 2;
        this.f150986z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (dVar == q6.g.d.VERTICAL_FLOW) {
            this.H0 = 1;
        }
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        s();
        c(this.f150974n0);
        t6.g gVar = this.f150974n0;
        gVar.f162660b1 = this.H0;
        gVar.Z0 = this.f150978r0;
        int i14 = this.G0;
        if (i14 != -1) {
            gVar.f162659a1 = i14;
        }
        int i15 = this.C0;
        if (i15 != 0) {
            gVar.C0 = i15;
        }
        int i16 = this.E0;
        if (i16 != 0) {
            gVar.f162693y0 = i16;
        }
        int i17 = this.D0;
        if (i17 != 0) {
            gVar.D0 = i17;
        }
        int i18 = this.F0;
        if (i18 != 0) {
            gVar.f162694z0 = i18;
        }
        int i19 = this.B0;
        if (i19 != 0) {
            gVar.V0 = i19;
        }
        int i24 = this.A0;
        if (i24 != 0) {
            gVar.W0 = i24;
        }
        float f14 = this.f143031h;
        if (f14 != 0.5f) {
            gVar.P0 = f14;
        }
        float f15 = this.K0;
        if (f15 != 0.5f) {
            gVar.R0 = f15;
        }
        float f16 = this.L0;
        if (f16 != 0.5f) {
            gVar.T0 = f16;
        }
        float f17 = this.f143033i;
        if (f17 != 0.5f) {
            gVar.Q0 = f17;
        }
        float f18 = this.I0;
        if (f18 != 0.5f) {
            gVar.S0 = f18;
        }
        float f19 = this.J0;
        if (f19 != 0.5f) {
            gVar.U0 = f19;
        }
        int i25 = this.f150986z0;
        if (i25 != 2) {
            gVar.X0 = i25;
        }
        int i26 = this.f150985y0;
        if (i26 != 2) {
            gVar.Y0 = i26;
        }
        int i27 = this.f150979s0;
        if (i27 != -1) {
            gVar.K0 = i27;
        }
        int i28 = this.f150980t0;
        if (i28 != -1) {
            gVar.M0 = i28;
        }
        int i29 = this.f150981u0;
        if (i29 != -1) {
            gVar.O0 = i29;
        }
        int i30 = this.f150982v0;
        if (i30 != -1) {
            gVar.J0 = i30;
        }
        int i34 = this.f150983w0;
        if (i34 != -1) {
            gVar.L0 = i34;
        }
        int i35 = this.f150984x0;
        if (i35 != -1) {
            gVar.N0 = i35;
        }
        r();
    }

    @Override // q6.d
    public final t6.i s() {
        if (this.f150974n0 == null) {
            this.f150974n0 = new t6.g();
        }
        return this.f150974n0;
    }
}
