package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.mibi.sdk.component.Constants;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    private int c;
    private Object d;

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", com.alipay.a.a.f.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f5727a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            Objects.toString(this.f5728b);
            Object obj = this.f5728b;
            arrayList.add(new BasicNameValuePair(Constants.KEY_REQUEST_DATA, obj == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : com.alipay.a.a.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f5728b);
            sb2.append(":");
            sb2.append(e);
            throw new RpcException(9, sb2.toString() == null ? "" : e.getMessage(), e);
        }
    }
}
