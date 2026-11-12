package com.huawei.hms.support.hwid.common.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.hwid.common.e.b;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.common.e.h;
import com.huawei.up.request.HttpRequestBase;

/* JADX INFO: loaded from: classes34.dex */
public abstract class a {
    protected String d;
    private String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f16611a = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f16612b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f16613c = -1;
    private int e = 0;
    private EnumC0173a g = EnumC0173a.XMLType;

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.common.c.a$a, reason: collision with other inner class name */
    public enum EnumC0173a {
        XMLType,
        URLType,
        JSONType,
        Stream,
        FileType
    }

    public abstract String a();

    protected abstract String a(Context context);

    public Bundle b() {
        return c();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt("responseCode", this.f16611a);
        bundle.putInt("resultCode", this.f16612b);
        bundle.putInt("errorCode", this.f16613c);
        bundle.putString(HttpRequestBase.TAG_ERROR_DESC, this.d);
        return bundle;
    }

    public void a(String str, int i) {
        String strValueOf;
        this.e = i;
        String strA = a();
        String str2 = "https://" + str + HttpRequestBase.UP_SERVER_URL_CHINA;
        e.a("HttpRequest", "setGlobalSiteId, AsUrl::=" + str2, false);
        this.f = str2 + strA;
        int i2 = this.e;
        if (i2 >= 1 && i2 <= 999) {
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = "";
        }
        this.f = h.a(this.f, new String[]{"\\{0\\}", strValueOf});
        e.a("HttpRequest", "Set mGlobalHostUrl::=" + this.f, false);
    }

    public String d() {
        if (TextUtils.isEmpty(this.f)) {
            return a() + "?Version=66300&cVersion=" + b.a();
        }
        return this.f + "?Version=66300&cVersion=" + b.a();
    }
}
