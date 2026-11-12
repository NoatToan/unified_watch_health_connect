package defpackage;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k62<T extends Entry> implements erc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Integer> f23507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f23508b;
    public String c;
    public YAxis.AxisDependency d;
    public boolean e;
    public transient k0d f;
    public Typeface g;
    public Legend.LegendForm h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DashPathEffect f23509k;
    public boolean l;
    public boolean m;
    public wye n;
    public float o;
    public boolean p;

    public k62() {
        this.f23507a = null;
        this.f23508b = null;
        this.c = "DataSet";
        this.d = YAxis.AxisDependency.LEFT;
        this.e = true;
        this.h = Legend.LegendForm.DEFAULT;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.f23509k = null;
        this.l = true;
        this.m = true;
        this.n = new wye();
        this.o = 17.0f;
        this.p = true;
        this.f23507a = new ArrayList();
        this.f23508b = new ArrayList();
        this.f23507a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.f23508b.add(-16777216);
    }

    @Override // defpackage.erc
    public DashPathEffect C() {
        return this.f23509k;
    }

    @Override // defpackage.erc
    public boolean D() {
        return this.m;
    }

    @Override // defpackage.erc
    public int E0(int i) {
        List<Integer> list = this.f23507a;
        return list.get(i % list.size()).intValue();
    }

    @Override // defpackage.erc
    public float G() {
        return this.j;
    }

    @Override // defpackage.erc
    public boolean G0() {
        return this.f == null;
    }

    @Override // defpackage.erc
    public wye P0() {
        return this.n;
    }

    @Override // defpackage.erc
    public boolean R() {
        return this.e;
    }

    public void S0() {
        j0();
    }

    public void T0() {
        if (this.f23507a == null) {
            this.f23507a = new ArrayList();
        }
        this.f23507a.clear();
    }

    public void U0(YAxis.AxisDependency axisDependency) {
        this.d = axisDependency;
    }

    public void V0(int i) {
        T0();
        this.f23507a.add(Integer.valueOf(i));
    }

    public void W0(List<Integer> list) {
        this.f23507a = list;
    }

    public void X0(boolean z) {
        this.m = z;
    }

    public void Y0(boolean z) {
        this.l = z;
    }

    public void Z0(boolean z) {
        this.e = z;
    }

    public void a1(float f) {
        this.o = fmq.e(f);
    }

    public void b1(boolean z) {
        this.p = z;
    }

    @Override // defpackage.erc
    public k0d d0() {
        return G0() ? fmq.j() : this.f;
    }

    @Override // defpackage.erc
    public Legend.LegendForm e() {
        return this.h;
    }

    @Override // defpackage.erc
    public String getLabel() {
        return this.c;
    }

    @Override // defpackage.erc
    public List<Integer> i0() {
        return this.f23507a;
    }

    @Override // defpackage.erc
    public boolean isVisible() {
        return this.p;
    }

    @Override // defpackage.erc
    public float j() {
        return this.i;
    }

    @Override // defpackage.erc
    public Typeface l() {
        return this.g;
    }

    @Override // defpackage.erc
    public boolean l0() {
        return this.l;
    }

    @Override // defpackage.erc
    public YAxis.AxisDependency m0() {
        return this.d;
    }

    @Override // defpackage.erc
    public int n(int i) {
        List<Integer> list = this.f23508b;
        return list.get(i % list.size()).intValue();
    }

    @Override // defpackage.erc
    public int n0() {
        return this.f23507a.get(0).intValue();
    }

    @Override // defpackage.erc
    public void t0(k0d k0dVar) {
        if (k0dVar == null) {
            return;
        }
        this.f = k0dVar;
    }

    @Override // defpackage.erc
    public float z0() {
        return this.o;
    }

    public k62(String str) {
        this();
        this.c = str;
    }
}
