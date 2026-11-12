package androidx.health.connect.client.request;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.time.TimeRangeFilter;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002()BY\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013BO\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0014J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b$J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010'\u001a\u00020\u000eH\u0016R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8G¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u00020\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00108G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u0006*"}, d2 = {"Landroidx/health/connect/client/request/ReadRecordsRequest;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "", "recordType", "Lkotlin/reflect/KClass;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "dataOriginFilter", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "ascendingOrder", "", IAchieveDBMgr.PARAM_PAGE_SIZE, "", "pageToken", "", "deduplicateStrategy", "<init>", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Ljava/util/Set;ZILjava/lang/String;I)V", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Ljava/util/Set;ZILjava/lang/String;)V", "getRecordType", "()Lkotlin/reflect/KClass;", "getTimeRangeFilter", "()Landroidx/health/connect/client/time/TimeRangeFilter;", "getDataOriginFilter", "()Ljava/util/Set;", "getAscendingOrder", "()Z", "getPageSize", "()I", "getPageToken", "()Ljava/lang/String;", "getDeduplicateStrategy", "withPageToken", "newPageToken", "withPageToken$connect_client_release", "equals", "other", WatchFaceConstant.HASHCODE, "DeduplicationStrategy", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadRecordsRequest<T extends Record> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEDUPLICATION_STRATEGY_DISABLED = 0;
    public static final int DEDUPLICATION_STRATEGY_ENABLED_DEFAULT = 1;
    public static final int DEDUPLICATION_STRATEGY_ENABLED_PRIORITIZE_CALLING_APP = 2;
    private final boolean ascendingOrder;
    private final Set<DataOrigin> dataOriginFilter;
    private final int deduplicateStrategy;
    private final int pageSize;
    private final String pageToken;
    private final KClass<T> recordType;
    private final TimeRangeFilter timeRangeFilter;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/request/ReadRecordsRequest$DeduplicationStrategy;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DeduplicationStrategy {
    }

    public ReadRecordsRequest(KClass<T> kClass, TimeRangeFilter timeRangeFilter, Set<DataOrigin> set, boolean z, int i, String str, int i2) {
        zcp.c(kClass, "");
        zcp.c(timeRangeFilter, "");
        zcp.c(set, "");
        this.recordType = kClass;
        this.timeRangeFilter = timeRangeFilter;
        this.dataOriginFilter = set;
        this.ascendingOrder = z;
        this.pageSize = i;
        this.pageToken = str;
        this.deduplicateStrategy = i2;
        if (i <= 0) {
            throw new IllegalArgumentException("pageSize must be positive.".toString());
        }
    }

    public final KClass<T> getRecordType() {
        return this.recordType;
    }

    public final TimeRangeFilter getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    public final Set<DataOrigin> getDataOriginFilter() {
        return this.dataOriginFilter;
    }

    public /* synthetic */ ReadRecordsRequest(KClass kClass, TimeRangeFilter timeRangeFilter, Set set, boolean z, int i, String str, int i2, int i3, zcm zcmVar) {
        this(kClass, timeRangeFilter, (i3 & 4) != 0 ? zaj.d() : set, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? 1000 : i, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? 1 : i2);
    }

    public final boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final int getDeduplicateStrategy() {
        return this.deduplicateStrategy;
    }

    public /* synthetic */ ReadRecordsRequest(KClass kClass, TimeRangeFilter timeRangeFilter, Set set, boolean z, int i, String str, int i2, zcm zcmVar) {
        this(kClass, timeRangeFilter, (i2 & 4) != 0 ? zaj.d() : set, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? 1000 : i, (i2 & 32) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReadRecordsRequest(KClass<T> kClass, TimeRangeFilter timeRangeFilter, Set<DataOrigin> set, boolean z, int i, String str) {
        this(kClass, timeRangeFilter, set, z, i, str, 0);
        zcp.c(kClass, "");
        zcp.c(timeRangeFilter, "");
        zcp.c(set, "");
    }

    public final ReadRecordsRequest<T> withPageToken$connect_client_release(String newPageToken) {
        return new ReadRecordsRequest<>(this.recordType, this.timeRangeFilter, this.dataOriginFilter, this.ascendingOrder, this.pageSize, newPageToken, this.deduplicateStrategy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        ReadRecordsRequest readRecordsRequest = (ReadRecordsRequest) other;
        return zcp.b(this.recordType, readRecordsRequest.recordType) && zcp.b(this.timeRangeFilter, readRecordsRequest.timeRangeFilter) && zcp.b(this.dataOriginFilter, readRecordsRequest.dataOriginFilter) && this.ascendingOrder == readRecordsRequest.ascendingOrder && this.pageSize == readRecordsRequest.pageSize && zcp.b((Object) this.pageToken, (Object) readRecordsRequest.pageToken) && this.deduplicateStrategy == readRecordsRequest.deduplicateStrategy;
    }

    public int hashCode() {
        int iHashCode = this.recordType.hashCode();
        int iHashCode2 = this.timeRangeFilter.hashCode();
        int iHashCode3 = this.dataOriginFilter.hashCode();
        int iHashCode4 = Boolean.hashCode(this.ascendingOrder);
        int i = this.pageSize;
        String str = this.pageToken;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.deduplicateStrategy);
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/health/connect/client/request/ReadRecordsRequest$Companion;", "", "<init>", "()V", "DEDUPLICATION_STRATEGY_DISABLED", "", "getDEDUPLICATION_STRATEGY_DISABLED$annotations", "DEDUPLICATION_STRATEGY_ENABLED_DEFAULT", "getDEDUPLICATION_STRATEGY_ENABLED_DEFAULT$annotations", "DEDUPLICATION_STRATEGY_ENABLED_PRIORITIZE_CALLING_APP", "getDEDUPLICATION_STRATEGY_ENABLED_PRIORITIZE_CALLING_APP$annotations", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getDEDUPLICATION_STRATEGY_DISABLED$annotations() {
        }

        public static /* synthetic */ void getDEDUPLICATION_STRATEGY_ENABLED_DEFAULT$annotations() {
        }

        public static /* synthetic */ void getDEDUPLICATION_STRATEGY_ENABLED_PRIORITIZE_CALLING_APP$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
