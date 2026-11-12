package as2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Las2/g;", "T", "BalanceType", "", "intrinsic", "Las2/b;", "balanceInfo", "<init>", "(Ljava/lang/Object;Las2/b;)V", "a", "Ljava/lang/Object;", JWKParameterNames.RSA_EXPONENT, "()Ljava/lang/Object;", "b", "Las2/b;", "d", "()Las2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g<T, BalanceType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intrinsic")
    private final T intrinsic;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balanceInfo")
    private final b<BalanceType> balanceInfo;

    public g(T t7, b<BalanceType> bVar) {
        this.intrinsic = t7;
        this.balanceInfo = bVar;
    }

    public static g c(g gVar, b bVar) {
        return new g(gVar.intrinsic, bVar);
    }

    public final T a() {
        return this.intrinsic;
    }

    public final b<BalanceType> b() {
        return this.balanceInfo;
    }

    public final b<BalanceType> d() {
        return this.balanceInfo;
    }

    public final T e() {
        return this.intrinsic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.intrinsic, gVar.intrinsic) && s.g(this.balanceInfo, gVar.balanceInfo);
    }

    public final int hashCode() {
        T t7 = this.intrinsic;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        b<BalanceType> bVar = this.balanceInfo;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataWithBalance(intrinsic=" + this.intrinsic + ", balanceInfo=" + this.balanceInfo + ")";
    }
}
