package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.ui.TemperatureAddFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.rka;
import defpackage.wc0;
import defpackage.yaa;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B\u0007¢\u0006\u0004\b+\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureAddFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "Lrka;", "Lyaa;", "", "initActionBar", "()V", "onClickSaveRecord", "initView", "initEditCard", "Landroid/widget/EditText;", "editText", "requestFocus", "(Landroid/widget/EditText;)V", "initRecordTime", "showRecordTimeDialogIfNeed", "", "getNormalDateRange", "()[J", "", "recordTimeMills", "updateRecordTime", "(J)V", "Landroid/os/Bundle;", "data", "onRecordTimeSelected", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Landroid/widget/TextView;", "tvRecordTime", "Landroid/widget/TextView;", "Landroid/widget/EditText;", "J", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureAddFragment extends Hilt_TemperatureAddFragment<TemperatureViewModel, rka> implements yaa {

    @NotNull
    private static final float[] RANGE = {34.0f, 42.0f};
    public static final int REQ_RECORD_TIME = 100;
    private EditText editText;
    private long recordTimeMills;
    private TextView tvRecordTime;

    public TemperatureAddFragment() {
        super(jui.R1);
    }

    private final long[] getNormalDateRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        TimeUtils.setToZeroOClock(calendar);
        return new long[]{calendar.getTimeInMillis(), TimeUtils.getBeginOfToday()};
    }

    private final void initActionBar() {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            k5g.d(requireContext(), actionBar, c0j.g5, new k5g.a() { // from class: com.xiaomi.fitness.health.temperature.ui.TemperatureAddFragment$initActionBar$1$1
                @Override // k5g.a
                public void onCancelClicked(View view) {
                    this.this$0.requireActivity().onBackPressed();
                }

                @Override // k5g.a
                public void onSaveClicked(View view) {
                    this.this$0.onClickSaveRecord();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEditCard() {
        CardView cardEdit = ((rka) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(cardEdit, "cardEdit");
        this.editText = (EditText) cardEdit.findViewById(eri.w4);
        TextView textView = (TextView) cardEdit.findViewById(eri.jn);
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            editText = null;
        }
        editText.setHint("36.5");
        textView.setText(getString(c0j.hn));
        ((TextView) cardEdit.findViewById(eri.bn)).setText(getString(c0j.dn));
        cardEdit.setOnClickListener(new View.OnClickListener() { // from class: i2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemperatureAddFragment.initEditCard$lambda$1(this.f20712a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEditCard$lambda$1(TemperatureAddFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText editText = this$0.editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            editText = null;
        }
        this$0.requestFocus(editText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecordTime() {
        View layoutRecordTime = ((rka) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(layoutRecordTime, "layoutRecordTime");
        TextView textView = (TextView) layoutRecordTime.findViewById(eri.bn);
        TextView textView2 = (TextView) layoutRecordTime.findViewById(eri.Mm);
        ImageView imageView = (ImageView) layoutRecordTime.findViewById(eri.G7);
        textView.setText(c0j.ln);
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.setVisible(textView2, false);
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.setVisible(imageView, false);
        this.tvRecordTime = (TextView) layoutRecordTime.findViewById(eri.Hm);
        layoutRecordTime.setOnClickListener(new View.OnClickListener() { // from class: j2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemperatureAddFragment.initRecordTime$lambda$2(this.f22361a, view);
            }
        });
        updateRecordTime(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecordTime$lambda$2(TemperatureAddFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRecordTimeDialogIfNeed();
    }

    private final void initView() {
        initRecordTime();
        initEditCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onClickSaveRecord() {
        EditText editText = this.editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            editText = null;
        }
        String string = editText.getText().toString();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (TextUtils.isEmpty(string)) {
            ToastExtKt.toastLong(contextRequireContext, c0j.jn);
            return;
        }
        float f = Float.parseFloat(string);
        float[] fArr = RANGE;
        if (f < fArr[0] || f > fArr[1]) {
            ToastExtKt.toastLong(contextRequireContext, c0j.jn);
        } else {
            ((TemperatureViewModel) getMViewModel()).insertBloodPressureRecord(this.recordTimeMills / ((long) 1000), f);
            requireActivity().onBackPressed();
        }
    }

    private final void onRecordTimeSelected(Bundle data) {
        updateRecordTime(data.getLong("key_select_mills", System.currentTimeMillis()));
    }

    private final void requestFocus(EditText editText) {
        editText.setFocusable(true);
        editText.requestFocus();
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
        Object systemService = requireActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(editText, 0);
    }

    private final void showRecordTimeDialogIfNeed() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("record_time").setCustomLayoutId(jui.Y6).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(c0j.t2).create();
        dateTimePickerDialogCreate.setRequestCode(100);
        dateTimePickerDialogCreate.B(getNormalDateRange()[0]);
        dateTimePickerDialogCreate.A(System.currentTimeMillis());
        dateTimePickerDialogCreate.y(this.recordTimeMills);
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void updateRecordTime(long recordTimeMills) {
        this.recordTimeMills = recordTimeMills;
        String date = TimeUtils.formatDate(getString(c0j.p), Long.valueOf(recordTimeMills));
        TextView textView = this.tvRecordTime;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRecordTime");
            textView = null;
        }
        textView.setText(date);
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 100 && resultCode == -1) {
            onRecordTimeSelected(data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        initView();
    }
}
