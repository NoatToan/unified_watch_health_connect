package com.autonavi.aps.amapapi.trans;

import android.text.TextUtils;
import defpackage.l0t;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends l0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, String> f6889a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, String> f6890b = null;
    String g = "";
    byte[] h = null;
    private String i = null;

    public final void a(Map<String, String> map) {
        this.f6889a = map;
    }

    public final void b(Map<String, String> map) {
        this.f6890b = map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.h;
    }

    @Override // defpackage.l0t, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return !TextUtils.isEmpty(this.i) ? this.i : super.getIPV6URL();
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.f6890b;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.f6889a;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.g;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void a(byte[] bArr) {
        this.h = bArr;
    }
}
