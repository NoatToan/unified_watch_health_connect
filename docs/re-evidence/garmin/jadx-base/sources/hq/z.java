package hq;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.a f85195b;

    public /* synthetic */ z(com.garmin.android.apps.connectmobile.activities.stats.exercises.a aVar, int i14) {
        this.f85194a = i14;
        this.f85195b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f85194a;
        int i15 = 1;
        com.garmin.android.apps.connectmobile.activities.stats.exercises.a aVar = this.f85195b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a.C0457a c0457a = com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i;
                if (iIntValue == 0) {
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarU6 = aVar.u6();
                    Context contextRequireContext = aVar.requireContext();
                    contextRequireContext.getClass();
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVarU6, contextRequireContext, null, u0.ALL, null, 10);
                } else if (iIntValue == 1) {
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarU7 = aVar.u6();
                    Context contextRequireContext2 = aVar.requireContext();
                    contextRequireContext2.getClass();
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVarU7, contextRequireContext2, null, u0.RECENT, null, 10);
                }
                aVar.u6().f29901r.k(null, num);
                return Unit.INSTANCE;
            case 1:
                o13.t tVar = aVar.f29853f;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.e eVar = (com.garmin.android.apps.connectmobile.activities.stats.exercises.e) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a.C0457a c0457a2 = com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i;
                eVar.getClass();
                if (eVar instanceof com.garmin.android.apps.connectmobile.activities.stats.exercises.e.c) {
                    ComposeView composeView = aVar.f29851d;
                    if (composeView == null) {
                        p005kotlin.jvm.internal.s.m("emptyView");
                        throw null;
                    }
                    composeView.setVisibility(8);
                    TextView textView = aVar.f29849b;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                        throw null;
                    }
                    textView.setVisibility(8);
                    RecyclerView recyclerView = aVar.f29850c;
                    if (recyclerView == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView.setVisibility(0);
                    b0 b0Var = (b0) tVar.getValue();
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.e.c cVar = (com.garmin.android.apps.connectmobile.activities.stats.exercises.e.c) eVar;
                    List<t0> list = cVar.f29930a;
                    r0 r0Var = cVar.f29931b;
                    b0Var.getClass();
                    list.getClass();
                    b0Var.f84967c = r0Var;
                    ArrayList arrayList = b0Var.f84966b;
                    arrayList.clear();
                    arrayList.addAll(list);
                    b0Var.notifyDataSetChanged();
                } else if (eVar instanceof com.garmin.android.apps.connectmobile.activities.stats.exercises.e.a) {
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.e.a aVar2 = (com.garmin.android.apps.connectmobile.activities.stats.exercises.e.a) eVar;
                    int i16 = aVar2.f29928c;
                    List<t0> list2 = aVar2.f29926a;
                    if (i16 > 0) {
                        ComposeView composeView2 = aVar.f29851d;
                        if (composeView2 == null) {
                            p005kotlin.jvm.internal.s.m("emptyView");
                            throw null;
                        }
                        composeView2.setVisibility(8);
                        TextView textView2 = aVar.f29849b;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        TextView textView3 = aVar.f29849b;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                            throw null;
                        }
                        textView3.setText(aVar.getResources().getQuantityString(R.plurals.select_exercise_result_title, i16, Integer.valueOf(i16)));
                        RecyclerView recyclerView2 = aVar.f29850c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setVisibility(0);
                        b0 b0Var2 = (b0) tVar.getValue();
                        r0 r0Var2 = aVar2.f29927b;
                        b0Var2.getClass();
                        list2.getClass();
                        b0Var2.f84967c = r0Var2;
                        ArrayList arrayList2 = b0Var2.f84966b;
                        arrayList2.clear();
                        arrayList2.addAll(list2);
                        b0Var2.notifyDataSetChanged();
                    } else {
                        aVar.v6();
                        TextView textView4 = aVar.f29849b;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                            throw null;
                        }
                        textView4.setVisibility(8);
                        RecyclerView recyclerView3 = aVar.f29850c;
                        if (recyclerView3 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView3.setVisibility(8);
                    }
                } else if (eVar instanceof com.garmin.android.apps.connectmobile.activities.stats.exercises.e.b) {
                    ComposeView composeView3 = aVar.f29851d;
                    if (composeView3 == null) {
                        p005kotlin.jvm.internal.s.m("emptyView");
                        throw null;
                    }
                    composeView3.setVisibility(0);
                    composeView3.setContent(new z3.e(-1246273961, true, new y(aVar, i15)));
                    TextView textView5 = aVar.f29849b;
                    if (textView5 == null) {
                        p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                        throw null;
                    }
                    textView5.setVisibility(8);
                    RecyclerView recyclerView4 = aVar.f29850c;
                    if (recyclerView4 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView4.setVisibility(8);
                } else {
                    aVar.v6();
                    TextView textView6 = aVar.f29849b;
                    if (textView6 == null) {
                        p005kotlin.jvm.internal.s.m("filterResultCountTextView");
                        throw null;
                    }
                    textView6.setVisibility(8);
                    RecyclerView recyclerView5 = aVar.f29850c;
                    if (recyclerView5 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView5.setVisibility(8);
                }
                return Unit.INSTANCE;
            default:
                h hVar = (h) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a.C0457a c0457a3 = com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i;
                hVar.getClass();
                ArrayList arrayListD1 = p13.h0.d1(aVar.u6().f29893j);
                arrayListD1.remove(hVar);
                com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarU8 = aVar.u6();
                Context contextRequireContext3 = aVar.requireContext();
                contextRequireContext3.getClass();
                com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVarU8, contextRequireContext3, null, null, arrayListD1, 6);
                g gVar = aVar.f29855h;
                if (gVar != null) {
                    List<h> list3 = gVar.f85013a;
                    int iIndexOf = list3.indexOf(hVar);
                    list3.remove(iIndexOf);
                    gVar.notifyItemRemoved(iIndexOf);
                }
                return Unit.INSTANCE;
        }
    }
}
