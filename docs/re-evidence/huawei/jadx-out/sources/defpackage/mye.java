package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f42690c = new ArrayList(16);
    private int e;

    public List<Integer> d() {
        return (List) lst.d(this.f42690c);
    }

    public void c(List<Integer> list) {
        this.f42690c = (List) lst.d(list);
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void d(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "[RelaxRecordIndexList :,relaxFrameCount = " + this.e + ",relaxFrameIndex = " + this.f42690c.toString() + "]";
    }
}
