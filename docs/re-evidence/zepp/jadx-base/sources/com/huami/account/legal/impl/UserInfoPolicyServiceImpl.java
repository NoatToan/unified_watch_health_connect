package com.huami.account.legal.impl;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.account.legal.UserInfoPolicyPropertyRegistry;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.ui.legal.UserInfoUsageDialogHelper;
import com.huami.account.utils.TopActivityProvider;
import com.huami.account.utils.UserInfoUsageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/account/legal/impl/UserInfoPolicyServiceImpl;", "Lcom/huami/account/service/UserInfoPolicyService;", "", "interceptWithShowTip", "isNotAllowed", "hasChoiceData", "", "showTip", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoPolicyServiceImpl implements UserInfoPolicyService {
    @Override // com.huami.account.service.UserInfoPolicyService
    public boolean hasChoiceData() {
        return UserInfoPolicyPropertyRegistry.INSTANCE.isAllowUserInfoUsage().get() != null;
    }

    @Override // com.huami.account.service.UserInfoPolicyService
    public boolean interceptWithShowTip() {
        if (!isNotAllowed()) {
            return false;
        }
        showTip();
        return true;
    }

    @Override // com.huami.account.service.UserInfoPolicyService
    public boolean isNotAllowed() {
        if (UserInfoUsageUtil.userInfoPolicyPrecondition$accountui_release()) {
            return !Intrinsics.areEqual(UserInfoPolicyPropertyRegistry.INSTANCE.isAllowUserInfoUsage().get(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.huami.account.service.UserInfoPolicyService
    public void showTip() {
        Activity activeActivity = TopActivityProvider.INSTANCE.getActiveActivity();
        if (activeActivity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activeActivity;
            if (appCompatActivity.isDestroyed()) {
                return;
            }
            new UserInfoUsageDialogHelper(appCompatActivity).show();
        }
    }
}
