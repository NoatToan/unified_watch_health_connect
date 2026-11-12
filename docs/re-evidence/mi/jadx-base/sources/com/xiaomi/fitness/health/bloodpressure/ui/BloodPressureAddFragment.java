package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.o3a;
import defpackage.qxi;
import defpackage.wc0;
import defpackage.yaa;
import defpackage.z7c;
import java.util.Calendar;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class BloodPressureAddFragment extends z7c implements yaa {
    public static final int[] n = {30, 200};
    public static final int[] o = {30, 300};
    public static final int[] p = {30, 220};
    public o3a f;
    public TextView g;
    public EditText h;
    public EditText i;
    public EditText j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12226k;
    public BloodPressureViewModel l;
    public k5g.a m = new a();

    public class a implements k5g.a {
        public a() {
        }

        @Override // k5g.a
        public void onCancelClicked(View view) {
            BloodPressureAddFragment.this.B();
        }

        @Override // k5g.a
        public void onSaveClicked(View view) {
            BloodPressureAddFragment.this.onClickSaveRecord();
        }
    }

    public static Calendar C() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        TimeUtils.setToZeroOClock(calendar);
        return calendar;
    }

    public static long[] getNormalDateRange() {
        return new long[]{C().getTimeInMillis(), TimeUtils.getBeginOfToday()};
    }

    public final void B() {
        requireActivity().onBackPressed();
    }

    public final void D() {
        o3a o3aVar = this.f;
        CardView cardView = o3aVar.A;
        CardView cardView2 = o3aVar.B;
        this.i = (EditText) cardView.findViewById(eri.w4);
        this.h = (EditText) cardView2.findViewById(eri.w4);
        ((TextView) cardView.findViewById(eri.bn)).setText(c0j.G1);
        ((TextView) cardView2.findViewById(eri.bn)).setText(c0j.H1);
        cardView.setOnClickListener(new View.OnClickListener() { // from class: jy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23231a.E(view);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() { // from class: ky2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24406a.F(view);
            }
        });
        CardView cardView3 = this.f.C;
        this.j = (EditText) cardView3.findViewById(eri.w4);
        ((TextView) cardView3.findViewById(eri.bn)).setText(getString(c0j.j2));
        ((TextView) cardView3.findViewById(eri.jn)).setText(getResources().getQuantityString(qxi.g, 60));
        cardView3.setOnClickListener(new View.OnClickListener() { // from class: ly2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25543a.G(view);
            }
        });
    }

    public final /* synthetic */ void E(View view) {
        requestFocus(this.i);
    }

    public final /* synthetic */ void F(View view) {
        requestFocus(this.h);
    }

    public final /* synthetic */ void G(View view) {
        requestFocus(this.j);
    }

    public final /* synthetic */ void H(View view) {
        showRecordTimeDialogIfNeed();
    }

    public final void initRecordTime() {
        View view = this.f.D;
        TextView textView = (TextView) view.findViewById(eri.bn);
        TextView textView2 = (TextView) view.findViewById(eri.Mm);
        ((ImageView) view.findViewById(eri.G7)).setVisibility(8);
        textView2.setVisibility(8);
        textView.setText(c0j.Z1);
        this.g = (TextView) view.findViewById(eri.Hm);
        view.setOnClickListener(new View.OnClickListener() { // from class: my2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f27327a.H(view2);
            }
        });
        updateRecordTime(System.currentTimeMillis());
    }

    public final void onClickSaveRecord() {
        String string = this.i.getText().toString();
        String string2 = this.h.getText().toString();
        String string3 = this.j.getText().toString();
        Context contextRequireContext = requireContext();
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            ToastExtKt.toastLong(contextRequireContext, c0j.y1);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            ToastExtKt.toastLong(contextRequireContext, c0j.w1);
            return;
        }
        if (TextUtils.isEmpty(string2)) {
            ToastExtKt.toastLong(contextRequireContext, c0j.x1);
            return;
        }
        int i = Integer.parseInt(string);
        int i2 = Integer.parseInt(string2);
        Integer numValueOf = !TextUtils.isEmpty(string3) ? Integer.valueOf(Integer.parseInt(string3)) : null;
        if (i2 >= i) {
            ToastExtKt.toastLong(contextRequireContext, c0j.m2);
            return;
        }
        int[] iArr = o;
        if (i < iArr[0]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.o2);
            return;
        }
        if (i > iArr[1]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.n2);
            return;
        }
        int[] iArr2 = n;
        if (i2 < iArr2[0]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.q2);
            return;
        }
        if (i2 > iArr2[1]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.p2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() < p[0]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.s2);
        } else if (numValueOf != null && numValueOf.intValue() > p[1]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.r2);
        } else {
            this.l.insertBloodPressureRecord(i2, i, numValueOf, this.f12226k / 1000);
            B();
        }
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int i, int i2, @NotNull Bundle bundle) {
        if (i == 1 && i2 == -1) {
            onRecordTimeSelected(bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Objects.requireNonNull(layoutInflater);
        o3a o3aVarA0 = o3a.A0(layoutInflater, viewGroup, false);
        this.f = o3aVarA0;
        return o3aVarA0.getRoot();
    }

    public final void onRecordTimeSelected(Bundle bundle) {
        updateRecordTime(bundle.getLong("key_select_mills", System.currentTimeMillis()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("low_pressure", this.h.getText().toString());
        bundle.putString("high_pressure", this.i.getText().toString());
        bundle.putString(DailyReportKey.pulse, this.j.getText().toString());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        wc0 actionBar = getActionBar();
        Objects.requireNonNull(actionBar);
        k5g.d(contextRequireContext, actionBar, c0j.D, this.m);
        this.l = (BloodPressureViewModel) new ViewModelProvider(this).get(BloodPressureViewModel.class);
        initRecordTime();
        D();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.h.setText(bundle.getString("low_pressure"));
            this.i.setText(bundle.getString("high_pressure"));
            this.j.setText(bundle.getString(DailyReportKey.pulse));
        }
    }

    public final void requestFocus(EditText editText) {
        editText.setFocusable(true);
        editText.requestFocus();
        Editable text = editText.getText();
        editText.setSelection(text == null ? 0 : text.length());
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(editText, 0);
    }

    public final void showRecordTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("record_time").setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.t2).create();
        dateTimePickerDialogCreate.setRequestCode(1);
        dateTimePickerDialogCreate.B(getNormalDateRange()[0]);
        dateTimePickerDialogCreate.A(System.currentTimeMillis());
        dateTimePickerDialogCreate.y(this.f12226k);
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    public final void updateRecordTime(long j) {
        this.f12226k = j;
        this.g.setText(TimeUtils.formatDate(getString(c0j.p), Long.valueOf(j)));
    }
}
