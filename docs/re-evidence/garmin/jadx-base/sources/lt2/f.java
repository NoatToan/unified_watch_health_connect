package lt2;

import mt2.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llt2/f;", "", "Lmt2/k;", "sportType", "Lmt2/a;", "poolLengthUnit", "", "isAtpWorkout", "isEditing", "<init>", "(Lmt2/k;Lmt2/a;ZZ)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f114885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt2.a f114886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f114887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f114888d;

    public /* synthetic */ f(k kVar, mt2.a aVar, boolean z14, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? k.OTHER : kVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f114885a == fVar.f114885a && this.f114886b == fVar.f114886b && this.f114887c == fVar.f114887c && this.f114888d == fVar.f114888d;
    }

    public final int hashCode() {
        int iHashCode = this.f114885a.hashCode() * 31;
        mt2.a aVar = this.f114886b;
        return Boolean.hashCode(this.f114888d) + q6.f.g((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f114887c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommonWorkout(sportType=");
        sb3.append(this.f114885a);
        sb3.append(", poolLengthUnit=");
        sb3.append(this.f114886b);
        sb3.append(", isAtpWorkout=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isEditing=", ")", sb3, this.f114887c, this.f114888d);
    }

    public f(k kVar, mt2.a aVar, boolean z14, boolean z15) {
        kVar.getClass();
        this.f114885a = kVar;
        this.f114886b = aVar;
        this.f114887c = z14;
        this.f114888d = z15;
    }

    public f() {
        this(null, null, false, false, 15, null);
    }
}
