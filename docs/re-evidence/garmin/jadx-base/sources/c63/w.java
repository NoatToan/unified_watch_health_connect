package c63;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006BA\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc63/w;", "", "", "", "names", "<init>", "(Ljava/util/List;)V", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25064b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f25065c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f25066a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25067a = new b();

        public b() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(String str) {
            String str2 = str;
            str2.getClass();
            return str2.toString();
        }
    }

    static {
        new w(p13.x.k("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        f25065c = new w(p13.x.k("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public w(List<String> list) {
        list.getClass();
        this.f25066a = list;
        if (list.size() != 7) {
            vb.h.s("Day of week names must contain exactly 7 elements");
            throw null;
        }
        Iterator<Integer> it = p13.x.i(list).iterator();
        while (it.hasNext()) {
            int iNextInt = ((p13.p0) it).nextInt();
            if (this.f25066a.get(iNextInt).length() <= 0) {
                vb.h.s("A day-of-week name can not be empty");
                throw null;
            }
            for (int i14 = 0; i14 < iNextInt; i14++) {
                if (p005kotlin.jvm.internal.s.g(this.f25066a.get(iNextInt), this.f25066a.get(i14))) {
                    vb.h.x(am.j.o(this.f25066a.get(iNextInt), "' was repeated", new StringBuilder("Day-of-week names must be unique, but '")));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return p005kotlin.jvm.internal.s.g(this.f25066a, ((w) obj).f25066a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25066a.hashCode();
    }

    public final String toString() {
        return p13.h0.k0(this.f25066a, ", ", "DayOfWeekNames(", ")", b.f25067a, 24);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/w$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(p13.x.k(str, str2, str3, str4, str5, str6, str7));
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
    }
}
