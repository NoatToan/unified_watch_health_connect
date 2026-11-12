package im;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import aq.q1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import ps.r1;
import ps.x1;
import qm.l0;
import qm.m0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lim/k;", "Landroidx/recyclerview/widget/x;", "", "Lnr/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isPortrait", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "workoutComparisonTargetData", "<init>", "(Landroidx/fragment/app/m;ZLandroid/util/SparseArray;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends androidx.recyclerview.widget.x<List<? extends nr.b>, RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f94150e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.m f94151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<q0> f94153d;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"im/k$a", "Landroidx/recyclerview/widget/o$f;", "", "Lnr/b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<List<? extends nr.b>> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(List<? extends nr.b> list, List<? extends nr.b> list2) {
            List<? extends nr.b> list3 = list;
            List<? extends nr.b> list4 = list2;
            list3.getClass();
            list4.getClass();
            return list3.equals(list4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(List<? extends nr.b> list, List<? extends nr.b> list2) {
            List<? extends nr.b> list3 = list;
            List<? extends nr.b> list4 = list2;
            list3.getClass();
            list4.getClass();
            return list3.size() == list4.size() && ((nr.b) h0.b0(list3)).f126986d.getB1() == ((nr.b) h0.b0(list4)).f126986d.getB1();
        }
    }

    static {
        new b(null);
        f94150e = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.fragment.app.m mVar, boolean z14, SparseArray<q0> sparseArray) {
        super(f94150e);
        mVar.getClass();
        this.f94151b = mVar;
        this.f94152c = z14;
        this.f94153d = sparseArray;
    }

    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f94152c ? super.getItemCount() + 1 : super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (this.f94152c && i14 == getItemCount() - 1) {
            return R.layout.orientation_hint;
        }
        List<? extends nr.b> listR = r(i14);
        listR.getClass();
        List<? extends nr.b> list = listR;
        boolean z14 = list.size() > 1;
        if (((nr.b) h0.b0(list)).f126986d.getB1() == 27) {
            return R.layout.gcm_chart_power_balance_list_item;
        }
        return z14 ? R.layout.gcm_dropdown_chart_list_item : R.layout.gcm_chart_list_item;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0377  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) throws Throwable {
        im.b bVar;
        List<x1> list;
        e23.a<Unit> aVar;
        Object obj;
        e23.a<Unit> aVar2;
        String f113511u1;
        f0Var.getClass();
        boolean z14 = this.f94152c;
        if (z14 && i14 == getItemCount() - 1) {
            return;
        }
        List<? extends nr.b> listR = r(i14);
        listR.getClass();
        List<? extends nr.b> list2 = listR;
        final nr.b bVar2 = (nr.b) h0.b0(list2);
        if (f0Var instanceof q) {
            q qVar = (q) f0Var;
            String str = bVar2.f126984b;
            TextView textView = qVar.f28965d;
            if (str != null) {
                if (textView != null) {
                    textView.setText(str);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            ArrayList<zm.p> arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((nr.b) it.next()).f126986d);
            }
            hy.h hVar = new hy.h(21, f0Var, list2);
            androidx.media3.exoplayer.w wVar = new androidx.media3.exoplayer.w(list2, 1);
            fz.c f113514x1 = bVar2.f126986d.getF113514x1();
            f113514x1.getClass();
            AppCompatSpinner appCompatSpinner = qVar.f94173l;
            bq.c cVar = qVar.f94177p;
            cVar.getClass();
            cVar.f19479e = wVar;
            cVar.f19476b = qVar.f94175n;
            ArrayList arrayList2 = qVar.f94176o;
            arrayList2.clear();
            i iVar = qVar.f94174m;
            iVar.clear();
            for (zm.p pVar : arrayList) {
                arrayList2.add(pVar);
                iVar.add(pVar.getF113511u1());
            }
            if (appCompatSpinner != null) {
                appCompatSpinner.setAdapter((SpinnerAdapter) iVar);
            }
            iVar.notifyDataSetChanged();
            SparseArray<q0> sparseArray = this.f94153d;
            if (appCompatSpinner != null) {
                appCompatSpinner.setOnItemSelectedListener(new p(qVar, sparseArray, f113514x1, hVar));
            }
            zm.p pVar2 = (zm.p) h0.d0(arrayList2);
            if (pVar2 != null && (f113511u1 = pVar2.getF113511u1()) != null) {
                qVar.l(f113511u1, sparseArray, f113514x1);
            }
            if (z14) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it3.next();
                    if (((nr.b) next).f126988f != null) {
                        obj = next;
                        break;
                    }
                }
                nr.b bVar3 = (nr.b) obj;
                if (bVar3 == null || (aVar2 = bVar3.f126988f) == null) {
                    return;
                }
                qVar.k(aVar2);
                return;
            }
            return;
        }
        if (f0Var instanceof com.garmin.android.apps.connectmobile.activities.charts.b) {
            com.garmin.android.apps.connectmobile.activities.charts.b bVar4 = (com.garmin.android.apps.connectmobile.activities.charts.b) f0Var;
            fz.c f113514x2 = bVar2.f126986d.getF113514x1();
            f113514x2.getClass();
            SparseArray<int[]> sparseArray2 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
            ViewGroup viewGroup = bVar4.f28967f;
            ImageView imageView = bVar4.f28968g;
            LinearLayout linearLayout = bVar4.f28970i;
            LinearLayout linearLayout2 = bVar4.f28969h;
            androidx.fragment.app.m mVar = this.f94151b;
            mVar.getClass();
            e23.a<Unit> aVar3 = bVar2.f126989g;
            im.b bVar5 = bVar2.f126986d;
            View view2 = bVar4.f28966e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            String str2 = bVar2.f126983a;
            TextView textView2 = bVar4.f28964c;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            if (z14 && (aVar = bVar2.f126988f) != null) {
                bVar4.k(new ii0.h(aVar, 14));
            }
            List<r22.p> list3 = bVar2.f126985c;
            bVar4.j(false);
            if (list3.isEmpty()) {
                bVar4.j(false);
            } else {
                bVar4.j(true);
                r22.p pVar3 = list3.get(0);
                bVar4.h(true);
                String str3 = pVar3.f149774a;
                String str4 = pVar3.f149775b;
                bVar4.e(str3, pVar3.f149776c, str4, pVar3.f149780g);
                if (list3.size() >= 2) {
                    r22.p pVar4 = list3.get(1);
                    bVar4.i(true);
                    bVar4.g(pVar4.f149774a, pVar4.f149776c, str4, pVar4.f149780g);
                } else {
                    bVar4.i(false);
                }
            }
            int f113498h1 = bVar5.getB1();
            int dimension = (int) mVar.getResources().getDimension(R.dimen.gcm3_activity_chart_height);
            if (f113498h1 == 29) {
                dimension = (int) (((double) dimension) * 1.2d);
            } else if (f113498h1 == 32) {
                dimension = -2;
            } else if (f113498h1 == 45) {
                dimension = (int) (((double) dimension) * 1.2d);
            }
            int f113498h2 = bVar5.getB1();
            if (f113498h2 != 17) {
                if (f113498h2 != 18) {
                    if (f113498h2 != 45) {
                        if (f113498h2 == 95) {
                            imageView = imageView;
                            bVar = bVar5;
                            bVar4.j(false);
                            qm.k.f145395a.getClass();
                            tr.g gVarB = qm.k.b(f113498h2, mVar);
                            l0 l0VarA = qm.k.a(f113498h2);
                            com.garmin.android.apps.connectmobile.activities.newmodel.o oVarQ1 = bVar.Q1();
                            com.garmin.android.apps.connectmobile.activities.newmodel.o.d dVar = oVarQ1 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.d ? (com.garmin.android.apps.connectmobile.activities.newmodel.o.d) oVarQ1 : null;
                            if (gVarB != null && l0VarA != null && dVar != null) {
                                n nVar = bVar.X;
                                nVar.getClass();
                                if (gVarB instanceof tr.a) {
                                    ((tr.a) gVarB).f166116b = nVar;
                                }
                                if (l0VarA instanceof qm.l) {
                                    ((qm.l) l0VarA).f145396a = nVar;
                                }
                                m0 m0Var = new m0(mVar, l0VarA, gVarB);
                                m0Var.c(dVar, nVar);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                                if (linearLayout2 != null) {
                                    linearLayout2.removeAllViews();
                                }
                                if (linearLayout2 != null) {
                                    linearLayout2.addView(m0Var, layoutParams);
                                }
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(0);
                                }
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                }
                                View view3 = bVar4.itemView;
                                view3.getClass();
                                final int i15 = 3;
                                v22.e.n(view3, new e23.l() { // from class: im.j
                                    @Override // e23.l
                                    public final Object invoke(Object obj2) {
                                        int i16 = i15;
                                        nr.b bVar6 = bVar2;
                                        View view4 = (View) obj2;
                                        switch (i16) {
                                            case 0:
                                                SparseArray<int[]> sparseArray3 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                view4.getClass();
                                                e23.a<Unit> aVar4 = bVar6.f126989g;
                                                if (aVar4 != null) {
                                                    aVar4.invoke();
                                                }
                                                break;
                                            case 1:
                                                SparseArray<int[]> sparseArray4 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                view4.getClass();
                                                e23.a<Unit> aVar5 = bVar6.f126989g;
                                                if (aVar5 != null) {
                                                    aVar5.invoke();
                                                }
                                                break;
                                            case 2:
                                                SparseArray<int[]> sparseArray5 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                view4.getClass();
                                                e23.a<Unit> aVar6 = bVar6.f126989g;
                                                if (aVar6 != null) {
                                                    aVar6.invoke();
                                                }
                                                break;
                                            case 3:
                                                SparseArray<int[]> sparseArray6 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                view4.getClass();
                                                e23.a<Unit> aVar7 = bVar6.f126989g;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                                break;
                                            default:
                                                SparseArray<int[]> sparseArray7 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                view4.getClass();
                                                e23.a<Unit> aVar8 = bVar6.f126989g;
                                                if (aVar8 != null) {
                                                    aVar8.invoke();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        } else if (f113498h2 == 78) {
                            imageView = imageView;
                            bVar = bVar5;
                            bVar4.j(false);
                            m0 m0Var2 = new m0(mVar, null, null, 6, null);
                            b0 b0Var = bVar instanceof b0 ? (b0) bVar : null;
                            if (b0Var == null || (list = b0Var.X0) == null) {
                                list = j0.f134944a;
                            }
                            m0Var2.b(list, bVar.getF113504n1());
                            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
                            if (linearLayout2 != null) {
                                linearLayout2.removeAllViews();
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.addView(m0Var2, layoutParams2);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                            View view4 = bVar4.itemView;
                            view4.getClass();
                            final int i16 = 4;
                            v22.e.n(view4, new e23.l() { // from class: im.j
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    int i17 = i16;
                                    nr.b bVar6 = bVar2;
                                    View view5 = (View) obj2;
                                    switch (i17) {
                                        case 0:
                                            SparseArray<int[]> sparseArray3 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                            view5.getClass();
                                            e23.a<Unit> aVar4 = bVar6.f126989g;
                                            if (aVar4 != null) {
                                                aVar4.invoke();
                                            }
                                            break;
                                        case 1:
                                            SparseArray<int[]> sparseArray4 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                            view5.getClass();
                                            e23.a<Unit> aVar5 = bVar6.f126989g;
                                            if (aVar5 != null) {
                                                aVar5.invoke();
                                            }
                                            break;
                                        case 2:
                                            SparseArray<int[]> sparseArray5 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                            view5.getClass();
                                            e23.a<Unit> aVar6 = bVar6.f126989g;
                                            if (aVar6 != null) {
                                                aVar6.invoke();
                                            }
                                            break;
                                        case 3:
                                            SparseArray<int[]> sparseArray6 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                            view5.getClass();
                                            e23.a<Unit> aVar7 = bVar6.f126989g;
                                            if (aVar7 != null) {
                                                aVar7.invoke();
                                            }
                                            break;
                                        default:
                                            SparseArray<int[]> sparseArray7 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                            view5.getClass();
                                            e23.a<Unit> aVar8 = bVar6.f126989g;
                                            if (aVar8 != null) {
                                                aVar8.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        } else if (f113498h2 != 79) {
                            if (f113498h2 == 90 || f113498h2 == 91) {
                                imageView = imageView;
                                bVar = bVar5;
                                bVar4.j(false);
                                qm.k kVar = qm.k.f145395a;
                                int f113498h3 = bVar.getB1();
                                kVar.getClass();
                                tr.g gVarB2 = qm.k.b(f113498h3, mVar);
                                l0 l0VarA2 = qm.k.a(bVar.getB1());
                                boolean z15 = f113498h2 == 90;
                                if (gVarB2 != null && l0VarA2 != null) {
                                    m0 m0Var3 = new m0(mVar, l0VarA2, gVarB2);
                                    List<r1> listK = bVar.K();
                                    listK.getClass();
                                    m0Var3.a(listK, bVar.getF94136a1(), z15);
                                    ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -2);
                                    if (linearLayout2 != null) {
                                        linearLayout2.removeAllViews();
                                    }
                                    if (linearLayout2 != null) {
                                        linearLayout2.addView(m0Var3, layoutParams3);
                                    }
                                    if (linearLayout2 != null) {
                                        linearLayout2.setVisibility(0);
                                    }
                                    if (linearLayout != null) {
                                        linearLayout.setVisibility(0);
                                    }
                                    View view5 = bVar4.itemView;
                                    view5.getClass();
                                    final int i17 = 2;
                                    v22.e.n(view5, new e23.l() { // from class: im.j
                                        @Override // e23.l
                                        public final Object invoke(Object obj2) {
                                            int i18 = i17;
                                            nr.b bVar6 = bVar2;
                                            View view6 = (View) obj2;
                                            switch (i18) {
                                                case 0:
                                                    SparseArray<int[]> sparseArray3 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                    view6.getClass();
                                                    e23.a<Unit> aVar4 = bVar6.f126989g;
                                                    if (aVar4 != null) {
                                                        aVar4.invoke();
                                                    }
                                                    break;
                                                case 1:
                                                    SparseArray<int[]> sparseArray4 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                    view6.getClass();
                                                    e23.a<Unit> aVar5 = bVar6.f126989g;
                                                    if (aVar5 != null) {
                                                        aVar5.invoke();
                                                    }
                                                    break;
                                                case 2:
                                                    SparseArray<int[]> sparseArray5 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                    view6.getClass();
                                                    e23.a<Unit> aVar6 = bVar6.f126989g;
                                                    if (aVar6 != null) {
                                                        aVar6.invoke();
                                                    }
                                                    break;
                                                case 3:
                                                    SparseArray<int[]> sparseArray6 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                    view6.getClass();
                                                    e23.a<Unit> aVar7 = bVar6.f126989g;
                                                    if (aVar7 != null) {
                                                        aVar7.invoke();
                                                    }
                                                    break;
                                                default:
                                                    SparseArray<int[]> sparseArray7 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                                    view6.getClass();
                                                    e23.a<Unit> aVar8 = bVar6.f126989g;
                                                    if (aVar8 != null) {
                                                        aVar8.invoke();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                }
                            } else {
                                if (aVar3 != null) {
                                    bVar4.itemView.setOnClickListener(new q1(aVar3, 8));
                                }
                                int i18 = dimension;
                                imageView = imageView;
                                ar.e.f(mVar, bVar4.f28969h, bVar4.f28970i, bVar4.f28971j, bVar5, i18, null, this.f94153d, false, null, null, f113514x2);
                            }
                        }
                        bVar5 = bVar;
                    } else {
                        int i19 = dimension;
                        imageView = imageView;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                        }
                        String string = mVar.getString(R.string.max_tanks_selection);
                        LinkedHashMap<String, Object> linkedHashMap = bVar2.f126987e;
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap<>();
                        }
                        com.garmin.android.apps.connectmobile.activities.charts.c cVar2 = new com.garmin.android.apps.connectmobile.activities.charts.c(viewGroup, null, null);
                        cVar2.f28974c = 4;
                        cVar2.f28975d = 1;
                        cVar2.c(string, linkedHashMap);
                        int[] iArr = sparseArray2.get(f113498h2);
                        ArrayList arrayList3 = new ArrayList();
                        if (iArr == null) {
                            arrayList3.add(0);
                        } else if (!(iArr.length == 0)) {
                            int length = iArr.length;
                            for (int iD = 0; iD < length; iD = e5.d(iArr[iD], iD, arrayList3, 1)) {
                            }
                        } else {
                            arrayList3.add(0);
                        }
                        cVar2.b(arrayList3);
                        if (aVar3 != null) {
                            bVar4.itemView.setOnClickListener(new q1(aVar3, 7));
                        }
                        bVar5 = bVar5;
                        ar.e.f(mVar, bVar4.f28969h, bVar4.f28970i, null, bVar5, i19, null, null, false, cVar2, sparseArray2.get(f113498h2), f113514x2);
                    }
                }
                bVar4.j(false);
                qm.k kVar2 = qm.k.f145395a;
                int f113498h4 = bVar5.getB1();
                kVar2.getClass();
                tr.g gVarB3 = qm.k.b(f113498h4, r24);
                l0 l0VarA3 = qm.k.a(bVar5.getB1());
                if (gVarB3 != null && l0VarA3 != null) {
                    m0 m0Var4 = new m0(mVar, l0VarA3, gVarB3);
                    List<r1> listM3 = bVar5.M3();
                    listM3.getClass();
                    m0Var4.a(listM3, bVar5.getF94136a1(), false);
                    ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.addView(m0Var4, layoutParams4);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    View view6 = bVar4.itemView;
                    view6.getClass();
                    final int i24 = 1;
                    v22.e.n(view6, new e23.l() { // from class: im.j
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i110 = i24;
                            nr.b bVar6 = bVar2;
                            View view7 = (View) obj2;
                            switch (i110) {
                                case 0:
                                    SparseArray<int[]> sparseArray3 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view7.getClass();
                                    e23.a<Unit> aVar4 = bVar6.f126989g;
                                    if (aVar4 != null) {
                                        aVar4.invoke();
                                    }
                                    break;
                                case 1:
                                    SparseArray<int[]> sparseArray4 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view7.getClass();
                                    e23.a<Unit> aVar5 = bVar6.f126989g;
                                    if (aVar5 != null) {
                                        aVar5.invoke();
                                    }
                                    break;
                                case 2:
                                    SparseArray<int[]> sparseArray5 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view7.getClass();
                                    e23.a<Unit> aVar6 = bVar6.f126989g;
                                    if (aVar6 != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                                case 3:
                                    SparseArray<int[]> sparseArray6 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view7.getClass();
                                    e23.a<Unit> aVar7 = bVar6.f126989g;
                                    if (aVar7 != null) {
                                        aVar7.invoke();
                                    }
                                    break;
                                default:
                                    SparseArray<int[]> sparseArray7 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view7.getClass();
                                    e23.a<Unit> aVar8 = bVar6.f126989g;
                                    if (aVar8 != null) {
                                        aVar8.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            } else {
                imageView = imageView;
                bVar4.j(false);
                qm.k.f145395a.getClass();
                tr.g gVarB4 = qm.k.b(f113498h2, mVar);
                l0 l0VarA4 = qm.k.a(f113498h2);
                if (gVarB4 != null && l0VarA4 != null) {
                    m0 m0Var5 = new m0(mVar, l0VarA4, gVarB4);
                    List<r1> listK2 = bVar5.K();
                    listK2.getClass();
                    m0Var5.a(listK2, bVar5.getF94136a1(), false);
                    ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(-1, -2);
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.addView(m0Var5, layoutParams5);
                    }
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    LinearLayout linearLayout3 = bVar4.f28971j;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                    }
                    View view7 = bVar4.itemView;
                    view7.getClass();
                    final int i25 = 0;
                    v22.e.n(view7, new e23.l() { // from class: im.j
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i110 = i25;
                            nr.b bVar6 = bVar2;
                            View view8 = (View) obj2;
                            switch (i110) {
                                case 0:
                                    SparseArray<int[]> sparseArray3 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view8.getClass();
                                    e23.a<Unit> aVar4 = bVar6.f126989g;
                                    if (aVar4 != null) {
                                        aVar4.invoke();
                                    }
                                    break;
                                case 1:
                                    SparseArray<int[]> sparseArray4 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view8.getClass();
                                    e23.a<Unit> aVar5 = bVar6.f126989g;
                                    if (aVar5 != null) {
                                        aVar5.invoke();
                                    }
                                    break;
                                case 2:
                                    SparseArray<int[]> sparseArray5 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view8.getClass();
                                    e23.a<Unit> aVar6 = bVar6.f126989g;
                                    if (aVar6 != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                                case 3:
                                    SparseArray<int[]> sparseArray6 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view8.getClass();
                                    e23.a<Unit> aVar7 = bVar6.f126989g;
                                    if (aVar7 != null) {
                                        aVar7.invoke();
                                    }
                                    break;
                                default:
                                    SparseArray<int[]> sparseArray7 = com.garmin.android.apps.connectmobile.activities.charts.b.f28961k;
                                    view8.getClass();
                                    e23.a<Unit> aVar8 = bVar6.f126989g;
                                    if (aVar8 != null) {
                                        aVar8.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            if (bVar5.getB1() == 20) {
                bVar4.j(false);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, i14, viewGroup, false);
        if (i14 == R.layout.gcm_chart_power_balance_list_item) {
            viewE.getClass();
            return new m(viewE);
        }
        if (i14 == R.layout.gcm_dropdown_chart_list_item) {
            viewE.getClass();
            return new q(viewE);
        }
        if (i14 == R.layout.gcm_chart_list_item) {
            viewE.getClass();
            return new com.garmin.android.apps.connectmobile.activities.charts.b(viewE);
        }
        if (i14 == R.layout.orientation_hint) {
            viewE.getClass();
            return new w(viewE);
        }
        vb.h.w();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/k$b;", "", "<init>", "()V", "im/k$a", "differ", "Lim/k$a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
