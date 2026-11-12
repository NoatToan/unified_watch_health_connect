package com.huami.watch.companion.esim.ui.dialog;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.esim.R;
import com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog;
import java.util.Objects;
import kotlin.Metadata;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/watch/companion/esim/ui/dialog/EnterPinCodeDialog;", "", "Landroid/view/View;", RootDescription.ROOT_ELEMENT, "", "e", "", "show", "i", "", GoogleApiAvailabilityLight.a, "dismissDialog", "Lcom/huami/watch/companion/esim/ui/dialog/EnterPinCodeDialog$SelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showSoftInputMethod", "hideSoftInputMethod", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/appcompat/app/AlertDialog;", "b", "Landroidx/appcompat/app/AlertDialog;", "innerDialog", "Landroid/widget/EditText;", "c", "Landroid/widget/EditText;", "inputEt", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "passwordStateIv", "Lcom/huami/watch/companion/esim/ui/dialog/EnterPinCodeDialog$SelectListener;", "<init>", "(Landroid/content/Context;)V", "SelectListener", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class EnterPinCodeDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AlertDialog innerDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private EditText inputEt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ImageView passwordStateIv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SelectListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/huami/watch/companion/esim/ui/dialog/EnterPinCodeDialog$SelectListener;", "", "", "input", "", "onConfirm", "onCancel", "esim_release"}, k = 1, mv = {1, 5, 1})
    public interface SelectListener {
        void onCancel();

        void onConfirm(@NotNull String input);
    }

    public EnterPinCodeDialog(@NotNull Context context) {
        this.context = context;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.InputPinDialogThem).create();
        View viewInflate = View.inflate(context, R.layout.dialog_input_pin, null);
        alertDialogCreate.setView(viewInflate, 0, 0, 0, 0);
        e(viewInflate);
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setSoftInputMode(2);
        }
        alertDialogCreate.setCanceledOnTouchOutside(false);
        this.innerDialog = alertDialogCreate;
    }

    private final String d() {
        Editable text;
        String string;
        EditText editText = this.inputEt;
        return (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    private final void e(View root) {
        this.inputEt = (EditText) root.findViewById(R.id.et_input);
        this.passwordStateIv = (ImageView) root.findViewById(R.id.iv_show_password);
        root.findViewById(R.id.dialog_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: zl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterPinCodeDialog.f(this.a, view);
            }
        });
        root.findViewById(R.id.dialog_btn_confirm).setOnClickListener(new View.OnClickListener() { // from class: am1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterPinCodeDialog.g(this.a, view);
            }
        });
        ImageView imageView = this.passwordStateIv;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: yl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnterPinCodeDialog.h(this.a, view);
                }
            });
        }
        i(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EnterPinCodeDialog enterPinCodeDialog, View view) {
        SelectListener selectListener = enterPinCodeDialog.listener;
        if (selectListener != null) {
            selectListener.onCancel();
        }
        enterPinCodeDialog.dismissDialog();
        enterPinCodeDialog.hideSoftInputMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EnterPinCodeDialog enterPinCodeDialog, View view) {
        String strD = enterPinCodeDialog.d();
        if (strD.length() == 0) {
            return;
        }
        SelectListener selectListener = enterPinCodeDialog.listener;
        if (selectListener != null) {
            selectListener.onConfirm(strD);
        }
        enterPinCodeDialog.dismissDialog();
        enterPinCodeDialog.hideSoftInputMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(EnterPinCodeDialog enterPinCodeDialog, View view) {
        EditText editText = enterPinCodeDialog.inputEt;
        boolean z = false;
        if (editText != null && editText.getInputType() == 144) {
            z = true;
        }
        enterPinCodeDialog.i(!z);
    }

    private final void i(boolean show) {
        EditText editText;
        if (show) {
            ImageView imageView = this.passwordStateIv;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_password_show);
            }
            EditText editText2 = this.inputEt;
            if (editText2 != null) {
                editText2.setInputType(144);
            }
        } else {
            ImageView imageView2 = this.passwordStateIv;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_password_hide);
            }
            EditText editText3 = this.inputEt;
            if (editText3 != null) {
                editText3.setInputType(129);
            }
        }
        EditText editText4 = this.inputEt;
        Editable text = editText4 == null ? null : editText4.getText();
        if (text == null || (editText = this.inputEt) == null) {
            return;
        }
        editText.setSelection(text.length());
    }

    public final void dismissDialog() {
        AlertDialog alertDialog = this.innerDialog;
        if (alertDialog == null) {
            return;
        }
        alertDialog.dismiss();
    }

    public final void hideSoftInputMethod() {
        Window window;
        View decorView;
        AlertDialog alertDialog = this.innerDialog;
        IBinder windowToken = null;
        if (alertDialog != null && (window = alertDialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            windowToken = decorView.getWindowToken();
        }
        if (windowToken != null) {
            Object systemService = this.context.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 2);
        }
    }

    public final void show(@NotNull SelectListener listener) {
        dismissDialog();
        EditText editText = this.inputEt;
        if (editText != null) {
            editText.setText("");
        }
        i(false);
        this.listener = listener;
        AlertDialog alertDialog = this.innerDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
        showSoftInputMethod();
    }

    public final void showSoftInputMethod() {
        Object systemService = this.context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.inputEt, 1);
    }
}
