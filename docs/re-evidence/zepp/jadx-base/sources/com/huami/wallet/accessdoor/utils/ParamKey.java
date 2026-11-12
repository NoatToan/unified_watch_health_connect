package com.huami.wallet.accessdoor.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/wallet/accessdoor/utils/ParamKey;", "", "", "ERROR_CODE", "Ljava/lang/String;", "ERROR_MSG", "DEVICE_SOURCE", "DOOR_DETAIL_OPERATION", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class ParamKey {

    @NotNull
    public static final String DEVICE_SOURCE = "DeviceSource";

    @NotNull
    public static final String DOOR_DETAIL_OPERATION = "Door_Detail_Operation";

    @NotNull
    public static final String ERROR_CODE = "ErrorCode";

    @NotNull
    public static final String ERROR_MSG = "ErrorMsg";

    @NotNull
    public static final ParamKey INSTANCE = new ParamKey();

    private ParamKey() {
    }
}
