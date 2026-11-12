package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f37586j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f37588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f37589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuItem f37592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f37593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final js0.d f37594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f37595i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/i$a;", "", "", "displayName", "", "monthIndex", "<init>", "(Ljava/lang/String;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37597b;

        public a(String str, int i14) {
            str.getClass();
            this.f37596a = str;
            this.f37597b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37596a.equals(aVar.f37596a) && this.f37597b == aVar.f37597b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f37597b) + (this.f37596a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.e(this.f37597b, "AdHocChallengeMonth(displayName=", this.f37596a, ", monthIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/i$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            i iVar = i.this;
            iVar.f37595i.f(false);
            iVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/i$d", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/k0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements k0 {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.k0
        public final void a(a aVar) {
            i iVar = i.this;
            if (aVar == null) {
                b bVar = i.f37586j;
                iVar.u6(false);
                return;
            }
            int i14 = aVar.f37597b;
            b bVar2 = i.f37586j;
            Integer num = ((zt0.a) iVar.f37587a.getValue()).f206935f;
            iVar.u6(num == null || i14 != num.intValue());
            iVar.f37589c = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37600a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f37600a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37600a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37602b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37601a = aVar;
            this.f37602b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37601a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37602b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37603a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37603a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i() {
        super(R.layout.adhoc_challenge_month_select_fragment);
        this.f37587a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new e(this), new g(this), new f(null, this));
        this.f37593g = new d();
        this.f37594h = new js0.d(this, 28);
        this.f37595i = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z14 = false;
        this.f37590d = arguments != null && arguments.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE");
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("ARGS_IS_DURATION_TYPE_CHANGED")) {
            z14 = true;
        }
        this.f37591e = z14;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws Exception {
        super.onDestroyView();
        this.f37595i.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.month_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new h(this.f37591e ? Integer.valueOf(DateTime.now().getMonthOfYear()) : ((zt0.a) this.f37587a.getValue()).f206935f, this.f37593g));
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(R.id.next_button);
        this.f37588b = appCompatButton;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(this.f37594h);
        }
        u6(false);
        AppCompatButton appCompatButton2 = this.f37588b;
        if (appCompatButton2 != null) {
            v22.e.r(appCompatButton2, !this.f37590d);
        }
        requireActivity().getOnBackPressedDispatcher().a(this.f37595i);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, R.string.lbl_select_month);
        }
        if (this.f37590d) {
            androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
            mt0.b0 b0Var = new mt0.b0(this);
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            mVarRequireActivity2.addMenuProvider(b0Var, viewLifecycleOwner, androidx.lifecycle.b0.b.RESUMED);
        }
    }

    public final void u6(boolean z14) {
        AppCompatButton appCompatButton = this.f37588b;
        if (appCompatButton != null) {
            appCompatButton.setEnabled(z14);
        }
        MenuItem menuItem = this.f37592f;
        if (menuItem != null) {
            menuItem.setEnabled(z14);
        }
    }

    public final void v6() {
        DateTime dateTimeWithDate;
        a aVar = this.f37589c;
        if (aVar != null) {
            int i14 = aVar.f37597b;
            DateTime dateTimeNow = DateTime.now();
            int monthOfYear = dateTimeNow.getMonthOfYear();
            DateTime dateTimeWithDate2 = i14 < monthOfYear ? dateTimeNow.withDate(dateTimeNow.getYear() + 1, i14, 1) : dateTimeNow.withDate(dateTimeNow.getYear(), i14, 1);
            c22.j0 j0Var = c22.j0.f23099a;
            dateTimeWithDate2.getClass();
            j0Var.getClass();
            DateTime dateTimeS = c22.j0.S(dateTimeWithDate2);
            if (i14 < monthOfYear) {
                int year = dateTimeNow.getYear() + 1;
                DateTime dateTimeWithMaximumValue = dateTimeS.dayOfMonth().withMaximumValue();
                dateTimeWithMaximumValue.getClass();
                dateTimeWithDate = dateTimeNow.withDate(year, i14, dateTimeWithMaximumValue.getDayOfMonth());
            } else {
                int year2 = dateTimeNow.getYear();
                DateTime dateTimeWithMaximumValue2 = dateTimeS.dayOfMonth().withMaximumValue();
                dateTimeWithMaximumValue2.getClass();
                dateTimeWithDate = dateTimeNow.withDate(year2, i14, dateTimeWithMaximumValue2.getDayOfMonth());
            }
            dateTimeWithDate.getClass();
            DateTime dateTimeQ = c22.j0.Q(dateTimeWithDate);
            w1 w1Var = this.f37587a;
            ((zt0.a) w1Var.getValue()).z4(dateTimeS, dateTimeQ);
            ((zt0.a) w1Var.getValue()).f206935f = Integer.valueOf(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/i$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
