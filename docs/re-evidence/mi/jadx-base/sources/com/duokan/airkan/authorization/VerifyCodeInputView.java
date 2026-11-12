package com.duokan.airkan.authorization;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import com.duokan.airkan.authorization.VerifyCodeInputView;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.alb;
import defpackage.bki;
import defpackage.jpe;
import defpackage.ni4;
import defpackage.voi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import miuix.view.HapticCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002-.B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020#J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u0006\u0010)\u001a\u00020#J\u0010\u0010*\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020,R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u00020\u0007*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/duokan/airkan/authorization/VerifyCodeInputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cursorVisible", "", "editTextBackground", "editTextColor", "inputNumber", "onCodeChangeListener", "Lcom/duokan/airkan/authorization/VerifyCodeInputView$OnCodeChangeListener;", "getOnCodeChangeListener", "()Lcom/duokan/airkan/authorization/VerifyCodeInputView$OnCodeChangeListener;", "setOnCodeChangeListener", "(Lcom/duokan/airkan/authorization/VerifyCodeInputView$OnCodeChangeListener;)V", "onContentListener", "Landroid/view/View$OnClickListener;", "getOnContentListener", "()Landroid/view/View$OnClickListener;", "setOnContentListener", "(Landroid/view/View$OnClickListener;)V", "verifyCodeContent", "", "getVerifyCodeContent", "()Ljava/lang/String;", "dp", "", "getDp", "(Ljava/lang/Number;)I", "backFocus", "", "cleanInput", "createEditText", "Landroid/widget/EditText;", "index", "nextFocus", "setRetryInputEditBackground", "showIme", "delayMillis", "", "AlphaNumericInputFilter", "OnCodeChangeListener", "rc_sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VerifyCodeInputView extends LinearLayout {
    private boolean cursorVisible;
    private int editTextBackground;
    private int editTextColor;
    private int inputNumber;

    @Nullable
    private OnCodeChangeListener onCodeChangeListener;

    @Nullable
    private View.OnClickListener onContentListener;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/duokan/airkan/authorization/VerifyCodeInputView$AlphaNumericInputFilter;", "Landroid/text/InputFilter;", "()V", "regex", "Lkotlin/text/Regex;", "filter", "", "source", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "dest", "Landroid/text/Spanned;", "dstart", "dend", "rc_sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AlphaNumericInputFilter implements InputFilter {

        @NotNull
        private final Regex regex = new Regex("[^a-zA-Z0-9]");

        @Override // android.text.InputFilter
        @Nullable
        public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
            String strValueOf = String.valueOf(source);
            String strReplace = this.regex.replace(strValueOf, "");
            if (Intrinsics.areEqual(strValueOf, strReplace)) {
                return null;
            }
            return strReplace;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/duokan/airkan/authorization/VerifyCodeInputView$OnCodeChangeListener;", "", "onComplete", "", "view", "Landroid/view/View;", MiuiCursorConstants.CONTENT, "", "onContentChange", "rc_sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnCodeChangeListener {
        void onComplete(@NotNull View view, @NotNull String content);

        void onContentChange(@NotNull View view, @NotNull String content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerifyCodeInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m119_init_$lambda0(VerifyCodeInputView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.onContentListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backFocus() {
        jpe.h("AuthDialog", "backFocus");
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        while (true) {
            int i = childCount - 1;
            EditText editText = (EditText) ViewGroupKt.get(this, childCount);
            Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "editText.text");
            if (text.length() > 0) {
                if (childCount == getChildCount() - 1) {
                    return;
                }
                editText.setText("");
                editText.setCursorVisible(this.cursorVisible);
                editText.requestFocus();
                return;
            }
            if (i < 0) {
                return;
            } else {
                childCount = i;
            }
        }
    }

    private final EditText createEditText(int index) {
        final EditText editText = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getDp(0), getDp(56));
        layoutParams.gravity = 1;
        layoutParams.weight = 1.0f;
        Double dValueOf = Double.valueOf(5.5d);
        int dp = getDp(dValueOf);
        int dp2 = getDp(dValueOf);
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        layoutParams.setMarginStart(dp);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        layoutParams.setMarginEnd(dp2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
        editText.setLayoutParams(layoutParams);
        editText.setId(index);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextAlignment(4);
        editText.setGravity(17);
        editText.setMaxEms(1);
        editText.setMaxLines(1);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1), new AlphaNumericInputFilter()});
        editText.setInputType(2);
        editText.setImeOptions(1);
        editText.setCursorVisible(this.cursorVisible);
        editText.setSingleLine(true);
        editText.setTextSize(2, 20.0f);
        editText.setTextColor(ni4.c(editText.getContext(), this.editTextColor));
        editText.setTypeface(null, 1);
        editText.setBackgroundResource(this.editTextBackground);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: noq
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return VerifyCodeInputView.m120createEditText$lambda10$lambda3(textView, i3, keyEvent);
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.duokan.airkan.authorization.VerifyCodeInputView$createEditText$1$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                jpe.h("AuthDialog", Intrinsics.stringPlus("afterTextChanged ", s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
                jpe.h("AuthDialog", Intrinsics.stringPlus("beforeTextChanged ", s));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
                jpe.h("AuthDialog", Intrinsics.stringPlus("onTextChanged ", s));
            }
        });
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: ooq
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                return VerifyCodeInputView.m121createEditText$lambda10$lambda4(this.f29347a, view, i3, keyEvent);
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: poq
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                VerifyCodeInputView.m122createEditText$lambda10$lambda5(this.f30592a, view, z);
            }
        });
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: qoq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VerifyCodeInputView.m123createEditText$lambda10$lambda6(this.f31702a, view, motionEvent);
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.duokan.airkan.authorization.VerifyCodeInputView$createEditText$lambda-10$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                if (s == null) {
                    return;
                }
                if (s.length() > 0) {
                    if (StringsKt__StringsJVMKt.contentEquals(s, " ")) {
                        editText.setText("");
                    } else if (StringsKt__StringsKt.isBlank(s)) {
                        this.backFocus();
                    } else {
                        jpe.h("AuthDialog", Intrinsics.stringPlus("nextFocus + ", s));
                        this.nextFocus();
                    }
                }
                VerifyCodeInputView.OnCodeChangeListener onCodeChangeListener = this.getOnCodeChangeListener();
                if (onCodeChangeListener == null) {
                    return;
                }
                onCodeChangeListener.onContentChange(editText, this.getVerifyCodeContent());
                VerifyCodeInputView verifyCodeInputView = this;
                Editable text = ((EditText) ViewGroupKt.get(verifyCodeInputView, verifyCodeInputView.inputNumber - 1)).getText();
                Intrinsics.checkNotNullExpressionValue(text, "this@VerifyCodeInputView…er - 1] as EditText).text");
                if (text.length() > 0) {
                    onCodeChangeListener.onComplete(editText, this.getVerifyCodeContent());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        return editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createEditText$lambda-10$lambda-3, reason: not valid java name */
    public static final boolean m120createEditText$lambda10$lambda3(TextView textView, int i, KeyEvent keyEvent) {
        jpe.h("AuthDialog", "setOnEditorActionListener " + i + "  " + keyEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createEditText$lambda-10$lambda-4, reason: not valid java name */
    public static final boolean m121createEditText$lambda10$lambda4(VerifyCodeInputView this$0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jpe.h("AuthDialog", "setOnKeyListener " + i + "  " + keyEvent);
        if (i == 67 && keyEvent != null && keyEvent.getAction() == 0) {
            this$0.backFocus();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("  ");
        sb.append(keyEvent == null ? null : Integer.valueOf(keyEvent.getAction()));
        jpe.h("AuthDialog", sb.toString());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createEditText$lambda-10$lambda-5, reason: not valid java name */
    public static final void m122createEditText$lambda10$lambda5(VerifyCodeInputView this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.nextFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createEditText$lambda-10$lambda-6, reason: not valid java name */
    public static final boolean m123createEditText$lambda10$lambda6(VerifyCodeInputView this$0, View view, MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jpe.h("AuthDialog", Intrinsics.stringPlus("setOnTouchListener ", motionEvent));
        if (motionEvent.getActionMasked() == 1 && (onClickListener = this$0.onContentListener) != null) {
            onClickListener.onClick(view);
        }
        return true;
    }

    private final int getDp(Number number) {
        return (int) TypedValue.applyDimension(1, number.floatValue(), getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getVerifyCodeContent() {
        StringBuilder sb = new StringBuilder();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            sb.append((CharSequence) ((EditText) childAt).getText());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply { …ext).text) } }.toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextFocus() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            EditText editText = (EditText) childAt;
            Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "editText.text");
            if (text.length() == 0) {
                editText.setCursorVisible(this.cursorVisible);
                editText.requestFocus();
                return;
            } else {
                editText.setCursorVisible(false);
                if (i == getChildCount() - 1) {
                    editText.requestFocus();
                }
            }
        }
    }

    public static /* synthetic */ void showIme$default(VerifyCodeInputView verifyCodeInputView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        verifyCodeInputView.showIme(j);
    }

    public final void cleanInput() {
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        while (true) {
            int i = childCount - 1;
            EditText editText = (EditText) ViewGroupKt.get(this, childCount);
            editText.setText("");
            if (childCount == 0) {
                editText.setCursorVisible(this.cursorVisible);
                editText.requestFocus();
            }
            if (i < 0) {
                return;
            } else {
                childCount = i;
            }
        }
    }

    @Nullable
    public final OnCodeChangeListener getOnCodeChangeListener() {
        return this.onCodeChangeListener;
    }

    @Nullable
    public final View.OnClickListener getOnContentListener() {
        return this.onContentListener;
    }

    public final void setOnCodeChangeListener(@Nullable OnCodeChangeListener onCodeChangeListener) {
        this.onCodeChangeListener = onCodeChangeListener;
    }

    public final void setOnContentListener(@Nullable View.OnClickListener onClickListener) {
        this.onContentListener = onClickListener;
    }

    public final void setRetryInputEditBackground() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            int i2 = voi.f37090b;
            this.editTextBackground = i2;
            EditText editText = (EditText) childAt;
            editText.setBackgroundResource(i2);
            editText.invalidate();
        }
    }

    public final void showIme(long delayMillis) {
        if (Build.VERSION.SDK_INT >= 30) {
            final View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                return;
            }
            viewFindFocus.postDelayed(new Runnable() { // from class: com.duokan.airkan.authorization.VerifyCodeInputView$showIme$lambda-16$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    WindowInsets rootWindowInsets = viewFindFocus.getRootWindowInsets();
                    if (rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.m.c())) {
                        return;
                    }
                    HapticCompat.performHapticFeedbackAsync(viewFindFocus, alb.z, alb.g);
                    WindowInsetsController windowInsetsController = viewFindFocus.getWindowInsetsController();
                    if (windowInsetsController == null) {
                        return;
                    }
                    windowInsetsController.show(WindowInsetsCompat.m.c());
                }
            }, delayMillis);
            return;
        }
        final View viewFindFocus2 = findFocus();
        if (viewFindFocus2 == null) {
            return;
        }
        viewFindFocus2.postDelayed(new Runnable() { // from class: com.duokan.airkan.authorization.VerifyCodeInputView$showIme$lambda-18$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                Object systemService = viewFindFocus2.getContext().getApplicationContext().getSystemService("input_method");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                ((InputMethodManager) systemService).showSoftInput(viewFindFocus2, 0);
            }
        }, delayMillis);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerifyCodeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VerifyCodeInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerifyCodeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.inputNumber = 6;
        this.editTextColor = bki.f4317a;
        this.editTextBackground = voi.f37089a;
        for (int i2 = 0; i2 < 6; i2++) {
            addView(createEditText(i2));
        }
        setGravity(17);
        nextFocus();
        setOnClickListener(new View.OnClickListener() { // from class: roq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyCodeInputView.m119_init_$lambda0(this.f32760a, view);
            }
        });
        if (c.T(this)) {
            showIme(150L);
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.duokan.airkan.authorization.VerifyCodeInputView$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    this.removeOnAttachStateChangeListener(this);
                    this.showIme(150L);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }
            });
        }
    }
}
