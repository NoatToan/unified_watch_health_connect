package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class lqr {
    private byte[] d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40658c = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40657a = 0;

    public byte[] a() {
        return this.d;
    }

    public void d(byte[] bArr) {
        if (bArr != null) {
            this.d = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public int b() {
        return this.f40658c;
    }

    public int d() {
        return this.f40657a;
    }

    public String toString() {
        try {
            return "NSPResponse [status=" + this.f40658c + ", code=" + this.f40657a + ", content=" + Arrays.toString(this.d) + " == " + new String(this.d, "UTF-8") + "]";
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("UIME_NspResponse", "toString Exception e = ", e.getMessage());
            return "";
        }
    }
}
