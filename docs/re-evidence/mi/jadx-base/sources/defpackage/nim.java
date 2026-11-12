package defpackage;

import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;

/* JADX INFO: loaded from: classes7.dex */
public class nim extends p02 {
    public float l;
    public int m;

    public nim(int i, int i2, float f, int i3) {
        super(i, i2, false);
        this.l = f;
        this.m = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p02
    public void e(gpc gpcVar) {
        float fO0 = gpcVar.O0() * this.c;
        for (int i = 0; i < fO0; i++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i);
            if (barEntry != null && (barEntry instanceof SleepItemEntry)) {
                SleepItemEntry sleepItemEntry = (SleepItemEntry) barEntry;
                float x = sleepItemEntry.getX();
                sleepItemEntry.getY();
                npm npmVar = sleepItemEntry.f11764a;
                int i2 = npmVar.e;
                if (i2 != 0) {
                    int i3 = (int) x;
                    int i4 = (int) (x + i2);
                    float f = i3;
                    float f2 = i4;
                    vim vimVarI = i(f, f2, npmVar.c, 4);
                    if (this.m == 1) {
                        vimVarI = j(f, f2, npmVar.c, 4);
                    }
                    int i5 = (int) vimVarI.d;
                    int i6 = (int) vimVarI.c;
                    if (i6 > 0) {
                        i6 = (int) (i6 * this.d);
                    } else {
                        i5 = (int) (i5 * this.d);
                    }
                    d(f, i6, f2, i5);
                }
            }
        }
        a();
    }

    public final vim i(float f, float f2, int i, int i2) {
        float f3;
        float f4;
        int i3;
        vim vimVar = new vim();
        vimVar.f36932a = f;
        vimVar.f36933b = f2;
        if (i == 0) {
            f3 = i2;
            i3 = (i2 * 3) / 4;
        } else {
            if (i != 1) {
                if (i == 2) {
                    f3 = i2 / 2;
                    i3 = i2 / 4;
                } else {
                    f3 = 0.0f;
                    if (i == 3) {
                        f3 = i2 / 4;
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                }
                vimVar.c = f3;
                vimVar.d = f4;
                return vimVar;
            }
            f3 = (i2 * 3) / 4;
            i3 = i2 / 2;
        }
        f4 = i3;
        vimVar.c = f3;
        vimVar.d = f4;
        return vimVar;
    }

    public final vim j(float f, float f2, int i, int i2) {
        vim vimVar = new vim();
        vimVar.f36932a = f;
        vimVar.f36933b = f2;
        vimVar.c = (i == 0 || i == 1 || i == 2 || i == 3) ? i2 : 0.0f;
        vimVar.d = 0.0f;
        return vimVar;
    }
}
