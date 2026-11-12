package com.huami.feedback.domain;

import com.huami.account.service.AccountService;
import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.util.TextUtilKt;
import com.huami.feedback.util.Utils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/feedback/domain/ConvertUserContactUseCase;", "", "Lcom/huami/feedback/entity/Contact;", "a", "", "isNeedPhone", "invoke", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/AccountService;", "accountService", "Lcom/huami/feedback/domain/CheckChineseUserUseCase;", "b", "Lcom/huami/feedback/domain/CheckChineseUserUseCase;", "checkChineseUserUseCase", "<init>", "(Lcom/huami/account/service/AccountService;Lcom/huami/feedback/domain/CheckChineseUserUseCase;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ConvertUserContactUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CheckChineseUserUseCase checkChineseUserUseCase;

    public ConvertUserContactUseCase(@NotNull AccountService accountService, @NotNull CheckChineseUserUseCase checkChineseUserUseCase) {
        this.accountService = accountService;
        this.checkChineseUserUseCase = checkChineseUserUseCase;
    }

    private final Contact a() {
        return new Contact(this.checkChineseUserUseCase.invoke() ? ContactType.PHONE : ContactType.EMAIL, "");
    }

    @NotNull
    public final Contact invoke(boolean isNeedPhone) {
        String str = this.accountService.getCurrentProviderInfo().getCom.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity.KEY_CONTACT java.lang.String();
        if (isNeedPhone) {
            if (str == null || !TextUtilKt.isPhoneNumFormat(str)) {
                str = "";
            }
            return new Contact(ContactType.PHONE, str);
        }
        if (str == null || str.length() == 0) {
            return a();
        }
        if (Utils.isEmailFormat(str)) {
            return new Contact(ContactType.EMAIL, str);
        }
        if (TextUtilKt.isPhoneNumFormat(str) && this.checkChineseUserUseCase.invoke()) {
            return new Contact(ContactType.PHONE, str);
        }
        return (TextUtilKt.isWeChatIdFormat(str) && this.checkChineseUserUseCase.invoke()) ? new Contact(ContactType.WECHAT_ID, str) : a();
    }
}
