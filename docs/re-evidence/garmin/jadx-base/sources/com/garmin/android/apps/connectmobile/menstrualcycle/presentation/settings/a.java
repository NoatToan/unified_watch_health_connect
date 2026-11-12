package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MCTSettingsContraceptionActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTCycleTypeActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.mlkit.common.MlKitException;
import db1.m;
import db1.u;
import fw.p;
import gg1.h0;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kx0.o;
import kx0.q;
import o13.t;
import o53.c2;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.x0;
import p13.y;
import ro0.l;
import w3.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final C0691a f39031t1 = new C0691a(null);

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final Logger f39032u1;
    public h0 A;
    public LocalDate B;
    public d3 C;
    public ScrollView D;
    public View E;
    public View F;
    public View H0;
    public View I;
    public View I0;
    public View J0;
    public View K0;
    public View L0;
    public View M0;
    public View N0;
    public TextView O0;
    public View P;
    public TextView P0;
    public SwitchCompat Q0;
    public SwitchCompat R0;
    public TextView S0;
    public View T;
    public SwitchCompat T0;
    public SwitchCompat U0;
    public SwitchCompat V0;
    public SwitchCompat W0;
    public View X;
    public SwitchCompat X0;
    public View Y;
    public SwitchCompat Y0;
    public View Z;
    public SwitchCompat Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e1 f39033a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public SwitchCompat f39034a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UserSettingsDTO f39035b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public SwitchCompat f39036b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww0.a f39037c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Button f39038c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ww0.a f39039d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f39040d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ww0.a f39041e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public TextView f39042e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww0.i f39043f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f39044f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39045g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f39046g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39047h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f39048h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39049i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f39050i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39051j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f39052j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39053k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f39054k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f39055k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39056l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final t f39057l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39058m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final t f39059m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39060n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final t f39061n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39062o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final t f39063o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39064p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final w1 f39065p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39066q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final w1 f39067q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39068r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final t f39069r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public c f39070s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39071t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f39072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f39074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f39075y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f39076z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39077a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39077a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/a$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:55:0x0104  */
        /* JADX WARN: Code duplicated, block: B:57:0x010a  */
        /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
        @Override // b.s
        public final void b() {
            u weightGoalUserInputs;
            u weightGoalUserInputs2;
            androidx.fragment.app.m activity;
            String string;
            boolean z14;
            String str;
            String string2;
            o13.p pVar;
            o13.p pVar2;
            c22.f fVar;
            tb1.c.a aVar = tb1.c.f163744a;
            a aVar2 = a.this;
            ww0.a aVar3 = aVar2.f39039d;
            aVar.getClass();
            if (!tb1.c.a.a(aVar3)) {
                aVar2.z6();
                return;
            }
            m mVar = aVar2.w6().f107065h;
            if (mVar == null || (weightGoalUserInputs = mVar.getWeightGoalUserInputs()) == null) {
                aVar2.z6();
                return;
            }
            Double heightInCm = weightGoalUserInputs.getHeightInCm();
            double dDoubleValue = heightInCm != null ? heightInCm.doubleValue() : 0.0d;
            Double weightInGram = weightGoalUserInputs.getWeightInGram();
            double dDoubleValue2 = weightInGram != null ? weightInGram.doubleValue() : 0.0d;
            if (!weightGoalUserInputs.getWeightGoalRecommendation()) {
                aVar2.z6();
                return;
            }
            if (dDoubleValue != 0.0d && dDoubleValue2 != 0.0d) {
                aVar2.z6();
                return;
            }
            m mVar2 = aVar2.w6().f107065h;
            if (mVar2 == null || (weightGoalUserInputs2 = mVar2.getWeightGoalUserInputs()) == null || (activity = aVar2.getActivity()) == null) {
                return;
            }
            Double heightInCm2 = weightGoalUserInputs2.getHeightInCm();
            double dDoubleValue3 = heightInCm2 != null ? heightInCm2.doubleValue() : 0.0d;
            Double weightInGram2 = weightGoalUserInputs2.getWeightInGram();
            double dDoubleValue4 = weightInGram2 != null ? weightInGram2.doubleValue() : 0.0d;
            if (dDoubleValue3 == 0.0d && dDoubleValue4 == 0.0d) {
                string = activity.getString(R.string.pregnancy_enter_weight_height_title);
                string.getClass();
                string2 = activity.getString(R.string.pregnancy_enter_weight_height_message);
                string2.getClass();
            } else {
                if (dDoubleValue3 != 0.0d) {
                    if (dDoubleValue4 == 0.0d) {
                        string = activity.getString(R.string.pregnancy_enter_weight_title);
                        string.getClass();
                        string2 = activity.getString(R.string.pregnancy_enter_weight_message);
                        string2.getClass();
                    } else {
                        string = null;
                        z14 = false;
                        str = null;
                    }
                    if (z14) {
                        pVar = new o13.p(activity.getString(R.string.lbl_ok), new kc0.a(27));
                        pVar2 = new o13.p(activity.getString(R.string.lbl_cancel), new k41.e(22, weightGoalUserInputs2, aVar2));
                        fVar = c22.f.f23050a;
                        if (string != null) {
                            p005kotlin.jvm.internal.s.m("title");
                            throw null;
                        }
                        if (str != null) {
                            p005kotlin.jvm.internal.s.m("description");
                            throw null;
                        }
                        fVar.getClass();
                        c22.f.b(activity, string, str, pVar, pVar2, null, false).show();
                    }
                }
                string = activity.getString(R.string.pregnancy_enter_height_title);
                string.getClass();
                string2 = activity.getString(R.string.pregnancy_enter_height_message);
                string2.getClass();
            }
            str = string2;
            z14 = true;
            if (z14) {
                pVar = new o13.p(activity.getString(R.string.lbl_ok), new kc0.a(27));
                pVar2 = new o13.p(activity.getString(R.string.lbl_cancel), new k41.e(22, weightGoalUserInputs2, aVar2));
                fVar = c22.f.f23050a;
                if (string != null) {
                    p005kotlin.jvm.internal.s.m("title");
                    throw null;
                }
                if (str != null) {
                    p005kotlin.jvm.internal.s.m("description");
                    throw null;
                }
                fVar.getClass();
                c22.f.b(activity, string, str, pVar, pVar2, null, false).show();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/a$d", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.menu_help, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_help) {
                return false;
            }
            tb1.c.a aVar = tb1.c.f163744a;
            a aVar2 = a.this;
            ww0.a aVar3 = aVar2.f39039d;
            aVar.getClass();
            if (tb1.c.a.a(aVar3)) {
                HelpActivity.a.e(HelpActivity.f36653a, aVar2.getContext(), l.PREGNANCY_SETTINGS_HELP, null, null, 12);
                return true;
            }
            HelpActivity.a aVar4 = HelpActivity.f36653a;
            Context context = aVar2.getContext();
            l lVar = l.MENSTRUAL_CYCLE;
            aVar4.getClass();
            HelpActivity.a.d(context, lVar, "CYCLE_TYPES_AND_PREDICTIONS", null);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f39080a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f39080a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f39080a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39080a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f39081a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39081a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39082a = aVar;
            this.f39083b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39082a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39083b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39084a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f39084a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39084a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f39085a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39085a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39086a = aVar;
            this.f39087b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39086a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39087b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f39088a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39088a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f39032u1 = gt2.b.f79005a.h("MenstrualCycleSettingsFragment");
    }

    public a() {
        ww0.a aVar = ww0.a.REGULAR;
        this.f39037c = aVar;
        this.f39039d = aVar;
        this.f39043f = ww0.i.NONE;
        this.f39045g = 28;
        this.f39047h = 5;
        this.f39049i = true;
        this.f39051j = true;
        this.f39053k = true;
        this.f39056l = true;
        this.f39058m = true;
        this.f39062o = true;
        this.f39064p = true;
        this.A = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? h0.MILLI_MOLES_PER_LITER : h0.MILLI_GRAMS_PER_DECILITER;
        final int i14 = 1;
        this.f39057l1 = o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
        final int i15 = 2;
        this.f39059m1 = o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
        final int i16 = 3;
        this.f39061n1 = o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
        final int i17 = 4;
        this.f39063o1 = o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
        final int i18 = 5;
        o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
        t0 t0Var = s0.f105811a;
        this.f39065p1 = new w1(t0Var.b(kx0.m.class), new f(this), new h(this), new g(null, this));
        this.f39067q1 = new w1(t0Var.b(qb1.f.class), new i(this), new k(this), new j(null, this));
        final int i19 = 0;
        this.f39069r1 = o13.m.b(new e23.a(this) { // from class: kx0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107048b;

            {
                this.f107048b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar2 = this.f107048b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        return aVar2.requireActivity().getOnBackPressedDispatcher();
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments = aVar2.getArguments();
                        return Boolean.valueOf(arguments != null ? arguments.getBoolean("SAVE_ON_BACK_KEY", false) : false);
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments2 = aVar2.getArguments();
                        return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("SCROLL_TO_TRACKING_OPTIONS", false) : false);
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments3 = aVar2.getArguments();
                        return Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("NAVIGATE_TO_CYCLE_TYPE", false) : false);
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        Bundle arguments4 = aVar2.getArguments();
                        return Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        ww0.a[] aVarArrValues = ww0.a.values();
                        aVarArrValues.getClass();
                        ArrayList<ww0.a> arrayList = new ArrayList();
                        for (ww0.a aVar3 : aVarArrValues) {
                            if (aVar3.ordinal() != ww0.a.PREGNANT.ordinal() && aVar3.ordinal() != ww0.a.INACTIVE.ordinal()) {
                                arrayList.add(aVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        for (ww0.a aVar4 : arrayList) {
                            Context contextRequireContext = aVar2.requireContext();
                            contextRequireContext.getClass();
                            arrayList2.add(aVar4.a(contextRequireContext));
                        }
                        return (String[]) arrayList2.toArray(new String[0]);
                }
            }
        });
    }

    public final void A6() {
        View view2 = this.P;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleTypeRow");
            throw null;
        }
        final int i14 = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: kx0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107052b;

            {
                this.f107052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107052b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTCycleTypeActivity.a aVar2 = MCTCycleTypeActivity.f39091e;
                        Context context = aVar.getContext();
                        ww0.a aVar3 = aVar.f39037c;
                        ww0.a aVar4 = aVar.f39039d;
                        aVar2.getClass();
                        aVar.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar3, aVar4), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        break;
                    case 1:
                        Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                        logger.debug("Stop tracking button clicked ");
                        androidx.fragment.app.m activity = aVar.getActivity();
                        if (activity != null) {
                            tb1.c.a aVar5 = tb1.c.f163744a;
                            ww0.a aVar6 = aVar.f39039d;
                            aVar5.getClass();
                            boolean zA = tb1.c.a.a(aVar6);
                            wr.g.y("showStopCycleTypeAlert: isPregnancy=", zA, logger);
                            if (!zA) {
                                o13.p pVar = new o13.p(aVar.getString(R.string.pregnancy_stop_tracking), new k41.e(23, aVar, activity));
                                o13.p pVar2 = new o13.p(aVar.getString(R.string.lbl_cancel), new kc0.a(28));
                                c22.f.f23050a.getClass();
                                androidx.appcompat.app.e eVarA = c22.f.a(activity, R.string.pregnancy_stop_cycle_tracking_question, R.string.pregnancy_stop_cycle_tracking_confirmation, pVar, pVar2);
                                eVarA.setOnShowListener(new hb1.d(activity, 2));
                                eVarA.show();
                            } else {
                                db1.m mVar = aVar.w6().f107065h;
                                if (mVar != null) {
                                    aVar.F6();
                                    PregnancyStopTrackingActivity.f41001d.getClass();
                                    PregnancyStopTrackingActivity.a.a(activity, mVar);
                                }
                            }
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTSettingsContraceptionActivity.a aVar7 = MCTSettingsContraceptionActivity.f39006d;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        ww0.i iVar = aVar.f39043f;
                        aVar7.getClass();
                        iVar.getClass();
                        Intent intent = new Intent(contextRequireContext, (Class<?>) MCTSettingsContraceptionActivity.class);
                        intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                        aVar.startActivityForResult(intent, 202);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar8 = this.f107052b;
                        String string = aVar8.getString(R.string.mct_cycle_length);
                        string.getClass();
                        aVar8.v6(string, aVar8.f39045g, aVar8.f39047h + 1, 365, new i(aVar8, 4));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar9 = this.f107052b;
                        String string2 = aVar9.getString(R.string.mct_period_duration);
                        string2.getClass();
                        aVar9.v6(string2, aVar9.f39047h, 1, Math.min(aVar9.f39045g - 1, 100), new i(aVar9, 3));
                        break;
                }
            }
        });
        View view3 = this.T;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsContraceptionRow");
            throw null;
        }
        final int i15 = 2;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: kx0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107052b;

            {
                this.f107052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107052b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTCycleTypeActivity.a aVar2 = MCTCycleTypeActivity.f39091e;
                        Context context = aVar.getContext();
                        ww0.a aVar3 = aVar.f39037c;
                        ww0.a aVar4 = aVar.f39039d;
                        aVar2.getClass();
                        aVar.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar3, aVar4), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        break;
                    case 1:
                        Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                        logger.debug("Stop tracking button clicked ");
                        androidx.fragment.app.m activity = aVar.getActivity();
                        if (activity != null) {
                            tb1.c.a aVar5 = tb1.c.f163744a;
                            ww0.a aVar6 = aVar.f39039d;
                            aVar5.getClass();
                            boolean zA = tb1.c.a.a(aVar6);
                            wr.g.y("showStopCycleTypeAlert: isPregnancy=", zA, logger);
                            if (!zA) {
                                o13.p pVar = new o13.p(aVar.getString(R.string.pregnancy_stop_tracking), new k41.e(23, aVar, activity));
                                o13.p pVar2 = new o13.p(aVar.getString(R.string.lbl_cancel), new kc0.a(28));
                                c22.f.f23050a.getClass();
                                androidx.appcompat.app.e eVarA = c22.f.a(activity, R.string.pregnancy_stop_cycle_tracking_question, R.string.pregnancy_stop_cycle_tracking_confirmation, pVar, pVar2);
                                eVarA.setOnShowListener(new hb1.d(activity, 2));
                                eVarA.show();
                            } else {
                                db1.m mVar = aVar.w6().f107065h;
                                if (mVar != null) {
                                    aVar.F6();
                                    PregnancyStopTrackingActivity.f41001d.getClass();
                                    PregnancyStopTrackingActivity.a.a(activity, mVar);
                                }
                            }
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTSettingsContraceptionActivity.a aVar7 = MCTSettingsContraceptionActivity.f39006d;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        ww0.i iVar = aVar.f39043f;
                        aVar7.getClass();
                        iVar.getClass();
                        Intent intent = new Intent(contextRequireContext, (Class<?>) MCTSettingsContraceptionActivity.class);
                        intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                        aVar.startActivityForResult(intent, 202);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar8 = this.f107052b;
                        String string = aVar8.getString(R.string.mct_cycle_length);
                        string.getClass();
                        aVar8.v6(string, aVar8.f39045g, aVar8.f39047h + 1, 365, new i(aVar8, 4));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar9 = this.f107052b;
                        String string2 = aVar9.getString(R.string.mct_period_duration);
                        string2.getClass();
                        aVar9.v6(string2, aVar9.f39047h, 1, Math.min(aVar9.f39045g - 1, 100), new i(aVar9, 3));
                        break;
                }
            }
        });
        View view4 = this.N0;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleLengthRow");
            throw null;
        }
        final int i16 = 3;
        view4.setOnClickListener(new View.OnClickListener(this) { // from class: kx0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107052b;

            {
                this.f107052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107052b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTCycleTypeActivity.a aVar2 = MCTCycleTypeActivity.f39091e;
                        Context context = aVar.getContext();
                        ww0.a aVar3 = aVar.f39037c;
                        ww0.a aVar4 = aVar.f39039d;
                        aVar2.getClass();
                        aVar.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar3, aVar4), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        break;
                    case 1:
                        Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                        logger.debug("Stop tracking button clicked ");
                        androidx.fragment.app.m activity = aVar.getActivity();
                        if (activity != null) {
                            tb1.c.a aVar5 = tb1.c.f163744a;
                            ww0.a aVar6 = aVar.f39039d;
                            aVar5.getClass();
                            boolean zA = tb1.c.a.a(aVar6);
                            wr.g.y("showStopCycleTypeAlert: isPregnancy=", zA, logger);
                            if (!zA) {
                                o13.p pVar = new o13.p(aVar.getString(R.string.pregnancy_stop_tracking), new k41.e(23, aVar, activity));
                                o13.p pVar2 = new o13.p(aVar.getString(R.string.lbl_cancel), new kc0.a(28));
                                c22.f.f23050a.getClass();
                                androidx.appcompat.app.e eVarA = c22.f.a(activity, R.string.pregnancy_stop_cycle_tracking_question, R.string.pregnancy_stop_cycle_tracking_confirmation, pVar, pVar2);
                                eVarA.setOnShowListener(new hb1.d(activity, 2));
                                eVarA.show();
                            } else {
                                db1.m mVar = aVar.w6().f107065h;
                                if (mVar != null) {
                                    aVar.F6();
                                    PregnancyStopTrackingActivity.f41001d.getClass();
                                    PregnancyStopTrackingActivity.a.a(activity, mVar);
                                }
                            }
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTSettingsContraceptionActivity.a aVar7 = MCTSettingsContraceptionActivity.f39006d;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        ww0.i iVar = aVar.f39043f;
                        aVar7.getClass();
                        iVar.getClass();
                        Intent intent = new Intent(contextRequireContext, (Class<?>) MCTSettingsContraceptionActivity.class);
                        intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                        aVar.startActivityForResult(intent, 202);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar8 = this.f107052b;
                        String string = aVar8.getString(R.string.mct_cycle_length);
                        string.getClass();
                        aVar8.v6(string, aVar8.f39045g, aVar8.f39047h + 1, 365, new i(aVar8, 4));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar9 = this.f107052b;
                        String string2 = aVar9.getString(R.string.mct_period_duration);
                        string2.getClass();
                        aVar9.v6(string2, aVar9.f39047h, 1, Math.min(aVar9.f39045g - 1, 100), new i(aVar9, 3));
                        break;
                }
            }
        });
        View view5 = this.Z;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationRow");
            throw null;
        }
        final int i17 = 4;
        view5.setOnClickListener(new View.OnClickListener(this) { // from class: kx0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107052b;

            {
                this.f107052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107052b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTCycleTypeActivity.a aVar2 = MCTCycleTypeActivity.f39091e;
                        Context context = aVar.getContext();
                        ww0.a aVar3 = aVar.f39037c;
                        ww0.a aVar4 = aVar.f39039d;
                        aVar2.getClass();
                        aVar.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar3, aVar4), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                        break;
                    case 1:
                        Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                        logger.debug("Stop tracking button clicked ");
                        androidx.fragment.app.m activity = aVar.getActivity();
                        if (activity != null) {
                            tb1.c.a aVar5 = tb1.c.f163744a;
                            ww0.a aVar6 = aVar.f39039d;
                            aVar5.getClass();
                            boolean zA = tb1.c.a.a(aVar6);
                            wr.g.y("showStopCycleTypeAlert: isPregnancy=", zA, logger);
                            if (!zA) {
                                o13.p pVar = new o13.p(aVar.getString(R.string.pregnancy_stop_tracking), new k41.e(23, aVar, activity));
                                o13.p pVar2 = new o13.p(aVar.getString(R.string.lbl_cancel), new kc0.a(28));
                                c22.f.f23050a.getClass();
                                androidx.appcompat.app.e eVarA = c22.f.a(activity, R.string.pregnancy_stop_cycle_tracking_question, R.string.pregnancy_stop_cycle_tracking_confirmation, pVar, pVar2);
                                eVarA.setOnShowListener(new hb1.d(activity, 2));
                                eVarA.show();
                            } else {
                                db1.m mVar = aVar.w6().f107065h;
                                if (mVar != null) {
                                    aVar.F6();
                                    PregnancyStopTrackingActivity.f41001d.getClass();
                                    PregnancyStopTrackingActivity.a.a(activity, mVar);
                                }
                            }
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        MCTSettingsContraceptionActivity.a aVar7 = MCTSettingsContraceptionActivity.f39006d;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        ww0.i iVar = aVar.f39043f;
                        aVar7.getClass();
                        iVar.getClass();
                        Intent intent = new Intent(contextRequireContext, (Class<?>) MCTSettingsContraceptionActivity.class);
                        intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                        aVar.startActivityForResult(intent, 202);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar8 = this.f107052b;
                        String string = aVar8.getString(R.string.mct_cycle_length);
                        string.getClass();
                        aVar8.v6(string, aVar8.f39045g, aVar8.f39047h + 1, 365, new i(aVar8, 4));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar9 = this.f107052b;
                        String string2 = aVar9.getString(R.string.mct_period_duration);
                        string2.getClass();
                        aVar9.v6(string2, aVar9.f39047h, 1, Math.min(aVar9.f39045g - 1, 100), new i(aVar9, 3));
                        break;
                }
            }
        });
        SwitchCompat switchCompat = this.Q0;
        if (switchCompat == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodPredictionsSwitch");
            throw null;
        }
        final int i18 = 5;
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i24 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i24)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i25 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i25)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat2 = this.R0;
        if (switchCompat2 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSkinTempPredictionSwitch");
            throw null;
        }
        final int i19 = 6;
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i24 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i24)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i25 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i25)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat3 = this.T0;
        if (switchCompat3 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFertilePredictionsSwitch");
            throw null;
        }
        final int i24 = 7;
        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i24;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i25 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i25)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i26 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i26)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat4 = this.U0;
        if (switchCompat4 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFlowSwitch");
            throw null;
        }
        final int i25 = 8;
        switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i25;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i26 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i26)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i27 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i27)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat5 = this.V0;
        if (switchCompat5 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPhysicalSymptomsSwitch");
            throw null;
        }
        switchCompat5.setChecked(this.f39058m);
        SwitchCompat switchCompat6 = this.V0;
        if (switchCompat6 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPhysicalSymptomsSwitch");
            throw null;
        }
        final int i26 = 9;
        switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i26;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i27 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i27)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i28 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i28)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat7 = this.W0;
        if (switchCompat7 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPerimenopauseMenopauseSymptomsSwitch");
            throw null;
        }
        final int i27 = 10;
        switchCompat7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i27;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i28 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i28)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i29 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i29)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat8 = this.X0;
        if (switchCompat8 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsMoodSwitch");
            throw null;
        }
        switchCompat8.setChecked(this.f39062o);
        SwitchCompat switchCompat9 = this.X0;
        if (switchCompat9 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsMoodSwitch");
            throw null;
        }
        final int i28 = 0;
        switchCompat9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i28;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i29 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i29)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i210 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i210)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat10 = this.Y0;
        if (switchCompat10 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsDischargeSwitch");
            throw null;
        }
        switchCompat10.setChecked(this.f39064p);
        SwitchCompat switchCompat11 = this.Y0;
        if (switchCompat11 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsDischargeSwitch");
            throw null;
        }
        final int i29 = 1;
        switchCompat11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i29;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i210 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i210)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i211 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i211)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat12 = this.Z0;
        if (switchCompat12 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsOvulationDateSwitch");
            throw null;
        }
        switchCompat12.setChecked(this.f39066q);
        SwitchCompat switchCompat13 = this.Z0;
        if (switchCompat13 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsOvulationDateSwitch");
            throw null;
        }
        final int i30 = 2;
        switchCompat13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i30;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i210 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i210)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i211 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i211)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat14 = this.f39034a1;
        if (switchCompat14 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSexualActivitySwitch");
            throw null;
        }
        switchCompat14.setChecked(this.f39071t);
        SwitchCompat switchCompat15 = this.f39034a1;
        if (switchCompat15 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSexualActivitySwitch");
            throw null;
        }
        final int i34 = 3;
        switchCompat15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i34;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i210 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i210)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i211 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i211)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        SwitchCompat switchCompat16 = this.f39036b1;
        if (switchCompat16 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSexDriveSwitch");
            throw null;
        }
        switchCompat16.setChecked(this.f39068r);
        SwitchCompat switchCompat17 = this.f39036b1;
        if (switchCompat17 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSexDriveSwitch");
            throw null;
        }
        final int i35 = 4;
        switchCompat17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107054b;

            {
                this.f107054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i35;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = this.f107054b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39062o = z14;
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39064p = z14;
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39066q = z14;
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39071t = z14;
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39068r = z14;
                        break;
                    case 5:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar3 = aVar.f39039d;
                        int i210 = aVar.f39045g;
                        aVar2.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar3, i210)) {
                            aVar.f39053k = z14;
                        }
                        aVar.U6();
                        aVar.K6();
                        break;
                    case 6:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a7 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar5 = aVar.f39039d;
                        boolean z15 = aVar.f39053k;
                        aVar4.getClass();
                        aVar5.getClass();
                        if (aVar5 == ww0.a.REGULAR && z15) {
                            aVar.f39051j = z14;
                            break;
                        }
                        break;
                    case 7:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar6 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar7 = aVar.f39039d;
                        ww0.i iVar = aVar.f39043f;
                        boolean z16 = aVar.f39053k;
                        int i211 = aVar.f39045g;
                        aVar6.getClass();
                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar7, iVar, z16, i211)) {
                            aVar.f39049i = z14;
                        }
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a9 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar8 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        ww0.a aVar9 = aVar.f39039d;
                        aVar8.getClass();
                        aVar9.getClass();
                        if (aVar9 != ww0.a.NONE) {
                            aVar.f39056l = z14;
                        }
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        aVar.f39058m = z14;
                        aVar.S6();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a11 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                        compoundButton.getClass();
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar10 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                        boolean z17 = aVar.f39058m;
                        aVar10.getClass();
                        if (z17) {
                            aVar.f39060n = z14;
                        }
                        break;
                }
            }
        });
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        ww0.a aVar = ww0.a.INACTIVE;
        Button button = this.f39038c1;
        if (aVarL != aVar) {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("mctStopCycleTracking");
                throw null;
            }
            button.setVisibility(0);
            Button button2 = this.f39038c1;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("mctStopCycleTracking");
                throw null;
            }
            tb1.c.a aVar2 = tb1.c.f163744a;
            ww0.a aVar3 = this.f39039d;
            aVar2.getClass();
            button2.setText(getString(tb1.c.a.a(aVar3) ? R.string.pregnancy_stop_tracking_this_pregnancy : R.string.pregnancy_stop_cycle_tracking));
            Button button3 = this.f39038c1;
            if (button3 == null) {
                p005kotlin.jvm.internal.s.m("mctStopCycleTracking");
                throw null;
            }
            final int i36 = 1;
            button3.setOnClickListener(new View.OnClickListener(this) { // from class: kx0.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a f107052b;

                {
                    this.f107052b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    int i110 = i36;
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar4 = this.f107052b;
                    switch (i110) {
                        case 0:
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                            MCTCycleTypeActivity.a aVar5 = MCTCycleTypeActivity.f39091e;
                            Context context = aVar4.getContext();
                            ww0.a aVar6 = aVar4.f39037c;
                            ww0.a aVar7 = aVar4.f39039d;
                            aVar5.getClass();
                            aVar4.startActivityForResult(MCTCycleTypeActivity.a.a(context, aVar6, aVar7), MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                            break;
                        case 1:
                            Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                            logger.debug("Stop tracking button clicked ");
                            androidx.fragment.app.m activity = aVar4.getActivity();
                            if (activity != null) {
                                tb1.c.a aVar8 = tb1.c.f163744a;
                                ww0.a aVar9 = aVar4.f39039d;
                                aVar8.getClass();
                                boolean zA = tb1.c.a.a(aVar9);
                                wr.g.y("showStopCycleTypeAlert: isPregnancy=", zA, logger);
                                if (!zA) {
                                    o13.p pVar = new o13.p(aVar4.getString(R.string.pregnancy_stop_tracking), new k41.e(23, aVar4, activity));
                                    o13.p pVar2 = new o13.p(aVar4.getString(R.string.lbl_cancel), new kc0.a(28));
                                    c22.f.f23050a.getClass();
                                    androidx.appcompat.app.e eVarA = c22.f.a(activity, R.string.pregnancy_stop_cycle_tracking_question, R.string.pregnancy_stop_cycle_tracking_confirmation, pVar, pVar2);
                                    eVarA.setOnShowListener(new hb1.d(activity, 2));
                                    eVarA.show();
                                } else {
                                    db1.m mVar = aVar4.w6().f107065h;
                                    if (mVar != null) {
                                        aVar4.F6();
                                        PregnancyStopTrackingActivity.f41001d.getClass();
                                        PregnancyStopTrackingActivity.a.a(activity, mVar);
                                    }
                                }
                            }
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                            MCTSettingsContraceptionActivity.a aVar10 = MCTSettingsContraceptionActivity.f39006d;
                            Context contextRequireContext = aVar4.requireContext();
                            contextRequireContext.getClass();
                            ww0.i iVar = aVar4.f39043f;
                            aVar10.getClass();
                            iVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) MCTSettingsContraceptionActivity.class);
                            intent.putExtra("SELECTED_CONTRACEPTIVE_KEY", iVar);
                            aVar4.startActivityForResult(intent, 202);
                            break;
                        case 3:
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar11 = this.f107052b;
                            String string = aVar11.getString(R.string.mct_cycle_length);
                            string.getClass();
                            aVar11.v6(string, aVar11.f39045g, aVar11.f39047h + 1, 365, new i(aVar11, 4));
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar12 = this.f107052b;
                            String string2 = aVar12.getString(R.string.mct_period_duration);
                            string2.getClass();
                            aVar12.v6(string2, aVar12.f39047h, 1, Math.min(aVar12.f39045g - 1, 100), new i(aVar12, 3));
                            break;
                    }
                }
            });
        } else {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("mctStopCycleTracking");
                throw null;
            }
            button.setVisibility(8);
        }
        J6();
        I6();
        K6();
        S6();
        TextView textView = this.O0;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleLengthValue");
            throw null;
        }
        M6(textView, this.f39045g);
        TextView textView2 = this.P0;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationValue");
            throw null;
        }
        M6(textView2, this.f39047h);
        tb1.c.a aVar4 = tb1.c.f163744a;
        ww0.a aVar5 = this.f39039d;
        aVar4.getClass();
        boolean zA = tb1.c.a.a(aVar5);
        View view6 = this.F;
        if (!zA) {
            if (view6 == null) {
                p005kotlin.jvm.internal.s.m("pregnancyTopSettingsFragment");
                throw null;
            }
            view6.setVisibility(8);
            H6(0);
            J6();
            I6();
            K6();
            S6();
            TextView textView3 = this.O0;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("mctSettingsCycleLengthValue");
                throw null;
            }
            M6(textView3, this.f39045g);
            TextView textView4 = this.P0;
            if (textView4 != null) {
                M6(textView4, this.f39047h);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationValue");
                throw null;
            }
        }
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("pregnancyTopSettingsFragment");
            throw null;
        }
        view6.setVisibility(0);
        TextView textView5 = this.f39055k1;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsLoggingTitle");
            throw null;
        }
        textView5.setVisibility(8);
        pb1.l.f136861l.getClass();
        pb1.l lVar = new pb1.l();
        v fragmentManager = getFragmentManager();
        androidx.fragment.app.a aVar6 = fragmentManager != null ? new androidx.fragment.app.a(fragmentManager) : null;
        if (aVar6 != null) {
            aVar6.f7240h = 4097;
        }
        if (aVar6 != null) {
            aVar6.l(R.id.pregnancy_top_settings_fragment, lVar, "PregnancySettingsTopFragment");
        }
        if (aVar6 != null) {
            aVar6.e();
        }
        H6(8);
    }

    public final void C6(Boolean bool, Boolean bool2) {
        if (bool != null) {
            Intent intentPutExtra = new Intent().putExtra("CYCLE_PREDICTIONS_ALTERED_KEY", bool.booleanValue());
            intentPutExtra.getClass();
            if (bool2 != null) {
                intentPutExtra.putExtra("PREGNANCY_DATA_ALTERED", bool2.booleanValue());
            }
            androidx.fragment.app.m activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intentPutExtra);
            }
        }
        c cVar = this.f39070s1;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
        cVar.f(false);
        ((b.u) this.f39069r1.getValue()).d();
    }

    public final void E6(boolean z14) {
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        this.f39037c = aVarL;
        this.f39039d = aVarL;
        this.f39043f = i52.a.o();
        this.f39045g = i52.a.a();
        this.f39047h = i52.a.b();
        f12.l.a aVar = f12.l.f68084a;
        aVar.getClass();
        this.f39053k = f12.l.a.a().P3();
        aVar.getClass();
        this.f39051j = f12.l.a.a().B4();
        aVar.getClass();
        this.f39049i = f12.l.a.a().z0();
        aVar.getClass();
        this.f39056l = f12.l.a.a().s3();
        this.f39075y = i52.a.k();
        this.f39076z = i52.a.n();
        this.A = i52.a.i();
        if (z14) {
            return;
        }
        this.f39058m = i52.a.q();
        aVar.getClass();
        this.f39060n = f12.l.a.a().G4();
        this.f39062o = i52.a.p();
        this.f39064p = i52.a.m();
        aVar.getClass();
        this.f39066q = f12.l.a.a().E1();
        this.f39071t = i52.a.r();
        aVar.getClass();
        this.f39068r = f12.l.a.a().x0();
    }

    public final void F6() {
        LocalDate originalDueDate;
        DateTime dateTimeAtStartOfDay;
        v supportFragmentManager;
        androidx.fragment.app.m activity = getActivity();
        Fragment fragmentG = (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G("PregnancySettingsTopFragment");
        fragmentG.getClass();
        pb1.l lVar = (pb1.l) fragmentG;
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButtonU6 = lVar.u6();
        DateFormat dateInstance = DateFormat.getDateInstance(2, Locale.getDefault());
        m mVar = this.f39074x;
        gCMPregnancyTwoLineButtonU6.setButtonValueLabel(dateInstance.format((mVar == null || (originalDueDate = mVar.getOriginalDueDate()) == null || (dateTimeAtStartOfDay = originalDueDate.toDateTimeAtStartOfDay()) == null) ? null : new Date(dateTimeAtStartOfDay.getMillis())));
        m mVar2 = this.f39074x;
        if (mVar2 != null) {
            mVar2.r(mVar2.getOriginalDueDate());
        }
        m mVar3 = this.f39074x;
        this.B = mVar3 != null ? mVar3.getOriginalDueDate() : null;
        m mVar4 = lVar.v6().f107065h;
        if (mVar4 != null) {
            m mVar5 = this.f39074x;
            mVar4.r(mVar5 != null ? mVar5.getOriginalDueDate() : null);
        }
    }

    public final void G6(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, boolean z14) {
        m mVar = w6().f107065h;
        tb1.c.a aVar = tb1.c.f163744a;
        ww0.a aVar2 = this.f39039d;
        aVar.getClass();
        if (!tb1.c.a.a(aVar2) || !z14 || mVar == null) {
            if (jSONObject == null) {
                if (this.f39072v) {
                    sn.a.o(f12.l.f68084a, true);
                }
                C6(Boolean.valueOf(this.f39072v), null);
                return;
            } else {
                kx0.m mVarW6 = w6();
                ge1.b.T(mVarW6, null, null, new o(mVarW6, userSettingsDTO, jSONObject, null), 3);
                y0<cx0.a<Unit>> y0Var = mVarW6.f107064g;
                n0 viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(y0Var, viewLifecycleOwner, new e(new kx0.i(this, 0)));
                return;
            }
        }
        LocalDate localDate = this.B;
        if (localDate == null) {
            if (this.f39072v) {
                sn.a.o(f12.l.f68084a, true);
            }
            C6(Boolean.valueOf(this.f39072v), null);
            return;
        }
        if (jSONObject != null) {
            kx0.m mVarW7 = w6();
            y0<fw.m<Unit>> y0Var2 = mVarW7.f107068k;
            fw.m<Unit> mVarD = y0Var2.d();
            if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
                y0Var2.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                ge1.b.T(v1.a(mVarW7), null, null, new kx0.p(mVarW7, mVar, localDate, userSettingsDTO, jSONObject, null), 3);
                return;
            }
            return;
        }
        kx0.m mVarW8 = w6();
        y0<fw.m<Unit>> y0Var3 = mVarW8.f107068k;
        fw.m<Unit> mVarD2 = y0Var3.d();
        if ((mVarD2 != null ? mVarD2.f73769b : null) != p.LOADING) {
            y0Var3.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(mVarW8), null, null, new q(mVar, localDate, mVarW8, null), 3);
        }
    }

    public final void H6(int i14) {
        View view2 = this.I;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleTypeRowTopDivider");
            throw null;
        }
        view2.setVisibility(i14);
        View view3 = this.P;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleTypeRow");
            throw null;
        }
        view3.setVisibility(i14);
        View view4 = this.T;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsContraceptionRow");
            throw null;
        }
        view4.setVisibility(i14);
        View view5 = this.Y;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsLengthSection");
            throw null;
        }
        view5.setVisibility(i14);
        View view6 = this.Z;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationRow");
            throw null;
        }
        view6.setVisibility(i14);
        View view7 = this.f39054k0;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodDurationDescription");
            throw null;
        }
        view7.setVisibility(i14);
        View view8 = this.H0;
        if (view8 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodPredictionsRow");
            throw null;
        }
        view8.setVisibility(i14);
        bv.b.f21239a.getClass();
        bv.b.a();
        int i15 = k1.f37122a.p() ? i14 : 8;
        View view9 = this.I0;
        if (view9 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSkinTempPredictionRow");
            throw null;
        }
        view9.setVisibility(i15);
        TextView textView = this.S0;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSkinTempPredictionMessage");
            throw null;
        }
        textView.setVisibility(i15);
        View view10 = this.J0;
        if (view10 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFertilePredictionsRow");
            throw null;
        }
        view10.setVisibility(i14);
        View view11 = this.K0;
        if (view11 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFlowRow");
            throw null;
        }
        view11.setVisibility(i14);
        View view12 = this.L0;
        if (view12 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPerimenopauseMenopauseSymptomsRow");
            throw null;
        }
        view12.setVisibility(i14);
        View view13 = this.M0;
        if (view13 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsOvulationDateRow");
            throw null;
        }
        view13.setVisibility(i14);
        View view14 = this.X;
        if (view14 != null) {
            view14.setVisibility(i14);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleTypeHint");
            throw null;
        }
    }

    public final void I6() {
        TextView textView = this.f39040d1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsContraceptionValue");
            throw null;
        }
        ww0.i iVar = this.f39043f;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView.setText(iVar.a(contextRequireContext));
        K6();
    }

    public final void J6() {
        String strA;
        ww0.a aVar = this.f39041e;
        if (aVar != null) {
            this.f39039d = aVar;
        }
        TextView textView = this.f39042e1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsCycleTypeValue");
            throw null;
        }
        ww0.a aVar2 = this.f39039d;
        ww0.a aVar3 = ww0.a.INACTIVE;
        if (aVar2 == aVar3) {
            strA = getString(R.string.no_value);
        } else {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strA = aVar2.a(contextRequireContext);
        }
        textView.setText(strA);
        if (this.f39039d == aVar3) {
            sn.a.o(f12.l.f68084a, true);
        }
        T6();
        U6();
        K6();
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        ww0.a aVar5 = this.f39039d;
        aVar4.getClass();
        aVar5.getClass();
        ww0.a aVar6 = ww0.a.NONE;
        boolean z14 = true ^ (aVar5 != aVar6);
        TextView textView2 = this.f39044f1;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFlowLabel");
            throw null;
        }
        SwitchCompat switchCompat = this.U0;
        if (switchCompat == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFlowSwitch");
            throw null;
        }
        u6(z14, textView2, switchCompat, this.f39056l);
        View view2 = this.Y;
        if (view2 != null) {
            view2.setVisibility(this.f39039d == aVar6 ? 8 : 0);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsLengthSection");
            throw null;
        }
    }

    public final void K6() {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        ww0.a aVar2 = this.f39039d;
        ww0.i iVar = this.f39043f;
        boolean z14 = this.f39053k;
        int i14 = this.f39045g;
        aVar.getClass();
        boolean z15 = !com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.b(aVar2, iVar, z14, i14);
        TextView textView = this.f39050i1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsFertilePredictionsLabel");
            throw null;
        }
        SwitchCompat switchCompat = this.T0;
        if (switchCompat != null) {
            u6(z15, textView, switchCompat, this.f39049i);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsFertilePredictionsSwitch");
            throw null;
        }
    }

    public final void M6(TextView textView, int i14) {
        textView.setText(i14 == 1 ? getString(R.string.mct_next_phase_day) : getString(R.string.mct_next_phase_days, NumberFormat.getIntegerInstance().format(Integer.valueOf(i14))));
    }

    public final void S6() {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        boolean z14 = this.f39058m;
        aVar.getClass();
        boolean z15 = !z14;
        TextView textView = this.f39052j1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPerimenopauseMenopauseSymptomsLabel");
            throw null;
        }
        SwitchCompat switchCompat = this.W0;
        if (switchCompat != null) {
            u6(z15, textView, switchCompat, this.f39060n);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsPerimenopauseMenopauseSymptomsSwitch");
            throw null;
        }
    }

    public final void T6() {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        ww0.a aVar2 = this.f39039d;
        int i14 = this.f39045g;
        aVar.getClass();
        boolean z14 = !com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.e(aVar2, i14);
        TextView textView = this.f39046g1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodPredictionsLabel");
            throw null;
        }
        SwitchCompat switchCompat = this.Q0;
        if (switchCompat != null) {
            u6(z14, textView, switchCompat, this.f39053k);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsPeriodPredictionsSwitch");
            throw null;
        }
    }

    public final void U6() {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        ww0.a aVar2 = this.f39039d;
        boolean z14 = this.f39053k;
        aVar.getClass();
        aVar2.getClass();
        boolean z15 = !(aVar2 == ww0.a.REGULAR && z14);
        TextView textView = this.f39048h1;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mctSettingsSkinTempPredictionLabel");
            throw null;
        }
        SwitchCompat switchCompat = this.R0;
        if (switchCompat != null) {
            u6(z15, textView, switchCompat, this.f39051j);
        } else {
            p005kotlin.jvm.internal.s.m("mctSettingsSkinTempPredictionSwitch");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        boolean z14;
        View view2;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        super.onActivityResult(i14, i15, intent);
        if ((i14 == 201 && i15 == -1) || (i14 == 203 && i15 == 1)) {
            this.f39035b = GCMSettingManager.s();
            y6();
            E6(true);
            A6();
            this.f39072v = true;
        } else {
            Integer numValueOf = null;
            Object serializableExtra = null;
            numValueOf = null;
            if (i14 == 202 && i15 == -1) {
                if ((intent != null ? intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY") : null) instanceof ww0.i) {
                    if (Build.VERSION.SDK_INT < 33) {
                        Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY") : null;
                        serializableExtra = (ww0.i) (serializableExtra2 instanceof ww0.i ? serializableExtra2 : null);
                    } else if (intent != null) {
                        serializableExtra = intent.getSerializableExtra("SELECTED_CONTRACEPTIVE_KEY", ww0.i.class);
                    }
                    serializableExtra.getClass();
                    ww0.i iVar = (ww0.i) serializableExtra;
                    ww0.i iVar2 = ww0.i.NONE;
                    if (iVar == iVar2 && this.f39043f != iVar2) {
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.getClass();
                        j23.l lVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39090b;
                        int i16 = lVar.f96796a;
                        int i17 = lVar.f96797b;
                        int i18 = this.f39045g;
                        if (i16 <= i18 && i18 <= i17) {
                            this.f39049i = true;
                        } else if (iVar != iVar2) {
                            this.f39049i = false;
                        }
                    } else if (iVar != iVar2 && this.f39043f == iVar2) {
                        this.f39049i = false;
                    }
                    this.f39043f = iVar;
                    I6();
                } else if (i14 != 203) {
                    if (i14 == 1) {
                        if (intent != null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        view2 = this.E;
                        if (view2 == null) {
                            p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                            throw null;
                        }
                        view2.setVisibility(z14 ? 0 : 8);
                    }
                } else if (i14 == 1) {
                    if (intent != null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    view2 = this.E;
                    if (view2 == null) {
                        p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                        throw null;
                    }
                    view2.setVisibility(z14 ? 0 : 8);
                }
            } else if (i14 != 203 && i15 == -1) {
                this.f39041e = x.l((intent == null || (extras3 = intent.getExtras()) == null) ? null : Integer.valueOf(extras3.getInt("CYCLE_TYPE_KEY")));
                if (intent != null && (extras2 = intent.getExtras()) != null) {
                    numValueOf = Integer.valueOf(extras2.getInt("CYCLE_TYPE_KEY"));
                }
                this.f39039d = x.l(numValueOf);
                J6();
            } else if (i14 == 1) {
                if (intent != null || (extras = intent.getExtras()) == null) {
                    z14 = false;
                } else {
                    z14 = extras.getBoolean("extra_has_previous_pregnancy");
                }
                view2 = this.E;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("pregnancyBottomSettingsFragment");
                    throw null;
                }
                view2.setVisibility(z14 ? 0 : 8);
            }
        }
        if (i14 == 203 && ((Boolean) this.f39061n1.getValue()).booleanValue()) {
            z6();
        }
        if (i14 == 202 && ((Boolean) this.f39063o1.getValue()).booleanValue()) {
            z6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof e1) {
            this.f39033a = (e1) context;
            this.C = (d3) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserSettingsDTO userSettingsDTO;
        Parcelable parcelable;
        Object serializable;
        Object serializable2;
        Parcelable parcelable2;
        Object serializable3;
        super.onCreate(bundle);
        if (bundle != null) {
            i52.a.f91796a.getClass();
            this.f39037c = i52.a.l();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                serializable = bundle.getSerializable("CYCLE_TYPE_KEY", ww0.a.class);
            } else {
                Object serializable4 = bundle.getSerializable("CYCLE_TYPE_KEY");
                if (!(serializable4 instanceof ww0.a)) {
                    serializable4 = null;
                }
                serializable = (ww0.a) serializable4;
            }
            ww0.a aVar = (ww0.a) serializable;
            if (aVar == null) {
                aVar = ww0.a.REGULAR;
            }
            this.f39039d = aVar;
            this.f39072v = this.f39072v || bundle.getBoolean("CYCLE_TYPE_CHANGED_KEY");
            if (i14 >= 33) {
                serializable2 = bundle.getSerializable("CONTRACEPTION_KEY", ww0.i.class);
            } else {
                Object serializable5 = bundle.getSerializable("CONTRACEPTION_KEY");
                if (!(serializable5 instanceof ww0.i)) {
                    serializable5 = null;
                }
                serializable2 = (ww0.i) serializable5;
            }
            ww0.i iVar = (ww0.i) serializable2;
            if (iVar == null) {
                iVar = ww0.i.NONE;
            }
            this.f39043f = iVar;
            this.f39045g = bundle.getInt("CYCLE_LENGTH_KEY");
            this.f39047h = bundle.getInt("PERIOD_DURATION_KEY");
            this.f39053k = bundle.getBoolean("PERIOD_PREDICTIONS_KEY");
            this.f39051j = bundle.getBoolean("SKIN_TEMP_PREDICTION_KEY");
            this.f39049i = bundle.getBoolean("FERTILE_PREDICTIONS_KEY");
            this.f39056l = bundle.getBoolean("FLOW_KEY");
            this.f39058m = bundle.getBoolean("PHYSICAL_SYMPTOMS_KEY");
            this.f39060n = bundle.getBoolean("MENOPAUSE_PERIMENOPAUSE_SYMPTOMS_KEY");
            this.f39062o = bundle.getBoolean("MOOD_KEY");
            this.f39064p = bundle.getBoolean("DISCHARGE_KEY");
            this.f39066q = bundle.getBoolean("OVULATION_DATE_KEY");
            this.f39071t = bundle.getBoolean("SEXUAL_ACTIVITY_KEY");
            this.f39068r = bundle.getBoolean("SEX_DRIVE_KEY");
            if (i14 >= 33) {
                parcelable2 = (Parcelable) bundle.getParcelable("USER_SETTINGS_KEY", UserSettingsDTO.class);
            } else {
                Parcelable parcelable3 = bundle.getParcelable("USER_SETTINGS_KEY");
                if (!(parcelable3 instanceof UserSettingsDTO)) {
                    parcelable3 = null;
                }
                parcelable2 = (UserSettingsDTO) parcelable3;
            }
            this.f39035b = (UserSettingsDTO) parcelable2;
            this.f39075y = bundle.getBoolean("BABY_MOVEMENT_TRACKING_KEY");
            this.f39076z = bundle.getBoolean("GLUCOSE_TRACKING_KEY");
            if (i14 >= 33) {
                serializable3 = bundle.getSerializable("GLUCOSE_MEASUREMENT_KEY", h0.class);
            } else {
                Object serializable6 = bundle.getSerializable("GLUCOSE_MEASUREMENT_KEY");
                if (!(serializable6 instanceof h0)) {
                    serializable6 = null;
                }
                serializable3 = (h0) serializable6;
            }
            h0 h0Var = (h0) serializable3;
            if (h0Var == null) {
                h0Var = this.A;
            }
            this.A = h0Var;
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) arguments.getParcelable("USER_SETTINGS_KEY", UserSettingsDTO.class);
                } else {
                    Parcelable parcelable4 = arguments.getParcelable("USER_SETTINGS_KEY");
                    if (!(parcelable4 instanceof UserSettingsDTO)) {
                        parcelable4 = null;
                    }
                    parcelable = (UserSettingsDTO) parcelable4;
                }
                userSettingsDTO = (UserSettingsDTO) parcelable;
            } else {
                userSettingsDTO = null;
            }
            this.f39035b = userSettingsDTO;
            if (userSettingsDTO != null) {
                E6(false);
            }
        }
        this.f39070s1 = new c();
        w6().A4().f(this, new e(new kx0.i(this, 1)));
        w6().f107068k.f(this, new e(new kx0.i(this, 2)));
        b.u uVar = (b.u) this.f39069r1.getValue();
        c cVar = this.f39070s1;
        if (cVar != null) {
            uVar.b(cVar, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_menstrual_cycle_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putSerializable("CYCLE_TYPE_KEY", this.f39039d);
        bundle.putSerializable("CONTRACEPTION_KEY", this.f39043f);
        bundle.putInt("CYCLE_LENGTH_KEY", this.f39045g);
        bundle.putInt("PERIOD_DURATION_KEY", this.f39047h);
        bundle.putBoolean("PERIOD_PREDICTIONS_KEY", this.f39053k);
        bundle.putBoolean("SKIN_TEMP_PREDICTION_KEY", this.f39051j);
        bundle.putBoolean("FERTILE_PREDICTIONS_KEY", this.f39049i);
        bundle.putBoolean("FLOW_KEY", this.f39056l);
        bundle.putBoolean("PHYSICAL_SYMPTOMS_KEY", this.f39058m);
        bundle.putBoolean("MENOPAUSE_PERIMENOPAUSE_SYMPTOMS_KEY", this.f39060n);
        bundle.putBoolean("MOOD_KEY", this.f39062o);
        bundle.putBoolean("DISCHARGE_KEY", this.f39064p);
        bundle.putBoolean("OVULATION_DATE_KEY", this.f39066q);
        bundle.putBoolean("SEXUAL_ACTIVITY_KEY", this.f39071t);
        bundle.putBoolean("SEX_DRIVE_KEY", this.f39068r);
        bundle.putBoolean("CYCLE_TYPE_CHANGED_KEY", this.f39072v);
        bundle.putParcelable("USER_SETTINGS_KEY", this.f39035b);
        bundle.putBoolean("BABY_MOVEMENT_TRACKING_KEY", this.f39075y);
        bundle.putBoolean("GLUCOSE_TRACKING_KEY", this.f39076z);
        bundle.putSerializable("GLUCOSE_MEASUREMENT_KEY", this.A);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new d(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.mct_scroll_view);
        viewFindViewById.getClass();
        this.D = (ScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_bottom_settings_fragment);
        viewFindViewById2.getClass();
        this.E = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.pregnancy_top_settings_fragment);
        viewFindViewById3.getClass();
        this.F = viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.mct_settings_cycle_type_row_top_divider);
        viewFindViewById4.getClass();
        this.I = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.mct_settings_cycle_type_row);
        viewFindViewById5.getClass();
        this.P = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.mct_settings_contraception_row);
        viewFindViewById6.getClass();
        this.T = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.mct_settings_length_section);
        viewFindViewById7.getClass();
        this.Y = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.mct_settings_period_duration_row);
        viewFindViewById8.getClass();
        this.Z = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.mct_settings_period_duration_description);
        viewFindViewById9.getClass();
        this.f39054k0 = viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.mct_settings_period_predictions_row);
        viewFindViewById10.getClass();
        this.H0 = viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.mct_settings_skin_temp_prediction_row);
        viewFindViewById11.getClass();
        this.I0 = viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.mct_settings_fertile_predictions_row);
        viewFindViewById12.getClass();
        this.J0 = viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.mct_settings_flow_row);
        viewFindViewById13.getClass();
        this.K0 = viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.mct_settings_perimenopause_menopause_symptoms_row);
        viewFindViewById14.getClass();
        this.L0 = viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.mct_settings_ovulation_date_row);
        viewFindViewById15.getClass();
        this.M0 = viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.mct_settings_cycle_length_row);
        viewFindViewById16.getClass();
        this.N0 = viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.mct_settings_cycle_length_value);
        viewFindViewById17.getClass();
        this.O0 = (TextView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.mct_settings_period_duration_value);
        viewFindViewById18.getClass();
        this.P0 = (TextView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.mct_settings_period_predictions_switch);
        viewFindViewById19.getClass();
        this.Q0 = (SwitchCompat) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.mct_settings_skin_temp_prediction_switch);
        viewFindViewById20.getClass();
        this.R0 = (SwitchCompat) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.mct_settings_mct_with_skin_temp_description);
        viewFindViewById21.getClass();
        this.S0 = (TextView) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.mct_settings_fertile_predictions_switch);
        viewFindViewById22.getClass();
        this.T0 = (SwitchCompat) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.mct_settings_flow_switch);
        viewFindViewById23.getClass();
        this.U0 = (SwitchCompat) viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.mct_settings_physical_symptoms_switch);
        viewFindViewById24.getClass();
        this.V0 = (SwitchCompat) viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.mct_settings_perimenopause_menopause_symptoms_switch);
        viewFindViewById25.getClass();
        this.W0 = (SwitchCompat) viewFindViewById25;
        View viewFindViewById26 = view2.findViewById(R.id.mct_settings_mood_switch);
        viewFindViewById26.getClass();
        this.X0 = (SwitchCompat) viewFindViewById26;
        View viewFindViewById27 = view2.findViewById(R.id.mct_settings_discharge_switch);
        viewFindViewById27.getClass();
        this.Y0 = (SwitchCompat) viewFindViewById27;
        View viewFindViewById28 = view2.findViewById(R.id.mct_settings_ovulation_date_switch);
        viewFindViewById28.getClass();
        this.Z0 = (SwitchCompat) viewFindViewById28;
        View viewFindViewById29 = view2.findViewById(R.id.mct_settings_sexual_activity_switch);
        viewFindViewById29.getClass();
        this.f39034a1 = (SwitchCompat) viewFindViewById29;
        View viewFindViewById30 = view2.findViewById(R.id.mct_settings_sex_drive_switch);
        viewFindViewById30.getClass();
        this.f39036b1 = (SwitchCompat) viewFindViewById30;
        View viewFindViewById31 = view2.findViewById(R.id.mct_stop_cycle_tracking);
        viewFindViewById31.getClass();
        this.f39038c1 = (Button) viewFindViewById31;
        View viewFindViewById32 = view2.findViewById(R.id.mct_settings_contraception_value);
        viewFindViewById32.getClass();
        this.f39040d1 = (TextView) viewFindViewById32;
        View viewFindViewById33 = view2.findViewById(R.id.mct_settings_cycle_type_value);
        viewFindViewById33.getClass();
        this.f39042e1 = (TextView) viewFindViewById33;
        View viewFindViewById34 = view2.findViewById(R.id.mct_settings_flow_label);
        viewFindViewById34.getClass();
        this.f39044f1 = (TextView) viewFindViewById34;
        View viewFindViewById35 = view2.findViewById(R.id.mct_settings_period_predictions_label);
        viewFindViewById35.getClass();
        this.f39046g1 = (TextView) viewFindViewById35;
        View viewFindViewById36 = view2.findViewById(R.id.mct_settings_skin_temp_prediction_label);
        viewFindViewById36.getClass();
        this.f39048h1 = (TextView) viewFindViewById36;
        View viewFindViewById37 = view2.findViewById(R.id.mct_settings_fertile_predictions_label);
        viewFindViewById37.getClass();
        this.f39050i1 = (TextView) viewFindViewById37;
        View viewFindViewById38 = view2.findViewById(R.id.mct_settings_perimenopause_menopause_symptoms_label);
        viewFindViewById38.getClass();
        this.f39052j1 = (TextView) viewFindViewById38;
        View viewFindViewById39 = view2.findViewById(R.id.mct_settings_logging_title);
        viewFindViewById39.getClass();
        this.f39055k1 = (TextView) viewFindViewById39;
        View viewFindViewById40 = view2.findViewById(R.id.pt_settings_cycle_type_hint);
        viewFindViewById40.getClass();
        this.X = viewFindViewById40;
        kx0.m mVarW6 = w6();
        y0<cx0.a<UserSettingsDTO>> y0Var = mVarW6.f107059b;
        ReentrantLock reentrantLock = mVarW6.f107058a;
        reentrantLock.lock();
        try {
            c2 c2Var = mVarW6.f107060c;
            if (c2Var == null || !c2Var.isActive()) {
                y0Var.j(null);
                mVarW6.f107060c = ge1.b.T(mVarW6, null, null, new kx0.n(mVarW6, null), 3);
            }
            reentrantLock.unlock();
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0Var, viewLifecycleOwner, new e(new kx0.i(this, 5)));
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void u6(boolean z14, TextView textView, SwitchCompat switchCompat, boolean z15) {
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            int color = a7.b.getColor(activity, R.color.gcm_text_secondary);
            int color2 = a7.b.getColor(activity, R.color.gcm_text_primary);
            switchCompat.setEnabled(!z14);
            if (z14) {
                z15 = false;
            }
            switchCompat.setChecked(z15);
            if (!z14) {
                color = color2;
            }
            textView.setTextColor(color);
        }
    }

    public final void v6(String str, int i14, int i15, int i16, e23.l<? super Integer, Unit> lVar) {
        NumberPicker numberPicker = new NumberPicker(requireContext());
        ArrayList arrayList = new ArrayList();
        if (i15 <= i16) {
            int i17 = i15;
            while (true) {
                String string = getString(i17 == 1 ? R.string.mct_next_phase_day : R.string.mct_next_phase_days);
                string.getClass();
                x0 x0Var = x0.f105818a;
                arrayList.add(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i17)}, 1)));
                if (i17 == i16) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        numberPicker.setMinValue(i15);
        numberPicker.setMaxValue(i16);
        numberPicker.setValue(i14);
        numberPicker.setDescendantFocusability(393216);
        p0 p0Var = new p0();
        p0Var.f105807a = i14;
        numberPicker.setOnValueChangedListener(new j42.a(p0Var, 1));
        new androidx.appcompat.app.e.a(requireContext()).setTitle(str).setView(numberPicker).setPositiveButton(getString(R.string.lbl_done), new hg1.g(15, lVar, p0Var)).show();
    }

    public final kx0.m w6() {
        return (kx0.m) this.f39065p1.getValue();
    }

    public final void y6() {
        UserSettingsDTO userSettingsDTO = this.f39035b;
        if (userSettingsDTO == null) {
            if (this.f39073w) {
                return;
            }
            g22.e.f(this);
            return;
        }
        ww0.u uVar = userSettingsDTO.f43527e;
        if (uVar != null && uVar.getPregnancySetup() != null) {
            ww0.u uVar2 = userSettingsDTO.f43527e;
            uVar2.getClass();
            Boolean pregnancySetup = uVar2.getPregnancySetup();
            pregnancySetup.getClass();
            if (pregnancySetup.booleanValue()) {
                this.f39073w = true;
                w6().B4();
                return;
            }
        }
        if (this.f39073w) {
            return;
        }
        g22.e.f(this);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    public final void z6() {
        List listK;
        tb1.a.C3081a c3081a = tb1.a.f163743a;
        m mVar = this.f39074x;
        m mVar2 = w6().f107065h;
        c3081a.getClass();
        boolean zA = tb1.a.C3081a.a(mVar, mVar2);
        boolean z14 = !zA;
        boolean z15 = false;
        boolean z16 = this.f39041e != null;
        ww0.a aVar = this.f39037c;
        ww0.a aVar2 = this.f39039d;
        if (aVar != aVar2 || z16) {
            this.f39072v = true;
            i52.a.f91796a.getClass();
            i52.a.t(aVar2);
            if (this.f39039d == ww0.a.NONE) {
                this.f39053k = false;
                this.f39049i = false;
                this.f39056l = false;
            }
            z15 = true;
        }
        i52.a.f91796a.getClass();
        ww0.i iVarO = i52.a.o();
        ww0.i iVar = this.f39043f;
        if (iVarO != iVar) {
            this.f39072v = true;
            iVar.getClass();
            f12.l.f68084a.getClass();
            f12.l.a.a().R1(iVar);
            z15 = true;
        }
        int iA = i52.a.a();
        int i14 = this.f39045g;
        if (iA != i14) {
            this.f39072v = true;
            f12.l.f68084a.getClass();
            f12.l.a.a().t3(i14);
            z15 = true;
        }
        int iB = i52.a.b();
        int i15 = this.f39047h;
        if (iB != i15) {
            this.f39072v = true;
            f12.l.f68084a.getClass();
            f12.l.a.a().r1(i15);
            z15 = true;
        }
        f12.l.a aVar3 = f12.l.f68084a;
        aVar3.getClass();
        boolean zP3 = f12.l.a.a().P3();
        boolean z17 = this.f39053k;
        if (zP3 != z17) {
            this.f39072v = true;
            aVar3.getClass();
            f12.l.a.a().v0(z17);
            z15 = true;
        }
        aVar3.getClass();
        boolean zB4 = f12.l.a.a().B4();
        boolean z18 = this.f39051j;
        if (zB4 != z18) {
            this.f39072v = true;
            aVar3.getClass();
            f12.l.a.a().V2(z18);
            z15 = true;
        }
        aVar3.getClass();
        boolean zZ0 = f12.l.a.a().z0();
        boolean z19 = this.f39049i;
        if (zZ0 != z19) {
            this.f39072v = true;
            aVar3.getClass();
            f12.l.a.a().x1(z19);
            z15 = true;
        }
        aVar3.getClass();
        boolean zS3 = f12.l.a.a().s3();
        boolean z24 = this.f39056l;
        if (zS3 != z24) {
            aVar3.getClass();
            f12.l.a.a().m2(z24);
            z15 = true;
        }
        boolean zQ = i52.a.q();
        boolean z25 = this.f39058m;
        if (zQ != z25) {
            aVar3.getClass();
            f12.l.a.a().g1(z25);
            z15 = true;
        }
        aVar3.getClass();
        boolean zG4 = f12.l.a.a().G4();
        boolean z26 = this.f39060n;
        if (zG4 != z26) {
            aVar3.getClass();
            f12.l.a.a().G2(z26);
            z15 = true;
        }
        boolean zP = i52.a.p();
        boolean z27 = this.f39062o;
        if (zP != z27) {
            aVar3.getClass();
            f12.l.a.a().b0(z27);
            z15 = true;
        }
        boolean zM = i52.a.m();
        boolean z28 = this.f39064p;
        if (zM != z28) {
            aVar3.getClass();
            f12.l.a.a().j3(z28);
            z15 = true;
        }
        aVar3.getClass();
        boolean zE1 = f12.l.a.a().E1();
        boolean z29 = this.f39066q;
        if (zE1 != z29) {
            aVar3.getClass();
            f12.l.a.a().E0(z29);
            z15 = true;
        }
        boolean zR = i52.a.r();
        boolean z34 = this.f39071t;
        if (zR != z34) {
            aVar3.getClass();
            f12.l.a.a().h0(z34);
            z15 = true;
        }
        aVar3.getClass();
        boolean zX0 = f12.l.a.a().x0();
        boolean z35 = this.f39068r;
        if (zX0 != z35) {
            aVar3.getClass();
            f12.l.a.a().m4(z35);
            z15 = true;
        }
        if (i52.a.k() != this.f39075y) {
            z15 = true;
        }
        if (i52.a.n() != this.f39076z) {
            z15 = true;
        }
        if (i52.a.i() != this.A) {
            z15 = true;
        }
        if ((!z15 && zA) || !((Boolean) this.f39057l1.getValue()).booleanValue()) {
            boolean z36 = this.f39072v;
            if (!z36) {
                C6(null, null);
                return;
            }
            if (z36) {
                sn.a.o(aVar3, true);
            }
            C6(Boolean.valueOf(this.f39072v), null);
            return;
        }
        UserSettingsDTO userSettingsDTO = this.f39035b;
        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
        if (userSettingsDTO == null) {
            G6(userSettingsDTOS, userSettingsDTOS.t1(), z14);
            return;
        }
        ww0.u uVar = userSettingsDTOS.f43527e;
        uVar.getClass();
        Integer avgCycleLength = uVar.getAvgCycleLength();
        if ((avgCycleLength != null ? avgCycleLength.intValue() : -1) == -1) {
            ww0.u uVar2 = userSettingsDTOS.f43527e;
            uVar2.getClass();
            Integer avgPeriodLength = uVar2.getAvgPeriodLength();
            if ((avgPeriodLength != null ? avgPeriodLength.intValue() : -1) == -1) {
                listK = p13.x.k("contraception", "menstrualCycleType");
            } else {
                listK = p13.x.k("contraception", "menstrualCycleType", "avgCycleLength", "avgPeriodLength");
            }
        } else {
            listK = p13.x.k("contraception", "menstrualCycleType", "avgCycleLength", "avgPeriodLength");
        }
        t3 t3Var = t3.f23255a;
        JSONObject jSONObjectT1 = userSettingsDTOS.t1();
        JSONObject jSONObjectT2 = userSettingsDTO.t1();
        t3Var.getClass();
        G6(userSettingsDTOS, t3.c(jSONObjectT1, jSONObjectT2, listK), z14);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006¨\u0006$"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PREGNANCY_SETTINGS_TOP_FRAGMENT_TAG", "PREGNANCY_SETTINGS_BOTTOM_FRAGMENT_TAG", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "SETUP_REQUEST_CODE", "I", "CONTRACEPTION_REQUEST_CODE", "CYCLE_TYPE_REQUEST_CODE", "CYCLE_TYPE_KEY", "CYCLE_TYPE_CHANGED_KEY", "CONTRACEPTION_KEY", "CYCLE_LENGTH_KEY", "PERIOD_DURATION_KEY", "FERTILE_PREDICTIONS_KEY", "PERIOD_PREDICTIONS_KEY", "SKIN_TEMP_PREDICTION_KEY", "FLOW_KEY", "PHYSICAL_SYMPTOMS_KEY", "MENOPAUSE_PERIMENOPAUSE_SYMPTOMS_KEY", "MOOD_KEY", "DISCHARGE_KEY", "OVULATION_DATE_KEY", "SEX_DRIVE_KEY", "SEXUAL_ACTIVITY_KEY", "BABY_MOVEMENT_TRACKING_KEY", "GLUCOSE_TRACKING_KEY", "GLUCOSE_MEASUREMENT_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0691a {
        public /* synthetic */ C0691a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0691a() {
        }
    }
}
