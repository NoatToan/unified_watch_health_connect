package zn;

import am.x0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lzn/a;", "", "", "eventName", "<init>", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "f", JWKParameterNames.RSA_EXPONENT, "j", "b", "a", "c", "d", "g", "h", "Lzn/a$a;", "Lzn/a$b;", "Lzn/a$c;", "Lzn/a$d;", "Lzn/a$e;", "Lzn/a$f;", "Lzn/a$g;", "Lzn/a$h;", "Lzn/a$i;", "Lzn/a$j;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205372a;

    /* JADX INFO: renamed from: zn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn/a$a;", "Lzn/a;", "Ljo/d;", "filterType", "<init>", "(Ljo/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3839a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jo.d f205373b;

        /* JADX WARN: Illegal instructions before constructor call */
        public C3839a(jo.d dVar) {
            dVar.getClass();
            String lowerCase = dVar.f99743b.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            super("filter_category_".concat(lowerCase), null);
            this.f205373b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3839a) && this.f205373b == ((C3839a) obj).f205373b;
        }

        public final int hashCode() {
            return this.f205373b.hashCode();
        }

        public final String toString() {
            return "FilterCategorySelected(filterType=" + this.f205373b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$b;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f205374b = new b();

        private b() {
            super("all_activities_filter_opened", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -284072384;
        }

        public final String toString() {
            return "FilterOpened";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$c;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f205375b = new c();

        private c() {
            super("filters_cleared", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -889961552;
        }

        public final String toString() {
            return "FiltersCleared";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$d;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f205376b = new d();

        private d() {
            super("filters_closed", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 387248360;
        }

        public final String toString() {
            return "FiltersClosed";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzn/a$e;", "Lzn/a;", "", "searchQuery", "", "filtersApplied", "", "resultsCount", "<init>", "(Ljava/lang/String;ZI)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f205377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f205378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f205379d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z14, int i14) {
            super("activity_search_no_results", null);
            str.getClass();
            this.f205377b = str;
            this.f205378c = z14;
            this.f205379d = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f205377b, eVar.f205377b) && this.f205378c == eVar.f205378c && this.f205379d == eVar.f205379d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f205379d) + q6.f.g(this.f205377b.hashCode() * 31, 31, this.f205378c);
        }

        public final String toString() {
            return am.j.q(zl.a.d("SearchNoResults(searchQuery=", this.f205377b, ", filtersApplied=", this.f205378c, ", resultsCount="), this.f205379d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$f;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f205380b = new f();

        private f() {
            super("activity_search_tapped", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2127330963;
        }

        public final String toString() {
            return "SearchTapped";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$g;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f205381b = new g();

        private g() {
            super("show_activities_results", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2036815981;
        }

        public final String toString() {
            return "ShowActivitiesResults";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn/a$h;", "Lzn/a;", "Ljo/f;", "sortData", "<init>", "(Ljo/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jo.f f205382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(jo.f fVar) {
            super("sort_option_selected", null);
            fVar.getClass();
            this.f205382b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f205382b, ((h) obj).f205382b);
        }

        public final int hashCode() {
            return this.f205382b.hashCode();
        }

        public final String toString() {
            return "SortOptionSelected(sortData=" + this.f205382b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$i;", "Lzn/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f205383b = new i();

        private i() {
            super("all_activities_viewed", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 355325162;
        }

        public final String toString() {
            return "ViewAllActivities";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzn/a$j;", "Lzn/a;", "", ModelSourceWrapper.POSITION, "resultsCount", "", "exactCount", "searchQueryActive", "filterActive", "Lam/x0;", "activityType", "<init>", "(IIZZZLam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f205385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f205386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f205387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f205388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final x0 f205389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i14, int i15, boolean z14, boolean z15, boolean z16, x0 x0Var) {
            super("all_activities_result_selection", null);
            x0Var.getClass();
            this.f205384b = i14;
            this.f205385c = i15;
            this.f205386d = z14;
            this.f205387e = z15;
            this.f205388f = z16;
            this.f205389g = x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f205384b == jVar.f205384b && this.f205385c == jVar.f205385c && this.f205386d == jVar.f205386d && this.f205387e == jVar.f205387e && this.f205388f == jVar.f205388f && this.f205389g == jVar.f205389g;
        }

        public final int hashCode() {
            return this.f205389g.hashCode() + q6.f.g(q6.f.g(q6.f.g(q2.d(this.f205385c, Integer.hashCode(this.f205384b) * 31, 31), 31, this.f205386d), 31, this.f205387e), 31, this.f205388f);
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f205384b, this.f205385c, "ViewResult(position=", ", resultsCount=", ", exactCount=");
            kg.f.q(", searchQueryActive=", ", filterActive=", sbJ, this.f205386d, this.f205387e);
            sbJ.append(this.f205388f);
            sbJ.append(", activityType=");
            sbJ.append(this.f205389g);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    private a(String str) {
        this.f205372a = str;
    }

    public final void a() {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zk.e("Screen", "AllActivities"));
        arrayList.add(new zk.e("Action", this.f205372a));
        if (this instanceof e) {
            e eVar = (e) this;
            arrayList.add(new zk.e("searched_term", eVar.f205377b));
            arrayList.add(new zk.e("filters_applied", eVar.f205378c ? BooleanUtils.TRUE : BooleanUtils.FALSE));
            arrayList.add(new zk.e("result_count", String.valueOf(eVar.f205379d)));
        } else if (this instanceof j) {
            j jVar = (j) this;
            arrayList.add(new zk.e("selected_activity_position", String.valueOf(jVar.f205384b)));
            boolean z14 = jVar.f205386d;
            int i14 = jVar.f205385c;
            arrayList.add(new zk.e("result_count", String.valueOf(z14 ? Integer.valueOf(i14) : androidx.core.view.j.f(i14, Marker.ANY_NON_NULL_MARKER))));
            arrayList.add(new zk.e("selected_activity", jVar.f205389g.f4358a));
            boolean z15 = jVar.f205388f;
            boolean z16 = jVar.f205387e;
            if (z16 && z15) {
                str = "search_and_filter";
            } else if (z16) {
                str = "search";
            } else {
                str = z15 ? "filter" : "default";
            }
            arrayList.add(new zk.e("result_set_type", str));
        } else if (this instanceof h) {
            jo.f fVar = ((h) this).f205382b;
            arrayList.add(new zk.e("Type", e5.g(fVar.f99757a.f64775a, "_", fVar.f99758b.f64781a)));
        }
        zk.a aVar = new zk.a("UserAction", arrayList, false, 0L, 12, null);
        ht.s.f85508a.getClass();
        ht.s.b(aVar);
    }

    public /* synthetic */ a(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
