package com.amap.api.col.p0003sl;

import com.amap.api.maps.MapsInitializer;
import defpackage.p4s;
import defpackage.v5t;
import defpackage.zns;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends la {
    protected boolean isPostFlag = true;

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    public byte[] makeHttpRequest() throws ik {
        v5t v5tVarMakeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (v5tVarMakeHttpRequestNeedHeader != null) {
            return v5tVarMakeHttpRequestNeedHeader.f36513a;
        }
        return null;
    }

    public v5t makeHttpRequestNeedHeader() throws ik {
        if (p4s.f != null && iu.a(p4s.f, zns.t()).f6352a != iu.c.SuccessCode) {
            return null;
        }
        setHttpProtocol(MapsInitializer.getProtocol() == 1 ? la.c.HTTP : la.c.HTTPS);
        f1.p();
        return this.isPostFlag ? b1.d(this) : f1.r(this);
    }

    public byte[] makeHttpRequestWithInterrupted() throws ik {
        setDegradeAbility(la.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
