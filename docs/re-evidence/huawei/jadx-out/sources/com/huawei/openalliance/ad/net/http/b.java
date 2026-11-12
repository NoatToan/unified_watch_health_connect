package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.openalliance.ad.eb;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.lj;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.q;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f19686a;

    protected String c(a aVar) {
        if (aVar == null) {
            return null;
        }
        return a(aVar) ? FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM : aVar.g;
    }

    protected String b(a aVar) {
        return (aVar != null && aVar.l == 2) ? "fb" : "json";
    }

    protected boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        return aVar.l == 1 || aVar.l == 2;
    }

    protected String a(e eVar, a aVar) {
        return aVar.a() ? aVar.b() : new f.a().a(eVar.h, aVar.c()).a(aVar.i).a().c();
    }

    protected long a(e eVar, a aVar, int i, InputStream inputStream, long j, Response response) {
        if (!a(aVar)) {
            lj ljVarA = aVar.m != null ? aVar.m : lj.a.a(aVar.f19681b);
            response.a(ljVarA.a(i, inputStream, j, eVar.f));
            if (hw.a()) {
                hw.a("BaseCaller", "normal rsp: %s", bk.b(response));
            }
            return ljVarA.a();
        }
        byte[] bArrB = df.b(inputStream);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (hw.a()) {
            hw.a("BaseCaller", "contentLength: %s, rsp fb data: %s", Long.valueOf(j), new String(bArrB, "UTF-8"));
            hw.a("BaseCaller", "content base64: %s", q.a(bArrB));
        }
        response.a(eb.a(bArrB));
        response.d(aVar.l);
        return jCurrentTimeMillis;
    }

    public b(Context context) {
        this.f19686a = context;
    }
}
