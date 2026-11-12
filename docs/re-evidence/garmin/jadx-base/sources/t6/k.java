package t6;

/* JADX INFO: loaded from: classes.dex */
public class k extends l {
    @Override // t6.l
    public final void a0(int i14, int i15, int i16, int i17) {
        int iS = this.C0 + this.D0;
        int iM = this.f162693y0 + this.f162694z0;
        if (this.f162691x0 > 0) {
            iS += this.f162690w0[0].s();
            iM += this.f162690w0[0].m();
        }
        int iMax = Math.max(this.f162613f0, iS);
        int iMax2 = Math.max(this.f162615g0, iM);
        if (i14 != 1073741824) {
            if (i14 == Integer.MIN_VALUE) {
                i15 = Math.min(iMax, i15);
            } else {
                i15 = i14 == 0 ? iMax : 0;
            }
        }
        if (i16 != 1073741824) {
            if (i16 == Integer.MIN_VALUE) {
                i17 = Math.min(iMax2, i17);
            } else {
                i17 = i16 == 0 ? iMax2 : 0;
            }
        }
        this.F0 = i15;
        this.G0 = i17;
        T(i15);
        O(i17);
        this.E0 = this.f162691x0 > 0;
    }

    @Override // t6.e
    public final void c(m6.d dVar, boolean z14) {
        super.c(dVar, z14);
        if (this.f162691x0 > 0) {
            e eVar = this.f162690w0[0];
            eVar.F();
            eVar.f162619i0 = 0.5f;
            eVar.f162617h0 = 0.5f;
            d.a aVar = d.a.LEFT;
            eVar.f(aVar, this, aVar, 0);
            d.a aVar2 = d.a.RIGHT;
            eVar.f(aVar2, this, aVar2, 0);
            d.a aVar3 = d.a.TOP;
            eVar.f(aVar3, this, aVar3, 0);
            d.a aVar4 = d.a.BOTTOM;
            eVar.f(aVar4, this, aVar4, 0);
        }
    }
}
