package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yqv;
import defpackage.yra;
import defpackage.yrg;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NetworkCapability f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30830c;
    public String d;
    public String e;
    public String f;
    public CredentialClient g;

    public abstract Credential a(String str) throws yqj;

    public Credential a(String str, String str2, String str3, String str4) throws yqj {
        try {
            a();
            this.f30830c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            NetworkResponse networkResponsePost = this.f30828a.post(new NetworkRequest(str, yrg.b(str2, str3, str4), yrg.d(b())));
            int code = networkResponsePost.getCode();
            if ((code < 200 || code >= 300) && code != 400 && code != 403 && code != 500) {
                throw new yqj(1013L, "tsms req error, return " + networkResponsePost.getCode());
            }
            return a(a(networkResponsePost));
        } catch (IOException e) {
            StringBuilder sbB = yql.b("get credential from TSMS fail : ");
            sbB.append(e.getMessage());
            String string = sbB.toString();
            throw yra.e("ApplyCredentialHandler", string, new Object[0], 1006L, string);
        }
    }

    public abstract Credential a(String str, String str2, String str3, String str4, yqv yqvVar) throws yqj;

    public abstract String a(NetworkResponse networkResponse) throws yqj;

    public abstract void a() throws yqj;

    public abstract String b() throws yqj;

    public static boolean b(String str) {
        return "tsms.1018".equalsIgnoreCase(str) || "tsms.1019".equalsIgnoreCase(str);
    }

    public c(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) {
        this.g = credentialClient;
        this.f30829b = context;
        this.f30828a = networkCapability;
    }
}
