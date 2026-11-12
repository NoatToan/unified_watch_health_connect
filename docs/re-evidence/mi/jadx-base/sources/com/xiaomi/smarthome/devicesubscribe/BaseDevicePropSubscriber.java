package com.xiaomi.smarthome.devicesubscribe;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseDevicePropSubscriber {
    public abstract void destroy();

    public abstract void subscribe(Map<String, ? extends Collection<String>> map);
}
