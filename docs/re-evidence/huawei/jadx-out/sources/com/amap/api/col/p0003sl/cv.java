package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.x2;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cv extends id<String, a> {
    private String j;
    private String k;
    private String l;
    private final String m;
    private boolean n;
    private String o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f2329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2330b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2331c = null;
        public boolean d = false;
    }

    @Override // com.amap.api.col.p0003sl.id
    protected final /* bridge */ /* synthetic */ a a(String str) throws ic {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.id
    protected final String c() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    public cv(Context context, String str) {
        super(context, str);
        this.k = "1.0";
        this.l = "0";
        this.m = "lastModified";
        this.n = false;
        this.o = null;
        this.h = "/map/styles";
        this.i = true;
    }

    public cv(Context context, String str, boolean z) {
        super(context, str);
        this.k = "1.0";
        this.l = "0";
        this.m = "lastModified";
        this.o = null;
        this.n = z;
        if (z) {
            this.h = "/sdk/map/styles";
            this.isPostFlag = false;
        } else {
            this.h = "/map/styles";
        }
        this.i = true;
    }

    public final void b(String str) {
        this.o = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.id
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(lb lbVar) throws ic {
        List<String> list;
        if (lbVar == null) {
            return null;
        }
        a aVarA = a(lbVar.f3037a);
        aVarA.d = aVarA.f2329a != null;
        if (lbVar.f3038b != null && lbVar.f3038b.containsKey("lastModified") && (list = lbVar.f3038b.get("lastModified")) != null && list.size() > 0) {
            aVarA.f2331c = list.get(0);
        }
        return aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.id
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(byte[] bArr) throws ic {
        a aVar = new a();
        aVar.f2329a = bArr;
        if (this.n && bArr != null) {
            if (bArr.length == 0) {
                aVar.f2329a = null;
                return aVar;
            }
            if (aVar.f2329a.length <= 1024) {
                try {
                    if (new String(bArr, "utf-8").contains("errcode")) {
                        aVar.f2329a = null;
                        return aVar;
                    }
                } catch (Exception e) {
                    jv.c(e, "CustomStyleRequest", "loadData");
                }
            }
        }
        return aVar;
    }

    @Override // com.amap.api.col.p0003sl.id, com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        ix ixVarA = eb.a();
        String strB = ixVarA != null ? ixVarA.b() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", y.d);
        hashtable.put(j2.v, Constants.GZIP);
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strB, "3dmap"));
        hashtable.put("x-INFO", io.a(this.g));
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.g));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.g));
        if (!this.n) {
            hashtable.put("output", NavigationFileParser.BIN);
        } else {
            hashtable.put("sdkType", this.o);
        }
        hashtable.put("styleid", this.j);
        hashtable.put(x2.PROTOCOL, this.k);
        hashtable.put("ispublic", "1");
        hashtable.put("lastModified", this.l);
        String strA = io.a();
        String strA2 = io.a(this.g, strA, iy.b(hashtable));
        hashtable.put("ts", strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + this.h;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return eb.a(getURL());
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void d(String str) {
        this.l = str;
    }
}
