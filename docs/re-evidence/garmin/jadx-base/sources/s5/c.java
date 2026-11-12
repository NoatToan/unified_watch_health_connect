package s5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000f¨\u0006\u0014"}, d2 = {"Ls5/c;", "", "", "Ls5/c$d;", "Ls5/c$a;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ls5/i0;", "spanStyles", "Ls5/w;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "d", "b", "a", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d<? extends a>> f157137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f157139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f157140d;

    public interface a {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\f\rB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Ls5/c$b;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", "text", "(Ljava/lang/String;)V", "Ls5/c;", "(Ls5/c;)V", "b", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f157141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f157142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f157143c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls5/c$b$a;", "", "Ls5/c$b;", "builder", "<init>", "(Ls5/c$b;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public a(b bVar) {
                new ArrayList();
            }
        }

        public b(int i14) {
            this.f157141a = new StringBuilder(i14);
            this.f157142b = new ArrayList();
            this.f157143c = new ArrayList();
            new a(this);
        }

        public final void a(i0 i0Var, int i14, int i15) {
            this.f157143c.add(new C2962b(i0Var, i14, i15, null, 8, null));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof c) {
                c((c) charSequence);
                return this;
            }
            this.f157141a.append(charSequence);
            return this;
        }

        public final void b(String str) {
            this.f157141a.append(str);
        }

        public final void c(c cVar) {
            StringBuilder sb3 = this.f157141a;
            int length = sb3.length();
            sb3.append(cVar.f157138b);
            List<d<? extends a>> list = cVar.f157137a;
            if (list != null) {
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    d<? extends a> dVar = list.get(i14);
                    this.f157143c.add(new C2962b(dVar.f157149a, dVar.f157150b + length, dVar.f157151c + length, dVar.f157152d));
                }
            }
        }

        public final void d(c cVar, int i14, int i15) {
            StringBuilder sb3 = this.f157141a;
            int length = sb3.length();
            sb3.append((CharSequence) cVar.f157138b, i14, i15);
            List listA = f.a(cVar, i14, i15, null);
            if (listA != null) {
                int size = listA.size();
                for (int i16 = 0; i16 < size; i16++) {
                    d dVar = (d) listA.get(i16);
                    this.f157143c.add(new C2962b(dVar.f157149a, dVar.f157150b + length, dVar.f157151c + length, dVar.f157152d));
                }
            }
        }

        public final void e() {
            ArrayList arrayList = this.f157142b;
            if (arrayList.isEmpty()) {
                y5.a.c("Nothing to pop.");
            }
            ((C2962b) arrayList.remove(arrayList.size() - 1)).f157147c = this.f157141a.length();
        }

        public final void f(int i14) {
            ArrayList arrayList = this.f157142b;
            if (i14 >= arrayList.size()) {
                y5.a.c(i14 + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i14) {
                e();
            }
        }

        public final int g(m mVar) {
            C2962b c2962b = new C2962b(mVar, this.f157141a.length(), 0, null, 12, null);
            ArrayList arrayList = this.f157142b;
            arrayList.add(c2962b);
            this.f157143c.add(c2962b);
            return arrayList.size() - 1;
        }

        public final void h(String str, String str2) {
            C2962b c2962b = new C2962b(k0.a(str2), this.f157141a.length(), 0, str, 4, null);
            ArrayList arrayList = this.f157142b;
            arrayList.add(c2962b);
            this.f157143c.add(c2962b);
            arrayList.size();
        }

        public final int i(w wVar) {
            C2962b c2962b = new C2962b(wVar, this.f157141a.length(), 0, null, 12, null);
            ArrayList arrayList = this.f157142b;
            arrayList.add(c2962b);
            this.f157143c.add(c2962b);
            return arrayList.size() - 1;
        }

        public final int j(i0 i0Var) {
            C2962b c2962b = new C2962b(i0Var, this.f157141a.length(), 0, null, 12, null);
            ArrayList arrayList = this.f157142b;
            arrayList.add(c2962b);
            this.f157143c.add(c2962b);
            return arrayList.size() - 1;
        }

        public final c k() {
            StringBuilder sb3 = this.f157141a;
            String string = sb3.toString();
            ArrayList arrayList = this.f157143c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList2.add(((C2962b) arrayList.get(i14)).a(sb3.length()));
            }
            return new c(string, arrayList2);
        }

        /* JADX INFO: renamed from: s5.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ls5/c$b$b;", "T", "", "item", "", TtmlNode.START, TtmlNode.END, "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class C2962b<T> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final a f157144e = new a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f157145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f157146b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f157147c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f157148d;

            public /* synthetic */ C2962b(Object obj, int i14, int i15, String str, int i16, p005kotlin.jvm.internal.j jVar) {
                this(obj, i14, (i16 & 4) != 0 ? Integer.MIN_VALUE : i15, (i16 & 8) != 0 ? "" : str);
            }

            public final d<T> a(int i14) {
                int i15 = this.f157147c;
                if (i15 != Integer.MIN_VALUE) {
                    i14 = i15;
                }
                if (!(i14 != Integer.MIN_VALUE)) {
                    y5.a.c("Item.end should be set first");
                }
                return new d<>(this.f157145a, this.f157146b, i14, this.f157148d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2962b)) {
                    return false;
                }
                C2962b c2962b = (C2962b) obj;
                return p005kotlin.jvm.internal.s.g(this.f157145a, c2962b.f157145a) && this.f157146b == c2962b.f157146b && this.f157147c == c2962b.f157147c && p005kotlin.jvm.internal.s.g(this.f157148d, c2962b.f157148d);
            }

            public final int hashCode() {
                T t7 = this.f157145a;
                return this.f157148d.hashCode() + q2.d(this.f157147c, q2.d(this.f157146b, (t7 == null ? 0 : t7.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("MutableRange(item=");
                sb3.append(this.f157145a);
                sb3.append(", start=");
                sb3.append(this.f157146b);
                sb3.append(", end=");
                sb3.append(this.f157147c);
                sb3.append(", tag=");
                return androidx.room.a0.m(sb3, this.f157148d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }

            /* JADX INFO: renamed from: s5.c$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/c$b$b$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                private a() {
                }
            }

            public C2962b(T t7, int i14, int i15, String str) {
                this.f157145a = t7;
                this.f157146b = i14;
                this.f157147c = i15;
                this.f157148d = str;
            }
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i14, int i15) {
            if (charSequence instanceof c) {
                d((c) charSequence, i14, i15);
                return this;
            }
            this.f157141a.append(charSequence, i14, i15);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c14) {
            this.f157141a.append(c14);
            return this;
        }

        public b() {
            this(0, 1, null);
        }

        public /* synthetic */ b(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? 16 : i14);
        }

        public b(String str) {
            this(0, 1, null);
            b(str);
        }

        public b(c cVar) {
            this(0, 1, null);
            c(cVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((d) t7).f157150b), Integer.valueOf(((d) t14).f157150b));
        }
    }

    static {
        new C2963c(null);
        d4.l lVar = f0.f157159a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends d<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f157137a = list;
        this.f157138b = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i14 = 0; i14 < size; i14++) {
                d dVar = (d) list.get(i14);
                T t7 = dVar.f157149a;
                if (t7 instanceof i0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(dVar);
                } else if (t7 instanceof w) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f157139c = arrayList;
        this.f157140d = arrayList2;
        List listN0 = arrayList2 != null ? p13.h0.N0(arrayList2, new e()) : null;
        if (listN0 == null || listN0.isEmpty()) {
            return;
        }
        int i15 = ((d) p13.h0.b0(listN0)).f157151c;
        p1.h0 h0Var = p1.m.f134768a;
        p1.h0 h0Var2 = new p1.h0(1);
        h0Var2.d(i15);
        int size2 = listN0.size();
        for (int i16 = 1; i16 < size2; i16++) {
            d dVar2 = (d) listN0.get(i16);
            while (h0Var2.f134763b != 0) {
                int iB = h0Var2.b();
                int i17 = dVar2.f157150b;
                int i18 = dVar2.f157151c;
                if (i17 < iB) {
                    if (i18 > iB) {
                        y5.a.a("Paragraph overlap not allowed, end " + i18 + " should be less than or equal to " + iB);
                        break;
                    }
                    break;
                }
                h0Var2.f(h0Var2.f134763b - 1);
            }
            h0Var2.d(dVar2.f157151c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i14) {
        ?? arrayList;
        List<d<? extends a>> list = this.f157137a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                d<? extends a> dVar = list.get(i15);
                d<? extends a> dVar2 = dVar;
                if ((dVar2.f157149a instanceof m) && f.b(0, i14, dVar2.f157150b, dVar2.f157151c)) {
                    arrayList.add(dVar);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        arrayList.getClass();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List b(int i14, int i15, String str) {
        List<d<? extends a>> list = this.f157137a;
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            d<? extends a> dVar = list.get(i16);
            T t7 = dVar.f157149a;
            int i17 = dVar.f157151c;
            int i18 = dVar.f157150b;
            String str2 = dVar.f157152d;
            if ((t7 instanceof k0) && str.equals(str2) && f.b(i14, i15, i18, i17)) {
                T t14 = dVar.f157149a;
                t14.getClass();
                arrayList.add(new d(((k0) t14).f157233a, i18, i17, str2));
            }
        }
        return arrayList;
    }

    public final c c(e23.l<? super d<? extends a>, ? extends d<? extends a>> lVar) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.f157143c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            b.C2962b c2962b = (b.C2962b) arrayList.get(i14);
            b.C2962b.a aVar = b.C2962b.f157144e;
            d<? extends a> dVarInvoke = lVar.invoke(c2962b.a(Integer.MIN_VALUE));
            b.C2962b.f157144e.getClass();
            arrayList.set(i14, new b.C2962b(dVarInvoke.f157149a, dVarInvoke.f157150b, dVarInvoke.f157151c, dVarInvoke.f157152d));
        }
        return bVar.k();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        return this.f157138b.charAt(i14);
    }

    public final c d(c cVar) {
        b bVar = new b(this);
        bVar.c(cVar);
        return bVar.k();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c subSequence(int i14, int i15) {
        ArrayList arrayList;
        if (!(i14 <= i15)) {
            y5.a.a("start (" + i14 + ") should be less or equal to end (" + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        String str = this.f157138b;
        if (i14 == 0 && i15 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i14, i15);
        c cVar = f.f157158a;
        if (i14 > i15) {
            y5.a.a("start (" + i14 + ") should be less than or equal to end (" + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        List<d<? extends a>> list = this.f157137a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                d<? extends a> dVar = list.get(i16);
                int i17 = dVar.f157150b;
                int i18 = dVar.f157151c;
                if (f.b(i14, i15, i17, i18)) {
                    arrayList.add(new d(dVar.f157149a, Math.max(i14, dVar.f157150b) - i14, Math.min(i15, i18) - i14, dVar.f157152d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new c(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f157138b, cVar.f157138b) && p005kotlin.jvm.internal.s.g(this.f157137a, cVar.f157137a);
    }

    public final int hashCode() {
        int iHashCode = this.f157138b.hashCode() * 31;
        List<d<? extends a>> list = this.f157137a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f157138b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f157138b;
    }

    /* JADX INFO: renamed from: s5.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/c$c;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2963c {
        public /* synthetic */ C2963c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2963c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ls5/c$d;", "T", "", "item", "", TtmlNode.START, TtmlNode.END, "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f157149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f157150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f157151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f157152d;

        public d(T t7, int i14, int i15, String str) {
            this.f157149a = t7;
            this.f157150b = i14;
            this.f157151c = i15;
            this.f157152d = str;
            if (i14 <= i15) {
                return;
            }
            y5.a.a("Reversed range is not supported");
        }

        public static d a(d dVar, a aVar, int i14, int i15, int i16) {
            if ((i16 & 1) != 0) {
                aVar = dVar.f157149a;
            }
            if ((i16 & 2) != 0) {
                i14 = dVar.f157150b;
            }
            if ((i16 & 4) != 0) {
                i15 = dVar.f157151c;
            }
            String str = dVar.f157152d;
            dVar.getClass();
            return new d(aVar, i14, i15, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f157149a, dVar.f157149a) && this.f157150b == dVar.f157150b && this.f157151c == dVar.f157151c && p005kotlin.jvm.internal.s.g(this.f157152d, dVar.f157152d);
        }

        public final int hashCode() {
            T t7 = this.f157149a;
            return this.f157152d.hashCode() + q2.d(this.f157151c, q2.d(this.f157150b, (t7 == null ? 0 : t7.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Range(item=");
            sb3.append(this.f157149a);
            sb3.append(", start=");
            sb3.append(this.f157150b);
            sb3.append(", end=");
            sb3.append(this.f157151c);
            sb3.append(", tag=");
            return androidx.room.a0.m(sb3, this.f157152d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public d(T t7, int i14, int i15) {
            this(t7, i14, i15, "");
        }
    }

    public c(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (List<? extends d<? extends a>>) ((i14 & 2) != 0 ? p13.j0.f134944a : list));
    }

    public c(String str, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, List<d<i0>> list, List<d<w>> list2) {
        List list3;
        c cVar = f.f157158a;
        if (list.isEmpty() && list2.isEmpty()) {
            list3 = null;
        } else {
            list3 = list;
            if (!list2.isEmpty()) {
                if (list.isEmpty()) {
                    list3 = list2;
                } else {
                    ArrayList arrayList = new ArrayList(list2.size() + list.size());
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList.add(list.get(i14));
                    }
                    int size2 = list2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        arrayList.add(list2.get(i15));
                    }
                    list3 = arrayList;
                }
            }
        }
        this((List<? extends d<? extends a>>) list3, str);
    }

    public c(String str, List<? extends d<? extends a>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
