package com.huami.device.event.br;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huami/device/event/br/DeviceLifeConst;", "", "", ShareConstants.ACTION, "Ljava/lang/String;", "ACTION_LIFE_EVENT_KEY", "", "STATUS_ON_BIND", LogUtil.I, "STATUS_ON_UNBIND", "STATUS_ON_CONNECTING", "STATUS_ON_CONNECTED", "STATUS_ON_DISCONNECTED", "STATUS_ON_ENABLE", "STATUS_ON_DISABLE", "<init>", "()V", "devicelifeevent_release"}, k = 1, mv = {1, 4, 0})
public final class DeviceLifeConst {

    @NotNull
    public static final String ACTION = "com.huami.device.life.event";

    @NotNull
    public static final String ACTION_LIFE_EVENT_KEY = "device:life:event";
    public static final DeviceLifeConst INSTANCE = new DeviceLifeConst();
    public static final int STATUS_ON_BIND = 1;
    public static final int STATUS_ON_CONNECTED = 4;
    public static final int STATUS_ON_CONNECTING = 3;
    public static final int STATUS_ON_DISABLE = 7;
    public static final int STATUS_ON_DISCONNECTED = 5;
    public static final int STATUS_ON_ENABLE = 6;
    public static final int STATUS_ON_UNBIND = 2;

    private DeviceLifeConst() {
    }
}
