package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldy1/i;", "", "", "name", "relativeDate", "estimatedDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61568c;

    public i(String str, String str2, String str3) {
        this.f61566a = str;
        this.f61567b = str2;
        this.f61568c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f61566a, iVar.f61566a) && p005kotlin.jvm.internal.s.g(this.f61567b, iVar.f61567b) && p005kotlin.jvm.internal.s.g(this.f61568c, iVar.f61568c);
    }

    public final int hashCode() {
        String str = this.f61566a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61567b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61568c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f61568c, ")", p6.b.i("NextWorkout(name=", this.f61566a, ", relativeDate=", this.f61567b, ", estimatedDuration="));
    }
}
