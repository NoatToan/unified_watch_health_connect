package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import e23.l;
import java.util.Date;
import java.util.List;
import lp2.h;
import lx0.i;
import lx0.k;
import o13.m;
import o13.n;
import o13.t;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.w;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "c", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f39132l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39135c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39136d = c.values().length;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39137e = m.a(n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f39138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f39139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f39140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f39141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f39142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0694d f39143k;

    public interface b {
        void g(int i14, String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/d$c;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        CycleType(1),
        PeriodDate(2),
        PeriodLength(3),
        CycleLength(4),
        Contraception(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39150a;

        c(int i14) {
            this.f39150a = i14;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/d$d", "Lb/s;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0694d extends s {
        public C0694d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = d.f39132l;
            d dVar = d.this;
            if (dVar.getChildFragmentManager().M() > 1) {
                dVar.getChildFragmentManager().Z();
                dVar.f39135c--;
                dVar.y6();
                return;
            }
            q1.b bVar = q1.f41066b;
            String string = dVar.getString(R.string.mct_leave_setup);
            string.getClass();
            String string2 = dVar.getString(R.string.mct_answers_wont_be_saved);
            string2.getClass();
            h hVar = new h(dVar, 20);
            bVar.getClass();
            q1 q1VarC = q1.b.c(string, string2, R.string.lbl_leave, R.string.mct_dont_leave, hVar);
            v childFragmentManager = dVar.getChildFragmentManager();
            childFragmentManager.getClass();
            q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39152a;

        public e(l lVar) {
            lVar.getClass();
            this.f39152a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f39152a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39152a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39153a;

        public f(Fragment fragment) {
            this.f39153a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f39153a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f39158e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f39154a = fragment;
            this.f39155b = qualifier;
            this.f39156c = aVar;
            this.f39157d = aVar2;
            this.f39158e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f39156c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f39154a;
            e23.a aVar = this.f39157d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f39155b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f39158e, 4, null);
        }
    }

    public d() {
        final int i14 = 0;
        this.f39133a = m.b(new e23.a(this) { // from class: lx0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115154b;

            {
                this.f115154b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115154b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments = dVar.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("DETAILS_KEY", true) : true);
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments2 = dVar.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("FROM_STOP_TRACKING_KEY", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        return dVar.requireActivity().getOnBackPressedDispatcher();
                }
            }
        });
        final int i15 = 1;
        this.f39134b = m.b(new e23.a(this) { // from class: lx0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115154b;

            {
                this.f115154b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115154b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments = dVar.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("DETAILS_KEY", true) : true);
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments2 = dVar.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("FROM_STOP_TRACKING_KEY", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        return dVar.requireActivity().getOnBackPressedDispatcher();
                }
            }
        });
        final int i16 = 2;
        this.f39142j = m.b(new e23.a(this) { // from class: lx0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115154b;

            {
                this.f115154b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115154b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments = dVar.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("DETAILS_KEY", true) : true);
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Bundle arguments2 = dVar.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("FROM_STOP_TRACKING_KEY", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        return dVar.requireActivity().getOnBackPressedDispatcher();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f39138f = context instanceof e1 ? (e1) context : null;
        this.f39139g = context instanceof b ? (b) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39143k = new C0694d();
        u uVar = (u) this.f39142j.getValue();
        C0694d c0694d = this.f39143k;
        if (c0694d == null) {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
        uVar.b(c0694d, this);
        k kVarU6 = u6();
        kVarU6.getClass();
        ge1.b.T(kVarU6, null, null, new i(kVarU6, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_mct_setup, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y6();
        final int i14 = 0;
        dh.b.L(u6().f115199o, this, new e(new l(this) { // from class: lx0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115156b;

            {
                this.f115156b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115156b;
                switch (i15) {
                    case 0:
                        cx0.a aVar = (cx0.a) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (aVar != null) {
                            Throwable th3 = aVar.f56600b;
                            if (th3 == null) {
                                sn.a.o(f12.l.f68084a, true);
                                SharedPreferences sharedPreferences = i52.a.f91797b;
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                i52.a aVar3 = i52.a.f91796a;
                                aVar3.getClass();
                                editorEdit.putLong(i52.a.c(R.string.key_inactive_report_timestamp), -1L).apply();
                                aVar3.getClass();
                                sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_myday_resume_dialog), false).apply();
                                if (((Boolean) dVar.f39134b.getValue()).booleanValue()) {
                                    ax0.a aVar4 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                                    Context contextRequireContext = dVar.requireContext();
                                    contextRequireContext.getClass();
                                    aVar4.y(contextRequireContext);
                                } else {
                                    Intent intent = new Intent();
                                    intent.putExtra("GO_TO_DETAILS_KEY", ((Boolean) dVar.f39133a.getValue()).booleanValue());
                                    e1 e1Var = dVar.f39138f;
                                    if (e1Var != null) {
                                        e1Var.onFragmentFinished(-1, intent);
                                    }
                                }
                            } else if (!aVar.f56602d) {
                                HttpException httpException = th3 instanceof HttpException ? (HttpException) th3 : null;
                                if (httpException == null || httpException.code() != 412) {
                                    Toast.makeText(dVar.requireContext(), R.string.txt_error_occurred, 0).show();
                                } else {
                                    DataStorageConsentActivity.a aVar5 = DataStorageConsentActivity.f32194t;
                                    Context contextRequireContext2 = dVar.requireContext();
                                    contextRequireContext2.getClass();
                                    DataStorageConsentActivity.a.c(aVar5, contextRequireContext2);
                                }
                                aVar.f56602d = true;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            g22.e.l(dVar);
                        } else {
                            g22.e.f(dVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        w61.f fVar = (w61.f) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        fVar.getClass();
                        Integer num = (Integer) fVar.a();
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Button button = dVar.f39140h;
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("mTakeABreakButton");
                                throw null;
                            }
                            button.setVisibility(iIntValue);
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.b bVar = dVar.f39139g;
                            if (iIntValue == 0) {
                                if (bVar != null) {
                                    String string = dVar.getString(R.string.pregnancy_cycle_tracking);
                                    string.getClass();
                                    bVar.g(3, string);
                                }
                                Button button2 = dVar.f39141i;
                                if (button2 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button2.setText(dVar.getString(R.string.pregnancy_continue_tracking));
                            } else {
                                if (bVar != null) {
                                    String string2 = dVar.getString(R.string.mct_setup);
                                    string2.getClass();
                                    bVar.g(2, string2);
                                }
                                Button button3 = dVar.f39141i;
                                if (button3 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button3.setText(dVar.getString(R.string.lbl_next));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        dh.b.L(u6().f115200p, this, new e(new l(this) { // from class: lx0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115156b;

            {
                this.f115156b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115156b;
                switch (i16) {
                    case 0:
                        cx0.a aVar = (cx0.a) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (aVar != null) {
                            Throwable th3 = aVar.f56600b;
                            if (th3 == null) {
                                sn.a.o(f12.l.f68084a, true);
                                SharedPreferences sharedPreferences = i52.a.f91797b;
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                i52.a aVar3 = i52.a.f91796a;
                                aVar3.getClass();
                                editorEdit.putLong(i52.a.c(R.string.key_inactive_report_timestamp), -1L).apply();
                                aVar3.getClass();
                                sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_myday_resume_dialog), false).apply();
                                if (((Boolean) dVar.f39134b.getValue()).booleanValue()) {
                                    ax0.a aVar4 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                                    Context contextRequireContext = dVar.requireContext();
                                    contextRequireContext.getClass();
                                    aVar4.y(contextRequireContext);
                                } else {
                                    Intent intent = new Intent();
                                    intent.putExtra("GO_TO_DETAILS_KEY", ((Boolean) dVar.f39133a.getValue()).booleanValue());
                                    e1 e1Var = dVar.f39138f;
                                    if (e1Var != null) {
                                        e1Var.onFragmentFinished(-1, intent);
                                    }
                                }
                            } else if (!aVar.f56602d) {
                                HttpException httpException = th3 instanceof HttpException ? (HttpException) th3 : null;
                                if (httpException == null || httpException.code() != 412) {
                                    Toast.makeText(dVar.requireContext(), R.string.txt_error_occurred, 0).show();
                                } else {
                                    DataStorageConsentActivity.a aVar5 = DataStorageConsentActivity.f32194t;
                                    Context contextRequireContext2 = dVar.requireContext();
                                    contextRequireContext2.getClass();
                                    DataStorageConsentActivity.a.c(aVar5, contextRequireContext2);
                                }
                                aVar.f56602d = true;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            g22.e.l(dVar);
                        } else {
                            g22.e.f(dVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        w61.f fVar = (w61.f) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        fVar.getClass();
                        Integer num = (Integer) fVar.a();
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Button button = dVar.f39140h;
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("mTakeABreakButton");
                                throw null;
                            }
                            button.setVisibility(iIntValue);
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.b bVar = dVar.f39139g;
                            if (iIntValue == 0) {
                                if (bVar != null) {
                                    String string = dVar.getString(R.string.pregnancy_cycle_tracking);
                                    string.getClass();
                                    bVar.g(3, string);
                                }
                                Button button2 = dVar.f39141i;
                                if (button2 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button2.setText(dVar.getString(R.string.pregnancy_continue_tracking));
                            } else {
                                if (bVar != null) {
                                    String string2 = dVar.getString(R.string.mct_setup);
                                    string2.getClass();
                                    bVar.g(2, string2);
                                }
                                Button button3 = dVar.f39141i;
                                if (button3 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button3.setText(dVar.getString(R.string.lbl_next));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        dh.b.L((y0) u6().f115201q.getValue(), this, new e(new l(this) { // from class: lx0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115156b;

            {
                this.f115156b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115156b;
                switch (i17) {
                    case 0:
                        cx0.a aVar = (cx0.a) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (aVar != null) {
                            Throwable th3 = aVar.f56600b;
                            if (th3 == null) {
                                sn.a.o(f12.l.f68084a, true);
                                SharedPreferences sharedPreferences = i52.a.f91797b;
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                i52.a aVar3 = i52.a.f91796a;
                                aVar3.getClass();
                                editorEdit.putLong(i52.a.c(R.string.key_inactive_report_timestamp), -1L).apply();
                                aVar3.getClass();
                                sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_myday_resume_dialog), false).apply();
                                if (((Boolean) dVar.f39134b.getValue()).booleanValue()) {
                                    ax0.a aVar4 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                                    Context contextRequireContext = dVar.requireContext();
                                    contextRequireContext.getClass();
                                    aVar4.y(contextRequireContext);
                                } else {
                                    Intent intent = new Intent();
                                    intent.putExtra("GO_TO_DETAILS_KEY", ((Boolean) dVar.f39133a.getValue()).booleanValue());
                                    e1 e1Var = dVar.f39138f;
                                    if (e1Var != null) {
                                        e1Var.onFragmentFinished(-1, intent);
                                    }
                                }
                            } else if (!aVar.f56602d) {
                                HttpException httpException = th3 instanceof HttpException ? (HttpException) th3 : null;
                                if (httpException == null || httpException.code() != 412) {
                                    Toast.makeText(dVar.requireContext(), R.string.txt_error_occurred, 0).show();
                                } else {
                                    DataStorageConsentActivity.a aVar5 = DataStorageConsentActivity.f32194t;
                                    Context contextRequireContext2 = dVar.requireContext();
                                    contextRequireContext2.getClass();
                                    DataStorageConsentActivity.a.c(aVar5, contextRequireContext2);
                                }
                                aVar.f56602d = true;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            g22.e.l(dVar);
                        } else {
                            g22.e.f(dVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        w61.f fVar = (w61.f) obj;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        fVar.getClass();
                        Integer num = (Integer) fVar.a();
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Button button = dVar.f39140h;
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("mTakeABreakButton");
                                throw null;
                            }
                            button.setVisibility(iIntValue);
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.b bVar = dVar.f39139g;
                            if (iIntValue == 0) {
                                if (bVar != null) {
                                    String string = dVar.getString(R.string.pregnancy_cycle_tracking);
                                    string.getClass();
                                    bVar.g(3, string);
                                }
                                Button button2 = dVar.f39141i;
                                if (button2 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button2.setText(dVar.getString(R.string.pregnancy_continue_tracking));
                            } else {
                                if (bVar != null) {
                                    String string2 = dVar.getString(R.string.mct_setup);
                                    string2.getClass();
                                    bVar.g(2, string2);
                                }
                                Button button3 = dVar.f39141i;
                                if (button3 == null) {
                                    p005kotlin.jvm.internal.s.m("nextButton");
                                    throw null;
                                }
                                button3.setText(dVar.getString(R.string.lbl_next));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putInt("CURRENT_PAGE_KEY", this.f39135c);
        bundle.putSerializable("CYCLE_TYPE_KEY", u6().f115190f);
        bundle.putSerializable("PERIOD_START_DATE_KEY", u6().f115191g);
        bundle.putInt("PERIOD_LENGTH_KEY", u6().f115192h);
        bundle.putInt("CYCLE_LENGTH_KEY", u6().f115193i);
        bundle.putSerializable("CONTRACEPTION_KEY_KEY", u6().f115194j);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ww0.a aVar;
        Date date;
        ww0.i iVar;
        Object serializable;
        Object serializable2;
        Object serializable3;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.next_button);
        viewFindViewById.getClass();
        this.f39141i = (Button) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.take_break_button);
        viewFindViewById2.getClass();
        this.f39140h = (Button) viewFindViewById2;
        this.f39135c = bundle != null ? bundle.getInt("CURRENT_PAGE_KEY") : 1;
        k kVarU6 = u6();
        if (bundle == null) {
            aVar = u6().f115190f;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable3 = bundle.getSerializable("CYCLE_TYPE_KEY", ww0.a.class);
            } else {
                Object serializable4 = bundle.getSerializable("CYCLE_TYPE_KEY");
                if (!(serializable4 instanceof ww0.a)) {
                    serializable4 = null;
                }
                serializable3 = (ww0.a) serializable4;
            }
            aVar = (ww0.a) serializable3;
            if (aVar == null) {
                aVar = u6().f115190f;
            }
        }
        kVarU6.getClass();
        aVar.getClass();
        kVarU6.f115190f = aVar;
        k kVarU7 = u6();
        if (bundle == null) {
            date = u6().f115191g;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = bundle.getSerializable("PERIOD_START_DATE_KEY", Date.class);
            } else {
                Object serializable5 = bundle.getSerializable("PERIOD_START_DATE_KEY");
                if (!(serializable5 instanceof Date)) {
                    serializable5 = null;
                }
                serializable2 = (Date) serializable5;
            }
            date = (Date) serializable2;
            if (date == null) {
                date = u6().f115191g;
            }
        }
        kVarU7.getClass();
        date.getClass();
        kVarU7.f115191g = date;
        u6().f115192h = bundle != null ? bundle.getInt("PERIOD_LENGTH_KEY") : u6().f115192h;
        u6().f115193i = bundle != null ? bundle.getInt("CYCLE_LENGTH_KEY") : u6().f115193i;
        k kVarU8 = u6();
        if (bundle == null) {
            iVar = u6().f115194j;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("CONTRACEPTION_KEY_KEY", ww0.i.class);
            } else {
                Object serializable6 = bundle.getSerializable("CONTRACEPTION_KEY_KEY");
                if (!(serializable6 instanceof ww0.i)) {
                    serializable6 = null;
                }
                serializable = (ww0.i) serializable6;
            }
            iVar = (ww0.i) serializable;
            if (iVar == null) {
                iVar = u6().f115194j;
            }
        }
        kVarU8.getClass();
        iVar.getClass();
        kVarU8.f115194j = iVar;
        y6();
        Button button = this.f39141i;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        final int i14 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: lx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115152b;

            {
                this.f115152b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115152b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Context context = dVar.getContext();
                        if (context != null) {
                            dVar.startActivity(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, context, false, null, 30));
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (dVar.u6().f115190f == ww0.a.PREGNANT) {
                            ax0.a aVar4 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                            androidx.fragment.app.m mVarRequireActivity = dVar.requireActivity();
                            mVarRequireActivity.getClass();
                            aVar4.v(mVarRequireActivity);
                        } else if (dVar.f39135c < dVar.f39136d && dVar.u6().f115190f != ww0.a.NONE) {
                            dVar.v6(dVar.f39135c + 1, true);
                        } else {
                            k kVarU9 = dVar.u6();
                            kVarU9.getClass();
                            UserSettingsDTO userSettings = ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings();
                            UserSettingsDTO userSettingsDTOC = userSettings.C();
                            userSettingsDTOC.g0(kVarU9.f115190f);
                            userSettingsDTOC.f0(kVarU9.f115194j);
                            userSettingsDTOC.a0(kVarU9.f115193i);
                            userSettingsDTOC.c0(kVarU9.f115192h);
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                            ww0.a aVar6 = kVarU9.f115190f;
                            int i16 = kVarU9.f115193i;
                            aVar5.getClass();
                            userSettingsDTOC.w0(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar6, i16));
                            ww0.a aVar7 = kVarU9.f115190f;
                            boolean zD = userSettingsDTOC.D();
                            aVar7.getClass();
                            userSettingsDTOC.E0(aVar7 == ww0.a.REGULAR && zD);
                            userSettingsDTOC.i0(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(kVarU9.f115190f, kVarU9.f115194j, userSettingsDTOC.D(), kVarU9.f115193i));
                            ww0.a aVar8 = kVarU9.f115190f;
                            aVar8.getClass();
                            userSettingsDTOC.j0(aVar8 != ww0.a.NONE);
                            i52.a.f91796a.getClass();
                            userSettingsDTOC.x0(i52.a.q());
                            f12.l.a aVar9 = f12.l.f68084a;
                            aVar9.getClass();
                            userSettingsDTOC.n0(f12.l.a.a().G4());
                            userSettingsDTOC.o0(i52.a.p());
                            userSettingsDTOC.h0(i52.a.m());
                            aVar9.getClass();
                            userSettingsDTOC.p0(f12.l.a.a().E1());
                            userSettingsDTOC.C0(i52.a.r());
                            aVar9.getClass();
                            userSettingsDTOC.A0(f12.l.a.a().x0());
                            t3 t3Var = t3.f23255a;
                            JSONObject jSONObjectT1 = userSettingsDTOC.t1();
                            JSONObject jSONObjectT2 = userSettings.t1();
                            List listC = w.c("userMenstrualCycleSettings");
                            t3Var.getClass();
                            JSONObject jSONObjectC = t3.c(jSONObjectT1, jSONObjectT2, listC);
                            kVarU9.f115200p.j(Boolean.TRUE);
                            ge1.b.T(kVarU9, null, null, new l(kVarU9, userSettingsDTOC, jSONObjectC, null), 3);
                        }
                        break;
                }
            }
        });
        Button button2 = this.f39140h;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("mTakeABreakButton");
            throw null;
        }
        final int i15 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: lx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d f115152b;

            {
                this.f115152b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = this.f115152b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        Context context = dVar.getContext();
                        if (context != null) {
                            dVar.startActivity(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, context, false, null, 30));
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
                        if (dVar.u6().f115190f == ww0.a.PREGNANT) {
                            ax0.a aVar4 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                            androidx.fragment.app.m mVarRequireActivity = dVar.requireActivity();
                            mVarRequireActivity.getClass();
                            aVar4.v(mVarRequireActivity);
                        } else if (dVar.f39135c < dVar.f39136d && dVar.u6().f115190f != ww0.a.NONE) {
                            dVar.v6(dVar.f39135c + 1, true);
                        } else {
                            k kVarU9 = dVar.u6();
                            kVarU9.getClass();
                            UserSettingsDTO userSettings = ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings();
                            UserSettingsDTO userSettingsDTOC = userSettings.C();
                            userSettingsDTOC.g0(kVarU9.f115190f);
                            userSettingsDTOC.f0(kVarU9.f115194j);
                            userSettingsDTOC.a0(kVarU9.f115193i);
                            userSettingsDTOC.c0(kVarU9.f115192h);
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                            ww0.a aVar6 = kVarU9.f115190f;
                            int i17 = kVarU9.f115193i;
                            aVar5.getClass();
                            userSettingsDTOC.w0(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar6, i17));
                            ww0.a aVar7 = kVarU9.f115190f;
                            boolean zD = userSettingsDTOC.D();
                            aVar7.getClass();
                            userSettingsDTOC.E0(aVar7 == ww0.a.REGULAR && zD);
                            userSettingsDTOC.i0(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(kVarU9.f115190f, kVarU9.f115194j, userSettingsDTOC.D(), kVarU9.f115193i));
                            ww0.a aVar8 = kVarU9.f115190f;
                            aVar8.getClass();
                            userSettingsDTOC.j0(aVar8 != ww0.a.NONE);
                            i52.a.f91796a.getClass();
                            userSettingsDTOC.x0(i52.a.q());
                            f12.l.a aVar9 = f12.l.f68084a;
                            aVar9.getClass();
                            userSettingsDTOC.n0(f12.l.a.a().G4());
                            userSettingsDTOC.o0(i52.a.p());
                            userSettingsDTOC.h0(i52.a.m());
                            aVar9.getClass();
                            userSettingsDTOC.p0(f12.l.a.a().E1());
                            userSettingsDTOC.C0(i52.a.r());
                            aVar9.getClass();
                            userSettingsDTOC.A0(f12.l.a.a().x0());
                            t3 t3Var = t3.f23255a;
                            JSONObject jSONObjectT1 = userSettingsDTOC.t1();
                            JSONObject jSONObjectT2 = userSettings.t1();
                            List listC = w.c("userMenstrualCycleSettings");
                            t3Var.getClass();
                            JSONObject jSONObjectC = t3.c(jSONObjectT1, jSONObjectT2, listC);
                            kVarU9.f115200p.j(Boolean.TRUE);
                            ge1.b.T(kVarU9, null, null, new l(kVarU9, userSettingsDTOC, jSONObjectC, null), 3);
                        }
                        break;
                }
            }
        });
        if (getChildFragmentManager().M() == 0) {
            v6(this.f39135c, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final k u6() {
        return (k) this.f39137e.getValue();
    }

    public final void v6(int i14, boolean z14) {
        int i15 = this.f39135c;
        if (i15 > i14) {
            for (int i16 = i14; i16 < i15; i16++) {
                getChildFragmentManager().Z();
            }
        } else if (i14 == c.CycleType.f39150a) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.f39117f;
            boolean zBooleanValue = ((Boolean) this.f39134b.getValue()).booleanValue();
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("STOP_PREGNANCY_FLOW_KEY", zBooleanValue);
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c cVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c();
            cVar.setArguments(bundle);
            w6(cVar, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.f39118g, z14);
        } else if (i14 == c.PeriodDate.f39150a) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e eVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e();
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e.f39159b.getClass();
            String str = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e.f39160c;
            str.getClass();
            w6(eVar, str, z14);
        } else if (i14 == c.PeriodLength.f39150a) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.f fVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.f();
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.f.f39172f.getClass();
            String str2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.f.f39173g;
            str2.getClass();
            w6(fVar, str2, z14);
        } else if (i14 == c.CycleLength.f39150a) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b bVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b();
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.f39112g.getClass();
            String str3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.b.f39113h;
            str3.getClass();
            w6(bVar, str3, z14);
        } else if (i14 == c.Contraception.f39150a) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a aVar2 = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a();
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39101d.getClass();
            String str4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39102e;
            str4.getClass();
            w6(aVar2, str4, z14);
        }
        this.f39135c = i14;
        y6();
    }

    public final void w6(Fragment fragment, String str, boolean z14) {
        if (isRemoving()) {
            return;
        }
        v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = j.b(childFragmentManager, childFragmentManager);
        Fragment fragmentF = getChildFragmentManager().F(R.id.mct_setup_content_container);
        if (fragmentF != null) {
            aVarB.v(fragmentF);
        }
        if (z14) {
            aVarB.o(R.anim.anim_enter_from_right, R.anim.anim_exit_to_left, R.anim.anim_enter_from_left, R.anim.anim_exit_to_right);
        }
        aVarB.j(R.id.mct_setup_content_container, fragment, str, 1);
        aVarB.d(str);
        aVarB.s(true, true);
    }

    public final void y6() {
        Button button = this.f39141i;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        button.setClickable(true);
        Button button2 = this.f39141i;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        button2.setEnabled(true);
        Button button3 = this.f39141i;
        if (button3 != null) {
            button3.setText(getString(this.f39135c == this.f39136d ? R.string.lbl_finish : R.string.lbl_next));
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/d$a;", "", "<init>", "()V", "", "CURRENT_PAGE_KEY", "Ljava/lang/String;", "CYCLE_TYPE_KEY", "PERIOD_START_DATE_KEY", "PERIOD_LENGTH_KEY", "CYCLE_LENGTH_KEY", "CONTRACEPTION_KEY", "DETAILS_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
