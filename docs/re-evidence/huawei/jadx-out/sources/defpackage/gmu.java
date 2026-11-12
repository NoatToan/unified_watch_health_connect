package defpackage;

import com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi;

/* JADX INFO: loaded from: classes29.dex */
public class gmu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IntelligentPlanDataApi f35757a;

    private gmu() {
    }

    public static IntelligentPlanDataApi d() {
        if (f35757a == null) {
            synchronized (gmu.class) {
                if (f35757a == null) {
                    f35757a = new gmt();
                }
            }
        }
        return f35757a;
    }
}
