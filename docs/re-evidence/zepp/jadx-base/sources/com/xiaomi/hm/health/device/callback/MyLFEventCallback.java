package com.xiaomi.hm.health.device.callback;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyLFEventCallback extends HMCallback<HMLFEvent> {
    private static final String a = "MyLFEventCallback";

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(HMLFEvent hMLFEvent) {
        super.onData(hMLFEvent);
        HMLog.i(a, "HMLFEvent:" + hMLFEvent, new Object[0]);
        EventBus.getDefault().post(hMLFEvent);
    }
}
