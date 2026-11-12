package mk0;

import c80.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmk0/d;", "", "", "uuid", "Lc80/u;", "gearType", "<init>", "(Ljava/lang/String;Lc80/u;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f119106b;

    public d(String str, u uVar) {
        str.getClass();
        uVar.getClass();
        this.f119105a = str;
        this.f119106b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f119105a.equals(dVar.f119105a) && this.f119106b == dVar.f119106b;
    }

    public final int hashCode() {
        return this.f119106b.hashCode() + (this.f119105a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultGearItem(uuid=" + this.f119105a + ", gearType=" + this.f119106b + ")";
    }
}
