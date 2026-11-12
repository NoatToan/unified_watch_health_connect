package as2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00028\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Las2/b;", "T", "Ljava/io/Serializable;", "balance", "", "lastBalanceSyncTimeStamp", "<init>", "(Ljava/lang/Object;J)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setBalance", "(Ljava/lang/Object;)V", "b", "J", "()J", "setLastBalanceSyncTimeStamp", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balance")
    private T balance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastBalanceSyncTimeStamp")
    private long lastBalanceSyncTimeStamp;

    public b(T t7, long j8) {
        this.balance = t7;
        this.lastBalanceSyncTimeStamp = j8;
    }

    public final T a() {
        return this.balance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastBalanceSyncTimeStamp() {
        return this.lastBalanceSyncTimeStamp;
    }

    public final DateTime c() {
        return new DateTime(this.lastBalanceSyncTimeStamp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.balance, bVar.balance) && this.lastBalanceSyncTimeStamp == bVar.lastBalanceSyncTimeStamp;
    }

    public final int hashCode() {
        T t7 = this.balance;
        return Long.hashCode(this.lastBalanceSyncTimeStamp) + ((t7 == null ? 0 : t7.hashCode()) * 31);
    }

    public final String toString() {
        return "BalanceInfo2(balance=" + this.balance + ", lastBalanceSyncTimeStamp=" + this.lastBalanceSyncTimeStamp + ")";
    }
}
