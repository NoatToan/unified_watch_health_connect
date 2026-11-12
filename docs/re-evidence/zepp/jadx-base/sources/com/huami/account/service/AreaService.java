package com.huami.account.service;

import com.huami.account.service.model.Area;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/account/service/AreaService;", "", "", "userRegionOrThrow", "userCountryCode", "Lcom/huami/account/service/model/Area;", "getUserArea", "getUserOrDeviceArea", "service_release"}, k = 1, mv = {1, 5, 1})
public interface AreaService {
    @NotNull
    Area getUserArea();

    @NotNull
    Area getUserOrDeviceArea();

    @NotNull
    String userCountryCode();

    @NotNull
    String userRegionOrThrow();
}
