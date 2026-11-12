package fk2;

import dk2.h;
import e23.l;
import f2.o0;
import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfk2/b;", "Lfk2/d;", "", "", "excludedMacAddresses", "<init>", "(Ljava/util/Collection;)V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<String> f71942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f71943b;

    public b(Collection<String> collection) {
        collection.getClass();
        this.f71942a = collection;
        this.f71943b = new o0(this, 18);
    }

    @Override // fk2.d
    /* JADX INFO: renamed from: a */
    public final long getF71939b() {
        return 0L;
    }

    @Override // fk2.d
    public final l<h, c> b() {
        return this.f71943b;
    }

    @Override // fk2.d
    /* JADX INFO: renamed from: c */
    public final String getF71940c() {
        return "ExcludedMacAddress";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f71942a.equals(((b) obj).f71942a);
    }

    public final int hashCode() {
        return this.f71942a.hashCode();
    }

    public final String toString() {
        return "ExcludedMacRule(excludedMacAddresses=" + this.f71942a + ")";
    }
}
