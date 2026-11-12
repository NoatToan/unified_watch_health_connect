package org.cybergarage.upnp;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ServiceStateTable extends Vector {
    public static final String ELEM_NAME = "serviceStateTable";

    public StateVariable getStateVariable(int i) {
        return (StateVariable) get(i);
    }
}
