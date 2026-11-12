package ve2;

import d53.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lve2/k;", "", "", "tokenVal", "", "tokenExpiryUTC", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f177752c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f177754b;

    public /* synthetic */ k(String str, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14);
    }

    public final boolean a() {
        String str = this.f177753a;
        return (str == null || w.J(str) || this.f177754b == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f177753a, kVar.f177753a) && p005kotlin.jvm.internal.s.g(this.f177754b, kVar.f177754b);
    }

    public final int hashCode() {
        String str = this.f177753a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f177754b;
        return iHashCode + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = a.EnumC3324a.TOKEN_VAL.f177759a;
        String str2 = a.EnumC3324a.TOKEN_EXPIRY_UTC.f177759a;
        StringBuilder sbI = p6.b.i("MFATokenData(", str, "=", this.f177753a, ", ");
        sbI.append(str2);
        sbI.append("=");
        sbI.append(this.f177754b);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lve2/k$a;", "", "<init>", "()V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ve2.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve2/k$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC3324a {
            ROOT("mfaTokenData"),
            TOKEN_VAL("tokenVal"),
            TOKEN_EXPIRY_UTC("tokenExpiryUTC");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f177759a;

            EnumC3324a(String str) {
                this.f177759a = str;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k(String str, Long l14) {
        this.f177753a = str;
        this.f177754b = l14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
