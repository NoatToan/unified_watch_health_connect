package androidx.health.connect.client.records;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.impl.platform.records.IntDefMappingsKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00060\u000fj\u0002`\u00108\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/health/connect/client/records/MedicalResourceId;", "", "dataSourceId", "", "fhirResourceType", "", "fhirResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDataSourceId", "()Ljava/lang/String;", "getFhirResourceType", "()I", "getFhirResourceId", "platformMedicalResourceId", "Landroid/health/connect/MedicalResourceId;", "Landroidx/health/connect/client/impl/platform/records/PlatformMedicalResourceId;", "getPlatformMedicalResourceId$connect_client_release", "()Landroid/health/connect/MedicalResourceId;", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalResourceId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String dataSourceId;
    private final String fhirResourceId;
    private final int fhirResourceType;
    private final android.health.connect.MedicalResourceId platformMedicalResourceId;

    public MedicalResourceId(String str, int i, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        this.dataSourceId = str;
        this.fhirResourceType = i;
        this.fhirResourceId = str2;
        this.platformMedicalResourceId = FhirVersion$$ExternalSyntheticApiModelOutline0.m418m(FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), new Function0<android.health.connect.MedicalResourceId>() { // from class: androidx.health.connect.client.records.MedicalResourceId$platformMedicalResourceId$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.MedicalResourceId invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$5();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(this.this$0.getDataSourceId(), IntDefMappingsKt.toPlatformFhirResourceType(this.this$0.getFhirResourceType()), this.this$0.getFhirResourceId());
            }

            {
                super(0);
            }
        }));
    }

    public final String getDataSourceId() {
        return this.dataSourceId;
    }

    public final int getFhirResourceType() {
        return this.fhirResourceType;
    }

    public final String getFhirResourceId() {
        return this.fhirResourceId;
    }

    /* JADX INFO: renamed from: getPlatformMedicalResourceId$connect_client_release, reason: from getter */
    public final android.health.connect.MedicalResourceId getPlatformMedicalResourceId() {
        return this.platformMedicalResourceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedicalResourceId)) {
            return false;
        }
        MedicalResourceId medicalResourceId = (MedicalResourceId) other;
        return this.fhirResourceType == medicalResourceId.fhirResourceType && zcp.b((Object) this.dataSourceId, (Object) medicalResourceId.dataSourceId) && zcp.b((Object) this.fhirResourceId, (Object) medicalResourceId.fhirResourceId);
    }

    public int hashCode() {
        return (((this.fhirResourceType * 31) + this.dataSourceId.hashCode()) * 31) + this.fhirResourceId.hashCode();
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("dataSourceId", this.dataSourceId), yyz.c("fhirResourceType", Integer.valueOf(this.fhirResourceType)), yyz.c("fhirResourceId", this.fhirResourceId)));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/MedicalResourceId$Companion;", "", "<init>", "()V", "fromFhirReference", "Landroidx/health/connect/client/records/MedicalResourceId;", "dataSourceId", "", "fhirReference", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final MedicalResourceId fromFhirReference(final String dataSourceId, final String fhirReference) {
            zcp.c(dataSourceId, "");
            zcp.c(fhirReference, "");
            return (MedicalResourceId) FeatureUtilsKt.withPhrFeatureCheck(zcv.b(getClass()), "fromFhirReference", new Function0<MedicalResourceId>() { // from class: androidx.health.connect.client.records.MedicalResourceId$Companion$fromFhirReference$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MedicalResourceId invoke() {
                    android.health.connect.MedicalResourceId medicalResourceIdFromFhirReference = android.health.connect.MedicalResourceId.fromFhirReference(dataSourceId, fhirReference);
                    zcp.b((Object) medicalResourceIdFromFhirReference, "");
                    return RecordConvertersKt.toSdkMedicalResourceId(medicalResourceIdFromFhirReference);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final MedicalResourceId fromFhirReference(String str, String str2) {
        return INSTANCE.fromFhirReference(str, str2);
    }
}
