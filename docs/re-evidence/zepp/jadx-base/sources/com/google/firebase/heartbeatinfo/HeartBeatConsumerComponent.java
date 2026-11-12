package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* JADX INFO: loaded from: classes3.dex */
public class HeartBeatConsumerComponent {

    public class a implements HeartBeatConsumer {
    }

    private HeartBeatConsumerComponent() {
    }

    public static Component<?> create() {
        return Component.intoSet(new a(), HeartBeatConsumer.class);
    }
}
