package androidx.health.connect.client.request;

import android.net.Uri;
import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.records.FhirVersion;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00060\u0011j\u0002`\u00128\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/request/CreateMedicalDataSourceRequest;", "", "fhirBaseUri", "Landroid/net/Uri;", "displayName", "", "fhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Landroidx/health/connect/client/records/FhirVersion;)V", "getFhirBaseUri", "()Landroid/net/Uri;", "getDisplayName", "()Ljava/lang/String;", "getFhirVersion", "()Landroidx/health/connect/client/records/FhirVersion;", "platformCreateMedicalDataSourceRequest", "Landroid/health/connect/CreateMedicalDataSourceRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformCreateMedicalDataSourceRequest;", "getPlatformCreateMedicalDataSourceRequest$connect_client_release", "()Landroid/health/connect/CreateMedicalDataSourceRequest;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateMedicalDataSourceRequest {
    private final String displayName;
    private final Uri fhirBaseUri;
    private final FhirVersion fhirVersion;
    private final android.health.connect.CreateMedicalDataSourceRequest platformCreateMedicalDataSourceRequest;

    public CreateMedicalDataSourceRequest(Uri uri, String str, FhirVersion fhirVersion) {
        zcp.c(uri, "");
        zcp.c(str, "");
        zcp.c(fhirVersion, "");
        this.fhirBaseUri = uri;
        this.displayName = str;
        this.fhirVersion = fhirVersion;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.CreateMedicalDataSourceRequest>() { // from class: androidx.health.connect.client.request.CreateMedicalDataSourceRequest$platformCreateMedicalDataSourceRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.CreateMedicalDataSourceRequest invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$6();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(this.this$0.getFhirBaseUri(), this.this$0.getDisplayName(), this.this$0.getFhirVersion().getPlatformFhirVersion()).build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformCreateMedicalDataSourceRequest = FhirVersion$$ExternalSyntheticApiModelOutline0.m(objWithPhrFeatureCheck);
    }

    public final Uri getFhirBaseUri() {
        return this.fhirBaseUri;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final FhirVersion getFhirVersion() {
        return this.fhirVersion;
    }

    /* JADX INFO: renamed from: getPlatformCreateMedicalDataSourceRequest$connect_client_release, reason: from getter */
    public final android.health.connect.CreateMedicalDataSourceRequest getPlatformCreateMedicalDataSourceRequest() {
        return this.platformCreateMedicalDataSourceRequest;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("fhirBaseUri", this.fhirBaseUri), yyz.c("displayName", this.displayName), yyz.c("fhirVersion", this.fhirVersion)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        CreateMedicalDataSourceRequest createMedicalDataSourceRequest = (CreateMedicalDataSourceRequest) other;
        return zcp.b(this.fhirBaseUri, createMedicalDataSourceRequest.fhirBaseUri) && zcp.b((Object) this.displayName, (Object) createMedicalDataSourceRequest.displayName) && zcp.b(this.fhirVersion, createMedicalDataSourceRequest.fhirVersion);
    }

    public int hashCode() {
        return (((this.fhirBaseUri.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.fhirVersion.hashCode();
    }
}
