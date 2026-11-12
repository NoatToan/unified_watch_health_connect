package org.cybergarage.upnp;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ServiceList extends Vector {
    public static final String ELEM_NAME = "serviceList";

    public Service getService(int i) {
        Object obj;
        try {
            obj = get(i);
        } catch (Exception unused) {
            obj = null;
        }
        return (Service) obj;
    }
}
