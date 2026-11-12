package xz2;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xz2.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<V extends f> extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<V> f192871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCalendarView f192872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f192873c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f192881k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yz2.g f192874d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f192875e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f192876f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f192877g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f192878h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f192879i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f192880j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f192882l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yz2.h f192883m = yz2.h.f200492a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yz2.e f192884n = yz2.e.f200490a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<j> f192885o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f192886p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f192887q = true;

    public e(MaterialCalendarView materialCalendarView) {
        this.f192872b = materialCalendarView;
        Parcelable.Creator<b> creator = b.CREATOR;
        this.f192873c = b.b(g.a());
        ArrayDeque<V> arrayDeque = new ArrayDeque<>();
        this.f192871a = arrayDeque;
        arrayDeque.iterator();
        i(null, null);
    }

    public abstract h a(b bVar, b bVar2);

    public abstract V b(int i14);

    public final int c(b bVar) {
        if (bVar == null) {
            return this.f192881k.getCount() / 2;
        }
        b bVar2 = this.f192879i;
        if (bVar2 != null && bVar.i(bVar2)) {
            return 0;
        }
        b bVar3 = this.f192880j;
        return (bVar3 == null || !bVar.h(bVar3)) ? this.f192881k.a(bVar) : this.f192881k.getCount() - 1;
    }

    public abstract int d(V v14);

    @Override // fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        f fVar = (f) obj;
        this.f192871a.remove(fVar);
        viewGroup.removeView(fVar);
    }

    public final void e() {
        this.f192886p = new ArrayList();
        for (j jVar : this.f192885o) {
            k kVar = new k();
            jVar.b(kVar);
            if (kVar.f192911a) {
                this.f192886p.add(new l(jVar, kVar));
            }
        }
        Iterator<V> it = this.f192871a.iterator();
        while (it.hasNext()) {
            it.next().setDayViewDecorators(this.f192886p);
        }
    }

    public final void f() {
        b bVar;
        int i14 = 0;
        while (i14 < this.f192882l.size()) {
            b bVar2 = (b) this.f192882l.get(i14);
            b bVar3 = this.f192879i;
            if ((bVar3 != null && bVar3.h(bVar2)) || ((bVar = this.f192880j) != null && bVar.i(bVar2))) {
                this.f192882l.remove(i14);
                this.f192872b.c(bVar2, false);
                i14--;
            }
            i14++;
        }
        Iterator<V> it = this.f192871a.iterator();
        while (it.hasNext()) {
            it.next().setSelectedDates(this.f192882l);
        }
    }

    public abstract boolean g(Object obj);

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return this.f192881k.getCount();
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        int iD;
        if (g(obj)) {
            f fVar = (f) obj;
            if (fVar.getFirstViewDay() != null && (iD = d(fVar)) >= 0) {
                return iD;
            }
        }
        return -2;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        yz2.g gVar = this.f192874d;
        return gVar == null ? "" : gVar.a(this.f192881k.getItem(i14));
    }

    public final void h(b bVar, boolean z14) {
        ArrayList arrayList = this.f192882l;
        if (z14) {
            if (arrayList.contains(bVar)) {
                return;
            }
            this.f192882l.add(bVar);
            f();
            return;
        }
        if (arrayList.contains(bVar)) {
            this.f192882l.remove(bVar);
            f();
        }
    }

    public final void i(b bVar, b bVar2) {
        this.f192879i = bVar;
        this.f192880j = bVar2;
        for (V v14 : this.f192871a) {
            v14.setMinimumDate(bVar);
            v14.setMaximumDate(bVar2);
        }
        b bVar3 = this.f192873c;
        if (bVar == null) {
            bVar = new b(bVar3.f192861a - 200, bVar3.f192862b, bVar3.f192863c);
        }
        if (bVar2 == null) {
            bVar2 = new b(bVar3.f192861a + 200, bVar3.f192862b, bVar3.f192863c);
        }
        this.f192881k = a(bVar, bVar2);
        notifyDataSetChanged();
        f();
    }

    @Override // fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        f fVarB = b(i14);
        fVarB.setContentDescription(this.f192872b.getCalendarContentDescription());
        fVarB.setAlpha(0.0f);
        fVarB.setSelectionEnabled(this.f192887q);
        fVarB.setWeekDayFormatter(this.f192883m);
        fVarB.setDayFormatter(this.f192884n);
        Integer num = this.f192875e;
        if (num != null) {
            fVarB.setSelectionColor(num.intValue());
        }
        Integer num2 = this.f192876f;
        if (num2 != null) {
            fVarB.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.f192877g;
        if (num3 != null) {
            fVarB.setWeekDayTextAppearance(num3.intValue());
        }
        fVarB.setShowOtherDates(this.f192878h);
        fVarB.setMinimumDate(this.f192879i);
        fVarB.setMaximumDate(this.f192880j);
        fVarB.setSelectedDates(this.f192882l);
        viewGroup.addView(fVarB);
        this.f192871a.add((V) fVarB);
        fVarB.setDayViewDecorators(this.f192886p);
        return fVarB;
    }

    @Override // fe.a
    public final boolean isViewFromObject(View view2, Object obj) {
        return view2 == obj;
    }
}
