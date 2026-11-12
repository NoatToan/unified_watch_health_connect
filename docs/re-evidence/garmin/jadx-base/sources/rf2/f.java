package rf2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrf2/f;", "", "", "timestamp", "workoutIndex", "", "name", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f152475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152477c;

    public f(Integer num, Integer num2, String str) {
        this.f152475a = num;
        this.f152476b = num2;
        this.f152477c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f152475a, fVar.f152475a) && s.g(this.f152476b, fVar.f152476b) && s.g(this.f152477c, fVar.f152477c);
    }

    public final int hashCode() {
        Integer num = this.f152475a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f152476b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f152477c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f152477c, ")", com.airbnb.lottie.animation.keyframe.a.l(this.f152475a, "LiveActivityAdaptiveCoachWorkoutInfo(timestamp=", ", workoutIndex=", ", name=", this.f152476b));
    }

    public /* synthetic */ f(Integer num, Integer num2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, num2, (i14 & 4) != 0 ? null : str);
    }
}
