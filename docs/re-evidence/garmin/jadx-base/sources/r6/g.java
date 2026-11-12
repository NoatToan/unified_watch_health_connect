package r6;

/* JADX INFO: loaded from: classes.dex */
public class g extends q6.d {
    public String A0;
    public int B0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public s6.a f150987n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f150988o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f150989p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f150990q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f150991r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f150992s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f150993t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f150994u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f150995v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f150996w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f150997x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f150998y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f150999z0;

    public g(q6.g gVar, q6.g.d dVar) {
        super(gVar, dVar);
        this.f150988o0 = 0;
        this.f150989p0 = 0;
        this.f150990q0 = 0;
        this.f150991r0 = 0;
        if (dVar == q6.g.d.ROW) {
            this.f150993t0 = 1;
        } else if (dVar == q6.g.d.COLUMN) {
            this.f150994u0 = 1;
        }
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        s();
        s6.a aVar = this.f150987n0;
        int i14 = this.f150992s0;
        aVar.getClass();
        if ((i14 == 0 || i14 == 1) && aVar.W0 != i14) {
            aVar.W0 = i14;
        }
        int i15 = this.f150993t0;
        if (i15 != 0) {
            s6.a aVar2 = this.f150987n0;
            if (i15 > 50) {
                aVar2.getClass();
            } else if (aVar2.N0 != i15) {
                aVar2.N0 = i15;
                aVar2.n0();
                aVar2.j0();
            }
        }
        int i16 = this.f150994u0;
        if (i16 != 0) {
            s6.a aVar3 = this.f150987n0;
            if (i16 > 50) {
                aVar3.getClass();
            } else if (aVar3.P0 != i16) {
                aVar3.P0 = i16;
                aVar3.n0();
                aVar3.j0();
            }
        }
        float f14 = this.f150995v0;
        if (f14 != 0.0f) {
            s6.a aVar4 = this.f150987n0;
            if (f14 < 0.0f) {
                aVar4.getClass();
            } else if (aVar4.Q0 != f14) {
                aVar4.Q0 = f14;
            }
        }
        float f15 = this.f150996w0;
        if (f15 != 0.0f) {
            s6.a aVar5 = this.f150987n0;
            if (f15 < 0.0f) {
                aVar5.getClass();
            } else if (aVar5.R0 != f15) {
                aVar5.R0 = f15;
            }
        }
        String str = this.f150997x0;
        if (str != null && !str.isEmpty()) {
            s6.a aVar6 = this.f150987n0;
            String str2 = this.f150997x0;
            String str3 = aVar6.S0;
            if (str3 == null || !str3.equals(str2)) {
                aVar6.S0 = str2;
            }
        }
        String str4 = this.f150998y0;
        if (str4 != null && !str4.isEmpty()) {
            s6.a aVar7 = this.f150987n0;
            String str5 = this.f150998y0;
            String str6 = aVar7.T0;
            if (str6 == null || !str6.equals(str5)) {
                aVar7.T0 = str5;
            }
        }
        String str7 = this.f150999z0;
        if (str7 != null && !str7.isEmpty()) {
            s6.a aVar8 = this.f150987n0;
            String str8 = this.f150999z0;
            String str9 = aVar8.U0;
            if (str9 == null || !str9.equals(str8.toString())) {
                aVar8.L0 = false;
                aVar8.U0 = str8.toString();
            }
        }
        String str10 = this.A0;
        if (str10 != null && !str10.isEmpty()) {
            s6.a aVar9 = this.f150987n0;
            String str11 = this.A0;
            String str12 = aVar9.V0;
            if (str12 == null || !str12.equals(str11)) {
                aVar9.L0 = false;
                aVar9.V0 = str11;
            }
        }
        s6.a aVar10 = this.f150987n0;
        aVar10.f157610b1 = this.B0;
        int i17 = this.f150988o0;
        aVar10.A0 = i17;
        aVar10.C0 = i17;
        aVar10.D0 = i17;
        aVar10.B0 = this.f150989p0;
        aVar10.f162693y0 = this.f150990q0;
        aVar10.f162694z0 = this.f150991r0;
        r();
    }

    @Override // q6.d
    public final t6.i s() {
        if (this.f150987n0 == null) {
            this.f150987n0 = new s6.a();
        }
        return this.f150987n0;
    }
}
