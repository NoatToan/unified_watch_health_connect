package org.cybergarage.upnp.event;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class SubscriberList extends Vector {
    public Subscriber getSubscriber(int i) {
        Object obj;
        try {
            obj = get(i);
        } catch (Exception unused) {
            obj = null;
        }
        return (Subscriber) obj;
    }
}
