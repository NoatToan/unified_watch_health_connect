package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated(message = "ODI已经废弃")
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lct;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "startTime", "stopTime", "odi", "<init>", "(JJJ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ct extends Spo2Data {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14689b;

    public ct(long j, long j2, long j3) {
        super(j);
        this.f14688a = j2;
        this.f14689b = j3;
    }

    @NotNull
    public String toString() {
        return "Spo2OdiData, startTime: " + getTimeStamp() + ", stopTime: " + this.f14688a + ", odi: " + this.f14689b;
    }
}
