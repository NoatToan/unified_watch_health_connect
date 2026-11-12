package tx1;

import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltx1/c;", "", "", "workoutScheduleId", "", "completedWorkout", "completedPlan", "<init>", "(JZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f166843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166845c;

    public c(long j8, boolean z14, boolean z15) {
        this.f166843a = j8;
        this.f166844b = z14;
        this.f166845c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f166843a == cVar.f166843a && this.f166844b == cVar.f166844b && this.f166845c == cVar.f166845c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166845c) + f.g(Long.hashCode(this.f166843a) * 31, 31, this.f166844b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutDetailsContractInput(workoutScheduleId=");
        sb3.append(this.f166843a);
        sb3.append(", completedWorkout=");
        sb3.append(this.f166844b);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", completedPlan=", this.f166845c, ")");
    }
}
