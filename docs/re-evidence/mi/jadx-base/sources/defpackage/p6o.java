package defpackage;

import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class p6o extends YAxis {
    public xd5 p;
    public SportRecordKey q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f30069r;
    public float s;

    public p6o(YAxis.AxisDependency axisDependency) {
        super(axisDependency);
        this.f30069r = 0.0f;
        this.s = 0.0f;
    }

    public final int A(int i, int i2) {
        if (i == 0) {
            return i2;
        }
        for (int i3 = 0; i3 <= i2 && i % i2 != 0; i3++) {
            i++;
        }
        return i;
    }

    public final float B(List<SportRecordEntry> list, float f) {
        int size = list.size();
        float fMax = -2.14748365E9f;
        for (int i = 0; i < size; i++) {
            fMax = Math.max(list.get(i).getY(), fMax);
        }
        float f2 = fMax - f;
        return (fMax <= 0.0f || f2 > 2.0f) ? fMax + (f2 * this.p.f36278b) : fMax + 2.0f;
    }

    public final float C(List<SportRecordEntry> list, float f) {
        int size = list.size();
        float fMax = -2.14748365E9f;
        float fMin = 2.14748365E9f;
        float y = 0.0f;
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            fMax = Math.max(sportRecordEntry.getY(), fMax);
            fMin = Math.min(sportRecordEntry.getY(), fMin);
            y += sportRecordEntry.getY();
        }
        float f2 = y / (size * 1.0f);
        float f3 = f2 - fMin;
        if (((int) ((fMax - f2) / f3)) > 5) {
            fMax = f2 + (f3 * 2.0f);
        }
        float f4 = fMax - f;
        return (fMax <= 0.0f || f4 > 2.0f) ? fMax + (f4 * this.p.f36278b) : fMax + 2.0f;
    }

    public final void D(List<Integer> list) {
        int size = list.size();
        setLabelCount(size, true);
        this.mEntryCount = size;
        if (this.mEntries.length < size) {
            this.mEntries = new float[size];
        }
        for (int i = 0; i < size; i++) {
            this.mEntries[i] = list.get(i).intValue();
        }
        if (list.size() > 0) {
            float fIntValue = list.get(0).intValue();
            float fIntValue2 = list.get(list.size() - 1).intValue();
            setAxisMinimum(fIntValue);
            setAxisMaximum(fIntValue2);
        }
    }

    public void E(float f, int i, LimitLine.LimitLabelPosition limitLabelPosition) {
        xd5 xd5Var = this.p;
        int i2 = xd5Var.n;
        if (i2 == -1) {
            i2 = xd5Var.f39009k;
        }
        LimitLine limitLine = new LimitLine(f, "");
        limitLine.l(1.5f);
        limitLine.k(i);
        limitLine.a(10.0f, 10.0f, 0.0f);
        limitLine.j(limitLabelPosition);
        limitLine.setTextSize(10.0f);
        limitLine.setTextColor(i2);
        addLimitLine(limitLine);
    }

    public void F(xd5 xd5Var) {
        this.p = xd5Var;
    }

    public void G(List<SportRecordEntry> list) {
        xd5 xd5Var = this.p;
        if (xd5Var.c) {
            setAxisMaximum(C(list, getAxisMinimum()));
        } else if (xd5Var.f36278b > 0.0f) {
            setAxisMaximum(B(list, getAxisMinimum()));
        }
        if (this.p.f36277a) {
            return;
        }
        float theMinNumber = ChartUtil.getTheMinNumber(list);
        if (theMinNumber > 1.0f) {
            setAxisMinimum(theMinNumber - ((getAxisMaximum() - theMinNumber) / 10.0f));
        } else {
            setAxisMinimum(theMinNumber);
        }
    }

    public void H(List<SportRecordEntry> list, float f) {
        xd5 xd5Var = this.p;
        int i = xd5Var.i;
        int i2 = xd5Var.j;
        if (i == 3) {
            L(list, f);
            return;
        }
        if (i == 2) {
            K(list);
            return;
        }
        if (i == 0) {
            I(list, i2);
        } else if (i == 4) {
            M(i2);
        } else {
            J(list, i2);
        }
    }

    public final void I(List<SportRecordEntry> list, int i) {
        float theMaxNumber = ChartUtil.getTheMaxNumber(list);
        int iZ = z(theMaxNumber, z(theMaxNumber / 4.0f, i));
        int iMax = Math.max(1, iZ / 4);
        if (iZ > (iMax * 3.1f) + 0.0f) {
            iMax++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 <= 5; i2++) {
            arrayList.add(Integer.valueOf(i2 * iMax));
        }
        D(arrayList);
    }

    public final void J(List<SportRecordEntry> list, int i) {
        float theMinNumber = ChartUtil.getTheMinNumber(list);
        float theMaxNumber = ChartUtil.getTheMaxNumber(list);
        int iRound = Math.round(theMaxNumber);
        int iRound2 = Math.round(theMinNumber);
        A(iRound, i);
        y(iRound2, i, false);
        Pair<Integer, Integer> yMaxValueByKey = SportRecordChatUtil.INSTANCE.getYMaxValueByKey(this.q, theMaxNumber, theMinNumber);
        int iIntValue = (yMaxValueByKey.getFirst().intValue() - yMaxValueByKey.getSecond().intValue()) / 3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yMaxValueByKey.getSecond());
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(yMaxValueByKey.getSecond().intValue() + (i2 * iIntValue)));
        }
        D(arrayList);
    }

    public final void K(List<SportRecordEntry> list) {
        float theMinNumber = ChartUtil.getTheMinNumber(list);
        float theMaxNumber = ChartUtil.getTheMaxNumber(list);
        float f = (theMaxNumber - theMinNumber) / 3.0f;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (f == 0.0f) {
            z(theMaxNumber, 4);
            int iX = x(theMinNumber, 4, true) - 16;
            while (i <= 5) {
                arrayList.add(Integer.valueOf((8 * i) + iX));
                i++;
            }
        } else {
            int iZ = z(f, 3);
            int iZ2 = z(theMaxNumber, iZ);
            int iX2 = x(theMinNumber, iZ, true);
            int i2 = iZ2 - iX2;
            if (iX2 != 0) {
                int i3 = i2 / 3;
                arrayList.add(Integer.valueOf(iX2 - i3));
                while (i < 5) {
                    arrayList.add(Integer.valueOf((i * i3) + iX2));
                    i++;
                }
            } else {
                int iA = A(iZ2, 4) / 4;
                while (i <= 5) {
                    arrayList.add(Integer.valueOf(iA * i));
                    i++;
                }
            }
        }
        D(arrayList);
    }

    public final void L(List<SportRecordEntry> list, float f) {
        G(list);
    }

    public final void M(int i) {
        float f = this.s;
        float f2 = this.f30069r;
        int iRound = Math.round(f2);
        int iRound2 = Math.round(f);
        A(iRound, i);
        y(iRound2, i, false);
        Pair<Integer, Integer> yMaxValueByKey = SportRecordChatUtil.INSTANCE.getYMaxValueByKey(this.q, f2, f);
        int iIntValue = (yMaxValueByKey.getFirst().intValue() - yMaxValueByKey.getSecond().intValue()) / 3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yMaxValueByKey.getSecond());
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(yMaxValueByKey.getSecond().intValue() + (i2 * iIntValue)));
        }
        D(arrayList);
    }

    @Override // defpackage.ft1
    public int getLabelCount() {
        return super.getLabelCount();
    }

    public final int x(float f, int i, boolean z) {
        int iRound = Math.round(f - 0.5f);
        for (int i2 = 0; i2 <= i; i2++) {
            if (iRound % i == 0) {
                return z ? iRound : Math.max(0, iRound);
            }
            iRound--;
        }
        if (z) {
            return 0;
        }
        return Math.max(0, 0);
    }

    public final int y(int i, int i2, boolean z) {
        for (int i3 = 0; i3 <= i2; i3++) {
            if (i % i2 == 0) {
                return z ? i : Math.max(0, i);
            }
            i--;
        }
        if (z) {
            return 0;
        }
        return Math.max(0, 0);
    }

    public final int z(float f, int i) {
        int iRound = Math.round(f + 0.5f);
        if (iRound == 0) {
            return i;
        }
        for (int i2 = 0; i2 <= i && iRound % i != 0; i2++) {
            iRound++;
        }
        return iRound;
    }
}
