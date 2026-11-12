package com.huami.account.utils;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.StringRes;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.account.ui.R;
import com.huami.account.utils.UtilsKt;
import com.huami.passport.entity.Message;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u000e\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0007H\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00020\u0010\"\u00020\u0011\u001a\f\u0010\u0016\u001a\u00020\u0013*\u00020\u0015H\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u0013*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c\u001a\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eH\u0000\u001a\u000e\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"\u001a#\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010%*\u00020\u000e*\u00020&2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010)\"\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u001a\u00102\u001a\u00020\u0002*\u0002018@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"", "value", "", "isPhoneNumFormat", "validPassword", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "maskPhone", "Lcom/huami/passport/entity/Message;", "", "toSmsLimitPrompt", "str", "isEmailFormat", SOAP.XMLNS, "checkNull", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "", "delayEnable", "", "conflictClick", "Landroid/app/Activity;", "hideKeyboard", "Landroid/widget/EditText;", "editText", "showKeyboard", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "editor", "clearButton", "setupEditorClearBtn", "Ljava/lang/Runnable;", "runnable", "ioAction", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "viewId", "findViewById", "(Landroidx/fragment/app/Fragment;I)Landroid/view/View;", "Ljava/util/regex/Pattern;", "a", "Ljava/util/regex/Pattern;", "EMAIL_ADDRESS", "b", "J", "SHOW_KEYBOARD_DELAY_MILLIS", "Landroidx/lifecycle/LifecycleOwner;", "isAlive", "(Landroidx/lifecycle/LifecycleOwner;)Z", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {

    @NotNull
    private static final Pattern a = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    private static final long b = 200;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.utils.UtilsKt$ioAction$1", f = "Utils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.run();
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final String checkNull(@Nullable String str) {
        return (str == null || Intrinsics.areEqual(str, "null")) ? "" : str;
    }

    public static final void conflictClick(@NotNull View view, @NotNull long... jArr) {
        view.setEnabled(false);
        long j = (jArr.length == 0) ^ true ? jArr[0] : 1000L;
        final WeakReference weakReference = new WeakReference(view);
        view.postDelayed(new Runnable() { // from class: q88
            @Override // java.lang.Runnable
            public final void run() {
                UtilsKt.d(weakReference);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WeakReference weakReference) {
        View view = (View) weakReference.get();
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public static final float dp2px(@NotNull Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(EditText editText, View view) {
        editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditText editText, View view, View view2, boolean z) {
        g(view, editText.length(), z);
    }

    @NotNull
    public static final <T extends View> T findViewById(@NotNull Fragment fragment, int i) {
        return (T) fragment.requireView().findViewById(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view, int i, boolean z) {
        view.setVisibility(i > 0 && z ? 0 : 8);
    }

    public static final void hideKeyboard(@NotNull Activity activity) {
        Object systemService = activity.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }

    public static final void ioAction(@NotNull Runnable runnable) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(runnable, null), 2, null);
    }

    public static final boolean isAlive(@NotNull LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }

    public static final boolean isEmailFormat(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return a.matcher(str).matches();
    }

    public static final boolean isPhoneNumFormat(@NotNull String str) {
        return Pattern.compile("^[1]([3-9])[0-9]{9}$").matcher(str).matches();
    }

    @NotNull
    public static final String maskPhone(@NotNull String str) {
        if ((str.length() == 0) || str.length() <= 3) {
            return str;
        }
        int length = str.length() >= 7 ? 4 : str.length() - 3;
        String strSubstring = (str.length() - 3) - length <= 0 ? "" : StringsKt__StringsKt.substring(str, new IntRange(length + 3, str.length() - 1));
        return StringsKt__StringsKt.substring(str, new IntRange(0, 2)) + m.repeat("*", length) + strSubstring;
    }

    public static final void setupEditorClearBtn(@NotNull final EditText editText, @NotNull final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: o88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UtilsKt.e(editText, view2);
            }
        });
        g(view, editText.length(), editText.isFocused());
        editText.addTextChangedListener(new TextWatcher() { // from class: com.huami.account.utils.UtilsKt$setupEditorClearBtn$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                UtilsKt.g(view, s == null ? 0 : s.length(), editText.isFocused());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: p88
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                UtilsKt.f(editText, view, view2, z);
            }
        });
    }

    public static final void showKeyboard(@NotNull Activity activity, @NotNull final EditText editText) {
        Object systemService = activity.getSystemService("input_method");
        final InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: com.huami.account.utils.UtilsKt$showKeyboard$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                InputMethodManager inputMethodManager2 = inputMethodManager;
                if (inputMethodManager2 == null) {
                    return;
                }
                inputMethodManager2.showSoftInput(editText, 2);
            }
        }, 200L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @StringRes
    public static final int toSmsLimitPrompt(@Nullable Message message) {
        String strValueOf = String.valueOf(message == null ? null : Integer.valueOf(message.getCode()));
        switch (strValueOf.hashCode()) {
            case 1569:
                if (strValueOf.equals("12")) {
                    return R.string.account_ui_phone_request_reset_pwd_code_too_fre;
                }
                break;
            case 1570:
                if (strValueOf.equals("13")) {
                    return R.string.account_ui_account_send_verify_code_one_hour_later;
                }
                break;
            case 1571:
                if (strValueOf.equals("14")) {
                    return R.string.account_ui_account_send_verify_code_tomorrow;
                }
                break;
        }
        return R.string.account_ui_phone_request_reset_pwd_code_too_fre;
    }

    public static final boolean validPassword(@NotNull String str) {
        return Pattern.compile("^(?=.*?[0-9])(?=.*?[a-zA-Z])[0-9a-zA-Z`~!@#$%^&*()\\\\\\-=_+\\[\\]{}|;':\",./<>?]{8,}$").matcher(str).matches();
    }
}
