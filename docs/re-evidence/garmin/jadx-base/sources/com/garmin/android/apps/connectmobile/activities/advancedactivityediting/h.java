package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import android.content.Context;
import android.os.Bundle;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import bm.k0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.b2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/h;", "Lr22/b2;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends b2 {
    public static final a Y = new a(null);
    public com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b T;
    public final w1 X = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f28926a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f28926a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f28927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f28928b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f28927a = aVar;
            this.f28928b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f28927a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f28928b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f28929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f28929a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f28929a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer[] numArr;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int i14;
        int i15;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Integer numValueOf = null;
        if (arguments != null) {
            boolean z14 = arguments.getBoolean("EXTRA_DISABLE_HOURS");
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.f28839a;
            int i16 = arguments.getInt("EXTRA_TIME_PICKER");
            aVar.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME;
            if (i16 != bVar.ordinal()) {
                bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START;
                if (i16 != bVar.ordinal()) {
                    bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END;
                    if (i16 != bVar.ordinal()) {
                        bVar = null;
                    }
                }
            }
            this.T = bVar;
            if (z14) {
                this.f149602h = false;
            }
        }
        this.f149614v = getString(R.string.lbl_cancel);
        this.f149615w = getString(R.string.lbl_done);
        w1 w1Var = this.X;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) w1Var.getValue();
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar2 = this.T;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar2 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) w1Var.getValue();
        if (bVar2 != null) {
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar2.f28864b;
            if (cVar != null) {
                k0 k0Var = cVar.f28847d;
                k0 k0Var2 = cVar.f28845b;
                k0 k0Var3 = cVar.f28848e;
                k0 k0Var4 = cVar.f28846c;
                k0Var4.getClass();
                int i17 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28859a[bVar2.ordinal()];
                if (i17 == 1) {
                    int i18 = k0Var3.f18823b;
                    k0 k0Var5 = cVar.f28844a;
                    Integer[] numArrN = cVar.n(k0Var5.f18823b, k0Var5.f18824c, new k0(k0Var.f18822a + 1, 0, 0, 0, 14, null));
                    iIntValue = numArrN[0].intValue();
                    iIntValue2 = numArrN[1].intValue();
                    iIntValue3 = numArrN[2].intValue();
                    iIntValue4 = numArrN[3].intValue();
                    i14 = i18;
                    i15 = 0;
                } else if (i17 == 2) {
                    int i19 = k0Var4.f18822a;
                    if (i19 > 0) {
                        k0Var4 = new k0(i19 - 1, 0, 0, 0, 14, null);
                    }
                    i15 = k0Var.f18823b;
                    i14 = k0Var4.f18823b;
                    Integer[] numArrT = cVar.t(k0Var2.f18823b, k0Var2.f18824c);
                    iIntValue = numArrT[0].intValue();
                    iIntValue2 = numArrT[1].intValue();
                    iIntValue3 = numArrT[2].intValue();
                    iIntValue4 = numArrT[3].intValue();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return;
                    }
                    i15 = new k0(k0Var2.f18822a + 1, 0, 0, 0, 14, null).f18823b;
                    i14 = k0Var3.f18823b;
                    Integer[] numArrN2 = cVar.n(k0Var4.f18823b, k0Var4.f18824c, new k0(k0Var2.f18822a + 1, 0, 0, 0, 14, null));
                    iIntValue = numArrN2[0].intValue();
                    iIntValue2 = numArrN2[1].intValue();
                    iIntValue3 = numArrN2[2].intValue();
                    iIntValue4 = numArrN2[3].intValue();
                }
                numArr = new Integer[]{Integer.valueOf(i15), Integer.valueOf(i14), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)};
            } else {
                numArr = null;
            }
            if (numArr != null && numArr.length != 0 && numArr.length == 6) {
                int iIntValue5 = numArr[0].intValue();
                int iIntValue6 = numArr[1].intValue();
                this.f149605k = iIntValue5;
                this.f149606l = iIntValue6;
                this.f149602h = true;
                this.f149611q = true;
                int iIntValue7 = numArr[2].intValue();
                int iIntValue8 = numArr[3].intValue();
                this.f149607m = iIntValue7;
                this.f149608n = iIntValue8;
                this.f149603i = true;
                this.f149612r = true;
                int iIntValue9 = numArr[4].intValue();
                int iIntValue10 = numArr[5].intValue();
                this.f149609o = iIntValue9;
                this.f149610p = iIntValue10;
                this.f149604j = true;
                this.f149613t = true;
            }
        }
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar3 = this.T;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar2 = dVar.f28864b;
        if (cVar2 != null && bVar3 != null) {
            int i24 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28859a[bVar3.ordinal()];
            if (i24 == 1) {
                numValueOf = Integer.valueOf(cVar2.f28844a.f18822a);
            } else if (i24 == 2) {
                numValueOf = Integer.valueOf(cVar2.f28845b.f18822a);
            } else {
                if (i24 != 3) {
                    u0.r();
                    return;
                }
                numValueOf = Integer.valueOf(cVar2.f28846c.f18822a);
            }
        }
        if (numValueOf != null) {
            int iIntValue11 = numValueOf.intValue();
            int i25 = iIntValue11 / DateTimeConstants.SECONDS_PER_HOUR;
            int i26 = iIntValue11 % DateTimeConstants.SECONDS_PER_HOUR;
            this.f149602h = true;
            this.f149599e = i25;
            this.f149603i = true;
            this.f149600f = i26 / 60;
            this.f149604j = true;
            this.f149601g = i26 % 60;
        }
    }

    @Override // r22.b2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        l3.a aVar = l3.f23124b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        return l3.a.j1(contextRequireContext, i14, i15, i16);
    }

    @Override // r22.b2
    public final void w6(NumberPicker numberPicker, int i14, int i15) {
        Integer[] numArrM4;
        boolean zEquals = numberPicker.equals(this.f149596b);
        w1 w1Var = this.X;
        if (!zEquals) {
            if (numberPicker.equals(this.f149597c) && (numArrM4 = ((com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) w1Var.getValue()).M4(this.f149596b.getValue(), i15, this.T)) != null && numArrM4.length == 4) {
                int value = this.f149598d.getValue();
                this.f149598d.setMinValue(numArrM4[2].intValue());
                this.f149598d.setMaxValue(numArrM4[3].intValue());
                if (value < numArrM4[2].intValue() || value > numArrM4[3].intValue()) {
                    y6();
                    return;
                }
                return;
            }
            return;
        }
        Integer[] numArrM5 = ((com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) w1Var.getValue()).M4(i15, this.f149597c.getValue(), this.T);
        if (numArrM5 == null || numArrM5.length != 4) {
            return;
        }
        int value2 = this.f149597c.getValue();
        this.f149597c.setMinValue(numArrM5[0].intValue());
        this.f149597c.setMaxValue(numArrM5[1].intValue());
        int value3 = this.f149598d.getValue();
        this.f149598d.setMinValue(numArrM5[2].intValue());
        this.f149598d.setMaxValue(numArrM5[3].intValue());
        if (value2 < numArrM5[0].intValue() || value2 > numArrM5[1].intValue() || value3 < numArrM5[2].intValue() || value3 > numArrM5[3].intValue()) {
            y6();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/h$a;", "", "<init>", "()V", "", "EXTRA_DISABLE_HOURS", "Ljava/lang/String;", "EXTRA_TIME_PICKER", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
