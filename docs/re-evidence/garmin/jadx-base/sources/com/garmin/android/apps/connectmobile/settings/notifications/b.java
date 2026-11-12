package com.garmin.android.apps.connectmobile.settings.notifications;

import a73.j;
import aj1.g;
import aj1.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.PregnancyRemindersActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import e23.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.h;
import o53.c0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.y0;
import z6.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/b;", "Landroidx/preference/b;", "Lcom/garmin/android/apps/connectmobile/settings/notifications/NotificationSettingsActivity$b;", "Laj1/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends androidx.preference.b implements NotificationSettingsActivity.b, aj1.d {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final a f43597f1 = new a(null);
    public SwitchPreferenceCompat A;
    public SwitchPreferenceCompat B;
    public SwitchPreferenceCompat C;
    public SwitchPreferenceCompat D;
    public SwitchPreferenceCompat E;
    public SwitchPreferenceCompat F;
    public SwitchPreferenceCompat H0;
    public SwitchPreferenceCompat I;
    public SwitchPreferenceCompat I0;
    public SwitchPreferenceCompat J0;
    public SwitchPreferenceCompat K0;
    public SwitchPreferenceCompat L0;
    public SwitchPreferenceCompat M0;
    public SwitchPreferenceCompat N0;
    public PreferenceCategory O0;
    public SwitchPreferenceCompat P;
    public PreferenceCategory P0;
    public PreferenceCategory Q0;
    public PreferenceCategory R0;
    public PreferenceCategory S0;
    public SwitchPreferenceCompat T;
    public SwitchPreferenceCompat T0;
    public SwitchPreferenceCompat U0;
    public SwitchPreferenceCompat V0;
    public Preference W0;
    public SwitchPreferenceCompat X;
    public PreferenceCategory X0;
    public SwitchPreferenceCompat Y;
    public SwitchPreferenceCompat Y0;
    public SwitchPreferenceCompat Z;
    public PreferenceCategory Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public SwitchPreferenceCompat f43598a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public PreferenceCategory f43599b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public SwitchPreferenceCompat f43600c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public SwitchPreferenceCompat f43601d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.notifications.model.a f43602e1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f43603i = new w1(s0.f105811a.b(p.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f43604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f43605k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SwitchPreferenceCompat f43606k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f43607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public cj1.a f43608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SwitchPreferenceCompat f43609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwitchPreferenceCompat f43610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SwitchPreferenceCompat f43611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SwitchPreferenceCompat f43612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SwitchPreferenceCompat f43613r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SwitchPreferenceCompat f43614t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SwitchPreferenceCompat f43615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SwitchPreferenceCompat f43616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SwitchPreferenceCompat f43617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SwitchPreferenceCompat f43618y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SwitchPreferenceCompat f43619z;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.notifications.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0808b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43620a;

        static {
            int[] iArr = new int[cj1.a.values().length];
            try {
                iArr[cj1.a.SUBSCRIPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43620a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43621a;

        public c(l lVar) {
            lVar.getClass();
            this.f43621a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43621a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43621a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43622a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43622a.requireActivity().getF185700a();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43623a = aVar;
            this.f43624b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43623a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43624b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43625a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43625a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static void w6(Context context, String str) {
        new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.devices_not_connected)).setMessage(context.getString(R.string.device_not_connected_description, str)).setCancelable(false).setNeutralButton(R.string.go_to_support_center, new aj1.f(context, 0)).setNegativeButton(context.getString(R.string.lbl_close), new ag0.e(2)).create().show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity.b
    public final com.garmin.android.apps.connectmobile.settings.notifications.model.a E() {
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar = this.f43602e1;
        if (aVar != null) {
            NotificationPreferencesDTO notificationPreferencesDTO = aVar.f43659a;
            boolean z14 = false;
            if (notificationPreferencesDTO != null) {
                SwitchPreferenceCompat switchPreferenceCompat = this.f43609n;
                notificationPreferencesDTO.N0 = switchPreferenceCompat != null && switchPreferenceCompat.K0;
                SwitchPreferenceCompat switchPreferenceCompat2 = this.f43610o;
                notificationPreferencesDTO.C = switchPreferenceCompat2 != null && switchPreferenceCompat2.K0;
                SwitchPreferenceCompat switchPreferenceCompat3 = this.N0;
                notificationPreferencesDTO.f43639f1 = switchPreferenceCompat3 != null && switchPreferenceCompat3.K0;
                SwitchPreferenceCompat switchPreferenceCompat4 = this.f43611p;
                notificationPreferencesDTO.F = switchPreferenceCompat4 != null && switchPreferenceCompat4.K0;
                SwitchPreferenceCompat switchPreferenceCompat5 = this.f43615v;
                notificationPreferencesDTO.f43645k0 = switchPreferenceCompat5 != null && switchPreferenceCompat5.K0;
                SwitchPreferenceCompat switchPreferenceCompat6 = this.f43616w;
                notificationPreferencesDTO.H0 = switchPreferenceCompat6 != null && switchPreferenceCompat6.K0;
                SwitchPreferenceCompat switchPreferenceCompat7 = this.f43617x;
                notificationPreferencesDTO.I0 = switchPreferenceCompat7 != null && switchPreferenceCompat7.K0;
                SwitchPreferenceCompat switchPreferenceCompat8 = this.f43618y;
                notificationPreferencesDTO.J0 = switchPreferenceCompat8 != null && switchPreferenceCompat8.K0;
                SwitchPreferenceCompat switchPreferenceCompat9 = this.f43619z;
                notificationPreferencesDTO.D = switchPreferenceCompat9 != null && switchPreferenceCompat9.K0;
                SwitchPreferenceCompat switchPreferenceCompat10 = this.A;
                notificationPreferencesDTO.E = switchPreferenceCompat10 != null && switchPreferenceCompat10.K0;
                SwitchPreferenceCompat switchPreferenceCompat11 = this.B;
                notificationPreferencesDTO.O0 = switchPreferenceCompat11 != null && switchPreferenceCompat11.K0;
                SwitchPreferenceCompat switchPreferenceCompat12 = this.C;
                notificationPreferencesDTO.K0 = switchPreferenceCompat12 != null && switchPreferenceCompat12.K0;
                SwitchPreferenceCompat switchPreferenceCompat13 = this.D;
                notificationPreferencesDTO.L0 = switchPreferenceCompat13 != null && switchPreferenceCompat13.K0;
                SwitchPreferenceCompat switchPreferenceCompat14 = this.E;
                notificationPreferencesDTO.R0 = switchPreferenceCompat14 != null && switchPreferenceCompat14.K0;
                SwitchPreferenceCompat switchPreferenceCompat15 = this.F;
                notificationPreferencesDTO.S0 = switchPreferenceCompat15 != null && switchPreferenceCompat15.K0;
                SwitchPreferenceCompat switchPreferenceCompat16 = this.I;
                notificationPreferencesDTO.T0 = switchPreferenceCompat16 != null && switchPreferenceCompat16.K0;
                SwitchPreferenceCompat switchPreferenceCompat17 = this.P;
                notificationPreferencesDTO.U0 = switchPreferenceCompat17 != null && switchPreferenceCompat17.K0;
                SwitchPreferenceCompat switchPreferenceCompat18 = this.T;
                notificationPreferencesDTO.V0 = switchPreferenceCompat18 != null && switchPreferenceCompat18.K0;
                SwitchPreferenceCompat switchPreferenceCompat19 = this.X;
                notificationPreferencesDTO.W0 = switchPreferenceCompat19 != null && switchPreferenceCompat19.K0;
                SwitchPreferenceCompat switchPreferenceCompat20 = this.Y;
                notificationPreferencesDTO.X0 = switchPreferenceCompat20 != null && switchPreferenceCompat20.K0;
                SwitchPreferenceCompat switchPreferenceCompat21 = this.Z;
                notificationPreferencesDTO.P = switchPreferenceCompat21 != null && switchPreferenceCompat21.K0;
                SwitchPreferenceCompat switchPreferenceCompat22 = this.f43606k0;
                notificationPreferencesDTO.T = switchPreferenceCompat22 != null && switchPreferenceCompat22.K0;
                SwitchPreferenceCompat switchPreferenceCompat23 = this.H0;
                notificationPreferencesDTO.Y = switchPreferenceCompat23 != null && switchPreferenceCompat23.K0;
                SwitchPreferenceCompat switchPreferenceCompat24 = this.I0;
                notificationPreferencesDTO.I = switchPreferenceCompat24 != null && switchPreferenceCompat24.K0;
                SwitchPreferenceCompat switchPreferenceCompat25 = this.J0;
                notificationPreferencesDTO.X = switchPreferenceCompat25 != null && switchPreferenceCompat25.K0;
                SwitchPreferenceCompat switchPreferenceCompat26 = this.K0;
                notificationPreferencesDTO.Z = switchPreferenceCompat26 != null && switchPreferenceCompat26.K0;
                SwitchPreferenceCompat switchPreferenceCompat27 = this.L0;
                notificationPreferencesDTO.P0 = switchPreferenceCompat27 != null && switchPreferenceCompat27.K0;
                SwitchPreferenceCompat switchPreferenceCompat28 = this.M0;
                notificationPreferencesDTO.f43637e1 = switchPreferenceCompat28 != null && switchPreferenceCompat28.K0;
                SwitchPreferenceCompat switchPreferenceCompat29 = this.T0;
                notificationPreferencesDTO.Y0 = !((switchPreferenceCompat29 == null || switchPreferenceCompat29.K0) ? false : true);
                SwitchPreferenceCompat switchPreferenceCompat30 = this.U0;
                notificationPreferencesDTO.M0 = !((switchPreferenceCompat30 == null || switchPreferenceCompat30.K0) ? false : true);
                SwitchPreferenceCompat switchPreferenceCompat31 = this.V0;
                notificationPreferencesDTO.Z0 = !((switchPreferenceCompat31 == null || switchPreferenceCompat31.K0) ? false : true);
                SwitchPreferenceCompat switchPreferenceCompat32 = this.Y0;
                notificationPreferencesDTO.Q0 = switchPreferenceCompat32 != null && switchPreferenceCompat32.K0;
                SwitchPreferenceCompat switchPreferenceCompat33 = this.f43598a1;
                notificationPreferencesDTO.f43629a1 = switchPreferenceCompat33 != null && switchPreferenceCompat33.K0;
                SwitchPreferenceCompat switchPreferenceCompat34 = this.f43600c1;
                notificationPreferencesDTO.f43633c1 = switchPreferenceCompat34 != null && switchPreferenceCompat34.K0;
                SwitchPreferenceCompat switchPreferenceCompat35 = this.f43601d1;
                notificationPreferencesDTO.f43635d1 = switchPreferenceCompat35 != null && switchPreferenceCompat35.K0;
            }
            SwitchPreferenceCompat switchPreferenceCompat36 = this.f43610o;
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_mobile_notifications_activity_uploads, GCMSettingManager.f41536b.edit(), switchPreferenceCompat36 != null && switchPreferenceCompat36.K0);
            SwitchPreferenceCompat switchPreferenceCompat37 = this.N0;
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_mobile_notifications_pa_uploads, GCMSettingManager.f41536b.edit(), switchPreferenceCompat37 != null && switchPreferenceCompat37.K0);
            if (this.f43612q != null) {
                hf0.b bVarC = ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c();
                SwitchPreferenceCompat switchPreferenceCompat38 = this.f43612q;
                bVarC.f83623a.O2("key_ecg_upload_notification_enabled", switchPreferenceCompat38 != null && switchPreferenceCompat38.K0);
            }
            if (this.f43613r != null) {
                qn.c cVar = (qn.c) KoinJavaComponent.get$default(qn.c.class, null, null, 6, null);
                SwitchPreferenceCompat switchPreferenceCompat39 = this.f43613r;
                if (switchPreferenceCompat39 != null && switchPreferenceCompat39.K0) {
                    z14 = true;
                }
                cVar.b(z14);
            }
            SwitchPreferenceCompat switchPreferenceCompat40 = this.f43614t;
            if (switchPreferenceCompat40 != null) {
                ((jn0.a) KoinJavaComponent.get$default(jn0.a.class, null, null, 6, null)).a(switchPreferenceCompat40.K0);
            }
        }
        return this.f43602e1;
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((p) this.f43603i.getValue()).y4().f(this, new c(new g(this, 2)));
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable2 = arguments != null ? arguments.getSerializable("EXTRA_SCROLL_TO_ITEM") : null;
            serializable = (cj1.a) (serializable2 instanceof cj1.a ? serializable2 : null);
        } else if (arguments != null) {
            serializable = arguments.getSerializable("EXTRA_SCROLL_TO_ITEM", cj1.a.class);
        }
        this.f43608m = (cj1.a) serializable;
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewFindViewById = viewOnCreateView.findViewById(R.id.custom_view);
        viewFindViewById.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f43605k = frameLayout;
        layoutInflater.inflate(R.layout.notification_permission_request, (ViewGroup) frameLayout, true);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean zAreNotificationsEnabled = a0.a(requireContext()).f202582b.areNotificationsEnabled();
        RecyclerView recyclerView = this.f43604j;
        if (zAreNotificationsEnabled) {
            if (recyclerView == null) {
                s.m("mRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(0);
            FrameLayout frameLayout = this.f43605k;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                s.m("mPermissionRequestView");
                throw null;
            }
        }
        if (recyclerView == null) {
            s.m("mRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        FrameLayout frameLayout2 = this.f43605k;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        } else {
            s.m("mPermissionRequestView");
            throw null;
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    @SuppressLint({"WrongViewCast"})
    public final void onViewCreated(View view2, Bundle bundle) {
        Integer numValueOf;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = this.f10194c;
        recyclerView.getClass();
        this.f43604j = recyclerView;
        recyclerView.setItemAnimator(null);
        ArrayList arrayList = new ArrayList();
        this.f43607l = arrayList;
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        preferenceScreen.getClass();
        int size = preferenceScreen.M0.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Preference preferenceG = preferenceScreen.G(i15);
            preferenceG.getClass();
            arrayList.add(preferenceG);
        }
        ArrayList arrayList2 = this.f43607l;
        if (arrayList2 == null) {
            s.m("mPreferenceList");
            throw null;
        }
        y0.a(arrayList2).remove(H0(getString(R.string.key_preference_header_category)));
        ArrayList arrayList3 = this.f43607l;
        if (arrayList3 == null) {
            s.m("mPreferenceList");
            throw null;
        }
        y0.a(arrayList3).remove(H0(getString(R.string.key_preference_footer_category)));
        k1 k1Var = k1.f37122a;
        if (!k1Var.T()) {
            String string = getString(R.string.key_mobile_notifications_adaptive_training_plans);
            string.getClass();
            String string2 = getString(R.string.key_mobile_notifications_training_category);
            string2.getClass();
            Preference preferenceH0 = H0(string);
            Preference preferenceH1 = H0(string2);
            if (preferenceH0 != null) {
                preferenceH0.A(false);
            }
            if (preferenceH1 != null) {
                preferenceH1.A(false);
            }
            ArrayList arrayList4 = this.f43607l;
            if (arrayList4 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            y0.a(arrayList4).remove(preferenceH0);
            ArrayList arrayList5 = this.f43607l;
            if (arrayList5 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            y0.a(arrayList5).remove(preferenceH1);
        }
        if (!k1Var.d()) {
            String string3 = getString(R.string.key_mobile_notifications_menstrual_cycle_tracking_category);
            string3.getClass();
            Preference preferenceH2 = H0(string3);
            if (preferenceH2 != null) {
                preferenceH2.A(false);
            }
            ArrayList arrayList6 = this.f43607l;
            if (arrayList6 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            y0.a(arrayList6).remove(preferenceH2);
        } else if (k1Var.c()) {
            String string4 = getString(R.string.key_mobile_notifications_menstrual_cycle_tracking_category);
            string4.getClass();
            PreferenceCategory preferenceCategory = (PreferenceCategory) H0(string4);
            if (preferenceCategory != null) {
                preferenceCategory.z(preferenceCategory.f10147a.getString(R.string.pregnancy_title));
            }
            String string5 = getString(R.string.key_mobile_notifications_menstrual_cycle_tracking_reminders);
            string5.getClass();
            Preference preferenceH3 = H0(string5);
            if (preferenceH3 != null) {
                PregnancyRemindersActivity.a aVar = PregnancyRemindersActivity.f40928d;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                aVar.getClass();
                preferenceH3.f10160m = new Intent(contextRequireContext, (Class<?>) PregnancyRemindersActivity.class);
            }
        }
        tv0.d dVar = (tv0.d) KoinJavaComponent.get$default(tv0.d.class, null, null, 6, null);
        String string6 = getString(R.string.key_mobile_notifications_lifestyle_logging_reminders);
        string6.getClass();
        Preference preferenceH4 = H0(string6);
        if (preferenceH4 != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            preferenceH4.f10160m = dVar.a(contextRequireContext2);
        }
        Preference preferenceH5 = H0(getString(R.string.key_mobile_notifications_ecg_uploads));
        Preference preferenceH6 = H0(getString(R.string.key_mobile_notifications_health_snapshot_uploads));
        Preference preferenceH7 = H0(getString(R.string.key_mobile_notifications_health_status_outliers));
        int i16 = 1;
        if (preferenceH7 != null) {
            preferenceH7.C = true;
            preferenceH7.D = false;
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            preferenceH7.z(new l22.a(contextRequireContext3).getString(R.string.lbl_health_status_outliers));
        }
        if (preferenceH6 != null) {
            preferenceH6.C = true;
            preferenceH6.D = false;
            preferenceH6.z(getString(R.string.lbl_health_snapshot_uploads));
        }
        boolean zW = k1Var.W();
        boolean zQ = k1Var.Q();
        boolean zN0 = k1Var.n0();
        if (!zW || !zQ || !zN0) {
            if (preferenceH5 != null && !zW) {
                preferenceH5.A(false);
                ArrayList arrayList7 = this.f43607l;
                if (arrayList7 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList7.remove(preferenceH5);
            }
            if (preferenceH7 != null && !zN0) {
                preferenceH7.A(false);
                ArrayList arrayList8 = this.f43607l;
                if (arrayList8 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList8.remove(preferenceH7);
            }
            if (preferenceH6 != null && !zQ) {
                preferenceH6.A(false);
                ArrayList arrayList9 = this.f43607l;
                if (arrayList9 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList9.remove(preferenceH6);
            }
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_subscription_reminders_category));
        this.O0 = preferenceCategory2;
        if (preferenceCategory2 != null) {
            preferenceCategory2.z(getString(R.string.lbl_garmin_connect_plus));
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_subscription_reminders));
        this.T0 = switchPreferenceCompat;
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.z(getString(R.string.subscription_reminders));
        }
        SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_LA_start));
        this.U0 = switchPreferenceCompat2;
        if (switchPreferenceCompat2 != null) {
            switchPreferenceCompat2.z(getString(R.string.settings_live_activity_start));
        }
        this.V0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_exclusive_offers));
        Preference preferenceH8 = H0(getString(R.string.key_mobile_notifications_gcnt));
        this.W0 = preferenceH8;
        if (preferenceH8 != null) {
            preferenceH8.z(getString(R.string.lbl_nutrition));
        }
        w1 w1Var = this.f43603i;
        ((p) w1Var.getValue()).f3482c.f(getViewLifecycleOwner(), new c(new g(this, i14)));
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        ge1.b.T(c0.a(bVar), null, null, new aj1.h(this, null), 3);
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_category_connection));
        if (preferenceCategory3 != null) {
            preferenceCategory3.A(false);
            ArrayList arrayList10 = this.f43607l;
            if (arrayList10 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList10.remove(preferenceCategory3);
        }
        this.Z0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_devices_notifications));
        SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications));
        this.f43609n = switchPreferenceCompat3;
        if (switchPreferenceCompat3 != null) {
            switchPreferenceCompat3.f10151e = new j(this, 5);
        }
        this.f43610o = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_activity_uploads));
        this.N0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_pa_uploads));
        boolean zQ0 = k1Var.Q0();
        SwitchPreferenceCompat switchPreferenceCompat4 = this.N0;
        if (zQ0) {
            if (switchPreferenceCompat4 != null) {
                switchPreferenceCompat4.z(getString(R.string.auto_detected_activity_uploads_notifications));
            }
        } else if (switchPreferenceCompat4 != null) {
            switchPreferenceCompat4.A(false);
        }
        this.f43611p = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_badges));
        this.f43615v = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_follow_requests));
        this.f43616w = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_follow_requests_accepted));
        this.P0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_category_connection));
        this.f43617x = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_connection_requests));
        this.f43618y = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_connection_confirmation));
        this.R0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_activities_category));
        this.f43619z = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_comment_on_activity));
        this.A = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_comment_on_activity_thread));
        this.B = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_activity_comment_mentions));
        this.C = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_activity_likes));
        this.D = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_comment_likes));
        this.Q0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_groups_category));
        this.E = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_membership_confirmations));
        this.F = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_invitations));
        this.I = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_posts_announcements));
        this.P = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_comment_on_my_posts));
        this.T = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_comment_after_mine));
        this.X = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_post_like));
        this.Y = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notification_group_post_comment_like));
        this.S0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_connection_challenges_category));
        this.Z = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_challenge_invitations));
        this.f43606k0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_challenge_reminders));
        this.H0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_challenge_updates));
        this.I0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_challenge_comments));
        this.J0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_challenge_results));
        this.K0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_badge_challenge_weekend_challenge_reminders));
        String string7 = getString(R.string.key_mobile_notifications_adaptive_training_plans);
        string7.getClass();
        this.L0 = (SwitchPreferenceCompat) H0(string7);
        SwitchPreferenceCompat switchPreferenceCompat5 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_max_gear_use));
        this.M0 = switchPreferenceCompat5;
        if (switchPreferenceCompat5 != null) {
            switchPreferenceCompat5.z(getString(R.string.max_gear_use));
        }
        this.f43612q = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_ecg_uploads));
        this.f43613r = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_health_snapshot_uploads));
        this.f43614t = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_health_status_outliers));
        this.X0 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_low_battery_level_category));
        this.Y0 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_low_battery_level));
        SwitchPreferenceCompat switchPreferenceCompat6 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_consent_permissions));
        this.f43598a1 = switchPreferenceCompat6;
        if (switchPreferenceCompat6 != null) {
            switchPreferenceCompat6.z(getString(R.string.lbl_permissions));
        }
        this.f43599b1 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_consent_permissions_category));
        SwitchPreferenceCompat switchPreferenceCompat7 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_livetrack_recipients_updates));
        this.f43600c1 = switchPreferenceCompat7;
        if (switchPreferenceCompat7 != null) {
            switchPreferenceCompat7.z(getString(R.string.lbl_recipient_updates));
        }
        SwitchPreferenceCompat switchPreferenceCompat8 = (SwitchPreferenceCompat) H0(getString(R.string.key_mobile_notifications_livetrack_recipients_updates_child_accounts));
        this.f43601d1 = switchPreferenceCompat8;
        if (switchPreferenceCompat8 != null) {
            switchPreferenceCompat8.z(getString(R.string.lbl_recipient_updates_child_accounts));
        }
        PreferenceCategory preferenceCategory4 = (PreferenceCategory) H0(getString(R.string.key_mobile_notifications_livetrack_category));
        if (preferenceCategory4 != null) {
            preferenceCategory4.z(getString(R.string.title_live_track));
        }
        ((AppCompatButton) view2.findViewById(R.id.phone_settings_button)).setOnClickListener(new a32.b(this, i16));
        p pVar = (p) w1Var.getValue();
        m.a(v1.a(pVar).f183565a.plus(bVar), new aj1.n(pVar, null), 2).f(getViewLifecycleOwner(), new c(new g(this, i16)));
        if (s3.b()) {
            PreferenceCategory preferenceCategory5 = this.P0;
            if (preferenceCategory5 != null) {
                ArrayList arrayList11 = this.f43607l;
                if (arrayList11 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList11.remove(preferenceCategory5);
            }
            PreferenceCategory preferenceCategory6 = this.P0;
            if (preferenceCategory6 != null) {
                preferenceCategory6.A(false);
            }
            PreferenceCategory preferenceCategory7 = this.O0;
            if (preferenceCategory7 != null) {
                ArrayList arrayList12 = this.f43607l;
                if (arrayList12 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList12.remove(preferenceCategory7);
            }
            PreferenceCategory preferenceCategory8 = this.O0;
            if (preferenceCategory8 != null) {
                preferenceCategory8.A(false);
            }
            PreferenceCategory preferenceCategory9 = this.Q0;
            if (preferenceCategory9 != null) {
                ArrayList arrayList13 = this.f43607l;
                if (arrayList13 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList13.remove(preferenceCategory9);
            }
            PreferenceCategory preferenceCategory10 = this.Q0;
            if (preferenceCategory10 != null) {
                preferenceCategory10.A(false);
            }
            PreferenceCategory preferenceCategory11 = this.R0;
            if (preferenceCategory11 != null) {
                ArrayList arrayList14 = this.f43607l;
                if (arrayList14 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList14.remove(preferenceCategory11);
            }
            PreferenceCategory preferenceCategory12 = this.R0;
            if (preferenceCategory12 != null) {
                preferenceCategory12.A(false);
            }
            PreferenceCategory preferenceCategory13 = this.S0;
            if (preferenceCategory13 != null) {
                ArrayList arrayList15 = this.f43607l;
                if (arrayList15 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList15.remove(preferenceCategory13);
            }
            PreferenceCategory preferenceCategory14 = this.S0;
            if (preferenceCategory14 != null) {
                preferenceCategory14.A(false);
            }
            SwitchPreferenceCompat switchPreferenceCompat9 = this.f43601d1;
            if (switchPreferenceCompat9 != null) {
                ArrayList arrayList16 = this.f43607l;
                if (arrayList16 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList16.remove(switchPreferenceCompat9);
            }
            SwitchPreferenceCompat switchPreferenceCompat10 = this.f43601d1;
            if (switchPreferenceCompat10 != null) {
                switchPreferenceCompat10.A(false);
            }
        } else {
            s3.f23252a.getClass();
            boolean zA = s3.a("ROLE_USER_MANAGED_ACCOUNTS_ADMIN");
            PreferenceCategory preferenceCategory15 = this.f43599b1;
            if (!zA) {
                if (preferenceCategory15 != null) {
                    preferenceCategory15.A(false);
                }
                PreferenceCategory preferenceCategory16 = this.f43599b1;
                if (preferenceCategory16 != null) {
                    ArrayList arrayList17 = this.f43607l;
                    if (arrayList17 == null) {
                        s.m("mPreferenceList");
                        throw null;
                    }
                    arrayList17.remove(preferenceCategory16);
                }
                SwitchPreferenceCompat switchPreferenceCompat11 = this.f43601d1;
                if (switchPreferenceCompat11 != null) {
                    ArrayList arrayList18 = this.f43607l;
                    if (arrayList18 == null) {
                        s.m("mPreferenceList");
                        throw null;
                    }
                    arrayList18.remove(switchPreferenceCompat11);
                }
                SwitchPreferenceCompat switchPreferenceCompat12 = this.f43601d1;
                if (switchPreferenceCompat12 != null) {
                    switchPreferenceCompat12.A(false);
                }
            } else if (preferenceCategory15 != null) {
                preferenceCategory15.z(getString(R.string.lbl_child_accounts));
            }
        }
        cj1.a aVar2 = this.f43608m;
        int i17 = aVar2 == null ? -1 : C0808b.f43620a[aVar2.ordinal()];
        if (i17 != -1) {
            if (i17 != 1) {
                u0.r();
                return;
            }
            PreferenceCategory preferenceCategory17 = this.O0;
            if (preferenceCategory17 != null) {
                ArrayList arrayList19 = this.f43607l;
                if (arrayList19 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                Iterator it = arrayList19.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        numValueOf = null;
                        break;
                    }
                    int i18 = i14 + 1;
                    if (preferenceCategory17.equals((Preference) it.next())) {
                        numValueOf = Integer.valueOf(i14);
                        break;
                    }
                    i14 = i18;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    RecyclerView recyclerView2 = this.f43604j;
                    if (recyclerView2 == null) {
                        s.m("mRecyclerView");
                        throw null;
                    }
                    recyclerView2.smoothScrollToPosition(iIntValue);
                }
            }
        }
    }

    @Override // aj1.d
    public final String v1() {
        String string = getString(R.string.lbl_push_notifications);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.b
    public final void v6() {
        u6(R.xml.gcm_settings_mobile_notifications);
    }

    @Override // aj1.d
    public final String x3() {
        return "MobileNotificationSettingsFragment";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
