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
import android.widget.TextView;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment;
import com.huami.wallet.ui.widget.SystemBarTintSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0015J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "hasPadding", "hasBackground", "onStart", "Landroid/view/View;", "initView", "Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment$OnInVoiceTypeItemListener;", "onInVoiceItem", "setOnInVoiceTypeItemListener", "e", "Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment$OnInVoiceTypeItemListener;", "onItemTypeListener", "<init>", "()V", "Companion", "OnInVoiceTypeItemListener", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectInVoiceTypeDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnInVoiceTypeItemListener onItemTypeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment$Companion;", "", "Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment;", "newInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectInVoiceTypeDialogFragment newInstance() {
            SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragment = new SelectInVoiceTypeDialogFragment();
            selectInVoiceTypeDialogFragment.setArguments(new Bundle());
            return selectInVoiceTypeDialogFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/wallet/ui/dialog/SelectInVoiceTypeDialogFragment$OnInVoiceTypeItemListener;", "", "", "clickPerson", "clickCompany", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnInVoiceTypeItemListener {
        void clickCompany();

        void clickPerson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragment, View view) {
        selectInVoiceTypeDialogFragment.onItemTypeListener.clickPerson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragment, View view) {
        selectInVoiceTypeDialogFragment.onItemTypeListener.clickCompany();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragment, View view) {
        selectInVoiceTypeDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragment, View view) {
        selectInVoiceTypeDialogFragment.dismiss();
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wl_dialog_select_invoice_type, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_person)).setOnClickListener(new View.OnClickListener() { // from class: rm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceTypeDialogFragment.g(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.tv_company)).setOnClickListener(new View.OnClickListener() { // from class: um6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceTypeDialogFragment.h(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.tv_cancel_select)).setOnClickListener(new View.OnClickListener() { // from class: sm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceTypeDialogFragment.i(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: tm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectInVoiceTypeDialogFragment.j(this.a, view);
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

    public final void setOnInVoiceTypeItemListener(@NotNull OnInVoiceTypeItemListener onInVoiceItem) {
        this.onItemTypeListener = onInVoiceItem;
    }
}
