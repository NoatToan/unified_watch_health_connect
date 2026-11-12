package tt;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltt/k;", "", "Lxt/i;", "reportStatus", "<init>", "(Lxt/i;)V", "a", "Lxt/i;", "()Lxt/i;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportStatus")
    private final xt.i reportStatus;

    public k(xt.i iVar) {
        this.reportStatus = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final xt.i getReportStatus() {
        return this.reportStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.reportStatus == ((k) obj).reportStatus;
    }

    public final int hashCode() {
        xt.i iVar = this.reportStatus;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "AnnualReportStatusDTO(reportStatus=" + this.reportStatus + ")";
    }
}
