package androidx.health.connect.client.request;

import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00060\tj\u0002`\nX \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;", "", IAchieveDBMgr.PARAM_PAGE_SIZE, "", "<init>", "(I)V", "getPageSize", "()I", "platformReadMedicalResourcesRequest", "Landroid/health/connect/ReadMedicalResourcesRequest;", "Landroidx/health/connect/client/impl/platform/request/PlatformReadMedicalResourcesRequest;", "getPlatformReadMedicalResourcesRequest$connect_client_release", "()Landroid/health/connect/ReadMedicalResourcesRequest;", "equals", "", "other", WatchFaceConstant.HASHCODE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReadMedicalResourcesRequest {
    public static final int DEFAULT_PAGE_SIZE = 1000;
    private final int pageSize;

    public abstract android.health.connect.ReadMedicalResourcesRequest getPlatformReadMedicalResourcesRequest$connect_client_release();

    public ReadMedicalResourcesRequest(int i) {
        this.pageSize = i;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReadMedicalResourcesRequest) && this.pageSize == ((ReadMedicalResourcesRequest) other).pageSize;
    }

    public int hashCode() {
        return this.pageSize;
    }
}
