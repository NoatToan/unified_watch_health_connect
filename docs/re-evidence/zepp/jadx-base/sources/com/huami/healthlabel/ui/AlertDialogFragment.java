package com.huami.healthlabel.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.AlertDialogFragment;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/healthlabel/ui/AlertDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "show", "Lcom/huami/healthlabel/ui/AlertDialogFragment$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "a", "Ljava/lang/String;", "labelText", "b", "labelTime", "c", "Lcom/huami/healthlabel/ui/AlertDialogFragment$OnClickListener;", "mListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "OnClickListener", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class AlertDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String labelText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String labelTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnClickListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/healthlabel/ui/AlertDialogFragment$OnClickListener;", "", "", "onNegativeButtonClick", "onPositiveButtonClick", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public interface OnClickListener {
        void onNegativeButtonClick();

        void onPositiveButtonClick();
    }

    public AlertDialogFragment(@NotNull String str, @NotNull String str2) {
        this.labelText = str;
        this.labelTime = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AlertDialogFragment alertDialogFragment, View view) {
        OnClickListener onClickListener = alertDialogFragment.mListener;
        if (onClickListener != null) {
            onClickListener.onNegativeButtonClick();
        }
        alertDialogFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AlertDialogFragment alertDialogFragment, View view) {
        OnClickListener onClickListener = alertDialogFragment.mListener;
        if (onClickListener != null) {
            onClickListener.onPositiveButtonClick();
        }
        alertDialogFragment.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.health_label_dialog_confirm, (ViewGroup) null, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        ((AppCompatTextView) viewInflate.findViewById(R.id.dialog_cancel)).setOnClickListener(new View.OnClickListener() { // from class: sb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragment.c(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dialog_ok).setOnClickListener(new View.OnClickListener() { // from class: tb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragment.d(this.a, view);
            }
        });
        ((AppCompatTextView) viewInflate.findViewById(R.id.dialog_content)).setText(getString(R.string.health_label_delete, this.labelText, this.labelTime));
        builder.setView(viewInflate);
        return builder.show();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (getContext() != null && attributes != null) {
            attributes.width = NumberExtKt.dp(300.0f);
        }
        Dialog dialog2 = getDialog();
        Window window3 = dialog2 != null ? dialog2.getWindow() : null;
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window2 = dialog3.getWindow()) == null) {
            return;
        }
        window2.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void setListener(@NotNull OnClickListener listener) {
        this.mListener = listener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            super.show(manager, tag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
