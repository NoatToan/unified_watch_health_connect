package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.l.d;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.l.e;
import com.garmin.android.apps.connectmobile.z1;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f37644h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f37646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MaterialCalendarView f37647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f37648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f37649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f37650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f37651g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        START_DATE,
        END_DATE
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37656b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.u.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.ONE_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEKEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37655a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.START_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[a.END_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f37656b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/l$d", "Lxz2/j;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xz2.j {
        public d() {
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            if (bVar != null) {
                l lVar = l.this;
                MaterialCalendarView materialCalendarView = lVar.f37647c;
                if (materialCalendarView == null) {
                    p005kotlin.jvm.internal.s.m("calendar");
                    throw null;
                }
                xz2.b minimumDate = materialCalendarView.getMinimumDate();
                MaterialCalendarView materialCalendarView2 = lVar.f37647c;
                if (materialCalendarView2 == null) {
                    p005kotlin.jvm.internal.s.m("calendar");
                    throw null;
                }
                xz2.b maximumDate = materialCalendarView2.getMaximumDate();
                if ((minimumDate == null || !minimumDate.h(bVar)) && ((maximumDate == null || !maximumDate.i(bVar)) && new DateTime(bVar.g()).getDayOfWeek() != 6)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            kVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/l$e", "Lxz2/j;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements xz2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f37658a;

        public e() {
            MaterialCalendarView materialCalendarView = l.this.f37647c;
            if (materialCalendarView == null) {
                p005kotlin.jvm.internal.s.m("calendar");
                throw null;
            }
            Context context = materialCalendarView.getContext();
            if (context != null) {
                this.f37658a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            MaterialCalendarView materialCalendarView = l.this.f37647c;
            if (materialCalendarView != null) {
                return bVar.equals(materialCalendarView.getSelectedDate());
            }
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }

        @Override // xz2.j
        public final void b(xz2.k kVar) {
            Drawable drawable = this.f37658a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f37660a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37660a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37661a = aVar;
            this.f37662b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37661a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37662b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f37663a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37663a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public l() {
        super(R.layout.adb_hoc_challenge_calendar_fragment);
        this.f37645a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new f(this), new h(this), new g(null, this));
        final int i14 = 0;
        this.f37650f = o13.m.b(new e23.a(this) { // from class: mt0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.l f120655b;

            {
                this.f120655b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.l lVar = this.f120655b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b bVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h;
                        return lVar.new e();
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b bVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h;
                        return lVar.new d();
                }
            }
        });
        final int i15 = 1;
        this.f37651g = o13.m.b(new e23.a(this) { // from class: mt0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.l f120655b;

            {
                this.f120655b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.l lVar = this.f120655b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b bVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h;
                        return lVar.new e();
                    default:
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b bVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h;
                        return lVar.new d();
                }
            }
        });
    }

    public final void A6() {
        DateTime dateTime = this.f37649e;
        if (dateTime == null) {
            requireActivity().getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AdHocChallengeCalendarSelectFragment", "selectedDate must NOT be NULL");
            return;
        }
        int i14 = c.f37655a[z6().f206936g.ordinal()];
        if (i14 == 1) {
            DateTime dateTimeMinusMillis = dateTime.plusDays(1).minusMillis(1);
            zt0.a aVarZ6 = z6();
            dateTimeMinusMillis.getClass();
            aVarZ6.z4(dateTime, dateTimeMinusMillis);
            return;
        }
        if (i14 == 2) {
            DateTime dateTimeMinusMillis2 = dateTime.plusDays(7).minusMillis(1);
            zt0.a aVarZ7 = z6();
            dateTimeMinusMillis2.getClass();
            aVarZ7.z4(dateTime, dateTimeMinusMillis2);
            return;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                DateTime dateTimeMinusMillis3 = dateTime.plusDays(2).minusMillis(1);
                zt0.a aVarZ8 = z6();
                dateTimeMinusMillis3.getClass();
                aVarZ8.z4(dateTime, dateTimeMinusMillis3);
                return;
            }
            if (i14 == 5) {
                DateTime dateTimeMinusMillis4 = dateTime.plusDays(30).minusMillis(1);
                zt0.a aVarZ9 = z6();
                dateTimeMinusMillis4.getClass();
                aVarZ9.z4(dateTime, dateTimeMinusMillis4);
                return;
            }
            requireActivity().getClass();
            String str = "Wrong durationType: " + z6().f206936g;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AdHocChallengeCalendarSelectFragment", str);
            return;
        }
        int i15 = c.f37656b[u6().ordinal()];
        if (i15 == 1) {
            androidx.fragment.app.v supportFragmentManager = requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            a aVar4 = a.END_DATE;
            Bundle arguments = getArguments();
            aVar3.l(R.id.content_frame, b.a(f37644h, aVar4, dateTime, arguments != null ? arguments.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE") : false, false, 8), "FEATURE_FRAGMENT");
            aVar3.d(null);
            aVar3.e();
            return;
        }
        if (i15 != 2) {
            lc.u0.r();
            return;
        }
        DateTime dateTimeV6 = v6();
        if (dateTimeV6 == null) {
            requireActivity().getClass();
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var3, "AdHocChallengeCalendarSelectFragment", "StartDate should not be null");
            return;
        }
        DateTime dateTimeA = g22.k.A(dateTime);
        if (!dateTimeA.isBefore(dateTimeV6)) {
            z6().z4(dateTimeV6, dateTimeA);
            return;
        }
        requireActivity().getClass();
        i2.a aVar6 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var4, "AdHocChallengeCalendarSelectFragment", "End Date should not be before start date");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MaterialCalendarView materialCalendarView = this.f37647c;
        if (materialCalendarView == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        DateTime dateTime = this.f37649e;
        materialCalendarView.setSelectedDate(xz2.b.d(dateTime != null ? dateTime.toDate() : null));
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01fd  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Date date;
        DateTime dateTimePlusDays;
        Date date2;
        List listC;
        String string;
        String string2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f37649e = w6();
        TextView textView = (TextView) view2.findViewById(R.id.description);
        if (textView != null) {
            int i14 = c.f37656b[u6().ordinal()];
            if (i14 == 1) {
                string2 = getString(R.string.lbl_select_challenge_start_date);
            } else {
                if (i14 != 2) {
                    lc.u0.r();
                    return;
                }
                string2 = getString(R.string.lbl_select_challenge_end_date);
            }
            textView.setText(string2);
        }
        View viewFindViewById = view2.findViewById(R.id.next_button);
        viewFindViewById.getClass();
        this.f37646b = (Button) viewFindViewById;
        boolean zY6 = y6();
        Button button = this.f37646b;
        if (zY6) {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("nextBtn");
                throw null;
            }
            button.setVisibility(0);
            Button button2 = this.f37646b;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("nextBtn");
                throw null;
            }
            button2.setOnClickListener(new mt0.h0(this, 0));
            Button button3 = this.f37646b;
            if (button3 == null) {
                p005kotlin.jvm.internal.s.m("nextBtn");
                throw null;
            }
            button3.setEnabled(this.f37649e != null);
        } else {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("nextBtn");
                throw null;
            }
            button.setVisibility(8);
        }
        View viewFindViewById2 = view2.findViewById(R.id.date_calendar);
        viewFindViewById2.getClass();
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) viewFindViewById2;
        this.f37647c = materialCalendarView;
        materialCalendarView.setShowOtherDates(6);
        DateTime dateTimeV6 = v6();
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        a aVarU6 = u6();
        a aVar = a.END_DATE;
        if (aVarU6 == aVar && dateTimeV6 != null) {
            date = dateTimeV6.withTimeAtStartOfDay().isBefore(dateTimeWithTimeAtStartOfDay) ? dateTimeWithTimeAtStartOfDay.toDate() : dateTimeV6.withTimeAtStartOfDay().toDate();
        } else if (z6().f206936g == com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEKEND) {
            dateTimeWithTimeAtStartOfDay.getClass();
            if (dateTimeWithTimeAtStartOfDay.getDayOfWeek() >= 6) {
                dateTimePlusDays = dateTimeWithTimeAtStartOfDay.minusDays(dateTimeWithTimeAtStartOfDay.getDayOfWeek() - 6);
                dateTimePlusDays.getClass();
            } else {
                dateTimePlusDays = dateTimeWithTimeAtStartOfDay.plusDays(6 - dateTimeWithTimeAtStartOfDay.getDayOfWeek());
                dateTimePlusDays.getClass();
            }
            date = dateTimePlusDays.toDate();
        } else if (z6().f206936g == com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEK) {
            date = dateTimeWithTimeAtStartOfDay.minusDays(6).toDate();
        } else {
            date = z6().f206936g == com.garmin.android.apps.connectmobile.leaderboard.model.u.CUSTOM ? dateTimeWithTimeAtStartOfDay.withDayOfMonth(dateTimeWithTimeAtStartOfDay.dayOfMonth().getMinimumValue()).toDate() : DateTime.now().withTimeAtStartOfDay().toDate();
        }
        if (u6() != aVar || dateTimeV6 == null) {
            date2 = z6().f206936g == com.garmin.android.apps.connectmobile.leaderboard.model.u.WEEKEND ? new DateTime(date).plusDays(365).withTimeAtStartOfDay().toDate() : new DateTime(dateTimeWithTimeAtStartOfDay).plusDays(365).withTimeAtStartOfDay().toDate();
        } else {
            date2 = new DateTime(dateTimeV6).plusDays(59).withTimeAtStartOfDay().toDate();
        }
        MaterialCalendarView materialCalendarView2 = this.f37647c;
        if (materialCalendarView2 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        ArrayList<xz2.j> arrayList = materialCalendarView2.f54756k;
        arrayList.clear();
        xz2.e<?> eVar = materialCalendarView2.f54751f;
        eVar.f192885o = arrayList;
        eVar.e();
        MaterialCalendarView materialCalendarView3 = this.f37647c;
        if (materialCalendarView3 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        z6();
        int i15 = c.f37655a[z6().f206936g.ordinal()];
        o13.t tVar = this.f37650f;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            listC = p13.w.c((e) tVar.getValue());
        } else if (i15 == 4) {
            listC = p13.x.k((e) tVar.getValue(), (d) this.f37651g.getValue());
        } else if (i15 != 5) {
            String str = "Unsupported challenge duration type: " + z6().f206936g;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "AdHocChallengeCalendarSelectFragment", str);
            listC = p13.w.c((e) tVar.getValue());
        } else {
            listC = p13.w.c((e) tVar.getValue());
        }
        ArrayList<xz2.j> arrayList2 = materialCalendarView3.f54756k;
        if (listC != null) {
            arrayList2.addAll(listC);
            xz2.e<?> eVar2 = materialCalendarView3.f54751f;
            eVar2.f192885o = arrayList2;
            eVar2.e();
        }
        MaterialCalendarView materialCalendarView4 = this.f37647c;
        if (materialCalendarView4 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        MaterialCalendarView.h hVarA = materialCalendarView4.A.a();
        hVarA.f54800d = xz2.b.d(date);
        hVarA.f54801e = xz2.b.d(date2);
        hVarA.a();
        MaterialCalendarView materialCalendarView5 = this.f37647c;
        if (materialCalendarView5 == null) {
            p005kotlin.jvm.internal.s.m("calendar");
            throw null;
        }
        materialCalendarView5.setOnDateChangedListener(new mn2.e(this, 27));
        if (!y6()) {
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mt0.j0 j0Var = new mt0.j0(this);
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            mVarRequireActivity.addMenuProvider(j0Var, viewLifecycleOwner, androidx.lifecycle.b0.b.RESUMED);
        }
        int i16 = c.f37656b[u6().ordinal()];
        if (i16 == 1) {
            string = getString(R.string.lbl_set_start_date);
        } else {
            if (i16 != 2) {
                lc.u0.r();
                return;
            }
            string = getString(R.string.lbl_set_end_date);
        }
        string.getClass();
        androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
        z1 z1Var = mVarRequireActivity2 instanceof z1 ? (z1) mVarRequireActivity2 : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, string);
        }
    }

    public final a u6() {
        a aVar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("ARGS_DATE_TYPE");
            try {
                aVar = a.values()[i14];
            } catch (Exception unused) {
                String strF = v.e0.f(i14, "Wrong CalendarDateType ordinal: ", ", return START_DATE as default");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "AdHocChallengeCalendarSelectFragment", strF);
                aVar = a.START_DATE;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return a.START_DATE;
    }

    public final DateTime v6() {
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable2 = arguments != null ? arguments.getSerializable("ARGS_SELECTED_CUSTOM_START_DATE") : null;
            serializable = (DateTime) (serializable2 instanceof DateTime ? serializable2 : null);
        } else if (arguments != null) {
            serializable = arguments.getSerializable("ARGS_SELECTED_CUSTOM_START_DATE", DateTime.class);
        }
        return (DateTime) serializable;
    }

    public final DateTime w6() {
        if (u6() != a.START_DATE) {
            return null;
        }
        Bundle arguments = getArguments();
        if (!(arguments != null ? arguments.getBoolean("ARGS_IS_DURATION_TYPE_CHANGED") : false)) {
            return z6().f206933d;
        }
        int i14 = c.f37655a[z6().f206936g.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return DateTime.now().withTimeAtStartOfDay();
        }
        return null;
    }

    public final boolean y6() {
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE") : false) {
            Bundle arguments2 = getArguments();
            if ((arguments2 != null ? arguments2.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE") : false) && z6().f206936g == com.garmin.android.apps.connectmobile.leaderboard.model.u.CUSTOM) {
                if (u6() == a.START_DATE) {
                }
            }
            return false;
        }
        return true;
    }

    public final zt0.a z6() {
        return (zt0.a) this.f37645a.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARGS_DATE_TYPE", "ARGS_SELECTED_CUSTOM_START_DATE", "", "CUSTOM_DURATION_INTERVAL_DAYS", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(b bVar, a aVar, DateTime dateTime, boolean z14, boolean z15, int i14) {
            if ((i14 & 1) != 0) {
                aVar = a.START_DATE;
            }
            if ((i14 & 2) != 0) {
                dateTime = null;
            }
            if ((i14 & 8) != 0) {
                z15 = false;
            }
            bVar.getClass();
            aVar.getClass();
            l lVar = new l();
            lVar.setArguments(h7.c.a(new o13.p("ARGS_DATE_TYPE", Integer.valueOf(aVar.ordinal())), new o13.p("ARGS_SELECTED_CUSTOM_START_DATE", dateTime), new o13.p("ARGS_IS_FROM_CONFIRM_PAGE", Boolean.valueOf(z14)), new o13.p("ARGS_IS_DURATION_TYPE_CHANGED", Boolean.valueOf(z15))));
            return lVar;
        }

        private b() {
        }
    }
}
