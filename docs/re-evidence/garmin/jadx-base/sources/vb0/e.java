package vb0;

import com.google.gson.annotations.SerializedName;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lvb0/e;", "", "", "unitId", "deviceRemovalTimestamp", "reminderDismissalTimestamp", "<init>", "(JJJ)V", "a", "J", "b", "()J", "c", "getReminderDismissalTimestamp", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final long unitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceRemovalTimestamp")
    private final long deviceRemovalTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderDismissalTimestamp")
    private final long reminderDismissalTimestamp;

    public /* synthetic */ e(long j8, long j14, long j15, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? -1L : j14, (i14 & 4) != 0 ? -1L : j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDeviceRemovalTimestamp() {
        return this.deviceRemovalTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUnitId() {
        return this.unitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.unitId == eVar.unitId && this.deviceRemovalTimestamp == eVar.deviceRemovalTimestamp && this.reminderDismissalTimestamp == eVar.reminderDismissalTimestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.reminderDismissalTimestamp) + f.e(Long.hashCode(this.unitId) * 31, 31, this.deviceRemovalTimestamp);
    }

    public final String toString() {
        long j8 = this.unitId;
        long j14 = this.deviceRemovalTimestamp;
        long j15 = this.reminderDismissalTimestamp;
        StringBuilder sbK = e0.k(j8, "SubscriptionBannerDismissData(unitId=", ", deviceRemovalTimestamp=");
        sbK.append(j14);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j15, ", reminderDismissalTimestamp=", ")", sbK);
    }

    public e(long j8, long j14, long j15) {
        this.unitId = j8;
        this.deviceRemovalTimestamp = j14;
        this.reminderDismissalTimestamp = j15;
    }
}
