package defpackage;

import com.huawei.health.hwuserlabelmgr.manager.LabelMatcher;

/* JADX INFO: loaded from: classes29.dex */
public class fmh implements LabelMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f34260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34261c;
    private double d;

    public fmh(double d, double d2, String str) {
        this.d = d;
        this.f34260b = d2;
        this.f34261c = str;
    }

    @Override // com.huawei.health.hwuserlabelmgr.manager.LabelMatcher
    public String getMatchResult(double d) {
        if (d <= this.d || d > this.f34260b) {
            return null;
        }
        return this.f34261c;
    }
}
