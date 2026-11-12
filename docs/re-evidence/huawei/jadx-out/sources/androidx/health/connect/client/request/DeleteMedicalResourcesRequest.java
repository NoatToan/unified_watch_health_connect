package androidx.health.connect.client.request;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\u00060\rj\u0002`\u000e8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/request/DeleteMedicalResourcesRequest;", "", "dataSourceIds", "", "", "medicalResourceTypes", "", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "getDataSourceIds", "()Ljava/util/Set;", "getMedicalResourceTypes", "platformReadMedicalResourcesRequest", "Landroid/health/connect/DeleteMedicalResourcesRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformDeleteMedicalResourcesRequest;", "getPlatformReadMedicalResourcesRequest$connect_client_release", "()Landroid/health/connect/DeleteMedicalResourcesRequest;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteMedicalResourcesRequest {
    private final Set<String> dataSourceIds;
    private final Set<Integer> medicalResourceTypes;
    private final android.health.connect.DeleteMedicalResourcesRequest platformReadMedicalResourcesRequest;

    public DeleteMedicalResourcesRequest(Set<String> set, Set<Integer> set2) {
        zcp.c(set, "");
        zcp.c(set2, "");
        this.dataSourceIds = set;
        this.medicalResourceTypes = set2;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.DeleteMedicalResourcesRequest>() { // from class: androidx.health.connect.client.request.DeleteMedicalResourcesRequest$platformReadMedicalResourcesRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.DeleteMedicalResourcesRequest invoke() {
                android.health.connect.DeleteMedicalResourcesRequest.Builder builderM = FhirVersion$$ExternalSyntheticApiModelOutline0.m();
                Iterator<T> it = this.this$0.getDataSourceIds().iterator();
                while (it.hasNext()) {
                    builderM.addDataSourceId((String) it.next());
                }
                Iterator<T> it2 = this.this$0.getMedicalResourceTypes().iterator();
                while (it2.hasNext()) {
                    builderM.addMedicalResourceType(((Number) it2.next()).intValue());
                }
                return builderM.build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformReadMedicalResourcesRequest = FhirVersion$$ExternalSyntheticApiModelOutline0.m414m(objWithPhrFeatureCheck);
    }

    public /* synthetic */ DeleteMedicalResourcesRequest(Set set, Set set2, int i, zcm zcmVar) {
        this((i & 1) != 0 ? zaj.d() : set, (i & 2) != 0 ? zaj.d() : set2);
    }

    public final Set<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    public final Set<Integer> getMedicalResourceTypes() {
        return this.medicalResourceTypes;
    }

    /* JADX INFO: renamed from: getPlatformReadMedicalResourcesRequest$connect_client_release, reason: from getter */
    public final android.health.connect.DeleteMedicalResourcesRequest getPlatformReadMedicalResourcesRequest() {
        return this.platformReadMedicalResourcesRequest;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("dataSourceIds", this.dataSourceIds), yyz.c("medicalResourceTypes", this.medicalResourceTypes)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteMedicalResourcesRequest)) {
            return false;
        }
        DeleteMedicalResourcesRequest deleteMedicalResourcesRequest = (DeleteMedicalResourcesRequest) other;
        return zcp.b(this.dataSourceIds, deleteMedicalResourcesRequest.dataSourceIds) && zcp.b(this.medicalResourceTypes, deleteMedicalResourcesRequest.medicalResourceTypes);
    }

    public int hashCode() {
        return (this.dataSourceIds.hashCode() * 31) + this.medicalResourceTypes.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteMedicalResourcesRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
