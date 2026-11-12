package com.huawei.watchface;

import android.util.SparseArray;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.mvp.model.webview.JsInteractAddition;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class f extends BaseEvent {
    public static final SparseArray r;
    public LinkedHashMap g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;

    static {
        SparseArray sparseArray = new SparseArray();
        r = sparseArray;
        sparseArray.put(1, "下载成功");
        sparseArray.put(-15, "下载文件写入异常");
        sparseArray.put(-10, "取消下载");
        sparseArray.put(-11, "文件的hash校验失败");
        sparseArray.put(-12, "文件license解密失败");
        sparseArray.put(-6, "文件解压缩失败");
        sparseArray.put(-9, "APP存储空间不足");
        sparseArray.put(-3, "文件下载接口返回失败");
        sparseArray.put(-14, "文件创建异常，或文件路径校验失败");
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_DOWNLOAD";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return u();
    }

    public final String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (l() != null) {
            sb.append(l());
            sb.append("_");
        }
        sb.append((String) r.get(IntegerUtils.a(str)));
        return sb.toString();
    }

    public void e(String str) {
        this.m = str;
    }

    public void f(String str) {
        this.h = str;
    }

    public void g(String str) {
        this.k = str;
    }

    public void h(String str) {
        this.p = str;
    }

    public void i(String str) {
        this.n = str;
    }

    public void j(String str) {
        this.j = str;
    }

    public void k(String str) {
        this.q = str;
    }

    public String l() {
        return this.h;
    }

    public String m() {
        return this.k;
    }

    public void n(String str) {
        this.o = str;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.j;
    }

    public String q() {
        return this.q;
    }

    public String r() {
        return this.i;
    }

    public String s() {
        return this.l;
    }

    public String t() {
        return this.o;
    }

    public final LinkedHashMap u() {
        if (this.g == null) {
            this.g = new LinkedHashMap();
        }
        this.g.put(JsInteractAddition.HI_TOP_ID, e());
        this.g.put("version", h());
        this.g.put("startts", String.valueOf(f()));
        this.g.put("endts", String.valueOf(c()));
        this.g.put("totalTime", String.valueOf(g()));
        this.g.put("errorCode", d());
        this.g.put("protocal", r());
        this.g.put("hashcode", p());
        this.g.put("downUrl", m());
        this.g.put("title", s());
        this.g.put("cnTitle", k());
        this.g.put("datalen", SafeString.replace(o(), "KB", ""));
        this.g.put("useType", t());
        this.g.put("downloadResourceType", n());
        this.g.put("productId", q());
        this.g.put(BaseEvent.KEY_DESCINFO, d(d()));
        return this.g;
    }

    public String k() {
        return this.m;
    }

    public void l(String str) {
        this.i = str;
    }

    public void m(String str) {
        this.l = str;
    }

    public String n() {
        return this.p;
    }
}
