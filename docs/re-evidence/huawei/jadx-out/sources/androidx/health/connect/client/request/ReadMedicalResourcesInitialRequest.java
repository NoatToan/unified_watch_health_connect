package androidx.health.connect.client.request;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.impl.platform.records.IntDefMappingsKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00060\u000fj\u0002`\u00108\u0010X\u0091\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/health/connect/client/request/ReadMedicalResourcesInitialRequest;", "Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;", "medicalResourceType", "", "medicalDataSourceIds", "", "", IAchieveDBMgr.PARAM_PAGE_SIZE, "<init>", "(ILjava/util/Set;I)V", "getMedicalResourceType", "()I", "getMedicalDataSourceIds", "()Ljava/util/Set;", "platformReadMedicalResourcesRequest", "Landroid/health/connect/ReadMedicalResourcesRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformReadMedicalResourcesRequest;", "getPlatformReadMedicalResourcesRequest$connect_client_release", "()Landroid/health/connect/ReadMedicalResourcesRequest;", "toString", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadMedicalResourcesInitialRequest extends ReadMedicalResourcesRequest {
    private final Set<String> medicalDataSourceIds;
    private final int medicalResourceType;
    private final android.health.connect.ReadMedicalResourcesRequest platformReadMedicalResourcesRequest;

    public /* synthetic */ ReadMedicalResourcesInitialRequest(int i, Set set, int i2, int i3, zcm zcmVar) {
        this(i, set, (i3 & 4) != 0 ? 1000 : i2);
    }

    public final int getMedicalResourceType() {
        return this.medicalResourceType;
    }

    public final Set<String> getMedicalDataSourceIds() {
        return this.medicalDataSourceIds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadMedicalResourcesInitialRequest(int i, Set<String> set, final int i2) {
        super(i2);
        zcp.c(set, "");
        this.medicalResourceType = i;
        this.medicalDataSourceIds = set;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.ReadMedicalResourcesInitialRequest>() { // from class: androidx.health.connect.client.request.ReadMedicalResourcesInitialRequest$platformReadMedicalResourcesRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.ReadMedicalResourcesInitialRequest invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$7();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(IntDefMappingsKt.toPlatformMedicalResourceType(this.this$0.getMedicalResourceType())).addDataSourceIds(this.this$0.getMedicalDataSourceIds()).setPageSize(i2).build();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformReadMedicalResourcesRequest = FhirVersion$$ExternalSyntheticApiModelOutline0.m419m(objWithPhrFeatureCheck);
    }

    @Override // androidx.health.connect.client.request.ReadMedicalResourcesRequest
    /* JADX INFO: renamed from: getPlatformReadMedicalResourcesRequest$connect_client_release, reason: from getter */
    public android.health.connect.ReadMedicalResourcesRequest getPlatformReadMedicalResourcesRequest() {
        return this.platformReadMedicalResourcesRequest;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.e(yyz.c("medicalResourceType", Integer.valueOf(this.medicalResourceType)), yyz.c("medicalDataSourceIds", this.medicalDataSourceIds), yyz.c(IAchieveDBMgr.PARAM_PAGE_SIZE, Integer.valueOf(getPageSize()))));
    }

    @Override // androidx.health.connect.client.request.ReadMedicalResourcesRequest
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMedicalResourcesInitialRequest) || !super.equals(other)) {
            return false;
        }
        ReadMedicalResourcesInitialRequest readMedicalResourcesInitialRequest = (ReadMedicalResourcesInitialRequest) other;
        return this.medicalResourceType == readMedicalResourcesInitialRequest.medicalResourceType && zcp.b(this.medicalDataSourceIds, readMedicalResourcesInitialRequest.medicalDataSourceIds);
    }

    @Override // androidx.health.connect.client.request.ReadMedicalResourcesRequest
    public int hashCode() {
        return (((super.hashCode() * 31) + this.medicalResourceType) * 31) + this.medicalDataSourceIds.hashCode();
    }
}
