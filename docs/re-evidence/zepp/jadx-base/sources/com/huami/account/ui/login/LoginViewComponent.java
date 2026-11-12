package com.huami.account.ui.login;

import androidx.fragment.app.FragmentActivity;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/huami/account/ui/login/LoginViewComponent;", "", "Landroidx/fragment/app/FragmentActivity;", "provideViewHost", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "provideDialogContainer", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "provideViewModelContract", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface LoginViewComponent {
    @NotNull
    LoadingDialogContainer provideDialogContainer();

    @NotNull
    FragmentActivity provideViewHost();

    @NotNull
    LoginViewModelContract provideViewModelContract();
}
