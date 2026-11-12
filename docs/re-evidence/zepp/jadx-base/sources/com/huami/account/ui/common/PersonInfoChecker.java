package com.huami.account.ui.common;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.account.keeper.AnonymousKeeper;
import com.huami.account.service.AccountComponent;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.account.service.UserInfoService;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.ui.R;
import com.huami.account.ui.common.PersonInfoChecker;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/account/ui/common/PersonInfoChecker;", "Lcom/huami/account/service/AccountComponent;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "check", "Landroid/app/Activity;", "c", "showDialog", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoChecker implements AccountComponent {

    @NotNull
    public static final PersonInfoChecker INSTANCE = new PersonInfoChecker();

    private PersonInfoChecker() {
    }

    private final void c(Activity activity) {
        getUserInfoService().navigateToPersonInfo(activity, null);
    }

    @JvmStatic
    public static final void check(@NotNull AppCompatActivity activity) {
        List<String> defaultFields = HMPersonInfo.getInstance().getUserInfo().getDefaultFields();
        if (defaultFields == null || defaultFields.isEmpty()) {
            return;
        }
        PersonInfoChecker personInfoChecker = INSTANCE;
        String strUserId = AccountServiceExtKt.userId(personInfoChecker.getAccountService());
        if (strUserId == null || AnonymousKeeper.hasPromptCompleteUserInfo(strUserId)) {
            return;
        }
        personInfoChecker.showDialog(activity);
        AnonymousKeeper.setHasPromptCompleteUserInfo(strUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        INSTANCE.c(appCompatActivity);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountLifecycle getAccountLifecycle() {
        return AccountComponent.DefaultImpls.getAccountLifecycle(this);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountService getAccountService() {
        return AccountComponent.DefaultImpls.getAccountService(this);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public UserInfoService getUserInfoService() {
        return AccountComponent.DefaultImpls.getUserInfoService(this);
    }

    public final void showDialog(@NotNull final AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.account_ui_complete_person_info_title).setParagraph(R.string.account_ui_complete_person_info_content).themed().setNegativeButton(R.string.account_ui_close, new DialogInterface.OnClickListener() { // from class: ft5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PersonInfoChecker.d(dialogInterface, i);
            }
        }).setPositiveButton(R.string.account_ui_update_userinfo_positive, new DialogInterface.OnClickListener() { // from class: et5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PersonInfoChecker.e(activity, dialogInterface, i);
            }
        }).show(activity.getSupportFragmentManager()).setGravity(17);
    }
}
