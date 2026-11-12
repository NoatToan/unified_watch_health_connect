package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zdm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Landroidx/health/connect/client/records/MenstruationFlowRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "flow", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;I)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getFlow$annotations", "()V", "getFlow", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "Flows", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstruationFlowRecord implements InstantaneousRecord {
    public static final int FLOW_HEAVY = 3;
    public static final int FLOW_LIGHT = 1;
    public static final int FLOW_MEDIUM = 2;
    public static final Map<Integer, String> FLOW_TYPE_INT_TO_STRING_MAP;
    public static final Map<String, Integer> FLOW_TYPE_STRING_TO_INT_MAP;
    public static final int FLOW_UNKNOWN = 0;
    private final int flow;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/MenstruationFlowRecord$Flows;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Flows {
    }

    public static /* synthetic */ void getFlow$annotations() {
    }

    public MenstruationFlowRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.flow = i;
    }

    public /* synthetic */ MenstruationFlowRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i, int i2, zcm zcmVar) {
        this(instant, zoneOffset, metadata, (i2 & 8) != 0 ? 0 : i);
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getFlow() {
        return this.flow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationFlowRecord)) {
            return false;
        }
        MenstruationFlowRecord menstruationFlowRecord = (MenstruationFlowRecord) other;
        return this.flow == menstruationFlowRecord.flow && zcp.b(getTime(), menstruationFlowRecord.getTime()) && zcp.b(getZoneOffset(), menstruationFlowRecord.getZoneOffset()) && zcp.b(getMetadata(), menstruationFlowRecord.getMetadata());
    }

    public int hashCode() {
        int i = this.flow;
        int iHashCode = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((i * 31) + iHashCode) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "MenstruationFlowRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", flow=" + this.flow + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(CervicalMucusRecord.Sensation.LIGHT, 1), yyz.c(CervicalMucusRecord.Sensation.MEDIUM, 2), yyz.c(CervicalMucusRecord.Sensation.HEAVY, 3));
        FLOW_TYPE_STRING_TO_INT_MAP = mapE;
        Set<Map.Entry<String, Integer>> setEntrySet = mapE.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        FLOW_TYPE_INT_TO_STRING_MAP = linkedHashMap;
    }
}
