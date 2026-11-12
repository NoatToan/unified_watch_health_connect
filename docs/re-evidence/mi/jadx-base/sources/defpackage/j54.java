package defpackage;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j54 extends gu3<i54> implements zsc {
    public z02 c;

    public j54(i54 i54Var, x02 x02Var) {
        super(i54Var);
        this.c = x02Var.getBarData() == null ? null : new z02(x02Var);
    }

    @Override // defpackage.gu3
    public List<r7c> h(float f, float f2, float f3) {
        this.f19329b.clear();
        List<a12> listY = ((i54) this.f19328a).getCombinedData().y();
        for (int i = 0; i < listY.size(); i++) {
            a12 a12Var = listY.get(i);
            z02 z02Var = this.c;
            if (z02Var == null || !(a12Var instanceof w02)) {
                int iJ = a12Var.j();
                for (int i2 = 0; i2 < iJ; i2++) {
                    erc ercVarI = listY.get(i).i(i2);
                    if (ercVarI.R()) {
                        for (r7c r7cVar : b(ercVarI, i2, f, DataSet.Rounding.CLOSEST)) {
                            r7cVar.l(i);
                            this.f19329b.add(r7cVar);
                        }
                    }
                }
            } else {
                r7c r7cVarA = z02Var.a(f2, f3);
                if (r7cVarA != null) {
                    r7cVarA.l(i);
                    this.f19329b.add(r7cVarA);
                }
            }
        }
        return this.f19329b;
    }
}
