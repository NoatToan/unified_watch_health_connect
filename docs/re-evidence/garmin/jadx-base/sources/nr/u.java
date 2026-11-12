package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB9\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lnr/u;", "", "", "title", "subtitle", "Lu4/d;", "icon", "Lnr/g0;", "imageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Lnr/g0;)V", "c", "b", "a", "Lnr/u$a;", "Lnr/u$b;", "Lnr/u$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f127360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f127361d;

    public /* synthetic */ u(String str, String str2, u4.d dVar, g0 g0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : g0Var, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public u4.d getF127360c() {
        return this.f127360c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public g0 getF127361d() {
        return this.f127361d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getF127359b() {
        return this.f127359b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getF127358a() {
        return this.f127358a;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/u$c;", "Lnr/u;", "", "title", "subtitle", "Lu4/d;", "icon", "Lnr/g0;", "imageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Lnr/g0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u4.d f127374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g0 f127375h;

        public /* synthetic */ c(String str, String str2, u4.d dVar, g0 g0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : g0Var);
        }

        @Override // nr.u
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u4.d getF127360c() {
            return this.f127374g;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: b, reason: from getter */
        public final g0 getF127361d() {
            return this.f127375h;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF127359b() {
            return this.f127373f;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF127358a() {
            return this.f127372e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f127372e, cVar.f127372e) && p005kotlin.jvm.internal.s.g(this.f127373f, cVar.f127373f) && p005kotlin.jvm.internal.s.g(this.f127374g, cVar.f127374g) && p005kotlin.jvm.internal.s.g(this.f127375h, cVar.f127375h);
        }

        public final int hashCode() {
            String str = this.f127372e;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127373f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            u4.d dVar = this.f127374g;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            g0 g0Var = this.f127375h;
            return iHashCode3 + (g0Var != null ? g0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("NonNavigable(title=", this.f127372e, ", subtitle=", this.f127373f, ", icon=");
            sbI.append(this.f127374g);
            sbI.append(", imageData=");
            sbI.append(this.f127375h);
            sbI.append(")");
            return sbI.toString();
        }

        public c(String str, String str2, u4.d dVar, g0 g0Var) {
            super(str, str2, null, g0Var, 4, null);
            this.f127372e = str;
            this.f127373f = str2;
            this.f127374g = dVar;
            this.f127375h = g0Var;
        }

        public c() {
            this(null, null, null, null, 15, null);
        }
    }

    private u(String str, String str2, u4.d dVar, g0 g0Var) {
        this.f127358a = str;
        this.f127359b = str2;
        this.f127360c = dVar;
        this.f127361d = g0Var;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/u$a;", "Lnr/u;", "", "title", "subtitle", "Lu4/d;", "icon", "Lnr/g0;", "imageData", "Lkotlin/Function0;", "", "onIconSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Lnr/g0;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u4.d f127364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g0 f127365h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.a<Unit> f127366i;

        public /* synthetic */ a(String str, String str2, u4.d dVar, g0 g0Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : g0Var, (i14 & 16) != 0 ? null : aVar);
        }

        @Override // nr.u
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u4.d getF127360c() {
            return this.f127364g;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: b, reason: from getter */
        public final g0 getF127361d() {
            return this.f127365h;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF127359b() {
            return this.f127363f;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF127358a() {
            return this.f127362e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f127362e, aVar.f127362e) && p005kotlin.jvm.internal.s.g(this.f127363f, aVar.f127363f) && p005kotlin.jvm.internal.s.g(this.f127364g, aVar.f127364g) && p005kotlin.jvm.internal.s.g(this.f127365h, aVar.f127365h) && p005kotlin.jvm.internal.s.g(this.f127366i, aVar.f127366i);
        }

        public final int hashCode() {
            String str = this.f127362e;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127363f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            u4.d dVar = this.f127364g;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            g0 g0Var = this.f127365h;
            int iHashCode4 = (iHashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
            e23.a<Unit> aVar = this.f127366i;
            return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("HelpNavigable(title=", this.f127362e, ", subtitle=", this.f127363f, ", icon=");
            sbI.append(this.f127364g);
            sbI.append(", imageData=");
            sbI.append(this.f127365h);
            sbI.append(", onIconSelected=");
            return n23.j.i(sbI, this.f127366i, ")");
        }

        public a(String str, String str2, u4.d dVar, g0 g0Var, e23.a<Unit> aVar) {
            super(str, str2, null, g0Var, 4, null);
            this.f127362e = str;
            this.f127363f = str2;
            this.f127364g = dVar;
            this.f127365h = g0Var;
            this.f127366i = aVar;
        }

        public a() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/u$b;", "Lnr/u;", "", "title", "subtitle", "Lu4/d;", "icon", "Lnr/g0;", "imageData", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Lnr/g0;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f127367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f127368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u4.d f127369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g0 f127370h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.a<Unit> f127371i;

        public /* synthetic */ b(String str, String str2, u4.d dVar, g0 g0Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : g0Var, (i14 & 16) != 0 ? null : aVar);
        }

        @Override // nr.u
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u4.d getF127360c() {
            return this.f127369g;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: b, reason: from getter */
        public final g0 getF127361d() {
            return this.f127370h;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF127359b() {
            return this.f127368f;
        }

        @Override // nr.u
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF127358a() {
            return this.f127367e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f127367e, bVar.f127367e) && p005kotlin.jvm.internal.s.g(this.f127368f, bVar.f127368f) && p005kotlin.jvm.internal.s.g(this.f127369g, bVar.f127369g) && p005kotlin.jvm.internal.s.g(this.f127370h, bVar.f127370h) && p005kotlin.jvm.internal.s.g(this.f127371i, bVar.f127371i);
        }

        public final int hashCode() {
            String str = this.f127367e;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127368f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            u4.d dVar = this.f127369g;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            g0 g0Var = this.f127370h;
            int iHashCode4 = (iHashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
            e23.a<Unit> aVar = this.f127371i;
            return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Navigable(title=", this.f127367e, ", subtitle=", this.f127368f, ", icon=");
            sbI.append(this.f127369g);
            sbI.append(", imageData=");
            sbI.append(this.f127370h);
            sbI.append(", onItemSelected=");
            return n23.j.i(sbI, this.f127371i, ")");
        }

        public b(String str, String str2, u4.d dVar, g0 g0Var, e23.a<Unit> aVar) {
            super(str, str2, null, g0Var, 4, null);
            this.f127367e = str;
            this.f127368f = str2;
            this.f127369g = dVar;
            this.f127370h = g0Var;
            this.f127371i = aVar;
        }

        public b() {
            this(null, null, null, null, null, 31, null);
        }
    }

    public /* synthetic */ u(String str, String str2, u4.d dVar, g0 g0Var, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, dVar, g0Var);
    }
}
