package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f42688b = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42689c;

    public List<Integer> e() {
        return (List) lst.d(this.f42688b);
    }

    public void c(List<Integer> list) {
        this.f42688b = (List) lst.d(list);
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f42689c))).intValue();
    }

    public void d(int i) {
        this.f42689c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "[StressRecordIndexList :,stressFrameCount = " + this.f42689c + ",stressFrameIndexList = " + this.f42688b.toString() + "]";
    }
}
