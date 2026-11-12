package po;

import am.z0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.c1;
import ps.t1;
import r22.u1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpo/k;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f138917m = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h.a f138918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ComposeView f138919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f138920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f138921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f138922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f138923l;

    public k() {
        super(R.layout.activity_map_settings_bottom_sheet, false, false, 0, 14, null);
        this.f138923l = new Handler(Looper.getMainLooper());
    }

    public static final k z6(Integer num, com.garmin.android.library.mapsdkadapter.i.d dVar, List<qw0.u> list, List<qw0.u> list2, c1 c1Var, boolean z14, boolean z15, boolean z16, boolean z17, String str) {
        f138917m.getClass();
        dVar.getClass();
        list.getClass();
        list2.getClass();
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("MAP_TYPE", num.intValue());
        bundle.putSerializable("MAP_PROVIDER", dVar);
        bundle.putParcelableArrayList("LIST_DISTANCE_MARKERS_SWITCH_CONFIGURATIONS", new ArrayList<>(list));
        bundle.putParcelableArrayList("LIST_ACTIVITY_HIGHLIGHTS_SWITCH_CONFIGURATIONS", new ArrayList<>(list2));
        bundle.putParcelable("METRIC_TRACK_LOGS", c1Var);
        bundle.putBoolean("3D_ENABLED", z14);
        bundle.putBoolean("extra_has_gc_maps_3D_subscription", z15);
        bundle.putBoolean("SHOW_TERRAIN_TYPE", z16);
        bundle.putBoolean("IS_HEAT_MAP", z17);
        bundle.putString("ACTIVITY_TYPE_KEY", str);
        l2.f37135b.getClass();
        l2.a.c(kVar, bundle);
        return kVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Type inference failed for: r4v3, types: [po.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [po.j] */
    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        com.garmin.android.library.mapsdkadapter.i.d dVar;
        List<qw0.u> listB1;
        List listB2;
        c1 c1Var;
        boolean z14;
        CharSequence charSequenceA;
        Parcelable parcelable;
        Object serializable;
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        final int i14 = 1;
        int i15 = bundleC != null ? bundleC.getInt("MAP_TYPE", 1) : 1;
        boolean z15 = bundleC != null ? bundleC.getBoolean("SHOW_TERRAIN_TYPE", true) : true;
        if (bundleC == null) {
            dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundleC.getSerializable("MAP_PROVIDER", com.garmin.android.library.mapsdkadapter.i.d.class);
            } else {
                Object serializable2 = bundleC.getSerializable("MAP_PROVIDER");
                if (!(serializable2 instanceof com.garmin.android.library.mapsdkadapter.i.d)) {
                    serializable2 = null;
                }
                serializable = (com.garmin.android.library.mapsdkadapter.i.d) serializable2;
            }
            dVar = (com.garmin.android.library.mapsdkadapter.i.d) serializable;
            if (dVar == null) {
                dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            }
        }
        if (bundleC == null) {
            listB1 = p13.j0.f134944a;
        } else {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleC.getParcelableArrayList("LIST_DISTANCE_MARKERS_SWITCH_CONFIGURATIONS", qw0.u.class) : bundleC.getParcelableArrayList("LIST_DISTANCE_MARKERS_SWITCH_CONFIGURATIONS");
            if (parcelableArrayList == null || (listB1 = p13.h0.b1(parcelableArrayList)) == null) {
                listB1 = p13.j0.f134944a;
            }
        }
        if (bundleC == null) {
            listB2 = p13.j0.f134944a;
        } else {
            ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundleC.getParcelableArrayList("LIST_ACTIVITY_HIGHLIGHTS_SWITCH_CONFIGURATIONS", qw0.u.class) : bundleC.getParcelableArrayList("LIST_ACTIVITY_HIGHLIGHTS_SWITCH_CONFIGURATIONS");
            if (parcelableArrayList2 == null || (listB2 = p13.h0.b1(parcelableArrayList2)) == null) {
                listB2 = p13.j0.f134944a;
            }
        }
        if (bundleC == null) {
            p13.j0 j0Var = p13.j0.f134944a;
            c1Var = new c1(j0Var, j0Var, j0Var, null, 8, null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleC.getParcelable("METRIC_TRACK_LOGS", c1.class);
            } else {
                Parcelable parcelable2 = bundleC.getParcelable("METRIC_TRACK_LOGS");
                if (!(parcelable2 instanceof c1)) {
                    parcelable2 = null;
                }
                parcelable = (c1) parcelable2;
            }
            c1Var = (c1) parcelable;
            if (c1Var == null) {
                p13.j0 j0Var2 = p13.j0.f134944a;
                c1Var = new c1(j0Var2, j0Var2, j0Var2, null, 8, null);
            }
        }
        int i16 = 0;
        boolean z16 = bundleC != null && bundleC.getBoolean("3D_ENABLED");
        boolean z17 = bundleC != null && bundleC.getBoolean("extra_has_gc_maps_3D_subscription");
        boolean z18 = bundleC != null && bundleC.getBoolean("IS_HEAT_MAP");
        String string = bundleC != null ? bundleC.getString("ACTIVITY_TYPE_KEY") : null;
        View viewFindViewById = view2.findViewById(R.id.map_type_selector);
        viewFindViewById.getClass();
        ((ComposeView) viewFindViewById).setContent(new z3.e(1640266080, true, new qw0.w(qw0.x.b(z15), i15, new e23.l(this) { // from class: po.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f138900b;

            {
                this.f138900b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i14;
                k kVar = this.f138900b;
                switch (i17) {
                    case 0:
                        t1 t1Var = (t1) obj;
                        k.a aVar = k.f138917m;
                        t1Var.getClass();
                        h.a aVar2 = kVar.f138918g;
                        if (aVar2 != null) {
                            h hVar = h.this;
                            int i18 = hVar.f138862r1;
                            if (i18 > -1) {
                                c1 c1Var2 = hVar.f138853l1;
                                if (c1Var2 != null) {
                                    c1Var2.f139768e = t1Var;
                                }
                                hVar.E7(hVar.f138863s1, w02.b0.l(i18, hVar.V0));
                            } else {
                                hVar.J7(t1Var);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        h.a aVar3 = kVar.f138918g;
                        if (aVar3 != null) {
                            h hVar2 = h.this;
                            hVar2.G7(iIntValue);
                            String strM7 = hVar2.m7();
                            if (strM7 != null) {
                                hVar2.B1.o(iIntValue, strM7);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                        k.a aVar4 = k.f138917m;
                        dVar2.getClass();
                        dVar2.toString();
                        ViewGroup viewGroup = kVar.f138920i;
                        if (viewGroup == null) {
                            p005kotlin.jvm.internal.s.m("toggle3DView");
                            throw null;
                        }
                        viewGroup.setVisibility(qw0.b0.f148306a[dVar2.ordinal()] == 1 ? 0 : 8);
                        kVar.f138923l.post(new l0.e(21, kVar, dVar2));
                        return Unit.INSTANCE;
                }
            }
        }, i16)));
        View viewFindViewById2 = view2.findViewById(R.id.list_map_provider);
        viewFindViewById2.getClass();
        this.f138919h = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.toggle_3d);
        viewFindViewById3.getClass();
        this.f138920i = (ViewGroup) viewFindViewById3;
        ComposeView composeView = this.f138919h;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("mapProviderListView");
            throw null;
        }
        final int i17 = 2;
        ?? r14 = new e23.l(this) { // from class: po.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f138900b;

            {
                this.f138900b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                k kVar = this.f138900b;
                switch (i18) {
                    case 0:
                        t1 t1Var = (t1) obj;
                        k.a aVar = k.f138917m;
                        t1Var.getClass();
                        h.a aVar2 = kVar.f138918g;
                        if (aVar2 != null) {
                            h hVar = h.this;
                            int i19 = hVar.f138862r1;
                            if (i19 > -1) {
                                c1 c1Var2 = hVar.f138853l1;
                                if (c1Var2 != null) {
                                    c1Var2.f139768e = t1Var;
                                }
                                hVar.E7(hVar.f138863s1, w02.b0.l(i19, hVar.V0));
                            } else {
                                hVar.J7(t1Var);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        h.a aVar3 = kVar.f138918g;
                        if (aVar3 != null) {
                            h hVar2 = h.this;
                            hVar2.G7(iIntValue);
                            String strM7 = hVar2.m7();
                            if (strM7 != null) {
                                hVar2.B1.o(iIntValue, strM7);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                        k.a aVar4 = k.f138917m;
                        dVar2.getClass();
                        dVar2.toString();
                        ViewGroup viewGroup = kVar.f138920i;
                        if (viewGroup == null) {
                            p005kotlin.jvm.internal.s.m("toggle3DView");
                            throw null;
                        }
                        viewGroup.setVisibility(qw0.b0.f148306a[dVar2.ordinal()] == 1 ? 0 : 8);
                        kVar.f138923l.post(new l0.e(21, kVar, dVar2));
                        return Unit.INSTANCE;
                }
            }
        };
        dVar.getClass();
        ArrayList arrayListC = qw0.r.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListC) {
            String str = string;
            if (((qw0.m) obj).f148324a != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX || !z18) {
                arrayList.add(obj);
            }
            string = str;
        }
        String str2 = string;
        composeView.setContent(new z3.e(981375924, true, new qw0.n(arrayList, dVar, r14, 0)));
        if (z0.A(str2) || !z17) {
            ViewGroup viewGroup = this.f138920i;
            if (viewGroup == null) {
                p005kotlin.jvm.internal.s.m("toggle3DView");
                throw null;
            }
            viewGroup.setVisibility(8);
        } else {
            qw0.u uVar = new qw0.u(qw0.v.MAP_3D, z16, true, null, 8, null);
            ViewGroup viewGroup2 = this.f138920i;
            if (viewGroup2 == null) {
                p005kotlin.jvm.internal.s.m("toggle3DView");
                throw null;
            }
            i iVar = new i(this, 1);
            View viewFindViewById4 = viewGroup2.findViewById(R.id.text_view);
            viewFindViewById4.getClass();
            TextView textView = (TextView) viewFindViewById4;
            View viewFindViewById5 = viewGroup2.findViewById(R.id.switch_view);
            viewFindViewById5.getClass();
            SwitchCompat switchCompat = (SwitchCompat) viewFindViewById5;
            Integer num = uVar.f148351d;
            if (num != null) {
                charSequenceA = viewGroup2.getContext().getText(num.intValue());
                if (charSequenceA == null) {
                    Context context = viewGroup2.getContext();
                    context.getClass();
                    charSequenceA = dh.b.A(context, uVar.f148348a.f148365a);
                }
            } else {
                Context context2 = viewGroup2.getContext();
                context2.getClass();
                charSequenceA = dh.b.A(context2, uVar.f148348a.f148365a);
            }
            textView.setText(charSequenceA);
            boolean z19 = uVar.f148350c;
            textView.setEnabled(z19);
            textView.setOnClickListener(new ou.d(switchCompat, 2));
            switchCompat.setChecked(uVar.f148349b);
            switchCompat.setEnabled(z19);
            switchCompat.setContentDescription(charSequenceA);
            switchCompat.setOnCheckedChangeListener(new bl0.b(12, iVar, uVar));
            ViewGroup viewGroup3 = this.f138920i;
            if (viewGroup3 == null) {
                p005kotlin.jvm.internal.s.m("toggle3DView");
                throw null;
            }
            viewGroup3.setVisibility(qw0.b0.f148306a[dVar.ordinal()] == 1 ? 0 : 8);
        }
        TextView textView2 = (TextView) view2.findViewById(R.id.map_details_tv);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.map_switches_rv);
        if (listB1.isEmpty()) {
            textView2.getClass();
            textView2.setVisibility(8);
            recyclerView.getClass();
            recyclerView.setVisibility(8);
            Unit unit = Unit.INSTANCE;
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(true);
            if (listB1.size() == 1) {
                recyclerView.setAdapter(new a0(listB1, new i(this, 2)));
            } else {
                ArrayList arrayList2 = new ArrayList();
                String string2 = getString(R.string.lbl_none);
                if (listB1.isEmpty()) {
                    z14 = true;
                    break;
                }
                Iterator it = listB1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((qw0.u) it.next()).f148349b) {
                            z14 = false;
                            break;
                        }
                    } else {
                        z14 = true;
                        break;
                    }
                }
                arrayList2.add(new r22.t1("NONE", null, null, string2, null, false, z14, null, false, null, 950, null));
                ArrayList arrayList3 = new ArrayList(p13.y.r(listB1, 10));
                for (qw0.u uVar2 : listB1) {
                    String strName = uVar2.f148348a.name();
                    Integer num2 = uVar2.f148351d;
                    arrayList3.add(new r22.t1(strName, null, null, dh.b.B(this, num2 != null ? c22.i.b(num2.intValue()) : uVar2.f148348a.f148365a), null, false, uVar2.f148349b, null, false, null, 950, null));
                }
                arrayList2.addAll(arrayList3);
                u1 u1Var = new u1(new nw0.p(arrayList2, 28, listB1, this));
                u1Var.D(arrayList2);
                u1Var.f149752e = new p40.h(22);
                recyclerView.setAdapter(u1Var);
            }
        }
        TextView textView3 = (TextView) view2.findViewById(R.id.activity_highlights_tv);
        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.activity_highlights_switches_rv);
        if (listB2.isEmpty()) {
            textView3.getClass();
            textView3.setVisibility(8);
            recyclerView2.getClass();
            recyclerView2.setVisibility(8);
            Unit unit2 = Unit.INSTANCE;
        } else {
            textView3.getClass();
            textView3.setVisibility(0);
            recyclerView2.getClass();
            recyclerView2.setVisibility(0);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setAdapter(new a0(listB2, new i(this, 0)));
        }
        View viewFindViewById6 = view2.findViewById(R.id.data_overlay_tv);
        viewFindViewById6.getClass();
        this.f138921j = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.metrics_rv);
        viewFindViewById7.getClass();
        this.f138922k = (RecyclerView) viewFindViewById7;
        if (c1Var.d()) {
            RecyclerView recyclerView3 = this.f138922k;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("dataOverlayRecyclerView");
                throw null;
            }
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            recyclerView3.setHasFixedSize(true);
            final int i18 = 0;
            recyclerView3.setAdapter(new b0(c1Var, new e23.l(this) { // from class: po.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f138900b;

                {
                    this.f138900b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj2) {
                    int i19 = i18;
                    k kVar = this.f138900b;
                    switch (i19) {
                        case 0:
                            t1 t1Var = (t1) obj2;
                            k.a aVar = k.f138917m;
                            t1Var.getClass();
                            h.a aVar2 = kVar.f138918g;
                            if (aVar2 != null) {
                                h hVar = h.this;
                                int i110 = hVar.f138862r1;
                                if (i110 > -1) {
                                    c1 c1Var2 = hVar.f138853l1;
                                    if (c1Var2 != null) {
                                        c1Var2.f139768e = t1Var;
                                    }
                                    hVar.E7(hVar.f138863s1, w02.b0.l(i110, hVar.V0));
                                } else {
                                    hVar.J7(t1Var);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            int iIntValue = ((Integer) obj2).intValue();
                            h.a aVar3 = kVar.f138918g;
                            if (aVar3 != null) {
                                h hVar2 = h.this;
                                hVar2.G7(iIntValue);
                                String strM7 = hVar2.m7();
                                if (strM7 != null) {
                                    hVar2.B1.o(iIntValue, strM7);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) obj2;
                            k.a aVar4 = k.f138917m;
                            dVar2.getClass();
                            dVar2.toString();
                            ViewGroup viewGroup4 = kVar.f138920i;
                            if (viewGroup4 == null) {
                                p005kotlin.jvm.internal.s.m("toggle3DView");
                                throw null;
                            }
                            viewGroup4.setVisibility(qw0.b0.f148306a[dVar2.ordinal()] == 1 ? 0 : 8);
                            kVar.f138923l.post(new l0.e(21, kVar, dVar2));
                            return Unit.INSTANCE;
                    }
                }
            }));
            return;
        }
        TextView textView4 = this.f138921j;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("dataOverlayTextView");
            throw null;
        }
        textView4.setVisibility(8);
        RecyclerView recyclerView4 = this.f138922k;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("dataOverlayRecyclerView");
            throw null;
        }
        recyclerView4.setVisibility(8);
        Unit unit3 = Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.lbl_map_settings);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lpo/k$a;", "", "<init>", "()V", "", "MAP_TYPE", "Ljava/lang/String;", "MAP_PROVIDER", "LIST_DISTANCE_MARKERS_SWITCH_CONFIGURATIONS", "LIST_ACTIVITY_HIGHLIGHTS_SWITCH_CONFIGURATIONS", "METRIC_TRACK_LOGS", "IS_3D_ENABLED", "SHOW_TERRAIN_TYPE", "IS_HEAT_MAP", "ACTIVITY_TYPE_KEY", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
