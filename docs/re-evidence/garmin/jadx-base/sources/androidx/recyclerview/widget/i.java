package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.g1;
import androidx.core.view.s0;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class i extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f10477s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10478h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10479i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<e> f10480j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<d> f10481k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.f0>> f10482l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f10483m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f10484n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10485o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10486p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10487q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.f0> f10488r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10489a;

        public a(ArrayList arrayList) {
            this.f10489a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f10489a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i iVar = i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    iVar.f10483m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.f0 f0Var = eVar.f10501a;
                int i14 = eVar.f10502b;
                int i15 = eVar.f10503c;
                int i16 = eVar.f10504d;
                int i17 = eVar.f10505e;
                iVar.getClass();
                View view2 = f0Var.itemView;
                int i18 = i16 - i14;
                int i19 = i17 - i15;
                if (i18 != 0) {
                    view2.animate().translationX(0.0f);
                }
                if (i19 != 0) {
                    view2.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                iVar.f10486p.add(f0Var);
                viewPropertyAnimatorAnimate.setDuration(iVar.f10318e).setListener(new l(iVar, f0Var, i18, view2, i19, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10491a;

        public b(ArrayList arrayList) {
            this.f10491a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f10491a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i iVar = i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    iVar.f10484n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                ArrayList<RecyclerView.f0> arrayList2 = iVar.f10488r;
                RecyclerView.f0 f0Var = dVar.f10495a;
                View view2 = f0Var == null ? null : f0Var.itemView;
                RecyclerView.f0 f0Var2 = dVar.f10496b;
                View view3 = f0Var2 != null ? f0Var2.itemView : null;
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(iVar.f10319f);
                    arrayList2.add(dVar.f10495a);
                    duration.translationX(dVar.f10499e - dVar.f10497c);
                    duration.translationY(dVar.f10500f - dVar.f10498d);
                    duration.alpha(0.0f).setListener(new m(iVar, dVar, duration, view2)).start();
                }
                if (view3 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    arrayList2.add(dVar.f10496b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(iVar.f10319f).alpha(1.0f).setListener(new n(iVar, dVar, viewPropertyAnimatorAnimate, view3)).start();
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10493a;

        public c(ArrayList arrayList) {
            this.f10493a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f10493a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i iVar = i.this;
                if (!zHasNext) {
                    arrayList.clear();
                    iVar.f10482l.remove(arrayList);
                    return;
                }
                RecyclerView.f0 f0Var = (RecyclerView.f0) it.next();
                iVar.getClass();
                View view2 = f0Var.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                iVar.f10485o.add(f0Var);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(iVar.f10316c).setListener(new k(iVar, f0Var, view2, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.f0 f10501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10505e;

        public e(RecyclerView.f0 f0Var, int i14, int i15, int i16, int i17) {
            this.f10501a = f0Var;
            this.f10502b = i14;
            this.f10503c = i15;
            this.f10504d = i16;
            this.f10505e = i17;
        }
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.f0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g(RecyclerView.f0 f0Var, List<Object> list) {
        return !list.isEmpty() || f(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void i(RecyclerView.f0 f0Var) {
        View view2 = f0Var.itemView;
        view2.animate().cancel();
        ArrayList<e> arrayList = this.f10480j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f10501a == f0Var) {
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                h(f0Var);
                arrayList.remove(size);
            }
        }
        s(this.f10481k, f0Var);
        if (this.f10478h.remove(f0Var)) {
            view2.setAlpha(1.0f);
            h(f0Var);
        }
        if (this.f10479i.remove(f0Var)) {
            view2.setAlpha(1.0f);
            h(f0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f10484n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            s(arrayList3, f0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f10483m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).f10501a == f0Var) {
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(f0Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.f0>> arrayList6 = this.f10482l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(f0Var)) {
                view2.setAlpha(1.0f);
                h(f0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f10487q.remove(f0Var);
        this.f10485o.remove(f0Var);
        this.f10488r.remove(f0Var);
        this.f10486p.remove(f0Var);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j() {
        ArrayList<e> arrayList = this.f10480j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view2 = eVar.f10501a.itemView;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            h(eVar.f10501a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.f0> arrayList2 = this.f10478h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.f0> arrayList3 = this.f10479i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = arrayList3.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            h(f0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f10481k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.f0 f0Var2 = dVar.f10495a;
            if (f0Var2 != null) {
                t(dVar, f0Var2);
            }
            RecyclerView.f0 f0Var3 = dVar.f10496b;
            if (f0Var3 != null) {
                t(dVar, f0Var3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList<ArrayList<e>> arrayList5 = this.f10483m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view3 = eVar2.f10501a.itemView;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    h(eVar2.f10501a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.f0>> arrayList7 = this.f10482l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var4 = arrayList8.get(size8);
                    f0Var4.itemView.setAlpha(1.0f);
                    h(f0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f10484n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.f0 f0Var5 = dVar2.f10495a;
                    if (f0Var5 != null) {
                        t(dVar2, f0Var5);
                    }
                    RecyclerView.f0 f0Var6 = dVar2.f10496b;
                    if (f0Var6 != null) {
                        t(dVar2, f0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.f10487q);
            q(this.f10486p);
            q(this.f10485o);
            q(this.f10488r);
            ArrayList<RecyclerView.m.a> arrayList11 = this.f10315b;
            int size11 = arrayList11.size();
            for (int i14 = 0; i14 < size11; i14++) {
                arrayList11.get(i14).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean k() {
        return (this.f10479i.isEmpty() && this.f10481k.isEmpty() && this.f10480j.isEmpty() && this.f10478h.isEmpty() && this.f10486p.isEmpty() && this.f10487q.isEmpty() && this.f10485o.isEmpty() && this.f10488r.isEmpty() && this.f10483m.isEmpty() && this.f10482l.isEmpty() && this.f10484n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l() {
        ArrayList<RecyclerView.f0> arrayList = this.f10478h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f10480j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f10481k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.f0> arrayList4 = this.f10479i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (RecyclerView.f0 f0Var : arrayList) {
            View view2 = f0Var.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f10487q.add(f0Var);
            viewPropertyAnimatorAnimate.setDuration(this.f10317d).alpha(0.0f).setListener(new j(this, f0Var, viewPropertyAnimatorAnimate, view2)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f10483m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (zIsEmpty) {
                aVar.run();
            } else {
                View view3 = arrayList5.get(0).f10501a.itemView;
                long j8 = this.f10317d;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view3.postOnAnimationDelayed(aVar, j8);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f10484n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (zIsEmpty) {
                bVar.run();
            } else {
                View view4 = arrayList6.get(0).f10495a.itemView;
                long j14 = this.f10317d;
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                view4.postOnAnimationDelayed(bVar, j14);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.f10482l.add(arrayList7);
        arrayList4.clear();
        c cVar = new c(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.f10318e : 0L, zIsEmpty3 ? 0L : this.f10319f) + (!zIsEmpty ? this.f10317d : 0L);
        View view5 = arrayList7.get(0).itemView;
        WeakHashMap<View, g1> weakHashMap3 = s0.f6563a;
        view5.postOnAnimationDelayed(cVar, jMax);
    }

    @Override // androidx.recyclerview.widget.h0
    @SuppressLint({"UnknownNullness"})
    public final void m(RecyclerView.f0 f0Var) {
        u(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.f10479i.add(f0Var);
    }

    @Override // androidx.recyclerview.widget.h0
    @SuppressLint({"UnknownNullness"})
    public final boolean n(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i14, int i15, int i16, int i17) {
        if (f0Var == f0Var2) {
            return o(f0Var, i14, i15, i16, i17);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        u(f0Var);
        int i18 = (int) ((i16 - i14) - translationX);
        int i19 = (int) ((i17 - i15) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            u(f0Var2);
            f0Var2.itemView.setTranslationX(-i18);
            f0Var2.itemView.setTranslationY(-i19);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.f10481k.add(new d(f0Var, f0Var2, i14, i15, i16, i17));
        return true;
    }

    @Override // androidx.recyclerview.widget.h0
    @SuppressLint({"UnknownNullness"})
    public final boolean o(RecyclerView.f0 f0Var, int i14, int i15, int i16, int i17) {
        View view2 = f0Var.itemView;
        int translationX = i14 + ((int) view2.getTranslationX());
        int translationY = i15 + ((int) f0Var.itemView.getTranslationY());
        u(f0Var);
        int i18 = i16 - translationX;
        int i19 = i17 - translationY;
        if (i18 == 0 && i19 == 0) {
            h(f0Var);
            return false;
        }
        if (i18 != 0) {
            view2.setTranslationX(-i18);
        }
        if (i19 != 0) {
            view2.setTranslationY(-i19);
        }
        this.f10480j.add(new e(f0Var, translationX, translationY, i16, i17));
        return true;
    }

    @Override // androidx.recyclerview.widget.h0
    @SuppressLint({"UnknownNullness"})
    public final void p(RecyclerView.f0 f0Var) {
        u(f0Var);
        this.f10478h.add(f0Var);
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList<RecyclerView.m.a> arrayList = this.f10315b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.get(i14).a();
        }
        arrayList.clear();
    }

    public final void s(ArrayList arrayList, RecyclerView.f0 f0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (t(dVar, f0Var) && dVar.f10495a == null && dVar.f10496b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean t(d dVar, RecyclerView.f0 f0Var) {
        if (dVar.f10496b == f0Var) {
            dVar.f10496b = null;
        } else {
            if (dVar.f10495a != f0Var) {
                return false;
            }
            dVar.f10495a = null;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        h(f0Var);
        return true;
    }

    public final void u(RecyclerView.f0 f0Var) {
        if (f10477s == null) {
            f10477s = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(f10477s);
        i(f0Var);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f10495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.f0 f10496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10500f;

        public d(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i14, int i15, int i16, int i17) {
            this(f0Var, f0Var2);
            this.f10497c = i14;
            this.f10498d = i15;
            this.f10499e = i16;
            this.f10500f = i17;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ChangeInfo{oldHolder=");
            sb3.append(this.f10495a);
            sb3.append(", newHolder=");
            sb3.append(this.f10496b);
            sb3.append(", fromX=");
            sb3.append(this.f10497c);
            sb3.append(", fromY=");
            sb3.append(this.f10498d);
            sb3.append(", toX=");
            sb3.append(this.f10499e);
            sb3.append(", toY=");
            return ds.e0.j(sb3, this.f10500f, CoreConstants.CURLY_RIGHT);
        }

        private d(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f10495a = f0Var;
            this.f10496b = f0Var2;
        }
    }
}
