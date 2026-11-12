package com.huami.wallet.ui.fragment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.RefundResultActivity;
import com.huami.wallet.ui.fragment.RefundResultFragment;
import com.huami.wallet.ui.utils.BusExtensionKt;
import com.huami.widget.toast.CustomToast;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundResultFragment;", "Landroidx/fragment/app/Fragment;", "", "result", "", "orderNumber", "errorMsg", "", "b", "", "isSuccess", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RefundResultFragment extends Fragment {
    public static final int EXTRA_APPLY_FAILURE = 1;
    public static final int EXTRA_APPLY_SUCCESS = 0;
    public static final int EXTRA_REFUND_FAILURE = 3;
    public static final int EXTRA_REFUND_SUCCESS = 2;

    private final void b(int result, final String orderNumber, String errorMsg) {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_order_text))).setText(orderNumber);
        if (orderNumber.length() == 0) {
            View view2 = getView();
            BusExtensionKt.setGone(view2 == null ? null : view2.findViewById(R.id.tv_copy));
            View view3 = getView();
            BusExtensionKt.setGone(view3 == null ? null : view3.findViewById(R.id.wl_order_number_rl));
        } else {
            View view4 = getView();
            BusExtensionKt.setVisible(view4 == null ? null : view4.findViewById(R.id.tv_copy));
        }
        View view5 = getView();
        ((TextView) (view5 == null ? null : view5.findViewById(R.id.tv_copy))).setOnClickListener(new View.OnClickListener() { // from class: ka6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                RefundResultFragment.c(this.a, orderNumber, view6);
            }
        });
        if (result == 0) {
            View view6 = getView();
            ((ImageView) (view6 == null ? null : view6.findViewById(R.id.iv_apply_success))).setImageResource(R.drawable.wl_ic_invoice_success);
            d(true);
            View view7 = getView();
            ((TextView) (view7 == null ? null : view7.findViewById(R.id.tv_apply_success))).setText(R.string.wl_apply_refund_success);
            View view8 = getView();
            ((TextView) (view8 != null ? view8.findViewById(R.id.tv_tip_msg) : null)).setText(R.string.wl_open_card_refund_fail_tip);
            return;
        }
        if (result == 1) {
            View view9 = getView();
            ((ImageView) (view9 == null ? null : view9.findViewById(R.id.iv_apply_success))).setImageResource(R.drawable.wl_ic_error);
            d(true);
            View view10 = getView();
            ((TextView) (view10 == null ? null : view10.findViewById(R.id.tv_apply_success))).setText(R.string.wl_apply_refund_fail);
            View view11 = getView();
            ((TextView) (view11 != null ? view11.findViewById(R.id.tv_tip_msg) : null)).setText(R.string.wl_open_card_refund_fail_tip);
            return;
        }
        if (result == 2) {
            View view12 = getView();
            ((ImageView) (view12 == null ? null : view12.findViewById(R.id.iv_apply_success))).setImageResource(R.drawable.wl_ic_invoice_success);
            d(true);
            View view13 = getView();
            ((TextView) (view13 == null ? null : view13.findViewById(R.id.tv_apply_success))).setText(R.string.wl_check_out_success);
            View view14 = getView();
            ((TextView) (view14 != null ? view14.findViewById(R.id.tv_tip_msg) : null)).setText(R.string.wl_check_out_fail_tip);
            return;
        }
        if (result != 3) {
            return;
        }
        View view15 = getView();
        ((ImageView) (view15 == null ? null : view15.findViewById(R.id.iv_apply_success))).setImageResource(R.drawable.wl_ic_error);
        d(false);
        View view16 = getView();
        ((TextView) (view16 == null ? null : view16.findViewById(R.id.tv_apply_failure))).setText(R.string.wl_check_out_fail);
        View view17 = getView();
        ((TextView) (view17 == null ? null : view17.findViewById(R.id.tv_apply_failure_message))).setText(requireContext().getString(R.string.wl_check_out_fail_reason, errorMsg));
        View view18 = getView();
        ((TextView) (view18 != null ? view18.findViewById(R.id.tv_tip_msg) : null)).setText(R.string.wl_check_out_fail_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RefundResultFragment refundResultFragment, String str, View view) {
        Object systemService = refundResultFragment.requireContext().getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("tag", str));
        CustomToast.makeText(refundResultFragment.requireContext(), R.string.wl_copy_success, 0).show();
    }

    private final void d(boolean isSuccess) {
        if (isSuccess) {
            View view = getView();
            BusExtensionKt.setGone(view == null ? null : view.findViewById(R.id.tv_apply_failure));
            View view2 = getView();
            BusExtensionKt.setGone(view2 == null ? null : view2.findViewById(R.id.tv_apply_failure_message));
            View view3 = getView();
            BusExtensionKt.setVisible(view3 != null ? view3.findViewById(R.id.tv_apply_success) : null);
            return;
        }
        View view4 = getView();
        BusExtensionKt.setGone(view4 == null ? null : view4.findViewById(R.id.tv_apply_success));
        View view5 = getView();
        BusExtensionKt.setVisible(view5 == null ? null : view5.findViewById(R.id.tv_apply_failure));
        View view6 = getView();
        BusExtensionKt.setVisible(view6 != null ? view6.findViewById(R.id.tv_apply_failure_message) : null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_refund_result, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b(requireArguments().getInt(RefundResultActivity.EXTRA_RESULT), requireArguments().getString(RefundResultActivity.EXTRA_ORDER_NUMBER, ""), requireArguments().getString(RefundResultActivity.EXTRA_ERROR_MEG, ""));
    }
}
