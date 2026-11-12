package com.huami.pai.dto;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/huami/pai/dto/IHttpUserInfoManager;", "", "Lcom/huami/pai/dto/HttpUserInfo;", "getCurrentUserInfo", "userInfo", "", "setCurrentUserInfo", "", "addUserList", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IHttpUserInfoManager {
    void addUserList(@NotNull List<HttpUserInfo> userInfo);

    @Nullable
    HttpUserInfo getCurrentUserInfo();

    void setCurrentUserInfo(@Nullable HttpUserInfo userInfo);
}
