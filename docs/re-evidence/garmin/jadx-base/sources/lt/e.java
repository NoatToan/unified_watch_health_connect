package lt;

import com.garmin.android.gncs.NotificationConstants;
import ht.r;
import i3.e5;
import java.util.ArrayList;
import lc.u0;
import o70.t;
import o70.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public interface e extends r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Tapped,
        TappedTop,
        TappedBottom,
        LearnMore,
        Add,
        /* JADX INFO: Fake field, exist only in values array */
        Swiped,
        /* JADX INFO: Fake field, exist only in values array */
        Edit,
        ToggleOn,
        ToggleOff,
        Dismiss
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/e$c;", "Llt/e;", "Llt/e$a;", "action", "Lo70/c;", "trend", "<init>", "(Llt/e$a;Lo70/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.c f114835b;

        public c(a aVar, o70.c cVar) {
            aVar.getClass();
            cVar.getClass();
            this.f114834a = aVar;
            this.f114835b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f114834a == cVar.f114834a && this.f114835b == cVar.f114835b;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114834a;
        }

        public final int hashCode() {
            return this.f114835b.hashCode() + (this.f114834a.hashCode() * 31);
        }

        public final String toString() {
            return "ActivityTrends(action=" + this.f114834a + ", trend=" + this.f114835b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$d;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114836a;

        public d(a aVar) {
            aVar.getClass();
            this.f114836a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f114836a == ((d) obj).f114836a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114836a;
        }

        public final int hashCode() {
            return this.f114836a.hashCode();
        }

        public final String toString() {
            return "Challenge(action=" + this.f114836a + ")";
        }
    }

    /* JADX INFO: renamed from: lt.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/e$e;", "Llt/e;", "Llt/e$a;", "action", "Lo70/i;", "stat", "<init>", "(Llt/e$a;Lo70/i;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2183e implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.i f114838b;

        public C2183e(a aVar, o70.i iVar) {
            aVar.getClass();
            this.f114837a = aVar;
            this.f114838b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2183e)) {
                return false;
            }
            C2183e c2183e = (C2183e) obj;
            return this.f114837a == c2183e.f114837a && this.f114838b == c2183e.f114838b;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114837a;
        }

        public final int hashCode() {
            int iHashCode = this.f114837a.hashCode() * 31;
            o70.i iVar = this.f114838b;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public final String toString() {
            return "EssentialsStats(action=" + this.f114837a + ", stat=" + this.f114838b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$f;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114839a;

        public f(a aVar) {
            aVar.getClass();
            this.f114839a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f114839a == ((f) obj).f114839a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114839a;
        }

        public final int hashCode() {
            return this.f114839a.hashCode();
        }

        public final String toString() {
            return "Event(action=" + this.f114839a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/e$g;", "Llt/e;", "Llt/e$a;", "action", "Lo70/o;", "stat", "<init>", "(Llt/e$a;Lo70/o;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.o f114841b;

        public g(a aVar, o70.o oVar) {
            aVar.getClass();
            this.f114840a = aVar;
            this.f114841b = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f114840a == gVar.f114840a && this.f114841b == gVar.f114841b;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114840a;
        }

        public final int hashCode() {
            int iHashCode = this.f114840a.hashCode() * 31;
            o70.o oVar = this.f114841b;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        public final String toString() {
            return "KeyStats(action=" + this.f114840a + ", stat=" + this.f114841b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$h;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114842a;

        public h(a aVar) {
            aVar.getClass();
            this.f114842a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f114842a == ((h) obj).f114842a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114842a;
        }

        public final int hashCode() {
            return this.f114842a.hashCode();
        }

        public final String toString() {
            return "Last7Days(action=" + this.f114842a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llt/e$i;", "Llt/e;", "Llt/e$a;", "action", "", "deviceName", "onboardingItemType", "<init>", "(Llt/e$a;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f114844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f114845c;

        public i(a aVar, String str, String str2) {
            aVar.getClass();
            str.getClass();
            str2.getClass();
            this.f114843a = aVar;
            this.f114844b = str;
            this.f114845c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f114843a == iVar.f114843a && this.f114844b.equals(iVar.f114844b) && this.f114845c.equals(iVar.f114845c);
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114843a;
        }

        public final int hashCode() {
            return this.f114845c.hashCode() + wr.g.j(this.f114843a.hashCode() * 31, 31, this.f114844b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Onboarding(action=");
            sb3.append(this.f114843a);
            sb3.append(", deviceName=");
            sb3.append(this.f114844b);
            sb3.append(", onboardingItemType=");
            return am.j.o(this.f114845c, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llt/e$j;", "Llt/e;", "Llt/e$a;", "action", "Lo70/o;", "stat", "", "screenName", "detailType", "<init>", "(Llt/e$a;Lo70/o;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.o f114847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f114848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f114849d;

        public j(a aVar, o70.o oVar, String str, String str2) {
            aVar.getClass();
            this.f114846a = aVar;
            this.f114847b = oVar;
            this.f114848c = str;
            this.f114849d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f114846a == jVar.f114846a && this.f114847b == jVar.f114847b && s.g(this.f114848c, jVar.f114848c) && s.g(this.f114849d, jVar.f114849d);
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114846a;
        }

        public final int hashCode() {
            int iHashCode = this.f114846a.hashCode() * 31;
            o70.o oVar = this.f114847b;
            int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
            String str = this.f114848c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f114849d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PersonalizedInsights(action=");
            sb3.append(this.f114846a);
            sb3.append(", stat=");
            sb3.append(this.f114847b);
            sb3.append(", screenName=");
            return e5.h(sb3, this.f114848c, ", detailType=", this.f114849d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/e$k;", "Llt/e;", "Llt/e$a;", "action", "Lo70/t;", "stat", "<init>", "(Llt/e$a;Lo70/t;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f114851b;

        public k(a aVar, t tVar) {
            aVar.getClass();
            this.f114850a = aVar;
            this.f114851b = tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f114850a == kVar.f114850a && this.f114851b == kVar.f114851b;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114850a;
        }

        public final int hashCode() {
            int iHashCode = this.f114850a.hashCode() * 31;
            t tVar = this.f114851b;
            return iHashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        public final String toString() {
            return "SecondaryStats(action=" + this.f114850a + ", stat=" + this.f114851b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$l;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114852a;

        public l(a aVar) {
            aVar.getClass();
            this.f114852a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f114852a == ((l) obj).f114852a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114852a;
        }

        public final int hashCode() {
            return this.f114852a.hashCode();
        }

        public final String toString() {
            return "SystemMessage(action=" + this.f114852a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/e$m;", "Llt/e;", "Llt/e$a;", "action", "Lo70/y;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Llt/e$a;Lo70/y;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f114854b;

        public m(a aVar, y yVar) {
            aVar.getClass();
            yVar.getClass();
            this.f114853a = aVar;
            this.f114854b = yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f114853a == mVar.f114853a && this.f114854b == mVar.f114854b;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114853a;
        }

        public final int hashCode() {
            return this.f114854b.hashCode() + (this.f114853a.hashCode() * 31);
        }

        public final String toString() {
            return "TemporaryItems(action=" + this.f114853a + ", type=" + this.f114854b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$n;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114855a;

        public n(a aVar) {
            aVar.getClass();
            this.f114855a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f114855a == ((n) obj).f114855a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114855a;
        }

        public final int hashCode() {
            return this.f114855a.hashCode();
        }

        public final String toString() {
            return "TrainingPlan(action=" + this.f114855a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/e$o;", "Llt/e;", "Llt/e$a;", "action", "<init>", "(Llt/e$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114856a;

        public o(a aVar) {
            aVar.getClass();
            this.f114856a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f114856a == ((o) obj).f114856a;
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114856a;
        }

        public final int hashCode() {
            return this.f114856a.hashCode();
        }

        public final String toString() {
            return "Yesterday(action=" + this.f114856a + ")";
        }
    }

    @Override // ht.r
    default zk.a a() {
        ArrayList arrayListM = x.m(new zk.e("Screen", "Home"));
        arrayListM.add(new zk.e("Action", getF114856a().name()));
        if (this instanceof b) {
            b bVar = (b) this;
            o70.b bVar2 = bVar.f114832b;
            arrayListM.add(new zk.e("Type", bVar2 != null ? e5.g(b(), "_", bVar2.f129925a) : b()));
            String str = bVar.f114833c;
            if (str != null) {
                arrayListM.add(new zk.e("ActivityType", str));
            }
        } else if (this instanceof C2183e) {
            o70.i iVar = ((C2183e) this).f114838b;
            arrayListM.add(new zk.e("Type", iVar != null ? e5.g(b(), "_", iVar.f130007a) : b()));
        } else if (this instanceof g) {
            o70.o oVar = ((g) this).f114841b;
            arrayListM.add(new zk.e("Type", oVar != null ? e5.g(b(), "_", oVar.f130049a) : b()));
        } else if (this instanceof k) {
            t tVar = ((k) this).f114851b;
            arrayListM.add(new zk.e("Type", tVar != null ? e5.g(b(), "_", tVar.f130082a) : b()));
        } else if (this instanceof j) {
            j jVar = (j) this;
            o70.o oVar2 = jVar.f114847b;
            arrayListM.add(new zk.e("Type", oVar2 != null ? e5.g(b(), "_", oVar2.f130049a) : b()));
            arrayListM.remove(new zk.e("Screen", "Home"));
            String str2 = jVar.f114848c;
            if (str2 != null) {
                arrayListM.add(new zk.e("Screen", str2));
            }
            String str3 = jVar.f114849d;
            if (str3 != null) {
                arrayListM.add(new zk.e("Interval", str3));
            }
        } else if (this instanceof c) {
            arrayListM.add(new zk.e("Type", e5.g(b(), "_", ((c) this).f114835b.f129941a)));
        } else if (this instanceof m) {
            arrayListM.add(new zk.e("Type", e5.g(b(), "_", ((m) this).f114854b.f130121a)));
        } else if ((this instanceof n) || (this instanceof f) || (this instanceof d) || (this instanceof o) || (this instanceof h) || (this instanceof l)) {
            arrayListM.add(new zk.e("Type", b()));
        } else {
            if (!(this instanceof i)) {
                u0.r();
                return null;
            }
            arrayListM.add(new zk.e("Type", b()));
            i iVar2 = (i) this;
            arrayListM.add(new zk.e("garminDeviceName", iVar2.f114844b));
            arrayListM.add(new zk.e("FeatureType", iVar2.f114845c));
        }
        return new zk.a("UserAction", arrayListM, false, 0L, 12, null);
    }

    default String b() {
        if (this instanceof b) {
            return "ActivitiesAndWorkouts";
        }
        if (this instanceof g) {
            return "KeyStat";
        }
        if (this instanceof k) {
            return "SecondaryStat";
        }
        if (this instanceof c) {
            return "ActivityTrend";
        }
        if (this instanceof m) {
            return "TemporaryItem";
        }
        if (this instanceof n) {
            return "TrainingPlan";
        }
        if (this instanceof f) {
            return "Event";
        }
        if (this instanceof d) {
            return "Challenge";
        }
        if (this instanceof o) {
            return "Yesterday";
        }
        if (this instanceof h) {
            return "Last7Days";
        }
        if (this instanceof l) {
            return "SystemMessage";
        }
        if (this instanceof j) {
            return "PersonalizedInsights";
        }
        if (this instanceof i) {
            return "Onboarding";
        }
        if (this instanceof C2183e) {
            return "EssentialsStats";
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: getAction */
    a getF114856a();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llt/e$b;", "Llt/e;", "Llt/e$a;", "action", "Lo70/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "activityType", "<init>", "(Llt/e$a;Lo70/b;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f114831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o70.b f114832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f114833c;

        public b(a aVar, o70.b bVar, String str) {
            aVar.getClass();
            this.f114831a = aVar;
            this.f114832b = bVar;
            this.f114833c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f114831a == bVar.f114831a && this.f114832b == bVar.f114832b && s.g(this.f114833c, bVar.f114833c);
        }

        @Override // lt.e
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final a getF114856a() {
            return this.f114831a;
        }

        public final int hashCode() {
            int iHashCode = this.f114831a.hashCode() * 31;
            o70.b bVar = this.f114832b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f114833c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ActivitiesAndWorkouts(action=");
            sb3.append(this.f114831a);
            sb3.append(", type=");
            sb3.append(this.f114832b);
            sb3.append(", activityType=");
            return am.j.o(this.f114833c, ")", sb3);
        }

        public /* synthetic */ b(a aVar, o70.b bVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, bVar, (i14 & 4) != 0 ? null : str);
        }
    }
}
