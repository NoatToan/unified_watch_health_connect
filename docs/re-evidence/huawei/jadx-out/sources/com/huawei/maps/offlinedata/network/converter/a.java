package com.huawei.maps.offlinedata.network.converter;

import android.text.TextUtils;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.network.converter.a$a, reason: collision with other inner class name */
    class C0187a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f17869b;

        C0187a(String str, byte[] bArr) {
            this.f17868a = str;
            this.f17869b = bArr;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public String contentType() {
            return this.f17868a;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public void writeTo(OutputStream outputStream) throws IOException {
            try {
                outputStream.write(this.f17869b);
            } catch (IOException e) {
                g.d("RequestBodyProviders", "the requestBody with writeTo has other error");
                throw new IOException(e.getMessage());
            }
        }
    }

    class b extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f17871b;

        b(String str, byte[] bArr) {
            this.f17870a = str;
            this.f17871b = bArr;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public String contentType() {
            String str = this.f17870a;
            return str == null ? "text/plain; charset=UTF-8" : str;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public void writeTo(OutputStream outputStream) throws IOException {
            try {
                outputStream.write(this.f17871b);
            } catch (IOException e) {
                g.d("RequestBodyProviders", "the requestBody with writeTo has other error");
                throw new IOException(e.getMessage());
            }
        }
    }

    public static RequestBody a(String str, byte[] bArr) {
        com.huawei.maps.offlinedata.network.converter.b bVar = new com.huawei.maps.offlinedata.network.converter.b();
        if (str == null) {
            str = "text/plain; charset=UTF-8";
        }
        bVar.a(str);
        bVar.a(bArr);
        String strA = d.a(bVar);
        if (bArr == null || TextUtils.isEmpty(strA)) {
            throw new NullPointerException("content == null");
        }
        return new C0187a(strA, bArr);
    }

    public static RequestBody b(String str, byte[] bArr) {
        if (bArr != null) {
            return new b(str, bArr);
        }
        throw new NullPointerException("content == null");
    }
}
