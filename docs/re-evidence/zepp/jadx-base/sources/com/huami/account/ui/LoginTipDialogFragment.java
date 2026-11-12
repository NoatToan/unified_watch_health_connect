package com.huami.account.ui;

import android.content.DialogInterface;
import android.view.View;
import com.huami.account.ui.LoginTipDialogFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/LoginTipDialogFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", "initView", "", "onDestroy", "", "hasPadding", "hasBackground", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "e", "Lkotlin/jvm/functions/Function1;", "getOnLoginClick", "()Lkotlin/jvm/functions/Function1;", "setOnLoginClick", "(Lkotlin/jvm/functions/Function1;)V", "onLoginClick", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginTipDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super DialogInterface, Unit> onLoginClick;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LoginTipDialogFragment loginTipDialogFragment, View view) {
        loginTipDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(LoginTipDialogFragment loginTipDialogFragment, View view) {
        loginTipDialogFragment.dismiss();
        Function1<DialogInterface, Unit> onLoginClick = loginTipDialogFragment.getOnLoginClick();
        if (onLoginClick == null) {
            return;
        }
        onLoginClick.invoke(loginTipDialogFragment.requireDialog());
    }

    @Nullable
    public final Function1<DialogInterface, Unit> getOnLoginClick() {
        return this.onLoginClick;
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
        View viewInflate = View.inflate(requireContext(), R.layout.account_ui_activity_login_tip, null);
        viewInflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: os4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginTipDialogFragment.e(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.btn_login_or_register).setOnClickListener(new View.OnClickListener() { // from class: ps4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginTipDialogFragment.f(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.onLoginClick = null;
    }

    public final void setOnLoginClick(@Nullable Function1<? super DialogInterface, Unit> function1) {
        this.onLoginClick = function1;
    }
}
