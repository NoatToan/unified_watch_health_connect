package com.xiaomi.hm.health.sleep.eventbus;

import com.huami.sleep.koin.ISleepPostEvent;
import com.xiaomi.hm.health.eventbus.EventDetailBack;
import com.xiaomi.hm.health.eventbus.EventEditSleep;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/sleep/eventbus/SleepPostEventImpl;", "Lcom/huami/sleep/koin/ISleepPostEvent;", "", "postEventEditSleep", "", "type", "postEventDetailBack", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepPostEventImpl implements ISleepPostEvent {
    @Override // com.huami.sleep.koin.ISleepPostEvent
    public void postEventDetailBack(int type) {
        EventBus.getDefault().post(new EventDetailBack(type));
    }

    @Override // com.huami.sleep.koin.ISleepPostEvent
    public void postEventEditSleep() {
        EventBus.getDefault().post(new EventEditSleep());
    }
}
