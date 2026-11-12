package com.xiaomi.fitness.account.manager;

import com.mibi.sdk.common.CommonConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "", "<init>", "()V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", CommonConstants.KEY_USER_NAME, "getUserName", "setUserName", "nickName", "getNickName", "setNickName", "avatarAddress", "getAvatarAddress", "setAvatarAddress", "locale", "getLocale", "setLocale", "region", "getRegion", "setRegion", "emailAddress", "getEmailAddress", "setEmailAddress", "safePhone", "getSafePhone", "setSafePhone", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountCoreInfo {

    @Nullable
    private String avatarAddress;

    @Nullable
    private String emailAddress;

    @Nullable
    private String locale;

    @Nullable
    private String nickName;

    @Nullable
    private String region;

    @Nullable
    private String safePhone;

    @Nullable
    private String userId;

    @Nullable
    private String userName;

    @Nullable
    public final String getAvatarAddress() {
        return this.avatarAddress;
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getSafePhone() {
        return this.safePhone;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setAvatarAddress(@Nullable String str) {
        this.avatarAddress = str;
    }

    public final void setEmailAddress(@Nullable String str) {
        this.emailAddress = str;
    }

    public final void setLocale(@Nullable String str) {
        this.locale = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setSafePhone(@Nullable String str) {
        this.safePhone = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }
}
