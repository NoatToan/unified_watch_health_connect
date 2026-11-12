package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f5726b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i == 1000) {
                return this.f5725a == String.class ? jSONObject.optString("result") : com.alipay.a.a.e.b(jSONObject.optString("result"), this.f5725a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.f5726b));
            sb.append(":");
            sb.append(e);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
