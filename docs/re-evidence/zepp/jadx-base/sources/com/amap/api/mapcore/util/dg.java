package com.amap.api.mapcore.util;

import android.content.Context;
import com.loopj.android.http.AsyncHttpClient;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dg extends gb<String, a> {
    private String j;
    private String k;
    private String l;
    private final String m;
    private boolean n;
    private String o;

    public static class a {
        public byte[] a;
        public int b = -1;
        public String c = null;
        public boolean d = false;
    }

    public dg(Context context, String str) {
        super(context, str);
        this.k = "1.0";
        this.l = "0";
        this.m = "lastModified";
        this.n = false;
        this.o = null;
        ((gb) this).h = "/map/styles";
        ((gb) this).i = true;
    }

    @Override // com.amap.api.mapcore.util.gb
    public final /* bridge */ /* synthetic */ a a(String str) throws ga {
        return null;
    }

    public final void b(String str) {
        this.o = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    @Override // com.amap.api.mapcore.util.gb
    public final String d() {
        return null;
    }

    public final void d(String str) {
        this.l = str;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getIPV6URL() {
        return er.a(getURL());
    }

    @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", gj.f(((gb) this).g));
        if (this.n) {
            hashtable.put("sdkType", this.o);
        } else {
            hashtable.put("output", "bin");
        }
        hashtable.put("styleid", this.j);
        hashtable.put("protocol", this.k);
        hashtable.put("ispublic", "1");
        hashtable.put("lastModified", this.l);
        String strA = gm.a();
        String strA2 = gm.a(((gb) this).g, strA, gu.b(hashtable));
        hashtable.put(AuthHandler.d, strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }

    @Override // com.amap.api.mapcore.util.gb, com.amap.api.mapcore.util.ir
    public final Map<String, String> getRequestHead() {
        gt gtVarF = er.f();
        String strB = gtVarF != null ? gtVarF.b() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", l.c);
        hashtable.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strB, "3dmap"));
        hashtable.put("x-INFO", gm.a(((gb) this).g));
        hashtable.put("key", gj.f(((gb) this).g));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + ((gb) this).h;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final boolean isSupportIPV6() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.mapcore.util.gb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(byte[] bArr) throws ga {
        a aVar = new a();
        aVar.a = bArr;
        if (this.n && bArr != null) {
            if (bArr.length == 0) {
                aVar.a = null;
            } else if (bArr.length <= 1024) {
                try {
                    if (new String(bArr, "utf-8").contains("errcode")) {
                        aVar.a = null;
                    }
                } catch (Exception e) {
                    hn.c(e, "CustomStyleRequest", "loadData");
                }
            }
        }
        return aVar;
    }

    @Override // com.amap.api.mapcore.util.gb
    public final /* synthetic */ a a(is isVar) throws ga {
        List<String> list;
        if (isVar == null) {
            return null;
        }
        a aVarA = a(isVar.a);
        aVarA.d = aVarA.a != null;
        Map<String, List<String>> map = isVar.b;
        if (map == null || !map.containsKey("lastModified") || (list = isVar.b.get("lastModified")) == null || list.size() <= 0) {
            return aVarA;
        }
        aVarA.c = list.get(0);
        return aVarA;
    }

    public dg(Context context, String str, boolean z) {
        super(context, str);
        this.k = "1.0";
        this.l = "0";
        this.m = "lastModified";
        this.n = false;
        this.o = null;
        this.n = z;
        if (z) {
            ((gb) this).h = "/sdk/map/styles";
            this.isPostFlag = false;
        } else {
            ((gb) this).h = "/map/styles";
        }
        ((gb) this).i = true;
    }
}
