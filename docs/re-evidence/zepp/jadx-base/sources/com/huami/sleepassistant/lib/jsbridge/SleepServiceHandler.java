package com.huami.sleepassistant.lib.jsbridge;

import com.google.gson.Gson;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.sleepassistant.apilib.bean.AlarmClockBean;
import com.huami.sleepassistant.apilib.bean.SleepServiceBean;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0007\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/sleepassistant/lib/jsbridge/SleepServiceHandler;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "", "data", "", "handleData", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepServiceHandler implements ApiHandler {
    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    @NotNull
    public ErrorMessage getFailedResult() {
        return new ErrorMessage(null);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(@Nullable String data) {
        if (!Intrinsics.areEqual("sleepMusicH5", data)) {
            return false;
        }
        EventBus.getDefault().post(new AlarmClockBean("sleepMusicH5"));
        return false;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(@Nullable String data, @Nullable JsCallBackFunction function) {
        try {
            JSONObject jSONObject = new JSONObject(data).getJSONObject("type");
            if (Intrinsics.areEqual("sleepAudioSetting", jSONObject.getString("type"))) {
                EventBus.getDefault().post((SleepServiceBean) new Gson().fromJson(jSONObject.toString(), SleepServiceBean.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
