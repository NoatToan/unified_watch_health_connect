package a61;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"La61/p;", "Le32/p;", "Lo71/e;", "La61/m;", "fragment", "Landroid/view/View;", "view", "Lo71/i;", "viewModel", "Lj23/g;", "Lorg/joda/time/DateTime;", "dateRange", "Lo71/g;", "interval", "<init>", "(La61/m;Landroid/view/View;Lo71/i;Lj23/g;Lo71/g;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements e32.p<o71.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o71.i f1645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j23.g<DateTime> f1646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o71.g f1647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f1649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f1650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<o71.e> f1651i;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La61/p$a;", "Landroidx/fragment/app/e0;", "La61/m;", "fragment", "", "La61/q;", "fragmentList", "<init>", "(La61/m;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.fragment.app.e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final m f1652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<q> f1653i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, List<q> list) {
            super(mVar.getChildFragmentManager());
            mVar.getClass();
            list.getClass();
            this.f1652h = mVar;
            this.f1653i = list;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            return this.f1653i.size();
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            return this.f1653i.get(i14);
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            String string = this.f1652h.getString(((o71.h) o71.h.f130226i.get(i14)).f130229c);
            string.getClass();
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"a61/p$b", "Landroidx/viewpager/widget/ViewPager$m;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ViewPager.m {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            p.this.f1645c.f130241c.j(Integer.valueOf(i14));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f1655a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f1655a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f1655a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f1655a.invoke(obj);
        }
    }

    public p(m mVar, View view2, o71.i iVar, j23.g<DateTime> gVar, o71.g gVar2) {
        mVar.getClass();
        view2.getClass();
        iVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.f1643a = mVar;
        this.f1644b = view2;
        this.f1645c = iVar;
        this.f1646d = gVar;
        this.f1647e = gVar2;
        w13.c cVar = o71.h.f130226i;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            o71.h hVar = (o71.h) bVar.next();
            q.a aVar = q.f1656e;
            long millis = ((DateTime) this.f1646d.getStart()).getMillis();
            long millis2 = ((DateTime) this.f1646d.b()).getMillis();
            o71.g gVar3 = this.f1647e;
            aVar.getClass();
            hVar.getClass();
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.strength.type", hVar);
            bundle.putLong("GCM_extra_start_date", millis);
            bundle.putLong("GCM_extra_end_date", millis2);
            bundle.putSerializable("GCM_extra_summary_interval", gVar3);
            qVar.setArguments(bundle);
            arrayList.add(qVar);
        }
        this.f1648f = arrayList;
        final int i14 = 0;
        this.f1649g = o13.m.b(new e23.a(this) { // from class: a61.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1642b;

            {
                this.f1642b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return (SwipeViewPager) this.f1642b.f1644b.findViewById(R.id.view_pager);
                    default:
                        return (TabLayout) this.f1642b.f1644b.findViewById(R.id.tab_layout);
                }
            }
        });
        final int i15 = 1;
        this.f1650h = o13.m.b(new e23.a(this) { // from class: a61.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1642b;

            {
                this.f1642b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return (SwipeViewPager) this.f1642b.f1644b.findViewById(R.id.view_pager);
                    default:
                        return (TabLayout) this.f1642b.f1644b.findViewById(R.id.tab_layout);
                }
            }
        });
        this.f1651i = new y0<>();
    }

    @Override // e32.p
    public final void a() {
        SwipeViewPager swipeViewPagerD = d();
        ArrayList arrayList = this.f1648f;
        m mVar = this.f1643a;
        swipeViewPagerD.setAdapter(new a(mVar, arrayList));
        d().setSwipeEnabled(false);
        Object value = this.f1650h.getValue();
        value.getClass();
        ((TabLayout) value).setupWithViewPager(d(), true);
        d().c(new b());
        final int i14 = 0;
        this.f1645c.f130241c.f(mVar.getViewLifecycleOwner(), new c(new e23.l(this) { // from class: a61.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1637b;

            {
                this.f1637b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        Integer num = (Integer) obj;
                        num.getClass();
                        int iIntValue = num.intValue();
                        p pVar = this.f1637b;
                        pVar.d().C(iIntValue, pVar.f1643a.getF158016a().getF7973d().a(androidx.lifecycle.b0.b.RESUMED));
                        break;
                    default:
                        o71.e eVar = (o71.e) obj;
                        o71.e eVarB = eVar != null ? o71.e.b(eVar) : null;
                        p pVar2 = this.f1637b;
                        o71.i iVar = pVar2.f1645c;
                        j23.g<DateTime> gVar = pVar2.f1646d;
                        LinkedHashMap linkedHashMap = iVar.f130243e;
                        LocalDate localDate = new DateTime(((DateTime) gVar.getStart()).getMillis()).toLocalDate();
                        localDate.getClass();
                        LocalDate localDate2 = new DateTime(((DateTime) gVar.b()).getMillis()).toLocalDate();
                        localDate2.getClass();
                        linkedHashMap.put(j23.s.a(localDate, localDate2), eVarB);
                        Iterator it = pVar2.f1648f.iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).f1660d.j(eVarB);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        this.f1651i.f(mVar.getViewLifecycleOwner(), new c(new e23.l(this) { // from class: a61.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1637b;

            {
                this.f1637b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        Integer num = (Integer) obj;
                        num.getClass();
                        int iIntValue = num.intValue();
                        p pVar = this.f1637b;
                        pVar.d().C(iIntValue, pVar.f1643a.getF158016a().getF7973d().a(androidx.lifecycle.b0.b.RESUMED));
                        break;
                    default:
                        o71.e eVar = (o71.e) obj;
                        o71.e eVarB = eVar != null ? o71.e.b(eVar) : null;
                        p pVar2 = this.f1637b;
                        o71.i iVar = pVar2.f1645c;
                        j23.g<DateTime> gVar = pVar2.f1646d;
                        LinkedHashMap linkedHashMap = iVar.f130243e;
                        LocalDate localDate = new DateTime(((DateTime) gVar.getStart()).getMillis()).toLocalDate();
                        localDate.getClass();
                        LocalDate localDate2 = new DateTime(((DateTime) gVar.b()).getMillis()).toLocalDate();
                        localDate2.getClass();
                        linkedHashMap.put(j23.s.a(localDate, localDate2), eVarB);
                        Iterator it = pVar2.f1648f.iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).f1660d.j(eVarB);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(o71.e eVar) {
        return false;
    }

    @Override // e32.p
    public final void c(o71.e eVar) {
        this.f1651i.j(eVar);
    }

    public final SwipeViewPager d() {
        Object value = this.f1649g.getValue();
        value.getClass();
        return (SwipeViewPager) value;
    }
}
