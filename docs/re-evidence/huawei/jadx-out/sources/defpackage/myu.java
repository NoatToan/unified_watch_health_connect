package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42705b;
    private List<myy> d;

    public void e(int i) {
        this.f42705b = i;
    }

    public List<myy> a() {
        return this.d;
    }

    public void a(List<myy> list) {
        this.d = list;
    }

    public String toString() {
        return "BloodOxygenDownRemind{mBloodOxygenDownRemindIndex=" + this.f42705b + ", mBloodOxygenDownStructs=" + this.d + '}';
    }
}
