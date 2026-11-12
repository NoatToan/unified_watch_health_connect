package defpackage;

import com.huawei.health.hwuserlabelmgr.manager.LabelMatcher;

/* JADX INFO: loaded from: classes29.dex */
public class fmd implements LabelMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34249a;
    private double d;

    public fmd(double d, String str) {
        this.d = d;
        this.f34249a = str;
    }

    @Override // com.huawei.health.hwuserlabelmgr.manager.LabelMatcher
    public String getMatchResult(double d) {
        if (Math.abs(d - this.d) < 1.0E-6d) {
            return this.f34249a;
        }
        return null;
    }
}
