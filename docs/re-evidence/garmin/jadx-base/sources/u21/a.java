package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu21/a;", "", "", "activeCaloriesGoal", "customActiveCalories", "Ls21/a;", "activityLevelOption", "Ll01/a;", "activityMultiplierType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ls21/a;Ll01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f167887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f167888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s21.a f167889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l01.a f167890d;

    public a(Integer num, Integer num2, s21.a aVar, l01.a aVar2) {
        aVar.getClass();
        this.f167887a = num;
        this.f167888b = num2;
        this.f167889c = aVar;
        this.f167890d = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f167887a, aVar.f167887a) && p005kotlin.jvm.internal.s.g(this.f167888b, aVar.f167888b) && this.f167889c == aVar.f167889c && this.f167890d == aVar.f167890d;
    }

    public final int hashCode() {
        Integer num = this.f167887a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f167888b;
        int iHashCode2 = (this.f167889c.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        l01.a aVar = this.f167890d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f167887a, "ActivityLevelInputData(activeCaloriesGoal=", ", customActiveCalories=", ", activityLevelOption=", this.f167888b);
        sbL.append(this.f167889c);
        sbL.append(", activityMultiplierType=");
        sbL.append(this.f167890d);
        sbL.append(")");
        return sbL.toString();
    }
}
