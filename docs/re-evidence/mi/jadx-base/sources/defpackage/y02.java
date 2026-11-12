package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.Fill;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y02 extends c12<BarEntry> implements gpc {
    public int A;
    public int B;
    public String[] C;
    public List<Fill> D;
    public int w;
    public int x;
    public float y;
    public int z;

    public y02(List<BarEntry> list, String str) {
        super(list, str);
        this.w = 1;
        this.x = Color.rgb(215, 215, 215);
        this.y = 0.0f;
        this.z = -16777216;
        this.A = 120;
        this.B = 0;
        this.C = new String[0];
        this.D = null;
        this.v = Color.rgb(0, 0, 0);
        m1(list);
        k1(list);
    }

    @Override // defpackage.gpc
    public float E() {
        return this.y;
    }

    @Override // defpackage.gpc
    public int F0() {
        return this.x;
    }

    @Override // defpackage.gpc
    public int L0() {
        return this.A;
    }

    @Override // defpackage.gpc
    public boolean N() {
        return this.w > 1;
    }

    @Override // defpackage.gpc
    public String[] O() {
        return this.C;
    }

    @Override // defpackage.gpc
    public int Y() {
        return this.z;
    }

    @Override // defpackage.gpc
    public List<Fill> a() {
        return this.D;
    }

    @Override // defpackage.gpc
    public Fill b0(int i) {
        List<Fill> list = this.D;
        return list.get(i % list.size());
    }

    public final void k1(List<BarEntry> list) {
        this.B = 0;
        for (int i = 0; i < list.size(); i++) {
            float[] yVals = list.get(i).getYVals();
            if (yVals == null) {
                this.B++;
            } else {
                this.B += yVals.length;
            }
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void c1(BarEntry barEntry) {
        if (barEntry == null || Float.isNaN(barEntry.getY())) {
            return;
        }
        if (barEntry.getYVals() == null) {
            if (barEntry.getY() < this.s) {
                this.s = barEntry.getY();
            }
            if (barEntry.getY() > this.f7800r) {
                this.f7800r = barEntry.getY();
            }
        } else {
            if ((-barEntry.getNegativeSum()) < this.s) {
                this.s = -barEntry.getNegativeSum();
            }
            if (barEntry.getPositiveSum() > this.f7800r) {
                this.f7800r = barEntry.getPositiveSum();
            }
        }
        d1(barEntry);
    }

    public final void m1(List<BarEntry> list) {
        for (int i = 0; i < list.size(); i++) {
            float[] yVals = list.get(i).getYVals();
            if (yVals != null && yVals.length > this.w) {
                this.w = yVals.length;
            }
        }
    }

    public void n1(int i) {
        this.A = i;
    }

    @Override // defpackage.gpc
    public int o() {
        return this.w;
    }

    public void o1(String[] strArr) {
        this.C = strArr;
    }
}
