package androidx.health.connect.client.request;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.UtilsKt;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00060\u000bj\u0002`\f8\u0010X\u0091\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/health/connect/client/request/ReadMedicalResourcesPageRequest;", "Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;", "pageToken", "", IAchieveDBMgr.PARAM_PAGE_SIZE, "", "<init>", "(Ljava/lang/String;I)V", "getPageToken", "()Ljava/lang/String;", "platformReadMedicalResourcesRequest", "Landroid/health/connect/ReadMedicalResourcesRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformReadMedicalResourcesRequest;", "getPlatformReadMedicalResourcesRequest$connect_client_release", "()Landroid/health/connect/ReadMedicalResourcesRequest;", "toString", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadMedicalResourcesPageRequest extends ReadMedicalResourcesRequest {
    private final String pageToken;
    private final android.health.connect.ReadMedicalResourcesRequest platformReadMedicalResourcesRequest;

    public /* synthetic */ ReadMedicalResourcesPageRequest(String str, int i, int i2, zcm zcmVar) {
        this(str, (i2 & 2) != 0 ? 1000 : i);
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadMedicalResourcesPageRequest(String str, final int i) {
        super(i);
        zcp.c(str, "");
        this.pageToken = str;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.ReadMedicalResourcesPageRequest>() { // from class: androidx.health.connect.client.request.ReadMedicalResourcesPageRequest$platformReadMedicalResourcesRequest$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.ReadMedicalResourcesPageRequest invoke() {
                FhirVersion$$ExternalSyntheticApiModelOutline0.m$8();
                return FhirVersion$$ExternalSyntheticApiModelOutline0.m(this.this$0.getPageToken()).setPageSize(i).build();
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
        return UtilsKt.toString(this, zae.e(yyz.c("pageToken", this.pageToken), yyz.c(IAchieveDBMgr.PARAM_PAGE_SIZE, Integer.valueOf(getPageSize()))));
    }

    @Override // androidx.health.connect.client.request.ReadMedicalResourcesRequest
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReadMedicalResourcesPageRequest) && super.equals(other) && zcp.b((Object) this.pageToken, (Object) ((ReadMedicalResourcesPageRequest) other).pageToken);
    }

    @Override // androidx.health.connect.client.request.ReadMedicalResourcesRequest
    public int hashCode() {
        return (super.hashCode() * 31) + this.pageToken.hashCode();
    }
}
