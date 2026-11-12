package com.xiaomi.fitness.health.weight.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.common.dialog.FloatNumberPickerDialog;
import com.xiaomi.fitness.common.dialog.IntegerNumberPickerDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.weight.WeightViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.b8c;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jna;
import defpackage.jui;
import defpackage.k5g;
import defpackage.yaa;
import java.util.Calendar;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class WeightAddFragment extends b8c implements yaa, View.OnClickListener {
    public float B;
    public jna f;
    public WeightViewModel g;
    public TextView h;
    public TextView i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f12323k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public float p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f12324r;
    public float t;
    public float v;
    public float x;
    public int z;
    public float s = 18.0f;
    public float u = 66.0f;
    public float w = 55.0f;
    public float y = 18.0f;
    public int A = 10;
    public float C = 2.5f;
    public k5g.a D = new a();

    public class a implements k5g.a {
        public a() {
        }

        @Override // k5g.a
        public void onCancelClicked(View view) {
            WeightAddFragment.this.exitEdit();
        }

        @Override // k5g.a
        public void onSaveClicked(View view) {
            WeightAddFragment.this.finishEdit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitEdit() {
        requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishEdit() {
        this.g.addWeight(x());
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).notifyWeightChanged();
        exitEdit();
    }

    private void onRecordTimeSelected(Bundle bundle) {
        updateRecordTime(bundle.getLong("key_select_mills", System.currentTimeMillis()));
    }

    private void updateRecordTime(long j) {
        if (j == 0) {
            return;
        }
        this.q = j;
        this.h.setText(TimeUtils.formatDate(getString(c0j.p), Long.valueOf(j)));
    }

    public final void A(Bundle bundle) {
        J(bundle.getFloat("key_value", 0.0f));
    }

    public final void B(Bundle bundle) {
        K(bundle.getFloat("key_value", 0.0f));
    }

    public final void C(Bundle bundle) {
        L(bundle.getFloat("key_value", 0.0f));
    }

    public final void D(Bundle bundle) {
        M(bundle.getInt("key_value", 0));
    }

    public final void E(Bundle bundle) {
        float f = bundle.getFloat("key_value", 0.0f);
        if (f == 0.0f) {
            return;
        }
        N(f);
    }

    public final void F(int i) {
        float f;
        int i2;
        float f2;
        float f3;
        FloatNumberPickerDialog floatNumberPickerDialogCreate = new FloatNumberPickerDialog.b("weight").setCustomLayoutId(jui.e7).setCustomTitleId(jui.p).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).create();
        floatNumberPickerDialogCreate.setRequestCode(i);
        floatNumberPickerDialogCreate.T(false);
        int i3 = LocaleUtil.INSTANCE.isTR() ? 0 : c0j.w5;
        if (i != 2) {
            f3 = 1.0f;
            if (i != 3) {
                f2 = 100.0f;
                if (i == 4) {
                    f = this.t;
                    if (f == 0.0f) {
                        f = this.u;
                    }
                    i2 = c0j.t3;
                } else if (i == 5) {
                    f = this.v;
                    if (f == 0.0f) {
                        f = this.w;
                    }
                    i2 = c0j.h4;
                } else if (i == 6) {
                    f = this.x;
                    if (f == 0.0f) {
                        f = this.y;
                    }
                    i2 = c0j.u3;
                    f2 = 25.0f;
                } else {
                    if (i != 8) {
                        Logger.i("WeightAddFragment", "requestCode is invalid: " + i);
                        return;
                    }
                    f = this.B;
                    if (f == 0.0f) {
                        f = this.C;
                    }
                    i3 = c0j.zp;
                    i2 = c0j.M2;
                    f2 = 10.0f;
                }
            } else {
                f = this.f12324r;
                if (f == 0.0f) {
                    f = this.s;
                }
                i2 = c0j.W2;
                f2 = 45.0f;
            }
        } else {
            f = this.p;
            i3 = c0j.zp;
            i2 = c0j.m4;
            f2 = 250.0f;
            f3 = 20.0f;
        }
        floatNumberPickerDialogCreate.R(9);
        floatNumberPickerDialogCreate.S(0);
        floatNumberPickerDialogCreate.setTitle(i2);
        floatNumberPickerDialogCreate.U(f2);
        floatNumberPickerDialogCreate.V(f3);
        floatNumberPickerDialogCreate.X(f);
        floatNumberPickerDialogCreate.W(i3);
        floatNumberPickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    public final void G(int i) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5 = 0;
        IntegerNumberPickerDialog integerNumberPickerDialogCreate = new IntegerNumberPickerDialog.a("integerPicker").setCustomLayoutId(jui.d8).setCustomTitleId(jui.p).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).create();
        integerNumberPickerDialogCreate.setRequestCode(i);
        integerNumberPickerDialogCreate.F(false);
        if (i != 7) {
            str = null;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            int i6 = this.z;
            if (i6 == 0) {
                i6 = this.A;
            }
            int i7 = i6;
            i2 = 30;
            i3 = 1;
            i5 = c0j.a4;
            str = "";
            i4 = i7;
        }
        integerNumberPickerDialogCreate.setTitle(i5);
        integerNumberPickerDialogCreate.setMaxValue(i2);
        integerNumberPickerDialogCreate.setMinValue(i3);
        integerNumberPickerDialogCreate.setValue(i4);
        integerNumberPickerDialogCreate.setUnit(str);
        integerNumberPickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    public final void H(float f) {
        StringBuilder sb;
        if (f <= 0.0f) {
            return;
        }
        this.v = f;
        if (LocaleUtil.INSTANCE.isTR()) {
            sb = new StringBuilder();
            sb.append("%");
            sb.append(f);
        } else {
            sb = new StringBuilder();
            sb.append(f);
            sb.append("%");
        }
        this.l.setText(sb.toString());
    }

    public final void I(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.B = f;
        this.o.setText(String.format(getString(c0j.o4), Float.valueOf(f)));
    }

    public final void J(float f) {
        StringBuilder sb;
        if (f <= 0.0f) {
            return;
        }
        this.f12324r = f;
        if (LocaleUtil.INSTANCE.isTR()) {
            sb = new StringBuilder();
            sb.append("%");
            sb.append(f);
        } else {
            sb = new StringBuilder();
            sb.append(f);
            sb.append("%");
        }
        this.j.setText(sb.toString());
    }

    public final void K(float f) {
        StringBuilder sb;
        if (f <= 0.0f) {
            return;
        }
        this.t = f;
        if (LocaleUtil.INSTANCE.isTR()) {
            sb = new StringBuilder();
            sb.append("%");
            sb.append(f);
        } else {
            sb = new StringBuilder();
            sb.append(f);
            sb.append("%");
        }
        this.f12323k.setText(sb.toString());
    }

    public final void L(float f) {
        StringBuilder sb;
        if (f <= 0.0f) {
            return;
        }
        this.x = f;
        if (LocaleUtil.INSTANCE.isTR()) {
            sb = new StringBuilder();
            sb.append("%");
            sb.append(f);
        } else {
            sb = new StringBuilder();
            sb.append(f);
            sb.append("%");
        }
        this.m.setText(sb.toString());
    }

    public final void M(int i) {
        if (i <= 0) {
            return;
        }
        this.z = i;
        this.n.setText(String.valueOf(i));
    }

    public final void N(float f) {
        if (f == 0.0f) {
            return;
        }
        this.p = f;
        this.i.setText(getString(c0j.u4, String.format(Locale.getDefault(), "%1$.1f", Float.valueOf(f))));
    }

    public final void initActionBar() {
        k5g.d(getContext(), getActionBar(), c0j.d5, this.D);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == eri.se) {
            F(2);
            return;
        }
        if (id == eri.pe) {
            onRecordTimeClick();
            return;
        }
        if (id == eri.Fe) {
            F(3);
            return;
        }
        if (id == eri.Ge) {
            F(4);
            return;
        }
        if (id == eri.De) {
            F(5);
            return;
        }
        if (id == eri.He) {
            F(6);
        } else if (id == eri.Ie) {
            G(7);
        } else if (id == eri.Ee) {
            F(8);
        }
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int i, int i2, @NotNull Bundle bundle) {
        if (i == 1 && i2 == -1) {
            onRecordTimeSelected(bundle);
            return;
        }
        if (i2 == -1) {
            switch (i) {
                case 2:
                    E(bundle);
                    break;
                case 3:
                    A(bundle);
                    break;
                case 4:
                    B(bundle);
                    break;
                case 5:
                    y(bundle);
                    break;
                case 6:
                    C(bundle);
                    break;
                case 7:
                    D(bundle);
                    break;
                case 8:
                    z(bundle);
                    break;
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        jna jnaVarA0 = jna.A0(layoutInflater, viewGroup, false);
        this.f = jnaVarA0;
        return jnaVarA0.getRoot();
    }

    public final void onRecordTimeClick() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("time_picker").setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.pp).create();
        dateTimePickerDialogCreate.setRequestCode(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(1, -10);
        dateTimePickerDialogCreate.B(calendar.getTimeInMillis());
        dateTimePickerDialogCreate.A(jCurrentTimeMillis);
        dateTimePickerDialogCreate.y(this.q);
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(String.valueOf(1), this.q);
        bundle.putFloat(String.valueOf(2), this.p);
        bundle.putFloat(String.valueOf(3), this.f12324r);
        bundle.putFloat(String.valueOf(4), this.t);
        bundle.putFloat(String.valueOf(5), this.v);
        bundle.putFloat(String.valueOf(6), this.x);
        bundle.putInt(String.valueOf(7), this.z);
        bundle.putFloat(String.valueOf(8), this.B);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.g = (WeightViewModel) new ViewModelProvider(this).get(WeightViewModel.class);
        initActionBar();
        setTitle(c0j.o5);
        jna jnaVar = this.f;
        RelativeLayout relativeLayout = jnaVar.I;
        RelativeLayout relativeLayout2 = jnaVar.J;
        this.h = jnaVar.S;
        this.i = jnaVar.U;
        relativeLayout.setOnClickListener(this);
        relativeLayout2.setOnClickListener(this);
        boolean zIsFemale = HealthUtil.isFemale();
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = zIsFemale ? 55.0f : 65.0f;
        if (bundle != null) {
            jCurrentTimeMillis = bundle.getLong(String.valueOf(1), jCurrentTimeMillis);
            f = bundle.getFloat(String.valueOf(2), f);
        }
        updateRecordTime(jCurrentTimeMillis);
        N(f);
        jna jnaVar2 = this.f;
        RelativeLayout relativeLayout3 = jnaVar2.M;
        RelativeLayout relativeLayout4 = jnaVar2.N;
        RelativeLayout relativeLayout5 = jnaVar2.K;
        RelativeLayout relativeLayout6 = jnaVar2.O;
        RelativeLayout relativeLayout7 = jnaVar2.P;
        RelativeLayout relativeLayout8 = jnaVar2.L;
        this.j = jnaVar2.X;
        this.f12323k = jnaVar2.Y;
        this.l = jnaVar2.V;
        this.m = jnaVar2.Z;
        this.n = jnaVar2.a0;
        this.o = jnaVar2.W;
        relativeLayout3.setOnClickListener(this);
        relativeLayout4.setOnClickListener(this);
        relativeLayout5.setOnClickListener(this);
        relativeLayout6.setOnClickListener(this);
        relativeLayout7.setOnClickListener(this);
        relativeLayout8.setOnClickListener(this);
        if (bundle != null) {
            J(bundle.getFloat(String.valueOf(3), 0.0f));
            K(bundle.getFloat(String.valueOf(4), 0.0f));
            H(bundle.getFloat(String.valueOf(5), 0.0f));
            L(bundle.getFloat(String.valueOf(6), 0.0f));
            M(bundle.getInt(String.valueOf(7), 0));
            I(bundle.getFloat(String.valueOf(8), 0.0f));
        }
    }

    public final WeightItem x() {
        long j = this.q / 1000;
        float f = this.p;
        float height = HealthUtil.getHeight();
        Float fValueOf = height > 0.0f ? Float.valueOf(f / ((float) Math.pow(height / 100.0f, 2.0d))) : null;
        float f2 = this.f12324r;
        Float fValueOf2 = f2 != 0.0f ? Float.valueOf(f2) : null;
        float f3 = this.t;
        Float fValueOf3 = f3 != 0.0f ? Float.valueOf(f3) : null;
        float f4 = this.v;
        Float fValueOf4 = f4 != 0.0f ? Float.valueOf(f4) : null;
        float f5 = this.x;
        Float fValueOf5 = f5 != 0.0f ? Float.valueOf(f5) : null;
        int i = this.z;
        Float fValueOf6 = i != 0 ? Float.valueOf(i) : null;
        float f6 = this.B;
        return new WeightItem(j, f, fValueOf, fValueOf2, fValueOf4, f6 != 0.0f ? Float.valueOf(f6) : null, null, fValueOf3, fValueOf5, fValueOf6);
    }

    public final void y(Bundle bundle) {
        H(bundle.getFloat("key_value", 0.0f));
    }

    public final void z(Bundle bundle) {
        I(bundle.getFloat("key_value", 0.0f));
    }
}
