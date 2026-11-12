package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.google.gson.JsonParser;
import com.huami.account.event.EventMinorAuthMailSent;
import com.huami.account.keeper.FrozenAccountKeeper;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0005\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/FreezeAccountHandler;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "", "data", "", "handleData", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FreezeAccountHandler implements ApiHandler {

    @NotNull
    public static final String NONAGE_SEND_EMAIL_DONE = "NONAGE_SEND_EMAIL_DONE";

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    @NotNull
    public ErrorMessage getFailedResult() {
        return new ErrorMessage("");
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(@Nullable String data, @Nullable JsCallBackFunction function) {
        if (JsonParser.parseString(data).getAsJsonObject().get("type").getAsString().equals(NONAGE_SEND_EMAIL_DONE)) {
            FrozenAccountKeeper.INSTANCE.unfreezeReset();
            EventBus.getDefault().post(new EventMinorAuthMailSent());
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(@Nullable String data) {
        return false;
    }
}
