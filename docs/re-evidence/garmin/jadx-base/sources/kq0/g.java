package kq0;

import com.garmin.proto.generated.GDILiveTrackProto;
import cq0.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkq0/g;", "", "Lcq0/l;", "incidentState", "", "userName", "", "deviceId", "", "isFallDetection", "Lcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;", "incidentDetectedProto", "Ljava/util/Locale;", "locale", "", "Ll20/a;", "contactList", "", "incidentCountDownSecondsRemaining", "iAmOkCountDownSecondsRemaining", "Lcq0/f;", "finishHow", "hasReceivedCancelAction", "Lcom/garmin/proto/generated/GDILiveTrackProto$StartRequest;", "liveTrackProto", "<init>", "(Lcq0/l;Ljava/lang/String;JZLcom/garmin/proto/generated/GDILiveTrackProto$EmergencyCountdownNotification;Ljava/util/Locale;Ljava/util/List;IILcq0/f;ZLcom/garmin/proto/generated/GDILiveTrackProto$StartRequest;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f106157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f106159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f106160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GDILiveTrackProto.EmergencyCountdownNotification f106161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Locale f106162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<l20.a> f106163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f106164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f106165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cq0.f f106166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f106167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GDILiveTrackProto.StartRequest f106168l;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(l lVar, String str, long j8, boolean z14, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, Locale locale, List list, int i14, int i15, cq0.f fVar, boolean z15, GDILiveTrackProto.StartRequest startRequest, int i16, p005kotlin.jvm.internal.j jVar) {
        Locale locale2;
        l lVar2 = (i16 & 1) != 0 ? l.NONE : lVar;
        String str2 = (i16 & 2) != 0 ? null : str;
        long j14 = (i16 & 4) != 0 ? -1L : j8;
        boolean z16 = (i16 & 8) != 0 ? false : z14;
        GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification2 = (i16 & 16) != 0 ? null : emergencyCountdownNotification;
        if ((i16 & 32) != 0) {
            locale2 = Locale.getDefault();
            locale2.getClass();
        } else {
            locale2 = locale;
        }
        this(lVar2, str2, j14, z16, emergencyCountdownNotification2, locale2, (i16 & 64) != 0 ? null : list, (i16 & 128) != 0 ? -1 : i14, (i16 & 256) == 0 ? i15 : -1, (i16 & 512) != 0 ? null : fVar, (i16 & 1024) == 0 ? z15 : false, (i16 & 2048) != 0 ? null : startRequest);
    }

    public static g a(g gVar, l lVar, long j8, boolean z14, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, List list, int i14, int i15, cq0.f fVar, GDILiveTrackProto.StartRequest startRequest, int i16) {
        l lVar2 = (i16 & 1) != 0 ? gVar.f106157a : lVar;
        String str = gVar.f106158b;
        long j14 = (i16 & 4) != 0 ? gVar.f106159c : j8;
        boolean z15 = (i16 & 8) != 0 ? gVar.f106160d : z14;
        GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification2 = (i16 & 16) != 0 ? gVar.f106161e : emergencyCountdownNotification;
        Locale locale = gVar.f106162f;
        List list2 = (i16 & 64) != 0 ? gVar.f106163g : list;
        int i17 = (i16 & 128) != 0 ? gVar.f106164h : i14;
        int i18 = (i16 & 256) != 0 ? gVar.f106165i : i15;
        cq0.f fVar2 = (i16 & 512) != 0 ? gVar.f106166j : fVar;
        boolean z16 = (i16 & 1024) != 0 ? gVar.f106167k : true;
        GDILiveTrackProto.StartRequest startRequest2 = (i16 & 2048) != 0 ? gVar.f106168l : startRequest;
        gVar.getClass();
        lVar2.getClass();
        locale.getClass();
        return new g(lVar2, str, j14, z15, emergencyCountdownNotification2, locale, list2, i17, i18, fVar2, z16, startRequest2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f106157a == gVar.f106157a && s.g(this.f106158b, gVar.f106158b) && this.f106159c == gVar.f106159c && this.f106160d == gVar.f106160d && s.g(this.f106161e, gVar.f106161e) && s.g(this.f106162f, gVar.f106162f) && s.g(this.f106163g, gVar.f106163g) && this.f106164h == gVar.f106164h && this.f106165i == gVar.f106165i && this.f106166j == gVar.f106166j && this.f106167k == gVar.f106167k && s.g(this.f106168l, gVar.f106168l);
    }

    public final int hashCode() {
        int iHashCode = this.f106157a.hashCode() * 31;
        String str = this.f106158b;
        int iG = q6.f.g(q6.f.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f106159c), 31, this.f106160d);
        GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification = this.f106161e;
        int iHashCode2 = (this.f106162f.hashCode() + ((iG + (emergencyCountdownNotification == null ? 0 : emergencyCountdownNotification.hashCode())) * 31)) * 31;
        List<l20.a> list = this.f106163g;
        int iD = q2.d(this.f106165i, q2.d(this.f106164h, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        cq0.f fVar = this.f106166j;
        int iG2 = q6.f.g((iD + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f106167k);
        GDILiveTrackProto.StartRequest startRequest = this.f106168l;
        return iG2 + (startRequest != null ? startRequest.hashCode() : 0);
    }

    public final String toString() {
        return "State(incidentState=" + this.f106157a + ", userName=" + this.f106158b + ", deviceId=" + this.f106159c + ", isFallDetection=" + this.f106160d + ", incidentDetectedProto=" + this.f106161e + ", locale=" + this.f106162f + ", contactList=" + this.f106163g + ", incidentCountDownSecondsRemaining=" + this.f106164h + ", iAmOkCountDownSecondsRemaining=" + this.f106165i + ", finishHow=" + this.f106166j + ", hasReceivedCancelAction=" + this.f106167k + ", liveTrackProto=" + this.f106168l + ")";
    }

    public g(l lVar, String str, long j8, boolean z14, GDILiveTrackProto.EmergencyCountdownNotification emergencyCountdownNotification, Locale locale, List<l20.a> list, int i14, int i15, cq0.f fVar, boolean z15, GDILiveTrackProto.StartRequest startRequest) {
        lVar.getClass();
        locale.getClass();
        this.f106157a = lVar;
        this.f106158b = str;
        this.f106159c = j8;
        this.f106160d = z14;
        this.f106161e = emergencyCountdownNotification;
        this.f106162f = locale;
        this.f106163g = list;
        this.f106164h = i14;
        this.f106165i = i15;
        this.f106166j = fVar;
        this.f106167k = z15;
        this.f106168l = startRequest;
    }

    public g() {
        this(null, null, 0L, false, null, null, null, 0, 0, null, false, null, 4095, null);
    }
}
