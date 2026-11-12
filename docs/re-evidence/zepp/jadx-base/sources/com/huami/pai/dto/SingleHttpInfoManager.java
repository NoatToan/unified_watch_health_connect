package com.huami.pai.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/huami/pai/dto/SingleHttpInfoManager;", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "Lcom/huami/pai/dto/HttpUserInfo;", "getCurrentUserInfo", "userInfo", "", "setCurrentUserInfo", "", "userInfos", "addUserList", "a", "Lcom/huami/pai/dto/HttpUserInfo;", "getUserInfo", "()Lcom/huami/pai/dto/HttpUserInfo;", "setUserInfo", "(Lcom/huami/pai/dto/HttpUserInfo;)V", "<init>", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SingleHttpInfoManager implements IHttpUserInfoManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HttpUserInfo userInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleHttpInfoManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SingleHttpInfoManager(@Nullable HttpUserInfo httpUserInfo) {
        this.userInfo = httpUserInfo;
    }

    @Override // com.huami.pai.dto.IHttpUserInfoManager
    public void addUserList(@NotNull List<HttpUserInfo> userInfos) {
        if (userInfos.isEmpty()) {
            return;
        }
        setCurrentUserInfo(userInfos.get(0));
    }

    @Override // com.huami.pai.dto.IHttpUserInfoManager
    @Nullable
    /* JADX INFO: renamed from: getCurrentUserInfo, reason: from getter */
    public HttpUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    public final HttpUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Override // com.huami.pai.dto.IHttpUserInfoManager
    public void setCurrentUserInfo(@Nullable HttpUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public final void setUserInfo(@Nullable HttpUserInfo httpUserInfo) {
        this.userInfo = httpUserInfo;
    }

    public /* synthetic */ SingleHttpInfoManager(HttpUserInfo httpUserInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : httpUserInfo);
    }
}
