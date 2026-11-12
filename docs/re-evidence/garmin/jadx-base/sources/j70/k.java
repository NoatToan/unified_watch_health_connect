package j70;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.LatLng;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o4.v0;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p13.l0;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lj70/k;", "", "<init>", "()V", "c", "g", "a", "f", "h", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "b", "d", "Lj70/k$a;", "Lj70/k$b;", "Lj70/k$c;", "Lj70/k$e;", "Lj70/k$f;", "Lj70/k$g;", "Lj70/k$h;", "Lj70/k$i;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj70/k$b;", "Lj70/k;", "Lyz1/d;", "status", "", "Lpb2/b$b;", "activities", "Lpb2/b$d;", "streaks", "<init>", "(Lyz1/d;Ljava/util/List;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<pb2.b.C2596b> f97548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<pb2.b.d> f97549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yz1.d dVar, List<pb2.b.C2596b> list, List<pb2.b.d> list2) {
            super(null);
            dVar.getClass();
            this.f97547a = dVar;
            this.f97548b = list;
            this.f97549c = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f97547a, bVar.f97547a) && p005kotlin.jvm.internal.s.g(this.f97548b, bVar.f97548b) && p005kotlin.jvm.internal.s.g(this.f97549c, bVar.f97549c);
        }

        public final int hashCode() {
            int iHashCode = this.f97547a.hashCode() * 31;
            List<pb2.b.C2596b> list = this.f97548b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<pb2.b.d> list2 = this.f97549c;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ActivitiesAndStreaks(status=");
            sb3.append(this.f97547a);
            sb3.append(", activities=");
            sb3.append(this.f97548b);
            sb3.append(", streaks=");
            return u62.z.c(sb3, this.f97549c, ")");
        }
    }

    public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private k() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj70/k$d;", "", "", "Lo70/c;", "checkedTrends", "<init>", "(Ljava/util/Set;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<o70.c> f97559a;

        public d(Set set, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? l0.f134950a : set);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f97559a, ((d) obj).f97559a);
        }

        public final int hashCode() {
            return this.f97559a.hashCode();
        }

        public final String toString() {
            return "ActivityTrendDismissedPrompts(checkedTrends=" + this.f97559a + ")";
        }

        public d() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Set<? extends o70.c> set) {
            set.getClass();
            this.f97559a = set;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj70/k$a;", "Lj70/k;", "Lyz1/d;", "status", "Lo13/p;", "Lff2/a;", "Lo4/v0;", "data", "<init>", "(Lyz1/d;Lo13/p;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.p<ff2.a, v0> f97546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yz1.d dVar, o13.p<ff2.a, ? extends v0> pVar) {
            super(null);
            dVar.getClass();
            this.f97545a = dVar;
            this.f97546b = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f97545a, aVar.f97545a) && p005kotlin.jvm.internal.s.g(this.f97546b, aVar.f97546b);
        }

        public final int hashCode() {
            int iHashCode = this.f97545a.hashCode() * 31;
            o13.p<ff2.a, v0> pVar = this.f97546b;
            return iHashCode + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            return "ActiveCampaign(status=" + this.f97545a + ", data=" + this.f97546b + ")";
        }

        public /* synthetic */ a(yz1.d dVar, o13.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : pVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj70/k$g;", "Lj70/k;", "Lyz1/d;", "status", "", "data", "<init>", "(Lyz1/d;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yz1.d dVar, String str) {
            super(null);
            dVar.getClass();
            this.f97591a = dVar;
            this.f97592b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p005kotlin.jvm.internal.s.g(this.f97591a, gVar.f97591a) && p005kotlin.jvm.internal.s.g(this.f97592b, gVar.f97592b);
        }

        public final int hashCode() {
            int iHashCode = this.f97591a.hashCode() * 31;
            String str = this.f97592b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Ecg(status=" + this.f97591a + ", data=" + this.f97592b + ")";
        }

        public /* synthetic */ g(yz1.d dVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj70/k$i;", "Lj70/k;", "Lyz1/d;", "status", "", "workoutSchedule", "atpTypes", "fitnessStatsActivities", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f97602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(yz1.d dVar, String str, String str2, String str3) {
            super(null);
            dVar.getClass();
            this.f97599a = dVar;
            this.f97600b = str;
            this.f97601c = str2;
            this.f97602d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p005kotlin.jvm.internal.s.g(this.f97599a, iVar.f97599a) && p005kotlin.jvm.internal.s.g(this.f97600b, iVar.f97600b) && p005kotlin.jvm.internal.s.g(this.f97601c, iVar.f97601c) && p005kotlin.jvm.internal.s.g(this.f97602d, iVar.f97602d);
        }

        public final int hashCode() {
            int iHashCode = this.f97599a.hashCode() * 31;
            String str = this.f97600b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f97601c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97602d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("TrainingPlans(status=");
            sb3.append(this.f97599a);
            sb3.append(", workoutSchedule=");
            sb3.append(this.f97600b);
            sb3.append(", atpTypes=");
            return e5.h(sb3, this.f97601c, ", fitnessStatsActivities=", this.f97602d, ")");
        }

        public /* synthetic */ i(yz1.d dVar, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, str3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj70/k$e;", "Lj70/k;", "Lyz1/d;", "status", "", "adHocPendingInviteChallenges", "adHocChallenges", "badgeChallenges", "expeditionChallenges", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f97563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f97564e;

        public /* synthetic */ e(yz1.d dVar, String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f97560a, eVar.f97560a) && p005kotlin.jvm.internal.s.g(this.f97561b, eVar.f97561b) && p005kotlin.jvm.internal.s.g(this.f97562c, eVar.f97562c) && p005kotlin.jvm.internal.s.g(this.f97563d, eVar.f97563d) && p005kotlin.jvm.internal.s.g(this.f97564e, eVar.f97564e);
        }

        public final int hashCode() {
            int iHashCode = this.f97560a.hashCode() * 31;
            String str = this.f97561b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f97562c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97563d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f97564e;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Challenges(status=");
            sb3.append(this.f97560a);
            sb3.append(", adHocPendingInviteChallenges=");
            sb3.append(this.f97561b);
            sb3.append(", adHocChallenges=");
            sn.a.t(sb3, this.f97562c, ", badgeChallenges=", this.f97563d, ", expeditionChallenges=");
            return am.j.o(this.f97564e, ")", sb3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yz1.d dVar, String str, String str2, String str3, String str4) {
            super(null);
            dVar.getClass();
            this.f97560a = dVar;
            this.f97561b = str;
            this.f97562c = str2;
            this.f97563d = str3;
            this.f97564e = str4;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj70/k$h;", "Lj70/k;", "Lyz1/d;", "status", "", "activitiesAndWorkoutsEvents", "eventSectionData", "eventImageUrls", "eventWeathers", "trainableEvents", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f97596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f97597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f97598f;

        public /* synthetic */ h(yz1.d dVar, String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f97593a, hVar.f97593a) && p005kotlin.jvm.internal.s.g(this.f97594b, hVar.f97594b) && p005kotlin.jvm.internal.s.g(this.f97595c, hVar.f97595c) && p005kotlin.jvm.internal.s.g(this.f97596d, hVar.f97596d) && p005kotlin.jvm.internal.s.g(this.f97597e, hVar.f97597e) && p005kotlin.jvm.internal.s.g(this.f97598f, hVar.f97598f);
        }

        public final int hashCode() {
            int iHashCode = this.f97593a.hashCode() * 31;
            String str = this.f97594b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f97595c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97596d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f97597e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f97598f;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Events(status=");
            sb3.append(this.f97593a);
            sb3.append(", activitiesAndWorkoutsEvents=");
            sb3.append(this.f97594b);
            sb3.append(", eventSectionData=");
            sn.a.t(sb3, this.f97595c, ", eventImageUrls=", this.f97596d, ", eventWeathers=");
            return e5.h(sb3, this.f97597e, ", trainableEvents=", this.f97598f, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(yz1.d dVar, String str, String str2, String str3, String str4, String str5) {
            super(null);
            dVar.getClass();
            this.f97593a = dVar;
            this.f97594b = str;
            this.f97595c = str2;
            this.f97596d = str3;
            this.f97597e = str4;
            this.f97598f = str5;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj70/k$c;", "Lj70/k;", "Lyz1/d;", "status", "", "activities", "", "", "", "Lcom/google/android/gms/maps/model/LatLng;", "activityPolylines", "workouts", "golfScoreCards", "wellnessActivity", "personalRecords", "Lpb2/a$d;", "pendingActivitiesDashboardData", "", "oldPendingActivities", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<Long, List<List<LatLng>>> f97552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f97553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f97554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f97555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f97556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<pb2.a.d> f97557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f97558i;

        public /* synthetic */ c(yz1.d dVar, String str, Map map, String str2, String str3, String str4, String str5, List list, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : map, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : num);
        }

        public final String a() {
            return GsonUtil.a(new ps.b(this.f97551b, this.f97552c, this.f97556g));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f97550a, cVar.f97550a) && p005kotlin.jvm.internal.s.g(this.f97551b, cVar.f97551b) && p005kotlin.jvm.internal.s.g(this.f97552c, cVar.f97552c) && p005kotlin.jvm.internal.s.g(this.f97553d, cVar.f97553d) && p005kotlin.jvm.internal.s.g(this.f97554e, cVar.f97554e) && p005kotlin.jvm.internal.s.g(this.f97555f, cVar.f97555f) && p005kotlin.jvm.internal.s.g(this.f97556g, cVar.f97556g) && p005kotlin.jvm.internal.s.g(this.f97557h, cVar.f97557h) && p005kotlin.jvm.internal.s.g(this.f97558i, cVar.f97558i);
        }

        public final int hashCode() {
            int iHashCode = this.f97550a.hashCode() * 31;
            String str = this.f97551b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<Long, List<List<LatLng>>> map = this.f97552c;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            String str2 = this.f97553d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97554e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f97555f;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f97556g;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<pb2.a.d> list = this.f97557h;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.f97558i;
            return iHashCode8 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ActivitiesAndWorkouts(status=");
            sb3.append(this.f97550a);
            sb3.append(", activities=");
            sb3.append(this.f97551b);
            sb3.append(", activityPolylines=");
            sb3.append(this.f97552c);
            sb3.append(", workouts=");
            sb3.append(this.f97553d);
            sb3.append(", golfScoreCards=");
            sn.a.t(sb3, this.f97554e, ", wellnessActivity=", this.f97555f, ", personalRecords=");
            e0.o(this.f97556g, ", pendingActivitiesDashboardData=", ", oldPendingActivities=", sb3, this.f97557h);
            return f3.i(sb3, this.f97558i, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(yz1.d dVar, String str, Map<Long, ? extends List<? extends List<LatLng>>> map, String str2, String str3, String str4, String str5, List<pb2.a.d> list, Integer num) {
            super(null);
            dVar.getClass();
            this.f97550a = dVar;
            this.f97551b = str;
            this.f97552c = map;
            this.f97553d = str2;
            this.f97554e = str3;
            this.f97555f = str4;
            this.f97556g = str5;
            this.f97557h = list;
            this.f97558i = num;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lj70/k$f;", "Lj70/k;", "Lyz1/d;", "status", "", "userSummaryDaily", "allDayHR", "hearRateZones", "hrvSummaries", "hillScore", "criticalSwimSpeed", "womenHealth", "Lpb2/e$r;", "womenHealthLog", "enduranceScore", "vo2Max", "functionalThresholdPower", "lastWeight", "latestLactateThreshold", "", "Lpb2/e$z;", "runningTolerance", "Lpb2/e$y;", "runningEconomy", "powerCurve", "powerCurveHistorical", "powerToWeight", "pulseOx", "sleep", "trainingStatusWeekly", "trainingStatusDaily", "trainingReadiness", "trainingLoad", "heatAltitudeAcclimation", "bloodPressureRangeSummary", "userGoals", "epochChartData", "latestFitnessAge", "lastActivity", "pregnancyWeightGoal", "extendedWeight", "sleepSummaries", "dailyEvents", "personalRecords", "jetLag", "Lpb2/e$o;", "lifestyleLogging", "lastTrainingStatusDevice", "userDailySummaryV2Average", "cyclingAbility", "Lpb2/e$l;", "healthStatus", "Lpb2/e$c;", "nutrition", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpb2/e$r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lpb2/e$y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpb2/e$o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpb2/e$l;Lpb2/e$c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends k {
        public final String A;
        public final String B;
        public final String C;
        public final String D;
        public final String E;
        public final String F;
        public final String G;
        public final String H;
        public final String I;
        public final String J;
        public final String K;
        public final pb2.e.o L;
        public final String M;
        public final String N;
        public final String O;
        public final pb2.e.l P;
        public final pb2.e.c Q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f97565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f97568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f97569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f97570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f97571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f97572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final pb2.e.r f97573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f97574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f97575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f97576l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f97577m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f97578n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final List<pb2.e.z> f97579o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final pb2.e.y f97580p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f97581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f97582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f97583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f97584t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final String f97585u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final String f97586v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final String f97587w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final String f97588x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final String f97589y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final String f97590z;

        public /* synthetic */ f(yz1.d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, pb2.e.r rVar, String str8, String str9, String str10, String str11, String str12, List list, pb2.e.y yVar, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, pb2.e.o oVar, String str34, String str35, String str36, pb2.e.l lVar, pb2.e.c cVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : rVar, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : str10, (i14 & 4096) != 0 ? null : str11, (i14 & 8192) != 0 ? null : str12, (i14 & 16384) != 0 ? null : list, (i14 & 32768) != 0 ? null : yVar, (i14 & 65536) != 0 ? null : str13, (i14 & 131072) != 0 ? null : str14, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str15, (i14 & 524288) != 0 ? null : str16, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str17, (i14 & 2097152) != 0 ? null : str18, (i14 & 4194304) != 0 ? null : str19, (i14 & 8388608) != 0 ? null : str20, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str21, (i14 & 33554432) != 0 ? null : str22, (i14 & 67108864) != 0 ? null : str23, (i14 & 134217728) != 0 ? null : str24, (i14 & 268435456) != 0 ? null : str25, (i14 & 536870912) != 0 ? null : str26, (i14 & 1073741824) != 0 ? null : str27, (i14 & Integer.MIN_VALUE) != 0 ? null : str28, (i15 & 1) != 0 ? null : str29, (i15 & 2) != 0 ? null : str30, (i15 & 4) != 0 ? null : str31, (i15 & 8) != 0 ? null : str32, (i15 & 16) != 0 ? null : str33, (i15 & 32) != 0 ? null : oVar, (i15 & 64) != 0 ? null : str34, (i15 & 128) != 0 ? null : str35, (i15 & 256) != 0 ? null : str36, (i15 & 512) != 0 ? null : lVar, (i15 & 1024) != 0 ? null : cVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f97565a, fVar.f97565a) && p005kotlin.jvm.internal.s.g(this.f97566b, fVar.f97566b) && p005kotlin.jvm.internal.s.g(this.f97567c, fVar.f97567c) && p005kotlin.jvm.internal.s.g(this.f97568d, fVar.f97568d) && p005kotlin.jvm.internal.s.g(this.f97569e, fVar.f97569e) && p005kotlin.jvm.internal.s.g(this.f97570f, fVar.f97570f) && p005kotlin.jvm.internal.s.g(this.f97571g, fVar.f97571g) && p005kotlin.jvm.internal.s.g(this.f97572h, fVar.f97572h) && p005kotlin.jvm.internal.s.g(this.f97573i, fVar.f97573i) && p005kotlin.jvm.internal.s.g(this.f97574j, fVar.f97574j) && p005kotlin.jvm.internal.s.g(this.f97575k, fVar.f97575k) && p005kotlin.jvm.internal.s.g(this.f97576l, fVar.f97576l) && p005kotlin.jvm.internal.s.g(this.f97577m, fVar.f97577m) && p005kotlin.jvm.internal.s.g(this.f97578n, fVar.f97578n) && p005kotlin.jvm.internal.s.g(this.f97579o, fVar.f97579o) && p005kotlin.jvm.internal.s.g(this.f97580p, fVar.f97580p) && p005kotlin.jvm.internal.s.g(this.f97581q, fVar.f97581q) && p005kotlin.jvm.internal.s.g(this.f97582r, fVar.f97582r) && p005kotlin.jvm.internal.s.g(this.f97583s, fVar.f97583s) && p005kotlin.jvm.internal.s.g(this.f97584t, fVar.f97584t) && p005kotlin.jvm.internal.s.g(this.f97585u, fVar.f97585u) && p005kotlin.jvm.internal.s.g(this.f97586v, fVar.f97586v) && p005kotlin.jvm.internal.s.g(this.f97587w, fVar.f97587w) && p005kotlin.jvm.internal.s.g(this.f97588x, fVar.f97588x) && p005kotlin.jvm.internal.s.g(this.f97589y, fVar.f97589y) && p005kotlin.jvm.internal.s.g(this.f97590z, fVar.f97590z) && p005kotlin.jvm.internal.s.g(this.A, fVar.A) && p005kotlin.jvm.internal.s.g(this.B, fVar.B) && p005kotlin.jvm.internal.s.g(this.C, fVar.C) && p005kotlin.jvm.internal.s.g(this.D, fVar.D) && p005kotlin.jvm.internal.s.g(this.E, fVar.E) && p005kotlin.jvm.internal.s.g(this.F, fVar.F) && p005kotlin.jvm.internal.s.g(this.G, fVar.G) && p005kotlin.jvm.internal.s.g(this.H, fVar.H) && p005kotlin.jvm.internal.s.g(this.I, fVar.I) && p005kotlin.jvm.internal.s.g(this.J, fVar.J) && p005kotlin.jvm.internal.s.g(this.K, fVar.K) && p005kotlin.jvm.internal.s.g(this.L, fVar.L) && p005kotlin.jvm.internal.s.g(this.M, fVar.M) && p005kotlin.jvm.internal.s.g(this.N, fVar.N) && p005kotlin.jvm.internal.s.g(this.O, fVar.O) && p005kotlin.jvm.internal.s.g(this.P, fVar.P) && p005kotlin.jvm.internal.s.g(this.Q, fVar.Q);
        }

        public final int hashCode() {
            int iHashCode = this.f97565a.hashCode() * 31;
            String str = this.f97566b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f97567c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97568d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f97569e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f97570f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f97571g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f97572h;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            pb2.e.r rVar = this.f97573i;
            int iHashCode9 = (iHashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            String str8 = this.f97574j;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f97575k;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f97576l;
            int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f97577m;
            int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f97578n;
            int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
            List<pb2.e.z> list = this.f97579o;
            int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
            pb2.e.y yVar = this.f97580p;
            int iHashCode16 = (iHashCode15 + (yVar == null ? 0 : yVar.hashCode())) * 31;
            String str13 = this.f97581q;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f97582r;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f97583s;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f97584t;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.f97585u;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.f97586v;
            int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.f97587w;
            int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.f97588x;
            int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.f97589y;
            int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.f97590z;
            int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.A;
            int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.B;
            int iHashCode28 = (iHashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.C;
            int iHashCode29 = (iHashCode28 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.D;
            int iHashCode30 = (iHashCode29 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.E;
            int iHashCode31 = (iHashCode30 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.F;
            int iHashCode32 = (iHashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
            String str29 = this.G;
            int iHashCode33 = (iHashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
            String str30 = this.H;
            int iHashCode34 = (iHashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.I;
            int iHashCode35 = (iHashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.J;
            int iHashCode36 = (iHashCode35 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.K;
            int iHashCode37 = (iHashCode36 + (str33 == null ? 0 : str33.hashCode())) * 31;
            pb2.e.o oVar = this.L;
            int iHashCode38 = (iHashCode37 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            String str34 = this.M;
            int iHashCode39 = (iHashCode38 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.N;
            int iHashCode40 = (iHashCode39 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.O;
            int iHashCode41 = (iHashCode40 + (str36 == null ? 0 : str36.hashCode())) * 31;
            pb2.e.l lVar = this.P;
            int iHashCode42 = (iHashCode41 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            pb2.e.c cVar = this.Q;
            return iHashCode42 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CommonStats(status=");
            sb3.append(this.f97565a);
            sb3.append(", userSummaryDaily=");
            sb3.append(this.f97566b);
            sb3.append(", allDayHR=");
            sn.a.t(sb3, this.f97567c, ", hearRateZones=", this.f97568d, ", hrvSummaries=");
            sn.a.t(sb3, this.f97569e, ", hillScore=", this.f97570f, ", criticalSwimSpeed=");
            sn.a.t(sb3, this.f97571g, ", womenHealth=", this.f97572h, ", womenHealthLog=");
            sb3.append(this.f97573i);
            sb3.append(", enduranceScore=");
            sb3.append(this.f97574j);
            sb3.append(", vo2Max=");
            sn.a.t(sb3, this.f97575k, ", functionalThresholdPower=", this.f97576l, ", lastWeight=");
            sn.a.t(sb3, this.f97577m, ", latestLactateThreshold=", this.f97578n, ", runningTolerance=");
            sb3.append(this.f97579o);
            sb3.append(", runningEconomy=");
            sb3.append(this.f97580p);
            sb3.append(", powerCurve=");
            sn.a.t(sb3, this.f97581q, ", powerCurveHistorical=", this.f97582r, ", powerToWeight=");
            sn.a.t(sb3, this.f97583s, ", pulseOx=", this.f97584t, ", sleep=");
            sn.a.t(sb3, this.f97585u, ", trainingStatusWeekly=", this.f97586v, ", trainingStatusDaily=");
            sn.a.t(sb3, this.f97587w, ", trainingReadiness=", this.f97588x, ", trainingLoad=");
            sn.a.t(sb3, this.f97589y, ", heatAltitudeAcclimation=", this.f97590z, ", bloodPressureRangeSummary=");
            sn.a.t(sb3, this.A, ", userGoals=", this.B, ", epochChartData=");
            sn.a.t(sb3, this.C, ", latestFitnessAge=", this.D, ", lastActivity=");
            sn.a.t(sb3, this.E, ", pregnancyWeightGoal=", this.F, ", extendedWeight=");
            sn.a.t(sb3, this.G, ", sleepSummaries=", this.H, ", dailyEvents=");
            sn.a.t(sb3, this.I, ", personalRecords=", this.J, ", jetLag=");
            sb3.append(this.K);
            sb3.append(", lifestyleLogging=");
            sb3.append(this.L);
            sb3.append(", lastTrainingStatusDevice=");
            sn.a.t(sb3, this.M, ", userDailySummaryV2Average=", this.N, ", cyclingAbility=");
            sb3.append(this.O);
            sb3.append(", healthStatus=");
            sb3.append(this.P);
            sb3.append(", nutrition=");
            sb3.append(this.Q);
            sb3.append(")");
            return sb3.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yz1.d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, pb2.e.r rVar, String str8, String str9, String str10, String str11, String str12, List<pb2.e.z> list, pb2.e.y yVar, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, pb2.e.o oVar, String str34, String str35, String str36, pb2.e.l lVar, pb2.e.c cVar) {
            super(null);
            dVar.getClass();
            this.f97565a = dVar;
            this.f97566b = str;
            this.f97567c = str2;
            this.f97568d = str3;
            this.f97569e = str4;
            this.f97570f = str5;
            this.f97571g = str6;
            this.f97572h = str7;
            this.f97573i = rVar;
            this.f97574j = str8;
            this.f97575k = str9;
            this.f97576l = str10;
            this.f97577m = str11;
            this.f97578n = str12;
            this.f97579o = list;
            this.f97580p = yVar;
            this.f97581q = str13;
            this.f97582r = str14;
            this.f97583s = str15;
            this.f97584t = str16;
            this.f97585u = str17;
            this.f97586v = str18;
            this.f97587w = str19;
            this.f97588x = str20;
            this.f97589y = str21;
            this.f97590z = str22;
            this.A = str23;
            this.B = str24;
            this.C = str25;
            this.D = str26;
            this.E = str27;
            this.F = str28;
            this.G = str29;
            this.H = str30;
            this.I = str31;
            this.J = str32;
            this.K = str33;
            this.L = oVar;
            this.M = str34;
            this.N = str35;
            this.O = str36;
            this.P = lVar;
            this.Q = cVar;
        }
    }
}
