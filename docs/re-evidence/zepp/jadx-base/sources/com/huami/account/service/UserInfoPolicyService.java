package com.huami.account.service;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/huami/account/service/UserInfoPolicyService;", "", "", "interceptWithShowTip", "isNotAllowed", "hasChoiceData", "", "showTip", "service_release"}, k = 1, mv = {1, 5, 1})
public interface UserInfoPolicyService {
    boolean hasChoiceData();

    boolean interceptWithShowTip();

    boolean isNotAllowed();

    void showTip();
}
