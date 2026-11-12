package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import java.util.List;
import mt0.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/i0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/s;", "selectedItem", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37604i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatButton f37606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.s f37608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hi0.a f37609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f37610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f37611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mt0.h0 f37612h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37613a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.s.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f37613a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/i0$c", "", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public c() {
        }

        public final void a(com.garmin.android.apps.connectmobile.leaderboard.model.s sVar) {
            sVar.getClass();
            i0 i0Var = i0.this;
            i0Var.f37608d = sVar;
            AppCompatButton appCompatButton = i0Var.f37606b;
            if (appCompatButton != null) {
                appCompatButton.setEnabled(true);
            }
            String str = "onChallengeActivityTypeSelected currentSelectActivityType = " + i0Var.f37608d;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "NewCreateChallengeSelectTypeFragment", str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f37615a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37615a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37616a = aVar;
            this.f37617b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37616a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37617b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f37618a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37618a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i0() {
        super(R.layout.new_create_challenge_select_type_fragment);
        this.f37605a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(zt0.a.class), new d(this), new f(this), new e(null, this));
        this.f37607c = x.v();
        this.f37611g = new c();
        this.f37612h = new mt0.h0(this, 5);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        hi0.a aVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER", hi0.a.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER");
                parcelable = (hi0.a) (parcelable2 instanceof hi0.a ? parcelable2 : null);
            }
            aVar = (hi0.a) parcelable;
        }
        this.f37609e = aVar;
        if (arguments == null || !arguments.containsKey("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER_WHEELCHAIR_MODE")) {
            return;
        }
        this.f37610f = Boolean.valueOf(arguments.getBoolean("ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER_WHEELCHAIR_MODE"));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        List listK;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(((zt0.a) this.f37605a.getValue()).f206931b.f37989c);
        Boolean bool = this.f37610f;
        boolean z14 = this.f37607c;
        if (bool != null) {
            if (bool.booleanValue() && z14) {
                listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
            } else if (bool.booleanValue() || !z14) {
                listK = (!bool.booleanValue() || z14) ? p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f) : p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
            } else {
                listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
            }
            if (listK == null) {
                if (z14) {
                    listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
                } else {
                    listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
                }
            }
        } else if (z14) {
            listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
        } else {
            listK = p13.x.k(com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e, com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f);
        }
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(R.id.next_button);
        this.f37606b = appCompatButton;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(this.f37612h);
        }
        AppCompatButton appCompatButton2 = this.f37606b;
        if (appCompatButton2 != null) {
            appCompatButton2.setEnabled(false);
        }
        ((ComposeView) view2.findViewById(R.id.challenge_type_list)).setContent(new z3.e(704484830, true, new f3(listK, sVarB, this, 0)));
        if (sVarB != null) {
            if (!listK.contains(sVarB)) {
                sVarB = (com.garmin.android.apps.connectmobile.leaderboard.model.s) listK.get(0);
            }
            this.f37611g.a(sVarB);
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, R.string.social_new_challenge);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/i0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER", "ARGS_AD_HOC_CHALLENGE_SELECTED_FOLLOWER_WHEELCHAIR_MODE", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
