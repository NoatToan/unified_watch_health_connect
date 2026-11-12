package com.huami.watch.companion.ui.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.fragment.HeartRateAndStressMeasureModeFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0014J\b\u0010\u0013\u001a\u00020\nH\u0014R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/watch/companion/ui/fragment/HeartRateAndStressMeasureModeFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", "v", "", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initView", "", "isAllDayHR", "isAllDayStress", "setIsAllDay", "Lcom/huami/watch/companion/ui/fragment/HeartRateAndStressMeasureModeFragment$OnMeasureResultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMeasureResultListener", "onStart", "hasPadding", "hasBackground", "e", "Z", "mIsAllDayHR", "f", "mIsAllDayStress", "Lcom/huami/watch/companion/ui/fragment/HeartRateAndStressMeasureModeFragment$OnMeasureResultListener;", "mOnMeasureResultListener", "<init>", "()V", "OnMeasureResultListener", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateAndStressMeasureModeFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mIsAllDayHR;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean mIsAllDayStress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private OnMeasureResultListener mOnMeasureResultListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/watch/companion/ui/fragment/HeartRateAndStressMeasureModeFragment$OnMeasureResultListener;", "", "", "isAllDayHR", "isAllDayStress", "", "onMeasureResult", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface OnMeasureResultListener {
        void onMeasureResult(boolean isAllDayHR, boolean isAllDayStress);
    }

    private final void g(View v) {
        View viewFindViewById = v.findViewById(R.id.layout_mode_manual);
        View viewFindViewById2 = v.findViewById(R.id.layout_mode_continuous);
        View viewFindViewById3 = v.findViewById(R.id.layout_mode_stress);
        View viewFindViewById4 = v.findViewById(R.id.arrow_mode_manual);
        View viewFindViewById5 = v.findViewById(R.id.arrow_mode_continuous);
        View viewFindViewById6 = v.findViewById(R.id.arrow_mode_stress);
        TextView textView = (TextView) v.findViewById(R.id.mode_manual);
        TextView textView2 = (TextView) v.findViewById(R.id.mode_continuous);
        TextView textView3 = (TextView) v.findViewById(R.id.mode_stress);
        View viewFindViewById7 = v.findViewById(R.id.cancel);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ey3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateAndStressMeasureModeFragment.h(this.a, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: gy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateAndStressMeasureModeFragment.i(this.a, view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: fy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateAndStressMeasureModeFragment.j(this.a, view);
            }
        });
        viewFindViewById7.setOnClickListener(new View.OnClickListener() { // from class: dy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateAndStressMeasureModeFragment.k(this.a, view);
            }
        });
        if (!this.mIsAllDayHR) {
            viewFindViewById4.setVisibility(0);
            viewFindViewById5.setVisibility(8);
            viewFindViewById6.setVisibility(8);
            textView.setTextColor(ContextCompat.getColor(v.getContext(), R.color.pink));
            Context context = v.getContext();
            int i = R.color.black;
            textView2.setTextColor(ContextCompat.getColor(context, i));
            textView3.setTextColor(ContextCompat.getColor(v.getContext(), i));
            return;
        }
        if (this.mIsAllDayStress) {
            viewFindViewById4.setVisibility(8);
            viewFindViewById5.setVisibility(8);
            viewFindViewById6.setVisibility(0);
            Context context2 = v.getContext();
            int i2 = R.color.black;
            textView.setTextColor(ContextCompat.getColor(context2, i2));
            textView2.setTextColor(ContextCompat.getColor(v.getContext(), i2));
            textView3.setTextColor(ContextCompat.getColor(v.getContext(), R.color.pink));
            return;
        }
        viewFindViewById4.setVisibility(8);
        viewFindViewById5.setVisibility(0);
        viewFindViewById6.setVisibility(8);
        Context context3 = v.getContext();
        int i3 = R.color.black;
        textView.setTextColor(ContextCompat.getColor(context3, i3));
        textView2.setTextColor(ContextCompat.getColor(v.getContext(), R.color.pink));
        textView3.setTextColor(ContextCompat.getColor(v.getContext(), i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HeartRateAndStressMeasureModeFragment heartRateAndStressMeasureModeFragment, View view) {
        OnMeasureResultListener onMeasureResultListener = heartRateAndStressMeasureModeFragment.mOnMeasureResultListener;
        if (onMeasureResultListener != null) {
            onMeasureResultListener.onMeasureResult(false, false);
        }
        heartRateAndStressMeasureModeFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HeartRateAndStressMeasureModeFragment heartRateAndStressMeasureModeFragment, View view) {
        OnMeasureResultListener onMeasureResultListener = heartRateAndStressMeasureModeFragment.mOnMeasureResultListener;
        if (onMeasureResultListener != null) {
            onMeasureResultListener.onMeasureResult(true, false);
        }
        heartRateAndStressMeasureModeFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HeartRateAndStressMeasureModeFragment heartRateAndStressMeasureModeFragment, View view) {
        OnMeasureResultListener onMeasureResultListener = heartRateAndStressMeasureModeFragment.mOnMeasureResultListener;
        if (onMeasureResultListener != null) {
            onMeasureResultListener.onMeasureResult(true, true);
        }
        heartRateAndStressMeasureModeFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HeartRateAndStressMeasureModeFragment heartRateAndStressMeasureModeFragment, View view) {
        heartRateAndStressMeasureModeFragment.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.fragment_heartrate_and_stress_measure_mode, null);
        g(viewInflate);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    public final void setIsAllDay(boolean isAllDayHR, boolean isAllDayStress) {
        this.mIsAllDayHR = isAllDayHR;
        this.mIsAllDayStress = isAllDayStress;
    }

    public final void setOnMeasureResultListener(@NotNull OnMeasureResultListener listener) {
        this.mOnMeasureResultListener = listener;
    }
}
