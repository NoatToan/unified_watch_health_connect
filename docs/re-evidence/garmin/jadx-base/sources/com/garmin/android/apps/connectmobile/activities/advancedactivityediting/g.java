package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import android.os.Bundle;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.b1;
import c22.b2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.x;
import r22.s1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/g;", "Lr22/s1;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends s1 {
    public static final a T = new a(null);
    public com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a I;
    public final w1 P = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f28922a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f28922a.requireActivity().getF185700a();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f28923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f28924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f28923a = aVar;
            this.f28924b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f28923a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f28924b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f28925a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f28925a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Integer[] numArrC = null;
        if (arguments != null) {
            arguments.getBoolean("EXTRA_IS_SWIMMING");
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.C0441a c0441a = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.f28834a;
            int i14 = arguments.getInt("EXTRA_DISTANCE_PICKER");
            c0441a.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE;
            if (i14 != aVar.ordinal()) {
                aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE;
                if (i14 != aVar.ordinal()) {
                    aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE;
                    if (i14 != aVar.ordinal()) {
                        aVar = null;
                    }
                }
            }
            this.I = aVar;
        }
        this.f149878q = getString(R.string.lbl_cancel);
        this.f149879r = getString(R.string.lbl_done);
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.P.getValue();
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar2 = this.I;
        if (aVar2 != null) {
            new ArrayList().addAll(x.k(getString(m3.MILE.f23164e), getString(m3.KILOMETER.f23164e)));
            this.f149871j = true;
            this.f149877p = true;
            Integer[] numArrL4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.L4(dVar, aVar2, null, 2);
            if (numArrL4 != null && numArrL4.length != 0 && numArrL4.length == 4) {
                int iIntValue = numArrL4[0].intValue();
                int iIntValue2 = numArrL4[1].intValue();
                this.f149872k = iIntValue;
                this.f149873l = iIntValue2;
                this.f149870i = true;
                this.f149876o = true;
                int iIntValue3 = numArrL4[2].intValue();
                int iIntValue4 = numArrL4[3].intValue();
                this.f149874m = iIntValue3;
                this.f149875n = iIntValue4;
                this.f149871j = true;
                this.f149877p = true;
            }
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar.f28864b;
            if (cVar != null) {
                int i15 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28860b[aVar2.ordinal()];
                if (i15 == 1) {
                    numArrC = cVar.f28851h.c();
                } else if (i15 == 2) {
                    numArrC = cVar.f28852i.c();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return;
                    }
                    numArrC = cVar.f28853j.c();
                }
            }
            if (numArrC == null || numArrC.length == 0 || numArrC.length != 3) {
                return;
            }
            int iIntValue5 = numArrC[0].intValue();
            this.f149870i = true;
            this.f149868g = iIntValue5;
            int iIntValue6 = numArrC[1].intValue();
            this.f149871j = true;
            this.f149869h = iIntValue6;
        }
    }

    @Override // r22.s1
    public final void v6(NumberPicker numberPicker, int i14, int i15) {
        Integer[] numArrL4;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.P.getValue();
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar = this.I;
        if (!numberPicker.equals(this.f149864c) || aVar == null || (numArrL4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.L4(dVar, aVar, Integer.valueOf(i15), 4)) == null || numArrL4.length == 0 || numArrL4.length != 4) {
            return;
        }
        this.f149865d.setMinValue(numArrL4[2].intValue());
        this.f149865d.setMaxValue(numArrL4[3].intValue());
    }

    public final void w6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, int i14) {
        int iC;
        int iC2;
        Integer[] numArrK;
        if (aVar == null || dVar == null) {
            return;
        }
        double d14 = Double.parseDouble(this.f149864c.getValue() + "." + this.f149865d.getValue());
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar.f28864b;
        if (cVar != null) {
            m3 m3Var = i14 == 0 ? m3.MILE : m3.KILOMETER;
            cVar.f28850g = m3Var;
            cVar.l(m3Var, false);
        }
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar2 = dVar.f28864b;
        ArrayList arrayList = null;
        String str = null;
        if (cVar2 != null) {
            ArrayList arrayList2 = new ArrayList();
            m3 m3Var2 = cVar2.f28850g;
            if (m3Var2 == m3.MILE) {
                DecimalFormat decimalFormat = l3.f23137o;
                l3.f23124b.getClass();
                str = decimalFormat.format(d14 / 1.609344d);
            } else if (m3Var2 == m3.KILOMETER) {
                DecimalFormat decimalFormat2 = l3.f23137o;
                l3.f23124b.getClass();
                str = decimalFormat2.format(d14 * 1.609344d);
            }
            str.getClass();
            int iG = d53.w.G(b2.f23010b, 0, 6, str);
            if (iG > 0) {
                iC = b1.c(str.substring(0, iG));
                iC2 = b1.c(str.substring(iG + 1));
            } else {
                iC = b1.c(str);
                iC2 = 0;
            }
            int i15 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28860b[aVar.ordinal()];
            if (i15 == 1) {
                numArrK = cVar2.k(iC);
            } else if (i15 == 2) {
                numArrK = cVar2.j(iC);
            } else {
                if (i15 != 3) {
                    u0.r();
                    return;
                }
                numArrK = cVar2.b(iC);
            }
            arrayList2.add(numArrK[0]);
            arrayList2.add(numArrK[1]);
            arrayList2.add(numArrK[2]);
            arrayList2.add(numArrK[3]);
            arrayList2.add(Integer.valueOf(iC));
            arrayList2.add(Integer.valueOf(iC2));
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() != 6) {
            return;
        }
        NumberPicker numberPicker = this.f149864c;
        Object obj = arrayList.get(0);
        obj.getClass();
        numberPicker.setMinValue(((Number) obj).intValue());
        NumberPicker numberPicker2 = this.f149864c;
        Object obj2 = arrayList.get(1);
        obj2.getClass();
        numberPicker2.setMaxValue(((Number) obj2).intValue());
        NumberPicker numberPicker3 = this.f149865d;
        Object obj3 = arrayList.get(2);
        obj3.getClass();
        numberPicker3.setMinValue(((Number) obj3).intValue());
        NumberPicker numberPicker4 = this.f149865d;
        Object obj4 = arrayList.get(3);
        obj4.getClass();
        numberPicker4.setMaxValue(((Number) obj4).intValue());
        NumberPicker numberPicker5 = this.f149864c;
        Object obj5 = arrayList.get(4);
        obj5.getClass();
        numberPicker5.setValue(((Number) obj5).intValue());
        NumberPicker numberPicker6 = this.f149865d;
        Object obj6 = arrayList.get(5);
        obj6.getClass();
        numberPicker6.setValue(((Number) obj6).intValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/g$a;", "", "<init>", "()V", "", "EXTRA_IS_SWIMMING", "Ljava/lang/String;", "EXTRA_DISTANCE_PICKER", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
