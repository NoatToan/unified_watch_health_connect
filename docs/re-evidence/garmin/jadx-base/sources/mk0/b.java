package mk0;

import c80.u;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmk0/b;", "", "", "uuid", "", "Lc80/u;", "gearTypes", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<u> f119101b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, Set<? extends u> set) {
        str.getClass();
        set.getClass();
        this.f119100a = str;
        this.f119101b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f119100a, bVar.f119100a) && s.g(this.f119101b, bVar.f119101b);
    }

    public final int hashCode() {
        return this.f119101b.hashCode() + (this.f119100a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultGearCollection(uuid=" + this.f119100a + ", gearTypes=" + this.f119101b + ")";
    }

    public b(String str, Set set, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? l0.f134950a : set);
    }
}
