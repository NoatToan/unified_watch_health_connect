package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g7i;
import defpackage.of1;
import defpackage.p3j;
import defpackage.si8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a extends RecyclerView.Adapter<g7i> implements Preference.b, PreferenceGroup.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceGroup f2758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Preference> f2759b;
    public List<Preference> c;
    public final List<c> d;
    public final Runnable f = new RunnableC0062a();
    public final Handler e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    public class RunnableC0062a implements Runnable {
        public RunnableC0062a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.p();
        }
    }

    public class b implements Preference.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f2761a;

        public b(PreferenceGroup preferenceGroup) {
            this.f2761a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference) {
            this.f2761a.u(Integer.MAX_VALUE);
            a.this.h(preference);
            this.f2761a.l();
            return true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2764b;
        public String c;

        public c(Preference preference) {
            this.c = preference.getClass().getName();
            this.f2763a = preference.getLayoutResource();
            this.f2764b = preference.getWidgetLayoutResource();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2763a == cVar.f2763a && this.f2764b == cVar.f2764b && TextUtils.equals(this.c, cVar.c);
        }

        public int hashCode() {
            return ((((527 + this.f2763a) * 31) + this.f2764b) * 31) + this.c.hashCode();
        }
    }

    public a(PreferenceGroup preferenceGroup) {
        this.f2758a = preferenceGroup;
        preferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.f2759b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).y());
        } else {
            setHasStableIds(true);
        }
        p();
    }

    @Override // androidx.preference.Preference.b
    public void a(Preference preference) {
        h(preference);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int b(Preference preference) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.c.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void c(Preference preference) {
        int iIndexOf = this.c.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int e(String str) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, this.c.get(i).getKey())) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (hasStableIds()) {
            return l(i).getId();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        c cVar = new c(l(i));
        int iIndexOf = this.d.indexOf(cVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.d.size();
        this.d.add(cVar);
        return size;
    }

    @Override // androidx.preference.Preference.b
    public void h(Preference preference) {
        this.e.removeCallbacks(this.f);
        this.e.post(this.f);
    }

    public final si8 i(PreferenceGroup preferenceGroup, List<Preference> list) {
        si8 si8Var = new si8(preferenceGroup.getContext(), list, preferenceGroup.getId());
        si8Var.setOnPreferenceClickListener(new b(preferenceGroup));
        return si8Var;
    }

    public final List<Preference> j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iN = preferenceGroup.n();
        int i = 0;
        for (int i2 = 0; i2 < iN; i2++) {
            Preference preferenceM = preferenceGroup.m(i2);
            if (preferenceM.isVisible()) {
                if (!m(preferenceGroup) || i < preferenceGroup.k()) {
                    arrayList.add(preferenceM);
                } else {
                    arrayList2.add(preferenceM);
                }
                if (preferenceM instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM;
                    if (!preferenceGroup2.o()) {
                        continue;
                    } else {
                        if (m(preferenceGroup) && m(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : j(preferenceGroup2)) {
                            if (!m(preferenceGroup) || i < preferenceGroup.k()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m(preferenceGroup) && i > preferenceGroup.k()) {
            arrayList.add(i(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    public final void k(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.x();
        int iN = preferenceGroup.n();
        for (int i = 0; i < iN; i++) {
            Preference preferenceM = preferenceGroup.m(i);
            list.add(preferenceM);
            c cVar = new c(preferenceM);
            if (!this.d.contains(cVar)) {
                this.d.add(cVar);
            }
            if (preferenceM instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM;
                if (preferenceGroup2.o()) {
                    k(list, preferenceGroup2);
                }
            }
            preferenceM.setOnPreferenceChangeInternalListener(this);
        }
    }

    public Preference l(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return this.c.get(i);
    }

    public final boolean m(PreferenceGroup preferenceGroup) {
        return preferenceGroup.k() != Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(g7i g7iVar, int i) {
        Preference preferenceL = l(i);
        g7iVar.d();
        preferenceL.onBindViewHolder(g7iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g7i onCreateViewHolder(ViewGroup viewGroup, int i) {
        c cVar = this.d.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, p3j.f29962a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p3j.f29963b);
        if (drawable == null) {
            drawable = of1.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(cVar.f2763a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            androidx.core.view.c.v0(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = cVar.f2764b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new g7i(viewInflate);
    }

    public void p() {
        Iterator<Preference> it = this.f2759b.iterator();
        while (it.hasNext()) {
            it.next().setOnPreferenceChangeInternalListener(null);
        }
        ArrayList arrayList = new ArrayList(this.f2759b.size());
        this.f2759b = arrayList;
        k(arrayList, this.f2758a);
        this.c = j(this.f2758a);
        androidx.preference.b preferenceManager = this.f2758a.getPreferenceManager();
        if (preferenceManager != null) {
            preferenceManager.g();
        }
        notifyDataSetChanged();
        Iterator<Preference> it2 = this.f2759b.iterator();
        while (it2.hasNext()) {
            it2.next().clearWasDetached();
        }
    }
}
