package o21;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo21/a;", "", "", "isError", "", "errorMessageResId", "<init>", "(ZLjava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f128641b;

    public /* synthetic */ a(boolean z14, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f128640a == aVar.f128640a && s.g(this.f128641b, aVar.f128641b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f128640a) * 31;
        Integer num = this.f128641b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ErrorState(isError=" + this.f128640a + ", errorMessageResId=" + this.f128641b + ")";
    }

    public a(boolean z14, Integer num) {
        this.f128640a = z14;
        this.f128641b = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
