package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sf2 extends ft1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a52 f33580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f33581b;
    public float c;
    public List<Float> d;
    public HashMap<Float, Float> e;

    public sf2(a52 a52Var) {
        this.f33580a = a52Var;
        setAxisMinimum(a52Var.F);
        setAxisMaximum(this.f33580a.E);
        setLabelCount(this.f33580a.I);
        setTextSize(this.f33580a.G);
        setTextColor(this.f33580a.H);
        setGridColor(this.f33580a.J);
        a52 a52Var2 = this.f33580a;
        this.f33581b = a52Var2.K;
        this.c = a52Var2.L;
        this.d = new ArrayList();
    }

    public HashMap<Float, Float> a(float f, float f2, int i) {
        throw null;
    }

    public HashMap<Float, Float> b(RecyclerView recyclerView) {
        float[] fArr = this.mEntries;
        if (fArr == null || fArr.length == 0) {
            return new HashMap<>();
        }
        HashMap<Float, Float> map = this.e;
        if (map == null) {
            this.e = new LinkedHashMap();
        } else {
            map.clear();
        }
        for (float f : this.mEntries) {
            this.e.put(Float.valueOf(eu3.k(f, recyclerView, this, this.f33580a)), Float.valueOf(f));
        }
        return this.e;
    }

    public void c(int i, int i2) {
        super.setLabelCount(i);
        float f = this.mAxisMaximum - this.mAxisMinimum;
        float f2 = f / i;
        this.mEntries = new float[i];
        if (((int) f) % i != 0) {
            f2 = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.mEntries[i3] = this.mAxisMaximum - (i3 * f2);
        }
    }

    public void d(int i, int i2) {
        super.setLabelCount(i);
        float f = (this.mAxisMaximum - this.mAxisMinimum) / i;
        int i3 = i + 1;
        this.mEntries = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                this.mEntries[i4] = this.mAxisMaximum;
            } else if (i4 == i) {
                this.mEntries[i4] = this.mAxisMinimum;
            } else {
                this.mEntries[i4] = this.mAxisMaximum - (i4 * f);
            }
        }
    }

    public void e(List<Float> list) {
        int size = list.size();
        this.mEntries = new float[size];
        for (int i = 0; i < size; i++) {
            this.mEntries[i] = list.get(i).floatValue();
        }
    }

    @Override // defpackage.ft1
    public void setLabelCount(int i) {
        super.setLabelCount(i);
        float f = this.mAxisMaximum;
        float f2 = (f - this.mAxisMinimum) / i;
        this.mEntries = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                f -= f2;
            }
            this.mEntries[i2] = f;
        }
    }
}
