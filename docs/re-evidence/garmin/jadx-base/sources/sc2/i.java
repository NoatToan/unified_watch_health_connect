package sc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsc2/i;", "", "", "tokenVal", "", "tokenExpiryUTC", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f158508b;

    static {
        new a(null);
    }

    public /* synthetic */ i(String str, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f158507a, iVar.f158507a) && s.g(this.f158508b, iVar.f158508b);
    }

    public final int hashCode() {
        String str = this.f158507a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f158508b;
        return iHashCode + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = a.EnumC2992a.TOKEN_VAL.f158512a;
        String str2 = a.EnumC2992a.TOKEN_EXPIRY_UTC.f158512a;
        StringBuilder sbI = p6.b.i("MFATokenData(", str, "=", this.f158507a, ", ");
        sbI.append(str2);
        sbI.append("=");
        sbI.append(this.f158508b);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsc2/i$a;", "", "<init>", "()V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: sc2.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsc2/i$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC2992a {
            /* JADX INFO: Fake field, exist only in values array */
            ROOT("mfaTokenData"),
            TOKEN_VAL("tokenVal"),
            TOKEN_EXPIRY_UTC("tokenExpiryUTC");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f158512a;

            EnumC2992a(String str) {
                this.f158512a = str;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public i(String str, Long l14) {
        this.f158507a = str;
        this.f158508b = l14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
