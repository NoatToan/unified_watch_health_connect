package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import bd.h;
import bd.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c extends RecyclerView.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceGroup f10206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10209d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f10211f = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f10210e = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.x();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10215c;

        public b(Preference preference) {
            this.f10215c = preference.getClass().getName();
            this.f10213a = preference.P;
            this.f10214b = preference.T;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10213a == bVar.f10213a && this.f10214b == bVar.f10214b && TextUtils.equals(this.f10215c, bVar.f10215c);
        }

        public final int hashCode() {
            return this.f10215c.hashCode() + ((((527 + this.f10213a) * 31) + this.f10214b) * 31);
        }
    }

    public c(PreferenceGroup preferenceGroup) {
        this.f10206a = preferenceGroup;
        preferenceGroup.X = this;
        this.f10207b = new ArrayList();
        this.f10208c = new ArrayList();
        this.f10209d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).S0);
        } else {
            setHasStableIds(true);
        }
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f10208c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i14) {
        if (hasStableIds()) {
            return u(i14).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        b bVar = new b(u(i14));
        ArrayList arrayList = this.f10209d;
        int iIndexOf = arrayList.indexOf(bVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(bVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        h hVar = (h) f0Var;
        Preference preferenceU = u(i14);
        ColorStateList colorStateList = hVar.f17503b;
        Drawable background = hVar.itemView.getBackground();
        Drawable drawable = hVar.f17502a;
        if (background != drawable) {
            View view2 = hVar.itemView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setBackground(drawable);
        }
        TextView textView = (TextView) hVar.d(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceU.m(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        b bVar = (b) this.f10209d.get(i14);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, i.f17507a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = j.a.a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(bVar.f10213a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i15 = bVar.f10214b;
            if (i15 != 0) {
                layoutInflaterFrom.inflate(i15, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new h(viewInflate);
    }

    public final ArrayList r(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.M0.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Preference preferenceG = preferenceGroup.G(i15);
            if (preferenceG.f10171z) {
                int i16 = preferenceGroup.Q0;
                if (i16 == Integer.MAX_VALUE || i14 < i16) {
                    arrayList.add(preferenceG);
                } else {
                    arrayList2.add(preferenceG);
                }
                if (preferenceG instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceG;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.Q0 != Integer.MAX_VALUE && preferenceGroup2.Q0 != Integer.MAX_VALUE) {
                            vb.h.z("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        for (Preference preference : r(preferenceGroup2)) {
                            int i17 = preferenceGroup.Q0;
                            if (i17 == Integer.MAX_VALUE || i14 < i17) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i14++;
                        }
                    }
                } else {
                    i14++;
                }
            }
        }
        int i18 = preferenceGroup.Q0;
        if (i18 != Integer.MAX_VALUE && i14 > i18) {
            bd.b bVar = new bd.b(preferenceGroup.f10147a, arrayList2, preferenceGroup.f10149c);
            bVar.f10152f = new d(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void t(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.M0);
        }
        int size = preferenceGroup.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            Preference preferenceG = preferenceGroup.G(i14);
            arrayList.add(preferenceG);
            b bVar = new b(preferenceG);
            if (!this.f10209d.contains(bVar)) {
                this.f10209d.add(bVar);
            }
            if (preferenceG instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceG;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    t(arrayList, preferenceGroup2);
                }
            }
            preferenceG.X = this;
        }
    }

    public final Preference u(int i14) {
        if (i14 < 0 || i14 >= this.f10208c.size()) {
            return null;
        }
        return (Preference) this.f10208c.get(i14);
    }

    public final void x() {
        Iterator it = this.f10207b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).X = null;
        }
        ArrayList arrayList = new ArrayList(this.f10207b.size());
        this.f10207b = arrayList;
        PreferenceGroup preferenceGroup = this.f10206a;
        t(arrayList, preferenceGroup);
        this.f10208c = r(preferenceGroup);
        notifyDataSetChanged();
        Iterator it3 = this.f10207b.iterator();
        while (it3.hasNext()) {
            ((Preference) it3.next()).getClass();
        }
    }
}
