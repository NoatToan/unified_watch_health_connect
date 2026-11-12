package f33;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f68701a = str;
        this.f68702b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f68701a, dVar.f68701a) && s.g(this.f68702b, dVar.f68702b);
    }

    public final int hashCode() {
        return this.f68702b.hashCode() + (this.f68701a.hashCode() * 31);
    }

    public final String toString() {
        return this.f68701a + this.f68702b;
    }
}
