package com.huami.account.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.feedback.util.ConstantsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/account/bean/DeviceType;", "", "", DataTypeSource.MILI, LogUtil.I, ConstantsKt.UNKNOWN_DEVICE, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceType {

    @NotNull
    public static final DeviceType INSTANCE = new DeviceType();
    public static final int MILI = 0;
    public static final int VDEVICE = -1;

    private DeviceType() {
    }
}
