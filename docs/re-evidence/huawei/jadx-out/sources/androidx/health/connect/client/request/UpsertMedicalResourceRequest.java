package androidx.health.connect.client.request;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.records.FhirVersion;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00060\u000fj\u0002`\u00108\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/health/connect/client/request/UpsertMedicalResourceRequest;", "", "dataSourceId", "", "fhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "data", "<init>", "(Ljava/lang/String;Landroidx/health/connect/client/records/FhirVersion;Ljava/lang/String;)V", "getDataSourceId", "()Ljava/lang/String;", "getFhirVersion", "()Landroidx/health/connect/client/records/FhirVersion;", "getData", "platformUpsertMedicalResourceRequest", "Landroid/health/connect/UpsertMedicalResourceRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformUpsertMedicalResourceRequest;", "getPlatformUpsertMedicalResourceRequest$connect_client_release", "()Landroid/health/connect/UpsertMedicalResourceRequest;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpsertMedicalResourceRequest {
    private final String data;
    private final String dataSourceId;
    private final FhirVersion fhirVersion;
    private final android.health.connect.UpsertMedicalResourceRequest platformUpsertMedicalResourceRequest;

    public UpsertMedicalResourceRequest(String str, FhirVersion fhirVersion, String str2) {
        zcp.c(str, "");
        zcp.c(fhirVersion, "");
        zcp.c(str2, "");
        this.dataSourceId = str;
        this.fhirVersion = fhirVersion;
        this.data = str2;
        zcp.b((Object) "UpsertMedicalResourceRequest", "");
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck("UpsertMedicalResourceRequest", (Function0<? extends Object>) new Function0<android.health.connect.UpsertMedicalResourceRequest>() { // from class: androidx.health.connect.client.request.UpsertMedicalResourceRequest$platformUpsertMedicalResourceRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.UpsertMedicalResourceRequest invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$9();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(this.this$0.getDataSourceId(), this.this$0.getFhirVersion().getPlatformFhirVersion(), this.this$0.getData()).build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformUpsertMedicalResourceRequest = FhirVersion$$ExternalSyntheticApiModelOutline0.m422m(objWithPhrFeatureCheck);
    }

    public final String getDataSourceId() {
        return this.dataSourceId;
    }

    public final FhirVersion getFhirVersion() {
        return this.fhirVersion;
    }

    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getPlatformUpsertMedicalResourceRequest$connect_client_release, reason: from getter */
    public final android.health.connect.UpsertMedicalResourceRequest getPlatformUpsertMedicalResourceRequest() {
        return this.platformUpsertMedicalResourceRequest;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("dataSourceId", this.dataSourceId), yyz.c("fhirVersion", this.fhirVersion), yyz.c("data", this.data)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsertMedicalResourceRequest)) {
            return false;
        }
        UpsertMedicalResourceRequest upsertMedicalResourceRequest = (UpsertMedicalResourceRequest) other;
        return zcp.b((Object) this.dataSourceId, (Object) upsertMedicalResourceRequest.dataSourceId) && zcp.b(this.fhirVersion, upsertMedicalResourceRequest.fhirVersion) && zcp.b((Object) this.data, (Object) upsertMedicalResourceRequest.data) && zcp.b(this.platformUpsertMedicalResourceRequest, upsertMedicalResourceRequest.platformUpsertMedicalResourceRequest);
    }

    public int hashCode() {
        int iHashCode = this.dataSourceId.hashCode();
        return (((((iHashCode * 31) + this.fhirVersion.hashCode()) * 31) + this.data.hashCode()) * 31) + this.platformUpsertMedicalResourceRequest.hashCode();
    }
}
