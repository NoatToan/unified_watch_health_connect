package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cx extends id<String, a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f2335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2336b = -1;
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

    @Override // com.amap.api.col.p0003sl.id
    protected final /* synthetic */ a a(byte[] bArr) throws ic {
        return b(bArr);
    }

    public final void b(String str) {
        this.h = str;
    }

    public cx(Context context, String str) {
        super(context, str);
        this.h = "/map/styles";
    }

    private static a b(byte[] bArr) throws ic {
        a aVar = new a();
        aVar.f2335a = bArr;
        return aVar;
    }

    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        HashMap map = new HashMap(16);
        map.put(MedalConstants.EVENT_KEY, il.f(this.g));
        map.put("output", NavigationFileParser.BIN);
        String strA = io.a();
        String strA2 = io.a(this.g, strA, iy.b(map));
        map.put("ts", strA);
        map.put("scode", strA2);
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return eb.a(getURL());
    }
}
