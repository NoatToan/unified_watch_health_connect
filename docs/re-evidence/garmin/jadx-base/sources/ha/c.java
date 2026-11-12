package ha;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import fa.z;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f82545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f82546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82548h;

    public c() {
        super(false);
    }

    @Override // ha.d
    public final long b(g gVar) throws ParserException, DataSourceException {
        e(gVar);
        this.f82545e = gVar;
        Uri uri = gVar.f82555a;
        long j8 = gVar.f82561g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        fa.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i14 = z.f70071a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f82546f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e4);
            }
        } else {
            this.f82546f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j14 = gVar.f82560f;
        byte[] bArr = this.f82546f;
        if (j14 > bArr.length) {
            this.f82546f = null;
            throw new DataSourceException(2008);
        }
        int i15 = (int) j14;
        this.f82547g = i15;
        int length = bArr.length - i15;
        this.f82548h = length;
        if (j8 != -1) {
            this.f82548h = (int) Math.min(length, j8);
        }
        f(gVar);
        return j8 != -1 ? j8 : this.f82548h;
    }

    @Override // ha.d
    public final void close() {
        if (this.f82546f != null) {
            this.f82546f = null;
            d();
        }
        this.f82545e = null;
    }

    @Override // ha.d
    public final Uri getUri() {
        g gVar = this.f82545e;
        if (gVar != null) {
            return gVar.f82555a;
        }
        return null;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        int i16 = this.f82548h;
        if (i16 == 0) {
            return -1;
        }
        int iMin = Math.min(i15, i16);
        byte[] bArr2 = this.f82546f;
        int i17 = z.f70071a;
        System.arraycopy(bArr2, this.f82547g, bArr, i14, iMin);
        this.f82547g += iMin;
        this.f82548h -= iMin;
        c(iMin);
        return iMin;
    }
}
