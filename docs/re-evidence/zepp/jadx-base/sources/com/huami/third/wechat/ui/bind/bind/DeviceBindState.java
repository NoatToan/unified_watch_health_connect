package com.huami.third.wechat.ui.bind.bind;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "", "", "state", LogUtil.I, "<init>", "(Ljava/lang/String;II)V", "Companion", "OTHER_BOUND", "UNBIND", "BOUND", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public enum DeviceBindState {
    OTHER_BOUND(-2),
    UNBIND(0),
    BOUND(1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState$Companion;", "", "", "state", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "bindState", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceBindState bindState(int state) {
            if (state == -2) {
                return DeviceBindState.OTHER_BOUND;
            }
            if (state == 0) {
                return DeviceBindState.UNBIND;
            }
            if (state == 1) {
                return DeviceBindState.BOUND;
            }
            throw new IllegalStateException("没有该类型的绑定状态！");
        }
    }

    DeviceBindState(int i) {
        this.state = i;
    }
}
