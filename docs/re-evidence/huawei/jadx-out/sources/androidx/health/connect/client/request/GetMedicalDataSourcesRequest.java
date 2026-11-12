package androidx.health.connect.client.request;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00060\nj\u0002`\u000b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/health/connect/client/request/GetMedicalDataSourcesRequest;", "", "packageNames", "", "", "<init>", "(Ljava/util/List;)V", "getPackageNames", "()Ljava/util/List;", "platformGetMedicalDataSourcesRequest", "Landroid/health/connect/GetMedicalDataSourcesRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformGetMedicalDataSourcesRequest;", "getPlatformGetMedicalDataSourcesRequest$connect_client_release", "()Landroid/health/connect/GetMedicalDataSourcesRequest;", "toString", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetMedicalDataSourcesRequest {
    private final List<String> packageNames;
    private final android.health.connect.GetMedicalDataSourcesRequest platformGetMedicalDataSourcesRequest;

    public GetMedicalDataSourcesRequest(List<String> list) {
        zcp.c(list, "");
        this.packageNames = list;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.GetMedicalDataSourcesRequest>() { // from class: androidx.health.connect.client.request.GetMedicalDataSourcesRequest$platformGetMedicalDataSourcesRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.GetMedicalDataSourcesRequest invoke() {
                android.health.connect.GetMedicalDataSourcesRequest.Builder builderM415m = FhirVersion$$ExternalSyntheticApiModelOutline0.m415m();
                Iterator<T> it = this.this$0.getPackageNames().iterator();
                while (it.hasNext()) {
                    builderM415m.addPackageName((String) it.next());
                }
                return builderM415m.build();
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformGetMedicalDataSourcesRequest = FhirVersion$$ExternalSyntheticApiModelOutline0.m416m(objWithPhrFeatureCheck);
    }

    public final List<String> getPackageNames() {
        return this.packageNames;
    }

    /* JADX INFO: renamed from: getPlatformGetMedicalDataSourcesRequest$connect_client_release, reason: from getter */
    public final android.health.connect.GetMedicalDataSourcesRequest getPlatformGetMedicalDataSourcesRequest() {
        return this.platformGetMedicalDataSourcesRequest;
    }

    public String toString() {
        return UtilsKt.toString(this, zae.a(yyz.c("packageNames", this.packageNames)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        GetMedicalDataSourcesRequest getMedicalDataSourcesRequest = (GetMedicalDataSourcesRequest) other;
        return zcp.b(this.packageNames, getMedicalDataSourcesRequest.packageNames) && zcp.b(this.platformGetMedicalDataSourcesRequest, getMedicalDataSourcesRequest.platformGetMedicalDataSourcesRequest);
    }

    public int hashCode() {
        return (this.packageNames.hashCode() * 31) + this.platformGetMedicalDataSourcesRequest.hashCode();
    }
}
