package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public class eb {
    public static AdContentRsp a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            hw.c("AdRspFbSerializeUtil", "data is empty");
            return null;
        }
        try {
            wp wpVarA = wp.a(ByteBuffer.wrap(bArr));
            if (wpVarA == null) {
                hw.c("AdRspFbSerializeUtil", "from flat buffer, rsp is null.");
                return null;
            }
            hw.b("AdRspFbSerializeUtil", "parse adContentRsp from fb.");
            AdContentRsp adContentRsp = new AdContentRsp();
            adContentRsp.a(ea.a(wpVarA.a(), -1));
            adContentRsp.a(wpVarA.b());
            adContentRsp.a(ea.a(wpVarA.c()));
            adContentRsp.b(ea.a(wpVarA.d()));
            adContentRsp.c(ea.a(wpVarA.f()));
            adContentRsp.d(ea.a(wpVarA.e()));
            adContentRsp.b(wpVarA.g());
            adContentRsp.b(ea.a(wpVarA.i(), 800));
            adContentRsp.e(ea.a(wpVarA.h()));
            adContentRsp.c(ea.b(wpVarA.j()));
            adContentRsp.d(ea.b(wpVarA.k()));
            adContentRsp.e(ea.b(wpVarA.l()));
            adContentRsp.g(wpVarA.m());
            adContentRsp.d(wpVarA.n());
            if (hw.a()) {
                hw.a("AdRspFbSerializeUtil", "parse adContentRsp from fb end.");
                hw.a("AdRspFbSerializeUtil", "rsp: %s", com.huawei.openalliance.ad.utils.bk.b(adContentRsp));
            }
            return adContentRsp;
        } catch (Throwable th) {
            hw.c("AdRspFbSerializeUtil", "get rsp from flat buffer ex: %s", th.getClass().getSimpleName());
            return null;
        }
    }
}
