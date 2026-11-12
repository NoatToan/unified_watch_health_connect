package com.huami.healthlabel.ui.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.databinding.HealthLabelInputBinding;
import com.huami.healthlabel.ui.custom.InputView;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J*\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/healthlabel/ui/custom/InputView;", "Landroid/widget/PopupWindow;", "", "g", "", "e", "i", "f", "c", "Landroid/view/View;", "parent", "", "gravity", "x", "y", "showAtLocation", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;", "b", "Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;", "callback", "Lcom/huami/healthlabel/databinding/HealthLabelInputBinding;", "Lcom/huami/healthlabel/databinding/HealthLabelInputBinding;", "binding", "Landroid/view/inputmethod/InputMethodManager;", GoogleApiAvailabilityLight.a, "Landroid/view/inputmethod/InputMethodManager;", "imm", "<init>", "(Landroid/content/Context;Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;)V", "InputResultCallback", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class InputView extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final InputResultCallback callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelInputBinding binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final InputMethodManager imm;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/ui/custom/InputView$InputResultCallback;", "", "", "text", "textColor", "", "onInputResult", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public interface InputResultCallback {
        void onInputResult(@NotNull String text, @NotNull String textColor);
    }

    public InputView(@NotNull Context context, @NotNull InputResultCallback inputResultCallback) {
        super(context);
        this.context = context;
        this.callback = inputResultCallback;
        HealthLabelInputBinding healthLabelInputBindingInflate = HealthLabelInputBinding.inflate(LayoutInflater.from(context));
        this.binding = healthLabelInputBindingInflate;
        Object systemService = context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.imm = (InputMethodManager) systemService;
        setFocusable(true);
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        setContentView(healthLabelInputBindingInflate.getRoot());
        g();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void c() {
        setTouchInterceptor(new View.OnTouchListener() { // from class: qf4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InputView.d(this.a, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InputView inputView, View view, MotionEvent motionEvent) {
        if (motionEvent.getY() >= inputView.binding.healthLabelItem.getY()) {
            return false;
        }
        inputView.f();
        return false;
    }

    private final String e() {
        return this.binding.healthLabelColorRg.getTargetColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.imm.hideSoftInputFromWindow(this.binding.healthLabelInputEdit.getWindowToken(), 0);
        dismiss();
    }

    private final void g() {
        this.binding.healthLabelLimitTipsTv.setText(this.context.getString(R.string.health_label_limit_length, 0));
        final KeyEditView keyEditView = this.binding.healthLabelInputEdit;
        keyEditView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: rf4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return InputView.h(keyEditView, this, textView, i, keyEvent);
            }
        });
        keyEditView.setOnEditListener(new KeyEditView.KeyPreImeListener() { // from class: com.huami.healthlabel.ui.custom.InputView$initView$1$2
            @Override // com.huami.healthlabel.ui.custom.KeyEditView.KeyPreImeListener
            public void onKeyPreIme(int keyCode) {
                if (keyCode == 4) {
                    this.a.f();
                }
            }
        });
        keyEditView.addTextChangedListener(new SampleTextWatcher() { // from class: com.huami.healthlabel.ui.custom.InputView$initView$1$3
            @Override // com.huami.healthlabel.ui.custom.SampleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                super.afterTextChanged(s);
                if (s != null && (StringsKt__StringsKt.endsWith$default((CharSequence) s, (CharSequence) " ", false, 2, (Object) null) || StringsKt__StringsKt.startsWith$default((CharSequence) s, (CharSequence) " ", false, 2, (Object) null))) {
                    keyEditView.setText(StringsKt__StringsKt.trim(s));
                    return;
                }
                TextView textView = this.binding.healthLabelLimitTipsTv;
                Context context = keyEditView.getContext();
                int i = R.string.health_label_limit_length;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(s == null ? 0 : s.length());
                textView.setText(context.getString(i, objArr));
                keyEditView.setSelection(s.length());
            }
        });
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(KeyEditView keyEditView, InputView inputView, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            if (UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
                if (String.valueOf(keyEditView.getText()).length() > 0) {
                    inputView.callback.onInputResult(String.valueOf(keyEditView.getText()), inputView.e());
                }
            } else {
                UtilsKt.toast(R.string.health_label_save_network_error);
            }
            inputView.f();
        }
        return false;
    }

    private final void i() {
        this.imm.toggleSoftInput(0, 2);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(@Nullable View parent, int gravity, int x, int y) {
        if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
            IconToast.showToast(UtilsKt.getGlobalContext(), R.drawable.ic_health_label_warning_toast, R.string.health_label_network_error_retry, 0);
            return;
        }
        super.showAtLocation(parent, gravity, x, y);
        KeyEditView keyEditView = this.binding.healthLabelInputEdit;
        keyEditView.setText("");
        keyEditView.clearFocus();
        keyEditView.requestFocus();
        i();
    }
}
