package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0666a f37286d = new C0666a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f37288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f37289c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37291b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.u.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.ONE_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEKEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37290a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f37291b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/a$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37292a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37292a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37292a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37292a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f37293a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37293a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37294a = aVar;
            this.f37295b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37294a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37295b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37296a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37296a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.ad_hoc_challenge_confirm_fragment);
        this.f37287a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new e(this), new g(this), new f(null, this));
        this.f37289c = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws Exception {
        super.onDestroyView();
        this.f37289c.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ComposeView composeView;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(u6().f206931b.f37989c);
        if (sVarB != null && (composeView = (ComposeView) view2.findViewById(R.id.activity_type)) != null) {
            composeView.setContent(new z3.e(-1492894438, true, new com.garmin.android.apps.connectmobile.leaderboard.model.x(sVarB, 1, (byte) 0)));
        }
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(R.id.create_challenge_button);
        this.f37288b = appCompatButton;
        if (appCompatButton != null) {
            final int i14 = 0;
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.a f120501b;

                {
                    this.f120501b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a aVar = this.f120501b;
                    switch (i15) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                            zt0.a aVarU6 = aVar.u6();
                            androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                            ge1.b.T(androidx.lifecycle.v1.a(aVarU6), null, null, new zt0.b(y0Var, aVarU6, null), 3);
                            y0Var.f(aVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.a.d(new mh1.x(aVar, 5)));
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                            aVar.u6().f206939j.j(Boolean.TRUE);
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                            new androidx.appcompat.app.e.a(aVar.requireContext()).setTitle(R.string.lbl_discard_challenge).setMessage(R.string.social_challenge_discard_challenge_msg).setPositiveButton(R.string.lbl_discard, new kx0.f(aVar, 7)).setNegativeButton(R.string.lbl_cancel, new jm0.c(28)).create().show();
                            break;
                        case 3:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                            com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                            int i16 = aVar.u6().f206931b.f37996j;
                            aVar2.getClass();
                            com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i16);
                            zt0.a.b bVar = new zt0.a.b(true, false);
                            if (uVarB != com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                                aVar.u6().f206938i.j(bVar);
                            } else {
                                aVar.u6().f206942m.j(bVar);
                            }
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                            aVar.u6().f206937h.j(Boolean.TRUE);
                            break;
                    }
                }
            });
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
        int i15 = u6().f206931b.f37996j;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i15);
        AppCompatButton appCompatButton2 = this.f37288b;
        if (appCompatButton2 != null) {
            appCompatButton2.setEnabled((u6().f206931b.f38001o.isEmpty() || uVarB == com.garmin.android.apps.connectmobile.leaderboard.model.u.UNKNOWN || u6().f206933d == null) ? false : true);
        }
        List<? extends AdHocChallengePlayerDTO> list = u6().f206931b.f38001o;
        ArrayList arrayList = new ArrayList();
        View viewFindViewById = view2.findViewById(R.id.first_profile_image_view);
        viewFindViewById.getClass();
        arrayList.add(viewFindViewById);
        View viewFindViewById2 = view2.findViewById(R.id.second_profile_image_view);
        viewFindViewById2.getClass();
        arrayList.add(viewFindViewById2);
        View viewFindViewById3 = view2.findViewById(R.id.third_profile_image_view);
        viewFindViewById3.getClass();
        arrayList.add(viewFindViewById3);
        Iterator it = arrayList.iterator();
        int i16 = 0;
        while (true) {
            if (!it.hasNext()) {
                ((TextView) view2.findViewById(R.id.participant_count)).setText(list.size() == 1 ? c22.p0.a(((AdHocChallengePlayerDTO) p13.h0.b0(list)).f38013g, ((AdHocChallengePlayerDTO) p13.h0.b0(list)).f38014h) : getString(R.string.social_challenge_participants_msg, Integer.valueOf(list.size())));
                final int i17 = 4;
                view2.findViewById(R.id.participant_layout).setOnClickListener(new View.OnClickListener(this) { // from class: mt0.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.a f120501b;

                    {
                        this.f120501b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i18 = i17;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a aVar2 = this.f120501b;
                        switch (i18) {
                            case 0:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                zt0.a aVarU6 = aVar2.u6();
                                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                                ge1.b.T(androidx.lifecycle.v1.a(aVarU6), null, null, new zt0.b(y0Var, aVarU6, null), 3);
                                y0Var.f(aVar2.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.a.d(new mh1.x(aVar2, 5)));
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar2.u6().f206939j.j(Boolean.TRUE);
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                new androidx.appcompat.app.e.a(aVar2.requireContext()).setTitle(R.string.lbl_discard_challenge).setMessage(R.string.social_challenge_discard_challenge_msg).setPositiveButton(R.string.lbl_discard, new kx0.f(aVar2, 7)).setNegativeButton(R.string.lbl_cancel, new jm0.c(28)).create().show();
                                break;
                            case 3:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                                int i19 = aVar2.u6().f206931b.f37996j;
                                aVar3.getClass();
                                com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i19);
                                zt0.a.b bVar = new zt0.a.b(true, false);
                                if (uVarB2 != com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                                    aVar2.u6().f206938i.j(bVar);
                                } else {
                                    aVar2.u6().f206942m.j(bVar);
                                }
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar2.u6().f206937h.j(Boolean.TRUE);
                                break;
                        }
                    }
                });
                com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                int i18 = u6().f206931b.f37996j;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB2 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i18);
                if (uVarB2 != null) {
                    TextView textView = (TextView) view2.findViewById(R.id.duration_title);
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    textView.setText(com.garmin.android.apps.connectmobile.leaderboard.model.u.a.a(uVarB2, contextRequireContext));
                    TextView textView2 = (TextView) view2.findViewById(R.id.duration_description);
                    String string = "";
                    if (u6().f206933d != null && u6().f206934e != null) {
                        int i19 = b.f37290a[com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(u6().f206931b.f37996j).ordinal()];
                        if (i19 != 1) {
                            if (i19 == 2 || i19 == 3 || i19 == 4) {
                                Context contextRequireContext2 = requireContext();
                                c22.j0 j0Var = c22.j0.f23099a;
                                DateTime dateTime = u6().f206934e;
                                j0Var.getClass();
                                string = contextRequireContext2.getString(R.string.lbl_group_challenge_ends, c22.j0.y(dateTime));
                                string.getClass();
                            } else if (i19 == 5) {
                                long millis = c22.j0.R(u6().f206933d).getMillis();
                                DateTime dateTime2 = u6().f206934e;
                                long millis2 = (c22.j0.R(dateTime2 != null ? dateTime2.plusMillis(1) : null).getMillis() - millis) / 86400000;
                                String strG = millis2 > 1 ? tn.k.g(requireContext().getString(R.string.challenge_time_remaining_days, Long.valueOf(millis2)), StringUtils.SPACE) : tn.k.g(requireContext().getString(R.string.challenge_time_remaining_day, Long.valueOf(millis2)), StringUtils.SPACE);
                                String string2 = requireContext().getString(R.string.lbl_bullet);
                                string2.getClass();
                                Context contextRequireContext3 = requireContext();
                                c22.j0 j0Var2 = c22.j0.f23099a;
                                DateTime dateTime3 = u6().f206934e;
                                j0Var2.getClass();
                                String string3 = contextRequireContext3.getString(R.string.lbl_group_challenge_ends, c22.j0.y(dateTime3));
                                string3.getClass();
                                string = strG + StringUtils.SPACE + string2 + StringUtils.SPACE + string3;
                            }
                        }
                    }
                    textView2.setText(string);
                    if (string.length() == 0 || d53.w.J(string)) {
                        textView2.setVisibility(8);
                    }
                }
                final int i24 = 1;
                view2.findViewById(R.id.duration_type_layout).setOnClickListener(new View.OnClickListener(this) { // from class: mt0.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.a f120501b;

                    {
                        this.f120501b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i110 = i24;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a aVar3 = this.f120501b;
                        switch (i110) {
                            case 0:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                zt0.a aVarU6 = aVar3.u6();
                                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                                ge1.b.T(androidx.lifecycle.v1.a(aVarU6), null, null, new zt0.b(y0Var, aVarU6, null), 3);
                                y0Var.f(aVar3.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.a.d(new mh1.x(aVar3, 5)));
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar3.u6().f206939j.j(Boolean.TRUE);
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                new androidx.appcompat.app.e.a(aVar3.requireContext()).setTitle(R.string.lbl_discard_challenge).setMessage(R.string.social_challenge_discard_challenge_msg).setPositiveButton(R.string.lbl_discard, new kx0.f(aVar3, 7)).setNegativeButton(R.string.lbl_cancel, new jm0.c(28)).create().show();
                                break;
                            case 3:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                                int i111 = aVar3.u6().f206931b.f37996j;
                                aVar4.getClass();
                                com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB3 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i111);
                                zt0.a.b bVar = new zt0.a.b(true, false);
                                if (uVarB3 != com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                                    aVar3.u6().f206938i.j(bVar);
                                } else {
                                    aVar3.u6().f206942m.j(bVar);
                                }
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar3.u6().f206937h.j(Boolean.TRUE);
                                break;
                        }
                    }
                });
                TextView textView3 = (TextView) view2.findViewById(R.id.confirm_description_view);
                int i25 = u6().f206931b.f37989c;
                String string4 = (i25 != com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.f38319a && i25 == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.f38319a) ? getString(R.string.lbl_adhoc_challenge_rules_wheelchair) : getString(R.string.lbl_adhoc_challenge_rules);
                textView3.setText(string4);
                TextView textView4 = (TextView) view2.findViewById(R.id.start_date_text);
                c22.j0 j0Var3 = c22.j0.f23099a;
                DateTime dateTime4 = u6().f206933d;
                j0Var3.getClass();
                textView4.setText(c22.j0.y(dateTime4));
                final int i26 = 3;
                view2.findViewById(R.id.start_date_layout).setOnClickListener(new View.OnClickListener(this) { // from class: mt0.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.a f120501b;

                    {
                        this.f120501b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i110 = i26;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.a aVar3 = this.f120501b;
                        switch (i110) {
                            case 0:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                zt0.a aVarU6 = aVar3.u6();
                                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                                ge1.b.T(androidx.lifecycle.v1.a(aVarU6), null, null, new zt0.b(y0Var, aVarU6, null), 3);
                                y0Var.f(aVar3.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.a.d(new mh1.x(aVar3, 5)));
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar3.u6().f206939j.j(Boolean.TRUE);
                                break;
                            case 2:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                new androidx.appcompat.app.e.a(aVar3.requireContext()).setTitle(R.string.lbl_discard_challenge).setMessage(R.string.social_challenge_discard_challenge_msg).setPositiveButton(R.string.lbl_discard, new kx0.f(aVar3, 7)).setNegativeButton(R.string.lbl_cancel, new jm0.c(28)).create().show();
                                break;
                            case 3:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                                int i111 = aVar3.u6().f206931b.f37996j;
                                aVar4.getClass();
                                com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB3 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i111);
                                zt0.a.b bVar = new zt0.a.b(true, false);
                                if (uVarB3 != com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                                    aVar3.u6().f206938i.j(bVar);
                                } else {
                                    aVar3.u6().f206942m.j(bVar);
                                }
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                aVar3.u6().f206937h.j(Boolean.TRUE);
                                break;
                        }
                    }
                });
                TextView textView5 = (TextView) view2.findViewById(R.id.cancel);
                if (textView5 != null) {
                    final int i27 = 2;
                    textView5.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.a f120501b;

                        {
                            this.f120501b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i110 = i27;
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.a aVar3 = this.f120501b;
                            switch (i110) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                    zt0.a aVarU6 = aVar3.u6();
                                    androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                                    ge1.b.T(androidx.lifecycle.v1.a(aVarU6), null, null, new zt0.b(y0Var, aVarU6, null), 3);
                                    y0Var.f(aVar3.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.a.d(new mh1.x(aVar3, 5)));
                                    break;
                                case 1:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                    aVar3.u6().f206939j.j(Boolean.TRUE);
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                    new androidx.appcompat.app.e.a(aVar3.requireContext()).setTitle(R.string.lbl_discard_challenge).setMessage(R.string.social_challenge_discard_challenge_msg).setPositiveButton(R.string.lbl_discard, new kx0.f(aVar3, 7)).setNegativeButton(R.string.lbl_cancel, new jm0.c(28)).create().show();
                                    break;
                                case 3:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                    com.garmin.android.apps.connectmobile.leaderboard.model.u.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.model.u.f38346b;
                                    int i111 = aVar3.u6().f206931b.f37996j;
                                    aVar4.getClass();
                                    com.garmin.android.apps.connectmobile.leaderboard.model.u uVarB3 = com.garmin.android.apps.connectmobile.leaderboard.model.u.a.b(i111);
                                    zt0.a.b bVar = new zt0.a.b(true, false);
                                    if (uVarB3 != com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                                        aVar3.u6().f206938i.j(bVar);
                                    } else {
                                        aVar3.u6().f206942m.j(bVar);
                                    }
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                                    aVar3.u6().f206937h.j(Boolean.TRUE);
                                    break;
                            }
                        }
                    });
                }
                requireActivity().getOnBackPressedDispatcher().a(this.f37289c);
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
                if (z1Var != null) {
                    z1Var.initActionBar(false, R.string.lbl_confirm_challenge);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i28 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            UserLevelImageView userLevelImageView = (UserLevelImageView) next;
            if (i16 < list.size()) {
                v22.e.q(userLevelImageView);
                userLevelImageView.setProfileImageData(list.get(i16).f38020n);
            } else {
                v22.e.j(userLevelImageView);
            }
            i16 = i28;
        }
    }

    public final zt0.a u6() {
        return (zt0.a) this.f37287a.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0666a {
        public /* synthetic */ C0666a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0666a() {
        }
    }
}
