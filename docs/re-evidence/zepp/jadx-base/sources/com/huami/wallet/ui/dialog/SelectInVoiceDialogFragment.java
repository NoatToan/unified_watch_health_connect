package com.huami.wallet.ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.dialog.SelectInVoiceDialogFragment;
import com.huami.wallet.ui.utils.BusExtensionKt;
import com.huami.wallet.ui.widget.SystemBarTintSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0015J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "hasPadding", "hasBackground", "onStart", "Landroid/view/View;", "initView", "Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment$OnInVoiceItemListener;", "onInVoiceItem", "setOnInVoiceItemListener", "e", "Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment$OnInVoiceItemListener;", "onItemListener", "<init>", "()V", "Companion", "OnInVoiceItemListener", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectInVoiceDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnInVoiceItemListener onItemListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment$Companion;", "", "", "isShowRechargeInvoice", "isSZTBusCard", "Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment;", "newInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectInVoiceDialogFragment newInstance(boolean isShowRechargeInvoice, boolean isSZTBusCard) {
            SelectInVoiceDialogFragment selectInVoiceDialogFragment = new SelectInVoiceDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isShowRechargeInvoice", isShowRechargeInvoice);
            bundle.putBoolean("isSZTBusCard", isSZTBusCard);
            selectInVoiceDialogFragment.setArguments(bundle);
            return selectInVoiceDialogFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceDialogFragment$OnInVoiceItemListener;", "", "", "clickRechargePosition", "clickServiceNegation", "clickCancel", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnInVoiceItemListener {
        void clickCancel();

        void clickRechargePosition();

        void clickServiceNegation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SelectInVoiceDialogFragment selectInVoiceDialogFragment, View view) {
        OnInVoiceItemListener onInVoiceItemListener = selectInVoiceDialogFragment.onItemListener;
        if (onInVoiceItemListener == null) {
            return;
        }
        onInVoiceItemListener.clickRechargePosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SelectInVoiceDialogFragment selectInVoiceDialogFragment, View view) {
        OnInVoiceItemListener onInVoiceItemListener = selectInVoiceDialogFragment.onItemListener;
        if (onInVoiceItemListener == null) {
            return;
        }
        onInVoiceItemListener.clickServiceNegation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SelectInVoiceDialogFragment selectInVoiceDialogFragment, View view) {
        selectInVoiceDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SelectInVoiceDialogFragment selectInVoiceDialogFragment, View view) {
        selectInVoiceDialogFragment.dismiss();
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
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wl_dialog_select_invoice, (ViewGroup) null);
        boolean z = requireArguments().getBoolean("isShowRechargeInvoice", false);
        if (requireArguments().getBoolean("isSZTBusCard", false)) {
            BusExtensionKt.setGone((TextView) viewInflate.findViewById(R.id.tv_service_invoice));
        } else {
            BusExtensionKt.setVisible((TextView) viewInflate.findViewById(R.id.tv_service_invoice));
        }
        if (z) {
            ((TextView) viewInflate.findViewById(R.id.tv_recharge_invoice)).setVisibility(0);
            ((TextView) viewInflate.findViewById(R.id.tv_service_invoice)).setBackground(ResourcesCompat.getDrawable(viewInflate.getResources(), R.drawable.btn_click_bg_round_bottom, null));
        } else {
            ((TextView) viewInflate.findViewById(R.id.tv_recharge_invoice)).setVisibility(8);
            ((TextView) viewInflate.findViewById(R.id.tv_service_invoice)).setBackground(ResourcesCompat.getDrawable(viewInflate.getResources(), R.drawable.btn_click_bg_round_dialog, null));
        }
        ((TextView) viewInflate.findViewById(R.id.tv_recharge_invoice)).setOnClickListener(new View.OnClickListener() { // from class: pm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceDialogFragment.g(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.tv_service_invoice)).setOnClickListener(new View.OnClickListener() { // from class: qm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceDialogFragment.h(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: om6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceDialogFragment.i(this.a, view);
            }
        });
        ((LinearLayout) viewInflate.findViewById(R.id.dlg_empty_area_btn_invoice)).setOnClickListener(new View.OnClickListener() { // from class: nm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceDialogFragment.j(this.a, view);
            }
        });
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
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void setOnInVoiceItemListener(@NotNull OnInVoiceItemListener onInVoiceItem) {
        this.onItemListener = onInVoiceItem;
    }
}
