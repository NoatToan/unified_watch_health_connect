package defpackage;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hge<T extends Entry> extends c12<T> implements mtc<T> {
    public boolean w;
    public boolean x;
    public float y;
    public DashPathEffect z;

    public hge(List<T> list, String str) {
        super(list, str);
        this.w = true;
        this.x = true;
        this.y = 0.5f;
        this.z = null;
        this.y = fmq.e(0.5f);
    }

    @Override // defpackage.mtc
    public DashPathEffect I0() {
        return this.z;
    }

    @Override // defpackage.mtc
    public boolean Q0() {
        return this.x;
    }

    public void k1() {
        this.z = null;
    }

    public void l1(boolean z) {
        n1(z);
        m1(z);
    }

    public void m1(boolean z) {
        this.x = z;
    }

    public void n1(boolean z) {
        this.w = z;
    }

    @Override // defpackage.mtc
    public boolean v() {
        return this.w;
    }

    @Override // defpackage.mtc
    public float x0() {
        return this.y;
    }
}
