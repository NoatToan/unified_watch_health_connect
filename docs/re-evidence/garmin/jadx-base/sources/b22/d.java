package b22;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lb22/d;", "", "Lhs1/c;", "calories", "Lhs1/i;", "movement", "<init>", "(Lhs1/c;Lhs1/i;)V", "a", "Lhs1/c;", "()Lhs1/c;", "b", "Lhs1/i;", "()Lhs1/i;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final hs1.c calories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movement")
    private final hs1.i movement;

    public d(hs1.c cVar, hs1.i iVar) {
        cVar.getClass();
        iVar.getClass();
        this.calories = cVar;
        this.movement = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final hs1.c getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hs1.i getMovement() {
        return this.movement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.calories, dVar.calories) && s.g(this.movement, dVar.movement);
    }

    public final int hashCode() {
        return this.movement.hashCode() + (this.calories.hashCode() * 31);
    }

    public final String toString() {
        return "UserDailySummaryAverageV2DTOData(calories=" + this.calories + ", movement=" + this.movement + ")";
    }
}
