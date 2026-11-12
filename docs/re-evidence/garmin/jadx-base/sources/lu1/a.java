package lu1;

import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llu1/a;", "A", "B", "Ljava/io/Serializable;", "string", "contentDescription", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f114983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f114984b;

    public a(A a14, B b14) {
        this.f114983a = a14;
        this.f114984b = b14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f114983a, aVar.f114983a) && s.g(this.f114984b, aVar.f114984b);
    }

    public final int hashCode() {
        A a14 = this.f114983a;
        int iHashCode = (a14 == null ? 0 : a14.hashCode()) * 31;
        B b14 = this.f114984b;
        return iHashCode + (b14 != null ? b14.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibleTextPair(string=" + this.f114983a + ", contentDescription=" + this.f114984b + ")";
    }
}
