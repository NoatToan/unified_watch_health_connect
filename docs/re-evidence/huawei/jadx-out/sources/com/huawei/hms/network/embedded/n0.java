package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15102c = "HttpDnsClient";
    public static final String d = "?type=ALL&domains=";
    public static final String e = "/v1/";
    public static final String f = "/batch-resolve";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f15104b = new q0(a());

    public o0 b() {
        return o0.e();
    }

    public ArrayList<m0> a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        list.remove(o0.e().b());
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        q0.a aVarA = this.f15104b.a();
        return (aVarA == null || !aVarA.a()) ? this.f15104b.a(list) : new ArrayList<>();
    }

    public final String a() {
        String str;
        if (!TextUtils.isEmpty(this.f15103a)) {
            return this.f15103a;
        }
        String strC = o0.e().c();
        String strD = o0.e().d();
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strD)) {
            str = "";
        } else {
            str = strC + e + strD + "/batch-resolve?type=ALL&domains=";
        }
        this.f15103a = str;
        return str;
    }

    public m0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new m0();
        }
        q0.a aVarA = this.f15104b.a();
        if (aVarA != null && aVarA.a()) {
            Logger.w("HttpDnsClient", "HttpDns server is retry-after");
            return new m0();
        }
        if (str.equals(o0.e().b())) {
            return b(str);
        }
        m0 m0VarA = this.f15104b.a(str);
        m0VarA.b(3);
        m0VarA.a(0);
        return m0VarA;
    }

    private m0 b(String str) {
        m0 m0VarA = a0.a(str);
        return y.b(m0VarA) ? h0.f14838b.lookup(str) : m0VarA;
    }
}
