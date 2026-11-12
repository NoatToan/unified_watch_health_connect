package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class zn5 extends m62 {
    public b e;
    public byte[] f;
    public int g;
    public int h;

    public zn5() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        t(bVar);
        this.e = bVar;
        Uri uri = bVar.f8404a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String strValueOf = String.valueOf(scheme);
            throw new ParserException(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        }
        String[] strArrM0 = wlq.M0(uri.getSchemeSpecificPart(), ",");
        if (strArrM0.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw new ParserException(sb.toString());
        }
        String str = strArrM0[1];
        if (strArrM0[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String strValueOf3 = String.valueOf(str);
                throw new ParserException(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.f = wlq.i0(URLDecoder.decode(str, bu3.f4606a.name()));
        }
        long j = bVar.g;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new DataSourceException(0);
        }
        int i = (int) j;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        long j2 = bVar.h;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        u(bVar);
        long j3 = bVar.h;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f != null) {
            this.f = null;
            s();
        }
        this.e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar.f8404a;
        }
        return null;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(wlq.j(this.f), this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        r(iMin);
        return iMin;
    }
}
