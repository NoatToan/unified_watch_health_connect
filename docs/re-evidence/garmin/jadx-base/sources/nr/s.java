package nr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/s;", "", "", "value", "", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f127317b;

    public s(String str, Integer num) {
        str.getClass();
        this.f127316a = str;
        this.f127317b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f127316a, sVar.f127316a) && p005kotlin.jvm.internal.s.g(this.f127317b, sVar.f127317b);
    }

    public final int hashCode() {
        int iHashCode = this.f127316a.hashCode() * 31;
        Integer num = this.f127317b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "DataCell(value=" + this.f127316a + ", icon=" + this.f127317b + ")";
    }

    public /* synthetic */ s(String str, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : num);
    }
}
