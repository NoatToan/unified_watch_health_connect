package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.io.ByteStreams;
import com.google.common.net.HttpHeaders;
import fa.z;
import ha.m;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private d() {
    }

    public static byte[] a(ha.d dVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        m mVar = new m(dVar);
        ha.g.b bVar = new ha.g.b();
        bVar.f82565a = Uri.parse(str);
        bVar.f82569e = map;
        bVar.f82567c = 2;
        bVar.f82568d = bArr;
        bVar.f82573i = 1;
        ha.g gVarA = bVar.a();
        int i14 = 0;
        int i15 = 0;
        ha.g gVarA2 = gVarA;
        while (true) {
            try {
                ha.e eVar = new ha.e(mVar, gVarA2);
                try {
                    byte[] byteArray = ByteStreams.toByteArray(eVar);
                    z.g(eVar);
                    return byteArray;
                } catch (HttpDataSource$InvalidResponseCodeException e4) {
                    try {
                        int i16 = e4.responseCode;
                        String str2 = ((i16 != 307 && i16 != 308) || i15 >= 5 || (map2 = e4.headerFields) == null || (list = map2.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) ? null : list.get(i14);
                        if (str2 == null) {
                            throw e4;
                        }
                        i15++;
                        ha.g.b bVar2 = new ha.g.b();
                        bVar2.f82565a = Uri.parse(str2);
                        gVarA2 = bVar2.a();
                        z.g(eVar);
                    } catch (Throwable th3) {
                        z.g(eVar);
                        throw th3;
                    }
                }
            } catch (Exception e14) {
                Uri uri = mVar.f82618c;
                uri.getClass();
                throw new MediaDrmCallbackException(gVarA, uri, mVar.f82616a.getResponseHeaders(), mVar.f82617b, e14);
            }
        }
    }

    public static boolean b(Throwable th3) {
        return z.f70071a == 34 && (th3 instanceof NoSuchMethodError) && th3.getMessage() != null && th3.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th3) {
        return z.f70071a == 34 && (th3 instanceof NoSuchMethodError) && th3.getMessage() != null && th3.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
