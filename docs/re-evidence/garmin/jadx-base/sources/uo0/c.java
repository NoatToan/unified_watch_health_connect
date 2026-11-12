package uo0;

import am.j;
import com.garmin.android.apps.connectmobile.f0;
import com.mapbox.maps.MapboxMap;
import i3.e5;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\t\n\u000bB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Luo0/c;", "Luo0/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Luo0/a;", "autoSuggestApiService", "Luo0/f;", "reverseGeocodeApiService", "<init>", "(Luo0/a;Luo0/f;)V", "b", "a", "c", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements uo0.b, f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f172081c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo0.a f172082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f172083b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luo0/c$a;", "", "", "searchString", "at", "showFields", "", MapboxMap.QFE_LIMIT, "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f172084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f172085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f172086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f172087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f172088e;

        public a(String str, String str2, String str3, Integer num, String str4) {
            str.getClass();
            str2.getClass();
            this.f172084a = str;
            this.f172085b = str2;
            this.f172086c = str3;
            this.f172087d = num;
            this.f172088e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f172084a.equals(aVar.f172084a) && this.f172085b.equals(aVar.f172085b) && s.g(this.f172086c, aVar.f172086c) && s.g(this.f172087d, aVar.f172087d) && s.g(this.f172088e, aVar.f172088e);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f172084a.hashCode() * 31, 31, this.f172085b);
            String str = this.f172086c;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f172087d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f172088e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("AutoSuggestQueryParameters(searchString=", this.f172084a, ", at=", this.f172085b, ", showFields=");
            fb1.c.u(this.f172087d, this.f172086c, ", limit=", ", lang=", sbI);
            return j.o(this.f172088e, ")", sbI);
        }
    }

    /* JADX INFO: renamed from: uo0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luo0/c$c;", "", "", "at", "resultTypes", "showFields", "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3209c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f172089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f172090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f172091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f172092d;

        public C3209c(String str, String str2, String str3, String str4) {
            str.getClass();
            this.f172089a = str;
            this.f172090b = str2;
            this.f172091c = str3;
            this.f172092d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3209c)) {
                return false;
            }
            C3209c c3209c = (C3209c) obj;
            return this.f172089a.equals(c3209c.f172089a) && s.g(this.f172090b, c3209c.f172090b) && s.g(this.f172091c, c3209c.f172091c) && s.g(this.f172092d, c3209c.f172092d);
        }

        public final int hashCode() {
            int iHashCode = this.f172089a.hashCode() * 31;
            String str = this.f172090b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f172091c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f172092d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return e5.h(p6.b.i("ReverseGeocodeQueryParameters(at=", this.f172089a, ", resultTypes=", this.f172090b, ", showFields="), this.f172091c, ", lang=", this.f172092d, ")");
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ c(uo0.a aVar, f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (uo0.a) ez0.b.b(ez0.b.f67468a, "https://autosuggest.search.hereapi.com/v1/", uo0.a.class, new c83.h.a[0]) : aVar, (i14 & 2) != 0 ? (f) ez0.b.b(ez0.b.f67468a, "https://revgeocode.search.hereapi.com/v1/", f.class, new c83.h.a[0]) : fVar);
    }

    @Override // uo0.b
    public final Object a(double d14, double d15, Set set, Set set2, String str, i iVar) {
        return f0.J(this, new e(this, d14, d15, set, set2, str, null), iVar);
    }

    @Override // uo0.b
    public final Object b(String str, double d14, double d15, Set set, Integer num, String str2, i iVar) {
        return f0.J(this, new d(this, str, d14, d15, set, num, str2, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Luo0/c$b;", "", "<init>", "()V", "", "HERE_AUTO_SUGGEST_BASE_API", "Ljava/lang/String;", "HERE_REVERSE_GEOCODE_BASE_API", "HERE_API_KEY", "QUERY_PARAMETER_SEPARATOR", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public c(uo0.a aVar, f fVar) {
        aVar.getClass();
        fVar.getClass();
        this.f172082a = aVar;
        this.f172083b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
