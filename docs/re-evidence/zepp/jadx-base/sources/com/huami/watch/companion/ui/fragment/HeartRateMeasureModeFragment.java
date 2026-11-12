package com.huami.watch.companion.ui.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.fragment.HeartRateMeasureModeFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0014J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/companion/ui/fragment/HeartRateMeasureModeFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "f", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initView", "", "enable", "setAllDataHeartRateEnable", "Lcom/huami/watch/companion/ui/fragment/HeartRateMeasureModeFragment$OnMeasureResultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMeasureResultListener", "onStart", "hasPadding", "hasBackground", "e", "Z", "mAllDataHeartRateEnable", "Lcom/huami/watch/companion/ui/fragment/HeartRateMeasureModeFragment$OnMeasureResultListener;", "mOnMeasureResultListener", "<init>", "()V", "OnMeasureResultListener", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateMeasureModeFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mAllDataHeartRateEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OnMeasureResultListener mOnMeasureResultListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/companion/ui/fragment/HeartRateMeasureModeFragment$OnMeasureResultListener;", "", "", "isAllDayHr", "", "onMeasureResult", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface OnMeasureResultListener {
        void onMeasureResult(boolean isAllDayHr);
    }

    private final void f(View view) {
        View viewFindViewById = view.findViewById(R.id.view_allday_heart);
        View viewFindViewById2 = view.findViewById(R.id.view_manual);
        View viewFindViewById3 = view.findViewById(R.id.iv_every_min);
        View viewFindViewById4 = view.findViewById(R.id.iv_manual);
        TextView textView = (TextView) view.findViewById(R.id.heart_measure_type_every_min);
        TextView textView2 = (TextView) view.findViewById(R.id.heart_measure_type_manual);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_cancel);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: vy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateMeasureModeFragment.g(this.a, view2);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: xy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateMeasureModeFragment.h(this.a, view2);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: wy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateMeasureModeFragment.i(this.a, view2);
            }
        });
        if (this.mAllDataHeartRateEnable) {
            viewFindViewById3.setVisibility(0);
            viewFindViewById4.setVisibility(8);
            textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.pink));
            textView2.setTextColor(ContextCompat.getColor(view.getContext(), R.color.black));
            return;
        }
        viewFindViewById3.setVisibility(8);
        viewFindViewById4.setVisibility(0);
        textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.black));
        textView2.setTextColor(ContextCompat.getColor(view.getContext(), R.color.pink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HeartRateMeasureModeFragment heartRateMeasureModeFragment, View view) {
        OnMeasureResultListener onMeasureResultListener = heartRateMeasureModeFragment.mOnMeasureResultListener;
        if (onMeasureResultListener != null) {
            onMeasureResultListener.onMeasureResult(true);
        }
        heartRateMeasureModeFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HeartRateMeasureModeFragment heartRateMeasureModeFragment, View view) {
        OnMeasureResultListener onMeasureResultListener = heartRateMeasureModeFragment.mOnMeasureResultListener;
        if (onMeasureResultListener != null) {
            onMeasureResultListener.onMeasureResult(false);
        }
        heartRateMeasureModeFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HeartRateMeasureModeFragment heartRateMeasureModeFragment, View view) {
        heartRateMeasureModeFragment.dismiss();
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
        View viewInflate = View.inflate(getContext(), R.layout.fragment_heart_rate_measure_type, null);
        f(viewInflate);
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

    public final void setAllDataHeartRateEnable(boolean enable) {
        this.mAllDataHeartRateEnable = enable;
    }

    public final void setOnMeasureResultListener(@NotNull OnMeasureResultListener listener) {
        this.mOnMeasureResultListener = listener;
    }
}
