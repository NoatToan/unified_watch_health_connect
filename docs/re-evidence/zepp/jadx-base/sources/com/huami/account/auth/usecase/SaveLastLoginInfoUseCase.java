package com.huami.account.auth.usecase;

import com.huami.account.auth.entity.LastLoginInfo;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/account/auth/usecase/SaveLastLoginInfoUseCase;", "", "", "provider", "username", "", "invoke", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "a", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "repository", "<init>", "(Lcom/huami/account/auth/repository/LastLoginInfoRepository;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SaveLastLoginInfoUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LastLoginInfoRepository repository;

    public SaveLastLoginInfoUseCase(@NotNull LastLoginInfoRepository lastLoginInfoRepository) {
        this.repository = lastLoginInfoRepository;
    }

    public final void invoke(@NotNull String provider, @Nullable String username) {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        this.repository.saveLoginInfo(LastLoginInfo.INSTANCE.build(provider, username, userInfo.getNickname(), userInfo.getAvatar()));
    }
}
