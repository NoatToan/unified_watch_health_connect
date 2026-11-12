package com.garmin.android.apps.connectmobile.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import b.s;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import com.garmin.android.apps.connectmobile.view.preferences.OneLinePreference;
import e23.l;
import fw.p;
import gg1.a0;
import gg1.c0;
import gg1.g0;
import gg1.t;
import gg1.u;
import gg1.w;
import gg1.x;
import gg1.z;
import java.util.ArrayList;
import java.util.Map;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/a;", "Landroidx/preference/b;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroidx/preference/Preference$d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends androidx.preference.b implements SharedPreferences.OnSharedPreferenceChangeListener, Preference.d {
    public static final C0790a Y = new C0790a(null);
    public boolean A;
    public StepLengthDTO B;
    public StepLengthDTO C;
    public hv.h D;
    public boolean E;
    public final w1 F;
    public final gg1.j I;
    public final gg1.j P;
    public final d T;
    public final c X;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Preference f41576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Preference f41577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Preference f41578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Preference f41579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Preference f41580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Preference f41581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwitchPreferenceCompat f41582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SwitchPreferenceCompat f41583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Preference f41584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Preference f41585r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public gg1.j f41586t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public gg1.j f41587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f41588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f41589x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f41590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f41591z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41593b;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.f203819u1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.C4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41592a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f41593b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/a$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            m activity;
            a aVar = a.this;
            if ((aVar.A || aVar.f41590y > 0) && (activity = aVar.getActivity()) != null && !activity.isFinishing()) {
                aVar.requireActivity().finish();
                return;
            }
            SharedPreferences sharedPreferencesA = bd.f.a(aVar.requireContext());
            g22.e.l(aVar);
            aVar.A = true;
            float f14 = sharedPreferencesA.getFloat(aVar.getString(R.string.key_walking_measured_distance), 0.0f);
            String string = sharedPreferencesA.getString(aVar.getString(R.string.key_walking_total_steps), null);
            int i14 = string != null ? Integer.parseInt(string) : 0;
            if (f14 > 0.0f && i14 > 0) {
                SwitchPreferenceCompat switchPreferenceCompat = aVar.f41582o;
                if (switchPreferenceCompat == null || !switchPreferenceCompat.K0) {
                    StepLengthDTO stepLengthDTO = aVar.B;
                    if (stepLengthDTO != null && !stepLengthDTO.C()) {
                        aVar.f41591z++;
                        aVar.E = true;
                        f0.N(new x(aVar.M6(), null)).f(aVar.getViewLifecycleOwner(), new e(new gg1.i(aVar, 1)));
                    }
                } else {
                    gg1.i iVar = new gg1.i(aVar, 4);
                    aVar.f41591z++;
                    aVar.E = true;
                    StepLengthDTO stepLengthDTO2 = aVar.B;
                    if (stepLengthDTO2 == null || !stepLengthDTO2.C()) {
                        f0.N(new a0(aVar.M6(), aVar.F6(), null)).f(aVar.getViewLifecycleOwner(), new e(iVar));
                    } else {
                        f0.N(new u(aVar.M6(), aVar.F6(), null)).f(aVar.getViewLifecycleOwner(), new e(iVar));
                    }
                }
            }
            float f15 = sharedPreferencesA.getFloat(aVar.getString(R.string.key_running_measured_distance), 0.0f);
            String string2 = sharedPreferencesA.getString(aVar.getString(R.string.key_running_total_steps), null);
            int i15 = string2 != null ? Integer.parseInt(string2) : 0;
            if (f15 > 0.0f && i15 > 0) {
                SwitchPreferenceCompat switchPreferenceCompat2 = aVar.f41583p;
                if (switchPreferenceCompat2 == null || !switchPreferenceCompat2.K0) {
                    StepLengthDTO stepLengthDTO3 = aVar.C;
                    if (stepLengthDTO3 != null && !stepLengthDTO3.C()) {
                        aVar.f41591z++;
                        aVar.E = true;
                        f0.N(new w(aVar.M6(), null)).f(aVar.getViewLifecycleOwner(), new e(new gg1.i(aVar, 0)));
                    }
                } else {
                    gg1.i iVar2 = new gg1.i(aVar, 5);
                    aVar.f41591z++;
                    aVar.E = true;
                    StepLengthDTO stepLengthDTO4 = aVar.C;
                    if (stepLengthDTO4 == null || !stepLengthDTO4.C()) {
                        f0.N(new z(aVar.M6(), aVar.E6(), null)).f(aVar.getViewLifecycleOwner(), new e(iVar2));
                    } else {
                        f0.N(new t(aVar.M6(), aVar.E6(), null)).f(aVar.getViewLifecycleOwner(), new e(iVar2));
                    }
                }
            }
            if (aVar.f41591z == 0) {
                aVar.J6();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/a$d", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public d() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            a aVar = a.this;
            aVar.f41590y--;
            aVar.S6();
            aVar.f41589x = -1L;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            a.this.D = (hv.h) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41596a;

        public e(l lVar) {
            lVar.getClass();
            this.f41596a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f41596a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41596a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f41597a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f41597a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f41597a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f41598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar) {
            super(0);
            this.f41598a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f41598a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f41599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o13.l lVar) {
            super(0);
            this.f41599a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f41599a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f41600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f41601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, o13.l lVar) {
            super(0);
            this.f41600a = aVar;
            this.f41601b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f41600a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f41601b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f41602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f41603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment, o13.l lVar) {
            super(0);
            this.f41602a = fragment;
            this.f41603b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f41603b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f41602a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public a() {
        o13.l lVarA = o13.m.a(o13.n.NONE, new g(new f(this)));
        this.F = new w1(s0.f105811a.b(g0.class), new h(lVarA), new j(this, lVarA), new i(null, lVarA));
        this.I = new gg1.j(this, 0);
        this.P = new gg1.j(this, 1);
        this.T = new d();
        this.X = new c();
    }

    public final void A6(SharedPreferences sharedPreferences) {
        float f14 = sharedPreferences.getFloat(getString(R.string.key_running_measured_distance), 0.0f);
        String string = sharedPreferences.getString(getString(R.string.key_running_total_steps), null);
        int i14 = string != null ? Integer.parseInt(string) : 0;
        if (i14 <= 0 || f14 <= 0.0f) {
            Preference preference = this.f41579l;
            if (preference != null) {
                preference.y(getString(R.string.no_value));
                return;
            }
            return;
        }
        Preference preference2 = this.f41579l;
        if (preference2 != null) {
            preference2.y(y6(((double) f14) / ((double) i14), sharedPreferences.getInt(getString(R.string.key_running_measured_distance_unit), 0)));
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(getString(R.string.key_running_stride_length), String.valueOf(((double) f14) / ((double) i14)));
        editorEdit.apply();
    }

    public final void C6(SharedPreferences sharedPreferences) {
        float f14 = sharedPreferences.getFloat(getString(R.string.key_walking_measured_distance), 0.0f);
        String string = sharedPreferences.getString(getString(R.string.key_walking_total_steps), null);
        int i14 = string != null ? Integer.parseInt(string) : 0;
        if (i14 <= 0 || f14 <= 0.0f) {
            Preference preference = this.f41577j;
            if (preference != null) {
                preference.y(getString(R.string.no_value));
                return;
            }
            return;
        }
        Preference preference2 = this.f41577j;
        if (preference2 != null) {
            preference2.y(y6(((double) f14) / ((double) i14), sharedPreferences.getInt(getString(R.string.key_walking_measured_distance_unit), 0)));
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(getString(R.string.key_walking_stride_length), String.valueOf(((double) f14) / ((double) i14)));
        editorEdit.apply();
    }

    public final StepLengthDTO E6() {
        SharedPreferences sharedPreferencesA = bd.f.a(requireContext());
        StepLengthDTO stepLengthDTO = new StepLengthDTO();
        f12.l.f68084a.getClass();
        stepLengthDTO.f43517a = f12.l.a.a().U1();
        stepLengthDTO.f43518b = "running";
        float f14 = sharedPreferencesA.getFloat(getString(R.string.key_running_measured_distance), 0.0f);
        stepLengthDTO.f43519c = f14 > 0.0f ? f14 : 0.0d;
        if (sharedPreferencesA.getInt(getString(R.string.key_running_measured_distance_unit), 0) == 0) {
            stepLengthDTO.f43520d = "foot";
        } else {
            stepLengthDTO.f43520d = "meter";
        }
        String string = sharedPreferencesA.getString(getString(R.string.key_running_total_steps), null);
        int i14 = string != null ? Integer.parseInt(string) : 0;
        stepLengthDTO.f43521e = i14 > 0 ? i14 : 0.0d;
        String string2 = sharedPreferencesA.getString(getString(R.string.key_running_stride_length), null);
        float f15 = string2 != null ? Float.parseFloat(string2) : 0.0f;
        stepLengthDTO.f43522f = f15 > 0.0f ? f15 : 0.0d;
        return stepLengthDTO;
    }

    public final StepLengthDTO F6() {
        SharedPreferences sharedPreferencesA = bd.f.a(requireContext());
        StepLengthDTO stepLengthDTO = new StepLengthDTO();
        f12.l.f68084a.getClass();
        stepLengthDTO.f43517a = f12.l.a.a().U1();
        stepLengthDTO.f43518b = "walking";
        float f14 = sharedPreferencesA.getFloat(getString(R.string.key_walking_measured_distance), 0.0f);
        stepLengthDTO.f43519c = f14 > 0.0f ? f14 : 0.0d;
        if (sharedPreferencesA.getInt(getString(R.string.key_walking_measured_distance_unit), 0) == 0) {
            stepLengthDTO.f43520d = "foot";
        } else {
            stepLengthDTO.f43520d = "meter";
        }
        String string = sharedPreferencesA.getString(getString(R.string.key_walking_total_steps), null);
        int i14 = string != null ? Integer.parseInt(string) : 0;
        stepLengthDTO.f43521e = i14 > 0 ? i14 : 0.0d;
        String string2 = sharedPreferencesA.getString(getString(R.string.key_walking_stride_length), null);
        float f15 = string2 != null ? Float.parseFloat(string2) : 0.0f;
        stepLengthDTO.f43522f = f15 > 0.0f ? f15 : 0.0d;
        return stepLengthDTO;
    }

    public final void G6() {
        Toast.makeText(requireContext(), R.string.txt_error_occurred, 0).show();
    }

    public final void H6(SwitchPreferenceCompat switchPreferenceCompat) {
        T6();
        Preference preference = this.f41585r;
        if (preference != null) {
            preference.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference2 = this.f41578k;
        if (preference2 != null) {
            preference2.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference3 = this.f41581n;
        if (preference3 != null) {
            preference3.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference4 = this.f41579l;
        if (preference4 != null) {
            preference4.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
    }

    public final void I6(SwitchPreferenceCompat switchPreferenceCompat) {
        U6();
        Preference preference = this.f41584q;
        if (preference != null) {
            preference.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference2 = this.f41576i;
        if (preference2 != null) {
            preference2.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference3 = this.f41580m;
        if (preference3 != null) {
            preference3.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
        Preference preference4 = this.f41577j;
        if (preference4 != null) {
            preference4.A(switchPreferenceCompat != null ? switchPreferenceCompat.K0 : true);
        }
    }

    public final void J6() {
        m activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (this.E) {
            requireActivity().setResult(-1, new Intent("android.intent.action.EDIT"));
        }
        requireActivity().finish();
    }

    public final String K6(SharedPreferences sharedPreferences, int i14) {
        int i15 = sharedPreferences.getInt(getString(i14), 0);
        if (i15 == 0) {
            String string = getString(R.string.common_feet_string);
            string.getClass();
            return string;
        }
        if (i15 != 1) {
            return "";
        }
        String string2 = getString(R.string.common_meters_string);
        string2.getClass();
        return string2;
    }

    public final g0 M6() {
        return (g0) this.F.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x0266  */
    /* JADX WARN: Code duplicated, block: B:95:0x0270  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b  */
    public final void S6() {
        Preference preferenceH0;
        SwitchPreferenceCompat switchPreferenceCompat;
        if (this.f41590y == 0) {
            g22.e.f(this);
            u6(R.xml.gcm_settings_custom_stride_length);
            this.f41582o = (SwitchPreferenceCompat) H0(getString(R.string.key_device_walking));
            this.f41583p = (SwitchPreferenceCompat) H0(getString(R.string.key_device_running));
            SharedPreferences sharedPreferencesA = bd.f.a(requireContext());
            U6();
            T6();
            String string = sharedPreferencesA.getString(getString(R.string.key_device_walking_switch_value), getString(R.string.lbl_off));
            SwitchPreferenceCompat switchPreferenceCompat2 = this.f41582o;
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.E(!p005kotlin.jvm.internal.s.g(string, getString(R.string.lbl_off)));
            }
            I6(this.f41582o);
            Preference preference = this.f41584q;
            if (preference != null) {
                preference.f10152f = this;
                preference.y(K6(sharedPreferencesA, R.string.key_walking_measured_distance_unit));
            }
            Preference preference2 = this.f41576i;
            int i14 = 0;
            if (preference2 != null) {
                preference2.f10152f = this;
                preference2.C = true;
                preference2.D = false;
                preference2.y(w6(sharedPreferencesA.getFloat(getString(R.string.key_walking_measured_distance), 0.0f), sharedPreferencesA.getInt(getString(R.string.key_walking_measured_distance_unit), 0)));
            }
            Preference preference3 = this.f41580m;
            if (preference3 != null) {
                String string2 = sharedPreferencesA.getString(getString(R.string.key_walking_total_steps), null);
                preference3.y(z6(string2 != null ? Integer.parseInt(string2) : 0));
                preference3.f10152f = this;
            }
            C6(sharedPreferencesA);
            this.f41586t = new gg1.j(this, 3);
            if (V6()) {
                PreferenceScreen preferenceScreen = this.f10193b.f17494g;
                Preference preferenceH1 = H0(getString(R.string.key_device_running_preference));
                if (preferenceH1 != null) {
                    preferenceScreen.H(preferenceH1);
                }
                SwitchPreferenceCompat switchPreferenceCompat3 = this.f41583p;
                if (switchPreferenceCompat3 != null) {
                    preferenceScreen.H(switchPreferenceCompat3);
                }
                PreferenceCategory preferenceCategory = new PreferenceCategory(requireContext());
                if (1 != preferenceCategory.f10153g) {
                    preferenceCategory.f10153g = 1;
                    androidx.preference.c cVar = preferenceCategory.X;
                    if (cVar != null) {
                        Handler handler = cVar.f10210e;
                        androidx.preference.c.a aVar = cVar.f10211f;
                        handler.removeCallbacks(aVar);
                        handler.post(aVar);
                    }
                }
                preferenceScreen.E(preferenceCategory);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                OneLinePreference oneLinePreference = new OneLinePreference(contextRequireContext, null, 0, 0, 14, null);
                oneLinePreference.w(getString(R.string.key_device_running_switch_value));
                oneLinePreference.z(oneLinePreference.f10147a.getString(R.string.lbl_running));
                oneLinePreference.x(R.string.device_settings_auto_calculated);
                if (oneLinePreference.f10163p) {
                    oneLinePreference.f10163p = false;
                    oneLinePreference.j(oneLinePreference.B());
                    oneLinePreference.i();
                }
                preferenceCategory.E(oneLinePreference);
            } else {
                String string3 = sharedPreferencesA.getString(getString(R.string.key_device_running_switch_value), getString(R.string.lbl_off));
                SwitchPreferenceCompat switchPreferenceCompat4 = this.f41583p;
                if (switchPreferenceCompat4 != null) {
                    switchPreferenceCompat4.E(!p005kotlin.jvm.internal.s.g(string3, getString(R.string.lbl_off)));
                }
                H6(this.f41583p);
                Preference preference4 = this.f41585r;
                if (preference4 != null) {
                    preference4.f10152f = this;
                    preference4.y(K6(sharedPreferencesA, R.string.key_running_measured_distance_unit));
                }
                Preference preference5 = this.f41578k;
                if (preference5 != null) {
                    preference5.f10152f = this;
                    preference5.y(w6(sharedPreferencesA.getFloat(getString(R.string.key_running_measured_distance), 0.0f), sharedPreferencesA.getInt(getString(R.string.key_running_measured_distance_unit), 0)));
                }
                Preference preference6 = this.f41581n;
                if (preference6 != null) {
                    String string4 = sharedPreferencesA.getString(getString(R.string.key_running_total_steps), null);
                    preference6.y(z6(string4 != null ? Integer.parseInt(string4) : 0));
                    preference6.f10152f = this;
                }
                A6(sharedPreferencesA);
                this.f41587v = new gg1.j(this, 2);
            }
            String str = this.f41588w;
            hv.h hVar = this.D;
            Map<u0, vg1.t> map = n0.f203577a;
            if (!TextUtils.isEmpty(str)) {
                if (hVar != null) {
                    ArrayList<bm2.c> arrayList = hVar.f85765a;
                    if (arrayList.size() > 0) {
                        str.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (p005kotlin.jvm.internal.s.g(((bm2.c) obj).getF143517g(), str)) {
                                arrayList2.add(obj);
                            }
                        }
                        while (true) {
                            if (i14 < arrayList2.size()) {
                                bm2.c cVar2 = (bm2.c) arrayList2.get(i14);
                                if (cVar2 == null) {
                                    i14++;
                                } else if (cVar2.f18944y || !cVar2.h()) {
                                }
                            }
                        }
                    } else if (!n0.i(u0.f203807r5, str) && !n0.i(u0.A5, str) && !n0.i(u0.E4, str) && !n0.i(u0.f203843y1, str) && !n0.i(u0.W0, str) && !n0.i(u0.f203825v1, str) && !n0.i(u0.X1, str)) {
                        n0.i(u0.R1, str);
                    }
                    if (!V6()) {
                        preferenceH0 = H0(getString(R.string.key_device_running_preference));
                        if (preferenceH0 != null) {
                            this.f10193b.f17494g.H(preferenceH0);
                        }
                        switchPreferenceCompat = this.f41583p;
                        if (switchPreferenceCompat != null) {
                            this.f10193b.f17494g.H(switchPreferenceCompat);
                        }
                    }
                } else {
                    if (!n0.i(u0.f203807r5, str)) {
                        n0.i(u0.R1, str);
                    }
                    if (!V6()) {
                        preferenceH0 = H0(getString(R.string.key_device_running_preference));
                        if (preferenceH0 != null) {
                            this.f10193b.f17494g.H(preferenceH0);
                        }
                        switchPreferenceCompat = this.f41583p;
                        if (switchPreferenceCompat != null) {
                            this.f10193b.f17494g.H(switchPreferenceCompat);
                        }
                    }
                }
            }
            SharedPreferences sharedPreferencesF = this.f10193b.f17494g.f();
            if (sharedPreferencesF != null) {
                sharedPreferencesF.registerOnSharedPreferenceChangeListener(this);
            }
        }
    }

    public final void T6() {
        if (this.f41585r == null) {
            this.f41585r = H0(getString(R.string.key_running_measured_distance_unit));
        }
        if (this.f41578k == null) {
            this.f41578k = H0(getString(R.string.key_running_measured_distance));
        }
        if (this.f41581n == null) {
            this.f41581n = H0(getString(R.string.key_running_total_steps));
        }
        if (this.f41579l == null) {
            this.f41579l = H0(getString(R.string.key_running_stride_length));
        }
        Preference preference = this.f41581n;
        if (preference != null) {
            preference.f10152f = this;
        }
    }

    public final void U6() {
        if (this.f41584q == null) {
            this.f41584q = H0(getString(R.string.key_walking_measured_distance_unit));
        }
        if (this.f41576i == null) {
            this.f41576i = H0(getString(R.string.key_walking_measured_distance));
        }
        if (this.f41580m == null) {
            this.f41580m = H0(getString(R.string.key_walking_total_steps));
        }
        if (this.f41577j == null) {
            this.f41577j = H0(getString(R.string.key_walking_stride_length));
        }
        Preference preference = this.f41580m;
        if (preference != null) {
            preference.f10152f = this;
        }
    }

    public final boolean V6() {
        u0 u0Var;
        if (TextUtils.isEmpty(this.f41588w) || (u0Var = (u0) u0.f203782n6.get(this.f41588w)) == null) {
            return false;
        }
        int i14 = b.f41592a[u0Var.ordinal()];
        return i14 == 1 || i14 == 2 || i14 == 3;
    }

    @Override // androidx.preference.Preference.d
    public final boolean X3(final Preference preference) {
        String string;
        String string2;
        int i14;
        String str = preference.f10159l;
        if (p005kotlin.jvm.internal.s.g(str, getString(R.string.key_walking_measured_distance_unit))) {
            rk1.b.e eVar = new rk1.b.e(requireContext());
            eVar.h(new String[]{getString(R.string.common_feet_string), getString(R.string.common_meters_string)}, false);
            eVar.j(getString(R.string.common_feet_string));
            eVar.i(getString(R.string.common_meters_string));
            SharedPreferences sharedPreferencesF = preference.f();
            eVar.g(sharedPreferencesF != null ? K6(sharedPreferencesF, R.string.key_walking_measured_distance_unit) : "");
            eVar.f153344b.f153345a = 1;
            final int i15 = 0;
            eVar.f(new rk1.b.c() { // from class: gg1.h
                @Override // rk1.b.c
                public final void a(ArrayList arrayList) {
                    SharedPreferences.Editor editorEdit;
                    SharedPreferences.Editor editorEdit2;
                    int i16 = i15;
                    Preference preference2 = preference;
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a = com.garmin.android.apps.connectmobile.settings.a.Y;
                            SharedPreferences sharedPreferencesF2 = preference2.f();
                            if (sharedPreferencesF2 != null && (editorEdit = sharedPreferencesF2.edit()) != null) {
                                String str2 = preference2.f10159l;
                                Object obj = arrayList.get(0);
                                obj.getClass();
                                SharedPreferences.Editor editorPutInt = editorEdit.putInt(str2, Integer.parseInt((String) obj));
                                if (editorPutInt != null) {
                                    editorPutInt.apply();
                                }
                                break;
                            }
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a2 = com.garmin.android.apps.connectmobile.settings.a.Y;
                            SharedPreferences sharedPreferencesF3 = preference2.f();
                            if (sharedPreferencesF3 != null && (editorEdit2 = sharedPreferencesF3.edit()) != null) {
                                String str3 = preference2.f10159l;
                                Object obj2 = arrayList.get(0);
                                obj2.getClass();
                                SharedPreferences.Editor editorPutInt2 = editorEdit2.putInt(str3, Integer.parseInt((String) obj2));
                                if (editorPutInt2 != null) {
                                    editorPutInt2.apply();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            eVar.f153344b.f153346b = requireContext().getString(R.string.lbl_units);
            eVar.b().show();
            return true;
        }
        if (p005kotlin.jvm.internal.s.g(str, getString(R.string.key_running_measured_distance_unit))) {
            rk1.b.e eVar2 = new rk1.b.e(requireContext());
            eVar2.h(new String[]{getString(R.string.common_feet_string), getString(R.string.common_meters_string)}, false);
            eVar2.j(getString(R.string.common_feet_string));
            eVar2.i(getString(R.string.common_meters_string));
            SharedPreferences sharedPreferencesF2 = preference.f();
            eVar2.g(sharedPreferencesF2 != null ? K6(sharedPreferencesF2, R.string.key_running_measured_distance_unit) : "");
            eVar2.f153344b.f153345a = 1;
            final int i16 = 1;
            eVar2.f(new rk1.b.c() { // from class: gg1.h
                @Override // rk1.b.c
                public final void a(ArrayList arrayList) {
                    SharedPreferences.Editor editorEdit;
                    SharedPreferences.Editor editorEdit2;
                    int i17 = i16;
                    Preference preference2 = preference;
                    switch (i17) {
                        case 0:
                            com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a = com.garmin.android.apps.connectmobile.settings.a.Y;
                            SharedPreferences sharedPreferencesF3 = preference2.f();
                            if (sharedPreferencesF3 != null && (editorEdit = sharedPreferencesF3.edit()) != null) {
                                String str2 = preference2.f10159l;
                                Object obj = arrayList.get(0);
                                obj.getClass();
                                SharedPreferences.Editor editorPutInt = editorEdit.putInt(str2, Integer.parseInt((String) obj));
                                if (editorPutInt != null) {
                                    editorPutInt.apply();
                                }
                                break;
                            }
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a2 = com.garmin.android.apps.connectmobile.settings.a.Y;
                            SharedPreferences sharedPreferencesF4 = preference2.f();
                            if (sharedPreferencesF4 != null && (editorEdit2 = sharedPreferencesF4.edit()) != null) {
                                String str3 = preference2.f10159l;
                                Object obj2 = arrayList.get(0);
                                obj2.getClass();
                                SharedPreferences.Editor editorPutInt2 = editorEdit2.putInt(str3, Integer.parseInt((String) obj2));
                                if (editorPutInt2 != null) {
                                    editorPutInt2.apply();
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            eVar2.f153344b.f153346b = requireContext().getString(R.string.lbl_units);
            eVar2.b().show();
            return true;
        }
        if (p005kotlin.jvm.internal.s.g(str, getString(R.string.key_walking_measured_distance))) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            gg1.j jVar = this.f41586t;
            if (jVar == null) {
                p005kotlin.jvm.internal.s.m("walkingMeasuredDistanceListener");
                throw null;
            }
            SharedPreferences sharedPreferencesF3 = preference.f();
            i14 = sharedPreferencesF3 != null ? sharedPreferencesF3.getInt(getString(R.string.key_walking_measured_distance_unit), 0) : 0;
            SharedPreferences sharedPreferencesF4 = preference.f();
            new com.garmin.android.apps.connectmobile.view.b(contextRequireContext, jVar, i14, sharedPreferencesF4 != null ? sharedPreferencesF4.getFloat(getString(R.string.key_walking_measured_distance), 0.0f) : 0.0f).show();
            return true;
        }
        if (p005kotlin.jvm.internal.s.g(str, getString(R.string.key_running_measured_distance))) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            gg1.j jVar2 = this.f41587v;
            if (jVar2 == null) {
                p005kotlin.jvm.internal.s.m("runningMeasuredDistanceListener");
                throw null;
            }
            SharedPreferences sharedPreferencesF5 = preference.f();
            i14 = sharedPreferencesF5 != null ? sharedPreferencesF5.getInt(getString(R.string.key_running_measured_distance_unit), 0) : 0;
            SharedPreferences sharedPreferencesF6 = preference.f();
            new com.garmin.android.apps.connectmobile.view.b(contextRequireContext2, jVar2, i14, sharedPreferencesF6 != null ? sharedPreferencesF6.getFloat(getString(R.string.key_running_measured_distance), 0.0f) : 0.0f).show();
            return true;
        }
        double d14 = 0.0d;
        if (p005kotlin.jvm.internal.s.g(str, getString(R.string.key_walking_total_steps))) {
            SharedPreferences sharedPreferencesF7 = preference.f();
            if (sharedPreferencesF7 != null && (string2 = sharedPreferencesF7.getString(getString(R.string.key_walking_total_steps), null)) != null) {
                d14 = Double.parseDouble(string2);
            }
            r22.g0 g0VarU6 = r22.g0.u6(d14, null, getString(R.string.lbl_total_steps), 5);
            g0VarU6.f149658f = this.I;
            g0VarU6.show(requireActivity().getSupportFragmentManager(), "EditTextPickerDialog");
            return true;
        }
        if (!p005kotlin.jvm.internal.s.g(str, getString(R.string.key_running_total_steps))) {
            return false;
        }
        SharedPreferences sharedPreferencesF8 = preference.f();
        if (sharedPreferencesF8 != null && (string = sharedPreferencesF8.getString(getString(R.string.key_running_total_steps), null)) != null) {
            d14 = Double.parseDouble(string);
        }
        r22.g0 g0VarU7 = r22.g0.u6(d14, null, getString(R.string.lbl_total_steps), 5);
        g0VarU7.f149658f = this.P;
        g0VarU7.show(requireActivity().getSupportFragmentManager(), "EditTextPickerDialog");
        return true;
    }

    public final void X6() {
        int i14 = this.f41591z - 1;
        this.f41591z = i14;
        if (i14 == 0) {
            g22.e.f(this);
            J6();
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        if (onBackPressedDispatcher == null) {
            p005kotlin.jvm.internal.s.m("onBackPressedDispatcher");
            throw null;
        }
        onBackPressedDispatcher.b(this.X, this);
        Bundle arguments = getArguments();
        this.f41588w = arguments != null ? arguments.getString("GCM_deviceProductNbr") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SharedPreferences sharedPreferencesF;
        super.onPause();
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        if (preferenceScreen == null || (sharedPreferencesF = preferenceScreen.f()) == null) {
            return;
        }
        sharedPreferencesF.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        SharedPreferences sharedPreferencesF;
        super.onResume();
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        if (preferenceScreen == null || (sharedPreferencesF = preferenceScreen.f()) == null) {
            return;
        }
        sharedPreferencesF.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if (str == null) {
            return;
        }
        if (str.equals(getString(R.string.key_device_walking))) {
            if (this.f41582o == null) {
                this.f41582o = (SwitchPreferenceCompat) H0(str);
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            SwitchPreferenceCompat switchPreferenceCompat = this.f41582o;
            if (switchPreferenceCompat == null || !switchPreferenceCompat.K0) {
                editorEdit.putString(getString(R.string.key_device_walking_switch_value), getString(R.string.lbl_off));
            } else {
                editorEdit.putString(getString(R.string.key_device_walking_switch_value), getString(R.string.lbl_on));
            }
            editorEdit.apply();
            I6(this.f41582o);
        }
        Preference preference = this.f41584q;
        if (preference != null) {
            preference.y(K6(sharedPreferences, R.string.key_walking_measured_distance_unit));
        }
        Preference preference2 = this.f41576i;
        if (preference2 != null) {
            preference2.y(w6(sharedPreferences.getFloat(getString(R.string.key_walking_measured_distance), 0.0f), sharedPreferences.getInt(getString(R.string.key_walking_measured_distance_unit), 0)));
        }
        Preference preference3 = this.f41580m;
        if (preference3 != null) {
            String string = sharedPreferences.getString(getString(R.string.key_walking_total_steps), null);
            preference3.y(z6(string != null ? Integer.parseInt(string) : 0));
        }
        if (str.equals(getString(R.string.key_device_running))) {
            if (this.f41583p == null) {
                this.f41583p = (SwitchPreferenceCompat) H0(str);
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            SwitchPreferenceCompat switchPreferenceCompat2 = this.f41583p;
            if (switchPreferenceCompat2 == null || !switchPreferenceCompat2.K0) {
                editorEdit2.putString(getString(R.string.key_device_running_switch_value), getString(R.string.lbl_off));
            } else {
                editorEdit2.putString(getString(R.string.key_device_running_switch_value), getString(R.string.lbl_on));
            }
            editorEdit2.apply();
            H6(this.f41583p);
        }
        Preference preference4 = this.f41585r;
        if (preference4 != null) {
            preference4.y(K6(sharedPreferences, R.string.key_running_measured_distance_unit));
        }
        Preference preference5 = this.f41578k;
        if (preference5 != null) {
            preference5.y(w6(sharedPreferences.getFloat(getString(R.string.key_running_measured_distance), 0.0f), sharedPreferences.getInt(getString(R.string.key_running_measured_distance_unit), 0)));
        }
        Preference preference6 = this.f41581n;
        if (preference6 != null) {
            String string2 = sharedPreferences.getString(getString(R.string.key_running_total_steps), null);
            preference6.y(z6(string2 != null ? Integer.parseInt(string2) : 0));
        }
        C6(sharedPreferences);
        A6(sharedPreferences);
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        long j8 = this.f41589x;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
            if (cVar.e(Long.valueOf(j8))) {
                cVar.a(this.f41589x);
            }
            this.f41589x = -1L;
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.l(this);
        this.f41590y++;
        f0.N(new gg1.f0(M6(), null)).f(getViewLifecycleOwner(), new e(new gg1.i(this, 2)));
        this.f41590y++;
        f0.N(new c0(M6(), null)).f(getViewLifecycleOwner(), new e(new gg1.i(this, 3)));
        this.f41590y++;
        cc0.b bVar = (cc0.b) KoinJavaComponent.get$default(cc0.b.class, null, null, 6, null);
        bVar.getClass();
        i2.a(a2.DEVICES, "DevicesBizManager", "getAllGarminDevices: cache = true");
        this.f41589x = com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.a(bVar, true), this.T);
    }

    @Override // androidx.preference.b
    public final void v6() {
    }

    public final String w6(double d14, int i14) {
        String string = d14 > 0.0d ? l3.f23125c.format(d14) : getString(R.string.no_value);
        String string2 = getString(i14 == 0 ? R.string.lbl_foot : R.string.lbl_meter);
        string2.getClass();
        String string3 = getString(R.string.string_space_string_pattern, string, string2);
        string3.getClass();
        return d53.n.c(string3);
    }

    public final String y6(double d14, int i14) {
        String string;
        if (d14 > 0.0d) {
            String str = l3.f23125c.format(d14);
            String string2 = getString(i14 == 0 ? R.string.lbl_foot : R.string.lbl_meter);
            string2.getClass();
            string = getString(R.string.string_space_string_pattern, str, string2);
        } else {
            string = getString(R.string.no_value);
        }
        string.getClass();
        return d53.n.c(string);
    }

    public final String z6(int i14) {
        String string;
        if (i14 > 0) {
            l3.f23124b.getClass();
            string = l3.f23131i.format(i14);
        } else {
            string = getString(R.string.no_value);
        }
        string.getClass();
        return d53.n.c(string);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "STEPS_EDIT_MAX_CHARS", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0790a {
        public /* synthetic */ C0790a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0790a() {
        }
    }
}
