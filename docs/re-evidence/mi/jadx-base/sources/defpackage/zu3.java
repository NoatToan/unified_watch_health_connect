package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import defpackage.h8f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class zu3<T extends h8f<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, T> f41683a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f41684b = new HashSet();
    public b c;
    public boolean d;
    public boolean e;

    public class a implements h8f.a<T> {
        public a() {
        }

        @Override // h8f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t, boolean z) {
            if (!z) {
                zu3 zu3Var = zu3.this;
                if (!zu3Var.q(t, zu3Var.e)) {
                    return;
                }
            } else if (!zu3.this.g(t)) {
                return;
            }
            zu3.this.m();
        }
    }

    public interface b {
        void a(Set<Integer> set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t) {
        this.f41683a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            g(t);
        }
        t.setInternalOnCheckedChangeListener(new a());
    }

    public void f(int i) {
        T t = this.f41683a.get(Integer.valueOf(i));
        if (t != null && g(t)) {
            m();
        }
    }

    public final boolean g(h8f<T> h8fVar) {
        int id = h8fVar.getId();
        if (this.f41684b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.f41683a.get(Integer.valueOf(k()));
        if (t != null) {
            q(t, false);
        }
        boolean zAdd = this.f41684b.add(Integer.valueOf(id));
        if (!h8fVar.isChecked()) {
            h8fVar.setChecked(true);
        }
        return zAdd;
    }

    public void h() {
        boolean z = !this.f41684b.isEmpty();
        Iterator<T> it = this.f41683a.values().iterator();
        while (it.hasNext()) {
            q(it.next(), false);
        }
        if (z) {
            m();
        }
    }

    public Set<Integer> i() {
        return new HashSet(this.f41684b);
    }

    public List<Integer> j(ViewGroup viewGroup) {
        Set<Integer> setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof h8f) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.d || this.f41684b.isEmpty()) {
            return -1;
        }
        return this.f41684b.iterator().next().intValue();
    }

    public boolean l() {
        return this.d;
    }

    public final void m() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f41683a.remove(Integer.valueOf(t.getId()));
        this.f41684b.remove(Integer.valueOf(t.getId()));
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(boolean z) {
        if (this.d != z) {
            this.d = z;
            h();
        }
    }

    public final boolean q(h8f<T> h8fVar, boolean z) {
        int id = h8fVar.getId();
        if (!this.f41684b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f41684b.size() == 1 && this.f41684b.contains(Integer.valueOf(id))) {
            h8fVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f41684b.remove(Integer.valueOf(id));
        if (h8fVar.isChecked()) {
            h8fVar.setChecked(false);
        }
        return zRemove;
    }

    public void setOnCheckedStateChangeListener(b bVar) {
        this.c = bVar;
    }
}
