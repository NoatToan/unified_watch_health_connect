package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
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
import mt0.j3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37401h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f37403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.u f37404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f37406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final js0.d f37407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f37408g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/d$b", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            d dVar = d.this;
            if (!dVar.f37405d) {
                zt0.a aVar = (zt0.a) dVar.f37402a.getValue();
                aVar.f206931b.f37996j = -1;
                aVar.f206935f = null;
            }
            dVar.f37408g.f(false);
            dVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/d$c", "Lmt0/j3;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements j3 {
        public c() {
        }

        @Override // mt0.j3
        public final void a(com.garmin.android.apps.connectmobile.leaderboard.model.u uVar) {
            d dVar = d.this;
            if (uVar == null) {
                AppCompatButton appCompatButton = dVar.f37403b;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(false);
                    return;
                }
                return;
            }
            dVar.f37404c = uVar;
            AppCompatButton appCompatButton2 = dVar.f37403b;
            if (appCompatButton2 != null) {
                appCompatButton2.setEnabled(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0670d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0670d(Fragment fragment) {
            super(0);
            this.f37411a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37411a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37412a = aVar;
            this.f37413b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37412a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37413b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f37414a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37414a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d() {
        super(R.layout.adhoc_challenge_duration_select_fragment);
        this.f37402a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new C0670d(this), new f(this), new e(null, this));
        this.f37406e = new c();
        this.f37407f = new js0.d(this, 24);
        this.f37408g = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z14 = false;
        if (arguments != null && arguments.getBoolean("ARGS_IS_FROM_CONFIRM_PAGE")) {
            z14 = true;
        }
        this.f37405d = z14;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws Exception {
        super.onDestroyView();
        this.f37408g.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.duration_type_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new mt0.r(((zt0.a) this.f37402a.getValue()).f206936g, this.f37406e));
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(R.id.next_button);
        this.f37403b = appCompatButton;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(this.f37407f);
        }
        AppCompatButton appCompatButton2 = this.f37403b;
        if (appCompatButton2 != null) {
            appCompatButton2.setEnabled(false);
        }
        requireActivity().getOnBackPressedDispatcher().a(this.f37408g);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, R.string.workout_set_duration);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
