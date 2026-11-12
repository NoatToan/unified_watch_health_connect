package com.huawei.openalliance.ad;

import com.google.flatbuffers.FlatBufferBuilder;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class dz {
    public static byte[] a(AdContentReq adContentReq) {
        String str;
        if (adContentReq == null) {
            str = "toFlatBufferBytes adContentReq is null";
        } else {
            try {
                FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder(0);
                flatBufferBuilder.finish(vx.a(flatBufferBuilder, dy.a(adContentReq.F()), -1111L, dy.a(adContentReq.f(), flatBufferBuilder), 0, Constants.FB_NUMBER_DEF, Constants.FB_NUMBER_DEF, vx.a(flatBufferBuilder, dy.a(adContentReq.k(), flatBufferBuilder)), 0, dy.a(adContentReq.g(), flatBufferBuilder), 0, dy.a(adContentReq.h(), flatBufferBuilder), dy.a(adContentReq.i(), flatBufferBuilder), dy.a(adContentReq.j(), flatBufferBuilder), vx.b(flatBufferBuilder, ef.a(adContentReq.l(), flatBufferBuilder)), vx.c(flatBufferBuilder, ef.a(adContentReq.m(), flatBufferBuilder)), dy.a(adContentReq.n(), flatBufferBuilder), adContentReq.p(), vx.d(flatBufferBuilder, ef.a(adContentReq.q(), flatBufferBuilder)), dy.a(adContentReq.r(), flatBufferBuilder), adContentReq.o(), adContentReq.d(), dy.a(adContentReq.s()), dy.a(adContentReq.t()), dy.a(adContentReq.u()), dy.a(adContentReq.v()), dy.a(adContentReq.w(), flatBufferBuilder), dy.a(adContentReq.x(), flatBufferBuilder), dy.a(adContentReq.y(), flatBufferBuilder), dy.a(adContentReq.z(), flatBufferBuilder), dy.a(adContentReq.A()), dy.a(adContentReq.B(), flatBufferBuilder), dy.a(adContentReq.C(), flatBufferBuilder), dy.a(adContentReq.D(), flatBufferBuilder), adContentReq.e(), 0, 0, 0, 0, 0, vx.e(flatBufferBuilder, ef.a(adContentReq.O(), flatBufferBuilder)), vx.f(flatBufferBuilder, dy.a(adContentReq.E(), flatBufferBuilder)), dy.a(adContentReq.G(), flatBufferBuilder), vx.g(flatBufferBuilder, dy.b(adContentReq.H(), flatBufferBuilder)), vx.h(flatBufferBuilder, ef.a(adContentReq.I(), flatBufferBuilder)), vx.i(flatBufferBuilder, ef.a(adContentReq.J(), flatBufferBuilder)), dy.a(adContentReq.K()), dy.a(adContentReq.L()), dy.a(adContentReq.M()), vx.j(flatBufferBuilder, adContentReq.N())));
                return flatBufferBuilder.sizedByteArray();
            } catch (Throwable th) {
                str = "toFlatBuffersBytes error:" + th.getClass().getSimpleName();
            }
        }
        hw.c("AdReqFbSerializeUtil", str);
        return null;
    }
}
