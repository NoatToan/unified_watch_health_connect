package com.xmlywind.sdk.common.e;

import com.xmlywind.logger.SigmobLog;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class d extends k<JSONObject> {
    private final a b;

    public interface a extends com.xmlywind.volley.n.a {
        void onSuccess(JSONObject jSONObject);
    }

    public d(String str, a aVar, int i) {
        super(str, 0, aVar);
        this.b = aVar;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public com.xmlywind.volley.n<JSONObject> a(com.xmlywind.volley.i iVar) {
        try {
            return com.xmlywind.volley.n.a(new JSONObject(new String(iVar.b, com.xmlywind.volley.toolbox.h.a(iVar.c, "utf-8"))), com.xmlywind.volley.toolbox.h.a(iVar));
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return com.xmlywind.volley.n.a(new com.xmlywind.volley.k(th));
        }
    }

    @Override // com.xmlywind.volley.l
    public void a(s sVar) {
        SigmobLog.e("send tracking: " + h() + " fail");
        super.a(sVar);
    }

    @Override // com.xmlywind.volley.l
    public void a(JSONObject jSONObject) {
        a aVar;
        synchronized (this.a) {
            aVar = this.b;
        }
        SigmobLog.i("send tracking: " + h() + " success");
        if (aVar != null) {
            aVar.onSuccess(jSONObject);
        }
    }
}
