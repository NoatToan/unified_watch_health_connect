package jx0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import c22.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.f0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljx0/b;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroidx/fragment/app/v;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<a> f101410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f101411i;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljx0/b$a;", "", "Lc22/h0;", "dateRange", "Lww0/k$b;", "reportType", "Lww0/k;", "report", "", "loading", "<init>", "(Lc22/h0;Lww0/k$b;Lww0/k;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h0 f101412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ww0.k.b f101413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ww0.k f101414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f101415d;

        public a(h0 h0Var, ww0.k.b bVar, ww0.k kVar, boolean z14) {
            h0Var.getClass();
            bVar.getClass();
            this.f101412a = h0Var;
            this.f101413b = bVar;
            this.f101414c = kVar;
            this.f101415d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f101412a.equals(aVar.f101412a) && this.f101413b == aVar.f101413b && s.g(this.f101414c, aVar.f101414c) && this.f101415d == aVar.f101415d;
        }

        public final int hashCode() {
            int iHashCode = (this.f101413b.hashCode() + (this.f101412a.hashCode() * 31)) * 31;
            ww0.k kVar = this.f101414c;
            return Boolean.hashCode(this.f101415d) + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31);
        }

        public final String toString() {
            return "ReportPage(dateRange=" + this.f101412a + ", reportType=" + this.f101413b + ", report=" + this.f101414c + ", loading=" + this.f101415d + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar) {
        super(vVar);
        vVar.getClass();
        this.f101410h = new ArrayList();
    }

    public final void a(int i14, LocalDate localDate, ww0.k.b bVar) {
        localDate.getClass();
        bVar.getClass();
        this.f101410h.add(i14, new a(bVar == ww0.k.b.MONTH ? f0.I(jg.b.P(localDate), jg.b.t(localDate)) : f0.I(localDate, localDate), bVar, null, true));
    }

    public abstract jx0.a b(ww0.k kVar, boolean z14);

    public abstract String c(ww0.k kVar, ww0.k.b bVar);

    public final int d(LocalDate localDate) {
        localDate.getClass();
        Iterator<a> it = this.f101410h.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (j23.g.a.a(it.next().f101412a, localDate)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public final void e(int i14, ww0.k kVar, boolean z14) {
        this.f101410h.get(i14).f101414c = kVar;
        this.f101410h.get(i14).f101415d = z14;
        if (kVar != null) {
            LocalDate localDateQ = kVar.q();
            if (localDateQ == null) {
                localDateQ = this.f101410h.get(i14).f101412a.f23061a;
            }
            LocalDate localDateH = kVar.h();
            if (localDateH == null) {
                localDateH = this.f101410h.get(i14).f101412a.f23062b;
            }
            a aVar = this.f101410h.get(i14);
            h0 h0VarI = f0.I(localDateQ, localDateH);
            aVar.getClass();
            aVar.f101412a = h0VarI;
        }
    }

    public final void f(int i14, Integer num) {
        List<a> list = this.f101410h;
        this.f101410h = list.subList(i14, num != null ? num.intValue() : list.size());
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f101410h.size();
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        return b(this.f101410h.get(i14).f101414c, this.f101410h.get(i14).f101415d);
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        obj.getClass();
        return -2;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        return c(this.f101410h.get(i14).f101414c, this.f101410h.get(i14).f101413b);
    }

    @Override // androidx.fragment.app.e0, fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
        jx0.a aVar = objInstantiateItem instanceof jx0.a ? (jx0.a) objInstantiateItem : null;
        if (aVar != null) {
            ww0.k kVar = this.f101410h.get(i14).f101414c;
            boolean z14 = this.f101410h.get(i14).f101415d;
            aVar.f101399i = kVar;
            aVar.f101401k = kVar == null ? Boolean.FALSE : Boolean.valueOf(z14);
            if (aVar.getView() != null) {
                aVar.w6();
                aVar.I6(aVar.f101399i);
            }
            aVar.f101400j = this.f101411i;
            aVar.w6();
        }
        return objInstantiateItem;
    }
}
