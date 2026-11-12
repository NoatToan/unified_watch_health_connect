package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc63/v;", "Le63/r;", "Lc63/k;", "Lc63/w;", "names", "<init>", "(Lc63/w;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends e63.r<k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f25063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        super(l.f25006c, wVar.f25066a, "dayOfWeekName");
        wVar.getClass();
        l.f25004a.getClass();
        this.f25063d = wVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && p005kotlin.jvm.internal.s.g(this.f25063d.f25066a, ((v) obj).f25063d.f25066a);
    }

    public final int hashCode() {
        return this.f25063d.f25066a.hashCode();
    }
}
