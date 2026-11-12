package com.xiaomi.fitness.health.hrm;

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
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.a8c;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.l2c;
import defpackage.qxi;
import defpackage.w7a;
import defpackage.wc0;
import defpackage.yaa;
import java.util.Calendar;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class HrmAddFragment extends a8c implements yaa {
    public static final int[] n = {30, 350};
    public w7a f;
    public TextView g;
    public EditText h;
    public TextView i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12246k;
    public HrmViewModel l;
    public k5g.a m = new a();

    public class a implements k5g.a {
        public a() {
        }

        @Override // k5g.a
        public void onCancelClicked(View view) {
            HrmAddFragment.this.z();
        }

        @Override // k5g.a
        public void onSaveClicked(View view) {
            HrmAddFragment.this.onClickSaveRecord();
        }
    }

    public static Calendar A() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        TimeUtils.setToZeroOClock(calendar);
        return calendar;
    }

    private void B() {
        CardView cardView = this.f.A;
        this.h = (EditText) cardView.findViewById(eri.w4);
        this.i = (TextView) cardView.findViewById(eri.jn);
        this.h.setHint(String.valueOf(70));
        this.i.setText(getResources().getQuantityString(qxi.common_unit_heart_rate, 40));
        ((TextView) cardView.findViewById(eri.bn)).setText(l2c.b(4));
        cardView.setOnClickListener(new View.OnClickListener() { // from class: cdc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5211a.C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        requestFocus(this.h);
    }

    public static long[] getNormalDateRange() {
        return new long[]{A().getTimeInMillis(), TimeUtils.getBeginOfToday()};
    }

    private void initRecordTime() {
        View view = this.f.B;
        TextView textView = (TextView) view.findViewById(eri.bn);
        TextView textView2 = (TextView) view.findViewById(eri.Mm);
        ((ImageView) view.findViewById(eri.G7)).setVisibility(8);
        textView2.setVisibility(8);
        textView.setText(c0j.Z1);
        this.g = (TextView) view.findViewById(eri.Hm);
        view.setOnClickListener(new View.OnClickListener() { // from class: ddc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15398a.D(view2);
            }
        });
        updateRecordTime(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClickSaveRecord() {
        String string = this.h.getText().toString();
        Context contextRequireContext = requireContext();
        if (TextUtils.isEmpty(string)) {
            ToastExtKt.toastLong(contextRequireContext, c0j.F);
            return;
        }
        int i = Integer.parseInt(string);
        int[] iArr = n;
        if (i < iArr[0] || i > iArr[1]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.l2);
        } else {
            this.l.insertHrmRecord(this.j / 1000, i);
            z();
        }
    }

    private void onRecordTimeSelected(Bundle bundle) {
        updateRecordTime(bundle.getLong("key_select_mills", System.currentTimeMillis()));
    }

    private void requestFocus(EditText editText) {
        editText.setFocusable(true);
        editText.requestFocus();
        Editable text = editText.getText();
        editText.setSelection(text == null ? 0 : text.length());
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(editText, 0);
    }

    private void showRecordTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("record_time").setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.t2).create();
        dateTimePickerDialogCreate.setRequestCode(1);
        dateTimePickerDialogCreate.B(getNormalDateRange()[0]);
        dateTimePickerDialogCreate.A(System.currentTimeMillis());
        dateTimePickerDialogCreate.y(this.j);
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private void updateRecordTime(long j) {
        this.j = j;
        this.g.setText(TimeUtils.formatDate(getString(c0j.p), Long.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        requireActivity().onBackPressed();
    }

    public final /* synthetic */ void D(View view) {
        showRecordTimeDialogIfNeed();
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
        w7a w7aVarA0 = w7a.A0(layoutInflater, viewGroup, false);
        this.f = w7aVarA0;
        return w7aVarA0.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        wc0 actionBar = getActionBar();
        Objects.requireNonNull(actionBar);
        k5g.d(contextRequireContext, actionBar, c0j.D, this.m);
        this.l = (HrmViewModel) new ViewModelProvider(requireActivity()).get(HrmViewModel.class);
        initRecordTime();
        B();
        refreshView();
    }

    public final void refreshView() {
        int i = this.f12246k;
        if (i <= 0) {
            i = 70;
        }
        this.f12246k = i;
        this.h.setText(String.valueOf(i));
    }
}
