package com.huami.account.service.model;

import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B'\b\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/account/service/model/AccountProviderInfo;", "", "", "a", "Ljava/lang/String;", "getThirdId", "()Ljava/lang/String;", "thirdId", "b", "getNickname", "nickname", "c", "getContact", ContactSettingItemActivity.KEY_CONTACT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/huami/account/service/model/PhoneInfo;", "Lcom/huami/account/service/model/EmailInfo;", "Lcom/huami/account/service/model/WeChatInfo;", "Lcom/huami/account/service/model/XiaomiInfo;", "Lcom/huami/account/service/model/GoogleInfo;", "Lcom/huami/account/service/model/FacebookInfo;", "Lcom/huami/account/service/model/LineInfo;", "Lcom/huami/account/service/model/UnknownInfo;", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class AccountProviderInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String thirdId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String nickname;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String contact;

    private AccountProviderInfo(String str, String str2, String str3) {
        this.thirdId = str;
        this.nickname = str2;
        this.contact = str3;
    }

    public /* synthetic */ AccountProviderInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getContact() {
        return this.contact;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getThirdId() {
        return this.thirdId;
    }
}
