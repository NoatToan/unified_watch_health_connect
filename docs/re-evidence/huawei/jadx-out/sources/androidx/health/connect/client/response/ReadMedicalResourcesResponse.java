package androidx.health.connect.client.response;

import androidx.health.connect.client.records.MedicalResource;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/response/ReadMedicalResourcesResponse;", "", "medicalResources", "", "Landroidx/health/connect/client/records/MedicalResource;", "nextPageToken", "", "remainingCount", "", "<init>", "(Ljava/util/List;Ljava/lang/String;I)V", "getMedicalResources", "()Ljava/util/List;", "getNextPageToken", "()Ljava/lang/String;", "getRemainingCount", "()I", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadMedicalResourcesResponse {
    private final List<MedicalResource> medicalResources;
    private final String nextPageToken;
    private final int remainingCount;

    public ReadMedicalResourcesResponse(List<MedicalResource> list, String str, int i) {
        zcp.c(list, "");
        this.medicalResources = list;
        this.nextPageToken = str;
        this.remainingCount = i;
    }

    public final List<MedicalResource> getMedicalResources() {
        return this.medicalResources;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final int getRemainingCount() {
        return this.remainingCount;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("medicalResources", this.medicalResources), yyz.c("nextPageToken", this.nextPageToken), yyz.c("remainingCount", Integer.valueOf(this.remainingCount))));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMedicalResourcesResponse)) {
            return false;
        }
        ReadMedicalResourcesResponse readMedicalResourcesResponse = (ReadMedicalResourcesResponse) other;
        return this.remainingCount == readMedicalResourcesResponse.remainingCount && zcp.b(this.medicalResources, readMedicalResourcesResponse.medicalResources) && zcp.b((Object) this.nextPageToken, (Object) readMedicalResourcesResponse.nextPageToken);
    }

    public int hashCode() {
        int i = this.remainingCount;
        int iHashCode = this.medicalResources.hashCode();
        String str = this.nextPageToken;
        return (((i * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }
}
