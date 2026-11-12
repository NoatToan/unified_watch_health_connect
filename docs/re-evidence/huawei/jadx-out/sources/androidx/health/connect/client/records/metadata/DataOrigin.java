package androidx.health.connect.client.records.metadata;

import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/records/metadata/DataOrigin;", "", "packageName", "", "<init>", "(Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataOrigin {
    private final String packageName;

    public DataOrigin(String str) {
        zcp.c(str, "");
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataOrigin) && zcp.b((Object) this.packageName, (Object) ((DataOrigin) other).packageName);
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public String toString() {
        return "DataOrigin(packageName='" + this.packageName + Constants.RIGHT_BRACKET;
    }
}
