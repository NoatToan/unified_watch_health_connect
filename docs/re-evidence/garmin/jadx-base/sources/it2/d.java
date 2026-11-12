package it2;

import com.garmin.io.cobs.CobsDecodeException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f94983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f94984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f94986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94987e;

    public d(InputStream inputStream, int i14) {
        this.f94984b = new b();
        if (inputStream == null) {
            h.s("input is null");
            throw null;
        }
        this.f94983a = inputStream;
        if (i14 > 0) {
            this.f94985c = i14;
        } else {
            h.s("maxPacketSize must be positive");
            throw null;
        }
    }

    public final byte[] a() {
        int i14;
        byte[] bArr = this.f94986d;
        int i15 = this.f94985c;
        if (bArr == null || bArr.length != i15) {
            bArr = new byte[i15];
            this.f94986d = bArr;
        }
        boolean z14 = this.f94987e;
        InputStream inputStream = this.f94983a;
        if (!z14) {
            while (true) {
                int i16 = inputStream.read();
                if (i16 == 0) {
                    break;
                }
                if (i16 == -1) {
                    h.m();
                    return null;
                }
                String.format("Found non-zero byte looking for framing byte: %x", Integer.valueOf(i16));
            }
        }
        int i17 = 0;
        this.f94987e = false;
        do {
            i14 = inputStream.read();
        } while (i14 == 0);
        while (i14 != -1) {
            int i18 = i17 + 1;
            bArr[i17] = (byte) i14;
            i14 = inputStream.read();
            if (i14 == 0 || i18 >= bArr.length) {
                try {
                    return this.f94984b.a(bArr, i18);
                } catch (CobsDecodeException e4) {
                    if (e4.failure() == a.ENCODE_BUFFER_OVERRUN) {
                        this.f94987e = true;
                    }
                    throw e4;
                }
            }
            i17 = i18;
        }
        h.m();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f94983a.close();
    }

    public d(InputStream inputStream) {
        this(inputStream, 16384);
    }
}
