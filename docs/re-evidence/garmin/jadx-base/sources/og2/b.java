package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log2/b;", "", "", "min", "max", "<init>", "(FF)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f132008b;

    public /* synthetic */ b(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0f : f14, (i14 & 2) != 0 ? 0.0f : f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f132007a, bVar.f132007a) == 0 && Float.compare(this.f132008b, bVar.f132008b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132008b) + (Float.hashCode(this.f132007a) * 31);
    }

    public final String toString() {
        return am.j.l("AxisRange(min=", this.f132007a, ", max=", this.f132008b, ")");
    }

    public b(float f14, float f15) {
        this.f132007a = f14;
        this.f132008b = f15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        float f14 = 0.0f;
        this(f14, f14, 3, null);
    }
}
