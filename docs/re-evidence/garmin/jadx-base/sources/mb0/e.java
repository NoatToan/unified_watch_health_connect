package mb0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmb0/e;", "", "", "bedTimeSeconds", "wakeTimeSeconds", "<init>", "(II)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117729b;

    public /* synthetic */ e(int i14, int i15, int i16, j jVar) {
        this((i16 & 1) != 0 ? 79200 : i14, (i16 & 2) != 0 ? 21600 : i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f117728a == eVar.f117728a && this.f117729b == eVar.f117729b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117729b) + (Integer.hashCode(this.f117728a) * 31);
    }

    public final String toString() {
        return am.j.g(this.f117728a, this.f117729b, "SimpleSleepData(bedTimeSeconds=", ", wakeTimeSeconds=", ")");
    }

    public e(int i14, int i15) {
        this.f117728a = i14;
        this.f117729b = i15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        int i14 = 0;
        this(i14, i14, 3, null);
    }
}
