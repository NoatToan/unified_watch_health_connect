package com.garmin.android.apps.connectmobile.navigation;

import a73.k;
import am.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;
import t61.m;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
public class a extends RecyclerView.h<RecyclerView.f0> implements sq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f39334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f39335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39336c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f39337d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sq0.e f39338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f39339f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.navigation.a$a, reason: collision with other inner class name */
    public class C0702a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f39340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f39341b;

        public C0702a(Context context) {
            super(new TextView(context));
            this.f39341b = context;
            TextView textView = (TextView) this.itemView;
            this.f39340a = textView;
            textView.setLayoutParams(new RecyclerView.q(-1, -2));
            EditBottomNavBarActivity editBottomNavBarActivity = (EditBottomNavBarActivity) a.this.f39334a;
            editBottomNavBarActivity.getClass();
            textView.setBackgroundColor(a7.b.getColor(editBottomNavBarActivity, R.color.gcm_background));
            int dimension = (int) context.getResources().getDimension(R.dimen.spacing_normal);
            textView.setPadding(dimension, dimension * 2, dimension, dimension);
            textView.setTextAppearance(context, 2132149083);
            textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        }
    }

    public interface b {
    }

    public class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f39345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f39346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l22.a f39347c;

        public d(Context context) {
            super(new TextView(context));
            this.f39346b = context;
            this.f39347c = new l22.a(context);
            TextView textView = (TextView) this.itemView;
            this.f39345a = textView;
            int dimension = (int) context.getResources().getDimension(R.dimen.spacing_normal);
            textView.setPadding(dimension, dimension, dimension, dimension);
            textView.setTextAppearance(context, R.style.Text_Body1);
            textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        }
    }

    public class e extends RecyclerView.f0 implements sq0.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f39349g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f39350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f39351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f39352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f39353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l22.a f39354e;

        public e(View view2) {
            super(view2);
            Context context = view2.getContext();
            this.f39353d = context;
            this.f39354e = new l22.a(context);
            this.f39350a = (TextView) view2.findViewById(R.id.title);
            this.f39351b = (ImageView) view2.findViewById(R.id.drag_handle);
            this.f39352c = (ImageView) view2.findViewById(R.id.add_remove_icon);
        }

        @Override // sq0.c
        public final void a() {
            this.itemView.setAlpha(0.4f);
        }

        @Override // sq0.c
        public final void c() {
            View view2 = this.itemView;
            EditBottomNavBarActivity editBottomNavBarActivity = (EditBottomNavBarActivity) a.this.f39334a;
            editBottomNavBarActivity.getClass();
            view2.setBackgroundColor(a7.b.getColor(editBottomNavBarActivity, R.color.gcm_list_item_background));
            this.itemView.setAlpha(1.0f);
        }
    }

    public class f extends RecyclerView.f0 {
        public f(Context context) {
            super(new TextView(context));
            TextView textView = (TextView) this.itemView;
            textView.setLayoutParams(new RecyclerView.q(-1, -2));
            EditBottomNavBarActivity editBottomNavBarActivity = (EditBottomNavBarActivity) a.this.f39334a;
            editBottomNavBarActivity.getClass();
            textView.setBackgroundColor(a7.b.getColor(editBottomNavBarActivity, R.color.gcm_background));
            int dimension = (int) context.getResources().getDimension(R.dimen.spacing_large);
            textView.setPadding(dimension, dimension, dimension, dimension);
            textView.setGravity(1);
            textView.setTextAppearance(context, 2132149083);
            textView.setTextColor(a7.b.getColorStateList(context, R.color.gcm_text_primary_action_selector));
            textView.setText(R.string.lbl_restore_default);
            textView.setOnClickListener(new m(this, 8));
        }
    }

    public a(b bVar, sq0.e eVar, Context context) {
        this.f39334a = bVar;
        this.f39338e = eVar;
        this.f39339f = context;
        l.f68084a.getClass();
        u(l.a.a().t1());
        this.f39335b = r();
    }

    @Override // sq0.b
    public final int K0() {
        for (int i14 = 0; i14 < this.f39335b.size(); i14++) {
            if (((c) this.f39335b.get(i14)).f39344b == 1) {
                return i14 + 1;
            }
        }
        return 2;
    }

    @Override // sq0.b
    public final boolean f(int i14, int i15) {
        String string;
        Collections.swap(this.f39335b, i14, i15);
        Collections.swap(this.f39336c, i14 - 1, i15 - 1);
        notifyItemMoved(i14, i15);
        String[] strArrT = t();
        h.f39377a.getClass();
        boolean zDeepEquals = Objects.deepEquals(strArrT, h.a());
        ArrayList arrayList = this.f39335b;
        if (zDeepEquals) {
            arrayList.remove(arrayList.size() - 1);
            notifyItemRemoved(this.f39335b.size());
        } else if (((c) j.f(1, arrayList)).f39344b != 5) {
            this.f39335b.add(new c(5));
            notifyItemInserted(this.f39335b.size() - 1);
        }
        int size = this.f39335b.size();
        Context context = this.f39339f;
        if (i14 >= size || i15 >= this.f39335b.size()) {
            string = "";
        } else {
            String str = ((c) this.f39335b.get(i14)).f39343a;
            string = i14 > i15 ? context.getString(R.string.lbl_move_above_value, str) : context.getString(R.string.lbl_move_below_value, str);
        }
        c22.b.h(context, string);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f39335b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return ((c) this.f39335b.get(i14)).f39344b;
    }

    @Override // sq0.b
    public final void h8(int i14) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        int itemViewType = getItemViewType(i14);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                d dVar = (d) f0Var;
                TextView textView = dVar.f39345a;
                String str = ((c) a.this.f39335b.get(i14)).f39343a;
                if (str == null) {
                    i2.i("EditBottomBarAdapter", "ListItem at position " + i14 + " has not set the NavigationItem! FIX ME");
                    textView.setText("");
                    return;
                }
                h hVar = h.f39377a;
                l22.a aVar = dVar.f39347c;
                hVar.getClass();
                String strC = h.c(aVar, str);
                textView.setText(strC);
                textView.setContentDescription(dVar.f39346b.getString(R.string.lbl_heading, strC));
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        return;
                    }
                }
            }
            e eVar = (e) f0Var;
            Context context = eVar.f39353d;
            ImageView imageView = eVar.f39351b;
            ImageView imageView2 = eVar.f39352c;
            c cVar = (c) a.this.f39335b.get(i14);
            String str2 = cVar.f39343a;
            if (str2 == null) {
                return;
            }
            TextView textView2 = eVar.f39350a;
            h hVar2 = h.f39377a;
            l22.a aVar2 = eVar.f39354e;
            hVar2.getClass();
            textView2.setText(h.c(aVar2, str2));
            int i15 = cVar.f39344b;
            if (i15 == 4) {
                imageView.setVisibility(8);
                imageView2.setImageResource(R.drawable.ic_add_round);
                imageView2.setContentDescription(context.getString(R.string.lbl_add));
            } else if (i15 == 2) {
                imageView.setVisibility(0);
                s0.r(imageView, new v22.f());
                imageView.setOnTouchListener(new b00.g(eVar, 8));
                imageView2.setImageResource(R.drawable.gcm3_edit_insight_remove_selector);
                imageView2.setContentDescription(context.getString(R.string.lbl_remove));
            }
            imageView2.setOnClickListener(new ty0.a(eVar, 0, cVar, str2));
            return;
        }
        C0702a c0702a = (C0702a) f0Var;
        Context context2 = c0702a.f39341b;
        TextView textView3 = c0702a.f39340a;
        a aVar3 = a.this;
        if (((c) aVar3.f39335b.get(i14)).f39344b == 0) {
            String string = context2.getString(R.string.lbl_tabbar_items);
            textView3.setText(string);
            textView3.setContentDescription(context2.getString(R.string.lbl_heading, string));
        } else if (((c) aVar3.f39335b.get(i14)).f39344b == 3) {
            String string2 = context2.getString(R.string.lbl_more_menu_items);
            textView3.setText(string2);
            textView3.setContentDescription(context2.getString(R.string.lbl_heading, string2));
        } else {
            i2.i("EditBottomBarAdapter", "ListItem at position " + i14 + " header ItemType not recognized! FIX ME");
            textView3.setText("");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        if (i14 != 0) {
            if (i14 == 1) {
                return new d(viewGroup.getContext());
            }
            if (i14 != 3) {
                return i14 != 5 ? new e(a0.d(viewGroup, R.layout.edit_insights_row, viewGroup, false)) : new f(viewGroup.getContext());
            }
        }
        return new C0702a(viewGroup.getContext());
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(0));
        for (String str : this.f39336c) {
            h.f39377a.getClass();
            str.getClass();
            arrayList.add(new c(str, (str.equals("HOME") || str.equals("MY_DEVICE") || str.equals("MORE")) ? 1 : 2));
        }
        arrayList.add(new c(3));
        Iterator it = this.f39337d.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((String) it.next(), 4));
        }
        String[] strArrT = t();
        h.f39377a.getClass();
        if (!Objects.deepEquals(strArrT, h.a())) {
            arrayList.add(new c(5));
        }
        return arrayList;
    }

    public final String[] t() {
        String[] strArr = new String[0];
        ArrayList arrayList = this.f39336c;
        int size = arrayList.size();
        return size > 2 ? (String[]) arrayList.subList(1, size - 1).toArray(strArr) : strArr;
    }

    public final void u(String[] strArr) {
        ArrayList arrayList = this.f39336c;
        arrayList.clear();
        ArrayList arrayList2 = this.f39337d;
        arrayList2.clear();
        arrayList.add(d1.r() ? "MY_DEVICE" : "HOME");
        arrayList.addAll(Arrays.asList(strArr));
        arrayList.add("MORE");
        g.f39372a.getClass();
        for (String str : g.a.f39374b) {
            h.f39377a.getClass();
            if (h.d(str) && !ArrayUtils.contains(strArr, str)) {
                arrayList2.add(str);
            }
        }
        arrayList2.sort(Comparator.comparing(new k(new l22.a(this.f39339f), 9)));
    }

    @Override // sq0.b
    public final int z1() {
        int size = this.f39335b.size() - 1;
        while (true) {
            ArrayList arrayList = this.f39335b;
            if (size <= 2) {
                return arrayList.size();
            }
            if (((c) arrayList.get(size)).f39344b == 1) {
                return size;
            }
            size--;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39344b;

        public c(String str, int i14) {
            this.f39343a = str;
            this.f39344b = i14;
        }

        public c(int i14) {
            this.f39344b = i14;
        }
    }
}
