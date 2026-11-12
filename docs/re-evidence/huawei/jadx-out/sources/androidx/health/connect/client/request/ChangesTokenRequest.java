package androidx.health.connect.client.request;

import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.metadata.DataOrigin;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import java.util.Set;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R!\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/request/ChangesTokenRequest;", "", "recordTypes", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "dataOriginFilters", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "getRecordTypes", "()Ljava/util/Set;", "getDataOriginFilters", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangesTokenRequest {
    private final Set<DataOrigin> dataOriginFilters;
    private final Set<KClass<? extends Record>> recordTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangesTokenRequest(Set<? extends KClass<? extends Record>> set, Set<DataOrigin> set2) {
        zcp.c(set, "");
        zcp.c(set2, "");
        this.recordTypes = set;
        this.dataOriginFilters = set2;
    }

    public final Set<KClass<? extends Record>> getRecordTypes() {
        return this.recordTypes;
    }

    public /* synthetic */ ChangesTokenRequest(Set set, Set set2, int i, zcm zcmVar) {
        this(set, (i & 2) != 0 ? zaj.d() : set2);
    }

    public final Set<DataOrigin> getDataOriginFilters() {
        return this.dataOriginFilters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        ChangesTokenRequest changesTokenRequest = (ChangesTokenRequest) other;
        return zcp.b(this.recordTypes, changesTokenRequest.recordTypes) && zcp.b(this.dataOriginFilters, changesTokenRequest.dataOriginFilters);
    }

    public int hashCode() {
        return (this.recordTypes.hashCode() * 31) + this.dataOriginFilters.hashCode();
    }
}
