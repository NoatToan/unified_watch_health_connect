package sc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsc2/k;", "", "Lve2/k;", "mfaTokenData", "Lsc2/j;", "oAuth1GCData", "<init>", "(Lve2/k;Lsc2/j;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f158521c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve2.k f158522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f158523b;

    public k(ve2.k kVar, j jVar) {
        jVar.getClass();
        this.f158522a = kVar;
        this.f158523b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f158522a, kVar.f158522a) && s.g(this.f158523b, kVar.f158523b);
    }

    public final int hashCode() {
        ve2.k kVar = this.f158522a;
        return this.f158523b.hashCode() + ((kVar == null ? 0 : kVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OAuth1GCDataWithMFA(mfaTokenData=" + this.f158522a + ", oAuth1GCData=" + this.f158523b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsc2/k$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(ve2.k kVar, j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : kVar, jVar);
    }
}
