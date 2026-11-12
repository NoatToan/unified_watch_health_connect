package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<myc> f42691b = new ArrayList(0);
    private int e;

    public void a(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<myc> a() {
        return (List) lst.d(this.f42691b);
    }

    public void b(List<myc> list) {
        this.f42691b = (List) lst.d(list);
    }

    public String toString() {
        return "[StressRecordDetails : ,stressFrameIndex = " + this.e + ",stressRecordDetails = " + this.f42691b.toString() + "]";
    }
}
