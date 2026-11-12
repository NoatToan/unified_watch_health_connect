package ci1;

import a61.d0;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import b00.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p13.h0;
import p13.m0;
import p13.o0;

/* JADX INFO: loaded from: classes10.dex */
public class b extends RecyclerView.h<RecyclerView.f0> implements sq0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<String> f27660n = Collections.singleton("APP_NATIVE_ID_TIME_DATE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27661a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sq0.e f27668h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f27671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f27673m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27662b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27663c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27664d = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<y> f27669i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f27670j = new ArrayList();

    public class a implements Comparator<y> {
        public a(b bVar) {
        }

        @Override // java.util.Comparator
        public final int compare(y yVar, y yVar2) {
            y yVar3 = yVar;
            y yVar4 = yVar2;
            int iCompare = Boolean.compare(!yVar3.f34330c, !yVar4.f34330c);
            if (iCompare == 0) {
                return yVar3.f34329b < yVar4.f34329b ? -1 : 1;
            }
            return iCompare;
        }
    }

    /* JADX INFO: renamed from: ci1.b$b, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0421b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0421b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            b bVar = b.this;
            y yVar = bVar.f27669i.get(bVar.f27664d);
            bVar.f27669i.remove(bVar.f27664d);
            bVar.f27669i.add(bVar.f27662b, yVar);
            bVar.A();
            bVar.notifyItemMoved(bVar.f27664d, bVar.f27662b);
            bVar.f27666f = false;
            dialogInterface.dismiss();
        }
    }

    public class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f27675a;

        public c(b bVar, View view2) {
            super(view2);
            this.f27675a = (TextView) view2.findViewById(R.id.section_header_title);
        }
    }

    public class d extends RecyclerView.f0 implements sq0.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f27676e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f27677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f27678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f27679c;

        public d(View view2) {
            super(view2);
            this.f27677a = (TextView) view2.findViewById(R.id.title);
            this.f27678b = (ImageView) view2.findViewById(R.id.drag_handle);
            this.f27679c = (ImageView) view2.findViewById(R.id.add_remove_icon);
        }

        @Override // sq0.c
        public final void a() {
            this.itemView.setAlpha(0.4f);
        }

        @Override // sq0.c
        public final void c() {
            this.itemView.setBackgroundColor(a7.b.getColor(b.this.f27661a, R.color.gcm_list_item_background));
            this.itemView.setAlpha(1.0f);
        }
    }

    public b(Context context, List<y> list, sq0.e eVar, boolean z14) {
        this.f27661a = context;
        this.f27673m = context.getString(R.string.reorderable_widgets_enabled_help_text, context.getString(R.string.device_screen_time_date), context.getString(R.string.lbl_heart_rate_cap));
        this.f27671k = context.getString(R.string.device_settings_visible_widgets).toUpperCase(Locale.getDefault());
        this.f27672l = context.getString(R.string.device_settings_hidden_widgets).toUpperCase(Locale.getDefault());
        this.f27668h = eVar;
        this.f27667g = z14;
        x(list);
    }

    public final void A() {
        for (int i14 = 0; i14 < this.f27669i.size(); i14++) {
            this.f27669i.get(i14).f34329b = i14;
        }
    }

    @Override // sq0.b
    public final int K0() {
        return this.f27662b;
    }

    @Override // sq0.b
    public final boolean f(int i14, int i15) {
        boolean zEquals = this.f27669i.get(i14).f34328a.equals("APP_NATIVE_ID_HEART_RATE");
        this.f27665e = zEquals;
        if (zEquals && !this.f27666f) {
            this.f27666f = true;
        }
        this.f27664d = i15;
        this.f27669i.get(i14).f34329b = i15;
        this.f27669i.get(i15).f34329b = i14;
        Collections.swap(this.f27669i, i14, i15);
        notifyItemMoved(i14, i15);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f27669i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (t(this.f27669i.get(i14))) {
            return 0;
        }
        return this.f27669i.get(i14).f34330c ? 1 : 2;
    }

    @Override // sq0.b
    public final void h8(int i14) {
        this.f27669i.remove(i14);
        notifyItemRemoved(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        int itemViewType = getItemViewType(i14);
        if (itemViewType == 0) {
            ((c) f0Var).f27675a.setText(this.f27669i.get(i14).f34328a);
            return;
        }
        if (itemViewType == 1 || itemViewType == 2) {
            d dVar = (d) f0Var;
            ImageView imageView = dVar.f27679c;
            b bVar = b.this;
            List<y> list = bVar.f27669i;
            Context context = bVar.f27661a;
            y yVar = list.get(i14);
            TextView textView = dVar.f27677a;
            String str = yVar.f34328a;
            y.c.f34331c.getClass();
            textView.setText(y.c.a.a(str).intValue());
            boolean z14 = yVar.f34330c;
            ImageView imageView2 = dVar.f27678b;
            if (z14) {
                imageView2.setVisibility(0);
                imageView2.setOnTouchListener(new g(dVar, 1));
                imageView.setImageDrawable(a7.b.getDrawable(context, R.drawable.gcm3_edit_insight_remove_selector));
            } else {
                imageView2.setVisibility(8);
                imageView.setImageDrawable(a7.b.getDrawable(context, R.drawable.ic_add_round));
            }
            imageView.setOnClickListener(new d0(21, dVar, yVar));
            if (bVar.u(yVar)) {
                imageView.setClickable(false);
                imageView.setAlpha(0.5f);
            } else {
                imageView.setClickable(true);
                imageView.setAlpha(1.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return i14 == 0 ? new c(this, a0.d(viewGroup, R.layout.myday_section_layout, viewGroup, false)) : new d(a0.d(viewGroup, R.layout.edit_insights_row, viewGroup, false));
    }

    public void r() {
        if (this.f27669i.get(this.f27662b).f34328a.equals("APP_NATIVE_ID_HEART_RATE")) {
            boolean z14 = this.f27665e;
            List<y> list = this.f27669i;
            if (z14) {
                int i14 = this.f27662b;
                Collections.swap(list, i14 + 1, i14);
                this.f27666f = false;
                A();
                int i15 = this.f27662b;
                notifyItemMoved(i15 + 1, i15);
                return;
            }
            String str = list.get(this.f27662b).f34328a;
            y.c.f34331c.getClass();
            int iIntValue = y.c.a.a(str).intValue();
            Context context = this.f27661a;
            new androidx.appcompat.app.e.a(context).setMessage(context.getString(R.string.device_settings_visible_widget_error, context.getString(iIntValue))).setCancelable(false).setPositiveButton(context.getString(R.string.lbl_ok), new DialogInterfaceOnClickListenerC0421b()).show();
        }
    }

    public final boolean t(y yVar) {
        String str = yVar.f34328a;
        return str == null || str.equals(this.f27671k) || str.equals(this.f27672l) || str.equals(this.f27673m);
    }

    public boolean u(y yVar) {
        return f27660n.contains(yVar.f34328a);
    }

    public final void x(List<y> list) {
        Object next;
        if (list == null) {
            return;
        }
        this.f27669i = list;
        ArrayList arrayList = this.f27670j;
        arrayList.clear();
        bv.b.f21240b.getClass();
        k1 k1Var = k1.f37122a;
        Object obj = null;
        if (!k1Var.k()) {
            List<y> list2 = this.f27669i;
            if (list2 == null) {
                next = null;
                break;
            }
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!"APP_NATIVE_ID_MCT".equals(((y) next).f34328a));
            y yVar = (y) next;
            if (yVar != null) {
                yVar.f34330c = false;
                arrayList.add(yVar);
                this.f27669i.remove(yVar);
            }
        }
        if (!k1Var.e0() && !k1Var.l()) {
            List<y> list3 = this.f27669i;
            if (list3 != null) {
                for (Object obj2 : list3) {
                    if ("APP_NATIVE_ID_PULSE_OXIMETER".equals(((y) obj2).f34328a)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            y yVar2 = (y) obj;
            if (yVar2 != null) {
                yVar2.f34330c = false;
                arrayList.add(yVar2);
                this.f27669i.remove(yVar2);
            }
        }
        z(this.f27669i);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(List<y> list) {
        Object next;
        Collections.sort(list, new a(this));
        int i14 = 0;
        while (i14 < this.f27669i.size()) {
            if (t(this.f27669i.get(i14))) {
                this.f27669i.remove(i14);
                i14--;
            }
            i14++;
        }
        y yVar = new y();
        y yVar2 = new y();
        y yVar3 = new y();
        yVar.f34328a = this.f27671k;
        yVar2.f34328a = this.f27672l;
        yVar3.f34328a = this.f27673m;
        List<y> list2 = this.f27669i;
        int i15 = e22.a.f62640a;
        list2.getClass();
        Iterator it = h0.j1(list2).iterator();
        do {
            o0 o0Var = (o0) it;
            if (!o0Var.f134956a.hasNext()) {
                next = null;
                break;
            }
            next = o0Var.next();
        } while (((y) ((m0) next).f134952b).f34330c);
        m0 m0Var = (m0) next;
        int size = m0Var != null ? m0Var.f134951a : -1;
        if (size == -1) {
            size = this.f27669i.size();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar);
        arrayList.addAll(this.f27669i.subList(0, size));
        arrayList.add(yVar2);
        if (this.f27667g) {
            arrayList.add(yVar3);
        }
        List<y> list3 = this.f27669i;
        arrayList.addAll(list3.subList(size, list3.size()));
        this.f27669i = arrayList;
        this.f27662b = 1;
        this.f27663c = size + 1;
    }

    @Override // sq0.b
    public final int z1() {
        return this.f27663c;
    }
}
