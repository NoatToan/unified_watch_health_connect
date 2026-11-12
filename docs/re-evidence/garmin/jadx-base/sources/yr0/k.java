package yr0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lyr0/k;", "", "Lyr0/k$a;", "departureErrors", "arrivalErrors", "<init>", "(Lyr0/k$a;Lyr0/k$a;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f199012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f199013b;

    public /* synthetic */ k(a aVar, a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f199012a, kVar.f199012a) && p005kotlin.jvm.internal.s.g(this.f199013b, kVar.f199013b);
    }

    public final int hashCode() {
        a aVar = this.f199012a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f199013b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "JetLagFlightErrors(departureErrors=" + this.f199012a + ", arrivalErrors=" + this.f199013b + ")";
    }

    public k(a aVar, a aVar2) {
        this.f199012a = aVar;
        this.f199013b = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyr0/k$a;", "", "", "invalidLocation", "invalidDate", "invalidTime", "", "messageResId", "<init>", "(ZZZI)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f199014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f199015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f199016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f199017d;

        public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f199014a == aVar.f199014a && this.f199015b == aVar.f199015b && this.f199016c == aVar.f199016c && this.f199017d == aVar.f199017d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f199017d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f199014a) * 31, 31, this.f199015b), 31, this.f199016c);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Errors(invalidLocation=", ", invalidDate=", ", invalidTime=", this.f199014a, this.f199015b);
            sbM.append(this.f199016c);
            sbM.append(", messageResId=");
            sbM.append(this.f199017d);
            sbM.append(")");
            return sbM.toString();
        }

        public a(boolean z14, boolean z15, boolean z16, int i14) {
            this.f199014a = z14;
            this.f199015b = z15;
            this.f199016c = z16;
            this.f199017d = i14;
        }
    }
}
