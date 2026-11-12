package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42692b;
    private List<mxy> d = new ArrayList(0);

    public void d(int i) {
        this.f42692b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<mxy> e() {
        return (List) lst.d(this.d);
    }

    public void d(List<mxy> list) {
        this.d = (List) lst.d(list);
    }

    public String toString() {
        return "[RelaxRecordDetails : ,relaxFrameIndex = " + this.f42692b + ",relaxRecordDetails = " + this.d.toString() + "]";
    }
}
