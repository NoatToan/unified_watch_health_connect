package ih0;

import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lih0/e;", "", "", "validFitnessAge", "missingUserSettings", "", "Ldh0/d;", "staleMetrics", "<init>", "(ZZLjava/util/List;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<dh0.d> f93451c;

    public e(boolean z14, boolean z15, List<dh0.d> list) {
        list.getClass();
        this.f93449a = z14;
        this.f93450b = z15;
        this.f93451c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f93449a == eVar.f93449a && this.f93450b == eVar.f93450b && this.f93451c.equals(eVar.f93451c);
    }

    public final int hashCode() {
        return this.f93451c.hashCode() + q6.f.g(Boolean.hashCode(this.f93449a) * 31, 31, this.f93450b);
    }

    public final String toString() {
        return z.c(com.airbnb.lottie.animation.keyframe.a.m("MissingMetrics(validFitnessAge=", ", missingUserSettings=", ", staleMetrics=", this.f93449a, this.f93450b), this.f93451c, ")");
    }
}
