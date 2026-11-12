package com.facebook.react.devsupport;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSource f7336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7337b;
    public long c;

    public interface a {
        void a(Map<String, String> map, Buffer buffer, boolean z) throws IOException;

        void b(Map<String, String> map, long j, long j2) throws IOException;
    }

    public f(BufferedSource bufferedSource, String str) {
        this.f7336a = bufferedSource;
        this.f7337b = str;
    }

    public final void a(Buffer buffer, boolean z, a aVar) throws IOException {
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("\r\n\r\n");
        long jIndexOf = buffer.indexOf(byteStringEncodeUtf8);
        if (jIndexOf == -1) {
            aVar.a(null, buffer, z);
            return;
        }
        Buffer buffer2 = new Buffer();
        Buffer buffer3 = new Buffer();
        buffer.read(buffer2, jIndexOf);
        buffer.skip(byteStringEncodeUtf8.size());
        buffer.readAll(buffer3);
        aVar.a(c(buffer2), buffer3, z);
    }

    public final void b(Map<String, String> map, long j, boolean z, a aVar) throws IOException {
        if (map == null || aVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.c > 16 || z) {
            this.c = jCurrentTimeMillis;
            aVar.b(map, j, map.get(HTTP.CONTENT_LEN) != null ? Long.parseLong(map.get(HTTP.CONTENT_LEN)) : 0L);
        }
    }

    public final Map<String, String> c(Buffer buffer) {
        HashMap map = new HashMap();
        for (String str : buffer.readUtf8().split("\r\n")) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean d(a aVar) throws IOException {
        boolean z;
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("\r\n--" + this.f7337b + "\r\n");
        ByteString byteStringEncodeUtf9 = ByteString.encodeUtf8("\r\n--" + this.f7337b + "--\r\n");
        ByteString byteStringEncodeUtf10 = ByteString.encodeUtf8("\r\n\r\n");
        Buffer buffer = new Buffer();
        long j = 0L;
        long size = 0L;
        long size2 = 0L;
        Map<String, String> mapC = null;
        while (true) {
            long jMax = Math.max(j - ((long) byteStringEncodeUtf9.size()), size);
            long jIndexOf = buffer.indexOf(byteStringEncodeUtf8, jMax);
            if (jIndexOf == -1) {
                jIndexOf = buffer.indexOf(byteStringEncodeUtf9, jMax);
                z = true;
            } else {
                z = false;
            }
            if (jIndexOf == -1) {
                long size3 = buffer.size();
                if (mapC == null) {
                    long jIndexOf2 = buffer.indexOf(byteStringEncodeUtf10, jMax);
                    if (jIndexOf2 >= 0) {
                        this.f7336a.read(buffer, jIndexOf2);
                        Buffer buffer2 = new Buffer();
                        buffer.copyTo(buffer2, jMax, jIndexOf2 - jMax);
                        size2 = buffer2.size() + ((long) byteStringEncodeUtf10.size());
                        mapC = c(buffer2);
                    }
                } else {
                    b(mapC, buffer.size() - size2, false, aVar);
                }
                if (this.f7336a.read(buffer, 4096) <= 0) {
                    return false;
                }
                j = size3;
                size = size;
            } else {
                long j2 = size;
                long j3 = jIndexOf - j2;
                if (j2 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(j2);
                    buffer.read(buffer3, j3);
                    b(mapC, buffer3.size() - size2, true, aVar);
                    a(buffer3, z, aVar);
                    size2 = 0;
                    mapC = null;
                } else {
                    buffer.skip(jIndexOf);
                }
                if (z) {
                    return true;
                }
                size = byteStringEncodeUtf8.size();
                j = size;
            }
        }
    }
}
