package androidx.health.connect.client.records;

import android.net.Uri;
import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt$$ExternalSyntheticApiModelOutline0;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Landroidx/health/connect/client/records/MedicalDataSource;", "", "id", "", "packageName", "fhirBaseUri", "Landroid/net/Uri;", "displayName", "fhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "lastDataUpdateTime", "Ljava/time/Instant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroidx/health/connect/client/records/FhirVersion;Ljava/time/Instant;)V", "getId", "()Ljava/lang/String;", "getPackageName", "getFhirBaseUri", "()Landroid/net/Uri;", "getDisplayName", "getFhirVersion", "()Landroidx/health/connect/client/records/FhirVersion;", "getLastDataUpdateTime", "()Ljava/time/Instant;", "platformMedicalDataSource", "Landroid/health/connect/datatypes/MedicalDataSource;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalDataSource;", "getPlatformMedicalDataSource$connect_client_release", "()Landroid/health/connect/datatypes/MedicalDataSource;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalDataSource {
    private final String displayName;
    private final Uri fhirBaseUri;
    private final FhirVersion fhirVersion;
    private final String id;
    private final Instant lastDataUpdateTime;
    private final String packageName;
    private final android.health.connect.datatypes.MedicalDataSource platformMedicalDataSource;

    public MedicalDataSource(String str, String str2, Uri uri, String str3, FhirVersion fhirVersion, Instant instant) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(uri, "");
        zcp.c(str3, "");
        zcp.c(fhirVersion, "");
        this.id = str;
        this.packageName = str2;
        this.fhirBaseUri = uri;
        this.displayName = str3;
        this.fhirVersion = fhirVersion;
        this.lastDataUpdateTime = instant;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.datatypes.MedicalDataSource>() { // from class: androidx.health.connect.client.records.MedicalDataSource$platformMedicalDataSource$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.datatypes.MedicalDataSource invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m448m$3();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(this.this$0.getId(), this.this$0.getPackageName(), this.this$0.getFhirBaseUri(), this.this$0.getDisplayName(), this.this$0.getFhirVersion().getPlatformFhirVersion()).setLastDataUpdateTime(this.this$0.getLastDataUpdateTime()).build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformMedicalDataSource = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m122m(objWithPhrFeatureCheck);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPackageName() {
        return this.packageName;
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

    public final Instant getLastDataUpdateTime() {
        return this.lastDataUpdateTime;
    }

    /* JADX INFO: renamed from: getPlatformMedicalDataSource$connect_client_release, reason: from getter */
    public final android.health.connect.datatypes.MedicalDataSource getPlatformMedicalDataSource() {
        return this.platformMedicalDataSource;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("id", this.id), yyz.c("packageName", this.packageName), yyz.c("fhirBaseUri", this.fhirBaseUri), yyz.c("displayName", this.displayName), yyz.c("fhirVersion", this.fhirVersion), yyz.c("lastDataUpdateTime", this.lastDataUpdateTime)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        MedicalDataSource medicalDataSource = (MedicalDataSource) other;
        return zcp.b((Object) this.id, (Object) medicalDataSource.id) && zcp.b((Object) this.packageName, (Object) medicalDataSource.packageName) && zcp.b(this.fhirBaseUri, medicalDataSource.fhirBaseUri) && zcp.b((Object) this.displayName, (Object) medicalDataSource.displayName) && zcp.b(this.fhirVersion, medicalDataSource.fhirVersion) && zcp.b(this.lastDataUpdateTime, medicalDataSource.lastDataUpdateTime);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.packageName.hashCode();
        int iHashCode3 = this.fhirBaseUri.hashCode();
        int iHashCode4 = this.displayName.hashCode();
        int iHashCode5 = this.fhirVersion.hashCode();
        Instant instant = this.lastDataUpdateTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (instant != null ? instant.hashCode() : 0);
    }
}
