package com.xmlywind.sdk.common.e;

import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class a extends k<com.xmlywind.volley.i> {
    private final InterfaceC1072a b;
    private String c;

    /* JADX INFO: renamed from: com.xmlywind.sdk.common.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC1072a {
        void onErrorResponse(s sVar);

        void onSuccess();
    }

    public a(String str, String str2, InterfaceC1072a interfaceC1072a) {
        super(str, 1, null);
        this.c = "";
        this.b = interfaceC1072a;
        this.c = str2;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
    }

    public static void a(String str, InterfaceC1072a interfaceC1072a) {
        s sVar;
        if ((str == null || str.length() == 0) && interfaceC1072a != null) {
            interfaceC1072a.onErrorResponse(new s("body is empty"));
        }
        if (f.f() != null) {
            try {
                if (m.b(new URL(SDKConfig.sharedInstance().getLogUrl()).getHost())) {
                    f.f().a(new a(SDKConfig.sharedInstance().getLogUrl(), str, interfaceC1072a));
                } else if (interfaceC1072a != null) {
                    interfaceC1072a.onErrorResponse(new s("network is disconnect "));
                }
                return;
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
                if (interfaceC1072a == null) {
                    return;
                } else {
                    sVar = new s("network is disconnect ");
                }
            }
        } else if (interfaceC1072a == null) {
            return;
        } else {
            sVar = new s("BuriedPointRequestQueue is empty");
        }
        interfaceC1072a.onErrorResponse(sVar);
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public com.xmlywind.volley.n<com.xmlywind.volley.i> a(com.xmlywind.volley.i iVar) {
        return com.xmlywind.volley.n.a(iVar, null);
    }

    @Override // com.xmlywind.volley.l
    public void a(s sVar) {
        InterfaceC1072a interfaceC1072a;
        synchronized (this.a) {
            interfaceC1072a = this.b;
        }
        SigmobLog.i("send dclog: " + h() + " onErrorResponse");
        if (interfaceC1072a != null) {
            interfaceC1072a.onErrorResponse(sVar);
        }
    }

    @Override // com.xmlywind.volley.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.xmlywind.volley.i iVar) {
        InterfaceC1072a interfaceC1072a;
        synchronized (this.a) {
            interfaceC1072a = this.b;
        }
        SigmobLog.i("send dclog: " + h() + " success");
        if (interfaceC1072a != null) {
            interfaceC1072a.onSuccess();
        }
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public byte[] b() {
        return this.c.getBytes();
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public Map<String, String> c() {
        Map<String, String> mapC = super.c();
        mapC.put("gz", "on");
        return mapC;
    }

    @Override // com.xmlywind.volley.l
    public int d() {
        return 100;
    }
}
