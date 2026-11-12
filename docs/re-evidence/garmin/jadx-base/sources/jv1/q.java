package jv1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljv1/q;", "", "Lorg/joda/time/LocalDate;", "goalDate", "", "title", "rangeString", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f101113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101115c;

    public q(LocalDate localDate, String str, String str2) {
        localDate.getClass();
        str.getClass();
        str2.getClass();
        this.f101113a = localDate;
        this.f101114b = str;
        this.f101115c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f101113a.equals(qVar.f101113a) && this.f101114b.equals(qVar.f101114b) && this.f101115c.equals(qVar.f101115c);
    }

    public final int hashCode() {
        return this.f101115c.hashCode() + wr.g.j(this.f101113a.hashCode() * 31, 31, this.f101114b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTGoalDuration(goalDate=");
        sb3.append(this.f101113a);
        sb3.append(", title=");
        sb3.append(this.f101114b);
        sb3.append(", rangeString=");
        return am.j.o(this.f101115c, ")", sb3);
    }
}
