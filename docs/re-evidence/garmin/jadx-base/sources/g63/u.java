package g63;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lg63/u;", "Output", "Lg63/m;", "", "", "strings", "Lg63/a;", "setter", "whatThisExpects", "<init>", "(Ljava/util/Collection;Lg63/a;Ljava/lang/String;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u<Output> implements m<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g63.a<Output, String> f76167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f76169c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((o13.p) t7).f128594a, (String) ((o13.p) t14).f128594a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e23.l<o13.p<? extends String, ? extends a>, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparable f76172a;

        public c(Comparable comparable) {
            this.f76172a = comparable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Integer invoke(o13.p<? extends String, ? extends a> pVar) {
            return Integer.valueOf(r13.a.b((String) pVar.f128594a, this.f76172a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(Collection<String> collection, g63.a<? super Output, String> aVar, String str) {
        collection.getClass();
        aVar.getClass();
        str.getClass();
        this.f76167a = aVar;
        this.f76168b = str;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z14 = false;
        int i14 = 3;
        this.f76169c = new a(null, z14, i14, 0 == true ? 1 : 0);
        for (String str2 : collection) {
            if (str2.length() <= 0) {
                vb.h.x("Found an empty string in ".concat(this.f76168b));
                throw null;
            }
            a aVar2 = this.f76169c;
            int length = str2.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = str2.charAt(i15);
                List<o13.p<String, a>> list = aVar2.f76170a;
                int iE = p13.x.e(new c(String.valueOf(cCharAt)), list, list.size());
                if (iE < 0) {
                    a aVar3 = new a(objArr2 == true ? 1 : 0, z14, i14, objArr == true ? 1 : 0);
                    list.add((-iE) - 1, new o13.p<>(String.valueOf(cCharAt), aVar3));
                    aVar2 = aVar3;
                } else {
                    aVar2 = list.get(iE).f128595b;
                }
            }
            if (aVar2.f76171b) {
                vb.h.x(am.j.m("The string '", str2, "' was passed several times"));
                throw null;
            }
            aVar2.f76171b = true;
        }
        b(this.f76169c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a aVar) {
        List<o13.p<String, a>> list = aVar.f76170a;
        List<o13.p<String, a>> list2 = aVar.f76170a;
        Iterator<o13.p<String, a>> it = list.iterator();
        while (it.hasNext()) {
            b(it.next().f128595b);
        }
        ArrayList arrayList = new ArrayList();
        for (o13.p<String, a> pVar : list2) {
            String str = pVar.f128594a;
            a aVar2 = pVar.f128595b;
            boolean z14 = aVar2.f76171b;
            List<o13.p<String, a>> list3 = aVar2.f76170a;
            if (z14 || list3.size() != 1) {
                arrayList.add(new o13.p(str, aVar2));
            } else {
                o13.p pVar2 = (o13.p) h0.I0(list3);
                String str2 = (String) pVar2.f128594a;
                arrayList.add(new o13.p(tn.k.g(str, str2), (a) pVar2.f128595b));
            }
        }
        list2.clear();
        list2.addAll(h0.N0(arrayList, new b()));
    }

    @Override // g63.m
    public final Object a(g63.c cVar, CharSequence charSequence, int i14) {
        String str;
        a aVar;
        charSequence.getClass();
        p0 p0Var = new p0();
        p0Var.f105807a = i14;
        a aVar2 = this.f76169c;
        Integer numValueOf = null;
        loop0: while (p0Var.f105807a <= charSequence.length()) {
            if (aVar2.f76171b) {
                numValueOf = Integer.valueOf(p0Var.f105807a);
            }
            Iterator<o13.p<String, a>> it = aVar2.f76170a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                o13.p<String, a> next = it.next();
                str = next.f128594a;
                aVar = next.f128595b;
            } while (!d53.w.Y(charSequence, p0Var.f105807a, str));
            p0Var.f105807a = str.length() + p0Var.f105807a;
            aVar2 = aVar;
        }
        if (numValueOf == null) {
            i.a aVar3 = i.f76142b;
            b21.k kVar = new b21.k(this, charSequence, i14, p0Var, 3);
            aVar3.getClass();
            return new h(i14, kVar);
        }
        String string = charSequence.subSequence(i14, numValueOf.intValue()).toString();
        g63.a<Output, String> aVar4 = this.f76167a;
        String strC = aVar4.c(cVar, string);
        if (strC == null) {
            i.f76142b.getClass();
            return numValueOf;
        }
        i.a aVar5 = i.f76142b;
        fk0.a aVar6 = new fk0.a(strC, 9, string, aVar4);
        aVar5.getClass();
        return new h(i14, aVar6);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg63/u$a;", "", "", "Lo13/p;", "", MapboxMap.QFE_CHILDREN, "", "isTerminal", "<init>", "(Ljava/util/List;Z)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<o13.p<String, a>> f76170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f76171b;

        public /* synthetic */ a(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? new ArrayList() : list, (i14 & 2) != 0 ? false : z14);
        }

        public a(List<o13.p<String, a>> list, boolean z14) {
            list.getClass();
            this.f76170a = list;
            this.f76171b = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }
}
