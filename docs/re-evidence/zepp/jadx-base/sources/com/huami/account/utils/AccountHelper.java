package com.huami.account.utils;

import com.huami.account.AccountExternalContainer;
import com.huami.account.service.AccountService;
import com.huami.account.service.model.AccountProviderInfo;
import com.huami.account.service.model.EmailInfo;
import com.huami.account.service.model.FacebookInfo;
import com.huami.account.service.model.GoogleInfo;
import com.huami.account.service.model.LineInfo;
import com.huami.account.service.model.PhoneInfo;
import com.huami.account.service.model.UnknownInfo;
import com.huami.account.service.model.WeChatInfo;
import com.huami.account.service.model.XiaomiInfo;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/account/utils/AccountHelper;", "", "", "getCurrentAccountDesc", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountHelper {

    @NotNull
    public static final AccountHelper INSTANCE = new AccountHelper();

    private AccountHelper() {
    }

    @Nullable
    public final String getCurrentAccountDesc() {
        String string;
        String nickname = null;
        AccountProviderInfo currentProviderInfo = ((AccountService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null)).getCurrentProviderInfo();
        boolean z = currentProviderInfo instanceof PhoneInfo;
        if (z) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_phone);
        } else if (currentProviderInfo instanceof EmailInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_huami_email);
        } else if (currentProviderInfo instanceof WeChatInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_wechat);
        } else if (currentProviderInfo instanceof XiaomiInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_mi);
        } else if (currentProviderInfo instanceof GoogleInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_google);
        } else if (currentProviderInfo instanceof FacebookInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_facebook);
        } else if (currentProviderInfo instanceof LineInfo) {
            string = AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_login_line);
        } else {
            if (!Intrinsics.areEqual(currentProviderInfo, UnknownInfo.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            string = null;
        }
        String string2 = string != null ? AccountExternalContainer.INSTANCE.getAppContext().getString(R.string.account_ui_account_current_login_info, string) : null;
        if (z ? true : currentProviderInfo instanceof EmailInfo) {
            nickname = currentProviderInfo.getCom.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity.KEY_CONTACT java.lang.String();
        } else {
            if (currentProviderInfo instanceof WeChatInfo ? true : currentProviderInfo instanceof XiaomiInfo ? true : currentProviderInfo instanceof GoogleInfo ? true : currentProviderInfo instanceof FacebookInfo ? true : currentProviderInfo instanceof LineInfo) {
                nickname = currentProviderInfo.getNickname();
            } else if (!Intrinsics.areEqual(currentProviderInfo, UnknownInfo.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (nickname == null || nickname.length() == 0) {
            return string2;
        }
        return string2 + "\n[" + nickname + "]";
    }
}
