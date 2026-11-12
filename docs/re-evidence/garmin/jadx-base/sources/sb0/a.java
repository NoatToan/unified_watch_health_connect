package sb0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsb0/a;", "", "", "isChecking", "firmwareUpdateAvailable", "<init>", "(ZLjava/lang/Boolean;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f158388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f158389b;

    public /* synthetic */ a(boolean z14, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f158388a == aVar.f158388a && s.g(this.f158389b, aVar.f158389b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f158388a) * 31;
        Boolean bool = this.f158389b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "DeviceFirmwareUpdateCheckState(isChecking=" + this.f158388a + ", firmwareUpdateAvailable=" + this.f158389b + ")";
    }

    public a(boolean z14, Boolean bool) {
        this.f158388a = z14;
        this.f158389b = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
