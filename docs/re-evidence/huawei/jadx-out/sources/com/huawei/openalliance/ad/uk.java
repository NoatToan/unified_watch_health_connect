package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20311c;
    private Integer d;
    private String e;
    private ContentRecord f;

    public ContentRecord f() {
        return this.f;
    }

    public int e() {
        return this.d.intValue();
    }

    public String d() {
        return this.e;
    }

    public String c() {
        return this.f20310b;
    }

    public String b() {
        return this.f20309a;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f20311c = str;
    }

    public void a(ContentRecord contentRecord) {
        this.f = contentRecord;
    }

    public void a(int i) {
        this.d = Integer.valueOf(i);
    }

    public String a() {
        return this.f20311c;
    }

    public uk(String str, String str2, String str3, String str4) {
        this.f20309a = str == null ? "" : str;
        this.f20310b = str2 == null ? "" : str2;
        this.f20311c = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
    }

    public uk() {
    }
}
