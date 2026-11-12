package o92;

import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo92/a;", "", "Lo4/d0;", "strokeColor", "", "strokeWidth", "<init>", "(JFLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f131002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f131003b;

    private a(long j8, float f14) {
        this.f131002a = j8;
        this.f131003b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d0.d(this.f131002a, aVar.f131002a) && Float.compare(this.f131003b, aVar.f131003b) == 0;
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Float.hashCode(this.f131003b) + (Long.hashCode(this.f131002a) * 31);
    }

    public final String toString() {
        return "Border(strokeColor=" + d0.j(this.f131002a) + ", strokeWidth=" + this.f131003b + ")";
    }

    public /* synthetic */ a(long j8, float f14, j jVar) {
        this(j8, f14);
    }
}
