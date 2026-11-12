package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.viewpager2.widget.ViewPager2;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import e23.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ps.d1;
import zo.j.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/j;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29365e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap.d f29366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zo.j f29367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1 f29368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29369d = -1;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29370a;

        public b(l lVar) {
            lVar.getClass();
            this.f29370a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29370a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29370a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.multisport_leg_edit_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f29366a = (ap.d) new x1(mVarRequireActivity).b(s0.f105811a.b(ap.d.class));
        Bundle arguments = getArguments();
        int i14 = arguments != null ? arguments.getInt("legIndex") : -1;
        this.f29369d = i14;
        final int i15 = 2;
        final int i16 = 3;
        this.f29367b = new zo.j(view2, i14, new l(this) { // from class: zo.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j f206069b;

            {
                this.f206069b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Fragment fragmentA;
                Integer num;
                int i17;
                int i18 = i15;
                char c14 = 1;
                char c15 = 1;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j jVar = this.f206069b;
                switch (i18) {
                    case 0:
                        d1 d1Var = (d1) obj;
                        if (d1Var != null) {
                            jVar.f29368c = d1Var;
                            final j jVar2 = jVar.f29367b;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("viewHolder");
                                throw null;
                            }
                            h32.n.b bVar = jVar2.f206044g;
                            h32.n.b bVar2 = jVar2.f206043f;
                            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                            View view3 = jVar2.f206038a;
                            Context context = view3.getContext();
                            context.getClass();
                            oi0.h hVar = new oi0.h(context);
                            TextView textView = jVar2.f206042e;
                            Context context2 = view3.getContext();
                            context2.getClass();
                            textView.setText(dh.b.A(context2, d1Var.f139790f.f4360c));
                            Context context3 = view3.getContext();
                            context3.getClass();
                            l3.a aVar = l3.f23124b;
                            Context context4 = view3.getContext();
                            double d14 = d1Var.f139788d;
                            q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                            aVar.getClass();
                            SpannableStringBuilder spannableStringBuilderK = w13.b.k(context3, l3.a.N0(context4, d14, q3Var, l3.f23130h, true, view3.getContext().getString(R.string.no_value)));
                            String string = spannableStringBuilderK.toString();
                            Context context5 = view3.getContext();
                            context5.getClass();
                            String strA = oi0.c.A(context5, new z81.b(20), string);
                            TextView textView2 = bVar2.f81398b;
                            if (textView2 != null) {
                                textView2.setText(spannableStringBuilderK);
                                textView2.setContentDescription(strA);
                            }
                            bVar2.c(view3.getContext().getString(R.string.lbl_speed));
                            Context context6 = view3.getContext();
                            context6.getClass();
                            SpannableStringBuilder spannableStringBuilderK2 = w13.b.k(context6, l3.a.P(view3.getContext(), d1Var.f139787c, zY ? m3.KILOMETER : m3.MILE, l3.f23129g, true, view3.getContext().getString(R.string.no_value)));
                            String string2 = spannableStringBuilderK2.toString();
                            Context context7 = view3.getContext();
                            context7.getClass();
                            String strA2 = oi0.c.A(context7, new z81.b(21), string2);
                            TextView textView3 = bVar.f81398b;
                            if (textView3 != null) {
                                textView3.setText(spannableStringBuilderK2);
                                textView3.setContentDescription(strA2);
                            }
                            bVar.c(view3.getContext().getString(R.string.leg_distance));
                            jVar2.f206045h.b(l3.a.e1((long) d1Var.f139786b), view3.getContext().getString(R.string.lbl_multisport_leg_time), hVar.d((long) d1Var.f139786b, true));
                            jVar2.f206046i.b(l3.a.e1((long) d1Var.f139789e), view3.getContext().getString(R.string.LapList_cumulative_time_label), hVar.d((long) d1Var.f139789e, true));
                            final int i19 = 0;
                            jVar2.f206047j.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i19) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            Button button = jVar2.f206048k;
                            final char c16 = c14 == true ? 1 : 0;
                            button.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (c16) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            boolean z14 = d1Var.f139787c >= 10.0d;
                            if (!p005kotlin.jvm.internal.s.g(jVar2.f206052o, Boolean.valueOf(z14))) {
                                jVar2.f206052o = Boolean.valueOf(z14);
                                ViewPager2 viewPager2 = jVar2.f206050m;
                                viewPager2.setAdapter(jVar2.new a(z14));
                                viewPager2.setUserInputEnabled(false);
                                TabLayout tabLayout = jVar2.f206049l;
                                v22.e.v(tabLayout, z14);
                                TabLayoutMediator tabLayoutMediator = jVar2.f206051n;
                                if (tabLayoutMediator != null) {
                                    tabLayoutMediator.detach();
                                }
                                if (z14) {
                                    TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout, viewPager2, new xw.b(jVar2, 18));
                                    jVar2.f206051n = tabLayoutMediator2;
                                    tabLayoutMediator2.attach();
                                }
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        j jVar3 = jVar.f29367b;
                        if (jVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewHolder");
                            throw null;
                        }
                        bool.getClass();
                        jVar3.f206048k.setEnabled(bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        ap.d dVar = jVar.f29366a;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        wo.a aVarY4 = dVar.y4(jVar.f29369d);
                        int iIntValue2 = (aVarY4 == null || (num = aVarY4.f186397a) == null) ? 0 : num.intValue();
                        if (iIntValue == 0) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i24 = jVar.f29369d;
                            d1 d1Var2 = jVar.f29368c;
                            if (d1Var2 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar3.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i24, d1Var2, iIntValue2);
                        } else if (iIntValue != 1) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i25 = jVar.f29369d;
                            d1 d1Var3 = jVar.f29368c;
                            if (d1Var3 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar4.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i25, d1Var3, iIntValue2);
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.f29360p;
                            int i26 = jVar.f29369d;
                            d1 d1Var4 = jVar.f29368c;
                            if (d1Var4 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar5.getClass();
                            Bundle bundle2 = new Bundle(3);
                            bundle2.putInt("legIndex", i26);
                            bundle2.putParcelable("leg", d1Var4);
                            bundle2.putInt("selectedChartType", iIntValue2);
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h hVar2 = new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h();
                            hVar2.setArguments(bundle2);
                            fragmentA = hVar2;
                        }
                        androidx.fragment.app.v supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar6.l(R.id.multisport_content_frame, fragmentA, null);
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m.getClass();
                        aVar6.d(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29313n);
                        aVar6.e();
                        return Unit.INSTANCE;
                    default:
                        int iIntValue3 = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar7 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(jVar.requireActivity()).setTitle(jVar.getString(R.string.delete_leg) + CallerData.NA);
                        int i27 = jVar.f29369d;
                        if (iIntValue3 == 0) {
                            i17 = i27 == 0 ? R.string.delete_leg_next_message : R.string.delete_leg_previous_message;
                        } else {
                            i17 = i27 == 0 ? R.string.delete_leg_next_distance_message : R.string.delete_leg_previous_distance_message;
                        }
                        title.setMessage(i17).setPositiveButton(R.string.lbl_delete, new xg1.l(jVar, 22)).setNegativeButton(R.string.lbl_cancel, new g(c15 == true ? 1 : 0)).show();
                        return Unit.INSTANCE;
                }
            }
        }, new l(this) { // from class: zo.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j f206069b;

            {
                this.f206069b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Fragment fragmentA;
                Integer num;
                int i17;
                int i18 = i16;
                char c14 = 1;
                char c15 = 1;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j jVar = this.f206069b;
                switch (i18) {
                    case 0:
                        d1 d1Var = (d1) obj;
                        if (d1Var != null) {
                            jVar.f29368c = d1Var;
                            final j jVar2 = jVar.f29367b;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("viewHolder");
                                throw null;
                            }
                            h32.n.b bVar = jVar2.f206044g;
                            h32.n.b bVar2 = jVar2.f206043f;
                            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                            View view3 = jVar2.f206038a;
                            Context context = view3.getContext();
                            context.getClass();
                            oi0.h hVar = new oi0.h(context);
                            TextView textView = jVar2.f206042e;
                            Context context2 = view3.getContext();
                            context2.getClass();
                            textView.setText(dh.b.A(context2, d1Var.f139790f.f4360c));
                            Context context3 = view3.getContext();
                            context3.getClass();
                            l3.a aVar = l3.f23124b;
                            Context context4 = view3.getContext();
                            double d14 = d1Var.f139788d;
                            q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                            aVar.getClass();
                            SpannableStringBuilder spannableStringBuilderK = w13.b.k(context3, l3.a.N0(context4, d14, q3Var, l3.f23130h, true, view3.getContext().getString(R.string.no_value)));
                            String string = spannableStringBuilderK.toString();
                            Context context5 = view3.getContext();
                            context5.getClass();
                            String strA = oi0.c.A(context5, new z81.b(20), string);
                            TextView textView2 = bVar2.f81398b;
                            if (textView2 != null) {
                                textView2.setText(spannableStringBuilderK);
                                textView2.setContentDescription(strA);
                            }
                            bVar2.c(view3.getContext().getString(R.string.lbl_speed));
                            Context context6 = view3.getContext();
                            context6.getClass();
                            SpannableStringBuilder spannableStringBuilderK2 = w13.b.k(context6, l3.a.P(view3.getContext(), d1Var.f139787c, zY ? m3.KILOMETER : m3.MILE, l3.f23129g, true, view3.getContext().getString(R.string.no_value)));
                            String string2 = spannableStringBuilderK2.toString();
                            Context context7 = view3.getContext();
                            context7.getClass();
                            String strA2 = oi0.c.A(context7, new z81.b(21), string2);
                            TextView textView3 = bVar.f81398b;
                            if (textView3 != null) {
                                textView3.setText(spannableStringBuilderK2);
                                textView3.setContentDescription(strA2);
                            }
                            bVar.c(view3.getContext().getString(R.string.leg_distance));
                            jVar2.f206045h.b(l3.a.e1((long) d1Var.f139786b), view3.getContext().getString(R.string.lbl_multisport_leg_time), hVar.d((long) d1Var.f139786b, true));
                            jVar2.f206046i.b(l3.a.e1((long) d1Var.f139789e), view3.getContext().getString(R.string.LapList_cumulative_time_label), hVar.d((long) d1Var.f139789e, true));
                            final int i19 = 0;
                            jVar2.f206047j.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i19) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            Button button = jVar2.f206048k;
                            final int c16 = c14 == true ? 1 : 0;
                            button.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (c16) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            boolean z14 = d1Var.f139787c >= 10.0d;
                            if (!p005kotlin.jvm.internal.s.g(jVar2.f206052o, Boolean.valueOf(z14))) {
                                jVar2.f206052o = Boolean.valueOf(z14);
                                ViewPager2 viewPager2 = jVar2.f206050m;
                                viewPager2.setAdapter(jVar2.new a(z14));
                                viewPager2.setUserInputEnabled(false);
                                TabLayout tabLayout = jVar2.f206049l;
                                v22.e.v(tabLayout, z14);
                                TabLayoutMediator tabLayoutMediator = jVar2.f206051n;
                                if (tabLayoutMediator != null) {
                                    tabLayoutMediator.detach();
                                }
                                if (z14) {
                                    TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout, viewPager2, new xw.b(jVar2, 18));
                                    jVar2.f206051n = tabLayoutMediator2;
                                    tabLayoutMediator2.attach();
                                }
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        j jVar3 = jVar.f29367b;
                        if (jVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewHolder");
                            throw null;
                        }
                        bool.getClass();
                        jVar3.f206048k.setEnabled(bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        ap.d dVar = jVar.f29366a;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        wo.a aVarY4 = dVar.y4(jVar.f29369d);
                        int iIntValue2 = (aVarY4 == null || (num = aVarY4.f186397a) == null) ? 0 : num.intValue();
                        if (iIntValue == 0) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i24 = jVar.f29369d;
                            d1 d1Var2 = jVar.f29368c;
                            if (d1Var2 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar3.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i24, d1Var2, iIntValue2);
                        } else if (iIntValue != 1) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i25 = jVar.f29369d;
                            d1 d1Var3 = jVar.f29368c;
                            if (d1Var3 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar4.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i25, d1Var3, iIntValue2);
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.f29360p;
                            int i26 = jVar.f29369d;
                            d1 d1Var4 = jVar.f29368c;
                            if (d1Var4 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar5.getClass();
                            Bundle bundle2 = new Bundle(3);
                            bundle2.putInt("legIndex", i26);
                            bundle2.putParcelable("leg", d1Var4);
                            bundle2.putInt("selectedChartType", iIntValue2);
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h hVar2 = new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h();
                            hVar2.setArguments(bundle2);
                            fragmentA = hVar2;
                        }
                        androidx.fragment.app.v supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar6.l(R.id.multisport_content_frame, fragmentA, null);
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m.getClass();
                        aVar6.d(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29313n);
                        aVar6.e();
                        return Unit.INSTANCE;
                    default:
                        int iIntValue3 = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar7 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(jVar.requireActivity()).setTitle(jVar.getString(R.string.delete_leg) + CallerData.NA);
                        int i27 = jVar.f29369d;
                        if (iIntValue3 == 0) {
                            i17 = i27 == 0 ? R.string.delete_leg_next_message : R.string.delete_leg_previous_message;
                        } else {
                            i17 = i27 == 0 ? R.string.delete_leg_next_distance_message : R.string.delete_leg_previous_distance_message;
                        }
                        title.setMessage(i17).setPositiveButton(R.string.lbl_delete, new xg1.l(jVar, 22)).setNegativeButton(R.string.lbl_cancel, new g(c15 == true ? 1 : 0)).show();
                        return Unit.INSTANCE;
                }
            }
        });
        g22.e.l(this);
        ap.d dVar = this.f29366a;
        if (dVar == null) {
            s.m("viewModel");
            throw null;
        }
        int i17 = this.f29369d;
        w0 w0Var = new w0();
        w0Var.n(dVar.f11593e.f198239i, new ap.d.c(new ap.b(w0Var, i17, 0)));
        final int i18 = 0;
        w0Var.f(getViewLifecycleOwner(), new b(new l(this) { // from class: zo.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j f206069b;

            {
                this.f206069b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Fragment fragmentA;
                Integer num;
                int i19;
                int i110 = i18;
                char c14 = 1;
                char c15 = 1;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j jVar = this.f206069b;
                switch (i110) {
                    case 0:
                        d1 d1Var = (d1) obj;
                        if (d1Var != null) {
                            jVar.f29368c = d1Var;
                            final j jVar2 = jVar.f29367b;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("viewHolder");
                                throw null;
                            }
                            h32.n.b bVar = jVar2.f206044g;
                            h32.n.b bVar2 = jVar2.f206043f;
                            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                            View view3 = jVar2.f206038a;
                            Context context = view3.getContext();
                            context.getClass();
                            oi0.h hVar = new oi0.h(context);
                            TextView textView = jVar2.f206042e;
                            Context context2 = view3.getContext();
                            context2.getClass();
                            textView.setText(dh.b.A(context2, d1Var.f139790f.f4360c));
                            Context context3 = view3.getContext();
                            context3.getClass();
                            l3.a aVar = l3.f23124b;
                            Context context4 = view3.getContext();
                            double d14 = d1Var.f139788d;
                            q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                            aVar.getClass();
                            SpannableStringBuilder spannableStringBuilderK = w13.b.k(context3, l3.a.N0(context4, d14, q3Var, l3.f23130h, true, view3.getContext().getString(R.string.no_value)));
                            String string = spannableStringBuilderK.toString();
                            Context context5 = view3.getContext();
                            context5.getClass();
                            String strA = oi0.c.A(context5, new z81.b(20), string);
                            TextView textView2 = bVar2.f81398b;
                            if (textView2 != null) {
                                textView2.setText(spannableStringBuilderK);
                                textView2.setContentDescription(strA);
                            }
                            bVar2.c(view3.getContext().getString(R.string.lbl_speed));
                            Context context6 = view3.getContext();
                            context6.getClass();
                            SpannableStringBuilder spannableStringBuilderK2 = w13.b.k(context6, l3.a.P(view3.getContext(), d1Var.f139787c, zY ? m3.KILOMETER : m3.MILE, l3.f23129g, true, view3.getContext().getString(R.string.no_value)));
                            String string2 = spannableStringBuilderK2.toString();
                            Context context7 = view3.getContext();
                            context7.getClass();
                            String strA2 = oi0.c.A(context7, new z81.b(21), string2);
                            TextView textView3 = bVar.f81398b;
                            if (textView3 != null) {
                                textView3.setText(spannableStringBuilderK2);
                                textView3.setContentDescription(strA2);
                            }
                            bVar.c(view3.getContext().getString(R.string.leg_distance));
                            jVar2.f206045h.b(l3.a.e1((long) d1Var.f139786b), view3.getContext().getString(R.string.lbl_multisport_leg_time), hVar.d((long) d1Var.f139786b, true));
                            jVar2.f206046i.b(l3.a.e1((long) d1Var.f139789e), view3.getContext().getString(R.string.LapList_cumulative_time_label), hVar.d((long) d1Var.f139789e, true));
                            final int i111 = 0;
                            jVar2.f206047j.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i111) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            Button button = jVar2.f206048k;
                            final int c16 = c14 == true ? 1 : 0;
                            button.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (c16) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            boolean z14 = d1Var.f139787c >= 10.0d;
                            if (!p005kotlin.jvm.internal.s.g(jVar2.f206052o, Boolean.valueOf(z14))) {
                                jVar2.f206052o = Boolean.valueOf(z14);
                                ViewPager2 viewPager2 = jVar2.f206050m;
                                viewPager2.setAdapter(jVar2.new a(z14));
                                viewPager2.setUserInputEnabled(false);
                                TabLayout tabLayout = jVar2.f206049l;
                                v22.e.v(tabLayout, z14);
                                TabLayoutMediator tabLayoutMediator = jVar2.f206051n;
                                if (tabLayoutMediator != null) {
                                    tabLayoutMediator.detach();
                                }
                                if (z14) {
                                    TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout, viewPager2, new xw.b(jVar2, 18));
                                    jVar2.f206051n = tabLayoutMediator2;
                                    tabLayoutMediator2.attach();
                                }
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        j jVar3 = jVar.f29367b;
                        if (jVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewHolder");
                            throw null;
                        }
                        bool.getClass();
                        jVar3.f206048k.setEnabled(bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        ap.d dVar2 = jVar.f29366a;
                        if (dVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        wo.a aVarY4 = dVar2.y4(jVar.f29369d);
                        int iIntValue2 = (aVarY4 == null || (num = aVarY4.f186397a) == null) ? 0 : num.intValue();
                        if (iIntValue == 0) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i24 = jVar.f29369d;
                            d1 d1Var2 = jVar.f29368c;
                            if (d1Var2 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar3.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i24, d1Var2, iIntValue2);
                        } else if (iIntValue != 1) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i25 = jVar.f29369d;
                            d1 d1Var3 = jVar.f29368c;
                            if (d1Var3 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar4.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i25, d1Var3, iIntValue2);
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.f29360p;
                            int i26 = jVar.f29369d;
                            d1 d1Var4 = jVar.f29368c;
                            if (d1Var4 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar5.getClass();
                            Bundle bundle2 = new Bundle(3);
                            bundle2.putInt("legIndex", i26);
                            bundle2.putParcelable("leg", d1Var4);
                            bundle2.putInt("selectedChartType", iIntValue2);
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h hVar2 = new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h();
                            hVar2.setArguments(bundle2);
                            fragmentA = hVar2;
                        }
                        androidx.fragment.app.v supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar6.l(R.id.multisport_content_frame, fragmentA, null);
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m.getClass();
                        aVar6.d(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29313n);
                        aVar6.e();
                        return Unit.INSTANCE;
                    default:
                        int iIntValue3 = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar7 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(jVar.requireActivity()).setTitle(jVar.getString(R.string.delete_leg) + CallerData.NA);
                        int i27 = jVar.f29369d;
                        if (iIntValue3 == 0) {
                            i19 = i27 == 0 ? R.string.delete_leg_next_message : R.string.delete_leg_previous_message;
                        } else {
                            i19 = i27 == 0 ? R.string.delete_leg_next_distance_message : R.string.delete_leg_previous_distance_message;
                        }
                        title.setMessage(i19).setPositiveButton(R.string.lbl_delete, new xg1.l(jVar, 22)).setNegativeButton(R.string.lbl_cancel, new g(c15 == true ? 1 : 0)).show();
                        return Unit.INSTANCE;
                }
            }
        }));
        ap.d dVar2 = this.f29366a;
        if (dVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i19 = 1;
        dVar2.f11593e.f198237g.f198320j.f(getViewLifecycleOwner(), new b(new l(this) { // from class: zo.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j f206069b;

            {
                this.f206069b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Fragment fragmentA;
                Integer num;
                int i110;
                int i111 = i19;
                char c14 = 1;
                char c15 = 1;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j jVar = this.f206069b;
                switch (i111) {
                    case 0:
                        d1 d1Var = (d1) obj;
                        if (d1Var != null) {
                            jVar.f29368c = d1Var;
                            final j jVar2 = jVar.f29367b;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("viewHolder");
                                throw null;
                            }
                            h32.n.b bVar = jVar2.f206044g;
                            h32.n.b bVar2 = jVar2.f206043f;
                            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                            View view3 = jVar2.f206038a;
                            Context context = view3.getContext();
                            context.getClass();
                            oi0.h hVar = new oi0.h(context);
                            TextView textView = jVar2.f206042e;
                            Context context2 = view3.getContext();
                            context2.getClass();
                            textView.setText(dh.b.A(context2, d1Var.f139790f.f4360c));
                            Context context3 = view3.getContext();
                            context3.getClass();
                            l3.a aVar = l3.f23124b;
                            Context context4 = view3.getContext();
                            double d14 = d1Var.f139788d;
                            q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                            aVar.getClass();
                            SpannableStringBuilder spannableStringBuilderK = w13.b.k(context3, l3.a.N0(context4, d14, q3Var, l3.f23130h, true, view3.getContext().getString(R.string.no_value)));
                            String string = spannableStringBuilderK.toString();
                            Context context5 = view3.getContext();
                            context5.getClass();
                            String strA = oi0.c.A(context5, new z81.b(20), string);
                            TextView textView2 = bVar2.f81398b;
                            if (textView2 != null) {
                                textView2.setText(spannableStringBuilderK);
                                textView2.setContentDescription(strA);
                            }
                            bVar2.c(view3.getContext().getString(R.string.lbl_speed));
                            Context context6 = view3.getContext();
                            context6.getClass();
                            SpannableStringBuilder spannableStringBuilderK2 = w13.b.k(context6, l3.a.P(view3.getContext(), d1Var.f139787c, zY ? m3.KILOMETER : m3.MILE, l3.f23129g, true, view3.getContext().getString(R.string.no_value)));
                            String string2 = spannableStringBuilderK2.toString();
                            Context context7 = view3.getContext();
                            context7.getClass();
                            String strA2 = oi0.c.A(context7, new z81.b(21), string2);
                            TextView textView3 = bVar.f81398b;
                            if (textView3 != null) {
                                textView3.setText(spannableStringBuilderK2);
                                textView3.setContentDescription(strA2);
                            }
                            bVar.c(view3.getContext().getString(R.string.leg_distance));
                            jVar2.f206045h.b(l3.a.e1((long) d1Var.f139786b), view3.getContext().getString(R.string.lbl_multisport_leg_time), hVar.d((long) d1Var.f139786b, true));
                            jVar2.f206046i.b(l3.a.e1((long) d1Var.f139789e), view3.getContext().getString(R.string.LapList_cumulative_time_label), hVar.d((long) d1Var.f139789e, true));
                            final int i112 = 0;
                            jVar2.f206047j.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (i112) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            Button button = jVar2.f206048k;
                            final int c16 = c14 == true ? 1 : 0;
                            button.setOnClickListener(new View.OnClickListener() { // from class: zo.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    switch (c16) {
                                        case 0:
                                            j jVar3 = jVar2;
                                            e23.l<Integer, Unit> lVar = jVar3.f206040c;
                                            if (lVar != null) {
                                                lVar.invoke(Integer.valueOf(jVar3.f206050m.getCurrentItem()));
                                            }
                                            break;
                                        default:
                                            j jVar4 = jVar2;
                                            e23.l<Integer, Unit> lVar2 = jVar4.f206041d;
                                            if (lVar2 != null) {
                                                lVar2.invoke(Integer.valueOf(jVar4.f206050m.getCurrentItem()));
                                            }
                                            break;
                                    }
                                }
                            });
                            boolean z14 = d1Var.f139787c >= 10.0d;
                            if (!p005kotlin.jvm.internal.s.g(jVar2.f206052o, Boolean.valueOf(z14))) {
                                jVar2.f206052o = Boolean.valueOf(z14);
                                ViewPager2 viewPager2 = jVar2.f206050m;
                                viewPager2.setAdapter(jVar2.new a(z14));
                                viewPager2.setUserInputEnabled(false);
                                TabLayout tabLayout = jVar2.f206049l;
                                v22.e.v(tabLayout, z14);
                                TabLayoutMediator tabLayoutMediator = jVar2.f206051n;
                                if (tabLayoutMediator != null) {
                                    tabLayoutMediator.detach();
                                }
                                if (z14) {
                                    TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout, viewPager2, new xw.b(jVar2, 18));
                                    jVar2.f206051n = tabLayoutMediator2;
                                    tabLayoutMediator2.attach();
                                }
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        j jVar3 = jVar.f29367b;
                        if (jVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewHolder");
                            throw null;
                        }
                        bool.getClass();
                        jVar3.f206048k.setEnabled(bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        ap.d dVar3 = jVar.f29366a;
                        if (dVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        wo.a aVarY4 = dVar3.y4(jVar.f29369d);
                        int iIntValue2 = (aVarY4 == null || (num = aVarY4.f186397a) == null) ? 0 : num.intValue();
                        if (iIntValue == 0) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i24 = jVar.f29369d;
                            d1 d1Var2 = jVar.f29368c;
                            if (d1Var2 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar3.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i24, d1Var2, iIntValue2);
                        } else if (iIntValue != 1) {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                            int i25 = jVar.f29369d;
                            d1 d1Var3 = jVar.f29368c;
                            if (d1Var3 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar4.getClass();
                            fragmentA = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a.a(i25, d1Var3, iIntValue2);
                        } else {
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.f29360p;
                            int i26 = jVar.f29369d;
                            d1 d1Var4 = jVar.f29368c;
                            if (d1Var4 == null) {
                                p005kotlin.jvm.internal.s.m("leg");
                                throw null;
                            }
                            aVar5.getClass();
                            Bundle bundle2 = new Bundle(3);
                            bundle2.putInt("legIndex", i26);
                            bundle2.putParcelable("leg", d1Var4);
                            bundle2.putInt("selectedChartType", iIntValue2);
                            com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h hVar2 = new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h();
                            hVar2.setArguments(bundle2);
                            fragmentA = hVar2;
                        }
                        androidx.fragment.app.v supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar6.l(R.id.multisport_content_frame, fragmentA, null);
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29312m.getClass();
                        aVar6.d(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b.f29313n);
                        aVar6.e();
                        return Unit.INSTANCE;
                    default:
                        int iIntValue3 = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar7 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(jVar.requireActivity()).setTitle(jVar.getString(R.string.delete_leg) + CallerData.NA);
                        int i27 = jVar.f29369d;
                        if (iIntValue3 == 0) {
                            i110 = i27 == 0 ? R.string.delete_leg_next_message : R.string.delete_leg_previous_message;
                        } else {
                            i110 = i27 == 0 ? R.string.delete_leg_next_distance_message : R.string.delete_leg_previous_distance_message;
                        }
                        title.setMessage(i110).setPositiveButton(R.string.lbl_delete, new xg1.l(jVar, 22)).setNegativeButton(R.string.lbl_cancel, new g(c15 == true ? 1 : 0)).show();
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/j$a;", "", "<init>", "()V", "", "DIVIDE_TIME_FRAGMENT", "I", "DIVIDE_DISTANCE_FRAGMENT", "", "LEG_INDEX", "Ljava/lang/String;", "LEG", "FIRST_VALID_DISTANCE_VALUE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
