package v21;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv21/b;", "", "", "protein", "fat", "carbs", "other", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f175292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f175293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f175294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f175295d;

    public b(Float f14, Float f15, Float f16, Float f17) {
        this.f175292a = f14;
        this.f175293b = f15;
        this.f175294c = f16;
        this.f175295d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f175292a, bVar.f175292a) && s.g(this.f175293b, bVar.f175293b) && s.g(this.f175294c, bVar.f175294c) && s.g(this.f175295d, bVar.f175295d);
    }

    public final int hashCode() {
        Float f14 = this.f175292a;
        int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
        Float f15 = this.f175293b;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f175294c;
        int iHashCode3 = (iHashCode2 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.f175295d;
        return iHashCode3 + (f17 != null ? f17.hashCode() : 0);
    }

    public final String toString() {
        return "MacronutrientCalories(protein=" + this.f175292a + ", fat=" + this.f175293b + ", carbs=" + this.f175294c + ", other=" + this.f175295d + ")";
    }
}
