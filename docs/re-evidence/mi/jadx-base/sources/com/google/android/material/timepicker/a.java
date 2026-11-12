package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.miui.tsmclient.util.CarKeyConstants;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.h2j;
import defpackage.m80;
import defpackage.ni4;
import defpackage.oep;
import defpackage.t04;

/* JADX INFO: loaded from: classes5.dex */
public class a implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, oep {
    public static final String[] f = {"12", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD};
    public static final String[] g = {"00", "2", "4", "6", UserConfig.KEY_MI_BRAIN_SETTING, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, "12", "14", "16", "18", UserConfig.KEY_CAMERA_LIST_SORT_ORDER, "22"};
    public static final String[] h = {"00", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, "15", UserConfig.KEY_CAMERA_LIST_SORT_ORDER, "25", "30", "35", "40", "45", CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_LOCK, "55"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimePickerView f8949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeModel f8950b;
    public float c;
    public float d;
    public boolean e = false;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.a$a, reason: collision with other inner class name */
    public class C0225a extends t04 {
        public C0225a(Context context, int i) {
            super(context, i);
        }

        @Override // defpackage.t04, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.m0(view.getResources().getString(h2j.j, String.valueOf(a.this.f8950b.d())));
        }
    }

    public class b extends t04 {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // defpackage.t04, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.m0(view.getResources().getString(h2j.l, String.valueOf(a.this.f8950b.e)));
        }
    }

    public a(TimePickerView timePickerView, TimeModel timeModel) {
        this.f8949a = timePickerView;
        this.f8950b = timeModel;
        k();
    }

    @Override // defpackage.oep
    public void a() {
        this.f8949a.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void b(float f2, boolean z) {
        this.e = true;
        TimeModel timeModel = this.f8950b;
        int i = timeModel.e;
        int i2 = timeModel.d;
        if (timeModel.f == 10) {
            this.f8949a.f(this.d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ni4.i(this.f8949a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                m(12, true);
            }
        } else {
            int iRound = Math.round(f2);
            if (!z) {
                this.f8950b.i(((iRound + 15) / 30) * 5);
                this.c = this.f8950b.e * 6;
            }
            this.f8949a.f(this.c, z);
        }
        this.e = false;
        n();
        l(i2, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i) {
        this.f8950b.j(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void d(int i) {
        m(i, true);
    }

    @Override // defpackage.oep
    public void e() {
        this.f8949a.setVisibility(8);
    }

    @Override // defpackage.oep
    public void f() {
        this.d = this.f8950b.d() * i();
        TimeModel timeModel = this.f8950b;
        this.c = timeModel.e * 6;
        m(timeModel.f, false);
        n();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void g(float f2, boolean z) {
        if (this.e) {
            return;
        }
        TimeModel timeModel = this.f8950b;
        int i = timeModel.d;
        int i2 = timeModel.e;
        int iRound = Math.round(f2);
        TimeModel timeModel2 = this.f8950b;
        if (timeModel2.f == 12) {
            timeModel2.i((iRound + 3) / 6);
            this.c = (float) Math.floor(this.f8950b.e * 6);
        } else {
            this.f8950b.h((iRound + (i() / 2)) / i());
            this.d = this.f8950b.d() * i();
        }
        if (z) {
            return;
        }
        n();
        l(i, i2);
    }

    public final int i() {
        return this.f8950b.c == 1 ? 15 : 30;
    }

    public final String[] j() {
        return this.f8950b.c == 1 ? g : f;
    }

    public void k() {
        if (this.f8950b.c == 0) {
            this.f8949a.n();
        }
        this.f8949a.addOnRotateListener(this);
        this.f8949a.j(this);
        this.f8949a.setOnPeriodChangeListener(this);
        this.f8949a.setOnActionUpListener(this);
        o();
        f();
    }

    public final void l(int i, int i2) {
        TimeModel timeModel = this.f8950b;
        if (timeModel.e == i2 && timeModel.d == i) {
            return;
        }
        this.f8949a.performHapticFeedback(4);
    }

    public void m(int i, boolean z) {
        boolean z2 = i == 12;
        this.f8949a.e(z2);
        this.f8950b.f = i;
        this.f8949a.l(z2 ? h : j(), z2 ? h2j.l : h2j.j);
        this.f8949a.f(z2 ? this.c : this.d, z);
        this.f8949a.d(i);
        this.f8949a.i(new C0225a(this.f8949a.getContext(), h2j.i));
        this.f8949a.h(new b(this.f8949a.getContext(), h2j.f19617k));
    }

    public final void n() {
        TimePickerView timePickerView = this.f8949a;
        TimeModel timeModel = this.f8950b;
        timePickerView.p(timeModel.g, timeModel.d(), this.f8950b.e);
    }

    public final void o() {
        p(f, TimeModel.NUMBER_FORMAT);
        p(g, TimeModel.NUMBER_FORMAT);
        p(h, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    public final void p(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.c(this.f8949a.getResources(), strArr[i], str);
        }
    }
}
