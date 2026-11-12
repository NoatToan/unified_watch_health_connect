package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.r;
import lc.u0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;
import pj1.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/f;", "Ldv/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends dv.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f43923h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43924b = new w1(s0.f105811a.b(s.class), new d(this), new C0821f(this), new e(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f43925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zj1.e f43926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatButton f43927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f43928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f43929g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43930a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43930a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43931a;

        public c(l lVar) {
            lVar.getClass();
            this.f43931a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43931a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43931a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43932a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43932a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43932a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43933a = aVar;
            this.f43934b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43933a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43934b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0821f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0821f(Fragment fragment) {
            super(0);
            this.f43935a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43935a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f() {
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: zj1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f f204936b;

            {
                this.f204936b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                r rVar;
                androidx.fragment.app.m activity;
                v supportFragmentManager;
                Bundle extras;
                Bundle extras2;
                Parcelable parcelable;
                Bundle extras3;
                Parcelable parcelable2;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar = this.f204936b;
                f.a aVar2 = (f.a) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            fVar.requireActivity().finish();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (aVar2.f67585a == -1) {
                            if (intent == null || (extras3 = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) extras3.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable3 = extras3.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable3 instanceof l20.a)) {
                                        parcelable3 = null;
                                    }
                                    parcelable2 = (l20.a) parcelable3;
                                }
                                aVar = (l20.a) parcelable2;
                            }
                            if (intent == null || (extras2 = intent.getExtras()) == null) {
                                rVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras2.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", r.class);
                                } else {
                                    Parcelable parcelable4 = extras2.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                                    if (!(parcelable4 instanceof r)) {
                                        parcelable4 = null;
                                    }
                                    parcelable = (r) parcelable4;
                                }
                                rVar = (r) parcelable;
                            }
                            if (!p005kotlin.jvm.internal.s.g((intent == null || (extras = intent.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("IS_CONTACT_UPDATED", true)), Boolean.FALSE)) {
                                if (aVar != null) {
                                    if (rVar != null) {
                                        fVar.w6().h5(rVar);
                                    }
                                    fVar.w6().R4(aVar);
                                } else if (rVar != null) {
                                    fVar.w6().Q4(rVar);
                                    fVar.w6().h5(rVar);
                                    List<l20.a> listF = rVar.f();
                                    ArrayList arrayListT = listF != null ? ge1.b.t(listF) : null;
                                    if ((arrayListT == null || arrayListT.isEmpty()) && (activity = fVar.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                                        supportFragmentManager.a0(1, "SafetyFeaturesReviewEmergencyContactsFragment");
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f43928f = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: zj1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f f204936b;

            {
                this.f204936b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                r rVar;
                androidx.fragment.app.m activity;
                v supportFragmentManager;
                Bundle extras;
                Bundle extras2;
                Parcelable parcelable;
                Bundle extras3;
                Parcelable parcelable2;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar = this.f204936b;
                f.a aVar2 = (f.a) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            fVar.requireActivity().finish();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (aVar2.f67585a == -1) {
                            if (intent == null || (extras3 = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) extras3.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable3 = extras3.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable3 instanceof l20.a)) {
                                        parcelable3 = null;
                                    }
                                    parcelable2 = (l20.a) parcelable3;
                                }
                                aVar = (l20.a) parcelable2;
                            }
                            if (intent == null || (extras2 = intent.getExtras()) == null) {
                                rVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras2.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", r.class);
                                } else {
                                    Parcelable parcelable4 = extras2.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                                    if (!(parcelable4 instanceof r)) {
                                        parcelable4 = null;
                                    }
                                    parcelable = (r) parcelable4;
                                }
                                rVar = (r) parcelable;
                            }
                            if (!p005kotlin.jvm.internal.s.g((intent == null || (extras = intent.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("IS_CONTACT_UPDATED", true)), Boolean.FALSE)) {
                                if (aVar != null) {
                                    if (rVar != null) {
                                        fVar.w6().h5(rVar);
                                    }
                                    fVar.w6().R4(aVar);
                                } else if (rVar != null) {
                                    fVar.w6().Q4(rVar);
                                    fVar.w6().h5(rVar);
                                    List<l20.a> listF = rVar.f();
                                    ArrayList arrayListT = listF != null ? ge1.b.t(listF) : null;
                                    if ((arrayListT == null || arrayListT.isEmpty()) && (activity = fVar.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                                        supportFragmentManager.a0(1, "SafetyFeaturesReviewEmergencyContactsFragment");
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f43929g = cVarRegisterForActivityResult2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_emergency_contacts_safetywizard, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008b  */
    /* JADX WARN: Code duplicated, block: B:17:0x008f  */
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        AppCompatButton appCompatButton;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        String string = requireContext().getString(R.string.safety_features_setup);
        string.getClass();
        g22.e.g(this, string);
        View viewFindViewById = view2.findViewById(R.id.contacts_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f43925c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        final int i14 = 2;
        zj1.e eVar = new zj1.e(false, new l(this) { // from class: zj1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f f204938b;

            {
                this.f204938b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar = this.f204938b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i16 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.b.f43930a[pVar.ordinal()];
                        if (i16 == 1) {
                            g22.e.f(fVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                fVar.v6(gVar);
                            }
                        } else if (i16 == 2) {
                            g22.e.l(fVar);
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(fVar);
                            g22.e.c(fVar);
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                fVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        pVar2.getClass();
                        A a14 = pVar2.f128594a;
                        a14.getClass();
                        int iIntValue = ((Number) a14).intValue();
                        B b14 = pVar2.f128595b;
                        b14.getClass();
                        int iIntValue2 = ((Number) b14).intValue();
                        c22.f fVar2 = c22.f.f23050a;
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        c22.f.d(fVar2, contextRequireContext, fVar.getString(iIntValue), fVar.getString(iIntValue2), new o13.p(fVar.getString(R.string.lbl_exit), new yr.d(fVar, 24)), new o13.p(fVar.getString(R.string.lbl_cancel), new z21.a((byte) 0, 21)), null, false, 96).show();
                        return Unit.INSTANCE;
                    default:
                        l20.a aVar3 = (l20.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar3.getClass();
                        f.c<Intent> cVar = fVar.f43929g;
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        androidx.fragment.app.m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar5, mVarRequireActivity, aVar3, j0.f134944a, false, false, fVar.w6().f137981q, 48), null);
                        return Unit.INSTANCE;
                }
            }
        }, 1, null);
        this.f43926d = eVar;
        RecyclerView recyclerView2 = this.f43925c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(eVar);
        View viewFindViewById2 = view2.findViewById(R.id.setup_complete_button);
        viewFindViewById2.getClass();
        this.f43927e = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.add_another_contact_button);
        viewFindViewById3.getClass();
        ((AppCompatButton) viewFindViewById3).setOnClickListener(new xp0.d(this, 22));
        s sVarW6 = w6();
        if (sVarW6.f137983t && sVarW6.N4() && sVarW6.f137986x) {
            appCompatButton = this.f43927e;
            if (appCompatButton != null) {
                p005kotlin.jvm.internal.s.m("setupCompleteButton");
                throw null;
            }
            appCompatButton.setText(getString(R.string.lbl_next));
        } else {
            s sVarW7 = w6();
            if (sVarW7.f137983t && sVarW7.f137988z) {
                appCompatButton = this.f43927e;
                if (appCompatButton != null) {
                    p005kotlin.jvm.internal.s.m("setupCompleteButton");
                    throw null;
                }
                appCompatButton.setText(getString(R.string.lbl_next));
            }
        }
        final int i15 = 0;
        w6().C.f(getViewLifecycleOwner(), new c(new l(this) { // from class: zj1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f f204938b;

            {
                this.f204938b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar = this.f204938b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i17 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.b.f43930a[pVar.ordinal()];
                        if (i17 == 1) {
                            g22.e.f(fVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                fVar.v6(gVar);
                            }
                        } else if (i17 == 2) {
                            g22.e.l(fVar);
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(fVar);
                            g22.e.c(fVar);
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                fVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        pVar2.getClass();
                        A a14 = pVar2.f128594a;
                        a14.getClass();
                        int iIntValue = ((Number) a14).intValue();
                        B b14 = pVar2.f128595b;
                        b14.getClass();
                        int iIntValue2 = ((Number) b14).intValue();
                        c22.f fVar2 = c22.f.f23050a;
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        c22.f.d(fVar2, contextRequireContext, fVar.getString(iIntValue), fVar.getString(iIntValue2), new o13.p(fVar.getString(R.string.lbl_exit), new yr.d(fVar, 24)), new o13.p(fVar.getString(R.string.lbl_cancel), new z21.a((byte) 0, 21)), null, false, 96).show();
                        return Unit.INSTANCE;
                    default:
                        l20.a aVar3 = (l20.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar3.getClass();
                        f.c<Intent> cVar = fVar.f43929g;
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        androidx.fragment.app.m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar5, mVarRequireActivity, aVar3, j0.f134944a, false, false, fVar.w6().f137981q, 48), null);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 1;
        w6().M0.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: zj1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f f204938b;

            {
                this.f204938b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar = this.f204938b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i18 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.b.f43930a[pVar.ordinal()];
                        if (i18 == 1) {
                            g22.e.f(fVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                fVar.v6(gVar);
                            }
                        } else if (i18 == 2) {
                            g22.e.l(fVar);
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(fVar);
                            g22.e.c(fVar);
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                fVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        pVar2.getClass();
                        A a14 = pVar2.f128594a;
                        a14.getClass();
                        int iIntValue = ((Number) a14).intValue();
                        B b14 = pVar2.f128595b;
                        b14.getClass();
                        int iIntValue2 = ((Number) b14).intValue();
                        c22.f fVar2 = c22.f.f23050a;
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        c22.f.d(fVar2, contextRequireContext, fVar.getString(iIntValue), fVar.getString(iIntValue2), new o13.p(fVar.getString(R.string.lbl_exit), new yr.d(fVar, 24)), new o13.p(fVar.getString(R.string.lbl_cancel), new z21.a((byte) 0, 21)), null, false, 96).show();
                        return Unit.INSTANCE;
                    default:
                        l20.a aVar3 = (l20.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                        aVar3.getClass();
                        f.c<Intent> cVar = fVar.f43929g;
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        androidx.fragment.app.m mVarRequireActivity = fVar.requireActivity();
                        mVarRequireActivity.getClass();
                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar5, mVarRequireActivity, aVar3, j0.f134944a, false, false, fVar.w6().f137981q, 48), null);
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void v6(yj1.g gVar) {
        wj1.a aVar = new wj1.a(gVar.f197544c);
        List<l20.a> list = gVar.f197543b;
        AppCompatButton appCompatButton = this.f43927e;
        if (appCompatButton == null) {
            p005kotlin.jvm.internal.s.m("setupCompleteButton");
            throw null;
        }
        appCompatButton.setEnabled(!list.isEmpty());
        AppCompatButton appCompatButton2 = this.f43927e;
        if (appCompatButton2 == null) {
            p005kotlin.jvm.internal.s.m("setupCompleteButton");
            throw null;
        }
        appCompatButton2.setOnClickListener(new wv2.h(21, this, aVar));
        zj1.e eVar = this.f43926d;
        if (eVar != null) {
            ArrayList arrayList = eVar.f204915e;
            arrayList.clear();
            arrayList.addAll(list);
            eVar.notifyDataSetChanged();
        }
    }

    public final s w6() {
        return (s) this.f43924b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    public final void y6(wj1.a aVar) {
        List listC;
        s sVarW6 = w6();
        Long l14 = sVarW6.f137985w;
        if (l14 != null) {
            listC = p13.w.c(Long.valueOf(l14.longValue()));
        } else {
            ArrayList arrayList = sVarW6.P;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((sd2.f) obj).B2()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((sd2.f) it.next()).getUnitID()));
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                listC = arrayList3;
                if (zIsEmpty) {
                    listC = null;
                }
            } else {
                listC = null;
            }
        }
        vj1.b bVar = new vj1.b(true, listC);
        EmergencyCallingActivity.a aVar2 = EmergencyCallingActivity.f43789d;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        hl.a aVar3 = w6().f137981q;
        aVar2.getClass();
        this.f43928f.a(EmergencyCallingActivity.a.a(contextRequireContext, aVar, bVar, aVar3), null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_CONTACTS_LIMIT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
