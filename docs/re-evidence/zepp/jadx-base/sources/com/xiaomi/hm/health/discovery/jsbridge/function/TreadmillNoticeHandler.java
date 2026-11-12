package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.devicex.injection.other.TreadmillApiHandler;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bolt.JsTreadmillMaintainEvent;
import com.xiaomi.hm.health.discovery.jsbridge.function.TreadmillNoticeHandler;
import com.xiaomi.hm.health.reminder.NotifyMessagePushCallback;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/TreadmillNoticeHandler;", "Lcom/huami/devicex/injection/other/TreadmillApiHandler;", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "", "p0", "", "handleData", "data", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "success", "maintainCallback", "a", "Ljava/lang/String;", "errorCode", "b", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "mFunction", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillNoticeHandler implements TreadmillApiHandler {

    @NotNull
    public static final String ERROR_CODE_MSG_FORMAT_WRONG = "4021101";

    @NotNull
    public static final String ERROR_CODE_WRITE_FAILED = "4021202";
    public static final int MAINTAIN_TYPE = 1;

    @NotNull
    public static final String TAG = "TreadmillNoticeHandler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private JsCallBackFunction mFunction;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TreadmillNoticeHandler treadmillNoticeHandler, JsCallBackFunction jsCallBackFunction, int i) {
        HMLog.info(TAG, new b(i));
        if (i == -1) {
            EventBus.getDefault().post(new JsTreadmillMaintainEvent(treadmillNoticeHandler));
            return;
        }
        if (i == 4) {
            treadmillNoticeHandler.errorCode = ERROR_CODE_WRITE_FAILED;
        } else if (i == 6) {
            treadmillNoticeHandler.errorCode = ERROR_CODE_MSG_FORMAT_WRONG;
        }
        if (jsCallBackFunction == null) {
            return;
        }
        jsCallBackFunction.onCallBack(treadmillNoticeHandler.getFailedResult().toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    @NotNull
    public ErrorMessage getFailedResult() {
        return JsMessageCenter.get().getMessage(this.errorCode);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(@NotNull String data, @Nullable final JsCallBackFunction function) {
        HMLog.info(TAG, new a(data));
        this.mFunction = function;
        TreadmillNoticeHandlerKt.formatMessage(data, new NotifyMessagePushCallback() { // from class: kz7
            @Override // com.xiaomi.hm.health.reminder.NotifyMessagePushCallback
            public final void onResult(int i) {
                TreadmillNoticeHandler.b(this.a, function, i);
            }
        });
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(@Nullable String p0) {
        return false;
    }

    @Override // com.huami.devicex.injection.other.TreadmillApiHandler
    public void maintainCallback(boolean success) {
        if (success) {
            JsCallBackFunction jsCallBackFunction = this.mFunction;
            if (jsCallBackFunction == null) {
                return;
            }
            jsCallBackFunction.onCallBack(JsMessageCenter.get().getSuccess());
            return;
        }
        this.errorCode = ERROR_CODE_WRITE_FAILED;
        JsCallBackFunction jsCallBackFunction2 = this.mFunction;
        if (jsCallBackFunction2 == null) {
            return;
        }
        jsCallBackFunction2.onCallBack(getFailedResult().toString());
    }
}
