package md;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lmd/n;", "", "", "name", "", "Lmd/n$a;", "columns", "", "Lmd/n$c;", "foreignKeys", "Lmd/n$d;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "b", "a", "c", "d", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f117868e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, a> f117870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<c> f117871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<d> f117872d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmd/n$c;", "", "", "referenceTable", "onDelete", "onUpdate", "", "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f117881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f117882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f117883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f117884e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.f117880a = str;
            this.f117881b = str2;
            this.f117882c = str3;
            this.f117883d = list;
            this.f117884e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f117880a.equals(cVar.f117880a) && this.f117881b.equals(cVar.f117881b) && this.f117882c.equals(cVar.f117882c) && this.f117883d.equals(cVar.f117883d)) {
                return this.f117884e.equals(cVar.f117884e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f117884e.hashCode() + u0.b(wr.g.j(wr.g.j(this.f117880a.hashCode() * 31, 31, this.f117881b), 31, this.f117882c), 31, this.f117883d);
        }

        public final String toString() {
            return d53.n.b(d53.n.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.f117880a + "',\n            |   onDelete = '" + this.f117881b + "',\n            |   onUpdate = '" + this.f117882c + "',\n            |   columnNames = {" + q.d(h0.M0(this.f117883d)) + "\n            |   referenceColumnNames = {" + q.c(h0.M0(this.f117884e)) + "\n            |}\n        "));
        }
    }

    public n(String str, Map<String, a> map, Set<c> set, Set<d> set2) {
        str.getClass();
        map.getClass();
        set.getClass();
        this.f117869a = str;
        this.f117870b = map;
        this.f117871c = set;
        this.f117872d = set2;
    }

    @o13.e
    public static final n a(vd.c cVar, String str) {
        f117868e.getClass();
        cVar.getClass();
        return b.a(new xd.a(cVar), str);
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!s.g(this.f117869a, nVar.f117869a) || !s.g(this.f117870b, nVar.f117870b) || !s.g(this.f117871c, nVar.f117871c)) {
            return false;
        }
        Set<d> set2 = this.f117872d;
        if (set2 == null || (set = nVar.f117872d) == null) {
            return true;
        }
        return s.g(set2, set);
    }

    public final int hashCode() {
        return this.f117871c.hashCode() + am.j.b(this.f117870b, this.f117869a.hashCode() * 31, 31);
    }

    public final String toString() {
        Collection collectionN0;
        StringBuilder sb3 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb3.append(this.f117869a);
        sb3.append("',\n            |    columns = {");
        sb3.append(q.b(h0.N0(this.f117870b.values(), new o())));
        sb3.append("\n            |    foreignKeys = {");
        sb3.append(q.b(this.f117871c));
        sb3.append("\n            |    indices = {");
        Set<d> set = this.f117872d;
        if (set == null || (collectionN0 = h0.N0(set, new p())) == null) {
            collectionN0 = j0.f134944a;
        }
        sb3.append(q.b(collectionN0));
        sb3.append("\n            |}\n        ");
        return d53.n.d(sb3.toString());
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lmd/n$a;", "", "", "name", NotificationConstants.KEY_DATA_MIME_TYPE, "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f117874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f117875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f117876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f117877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f117878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f117879g;

        static {
            new C2240a(null);
        }

        public a(String str, String str2, boolean z14, int i14, String str3, int i15) {
            str.getClass();
            str2.getClass();
            this.f117873a = str;
            this.f117874b = str2;
            this.f117875c = z14;
            this.f117876d = i14;
            this.f117877e = str3;
            this.f117878f = i15;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            this.f117879g = w.z(upperCase, "INT", false) ? 3 : (w.z(upperCase, "CHAR", false) || w.z(upperCase, "CLOB", false) || w.z(upperCase, "TEXT", false)) ? 2 : w.z(upperCase, "BLOB", false) ? 5 : (w.z(upperCase, "REAL", false) || w.z(upperCase, "FLOA", false) || w.z(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    boolean z14 = this.f117876d > 0;
                    a aVar = (a) obj;
                    int i14 = aVar.f117878f;
                    if (z14 == (aVar.f117876d > 0) && s.g(this.f117873a, aVar.f117873a) && this.f117875c == aVar.f117875c) {
                        String str = aVar.f117877e;
                        int i15 = this.f117878f;
                        String str2 = this.f117877e;
                        if ((i15 != 1 || i14 != 2 || str2 == null || q.a(str2, str)) && ((i15 != 2 || i14 != 1 || str == null || q.a(str, str2)) && ((i15 == 0 || i15 != i14 || (str2 == null ? str == null : q.a(str2, str))) && this.f117879g == aVar.f117879g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f117873a.hashCode() * 31) + this.f117879g) * 31) + (this.f117875c ? 1231 : 1237)) * 31) + this.f117876d;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("\n            |Column {\n            |   name = '");
            sb3.append(this.f117873a);
            sb3.append("',\n            |   type = '");
            sb3.append(this.f117874b);
            sb3.append("',\n            |   affinity = '");
            sb3.append(this.f117879g);
            sb3.append("',\n            |   notNull = '");
            sb3.append(this.f117875c);
            sb3.append("',\n            |   primaryKeyPosition = '");
            sb3.append(this.f117876d);
            sb3.append("',\n            |   defaultValue = '");
            String str = this.f117877e;
            if (str == null) {
                str = "undefined";
            }
            sb3.append(str);
            sb3.append("'\n            |}\n        ");
            return d53.n.b(d53.n.d(sb3.toString()));
        }

        /* JADX INFO: renamed from: md.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmd/n$a$a;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2240a {
            public /* synthetic */ C2240a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2240a() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @o13.e
        public a(String str, String str2, boolean z14, int i14) {
            this(str, str2, z14, i14, null, 0);
            str.getClass();
            str2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lmd/n$d;", "", "", "name", "", "unique", "", "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f117886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f117887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f117888d;

        static {
            new a(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        public d(String str, boolean z14, List<String> list, List<String> list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.f117885a = str;
            this.f117886b = z14;
            this.f117887c = list;
            this.f117888d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i14 = 0; i14 < size; i14++) {
                    list2.add("ASC");
                }
            }
            this.f117888d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                String str = dVar.f117885a;
                if (this.f117886b == dVar.f117886b && s.g(this.f117887c, dVar.f117887c) && s.g(this.f117888d, dVar.f117888d)) {
                    String str2 = this.f117885a;
                    return u.y(str2, "index_", false) ? u.y(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f117885a;
            return this.f117888d.hashCode() + u0.b((((u.y(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f117886b ? 1 : 0)) * 31, 31, this.f117887c);
        }

        public final String toString() {
            return d53.n.b(d53.n.d("\n            |Index {\n            |   name = '" + this.f117885a + "',\n            |   unique = '" + this.f117886b + "',\n            |   columns = {" + q.d(this.f117887c) + "\n            |   orders = {" + q.c(this.f117888d) + "\n            |}\n        "));
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmd/n$d$a;", "", "<init>", "()V", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        @o13.e
        public d(String str, boolean z14, List<String> list) {
            str.getClass();
            list.getClass();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add("ASC");
            }
            this(str, z14, list, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lmd/n$b;", "", "<init>", "()V", "", "CREATED_FROM_UNKNOWN", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_DATABASE", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(ud.a aVar, String str) {
            Map mapB;
            q13.g gVar;
            aVar.getClass();
            ud.c cVarM0 = aVar.M0("PRAGMA table_info(`" + str + "`)");
            try {
                long j8 = 0;
                if (cVarM0.J0()) {
                    int iN = ge1.b.n(cVarM0, "name");
                    int iN2 = ge1.b.n(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iN3 = ge1.b.n(cVarM0, "notnull");
                    int iN4 = ge1.b.n(cVarM0, "pk");
                    int iN5 = ge1.b.n(cVarM0, "dflt_value");
                    q13.c cVar = new q13.c();
                    do {
                        String strM1 = cVarM0.M1(iN);
                        cVar.put(strM1, new a(strM1, cVarM0.M1(iN2), cVarM0.getLong(iN3) != 0, (int) cVarM0.getLong(iN4), cVarM0.isNull(iN5) ? null : cVarM0.M1(iN5), 2));
                    } while (cVarM0.J0());
                    mapB = cVar.b();
                    zf.b.h(cVarM0, null);
                } else {
                    mapB = k0.f134949a;
                    mapB.getClass();
                    zf.b.h(cVarM0, null);
                }
                ud.c cVarM1 = aVar.M0("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int iN6 = ge1.b.n(cVarM1, TtmlNode.ATTR_ID);
                    int iN7 = ge1.b.n(cVarM1, "seq");
                    int iN8 = ge1.b.n(cVarM1, "table");
                    int iN9 = ge1.b.n(cVarM1, "on_delete");
                    int iN10 = ge1.b.n(cVarM1, "on_update");
                    List<j> listA = m.a(cVarM1);
                    cVarM1.reset();
                    q13.g gVar2 = new q13.g();
                    while (cVarM1.J0()) {
                        if (cVarM1.getLong(iN7) == j8) {
                            int i14 = (int) cVarM1.getLong(iN6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i15 = iN6;
                            ArrayList<j> arrayList3 = new ArrayList();
                            for (Object obj : listA) {
                                int i16 = iN7;
                                List<j> list = listA;
                                if (((j) obj).f117861a == i14) {
                                    arrayList3.add(obj);
                                }
                                iN7 = i16;
                                listA = list;
                            }
                            int i17 = iN7;
                            List<j> list2 = listA;
                            for (j jVar : arrayList3) {
                                arrayList.add(jVar.f117863c);
                                arrayList2.add(jVar.f117864d);
                            }
                            gVar2.add(new c(cVarM1.M1(iN8), cVarM1.M1(iN9), cVarM1.M1(iN10), arrayList, arrayList2));
                            iN6 = i15;
                            iN7 = i17;
                            listA = list2;
                            j8 = 0;
                        }
                    }
                    q13.g gVarA = a1.a(gVar2);
                    zf.b.h(cVarM1, null);
                    ud.c cVarM2 = aVar.M0("PRAGMA index_list(`" + str + "`)");
                    try {
                        int iN11 = ge1.b.n(cVarM2, "name");
                        int iN12 = ge1.b.n(cVarM2, "origin");
                        int iN13 = ge1.b.n(cVarM2, "unique");
                        if (iN11 == -1 || iN12 == -1 || iN13 == -1) {
                            zf.b.h(cVarM2, null);
                            gVar = null;
                        } else {
                            q13.g gVar3 = new q13.g();
                            while (cVarM2.J0()) {
                                if ("c".equals(cVarM2.M1(iN12))) {
                                    d dVarB = m.b(aVar, cVarM2.M1(iN11), cVarM2.getLong(iN13) == 1);
                                    if (dVarB == null) {
                                        zf.b.h(cVarM2, null);
                                        gVar = null;
                                    } else {
                                        gVar3.add(dVarB);
                                    }
                                }
                            }
                            q13.g gVarA2 = a1.a(gVar3);
                            zf.b.h(cVarM2, null);
                            gVar = gVarA2;
                        }
                        return new n(str, mapB, gVarA, gVar);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            zf.b.h(cVarM2, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        zf.b.h(cVarM1, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    zf.b.h(cVarM0, th7);
                    throw th8;
                }
            }
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public n(String str, Map<String, a> map, Set<c> set) {
        this(str, map, set, l0.f134950a);
        str.getClass();
        map.getClass();
        set.getClass();
    }

    public /* synthetic */ n(String str, Map map, Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, map, set, (i14 & 8) != 0 ? null : set2);
    }
}
