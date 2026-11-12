package com.huami.feedback.domain;

import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/feedback/domain/CheckChineseUserUseCase;", "", "", "invoke", "Lcom/huami/account/service/AccountService;", "a", "Lcom/huami/account/service/AccountService;", "accountService", "<init>", "(Lcom/huami/account/service/AccountService;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class CheckChineseUserUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    public CheckChineseUserUseCase(@NotNull AccountService accountService) {
        this.accountService = accountService;
    }

    public final boolean invoke() {
        return (AccountServiceExtKt.isCN(this.accountService) || (AccountServiceExtKt.isUnknown(this.accountService) && AccountServiceExtKt.isInChinaRegion(this.accountService))) && Language.isSimplifiedChinese();
    }
}
