package uv;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import uv.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luv/i;", "Luv/h;", "T", "", "deviceSettings", "Luv/e;", "firmwareUpdateItem", "", "batteryStatus", "Lorg/joda/time/DateTime;", "batteryStatusTimeStamp", "<init>", "(Luv/h;Luv/e;ILorg/joda/time/DateTime;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i<T extends h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f172898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f172899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DateTime f172901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f172902e;

    public /* synthetic */ i(h hVar, e eVar, int i14, DateTime dateTime, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : hVar, (i15 & 2) != 0 ? null : eVar, (i15 & 4) != 0 ? -1 : i14, (i15 & 8) != 0 ? null : dateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f172898a, iVar.f172898a) && s.g(this.f172899b, iVar.f172899b) && this.f172900c == iVar.f172900c && s.g(this.f172901d, iVar.f172901d);
    }

    public final int hashCode() {
        T t7 = this.f172898a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        e eVar = this.f172899b;
        int iD = q2.d(this.f172900c, (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31);
        DateTime dateTime = this.f172901d;
        return iD + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final String toString() {
        return "SensorGeneralSettings(deviceSettings=" + this.f172898a + ", firmwareUpdateItem=" + this.f172899b + ", batteryStatus=" + this.f172900c + ", batteryStatusTimeStamp=" + this.f172901d + ")";
    }

    public i(T t7, e eVar, int i14, DateTime dateTime) {
        this.f172898a = t7;
        this.f172899b = eVar;
        this.f172900c = i14;
        this.f172901d = dateTime;
        this.f172902e = "0";
    }

    public i() {
        this(null, null, 0, null, 15, null);
    }
}
