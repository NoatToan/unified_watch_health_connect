package com.xiaomi.hm.health.device.setting.find;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/ResultCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "result", "", "onFinish", "", "a", "Ljava/lang/String;", "operation", "<init>", "(Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ResultCallback extends HMCallback<Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String operation;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return ResultCallback.this.operation + " result: " + this.b;
        }
    }

    public ResultCallback(@NotNull String str) {
        this.operation = str;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
        onFinish(bool.booleanValue());
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        HMLog.info(this.operation, new a(result));
    }
}
