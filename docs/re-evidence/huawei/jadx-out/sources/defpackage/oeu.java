package defpackage;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public class oeu extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Headers f44266a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f44267c;
    private ResponseBody d;
    private int e;

    public oeu(int i, String str, byte[] bArr, Headers headers, ResponseBody responseBody) {
        super(str);
        this.e = i;
        this.f44267c = bArr;
        this.f44266a = headers;
        this.d = responseBody;
    }

    public Headers c() {
        return this.f44266a;
    }

    public byte[] a() {
        return this.f44267c;
    }

    public int e() {
        return this.e;
    }

    public ResponseBody b() {
        return this.d;
    }
}
