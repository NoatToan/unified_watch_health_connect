package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import am.x0;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMCustomViewPager;
import com.garmin.android.apps.connectmobile.z1;
import e23.l;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import ps.d1;
import yo.z;
import zo.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29337i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29338j = f.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap.d f29339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMCustomViewPager f29340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f29341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f29342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f29343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29346h = -1;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29347a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.NEXT_LEG_REMOVAL_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.CURRENT_LEG_REMOVAL_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.LEG_REMOVAL_BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29347a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/f$c", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.menu_done, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(true);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            m activity = f.this.getActivity();
            MultisportEditLegsActivity multisportEditLegsActivity = activity instanceof MultisportEditLegsActivity ? (MultisportEditLegsActivity) activity : null;
            if (multisportEditLegsActivity != null) {
                multisportEditLegsActivity.ca(true);
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29349a;

        public d(l lVar) {
            lVar.getClass();
            this.f29349a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29349a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29349a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.multisport_legs_pager_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.leg_number_text_view);
        viewFindViewById.getClass();
        this.f29342d = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.previous_leg_button);
        viewFindViewById2.getClass();
        this.f29343e = (Button) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.next_leg_button);
        viewFindViewById3.getClass();
        this.f29344f = (Button) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.leg_view_pager);
        viewFindViewById4.getClass();
        GCMCustomViewPager gCMCustomViewPager = (GCMCustomViewPager) viewFindViewById4;
        this.f29340b = gCMCustomViewPager;
        gCMCustomViewPager.setPagingEnabled(false);
        GCMCustomViewPager gCMCustomViewPager2 = this.f29340b;
        if (gCMCustomViewPager2 == null) {
            p005kotlin.jvm.internal.s.m("viewPager");
            throw null;
        }
        gCMCustomViewPager2.c(new o(this));
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        e eVar = new e(childFragmentManager);
        this.f29341c = eVar;
        GCMCustomViewPager gCMCustomViewPager3 = this.f29340b;
        if (gCMCustomViewPager3 == null) {
            p005kotlin.jvm.internal.s.m("viewPager");
            throw null;
        }
        gCMCustomViewPager3.setAdapter(eVar);
        m activity = getActivity();
        if (activity != null) {
            z1 z1Var = activity instanceof z1 ? (z1) activity : null;
            if (z1Var != null) {
                z1Var.setTitle(R.string.multisport_edit_leg_title);
            }
            ap.d dVar = (ap.d) new x1(activity).b(s0.f105811a.b(ap.d.class));
            this.f29339a = dVar;
            w0 w0Var = new w0();
            w0Var.n(dVar.f11593e.f198239i, new ap.d.c(new ap.a(dVar, w0Var, 0)));
            w0Var.n(dVar.f11597i, new ap.d.c(new ap.a(dVar, w0Var, 1)));
            final int i14 = 0;
            w0Var.f(getViewLifecycleOwner(), new d(new l(this) { // from class: zo.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f f206059b;

                {
                    this.f206059b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    c3 c3VarB;
                    String string;
                    String string2;
                    int i15 = i14;
                    final com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = this.f206059b;
                    char c14 = 1;
                    final int i16 = 0;
                    switch (i15) {
                        case 0:
                            o13.p pVar = (o13.p) obj;
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29337i;
                            List<d1> list = (List) pVar.f128594a;
                            int iIntValue = ((Number) pVar.f128595b).intValue();
                            if (iIntValue != -1) {
                                fVar.f29345g = list.size();
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.e eVar2 = fVar.f29341c;
                                if (eVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("pagerAdapter");
                                    throw null;
                                }
                                eVar2.f29336h = list;
                                eVar2.notifyDataSetChanged();
                                fVar.v6(iIntValue);
                                fVar.u6(iIntValue);
                                GCMCustomViewPager gCMCustomViewPager4 = fVar.f29340b;
                                if (gCMCustomViewPager4 == null) {
                                    p005kotlin.jvm.internal.s.m("viewPager");
                                    throw null;
                                }
                                gCMCustomViewPager4.C(iIntValue, fVar.f29346h != -1);
                                fVar.f29346h = iIntValue;
                            }
                            return Unit.INSTANCE;
                        default:
                            vo.e eVar3 = (vo.e) obj;
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29337i;
                            g22.e.f(fVar);
                            if (eVar3 != null) {
                                Context contextRequireContext = fVar.requireContext();
                                contextRequireContext.getClass();
                                x0 x0Var = eVar3.f178999e;
                                z zVar = eVar3.f178995a;
                                if (x0Var == null || (c3VarB = x0Var.f4360c) == null) {
                                    c3VarB = c22.i.b(R.string.no_value);
                                }
                                String strA = dh.b.A(contextRequireContext, c3VarB);
                                String string3 = fVar.getString(eVar3.f178996b == yo.p.TIME ? R.string.txt_duration : R.string.lbl_distance);
                                string3.getClass();
                                String strE = g22.n.e(string3);
                                int[] iArr = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.b.f29347a;
                                int i17 = iArr[zVar.ordinal()];
                                if (i17 == 1) {
                                    string = fVar.getString(R.string.no_value);
                                } else if (i17 == 2 || i17 == 3) {
                                    string = fVar.getString(R.string.delete_next_leg_title, strA);
                                } else {
                                    if (i17 != 4) {
                                        u0.r();
                                        return null;
                                    }
                                    string = fVar.getString(R.string.multisport_edit_leg_blocked_title);
                                }
                                string.getClass();
                                int i18 = iArr[zVar.ordinal()];
                                if (i18 == 1) {
                                    string2 = fVar.getString(R.string.no_value);
                                } else if (i18 == 2 || i18 == 3) {
                                    string2 = fVar.getString(R.string.delete_next_leg_message_v4, strE, strA);
                                } else {
                                    if (i18 != 4) {
                                        u0.r();
                                        return null;
                                    }
                                    string2 = fVar.getString(R.string.multisport_edit_leg_blocked_message);
                                }
                                string2.getClass();
                                androidx.fragment.app.m activity2 = fVar.getActivity();
                                if (activity2 != null) {
                                    if (zVar == z.LEG_REMOVAL_BLOCKED) {
                                        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(activity2).setTitle(string).setMessage(string2).setCancelable(false).setNeutralButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: zo.n
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                                switch (i16) {
                                                    case 0:
                                                        ap.d dVar2 = fVar.f29339a;
                                                        if (dVar2 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar4 = dVar2.f11593e;
                                                        eVar4.f198241k.j(null);
                                                        y0<List<d1>> y0Var = eVar4.f198239i;
                                                        y0Var.j(y0Var.d());
                                                        return;
                                                    default:
                                                        ap.d dVar3 = fVar.f29339a;
                                                        if (dVar3 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar5 = dVar3.f11593e;
                                                        eVar5.f198241k.j(null);
                                                        y0<List<d1>> y0Var2 = eVar5.f198239i;
                                                        y0Var2.j(y0Var2.d());
                                                        return;
                                                }
                                            }
                                        }).show();
                                        eVarShow.getClass();
                                        oe2.f.X(eVarShow);
                                    } else {
                                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(activity2).setTitle(string).setMessage(string2).setCancelable(false).setPositiveButton(R.string.lbl_common_remove, new wq.c(12, fVar, eVar3));
                                        final char c15 = c14 == true ? 1 : 0;
                                        androidx.appcompat.app.e eVarShow2 = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: zo.n
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                                switch (c15) {
                                                    case 0:
                                                        ap.d dVar2 = fVar.f29339a;
                                                        if (dVar2 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar4 = dVar2.f11593e;
                                                        eVar4.f198241k.j(null);
                                                        y0<List<d1>> y0Var = eVar4.f198239i;
                                                        y0Var.j(y0Var.d());
                                                        return;
                                                    default:
                                                        ap.d dVar3 = fVar.f29339a;
                                                        if (dVar3 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar5 = dVar3.f11593e;
                                                        eVar5.f198241k.j(null);
                                                        y0<List<d1>> y0Var2 = eVar5.f198239i;
                                                        y0Var2.j(y0Var2.d());
                                                        return;
                                                }
                                            }
                                        }).show();
                                        eVarShow2.getClass();
                                        oe2.f.X(eVarShow2);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            ap.d dVar2 = this.f29339a;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            final int i15 = 1;
            dVar2.f11593e.f198241k.f(getViewLifecycleOwner(), new d(new l(this) { // from class: zo.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f f206059b;

                {
                    this.f206059b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    c3 c3VarB;
                    String string;
                    String string2;
                    int i16 = i15;
                    final com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = this.f206059b;
                    char c14 = 1;
                    final int i17 = 0;
                    switch (i16) {
                        case 0:
                            o13.p pVar = (o13.p) obj;
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29337i;
                            List<d1> list = (List) pVar.f128594a;
                            int iIntValue = ((Number) pVar.f128595b).intValue();
                            if (iIntValue != -1) {
                                fVar.f29345g = list.size();
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.e eVar2 = fVar.f29341c;
                                if (eVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("pagerAdapter");
                                    throw null;
                                }
                                eVar2.f29336h = list;
                                eVar2.notifyDataSetChanged();
                                fVar.v6(iIntValue);
                                fVar.u6(iIntValue);
                                GCMCustomViewPager gCMCustomViewPager4 = fVar.f29340b;
                                if (gCMCustomViewPager4 == null) {
                                    p005kotlin.jvm.internal.s.m("viewPager");
                                    throw null;
                                }
                                gCMCustomViewPager4.C(iIntValue, fVar.f29346h != -1);
                                fVar.f29346h = iIntValue;
                            }
                            return Unit.INSTANCE;
                        default:
                            vo.e eVar3 = (vo.e) obj;
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.f29337i;
                            g22.e.f(fVar);
                            if (eVar3 != null) {
                                Context contextRequireContext = fVar.requireContext();
                                contextRequireContext.getClass();
                                x0 x0Var = eVar3.f178999e;
                                z zVar = eVar3.f178995a;
                                if (x0Var == null || (c3VarB = x0Var.f4360c) == null) {
                                    c3VarB = c22.i.b(R.string.no_value);
                                }
                                String strA = dh.b.A(contextRequireContext, c3VarB);
                                String string3 = fVar.getString(eVar3.f178996b == yo.p.TIME ? R.string.txt_duration : R.string.lbl_distance);
                                string3.getClass();
                                String strE = g22.n.e(string3);
                                int[] iArr = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f.b.f29347a;
                                int i18 = iArr[zVar.ordinal()];
                                if (i18 == 1) {
                                    string = fVar.getString(R.string.no_value);
                                } else if (i18 == 2 || i18 == 3) {
                                    string = fVar.getString(R.string.delete_next_leg_title, strA);
                                } else {
                                    if (i18 != 4) {
                                        u0.r();
                                        return null;
                                    }
                                    string = fVar.getString(R.string.multisport_edit_leg_blocked_title);
                                }
                                string.getClass();
                                int i19 = iArr[zVar.ordinal()];
                                if (i19 == 1) {
                                    string2 = fVar.getString(R.string.no_value);
                                } else if (i19 == 2 || i19 == 3) {
                                    string2 = fVar.getString(R.string.delete_next_leg_message_v4, strE, strA);
                                } else {
                                    if (i19 != 4) {
                                        u0.r();
                                        return null;
                                    }
                                    string2 = fVar.getString(R.string.multisport_edit_leg_blocked_message);
                                }
                                string2.getClass();
                                androidx.fragment.app.m activity2 = fVar.getActivity();
                                if (activity2 != null) {
                                    if (zVar == z.LEG_REMOVAL_BLOCKED) {
                                        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(activity2).setTitle(string).setMessage(string2).setCancelable(false).setNeutralButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: zo.n
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                                switch (i17) {
                                                    case 0:
                                                        ap.d dVar3 = fVar.f29339a;
                                                        if (dVar3 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar4 = dVar3.f11593e;
                                                        eVar4.f198241k.j(null);
                                                        y0<List<d1>> y0Var = eVar4.f198239i;
                                                        y0Var.j(y0Var.d());
                                                        return;
                                                    default:
                                                        ap.d dVar4 = fVar.f29339a;
                                                        if (dVar4 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar5 = dVar4.f11593e;
                                                        eVar5.f198241k.j(null);
                                                        y0<List<d1>> y0Var2 = eVar5.f198239i;
                                                        y0Var2.j(y0Var2.d());
                                                        return;
                                                }
                                            }
                                        }).show();
                                        eVarShow.getClass();
                                        oe2.f.X(eVarShow);
                                    } else {
                                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(activity2).setTitle(string).setMessage(string2).setCancelable(false).setPositiveButton(R.string.lbl_common_remove, new wq.c(12, fVar, eVar3));
                                        final int c15 = c14 == true ? 1 : 0;
                                        androidx.appcompat.app.e eVarShow2 = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: zo.n
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                                switch (c15) {
                                                    case 0:
                                                        ap.d dVar3 = fVar.f29339a;
                                                        if (dVar3 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar4 = dVar3.f11593e;
                                                        eVar4.f198241k.j(null);
                                                        y0<List<d1>> y0Var = eVar4.f198239i;
                                                        y0Var.j(y0Var.d());
                                                        return;
                                                    default:
                                                        ap.d dVar4 = fVar.f29339a;
                                                        if (dVar4 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        yo.e eVar5 = dVar4.f11593e;
                                                        eVar5.f198241k.j(null);
                                                        y0<List<d1>> y0Var2 = eVar5.f198239i;
                                                        y0Var2.j(y0Var2.d());
                                                        return;
                                                }
                                            }
                                        }).show();
                                        eVarShow2.getClass();
                                        oe2.f.X(eVarShow2);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        Button button = this.f29343e;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("prevButton");
            throw null;
        }
        final int i16 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: zo.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f f206061b;

            {
                this.f206061b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = this.f206061b;
                        ap.d dVar3 = fVar.f29339a;
                        if (dVar3 != null) {
                            dVar3.A4(fVar.f29346h - 1);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar2 = this.f206061b;
                        ap.d dVar4 = fVar2.f29339a;
                        if (dVar4 != null) {
                            dVar4.A4(fVar2.f29346h + 1);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                }
            }
        });
        Button button2 = this.f29344f;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        final int i17 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: zo.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f f206061b;

            {
                this.f206061b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar = this.f206061b;
                        ap.d dVar3 = fVar.f29339a;
                        if (dVar3 != null) {
                            dVar3.A4(fVar.f29346h - 1);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.f fVar2 = this.f206061b;
                        ap.d dVar4 = fVar2.f29339a;
                        if (dVar4 != null) {
                            dVar4.A4(fVar2.f29346h + 1);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                }
            }
        });
    }

    public final void u6(int i14) {
        if (i14 == 0) {
            Button button = this.f29343e;
            if (button == null) {
                p005kotlin.jvm.internal.s.m("prevButton");
                throw null;
            }
            button.setEnabled(false);
            Button button2 = this.f29344f;
            if (button2 != null) {
                button2.setEnabled(true);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        int i15 = this.f29345g - 1;
        Button button3 = this.f29343e;
        if (i14 == i15) {
            if (button3 == null) {
                p005kotlin.jvm.internal.s.m("prevButton");
                throw null;
            }
            button3.setEnabled(true);
            Button button4 = this.f29344f;
            if (button4 != null) {
                button4.setEnabled(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        if (button3 == null) {
            p005kotlin.jvm.internal.s.m("prevButton");
            throw null;
        }
        button3.setEnabled(true);
        Button button5 = this.f29344f;
        if (button5 != null) {
            button5.setEnabled(true);
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
    }

    public final void v6(int i14) {
        if (isAdded()) {
            TextView textView = this.f29342d;
            if (textView != null) {
                textView.setText(requireActivity().getString(R.string.lbl_value1_of_value2, String.valueOf(i14 + 1), String.valueOf(this.f29345g)));
            } else {
                p005kotlin.jvm.internal.s.m("legIndicator");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/f$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
