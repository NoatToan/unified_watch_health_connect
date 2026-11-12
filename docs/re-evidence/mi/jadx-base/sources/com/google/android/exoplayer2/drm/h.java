package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.accountsdk.request.SimpleRequest;
import defpackage.dp5;
import defpackage.g83;
import defpackage.jdo;
import defpackage.rk1;
import defpackage.wlq;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpDataSource.b f7908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7909b;
    public final boolean c;
    public final Map<String, String> d;

    public h(String str, boolean z, HttpDataSource.b bVar) {
        rk1.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f7908a = bVar;
        this.f7909b = str;
        this.c = z;
        this.d = new HashMap();
    }

    public static byte[] c(HttpDataSource.b bVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        jdo jdoVar = new jdo(bVar.a());
        com.google.android.exoplayer2.upstream.b bVarA = new com.google.android.exoplayer2.upstream.b.C0206b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i = 0;
        com.google.android.exoplayer2.upstream.b bVarA2 = bVarA;
        while (true) {
            try {
                dp5 dp5Var = new dp5(jdoVar, bVarA2);
                try {
                    try {
                        byte[] bArrS0 = wlq.S0(dp5Var);
                        wlq.o(dp5Var);
                        return bArrS0;
                    } catch (HttpDataSource.InvalidResponseCodeException e) {
                        String strD = d(e, i);
                        if (strD == null) {
                            throw e;
                        }
                        i++;
                        bVarA2 = bVarA2.a().j(strD).a();
                        wlq.o(dp5Var);
                    }
                } catch (Throwable th) {
                    wlq.o(dp5Var);
                    throw th;
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(bVarA, (Uri) rk1.e(jdoVar.s()), jdoVar.d(), jdoVar.r(), e2);
            }
        }
    }

    public static String d(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = invalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get(SimpleRequest.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public byte[] a(UUID uuid, f.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.c || TextUtils.isEmpty(strB)) {
            strB = this.f7909b;
        }
        if (TextUtils.isEmpty(strB)) {
            com.google.android.exoplayer2.upstream.b.C0206b c0206b = new com.google.android.exoplayer2.upstream.b.C0206b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(c0206b.i(uri).a(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = g83.e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = g83.c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            map.putAll(this.d);
        }
        return c(this.f7908a, strB, aVar.a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public byte[] b(UUID uuid, f.g gVar) throws MediaDrmCallbackException {
        String strB = gVar.b();
        String strE = wlq.E(gVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 15 + String.valueOf(strE).length());
        sb.append(strB);
        sb.append("&signedRequest=");
        sb.append(strE);
        return c(this.f7908a, sb.toString(), null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        rk1.e(str);
        rk1.e(str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }
}
