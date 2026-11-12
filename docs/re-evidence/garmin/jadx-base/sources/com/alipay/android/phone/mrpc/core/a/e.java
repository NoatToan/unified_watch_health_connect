package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28271d;

    public e(int i14, String str, Object obj) {
        super(str, obj);
        this.f28270c = i14;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f28271d != null) {
                arrayList.add(new BasicNameValuePair("extParam", ng.f.a(this.f28271d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f28268a));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f28270c);
            arrayList.add(new BasicNameValuePair(TtmlNode.ATTR_ID, sb3.toString()));
            Objects.toString(this.f28269b);
            Object obj = this.f28269b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : ng.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e4) {
            StringBuilder sb4 = new StringBuilder("request  =");
            sb4.append(this.f28269b);
            sb4.append(":");
            sb4.append(e4);
            throw new RpcException(9, e4.getMessage(), e4);
        }
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f28271d = obj;
    }
}
