package com.alipay.android.phone.mrpc.core.a;

import android.util.Log;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes4.dex */
public class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1973c;
    private Object d;

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", com.alipay.sdk.m.f.a.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f1971a));
            arrayList.add(new BasicNameValuePair("id", this.f1973c + ""));
            StringBuilder sb = new StringBuilder("mParams is:");
            sb.append(this.f1972b);
            Log.d("JsonSerializer", sb.toString());
            Object obj = this.f1972b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? "[]" : com.alipay.sdk.m.f.a.a(obj)));
            String str = URLEncodedUtils.format(arrayList, "utf-8");
            Log.i("JsonSerializer", "request = " + str);
            return str.getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f1972b);
            sb2.append(":");
            sb2.append(e);
            throw new RpcException(9, sb2.toString() != null ? e.getMessage() : "", e);
        }
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public void a(Object obj) {
        this.d = obj;
    }

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.f1973c = i;
    }
}
