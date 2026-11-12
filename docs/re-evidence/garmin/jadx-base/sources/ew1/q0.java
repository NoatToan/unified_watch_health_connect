package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import kotlin.w3;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/q0;", "Lew1/u;", "<init>", "()V", "a", "Lorg/joda/time/LocalDate;", "currentGoalDate", "", "selectedSegmentIndex", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f66666g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f66668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f66669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f66670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f66671f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/q0$b", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            LocalDate localDateD5;
            String string;
            androidx.fragment.app.v supportFragmentManager;
            q0 q0Var = q0.this;
            q0Var.f66671f.f(false);
            if (!q0Var.w6().N6()) {
                q0Var.requireActivity().getOnBackPressedDispatcher().d();
                return;
            }
            if (q0Var.w6().f13385r1) {
                q0Var.requireActivity().getOnBackPressedDispatcher().d();
                return;
            }
            q0Var.w6().F7(null);
            androidx.fragment.app.m activity = q0Var.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.Z();
            }
            zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
            androidx.fragment.app.m mVarRequireActivity = q0Var.requireActivity();
            mVarRequireActivity.getClass();
            aw1.h hVarW6 = q0Var.w6();
            jv1.s sVarI6 = hVarW6.i6();
            if (sVarI6 == null || (localDateD5 = sVarI6.f101140s) == null) {
                localDateD5 = hVarW6.D5();
            }
            DateTime dateTime = localDateD5.toDateTime(LocalTime.now());
            dateTime.getClass();
            jv1.s sVarI7 = q0Var.w6().i6();
            ww1.v vVar = sVarI7 != null ? sVarI7.f101142u : null;
            if (q0Var.w6().O6()) {
                String string2 = q0Var.getString(R.string.lbl_ride);
                string2.getClass();
                String lowerCase = string2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                string = q0Var.getString(R.string.add_location_to_milestone_goal, lowerCase);
            } else if (q0Var.w6().e7()) {
                aw1.h hVarW7 = q0Var.w6();
                Context contextRequireContext = q0Var.requireContext();
                contextRequireContext.getClass();
                string = q0Var.getString(R.string.add_location_for_triathlon_plan, hVarW7.e6(contextRequireContext));
            } else {
                String string3 = q0Var.getString(R.string.lbl_run);
                string3.getClass();
                String lowerCase2 = string3.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                string = q0Var.getString(R.string.add_location_to_milestone_goal, lowerCase2);
            }
            String str = string;
            str.getClass();
            cVar.a(mVarRequireActivity, dateTime, vVar, str, q0Var.w6().C5("TI_LOCATION_SCREEN_TAG"), q0Var.w6().Y5());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f66673a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66673a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66674a = aVar;
            this.f66675b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66674a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66675b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66676a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66676a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public q0() {
        super(R.layout.fbt_compose_fragment);
        this.f66667b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new c(this), new e(this), new d(null, this));
        this.f66668c = o13.m.b(new n0(this, 0));
        this.f66669d = o13.m.b(new n0(this, 1));
        this.f66670e = p3.p0.n(Boolean.FALSE);
        this.f66671f = new b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, org.joda.time.base.AbstractPartial] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object, org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r12v27, types: [T, org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, java.lang.Object, org.joda.time.LocalDate] */
    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        ?? D5;
        LocalDate localDate;
        LocalDate localDate2;
        String str;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.f(this);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(R.string.set_schedule);
        b.u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f66671f, viewLifecycleOwner);
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
        o13.p<DateTime, DateTime> pVarN5 = w6().N5();
        ?? localDate3 = pVarN5.f128594a.toLocalDate();
        localDate3.getClass();
        r0Var.f105810a = localDate3;
        ?? localDate4 = pVarN5.f128595b.toLocalDate();
        localDate4.getClass();
        r0Var2.f105810a = localDate4;
        String strB = u62.z.b(R.string.complete_plan_date_question, view2);
        aw1.h hVarW6 = w6();
        boolean zV6 = hVarW6.V6();
        o13.t tVar = this.f66669d;
        if (zV6 && hVarW6.b7() && hVarW6.N6()) {
            l22.a aVar = (l22.a) this.f66668c.getValue();
            fy1.i.a aVar2 = fy1.i.f73924a;
            localDate2 = (LocalDate) tVar.getValue();
            aVar2.getClass();
            localDate2.getClass();
            if (localDate2.getYear() != LocalDate.now().getYear()) {
                str = "MMM d, yyyy";
            } else {
                str = "MMM d";
            }
            String string2 = localDate2.toString(str);
            string2.getClass();
            string = aVar.a(R.string.lbl_suggested_end_date, string2);
        } else {
            aw1.h hVarW7 = w6();
            if (hVarW7.V6() && hVarW7.O6() && hVarW7.N6() && hVarW7.S6()) {
                l22.a aVar3 = (l22.a) this.f66668c.getValue();
                fy1.i.a aVar4 = fy1.i.f73924a;
                localDate2 = (LocalDate) tVar.getValue();
                aVar4.getClass();
                localDate2.getClass();
                if (localDate2.getYear() != LocalDate.now().getYear()) {
                    str = "MMM d, yyyy";
                } else {
                    str = "MMM d";
                }
                String string3 = localDate2.toString(str);
                string3.getClass();
                string = aVar3.a(R.string.lbl_suggested_end_date, string3);
            } else if (w6().Z6() || w6().V6()) {
                string = null;
            } else {
                fy1.i.a aVar5 = fy1.i.f73924a;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                DateTime dateTimeAtStartOfDay = ((LocalDate) r0Var.f105810a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                DateTime dateTimeAtStartOfDay2 = ((LocalDate) r0Var2.f105810a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                aVar5.getClass();
                string = view2.getContext().getString(R.string.ideal_date_window_range, fy1.i.a.j(contextRequireContext, dateTimeAtStartOfDay, dateTimeAtStartOfDay2));
            }
        }
        String str2 = string;
        p005kotlin.jvm.internal.r0 r0Var3 = new p005kotlin.jvm.internal.r0();
        aw1.h hVarW8 = w6();
        jv1.s sVarI6 = hVarW8.i6();
        if (sVarI6 == null || (localDate = sVarI6.f101140s) == null) {
            D5 = localDate;
            D5 = hVarW8.D5();
        }
        D5 = localDate;
        r0Var3.f105810a = D5;
        if (D5.isBefore((ReadablePartial) r0Var.f105810a) || ((LocalDate) r0Var3.f105810a).isAfter((ReadablePartial) r0Var2.f105810a)) {
            r0Var3.f105810a = (LocalDate) tVar.getValue();
        }
        View viewFindViewById = view2.findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(1293757420, true, new o0(this, strB, str2, r0Var, r0Var2, r0Var3, 0)));
    }

    public final aw1.h w6() {
        return (aw1.h) this.f66667b.getValue();
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTGoalDateSelectionFragmentCompose";
    }

    public final void y6(LocalDate localDate) {
        aw1.h hVarW6 = w6();
        hVarW6.F7(localDate);
        if (hVarW6.f13385r1) {
            requireActivity().getOnBackPressedDispatcher().d();
        } else {
            fy1.i.f73924a.getClass();
            boolean zD = bo1.a.a().c().D();
            boolean z14 = false;
            boolean z15 = hVarW6.O6() && hVarW6.N6();
            Double dZ5 = hVarW6.Z5();
            if (zf.b.D(dZ5) && dZ5.doubleValue() > 0.0d) {
                z14 = true;
            }
            if (zD && z15 && z14 && !hVarW6.a7()) {
                hVarW6.s6().j("FBTAddCourseFragment");
            } else {
                hVarW6.k7();
            }
        }
        fy1.c.f73884a.getClass();
        fy1.c.b("GarminCoachPlanEndDateSelected");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/q0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
