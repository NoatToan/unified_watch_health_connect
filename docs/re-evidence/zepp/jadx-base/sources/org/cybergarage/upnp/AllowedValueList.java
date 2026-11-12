package org.cybergarage.upnp;

import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class AllowedValueList extends Vector {
    public static final String ELEM_NAME = "allowedValueList";

    public AllowedValueList() {
    }

    public AllowedValue getAllowedValue(int i) {
        return (AllowedValue) get(i);
    }

    public boolean isAllowed(String str) {
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (((AllowedValue) it2.next()).getValue().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public AllowedValueList(String[] strArr) {
        for (String str : strArr) {
            add(new AllowedValue(str));
        }
    }
}
