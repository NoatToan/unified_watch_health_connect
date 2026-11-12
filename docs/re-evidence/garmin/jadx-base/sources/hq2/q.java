package hq2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhq2/q;", "", "", "purseId", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "balanceInfo", "Liq2/c;", "lastTopUpRecord", "", "transactionRecords", "<init>", "(Ljava/lang/String;Las2/b;Liq2/c;Ljava/util/List;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Las2/b;", "()Las2/b;", "Liq2/c;", "()Liq2/c;", "d", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("purseId")
    private final String purseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balanceInfo")
    private final as2.b<Short> balanceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastTopUpRecord")
    private final iq2.c lastTopUpRecord;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transactionRecords")
    private final List<iq2.c> transactionRecords;

    public q(String str, as2.b<Short> bVar, iq2.c cVar, List<iq2.c> list) {
        str.getClass();
        bVar.getClass();
        list.getClass();
        this.purseId = str;
        this.balanceInfo = bVar;
        this.lastTopUpRecord = cVar;
        this.transactionRecords = list;
    }

    public final as2.b<Short> a() {
        return this.balanceInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iq2.c getLastTopUpRecord() {
        return this.lastTopUpRecord;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPurseId() {
        return this.purseId;
    }

    public final List<iq2.c> d() {
        return this.transactionRecords;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.purseId, qVar.purseId) && p005kotlin.jvm.internal.s.g(this.balanceInfo, qVar.balanceInfo) && p005kotlin.jvm.internal.s.g(this.lastTopUpRecord, qVar.lastTopUpRecord) && p005kotlin.jvm.internal.s.g(this.transactionRecords, qVar.transactionRecords);
    }

    public final int hashCode() {
        int iHashCode = (this.balanceInfo.hashCode() + (this.purseId.hashCode() * 31)) * 31;
        iq2.c cVar = this.lastTopUpRecord;
        return this.transactionRecords.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PreloadTransitCard(purseId=" + this.purseId + ", balanceInfo=" + this.balanceInfo + ", lastTopUpRecord=" + this.lastTopUpRecord + ", transactionRecords=" + this.transactionRecords + ")";
    }
}
