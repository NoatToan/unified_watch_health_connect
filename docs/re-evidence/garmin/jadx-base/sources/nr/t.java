package nr;

import android.util.SparseArray;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface t {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/t$c;", "Lnr/t;", "", "Lnr/n;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<n> f127328a;

        public c(List<n> list) {
            list.getClass();
            this.f127328a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f127328a.equals(((c) obj).f127328a);
        }

        public final int hashCode() {
            return this.f127328a.hashCode();
        }

        public final String toString() {
            return tn.k.h("GasesState(items=", ")", this.f127328a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/t$g;", "Lnr/t;", "", "Lnr/g;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<nr.g> f127353a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends nr.g> list) {
            list.getClass();
            this.f127353a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f127353a.equals(((g) obj).f127353a);
        }

        public final int hashCode() {
            return this.f127353a.hashCode();
        }

        public final String toString() {
            return tn.k.h("OverviewState(items=", ")", this.f127353a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/t$h;", "Lnr/t;", "", "Lnr/n;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<n> f127354a;

        public h(List<n> list) {
            list.getClass();
            this.f127354a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f127354a.equals(((h) obj).f127354a);
        }

        public final int hashCode() {
            return this.f127354a.hashCode();
        }

        public final String toString() {
            return tn.k.h("StatsState(items=", ")", this.f127354a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/t$d;", "Lnr/t;", "", "showGroupRidePrivacyDialog", "", "groupRideUUID", "<init>", "(ZLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127330b;

        public /* synthetic */ d(boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f127329a == dVar.f127329a && p005kotlin.jvm.internal.s.g(this.f127330b, dVar.f127330b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127329a) * 31;
            String str = this.f127330b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "GroupRideState(showGroupRidePrivacyDialog=" + this.f127329a + ", groupRideUUID=" + this.f127330b + ")";
        }

        public d(boolean z14, String str) {
            this.f127329a = z14;
            this.f127330b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/t$b;", "Lnr/t;", "", "showFiveHzDialog", "hasFiveHzData", "", "deviceName", "<init>", "(ZZLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f127325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f127326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f127327c;

        public /* synthetic */ b(boolean z14, boolean z15, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f127325a == bVar.f127325a && this.f127326b == bVar.f127326b && p005kotlin.jvm.internal.s.g(this.f127327c, bVar.f127327c);
        }

        public final int hashCode() {
            int iG = q6.f.g(Boolean.hashCode(this.f127325a) * 31, 31, this.f127326b);
            String str = this.f127327c;
            return iG + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return am.j.o(this.f127327c, ")", com.airbnb.lottie.animation.keyframe.a.m("FiveHzDataState(showFiveHzDialog=", ", hasFiveHzData=", ", deviceName=", this.f127325a, this.f127326b));
        }

        public b(boolean z14, boolean z15, String str) {
            this.f127325a = z14;
            this.f127326b = z15;
            this.f127327c = str;
        }

        public b() {
            this(false, false, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/t$a;", "", "Lrr/k;", "selectedXAxisType", "", "Lnr/b;", "timeChartDataList", "distanceChartDataList", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "workoutComparisonTargetData", "<init>", "(Lrr/k;Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rr.k f127321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<nr.b>> f127322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<List<nr.b>> f127323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> f127324d;

        public a(rr.k kVar, List list, List list2, SparseArray sparseArray, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? rr.k.TIME : kVar, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2, (i14 & 8) != 0 ? null : sparseArray);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127321a == aVar.f127321a && p005kotlin.jvm.internal.s.g(this.f127322b, aVar.f127322b) && p005kotlin.jvm.internal.s.g(this.f127323c, aVar.f127323c) && p005kotlin.jvm.internal.s.g(this.f127324d, aVar.f127324d);
        }

        public final int hashCode() {
            int iB = lc.u0.b(lc.u0.b(this.f127321a.hashCode() * 31, 31, this.f127322b), 31, this.f127323c);
            SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray = this.f127324d;
            return iB + (sparseArray == null ? 0 : sparseArray.hashCode());
        }

        public final String toString() {
            return "ChartsState(selectedXAxisType=" + this.f127321a + ", timeChartDataList=" + this.f127322b + ", distanceChartDataList=" + this.f127323c + ", workoutComparisonTargetData=" + this.f127324d + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(rr.k kVar, List<? extends List<nr.b>> list, List<? extends List<nr.b>> list2, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray) {
            kVar.getClass();
            list.getClass();
            list2.getClass();
            this.f127321a = kVar;
            this.f127322b = list;
            this.f127323c = list2;
            this.f127324d = sparseArray;
        }

        public a() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/t$e;", "Lnr/t;", "Lps/r;", "activitySummaryDTO", "Lps/p;", "activitySplits", "", "Lps/c0;", "ciqApps", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "activityWorkoutsDTO", "", "userWeightInKg", "<init>", "(Lps/r;Lps/p;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ps.r f127331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ps.p f127332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ps.c0> f127333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.activities.newmodel.j> f127334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f127335e;

        public /* synthetic */ e(ps.r rVar, ps.p pVar, List list, List list2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : rVar, (i14 & 2) != 0 ? null : pVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : d14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f127331a, eVar.f127331a) && p005kotlin.jvm.internal.s.g(this.f127332b, eVar.f127332b) && p005kotlin.jvm.internal.s.g(this.f127333c, eVar.f127333c) && p005kotlin.jvm.internal.s.g(this.f127334d, eVar.f127334d) && p005kotlin.jvm.internal.s.g(this.f127335e, eVar.f127335e);
        }

        public final int hashCode() {
            ps.r rVar = this.f127331a;
            int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
            ps.p pVar = this.f127332b;
            int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
            List<ps.c0> list = this.f127333c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.j> list2 = this.f127334d;
            int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Double d14 = this.f127335e;
            return iHashCode4 + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("LapsState(activitySummaryDTO=");
            sb3.append(this.f127331a);
            sb3.append(", activitySplits=");
            sb3.append(this.f127332b);
            sb3.append(", ciqApps=");
            n23.j.z(sb3, this.f127333c, ", activityWorkoutsDTO=", this.f127334d, ", userWeightInKg=");
            return b71.i.g(sb3, this.f127335e, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(ps.r rVar, ps.p pVar, List<ps.c0> list, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list2, Double d14) {
            this.f127331a = rVar;
            this.f127332b = pVar;
            this.f127333c = list;
            this.f127334d = list2;
            this.f127335e = d14;
        }

        public e() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnr/t$f;", "Lnr/t;", "", "activityId", "Lam/x0;", "activityType", "", "Lnr/k;", "availableTabs", "", "canConvertToCourse", "hasShareHint", "isOwnActivity", "supportsRestoreOriginal", "", "menuFavoriteTitle", "menuEditTitle", "menuExcludeFromPhysioTitle", "supportsHelpMenu", "supportsGear", "supportsDelete", "isManualActivity", "isActivityProcessing", "isDiveActivity", "shouldShowExcludeFromPhysio", "<init>", "(JLam/x0;Ljava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Boolean;ZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f127336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final am.x0 f127337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<k> f127338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f127342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f127343h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f127344i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f127345j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f127346k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f127347l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f127348m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Boolean f127349n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f127350o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f127351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f127352q;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(long j8, am.x0 x0Var, List list, boolean z14, boolean z15, boolean z16, boolean z17, String str, String str2, String str3, boolean z18, boolean z19, boolean z24, Boolean bool, boolean z25, boolean z26, boolean z27, int i14, p005kotlin.jvm.internal.j jVar) {
            boolean zContains;
            long j14 = (i14 & 1) != 0 ? -1L : j8;
            am.x0 x0Var2 = (i14 & 2) != 0 ? am.x0.f4346x : x0Var;
            List list2 = (i14 & 4) != 0 ? p13.j0.f134944a : list;
            boolean z28 = (i14 & 8) != 0 ? false : z14;
            boolean z29 = (i14 & 16) != 0 ? false : z15;
            boolean z34 = (i14 & 32) != 0 ? false : z16;
            boolean z35 = (i14 & 64) != 0 ? false : z17;
            String str4 = (i14 & 128) != 0 ? null : str;
            String str5 = (i14 & 256) != 0 ? null : str2;
            String str6 = (i14 & 512) != 0 ? null : str3;
            boolean z36 = (i14 & 1024) != 0 ? false : z18;
            if ((i14 & 2048) != 0) {
                zContains = (list2 == null ? p13.j0.f134944a : list2).contains(k.GEAR);
            } else {
                zContains = z19;
            }
            this(j14, x0Var2, list2, z28, z29, z34, z35, str4, str5, str6, z36, zContains, (i14 & 4096) != 0 ? false : z24, (i14 & 8192) != 0 ? null : bool, (i14 & 16384) != 0 ? false : z25, (32768 & i14) != 0 ? false : z26, (i14 & 65536) != 0 ? false : z27);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f127336a == fVar.f127336a && this.f127337b == fVar.f127337b && p005kotlin.jvm.internal.s.g(this.f127338c, fVar.f127338c) && this.f127339d == fVar.f127339d && this.f127340e == fVar.f127340e && this.f127341f == fVar.f127341f && this.f127342g == fVar.f127342g && p005kotlin.jvm.internal.s.g(this.f127343h, fVar.f127343h) && p005kotlin.jvm.internal.s.g(this.f127344i, fVar.f127344i) && p005kotlin.jvm.internal.s.g(this.f127345j, fVar.f127345j) && this.f127346k == fVar.f127346k && this.f127347l == fVar.f127347l && this.f127348m == fVar.f127348m && p005kotlin.jvm.internal.s.g(this.f127349n, fVar.f127349n) && this.f127350o == fVar.f127350o && this.f127351p == fVar.f127351p && this.f127352q == fVar.f127352q;
        }

        public final int hashCode() {
            int iHashCode = (this.f127337b.hashCode() + (Long.hashCode(this.f127336a) * 31)) * 31;
            List<k> list = this.f127338c;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f127339d), 31, this.f127340e), 31, this.f127341f), 31, this.f127342g);
            String str = this.f127343h;
            int iHashCode2 = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127344i;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f127345j;
            int iG2 = q6.f.g(q6.f.g(q6.f.g((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f127346k), 31, this.f127347l), 31, this.f127348m);
            Boolean bool = this.f127349n;
            return Boolean.hashCode(this.f127352q) + q6.f.g(q6.f.g((iG2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f127350o), 31, this.f127351p);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MainDetailsState(activityId=");
            sb3.append(this.f127336a);
            sb3.append(", activityType=");
            sb3.append(this.f127337b);
            sb3.append(", availableTabs=");
            sb3.append(this.f127338c);
            sb3.append(", canConvertToCourse=");
            sb3.append(this.f127339d);
            com.airbnb.lottie.animation.keyframe.a.v(", hasShareHint=", ", isOwnActivity=", sb3, this.f127340e, this.f127341f);
            sb3.append(", supportsRestoreOriginal=");
            sb3.append(this.f127342g);
            sb3.append(", menuFavoriteTitle=");
            sb3.append(this.f127343h);
            sn.a.t(sb3, ", menuEditTitle=", this.f127344i, ", menuExcludeFromPhysioTitle=", this.f127345j);
            com.airbnb.lottie.animation.keyframe.a.v(", supportsHelpMenu=", ", supportsGear=", sb3, this.f127346k, this.f127347l);
            sb3.append(", supportsDelete=");
            sb3.append(this.f127348m);
            sb3.append(", isManualActivity=");
            sb3.append(this.f127349n);
            com.airbnb.lottie.animation.keyframe.a.v(", isActivityProcessing=", ", isDiveActivity=", sb3, this.f127350o, this.f127351p);
            return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", shouldShowExcludeFromPhysio=", this.f127352q, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(long j8, am.x0 x0Var, List<? extends k> list, boolean z14, boolean z15, boolean z16, boolean z17, String str, String str2, String str3, boolean z18, boolean z19, boolean z24, Boolean bool, boolean z25, boolean z26, boolean z27) {
            x0Var.getClass();
            this.f127336a = j8;
            this.f127337b = x0Var;
            this.f127338c = list;
            this.f127339d = z14;
            this.f127340e = z15;
            this.f127341f = z16;
            this.f127342g = z17;
            this.f127343h = str;
            this.f127344i = str2;
            this.f127345j = str3;
            this.f127346k = z18;
            this.f127347l = z19;
            this.f127348m = z24;
            this.f127349n = bool;
            this.f127350o = z25;
            this.f127351p = z26;
            this.f127352q = z27;
        }

        public f() {
            this(0L, null, null, false, false, false, false, null, null, null, false, false, false, null, false, false, false, 131071, null);
        }
    }
}
