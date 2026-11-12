package hq;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c2.o3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lhq/g0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lhq/g0$b;", "", "isMuscleList", "Landroidx/lifecycle/y0;", "", "Lhq/h;", "exerciseFilterOptions", "", "", "translationMap", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "availableList", "<init>", "(ZLandroidx/lifecycle/y0;Ljava/util/Map;Ljava/util/List;)V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f85018e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<h>> f85020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f85021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f85022d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhq/g0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "", "callback", "<init>", "(Landroid/view/View;Le23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<Integer, Unit> f85023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k32.j f85024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Resources f85025c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(View view2, e23.l<? super Integer, Unit> lVar) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            this.f85023a = lVar;
            this.f85024b = new k32.j(view2, 0, 2, null);
            this.f85025c = view2.getContext().getResources();
            ((TextView) this.itemView.findViewById(R.id.text1)).setTextColor(this.itemView.getContext().getColorStateList(R.color.gcm_text_primary_selector));
        }

        public final void d(h hVar) {
            hVar.getClass();
            Integer num = hVar.f85027b ? 2131232298 : null;
            ImageView imageView = this.f85024b.f102701f;
            if (num != null) {
                imageView.setImageResource(num.intValue());
                imageView.setVisibility(0);
            } else {
                v22.e.j(imageView);
            }
            this.itemView.setEnabled(hVar.f85028c);
            View view2 = this.itemView;
            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
            if (viewGroup != null) {
                Iterator<View> it = new androidx.core.view.x0(viewGroup).iterator();
                while (it.hasNext()) {
                    it.next().setEnabled(hVar.f85028c);
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            this.f85023a.invoke(Integer.valueOf(getBindingAdapterPosition()));
        }
    }

    static {
        new a(null);
    }

    public g0(boolean z14, androidx.lifecycle.y0<List<h>> y0Var, Map<String, String> map, List<com.garmin.android.apps.connectmobile.repcounting.model.d> list) {
        ArrayList arrayListC0;
        y0Var.getClass();
        map.getClass();
        list.getClass();
        this.f85019a = z14;
        this.f85020b = y0Var;
        this.f85021c = map;
        ArrayList arrayList = new ArrayList();
        this.f85022d = arrayList;
        int i14 = 0;
        if (z14) {
            zw1.a[] aVarArrValues = zw1.a.values();
            ArrayList<h.b> arrayList2 = new ArrayList(aVarArrValues.length);
            int length = aVarArrValues.length;
            while (i14 < length) {
                arrayList2.add(new h.b(aVarArrValues[i14]));
                i14++;
            }
            for (h.b bVar : arrayList2) {
                String str = this.f85021c.get(bVar.f85030d.f207225a);
                if (str == null) {
                    str = bVar.f85030d.f207225a;
                }
                str.getClass();
                bVar.f85026a = str;
            }
            List<h.b> listM0 = p13.h0.M0(arrayList2);
            List<h> listD = this.f85020b.d();
            listD = listD == null ? p13.j0.f134944a : listD;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listD) {
                if (obj instanceof h.b) {
                    arrayList3.add(obj);
                }
            }
            for (h.b bVar2 : listM0) {
                bVar2.f85027b = arrayList3.contains(bVar2);
            }
            List listS = c53.c0.s(new c53.c(c53.c0.l(p13.h0.M(list), new f0(0)), new com.google.maps.android.compose.clustering.d(21)));
            for (h.b bVar3 : listM0) {
                bVar3.f85028c = listS.contains(bVar3.f85030d.f207225a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listM0) {
                if (((h.b) obj2).f85028c) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : listM0) {
                if (!((h.b) obj3).f85028c) {
                    arrayList5.add(obj3);
                }
            }
            arrayListC0 = p13.h0.C0(arrayList4, arrayList5);
        } else {
            qu1.a[] aVarArrValues2 = qu1.a.values();
            ArrayList<h.a> arrayList6 = new ArrayList(aVarArrValues2.length);
            int length2 = aVarArrValues2.length;
            while (i14 < length2) {
                arrayList6.add(new h.a(aVarArrValues2[i14]));
                i14++;
            }
            for (h.a aVar : arrayList6) {
                String str2 = this.f85021c.get(aVar.f85029d.f147898a);
                if (str2 == null) {
                    str2 = "";
                }
                aVar.f85026a = str2;
            }
            List<h.a> listM1 = p13.h0.M0(arrayList6);
            List<h> listD2 = this.f85020b.d();
            listD2 = listD2 == null ? p13.j0.f134944a : listD2;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : listD2) {
                if (obj4 instanceof h.a) {
                    arrayList7.add(obj4);
                }
            }
            for (h.a aVar2 : listM1) {
                aVar2.f85027b = arrayList7.contains(aVar2);
            }
            List listR = r(list);
            for (h.a aVar3 : listM1) {
                aVar3.f85028c = listR.contains(aVar3.f85029d.f147898a);
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj5 : listM1) {
                if (((h.a) obj5).f85028c) {
                    arrayList8.add(obj5);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : listM1) {
                if (!((h.a) obj6).f85028c) {
                    arrayList9.add(obj6);
                }
            }
            arrayListC0 = p13.h0.C0(arrayList8, arrayList9);
        }
        arrayList.addAll(arrayListC0);
    }

    public static List r(List list) {
        return c53.c0.s(new c53.c(c53.q.c(c53.c0.o(c53.c0.h(p13.h0.M(list), new f0(1)), new f0(2)), new o3(16)), new com.google.maps.android.compose.clustering.d(21)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f85022d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        h hVar = (h) this.f85022d.get(i14);
        hVar.getClass();
        k32.j jVar = bVar.f85024b;
        String str = hVar.f85026a;
        ImageView imageView = jVar.f102701f;
        TextView textView = jVar.f102699d;
        TextView textView2 = jVar.f102698c;
        TextView textView3 = jVar.f102697b;
        ImageView imageView2 = jVar.f102700e;
        str.getClass();
        v22.e.v(imageView2, false);
        textView3.setText(str);
        textView3.setVisibility(0);
        v22.e.v(textView2, false);
        v22.e.v(textView, false);
        v22.e.v(imageView, false);
        Resources resources = bVar.f85025c;
        int iB = hVar.b();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        LayerDrawable layerDrawable = null;
        Drawable drawable = resources.getDrawable(iB, null);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        LayerDrawable layerDrawable2 = drawableMutate instanceof LayerDrawable ? (LayerDrawable) drawableMutate : null;
        Drawable drawable2 = resources.getDrawable(hVar.d(), null);
        Drawable drawableMutate2 = drawable2 != null ? drawable2.mutate() : null;
        if (layerDrawable2 != null) {
            layerDrawable2.setDrawableByLayerId(R.id.icon_drawable, drawableMutate2);
            layerDrawable = layerDrawable2;
        }
        if (layerDrawable != null) {
            imageView2.setImageDrawable(layerDrawable);
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        bVar.itemView.setOnClickListener(bVar);
        bVar.d(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm_list_item_multiline, viewGroup, false);
        viewE.getClass();
        return new b(viewE, new h0(this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhq/g0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        b bVar = (b) f0Var;
        bVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(bVar, i14, list);
        } else {
            bVar.d((h) this.f85022d.get(i14));
        }
    }
}
