package com.huami.watchfacesstore.view;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.base.BaseDialogFragment;
import com.huami.watchfacesstore.view.TipDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0015J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/watchfacesstore/view/TipDialog;", "Lcom/huami/watchfacesstore/ui/base/BaseDialogFragment;", "Lkotlin/Function1;", "Landroid/view/View;", "", TransportUri.ACTION_BLOCK, "onConfirm", "initView", "onStart", "", "resId", "setMsg", "", "isSingle", "setSingleButton", "hasPadding", "hasBackground", "e", LogUtil.I, "message", "f", "Z", "isSingleMode", "g", "Lkotlin/jvm/functions/Function1;", "confirm", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TipDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int message = R.string.wf_sync_storage_full;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isSingleMode = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function1<? super View, Unit> confirm;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(TipDialog tipDialog, View view) {
        tipDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(TipDialog tipDialog, View view) {
        tipDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(TipDialog tipDialog, View view) {
        Function1<? super View, Unit> function1 = tipDialog.confirm;
        if (function1 == null) {
            return;
        }
        function1.invoke(view);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wf_dialog_tips, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_msg);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_ensure);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_bottom_area);
        textView.setText(this.message);
        if (this.isSingleMode) {
            ExtensionsKt.visible(textView2);
            ExtensionsKt.gone(linearLayout);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ap7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TipDialog.r(this.a, view);
                }
            });
        } else {
            ExtensionsKt.gone(textView2);
            ExtensionsKt.visible(linearLayout);
            ((TextView) linearLayout.findViewById(R.id.dialog_cancel)).setOnClickListener(new View.OnClickListener() { // from class: zo7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TipDialog.s(this.a, view);
                }
            });
            ((TextView) linearLayout.findViewById(R.id.dialog_confirm)).setOnClickListener(new View.OnClickListener() { // from class: yo7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TipDialog.t(this.a, view);
                }
            });
        }
        return viewInflate;
    }

    public final void onConfirm(@Nullable Function1<? super View, Unit> block) {
        this.confirm = block;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setCancelable(false);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = ExtensionsKt.getDp(295);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @NotNull
    public final TipDialog setMsg(@StringRes int resId) {
        this.message = resId;
        return this;
    }

    @NotNull
    public final TipDialog setSingleButton(boolean isSingle) {
        this.isSingleMode = isSingle;
        return this;
    }
}
