package com.amap.api.col.p0003sl;

import com.amap.api.maps.MapsInitializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class df extends la {
    protected boolean isPostFlag = true;

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    protected lb makeHttpRequestNeedHeader() throws ik {
        if (ad.f2193a != null && iu.a(ad.f2193a, eb.a()).f2835a != iu.c.SuccessCode) {
            return null;
        }
        setHttpProtocol(MapsInitializer.getProtocol() == 1 ? la.c.HTTP : la.c.HTTPS);
        kz.c();
        if (this.isPostFlag) {
            return kz.a(this);
        }
        return kz.e(this);
    }

    protected byte[] makeHttpRequest() throws ik {
        lb lbVarMakeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (lbVarMakeHttpRequestNeedHeader != null) {
            return lbVarMakeHttpRequestNeedHeader.f3037a;
        }
        return null;
    }

    public byte[] makeHttpRequestWithInterrupted() throws ik {
        setDegradeAbility(la.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
