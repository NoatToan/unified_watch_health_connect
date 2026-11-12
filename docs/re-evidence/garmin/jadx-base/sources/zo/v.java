package zo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v1;
import aq.r2;
import aq.u2;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import p005kotlin.Unit;
import po.f0;
import ps.d1;
import u1.y1;
import yr.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k f206077b;

    public /* synthetic */ v(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar, int i14) {
        this.f206076a = i14;
        this.f206077b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.Throwable] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        uo.b bVar;
        BubbleLayout bubbleLayout;
        BubbleLayout bubbleLayout2;
        int i14 = this.f206076a;
        int i15 = 6;
        boolean z14 = true;
        ViewGroup viewGroup = null;
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar = this.f206077b;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                int i16 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                fw.p pVar = mVar.f73769b;
                if (pVar == fw.p.SUCCESS) {
                    Object obj2 = mVar.f73770c;
                    if (kVar.f29373b == null) {
                        p005kotlin.jvm.internal.s.m("restoreActivityViewModel");
                        throw null;
                    }
                    List<? extends Object> list = (obj2 == null || !(obj2 instanceof List)) ? null : (List) obj2;
                    if (list != null) {
                        g22.e.l(kVar);
                        u2 u2Var = kVar.f29373b;
                        if (u2Var == null) {
                            p005kotlin.jvm.internal.s.m("restoreActivityViewModel");
                            throw null;
                        }
                        u2Var.f12261c.f(kVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.d(new v(kVar, 1)));
                        u2 u2Var2 = kVar.f29373b;
                        if (u2Var2 == null) {
                            p005kotlin.jvm.internal.s.m("restoreActivityViewModel");
                            throw null;
                        }
                        ge1.b.T(v1.a(u2Var2), null, null, new r2(u2Var2, null), 3);
                        u2 u2Var3 = kVar.f29373b;
                        if (u2Var3 == null) {
                            p005kotlin.jvm.internal.s.m("restoreActivityViewModel");
                            throw null;
                        }
                        u2Var3.f12264f.f(kVar.getViewLifecycleOwner(), new w(kVar, 0));
                        u2 u2Var4 = kVar.f29373b;
                        if (u2Var4 == null) {
                            p005kotlin.jvm.internal.s.m("restoreActivityViewModel");
                            throw null;
                        }
                        u2Var4.y4(list);
                    }
                } else if (pVar == fw.p.ERROR) {
                    com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.u6(kVar, R.string.activities_trim_failed, R.string.activities_trim_error_message, 12);
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.u6(kVar, R.string.lbl_changes_pending, R.string.lbl_activity_edits_timeout, 8);
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                int i17 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    uo.b bVar2 = kVar.f29378g;
                    int i18 = 2;
                    if (bVar2 != null) {
                        View view2 = bVar2.f172070a;
                        View viewInflate = LayoutInflater.from(view2.getContext()).inflate(R.layout.view_tooltip, (ViewGroup) null);
                        viewInflate.getClass();
                        BubbleLayout bubbleLayout3 = (BubbleLayout) viewInflate;
                        ((TextView) bubbleLayout3.findViewById(R.id.tool_tip_label)).setText(R.string.lbl_multisport_leg_tooltip);
                        bubbleLayout3.setFocusable(false);
                        bubbleLayout3.setOnClickListener(new t61.m(bVar2, 20));
                        uj.a aVar = uj.a.BOTTOM;
                        bubbleLayout3.b();
                        bubbleLayout3.f28579a = aVar;
                        bubbleLayout3.a();
                        bubbleLayout3.setLayoutParams(new ConstraintLayout.b(-2, -2));
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.g(bubbleLayout3.getId(), 4, 0, 3);
                        dVar.g(bubbleLayout3.getId(), 6, 0, 6);
                        ConstraintLayout constraintLayout = view2 instanceof ConstraintLayout ? (ConstraintLayout) view2 : null;
                        if (constraintLayout != null) {
                            dVar.b(constraintLayout);
                            constraintLayout.addView(bubbleLayout3);
                        }
                        bubbleLayout3.measure(0, 0);
                        bubbleLayout3.setTranslationY(-(bubbleLayout3.getMeasuredHeight() / 2));
                        Resources resources = bubbleLayout3.getResources();
                        resources.getClass();
                        bubbleLayout3.setTranslationX(xy2.b.n(resources, 8.0f));
                        bVar2.f172077h = bubbleLayout3;
                    }
                    Snackbar snackbarMake = Snackbar.make(kVar.requireView(), R.string.lbl_activity_converted_to_multisport, 6000);
                    snackbarMake.getClass();
                    snackbarMake.setAction(R.string.activities_restore_activity, new u(kVar, i18));
                    v22.c.a(snackbarMake);
                    snackbarMake.show();
                    ap.d dVar2 = kVar.f29372a;
                    if (dVar2 == null) {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                    dVar2.f11598j.m(null);
                    dVar2.f11599k = true;
                } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE) && (bVar = kVar.f29378g) != null && (bubbleLayout = bVar.f172077h) != null && bubbleLayout.getVisibility() == 0 && (bubbleLayout2 = bVar.f172077h) != null) {
                    bubbleLayout2.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 3:
                Boolean bool2 = (Boolean) obj;
                View view3 = kVar.f29379h;
                if (view3 == null) {
                    p005kotlin.jvm.internal.s.m("mapContainer");
                    throw null;
                }
                bool2.getClass();
                v22.e.r(view3, bool2.booleanValue());
                return Unit.INSTANCE;
            case 4:
                List<d1> list2 = (List) obj;
                int i19 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                if (list2 == null) {
                    return Unit.INSTANCE;
                }
                if (list2.isEmpty()) {
                    g22.e.a(kVar, new fw.g());
                    kVar.requireActivity().setResult(-1);
                    kVar.requireActivity().finish();
                } else {
                    ConstraintLayout constraintLayout2 = kVar.f29375d;
                    if (constraintLayout2 == null) {
                        p005kotlin.jvm.internal.s.m("contentContainer");
                        throw null;
                    }
                    constraintLayout2.setVisibility(0);
                    androidx.fragment.app.m activity = kVar.getActivity();
                    z1 z1Var = activity instanceof z1 ? (z1) activity : null;
                    if (z1Var != null) {
                        z1Var.hideProgressOverlay();
                    }
                    if (kVar.isAdded()) {
                        ap.d dVar3 = kVar.f29372a;
                        if (dVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = dVar3.f11602n;
                        if (hVar != null) {
                            f0 f0Var = kVar.f29376e;
                            if (f0Var != null) {
                                f0Var.f138836n = list2;
                                if (f0Var.isResumed()) {
                                    f0Var.A6();
                                }
                            } else {
                                f0.f138835p.getClass();
                                Bundle bundle = new Bundle(3);
                                bundle.putLong("GCM_extra_activity_id", hVar.f29448a);
                                bundle.putParcelable("GCM_extra_activity_summary", hVar);
                                bundle.putParcelableArray("extra_multisport_legs", (Parcelable[]) list2.toArray(new d1[0]));
                                f0 f0Var2 = new f0();
                                f0Var2.setArguments(bundle);
                                kVar.f29376e = f0Var2;
                                f0Var2.f138837o = new o0(kVar, 22);
                                androidx.fragment.app.v childFragmentManager = kVar.getChildFragmentManager();
                                androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
                                f0 f0Var3 = kVar.f29376e;
                                if (f0Var3 == null) {
                                    p005kotlin.jvm.internal.s.m("multisportMap");
                                    throw null;
                                }
                                aVarB.l(R.id.multisport_map_preview_container, f0Var3, null);
                                aVarB.e();
                            }
                        }
                        LinearLayout linearLayout = kVar.f29374c;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("legsContainer");
                            throw null;
                        }
                        linearLayout.removeAllViews();
                        int size = list2.size();
                        int i24 = 0;
                        while (i24 < size) {
                            View viewInflate2 = View.inflate(kVar.requireActivity(), R.layout.multisport_leg_list_item, viewGroup);
                            viewInflate2.getClass();
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate2;
                            uo.b bVar3 = new uo.b(constraintLayout3, z14);
                            if (i24 == z14) {
                                kVar.f29378g = bVar3;
                            }
                            uo.c cVar = new uo.c(list2.get(i24), i24, new v(kVar, i15));
                            d1 d1Var = cVar.f172078a;
                            ImageView imageView = bVar3.f172072c;
                            if (imageView != null) {
                                imageView.setImageResource(d1Var.f139790f.f4361d);
                            }
                            TextView textView = bVar3.f172073d;
                            if (textView != null) {
                                Context context = textView.getContext();
                                context.getClass();
                                textView.setText(dh.b.A(context, d1Var.f139790f.f4360c));
                            }
                            TextView textView2 = bVar3.f172074e;
                            if (textView2 != null) {
                                textView2.setText(d1Var.f139794j);
                            }
                            View view4 = bVar3.f172070a;
                            if (textView2 != null) {
                                String str = d1Var.f139794j;
                                Context context2 = view4.getContext();
                                context2.getClass();
                                textView2.setContentDescription(oi0.c.A(context2, new y1(16), str));
                            }
                            TextView textView3 = bVar3.f172075f;
                            if (textView3 != null) {
                                textView3.setText(d1Var.f139795k);
                            }
                            ImageView imageView2 = bVar3.f172076g;
                            if (imageView2 != null) {
                                v22.e.v(imageView2, !bVar3.f172071b && d1Var.f139791g);
                            }
                            view4.setOnClickListener(new t61.m(cVar, 19));
                            LinearLayout linearLayout2 = kVar.f29374c;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("legsContainer");
                                throw viewGroup;
                            }
                            linearLayout2.addView(constraintLayout3);
                            i24++;
                            viewGroup = viewGroup;
                            i15 = 6;
                            z14 = true;
                        }
                        ?? r16 = viewGroup;
                        ap.d dVar4 = kVar.f29372a;
                        if (dVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw r16;
                        }
                        if (dVar4.f11590b == k.CONVERT_TO_MULTISPORT && !dVar4.f11599k) {
                            dVar4.f11598j.m(Boolean.TRUE);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Boolean bool3 = (Boolean) obj;
                Button button = kVar.f29377f;
                if (button == null) {
                    p005kotlin.jvm.internal.s.m("saveButton");
                    throw null;
                }
                bool3.getClass();
                button.setEnabled(bool3.booleanValue());
                return Unit.INSTANCE;
            default:
                int iIntValue = ((Integer) obj).intValue();
                ap.d dVar5 = kVar.f29372a;
                if (dVar5 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                dVar5.A4(iIntValue);
                androidx.fragment.app.v supportFragmentManager = kVar.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f();
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29337i.getClass();
                String str2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29338j;
                aVar2.l(R.id.multisport_content_frame, fVar, str2);
                aVar2.d(str2);
                aVar2.e();
                return Unit.INSTANCE;
        }
    }
}
