package com.huami.third.wechat.ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huami/third/wechat/ui/StateEvent;", "", "Lcom/huami/third/wechat/ui/SingleLiveEvent;", "", "a", "Lcom/huami/third/wechat/ui/SingleLiveEvent;", "getWechatResult", "()Lcom/huami/third/wechat/ui/SingleLiveEvent;", "wechatResult", "", "b", "getNotifyRefreshDeviceList", "notifyRefreshDeviceList", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class StateEvent {

    @NotNull
    public static final StateEvent INSTANCE = new StateEvent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final SingleLiveEvent<String> wechatResult = new SingleLiveEvent<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final SingleLiveEvent<Boolean> notifyRefreshDeviceList = new SingleLiveEvent<>();

    private StateEvent() {
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getNotifyRefreshDeviceList() {
        return notifyRefreshDeviceList;
    }

    @NotNull
    public final SingleLiveEvent<String> getWechatResult() {
        return wechatResult;
    }
}
