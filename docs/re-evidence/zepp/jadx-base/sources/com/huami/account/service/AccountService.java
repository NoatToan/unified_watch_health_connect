package com.huami.account.service;

import com.huami.account.service.model.AccountProviderInfo;
import com.huami.account.service.model.Area;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0002H'J\b\u0010\b\u001a\u00020\u0002H'J\b\u0010\n\u001a\u00020\tH'J\b\u0010\u000b\u001a\u00020\tH'J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/huami/account/service/AccountService;", "", "", "appTokenOrThrow", "userIdOrThrow", "", "getRegisterDate", "userRegionOrThrow", "userCountryCode", "Lcom/huami/account/service/model/Area;", "getUserArea", "getUserOrDeviceArea", "Lcom/huami/account/service/model/AccountProviderInfo;", "getCurrentProviderInfo", "", "isStartUpAgreementAgree", "service_release"}, k = 1, mv = {1, 5, 1})
public interface AccountService {
    @NotNull
    String appTokenOrThrow();

    @NotNull
    AccountProviderInfo getCurrentProviderInfo();

    long getRegisterDate();

    @Deprecated(message = "替换为 AreaService.getUserArea")
    @NotNull
    Area getUserArea();

    @Deprecated(message = "替换为 AreaService.getUserOrDeviceArea")
    @NotNull
    Area getUserOrDeviceArea();

    boolean isStartUpAgreementAgree();

    @Deprecated(message = "替换为 AreaService.userCountryCode")
    @NotNull
    String userCountryCode();

    @NotNull
    String userIdOrThrow();

    @Deprecated(message = "替换为 AreaService.userRegionOrThrow")
    @NotNull
    String userRegionOrThrow();
}
