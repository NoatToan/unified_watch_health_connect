package defpackage;

import com.huawei.basefitnessadvice.model.DayInfo;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class gyx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PlanWorkout> f36251b = new ArrayList();
    private DayInfo d;
    private boolean e;

    public gyx(int i, DayInfo dayInfo) {
        this.f36250a = i;
        this.d = dayInfo;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public List<PlanWorkout> d() {
        return this.f36251b;
    }
}
