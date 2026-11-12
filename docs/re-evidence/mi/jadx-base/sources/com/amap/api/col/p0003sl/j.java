package com.amap.api.col.p0003sl;

import android.content.Context;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.p0t;
import defpackage.szs;
import defpackage.zns;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends szs<String, a> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f6168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6169b = -1;
    }

    public j(Context context, String str) {
        super(context, str);
        this.u = "/map/styles";
    }

    public static a o(byte[] bArr) throws ic {
        a aVar = new a();
        aVar.f6168a = bArr;
        return aVar;
    }

    public final void b(String str) {
        this.u = str;
    }

    @Override // defpackage.szs
    public final /* bridge */ /* synthetic */ a e(String str) throws ic {
        return null;
    }

    @Override // defpackage.szs
    public final /* synthetic */ a g(byte[] bArr) throws ic {
        return o(bArr);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return zns.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        HashMap map = new HashMap(16);
        map.put("key", e0t.k(this.t));
        map.put("output", TSMAuthContants.PARAM_CARD_BIN);
        String strA = g0t.a();
        String strC = g0t.c(this.t, strA, p0t.q(map));
        map.put(DeviceTagInterface.TAG_DATA_START, strA);
        map.put("scode", strC);
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.u;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }
}
