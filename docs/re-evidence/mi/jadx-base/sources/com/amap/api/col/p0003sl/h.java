package com.amap.api.col.p0003sl;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.m2t;
import defpackage.o0t;
import defpackage.p0t;
import defpackage.szs;
import defpackage.ugt;
import defpackage.v5t;
import defpackage.zns;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends szs<String, a> {
    public boolean A;
    public String B;
    public String w;
    public String x;
    public String y;
    public final String z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f6067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6068b = -1;
        public String c = null;
        public boolean d = false;
    }

    public h(Context context, String str) {
        super(context, str);
        this.x = "1.0";
        this.y = "0";
        this.z = "lastModified";
        this.A = false;
        this.B = null;
        this.u = "/map/styles";
        this.v = true;
    }

    public final void b(String str) {
        this.B = str;
    }

    public final void c(String str) {
        this.w = str;
    }

    public final void d(String str) {
        this.y = str;
    }

    @Override // defpackage.szs
    public final /* bridge */ /* synthetic */ a e(String str) throws ic {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return zns.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", e0t.k(this.t));
        if (this.A) {
            hashtable.put("sdkType", this.B);
        } else {
            hashtable.put("output", TSMAuthContants.PARAM_CARD_BIN);
        }
        hashtable.put("styleid", this.w);
        hashtable.put("protocol", this.x);
        hashtable.put("ispublic", "1");
        hashtable.put("lastModified", this.y);
        String strA = g0t.a();
        String strC = g0t.c(this.t, strA, p0t.q(hashtable));
        hashtable.put(DeviceTagInterface.TAG_DATA_START, strA);
        hashtable.put("scode", strC);
        return hashtable;
    }

    @Override // defpackage.szs, com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        o0t o0tVarT = zns.t();
        String strE = o0tVarT != null ? o0tVarT.e() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", ugt.d);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strE, "3dmap"));
        hashtable.put("x-INFO", g0t.b(this.t));
        hashtable.put("key", e0t.k(this.t));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + this.u;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // defpackage.szs
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final a f(v5t v5tVar) throws ic {
        List<String> list;
        if (v5tVar == null) {
            return null;
        }
        a aVarG = g(v5tVar.f36513a);
        aVarG.d = aVarG.f6067a != null;
        Map<String, List<String>> map = v5tVar.f36514b;
        if (map == null || !map.containsKey("lastModified") || (list = v5tVar.f36514b.get("lastModified")) == null || list.size() <= 0) {
            return aVarG;
        }
        aVarG.c = list.get(0);
        return aVarG;
    }

    @Override // defpackage.szs
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final a g(byte[] bArr) throws ic {
        a aVar = new a();
        aVar.f6067a = bArr;
        if (this.A && bArr != null) {
            if (bArr.length == 0) {
                aVar.f6067a = null;
            } else if (bArr.length <= 1024) {
                try {
                    if (new String(bArr, "utf-8").contains(CommonConstants.KEY_ERR_CODE)) {
                        aVar.f6067a = null;
                    }
                } catch (Exception e) {
                    m2t.r(e, "CustomStyleRequest", "loadData");
                }
            }
        }
        return aVar;
    }

    public h(Context context, String str, boolean z) {
        super(context, str);
        this.x = "1.0";
        this.y = "0";
        this.z = "lastModified";
        this.B = null;
        this.A = z;
        if (z) {
            this.u = "/sdk/map/styles";
            this.isPostFlag = false;
        } else {
            this.u = "/map/styles";
        }
        this.v = true;
    }
}
