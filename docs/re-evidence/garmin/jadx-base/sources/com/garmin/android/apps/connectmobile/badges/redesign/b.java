package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.redesign.ConnectionsWithBadgeActivity;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import o53.m1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import r53.p2;
import r53.q2;
import ty1.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/p;", "connections", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {
    public static final a X = new a(null);
    public static final float Y;
    public Bitmap A;
    public m1 B;
    public boolean C;
    public bq0.l D;
    public FlexboxLayout E;
    public final bv.d F = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
    public final ru.d I = (ru.d) KoinJavaComponent.get$default(ru.d.class, null, null, 6, null);
    public final p2 P = q2.a(new ArrayList());
    public int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f30401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f30402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f30403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f30404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f30411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f30412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f30413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f30414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem f30415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f30416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f30417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f30418r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ComposeView f30419t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f30420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f30421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f30422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f30423y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0478b f30424z;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.redesign.b$b, reason: collision with other inner class name */
    public interface InterfaceC0478b {
        void M1(Uri uri);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/b$c", "Landroidx/core/view/s;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.badge_details_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.badge_share);
            b bVar = b.this;
            m mVar = bVar.f30401a;
            bVar.f30415o = menuItemFindItem.setVisible(mVar != null && mVar.getIsBadgeEarned()).setEnabled(bVar.A != null);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.badge_share) {
                return false;
            }
            b bVar = b.this;
            if (bVar.A == null) {
                return true;
            }
            j22.b.f96736a.getClass();
            if (j22.b.d()) {
                bVar.u6();
                return true;
            }
            androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
            mVarRequireActivity.getClass();
            j22.a aVar = j22.a.f96722k;
            if (j22.b.C(mVarRequireActivity, aVar)) {
                new androidx.appcompat.app.e.a(bVar.requireContext()).setMessage(j22.b.f(aVar)).setPositiveButton(R.string.lbl_ok, new sa2.b(bVar, 11)).setNegativeButton(R.string.lbl_cancel, new o(21)).setCancelable(false).create().show();
                return true;
            }
            j22.b.z(bVar, 3, aVar);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30426a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f30426a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30426a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30426a.invoke(obj);
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        Y = 48;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m mVar = this.f30401a;
        if (mVar != null) {
            ge1.b.T(g22.f.b(this), null, null, new uu.g(mVar, this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f30424z = (InterfaceC0478b) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, InterfaceC0478b.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.C = arguments.getBoolean("GCM_extra_badge_navigation_from_activity", false);
        }
        this.D = (bq0.l) new x1(this).a(bq0.l.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_badge_details_redesign, viewGroup, false);
        this.f30403c = viewInflate;
        this.f30404d = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.badge_image) : null;
        View view2 = this.f30403c;
        this.f30405e = view2 != null ? (TextView) view2.findViewById(R.id.badge_name) : null;
        View view3 = this.f30403c;
        this.f30406f = view3 != null ? (TextView) view3.findViewById(R.id.badge_description) : null;
        View view4 = this.f30403c;
        this.f30407g = view4 != null ? (TextView) view4.findViewById(R.id.multiple_badge_point) : null;
        View view5 = this.f30403c;
        this.E = view5 != null ? (FlexboxLayout) view5.findViewById(R.id.badge_tag_container) : null;
        View view6 = this.f30403c;
        this.f30410j = view6 != null ? (TextView) view6.findViewById(R.id.badge_special) : null;
        View view7 = this.f30403c;
        this.f30408h = view7 != null ? (TextView) view7.findViewById(R.id.badge_special_1) : null;
        View view8 = this.f30403c;
        this.f30409i = view8 != null ? (TextView) view8.findViewById(R.id.badge_special_2) : null;
        View view9 = this.f30403c;
        TextView textView = view9 != null ? (TextView) view9.findViewById(R.id.badge_special_3) : null;
        this.f30411k = textView;
        if (textView != null) {
            textView.setText(getString(R.string.lbl_garmin_connect_plus));
        }
        View view10 = this.f30403c;
        this.f30412l = view10 != null ? (ProgressBar) view10.findViewById(R.id.badge_progress) : null;
        View view11 = this.f30403c;
        this.f30413m = view11 != null ? (TextView) view11.findViewById(R.id.badge_progress_description) : null;
        View view12 = this.f30403c;
        this.f30414n = view12 != null ? (TextView) view12.findViewById(R.id.badge_earned_description) : null;
        View view13 = this.f30403c;
        this.f30416p = view13 != null ? (LinearLayout) view13.findViewById(R.id.related_badges_section) : null;
        View view14 = this.f30403c;
        this.f30417q = view14 != null ? (RecyclerView) view14.findViewById(R.id.related_badges) : null;
        View view15 = this.f30403c;
        TextView textView2 = view15 != null ? (TextView) view15.findViewById(R.id.connections_with_badge_section_label) : null;
        if (textView2 != null) {
            textView2.setText(getString(R.string.badges_followings_with_badge));
        }
        View view16 = this.f30403c;
        this.f30418r = view16 != null ? (LinearLayout) view16.findViewById(R.id.connections_with_badge_section_container) : null;
        View view17 = this.f30403c;
        this.f30419t = view17 != null ? (ComposeView) view17.findViewById(R.id.connections_with_badge_list) : null;
        View view18 = this.f30403c;
        TextView textView3 = view18 != null ? (TextView) view18.findViewById(R.id.connections_with_badge_section_empty_text) : null;
        this.f30420v = textView3;
        if (textView3 != null) {
            textView3.setText(getString(R.string.badges_no_followings_earned));
        }
        View view19 = this.f30403c;
        this.f30421w = view19 != null ? view19.findViewById(R.id.more_connections_count_container) : null;
        View view20 = this.f30403c;
        this.f30422x = view20 != null ? (TextView) view20.findViewById(R.id.more_connections_count) : null;
        View view21 = this.f30403c;
        this.f30423y = view21 != null ? (TextView) view21.findViewById(R.id.available_date_range) : null;
        return this.f30403c;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.BADGES;
        aVar.getClass();
        i2.a.b(a2Var, "BadgeDetailsFragment", "onRequestPermissionsResult");
        if (i14 != 3) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            u6();
        } else {
            new androidx.appcompat.app.e.a(requireContext()).setMessage(j22.b.f(j22.a.f96722k)).setPositiveButton(R.string.lbl_ok, new o(20)).create().show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m1 m1Var = this.B;
        if (m1Var == null || !m1Var.isActive()) {
            return;
        }
        m1 m1Var2 = this.B;
        m1Var2.getClass();
        m1Var2.c(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        View view3 = this.f30403c;
        view3.getClass();
        view3.setVisibility(8);
        this.f30402b = new l(this.f30401a);
        RecyclerView recyclerView = this.f30417q;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.f30417q;
        recyclerView2.getClass();
        recyclerView2.setAdapter(this.f30402b);
        RecyclerView recyclerView3 = this.f30417q;
        recyclerView3.getClass();
        recyclerView3.setNestedScrollingEnabled(false);
        TextView textView = this.f30414n;
        textView.getClass();
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: uu.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172658b;

            {
                this.f172658b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                Context context;
                String assocDataId;
                String assocDataId2;
                String assocDataId3;
                String assocDataId4;
                String assocDataId5;
                String assocDataId6;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.badges.redesign.b bVar = this.f172658b;
                switch (i15) {
                    case 0:
                        ru.d dVar = bVar.I;
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.BADGES;
                        aVar.getClass();
                        i2.a.b(a2Var, "BadgeDetailsFragment", "onBadgeEarnedTextClick");
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar = bVar.f30401a;
                        if (mVar != null && !TextUtils.isEmpty(mVar.getAssocDataId()) && (context = bVar.getContext()) != null) {
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar2 = bVar.f30401a;
                            mVar2.getClass();
                            com.garmin.android.apps.connectmobile.badges.service.model.a aVarA = com.garmin.android.apps.connectmobile.badges.service.model.a.a(mVar2.getAssocTypeId());
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar3 = bVar.f30401a;
                            mVar3.getClass();
                            lValueOf = null;
                            Long lValueOf = null;
                            if (mVar3.getBadgeEarnedNumber() > 1) {
                                if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar4 = bVar.f30401a;
                                    mVar4.getClass();
                                    dVar.o(mVar4.getBadgeId(), context);
                                    break;
                                } else {
                                    com.garmin.android.apps.connectmobile.badges.service.model.a aVar2 = com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE;
                                    if (aVarA == aVar2) {
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar5 = bVar.f30401a;
                                        mVar5.getClass();
                                        int badgeId = mVar5.getBadgeId();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar6 = bVar.f30401a;
                                        mVar6.getClass();
                                        dVar.p(context, badgeId, mVar6.getBadgeEarnedNumber(), aVar2);
                                        break;
                                    } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE || aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE) {
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar7 = bVar.f30401a;
                                        mVar7.getClass();
                                        int badgeId2 = mVar7.getBadgeId();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar8 = bVar.f30401a;
                                        mVar8.getClass();
                                        dVar.p(context, badgeId2, mVar8.getBadgeEarnedNumber(), aVarA);
                                        break;
                                    } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.SCORECARD) {
                                        androidx.fragment.app.m activity = bVar.getActivity();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar9 = bVar.f30401a;
                                        Integer numValueOf = mVar9 != null ? Integer.valueOf(mVar9.getBadgeId()) : null;
                                        if (activity != null && numValueOf != null) {
                                            dVar.l(activity, numValueOf.intValue());
                                            break;
                                        }
                                    }
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar10 = bVar.f30401a;
                                if (mVar10 != null && (assocDataId6 = mVar10.getAssocDataId()) != null) {
                                    lValueOf = Long.valueOf(Long.parseLong(assocDataId6));
                                }
                                if (lValueOf != null) {
                                    dVar.h(context, lValueOf.longValue(), am.h.VIEW_EDIT);
                                }
                                break;
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar11 = bVar.f30401a;
                                if (mVar11 != null && (assocDataId5 = mVar11.getAssocDataId()) != null) {
                                    dVar.n(context, assocDataId5);
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar12 = bVar.f30401a;
                                if (mVar12 != null && (assocDataId4 = mVar12.getAssocDataId()) != null) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    mVarRequireActivity.getClass();
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar13 = bVar.f30401a;
                                    mVar13.getClass();
                                    dVar.c(mVarRequireActivity, assocDataId4, mVar13.getCurrentPlayerType());
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar14 = bVar.f30401a;
                                if (mVar14 != null && (assocDataId3 = mVar14.getAssocDataId()) != null) {
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar15 = bVar.f30401a;
                                    mVar15.getClass();
                                    dVar.b(mVarRequireActivity2, assocDataId3, mVar15.getCurrentPlayerType());
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.GROUP_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar16 = bVar.f30401a;
                                if (mVar16 != null && (assocDataId2 = mVar16.getAssocDataId()) != null) {
                                    dVar.f(context, assocDataId2);
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.DAY) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar17 = bVar.f30401a;
                                mVar17.getClass();
                                DateTime dateTimeH0 = mVar17.h0();
                                if (dateTimeH0 != null) {
                                    androidx.fragment.app.m mVarRequireActivity3 = bVar.requireActivity();
                                    mVarRequireActivity3.getClass();
                                    dVar.k(mVarRequireActivity3, dateTimeH0);
                                }
                                break;
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE) {
                                if (bVar.C) {
                                    bVar.requireActivity().onBackPressed();
                                    break;
                                } else {
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar18 = bVar.f30401a;
                                    if (mVar18 != null && (assocDataId = mVar18.getAssocDataId()) != null) {
                                        androidx.fragment.app.m mVarRequireActivity4 = bVar.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        dVar.d(mVarRequireActivity4, assocDataId);
                                        break;
                                    }
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.SCORECARD) {
                                androidx.fragment.app.m activity2 = bVar.getActivity();
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar19 = bVar.f30401a;
                                String assocDataId7 = mVar19 != null ? mVar19.getAssocDataId() : null;
                                if (activity2 != null && assocDataId7 != null) {
                                    dVar.j(activity2, assocDataId7);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar3 = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                        view4.getClass();
                        Context context2 = view4.getContext();
                        ConnectionsWithBadgeActivity.a aVar4 = ConnectionsWithBadgeActivity.f30372a;
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar20 = bVar.f30401a;
                        if (mVar20 != null) {
                            int badgeId3 = mVar20.getBadgeId();
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar21 = bVar.f30401a;
                            if (mVar21 != null) {
                                int followingNumber = mVar21.getFollowingNumber();
                                aVar4.getClass();
                                Intent intent = new Intent(context2, (Class<?>) ConnectionsWithBadgeActivity.class);
                                intent.putExtra("GCM_extra_badge_id", badgeId3);
                                intent.putExtra("GCM_extra_badge_connection_count", followingNumber);
                                context2.startActivity(intent);
                            }
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f30418r;
        linearLayout.getClass();
        final int i15 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: uu.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172658b;

            {
                this.f172658b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                Context context;
                String assocDataId;
                String assocDataId2;
                String assocDataId3;
                String assocDataId4;
                String assocDataId5;
                String assocDataId6;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.badges.redesign.b bVar = this.f172658b;
                switch (i16) {
                    case 0:
                        ru.d dVar = bVar.I;
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.BADGES;
                        aVar.getClass();
                        i2.a.b(a2Var, "BadgeDetailsFragment", "onBadgeEarnedTextClick");
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar = bVar.f30401a;
                        if (mVar != null && !TextUtils.isEmpty(mVar.getAssocDataId()) && (context = bVar.getContext()) != null) {
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar2 = bVar.f30401a;
                            mVar2.getClass();
                            com.garmin.android.apps.connectmobile.badges.service.model.a aVarA = com.garmin.android.apps.connectmobile.badges.service.model.a.a(mVar2.getAssocTypeId());
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar3 = bVar.f30401a;
                            mVar3.getClass();
                            lValueOf = null;
                            Long lValueOf = null;
                            if (mVar3.getBadgeEarnedNumber() > 1) {
                                if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar4 = bVar.f30401a;
                                    mVar4.getClass();
                                    dVar.o(mVar4.getBadgeId(), context);
                                    break;
                                } else {
                                    com.garmin.android.apps.connectmobile.badges.service.model.a aVar2 = com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE;
                                    if (aVarA == aVar2) {
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar5 = bVar.f30401a;
                                        mVar5.getClass();
                                        int badgeId = mVar5.getBadgeId();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar6 = bVar.f30401a;
                                        mVar6.getClass();
                                        dVar.p(context, badgeId, mVar6.getBadgeEarnedNumber(), aVar2);
                                        break;
                                    } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE || aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE) {
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar7 = bVar.f30401a;
                                        mVar7.getClass();
                                        int badgeId2 = mVar7.getBadgeId();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar8 = bVar.f30401a;
                                        mVar8.getClass();
                                        dVar.p(context, badgeId2, mVar8.getBadgeEarnedNumber(), aVarA);
                                        break;
                                    } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.SCORECARD) {
                                        androidx.fragment.app.m activity = bVar.getActivity();
                                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar9 = bVar.f30401a;
                                        Integer numValueOf = mVar9 != null ? Integer.valueOf(mVar9.getBadgeId()) : null;
                                        if (activity != null && numValueOf != null) {
                                            dVar.l(activity, numValueOf.intValue());
                                            break;
                                        }
                                    }
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar10 = bVar.f30401a;
                                if (mVar10 != null && (assocDataId6 = mVar10.getAssocDataId()) != null) {
                                    lValueOf = Long.valueOf(Long.parseLong(assocDataId6));
                                }
                                if (lValueOf != null) {
                                    dVar.h(context, lValueOf.longValue(), am.h.VIEW_EDIT);
                                }
                                break;
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar11 = bVar.f30401a;
                                if (mVar11 != null && (assocDataId5 = mVar11.getAssocDataId()) != null) {
                                    dVar.n(context, assocDataId5);
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar12 = bVar.f30401a;
                                if (mVar12 != null && (assocDataId4 = mVar12.getAssocDataId()) != null) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    mVarRequireActivity.getClass();
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar13 = bVar.f30401a;
                                    mVar13.getClass();
                                    dVar.c(mVarRequireActivity, assocDataId4, mVar13.getCurrentPlayerType());
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar14 = bVar.f30401a;
                                if (mVar14 != null && (assocDataId3 = mVar14.getAssocDataId()) != null) {
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar15 = bVar.f30401a;
                                    mVar15.getClass();
                                    dVar.b(mVarRequireActivity2, assocDataId3, mVar15.getCurrentPlayerType());
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.GROUP_CHALLENGE) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar16 = bVar.f30401a;
                                if (mVar16 != null && (assocDataId2 = mVar16.getAssocDataId()) != null) {
                                    dVar.f(context, assocDataId2);
                                    break;
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.DAY) {
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar17 = bVar.f30401a;
                                mVar17.getClass();
                                DateTime dateTimeH0 = mVar17.h0();
                                if (dateTimeH0 != null) {
                                    androidx.fragment.app.m mVarRequireActivity3 = bVar.requireActivity();
                                    mVarRequireActivity3.getClass();
                                    dVar.k(mVarRequireActivity3, dateTimeH0);
                                }
                                break;
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE) {
                                if (bVar.C) {
                                    bVar.requireActivity().onBackPressed();
                                    break;
                                } else {
                                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar18 = bVar.f30401a;
                                    if (mVar18 != null && (assocDataId = mVar18.getAssocDataId()) != null) {
                                        androidx.fragment.app.m mVarRequireActivity4 = bVar.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        dVar.d(mVarRequireActivity4, assocDataId);
                                        break;
                                    }
                                }
                            } else if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.SCORECARD) {
                                androidx.fragment.app.m activity2 = bVar.getActivity();
                                com.garmin.android.apps.connectmobile.badges.service.model.m mVar19 = bVar.f30401a;
                                String assocDataId7 = mVar19 != null ? mVar19.getAssocDataId() : null;
                                if (activity2 != null && assocDataId7 != null) {
                                    dVar.j(activity2, assocDataId7);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar3 = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                        view4.getClass();
                        Context context2 = view4.getContext();
                        ConnectionsWithBadgeActivity.a aVar4 = ConnectionsWithBadgeActivity.f30372a;
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar20 = bVar.f30401a;
                        if (mVar20 != null) {
                            int badgeId3 = mVar20.getBadgeId();
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar21 = bVar.f30401a;
                            if (mVar21 != null) {
                                int followingNumber = mVar21.getFollowingNumber();
                                aVar4.getClass();
                                Intent intent = new Intent(context2, (Class<?>) ConnectionsWithBadgeActivity.class);
                                intent.putExtra("GCM_extra_badge_id", badgeId3);
                                intent.putExtra("GCM_extra_badge_connection_count", followingNumber);
                                context2.startActivity(intent);
                            }
                        }
                        break;
                }
            }
        });
        ComposeView composeView = this.f30419t;
        if (composeView != null) {
            composeView.setContent(new z3.e(-1882906883, true, new uu.d(this, 0)));
        }
    }

    public final void u6() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.shared_badge_image_layout, (ViewGroup) null, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.badge_image);
        Bitmap bitmap = this.A;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(2131231128);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.badge_name);
        m mVar = this.f30401a;
        mVar.getClass();
        textView.setText(mVar.A());
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.badge_description);
        m mVar2 = this.f30401a;
        mVar2.getClass();
        textView2.setText(mVar2.m());
        viewInflate.measure(0, 0);
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        com.garmin.android.apps.connectmobile.social.share.e eVar = new com.garmin.android.apps.connectmobile.social.share.e(bitmapCreateBitmap);
        Canvas canvas = eVar.f44682b;
        if (canvas != null) {
            viewInflate.draw(canvas);
        }
        Bitmap bitmap2 = eVar.f44681a;
        if (bitmap2 != null) {
            m mVar3 = this.f30401a;
            mVar3.getClass();
            String strG = tn.k.g(mVar3.y(), ".jpg");
            bq0.l lVar = this.D;
            lVar.getClass();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            compressFormat.getClass();
            androidx.lifecycle.m.a(lVar.f19514a, new bq0.n(contextRequireContext, null, lVar, compressFormat, strG, bitmap2, null), 2).f(getViewLifecycleOwner(), new d(new uu.e(this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IMAGE_EXTENSION_JPEG", "", "REQUEST_CODE_SAVE_IMAGE_PERMS", "I", "Lg6/f;", "CONNECTION_ICON_SIZE", "F", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
