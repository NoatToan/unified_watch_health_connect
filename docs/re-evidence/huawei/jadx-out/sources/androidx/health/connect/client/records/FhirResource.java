package androidx.health.connect.client.records;

import androidx.health.connect.client.feature.FeatureUtilsKt;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00060\u000fj\u0002`\u00108\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/health/connect/client/records/FhirResource;", "", "type", "", "id", "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getData", "platformFhirResource", "Landroid/health/connect/datatypes/FhirResource;", "Landroidx/health/connect/client/impl/platform/records/PlatformFhirResource;", "getPlatformFhirResource$connect_client_release", "()Landroid/health/connect/datatypes/FhirResource;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FhirResource {
    public static final int FHIR_RESOURCE_TYPE_ALLERGY_INTOLERANCE = 2;
    public static final int FHIR_RESOURCE_TYPE_CONDITION = 4;
    public static final int FHIR_RESOURCE_TYPE_ENCOUNTER = 12;
    public static final int FHIR_RESOURCE_TYPE_IMMUNIZATION = 1;
    public static final int FHIR_RESOURCE_TYPE_LOCATION = 13;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION = 6;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_REQUEST = 7;
    public static final int FHIR_RESOURCE_TYPE_MEDICATION_STATEMENT = 8;
    public static final int FHIR_RESOURCE_TYPE_OBSERVATION = 3;
    public static final int FHIR_RESOURCE_TYPE_ORGANIZATION = 14;
    public static final int FHIR_RESOURCE_TYPE_PATIENT = 9;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER = 10;
    public static final int FHIR_RESOURCE_TYPE_PRACTITIONER_ROLE = 11;
    public static final int FHIR_RESOURCE_TYPE_PROCEDURE = 5;
    private final String data;
    private final String id;
    private final android.health.connect.datatypes.FhirResource platformFhirResource;
    private final int type;

    public FhirResource(int i, String str, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        this.type = i;
        this.id = str;
        this.data = str2;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.datatypes.FhirResource>() { // from class: androidx.health.connect.client.records.FhirResource$platformFhirResource$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.datatypes.FhirResource invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m447m$2();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(IntDefMappingsKt.toPlatformFhirResourceType(this.this$0.getType()), this.this$0.getId(), this.this$0.getData()).build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformFhirResource = FhirVersion$$ExternalSyntheticApiModelOutline0.m427m(objWithPhrFeatureCheck);
    }

    public final String getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: getPlatformFhirResource$connect_client_release, reason: from getter */
    public final android.health.connect.datatypes.FhirResource getPlatformFhirResource() {
        return this.platformFhirResource;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("type", Integer.valueOf(this.type)), yyz.c("id", this.id), yyz.c("data", this.data)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FhirResource)) {
            return false;
        }
        FhirResource fhirResource = (FhirResource) other;
        return this.type == fhirResource.type && zcp.b((Object) this.id, (Object) fhirResource.id) && zcp.b((Object) this.data, (Object) fhirResource.data);
    }

    public int hashCode() {
        return (((this.type * 31) + this.id.hashCode()) * 31) + this.data.hashCode();
    }
}
