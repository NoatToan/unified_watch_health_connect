package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f28267b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i14 = jSONObject.getInt("resultStatus");
            if (i14 == 1000) {
                return this.f28266a == String.class ? jSONObject.optString("result") : ng.e.b(jSONObject.optString("result"), this.f28266a);
            }
            throw new RpcException(Integer.valueOf(i14), jSONObject.optString("tips"));
        } catch (Exception e4) {
            new String(this.f28267b);
            e4.toString();
            throw new RpcException((Integer) 10, e4.getMessage());
        }
    }
}
