package gu0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgu0/b;", "", "", "deviceId", "", "isLiveEventSharingON", "endTimeStamp", "isLiveTrackEnabled", "", "Lju0/c;", "messageTriggers", "Lju0/b;", "messageContents", "", "estTargetDistance", "msgTriggerDistance", "msgTriggerTime", "<init>", "(JLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f79037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f79038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f79039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ju0.c> f79040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<ju0.b> f79041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f79042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f79043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f79044i;

    public b(long j8, Boolean bool, Long l14, Boolean bool2, List<ju0.c> list, List<ju0.b> list2, Integer num, Integer num2, Integer num3) {
        this.f79036a = j8;
        this.f79037b = bool;
        this.f79038c = l14;
        this.f79039d = bool2;
        this.f79040e = list;
        this.f79041f = list2;
        this.f79042g = num;
        this.f79043h = num2;
        this.f79044i = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f79036a == bVar.f79036a && s.g(this.f79037b, bVar.f79037b) && s.g(this.f79038c, bVar.f79038c) && s.g(this.f79039d, bVar.f79039d) && s.g(this.f79040e, bVar.f79040e) && s.g(this.f79041f, bVar.f79041f) && s.g(this.f79042g, bVar.f79042g) && s.g(this.f79043h, bVar.f79043h) && s.g(this.f79044i, bVar.f79044i);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f79036a) * 31;
        Boolean bool = this.f79037b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.f79038c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool2 = this.f79039d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<ju0.c> list = this.f79040e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<ju0.b> list2 = this.f79041f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f79042g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79043h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f79044i;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "LiveEventSettingsRecord(deviceId=" + this.f79036a + ", isLiveEventSharingON=" + this.f79037b + ", endTimeStamp=" + this.f79038c + ", isLiveTrackEnabled=" + this.f79039d + ", messageTriggers=" + this.f79040e + ", messageContents=" + this.f79041f + ", estTargetDistance=" + this.f79042g + ", msgTriggerDistance=" + this.f79043h + ", msgTriggerTime=" + this.f79044i + ")";
    }
}
