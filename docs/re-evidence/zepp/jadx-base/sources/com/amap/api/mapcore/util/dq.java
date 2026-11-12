package com.amap.api.mapcore.util;

import com.amap.api.maps.MapsInitializer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dq extends ir {
    public boolean isPostFlag = true;

    @Override // com.amap.api.mapcore.util.ir
    public Map<String, String> getParams() {
        return null;
    }

    public byte[] makeHttpRequest() throws gi {
        is isVarMakeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (isVarMakeHttpRequestNeedHeader != null) {
            return isVarMakeHttpRequestNeedHeader.a;
        }
        return null;
    }

    public is makeHttpRequestNeedHeader() throws gi {
        setHttpProtocol(MapsInitializer.getProtocol() == 1 ? ir.c.HTTP : ir.c.HTTPS);
        iq.c();
        return this.isPostFlag ? ik.b(this) : iq.f(this);
    }

    public byte[] makeHttpRequestWithInterrupted() throws gi {
        setDegradeAbility(ir.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
