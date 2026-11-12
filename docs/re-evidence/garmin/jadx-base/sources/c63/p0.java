package c63;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006Bi\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lc63/p0;", "", "", "", "names", "<init>", "(Ljava/util/List;)V", "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25038b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f25039c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f25040a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25041a = new b();

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
        new p0(p13.x.k("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f25039c = new p0(p13.x.k("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public p0(List<String> list) {
        list.getClass();
        this.f25040a = list;
        if (list.size() != 12) {
            vb.h.s("Month names must contain exactly 12 elements");
            throw null;
        }
        Iterator<Integer> it = p13.x.i(list).iterator();
        while (it.hasNext()) {
            int iNextInt = ((p13.p0) it).nextInt();
            if (this.f25040a.get(iNextInt).length() <= 0) {
                vb.h.s("A month name can not be empty");
                throw null;
            }
            for (int i14 = 0; i14 < iNextInt; i14++) {
                if (p005kotlin.jvm.internal.s.g(this.f25040a.get(iNextInt), this.f25040a.get(i14))) {
                    vb.h.x(am.j.o(this.f25040a.get(iNextInt), "' was repeated", new StringBuilder("Month names must be unique, but '")));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return p005kotlin.jvm.internal.s.g(this.f25040a, ((p0) obj).f25040a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25040a.hashCode();
    }

    public final String toString() {
        return p13.h0.k0(this.f25040a, ", ", "MonthNames(", ")", b.f25041a, 24);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/p0$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this(p13.x.k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12));
        hb.a.p(str, str2, str3, str4, str5);
        hb.a.p(str6, str7, str8, str9, str10);
        str11.getClass();
        str12.getClass();
    }
}
