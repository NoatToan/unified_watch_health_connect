package defpackage;

import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w02 extends a12<gpc> {
    public float j;

    public w02() {
        this.j = 0.85f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A(float f, float f2, float f3) {
        BarEntry barEntry;
        if (this.i.size() <= 1) {
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int iO0 = ((gpc) q()).O0();
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.j / 2.0f;
        float fZ = z(f2, f3);
        for (int i = 0; i < iO0; i++) {
            float f7 = f + f4;
            for (T t : this.i) {
                float f8 = f7 + f5 + f6;
                if (i < t.O0() && (barEntry = (BarEntry) t.i(i)) != null) {
                    barEntry.setX(f8);
                }
                f7 = f8 + f6 + f5;
            }
            float f9 = f7 + f4;
            float f10 = fZ - (f9 - f);
            if (f10 > 0.0f || f10 < 0.0f) {
                f9 += f10;
            }
            f = f9;
        }
        x();
    }

    public void B(float f) {
        this.j = f;
    }

    public float y() {
        return this.j;
    }

    public float z(float f, float f2) {
        return (this.i.size() * (this.j + f2)) + f;
    }

    public w02(gpc... gpcVarArr) {
        super(gpcVarArr);
        this.j = 0.85f;
    }

    public w02(List<gpc> list) {
        super(list);
        this.j = 0.85f;
    }
}
