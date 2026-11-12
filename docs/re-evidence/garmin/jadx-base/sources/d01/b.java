package d01;

import am.j;
import com.mapbox.common.HttpHeaders;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld01/b;", "", "", "isPregnant", "", HttpHeaders.AGE, "", "gender", "<init>", "(ZILjava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57015c;

    public b(boolean z14, int i14, String str) {
        str.getClass();
        this.f57013a = z14;
        this.f57014b = i14;
        this.f57015c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f57013a == bVar.f57013a && this.f57014b == bVar.f57014b && this.f57015c.equals(bVar.f57015c);
    }

    public final int hashCode() {
        return this.f57015c.hashCode() + q2.d(this.f57014b, Boolean.hashCode(this.f57013a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MicronutrientsGuidanceCacheKey(isPregnant=");
        sb3.append(this.f57013a);
        sb3.append(", age=");
        sb3.append(this.f57014b);
        sb3.append(", gender=");
        return j.o(this.f57015c, ")", sb3);
    }
}
