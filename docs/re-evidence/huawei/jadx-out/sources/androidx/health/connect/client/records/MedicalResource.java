package androidx.health.connect.client.records;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.impl.platform.records.IntDefMappingsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Landroidx/health/connect/client/records/MedicalResource;", "", "type", "", "id", "Landroidx/health/connect/client/records/MedicalResourceId;", "dataSourceId", "", "fhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "fhirResource", "Landroidx/health/connect/client/records/FhirResource;", "<init>", "(ILandroidx/health/connect/client/records/MedicalResourceId;Ljava/lang/String;Landroidx/health/connect/client/records/FhirVersion;Landroidx/health/connect/client/records/FhirResource;)V", "getType", "()I", "getId", "()Landroidx/health/connect/client/records/MedicalResourceId;", "getDataSourceId", "()Ljava/lang/String;", "getFhirVersion", "()Landroidx/health/connect/client/records/FhirVersion;", "getFhirResource", "()Landroidx/health/connect/client/records/FhirResource;", "platformMedicalResource", "Landroid/health/connect/datatypes/MedicalResource;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalResource;", "getPlatformMedicalResource$connect_client_release", "()Landroid/health/connect/datatypes/MedicalResource;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalResource {
    public static final int MEDICAL_RESOURCE_TYPE_ALLERGIES_INTOLERANCES = 2;
    public static final int MEDICAL_RESOURCE_TYPE_CONDITIONS = 7;
    public static final int MEDICAL_RESOURCE_TYPE_LABORATORY_RESULTS = 6;
    public static final int MEDICAL_RESOURCE_TYPE_MEDICATIONS = 9;
    public static final int MEDICAL_RESOURCE_TYPE_PERSONAL_DETAILS = 10;
    public static final int MEDICAL_RESOURCE_TYPE_PRACTITIONER_DETAILS = 11;
    public static final int MEDICAL_RESOURCE_TYPE_PREGNANCY = 3;
    public static final int MEDICAL_RESOURCE_TYPE_PROCEDURES = 8;
    public static final int MEDICAL_RESOURCE_TYPE_SOCIAL_HISTORY = 4;
    public static final int MEDICAL_RESOURCE_TYPE_VACCINES = 1;
    public static final int MEDICAL_RESOURCE_TYPE_VISITS = 12;
    public static final int MEDICAL_RESOURCE_TYPE_VITAL_SIGNS = 5;
    private final String dataSourceId;
    private final FhirResource fhirResource;
    private final FhirVersion fhirVersion;
    private final MedicalResourceId id;
    private final android.health.connect.datatypes.MedicalResource platformMedicalResource;
    private final int type;

    public MedicalResource(int i, MedicalResourceId medicalResourceId, String str, FhirVersion fhirVersion, FhirResource fhirResource) {
        zcp.c(medicalResourceId, "");
        zcp.c(str, "");
        zcp.c(fhirVersion, "");
        zcp.c(fhirResource, "");
        this.type = i;
        this.id = medicalResourceId;
        this.dataSourceId = str;
        this.fhirVersion = fhirVersion;
        this.fhirResource = fhirResource;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.datatypes.MedicalResource>() { // from class: androidx.health.connect.client.records.MedicalResource$platformMedicalResource$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.datatypes.MedicalResource invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$4();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(IntDefMappingsKt.toPlatformMedicalResourceType(this.this$0.getType()), this.this$0.getDataSourceId(), this.this$0.getFhirVersion().getPlatformFhirVersion(), this.this$0.getFhirResource().getPlatformFhirResource()).build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformMedicalResource = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m123m(objWithPhrFeatureCheck);
    }

    public final int getType() {
        return this.type;
    }

    public final MedicalResourceId getId() {
        return this.id;
    }

    public final String getDataSourceId() {
        return this.dataSourceId;
    }

    public final FhirVersion getFhirVersion() {
        return this.fhirVersion;
    }

    public final FhirResource getFhirResource() {
        return this.fhirResource;
    }

    /* JADX INFO: renamed from: getPlatformMedicalResource$connect_client_release, reason: from getter */
    public final android.health.connect.datatypes.MedicalResource getPlatformMedicalResource() {
        return this.platformMedicalResource;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("type", Integer.valueOf(this.type)), yyz.c("dataSourceId", this.dataSourceId), yyz.c("fhirVersion", this.fhirVersion), yyz.c("fhirResource", this.fhirResource)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedicalResource)) {
            return false;
        }
        MedicalResource medicalResource = (MedicalResource) other;
        return this.type == medicalResource.type && zcp.b(this.id, medicalResource.id) && zcp.b((Object) this.dataSourceId, (Object) medicalResource.dataSourceId) && zcp.b(this.fhirVersion, medicalResource.fhirVersion) && zcp.b(this.fhirResource, medicalResource.fhirResource);
    }

    public int hashCode() {
        int i = this.type;
        int iHashCode = this.id.hashCode();
        return (((((((i * 31) + iHashCode) * 31) + this.dataSourceId.hashCode()) * 31) + this.fhirVersion.hashCode()) * 31) + this.fhirResource.hashCode();
    }
}
