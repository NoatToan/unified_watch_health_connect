package com.autonavi.aps.amapapi.trans;

import android.text.TextUtils;
import com.amap.api.col.p0003sl.is;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, String> f3984a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, String> f3985b = null;
    String g = "";
    byte[] h = null;
    private String i = null;

    public final void a(Map<String, String> map) {
        this.f3984a = map;
    }

    public final void b(Map<String, String> map) {
        this.f3985b = map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.f3984a;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.f3985b;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.g;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(byte[] bArr) {
        this.h = bArr;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.h;
    }

    public final void b(String str) {
        this.i = str;
    }

    @Override // com.amap.api.col.p0003sl.is, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        return super.getIPV6URL();
    }
}
