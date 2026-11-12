package com.huami.third.alipay.ui;

import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/third/alipay/ui/StateEvent;", "", "", "a", "Ljava/lang/String;", "getALIPAY_VIEW_NUM", "()Ljava/lang/String;", "setALIPAY_VIEW_NUM", "(Ljava/lang/String;)V", "ALIPAY_VIEW_NUM", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public final class StateEvent {

    @NotNull
    public static final StateEvent INSTANCE = new StateEvent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String ALIPAY_VIEW_NUM = StatEvent.EventId.ALIPAY_VIEW_NUM;

    private StateEvent() {
    }

    @NotNull
    public final String getALIPAY_VIEW_NUM() {
        return ALIPAY_VIEW_NUM;
    }

    public final void setALIPAY_VIEW_NUM(@NotNull String str) {
        ALIPAY_VIEW_NUM = str;
    }
}
