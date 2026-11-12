package com.amap.api.mapcore.util;

import android.content.Context;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class di extends gb<String, a> {

    public static class a {
        public byte[] a;
        public int b = -1;
    }

    public di(Context context, String str) {
        super(context, str);
        ((gb) this).h = "/map/styles";
    }

    @Override // com.amap.api.mapcore.util.gb
    public final /* bridge */ /* synthetic */ a a(String str) throws ga {
        return null;
    }

    @Override // com.amap.api.mapcore.util.gb
    public final /* synthetic */ a a(byte[] bArr) throws ga {
        a aVar = new a();
        aVar.a = bArr;
        return aVar;
    }

    public final void b(String str) {
        ((gb) this).h = str;
    }

    @Override // com.amap.api.mapcore.util.gb
    public final String d() {
        return null;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getIPV6URL() {
        return er.a(getURL());
    }

    @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        HashMap map = new HashMap(16);
        map.put("key", gj.f(((gb) this).g));
        map.put("output", "bin");
        String strA = gm.a();
        String strA2 = gm.a(((gb) this).g, strA, gu.b(map));
        map.put(AuthHandler.d, strA);
        map.put("scode", strA2);
        return map;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return ((gb) this).h;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final boolean isSupportIPV6() {
        return true;
    }
}
