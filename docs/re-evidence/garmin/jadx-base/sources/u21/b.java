package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu21/b;", "", "", "activeCalories", "", "shouldUseActiveCalories", "Ll01/a;", "activityMultiplierType", "<init>", "(Ljava/lang/Integer;ZLl01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f167898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l01.a f167900c;

    public b(Integer num, boolean z14, l01.a aVar) {
        this.f167898a = num;
        this.f167899b = z14;
        this.f167900c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f167898a, bVar.f167898a) && this.f167899b == bVar.f167899b && this.f167900c == bVar.f167900c;
    }

    public final int hashCode() {
        Integer num = this.f167898a;
        int iG = q6.f.g((num == null ? 0 : num.hashCode()) * 31, 31, this.f167899b);
        l01.a aVar = this.f167900c;
        return iG + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityLevelSummary(activeCalories=" + this.f167898a + ", shouldUseActiveCalories=" + this.f167899b + ", activityMultiplierType=" + this.f167900c + ")";
    }
}
