package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.muxer.Mp4Utils;
import com.google.common.base.Ascii;
import com.huawei.operation.utils.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.connection.RealConnection;
import okio.Utf8;
import okio.internal.Buffer;

/* JADX INFO: loaded from: classes34.dex */
public final class bb implements db, cb, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14651c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final int d = 65533;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public vb f14652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14653b;

    @Override // com.huawei.hms.network.embedded.db, com.huawei.hms.network.embedded.cb
    public bb a() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb c() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
    public void close() {
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb d() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb, com.huawei.hms.network.embedded.yb, java.io.Flushable
    public void flush() {
    }

    @Override // com.huawei.hms.network.embedded.db
    public bb g() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final eb z() {
        return b("SHA-256");
    }

    public final eb y() {
        return b("SHA-1");
    }

    public List<Integer> x() {
        if (this.f14652a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        vb vbVar = this.f14652a;
        arrayList.add(Integer.valueOf(vbVar.f15548c - vbVar.f15547b));
        vb vbVar2 = this.f14652a;
        while (true) {
            vbVar2 = vbVar2.f;
            if (vbVar2 == this.f14652a) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(vbVar2.f15548c - vbVar2.f15547b));
        }
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb writeShort(int i) {
        vb vbVarE = e(2);
        byte[] bArr = vbVarE.f15546a;
        int i2 = vbVarE.f15548c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        vbVarE.f15548c = i2 + 2;
        this.f14653b += 2;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb writeLong(long j) {
        vb vbVarE = e(8);
        byte[] bArr = vbVarE.f15546a;
        int i = vbVarE.f15548c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        vbVarE.f15548c = i + 8;
        this.f14653b += 8;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb writeInt(int i) {
        vb vbVarE = e(4);
        byte[] bArr = vbVarE.f15546a;
        int i2 = vbVarE.f15548c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        vbVarE.f15548c = i2 + 4;
        this.f14653b += 4;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb writeByte(int i) {
        vb vbVarE = e(1);
        byte[] bArr = vbVarE.f15546a;
        int i2 = vbVarE.f15548c;
        vbVarE.f15548c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f14653b++;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) {
        if (bbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (bbVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        cc.a(bbVar.f14653b, 0L, j);
        while (j > 0) {
            vb vbVar = bbVar.f14652a;
            if (j < vbVar.f15548c - vbVar.f15547b) {
                vb vbVar2 = this.f14652a;
                vb vbVar3 = vbVar2 != null ? vbVar2.g : null;
                if (vbVar3 != null && vbVar3.e) {
                    if ((((long) vbVar3.f15548c) + j) - ((long) (vbVar3.d ? 0 : vbVar3.f15547b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        bbVar.f14652a.a(vbVar3, (int) j);
                        bbVar.f14653b -= j;
                        this.f14653b += j;
                        return;
                    }
                }
                bbVar.f14652a = bbVar.f14652a.a((int) j);
            }
            vb vbVar4 = bbVar.f14652a;
            long j2 = vbVar4.f15548c - vbVar4.f15547b;
            bbVar.f14652a = vbVar4.b();
            vb vbVar5 = this.f14652a;
            if (vbVar5 == null) {
                this.f14652a = vbVar4;
                vbVar4.g = vbVar4;
                vbVar4.f = vbVar4;
            } else {
                vbVar5.g.a(vbVar4).a();
            }
            bbVar.f14653b -= j2;
            this.f14653b += j2;
            j -= j2;
        }
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        cc.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            vb vbVarE = e(1);
            int iMin = Math.min(i3 - i, 8192 - vbVarE.f15548c);
            System.arraycopy(bArr, i, vbVarE.f15546a, vbVarE.f15548c, iMin);
            i += iMin;
            vbVarE.f15548c += iMin;
        }
        this.f14653b += j;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            vb vbVarE = e(1);
            int iMin = Math.min(i, 8192 - vbVarE.f15548c);
            byteBuffer.get(vbVarE.f15546a, vbVarE.f15548c, iMin);
            i -= iMin;
            vbVarE.f15548c += iMin;
        }
        this.f14653b += (long) iRemaining;
        return iRemaining;
    }

    public final c w() {
        return b(new c());
    }

    public final c v() {
        return a(new c());
    }

    public final eb u() {
        return b("MD5");
    }

    public String toString() {
        return C().toString();
    }

    @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return ac.d;
    }

    public final long t() {
        long j = this.f14653b;
        if (j == 0) {
            return 0L;
        }
        vb vbVar = this.f14652a.g;
        int i = vbVar.f15548c;
        return (i >= 8192 || !vbVar.e) ? j : j - ((long) (i - vbVar.f15547b));
    }

    @Override // com.huawei.hms.network.embedded.db
    public void skip(long j) throws EOFException {
        while (j > 0) {
            vb vbVar = this.f14652a;
            if (vbVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, vbVar.f15548c - vbVar.f15547b);
            long j2 = iMin;
            this.f14653b -= j2;
            j -= j2;
            vb vbVar2 = this.f14652a;
            vbVar2.f15547b += iMin;
            if (vbVar2.f15547b == vbVar2.f15548c) {
                this.f14652a = vbVar2.b();
                wb.a(vbVar2);
            }
        }
    }

    public final void s() {
        try {
            skip(this.f14653b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public short readShort() {
        int i;
        int i2;
        long j = this.f14653b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f14653b);
        }
        vb vbVar = this.f14652a;
        int i3 = vbVar.f15547b;
        int i4 = vbVar.f15548c;
        if (i4 - i3 < 2) {
            i = (readByte() & 255) << 8;
            i2 = readByte() & 255;
        } else {
            byte[] bArr = vbVar.f15546a;
            byte b2 = bArr[i3];
            int i5 = i3 + 2;
            byte b3 = bArr[i3 + 1];
            this.f14653b = j - 2;
            if (i5 == i4) {
                this.f14652a = vbVar.b();
                wb.a(vbVar);
            } else {
                vbVar.f15547b = i5;
            }
            i = b3 & 255;
            i2 = (b2 & 255) << 8;
        }
        return (short) (i | i2);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long readLong() {
        long j = this.f14653b;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f14653b);
        }
        vb vbVar = this.f14652a;
        int i = vbVar.f15547b;
        int i2 = vbVar.f15548c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & Mp4Utils.UNSIGNED_INT_MAX_VALUE) << 32) | (Mp4Utils.UNSIGNED_INT_MAX_VALUE & ((long) readInt()));
        }
        byte[] bArr = vbVar.f15546a;
        long j2 = bArr[i];
        long j3 = bArr[i + 1];
        long j4 = bArr[i + 2];
        int i3 = i + 8;
        long j5 = (j4 & 255) << 40;
        long j6 = ((((long) bArr[i + 5]) & 255) << 16) | j5 | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        this.f14653b = j - 8;
        if (i3 != i2) {
            vbVar.f15547b = i3;
            return j6;
        }
        this.f14652a = vbVar.b();
        wb.a(vbVar);
        return j6;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int readInt() {
        long j = this.f14653b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f14653b);
        }
        vb vbVar = this.f14652a;
        int i = vbVar.f15547b;
        int i2 = vbVar.f15548c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = vbVar.f15546a;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.f14653b = j - 4;
        if (i3 != i2) {
            vbVar.f15547b = i3;
            return i4;
        }
        this.f14652a = vbVar.b();
        wb.a(vbVar);
        return i4;
    }

    @Override // com.huawei.hms.network.embedded.db
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte readByte() {
        long j = this.f14653b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        vb vbVar = this.f14652a;
        int i = vbVar.f15547b;
        int i2 = vbVar.f15548c;
        int i3 = i + 1;
        byte b2 = vbVar.f15546a[i];
        this.f14653b = j - 1;
        if (i3 != i2) {
            vbVar.f15547b = i3;
            return b2;
        }
        this.f14652a = vbVar.b();
        wb.a(vbVar);
        return b2;
    }

    @Override // com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j) {
        if (bbVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.f14653b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        bbVar.write(this, j);
        return j;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int read(byte[] bArr, int i, int i2) {
        cc.a(bArr.length, i, i2);
        vb vbVar = this.f14652a;
        if (vbVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, vbVar.f15548c - vbVar.f15547b);
        System.arraycopy(vbVar.f15546a, vbVar.f15547b, bArr, i, iMin);
        vbVar.f15547b += iMin;
        this.f14653b -= (long) iMin;
        if (vbVar.f15547b == vbVar.f15548c) {
            this.f14652a = vbVar.b();
            wb.a(vbVar);
        }
        return iMin;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        vb vbVar = this.f14652a;
        if (vbVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), vbVar.f15548c - vbVar.f15547b);
        byteBuffer.put(vbVar.f15546a, vbVar.f15547b, iMin);
        vbVar.f15547b += iMin;
        this.f14653b -= (long) iMin;
        if (vbVar.f15547b == vbVar.f15548c) {
            this.f14652a = vbVar.b();
            wb.a(vbVar);
        }
        return iMin;
    }

    @Override // com.huawei.hms.network.embedded.db
    public eb r() {
        return new eb(q());
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte[] q() {
        try {
            return g(this.f14653b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public db peek() {
        return ob.a(new qb(this));
    }

    @Override // com.huawei.hms.network.embedded.db
    public long p() {
        if (this.f14653b == 0) {
            throw new IllegalStateException("size == 0");
        }
        boolean z = false;
        int i = 0;
        long j = -7;
        long j2 = 0;
        boolean z2 = false;
        do {
            vb vbVar = this.f14652a;
            byte[] bArr = vbVar.f15546a;
            int i2 = vbVar.f15547b;
            int i3 = vbVar.f15548c;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j2 < Buffer.OVERFLOW_ZONE || (j2 == Buffer.OVERFLOW_ZONE && i4 < j)) {
                        bb bbVarWriteByte = new bb().a(j2).writeByte((int) b2);
                        if (!z) {
                            bbVarWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bbVarWriteByte.o());
                    }
                    j2 = (j2 * 10) + ((long) i4);
                } else {
                    if (b2 != 45 || i != 0) {
                        if (i != 0) {
                            z2 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(b2));
                    }
                    j--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f14652a = vbVar.b();
                wb.a(vbVar);
            } else {
                vbVar.f15547b = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f14652a != null);
        this.f14653b -= (long) i;
        return z ? j2 : -j2;
    }

    @Override // com.huawei.hms.network.embedded.db
    public String o() {
        try {
            return a(this.f14653b, cc.f14686a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public String n() throws EOFException {
        return e(Long.MAX_VALUE);
    }

    @Override // com.huawei.hms.network.embedded.db
    public InputStream m() {
        return new b();
    }

    @Override // com.huawei.hms.network.embedded.db
    @Nullable
    public String l() throws EOFException {
        long jA = a((byte) 10);
        if (jA != -1) {
            return k(jA);
        }
        long j = this.f14653b;
        if (j != 0) {
            return f(j);
        }
        return null;
    }

    public String k(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (j(j2) == 13) {
                String strF = f(j2);
                skip(2L);
                return strF;
            }
        }
        String strF2 = f(j);
        skip(1L);
        return strF2;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long k() {
        int i;
        if (this.f14653b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            vb vbVar = this.f14652a;
            byte[] bArr = vbVar.f15546a;
            int i3 = vbVar.f15547b;
            int i4 = vbVar.f15548c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b2));
                    }
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new bb().c(j).writeByte((int) b2).o());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f14652a = vbVar.b();
                wb.a(vbVar);
            } else {
                vbVar.f15547b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f14652a != null);
        this.f14653b -= (long) i2;
        return j;
    }

    @Override // com.huawei.hms.network.embedded.db
    public short j() {
        return cc.a(readShort());
    }

    public final byte j(long j) {
        int i;
        cc.a(this.f14653b, j, 1L);
        long j2 = this.f14653b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            vb vbVar = this.f14652a;
            do {
                vbVar = vbVar.g;
                int i2 = vbVar.f15548c;
                i = vbVar.f15547b;
                j3 += (long) (i2 - i);
            } while (j3 < 0);
            return vbVar.f15546a[i + ((int) j3)];
        }
        vb vbVar2 = this.f14652a;
        while (true) {
            int i3 = vbVar2.f15548c;
            int i4 = vbVar2.f15547b;
            long j4 = i3 - i4;
            if (j < j4) {
                return vbVar2.f15546a[i4 + ((int) j)];
            }
            j -= j4;
            vbVar2 = vbVar2.f;
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean i() {
        return this.f14653b == 0;
    }

    @Override // com.huawei.hms.network.embedded.db
    public void i(long j) throws EOFException {
        if (this.f14653b < j) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        vb vbVar = this.f14652a;
        if (vbVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vbVar.f15548c;
            for (int i3 = vbVar.f15547b; i3 < i2; i3++) {
                i = (i * 31) + vbVar.f15546a[i3];
            }
            vbVar = vbVar.f;
        } while (vbVar != this.f14652a);
        return i;
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean h(long j) {
        return this.f14653b >= j;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int h() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f14653b == 0) {
            throw new EOFException();
        }
        byte bJ = j(0L);
        if ((bJ & 128) == 0) {
            i = bJ & Ascii.DEL;
            i3 = 0;
            i2 = 1;
        } else if ((bJ & 224) == 192) {
            i = bJ & Ascii.US;
            i2 = 2;
            i3 = 128;
        } else if ((bJ & 240) == 224) {
            i = bJ & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bJ & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bJ & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f14653b < j) {
            throw new EOFException("size < " + i2 + ": " + this.f14653b + " (to read code point prefixed 0x" + Integer.toHexString(bJ) + Constants.RIGHT_BRACKET_ONLY);
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bJ2 = j(j2);
            if ((bJ2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bJ2 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte[] g(long j) throws EOFException {
        cc.a(this.f14653b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.huawei.hms.network.embedded.db
    public String f(long j) throws EOFException {
        return a(j, cc.f14686a);
    }

    public final eb f(eb ebVar) {
        return a("HmacSHA512", ebVar);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long f() {
        return cc.a(readLong());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        long j = this.f14653b;
        if (j != bbVar.f14653b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        vb vbVar = this.f14652a;
        vb vbVar2 = bbVar.f14652a;
        int i = vbVar.f15547b;
        int i2 = vbVar2.f15547b;
        while (j2 < this.f14653b) {
            long jMin = Math.min(vbVar.f15548c - i, vbVar2.f15548c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                if (vbVar.f15546a[i] != vbVar2.f15546a[i2]) {
                    return false;
                }
                i3++;
                i++;
                i2++;
            }
            if (i == vbVar.f15548c) {
                vbVar = vbVar.f;
                i = vbVar.f15547b;
            }
            if (i2 == vbVar2.f15548c) {
                vbVar2 = vbVar2.f;
                i2 = vbVar2.f15547b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.huawei.hms.network.embedded.db
    public String e(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j2);
        if (jA != -1) {
            return k(jA);
        }
        if (j2 < B() && j(j2 - 1) == 13 && j(j2) == 10) {
            return k(j2);
        }
        bb bbVar = new bb();
        a(bbVar, 0L, Math.min(32L, B()));
        throw new EOFException("\\n not found: limit=" + Math.min(B(), j) + " content=" + bbVar.r().d() + (char) 8230);
    }

    public vb e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        vb vbVar = this.f14652a;
        if (vbVar != null) {
            vb vbVar2 = vbVar.g;
            return (vbVar2.f15548c + i > 8192 || !vbVar2.e) ? vbVar2.a(wb.a()) : vbVar2;
        }
        vb vbVarA = wb.a();
        this.f14652a = vbVarA;
        vbVarA.g = vbVarA;
        vbVarA.f = vbVarA;
        return vbVarA;
    }

    public final eb e(eb ebVar) {
        return a("HmacSHA256", ebVar);
    }

    @Override // com.huawei.hms.network.embedded.db
    public int e() {
        return cc.a(readInt());
    }

    public final eb d(eb ebVar) {
        return a("HmacSHA1", ebVar);
    }

    @Override // com.huawei.hms.network.embedded.db
    public eb d(long j) throws EOFException {
        return new eb(g(j));
    }

    public final eb d(int i) {
        return i == 0 ? eb.f : new xb(this, i);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public bb m1383clone() {
        bb bbVar = new bb();
        if (this.f14653b == 0) {
            return bbVar;
        }
        vb vbVarC = this.f14652a.c();
        bbVar.f14652a = vbVarC;
        vbVarC.g = vbVarC;
        vbVarC.f = vbVarC;
        vb vbVar = this.f14652a;
        while (true) {
            vbVar = vbVar.f;
            if (vbVar == this.f14652a) {
                bbVar.f14653b = this.f14653b;
                return bbVar;
            }
            bbVar.f14652a.g.a(vbVar.c());
        }
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb c(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        vb vbVarE = e(iNumberOfTrailingZeros);
        byte[] bArr = vbVarE.f15546a;
        int i = vbVarE.f15548c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f14651c[(int) (15 & j)];
            j >>>= 4;
        }
        vbVarE.f15548c += iNumberOfTrailingZeros;
        this.f14653b += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb c(int i) {
        int i2;
        int i3;
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            i3 = (i >> 6) | PsExtractor.AUDIO_STREAM;
        } else {
            if (i < 65536) {
                if (i >= 55296 && i <= 57343) {
                    writeByte(63);
                    return this;
                }
                i2 = (i >> 12) | 224;
            } else {
                if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                writeByte((i >> 18) | 240);
                i2 = ((i >> 12) & 63) | 128;
            }
            writeByte(i2);
            i3 = ((i >> 6) & 63) | 128;
        }
        writeByte(i3);
        writeByte((i & 63) | 128);
        return this;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long c(eb ebVar) {
        return b(ebVar, 0L);
    }

    @Override // com.huawei.hms.network.embedded.cb
    public OutputStream b() {
        return new a();
    }

    public final bb b(OutputStream outputStream) throws IOException {
        return a(outputStream, this.f14653b);
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb b(long j) {
        return writeLong(cc.a(j));
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb b(int i) {
        return writeShort((int) cc.a((short) i));
    }

    public final c b(c cVar) {
        if (cVar.f14656a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        cVar.f14656a = this;
        cVar.f14657b = false;
        return cVar;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long b(eb ebVar, long j) {
        int i;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        vb vbVar = this.f14652a;
        if (vbVar == null) {
            return -1L;
        }
        long j3 = this.f14653b;
        if (j3 - j < j) {
            while (j3 > j) {
                vbVar = vbVar.g;
                j3 -= (long) (vbVar.f15548c - vbVar.f15547b);
            }
        } else {
            while (true) {
                long j4 = ((long) (vbVar.f15548c - vbVar.f15547b)) + j2;
                if (j4 >= j) {
                    break;
                }
                vbVar = vbVar.f;
                j2 = j4;
            }
            j3 = j2;
        }
        if (ebVar.j() == 2) {
            byte bA = ebVar.a(0);
            byte bA2 = ebVar.a(1);
            while (j3 < this.f14653b) {
                byte[] bArr = vbVar.f15546a;
                i = (int) ((((long) vbVar.f15547b) + j) - j3);
                int i2 = vbVar.f15548c;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 == bA || b2 == bA2) {
                        return ((long) (i - vbVar.f15547b)) + j3;
                    }
                    i++;
                }
                j3 += (long) (vbVar.f15548c - vbVar.f15547b);
                vbVar = vbVar.f;
                j = j3;
            }
            return -1L;
        }
        byte[] bArrE = ebVar.e();
        while (j3 < this.f14653b) {
            byte[] bArr2 = vbVar.f15546a;
            i = (int) ((((long) vbVar.f15547b) + j) - j3);
            int i3 = vbVar.f15548c;
            while (i < i3) {
                byte b3 = bArr2[i];
                for (byte b4 : bArrE) {
                    if (b3 == b4) {
                        return ((long) (i - vbVar.f15547b)) + j3;
                    }
                }
                i++;
            }
            j3 += (long) (vbVar.f15548c - vbVar.f15547b);
            vbVar = vbVar.f;
            j = j3;
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long b(eb ebVar) throws IOException {
        return a(ebVar, 0L);
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean a(long j, eb ebVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f14653b - j < i2 || ebVar.j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (j(((long) i3) + j) != ebVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean a(long j, eb ebVar) {
        return a(j, ebVar, 0, ebVar.j());
    }

    @Override // com.huawei.hms.network.embedded.db
    public void a(bb bbVar, long j) throws EOFException {
        long j2 = this.f14653b;
        if (j2 >= j) {
            bbVar.write(this, j);
        } else {
            bbVar.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public String a(Charset charset) {
        try {
            return a(this.f14653b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public String a(long j, Charset charset) throws EOFException {
        cc.a(this.f14653b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        vb vbVar = this.f14652a;
        int i = vbVar.f15547b;
        if (((long) i) + j > vbVar.f15548c) {
            return new String(g(j), charset);
        }
        String str = new String(vbVar.f15546a, i, (int) j, charset);
        vbVar.f15547b = (int) (((long) vbVar.f15547b) + j);
        this.f14653b -= j;
        if (vbVar.f15547b == vbVar.f15548c) {
            this.f14652a = vbVar.b();
            wb.a(vbVar);
        }
        return str;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(zb zbVar, long j) throws IOException {
        while (j > 0) {
            long j2 = zbVar.read(this, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(String str, Charset charset) {
        return a(str, 0, str.length(), charset);
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(cc.f14686a)) {
            return a(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return write(bytes, 0, bytes.length);
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(String str, int i, int i2) {
        char cCharAt;
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                vb vbVarE = e(1);
                byte[] bArr = vbVarE.f15546a;
                int i4 = vbVarE.f15548c - i;
                int iMin = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) cCharAt2;
                while (true) {
                    i = i5;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i4] = (byte) cCharAt;
                }
                int i6 = vbVarE.f15548c;
                int i7 = (i4 + i) - i6;
                vbVarE.f15548c = i6 + i7;
                this.f14653b += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    i3 = (cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    writeByte((cCharAt2 >> '\f') | 224);
                    i3 = ((cCharAt2 >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        writeByte(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        writeByte((i9 >> 18) | 240);
                        writeByte(((i9 >> 12) & 63) | 128);
                        writeByte(((i9 >> 6) & 63) | 128);
                        writeByte((i9 & 63) | 128);
                        i += 2;
                    }
                }
                writeByte(i3);
                writeByte((cCharAt2 & '?') | 128);
                i++;
            }
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(String str) {
        return a(str, 0, str.length());
    }

    public final bb a(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        cc.a(this.f14653b, j, j2);
        if (j2 != 0) {
            vb vbVar = this.f14652a;
            while (true) {
                long j3 = vbVar.f15548c - vbVar.f15547b;
                if (j < j3) {
                    break;
                }
                j -= j3;
                vbVar = vbVar.f;
            }
            while (j2 > 0) {
                int i = (int) (((long) vbVar.f15547b) + j);
                int iMin = (int) Math.min(vbVar.f15548c - i, j2);
                outputStream.write(vbVar.f15546a, i, iMin);
                j2 -= (long) iMin;
                vbVar = vbVar.f;
                j = 0;
            }
        }
        return this;
    }

    public final bb a(OutputStream outputStream, long j) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        cc.a(this.f14653b, 0L, j);
        vb vbVar = this.f14652a;
        while (j > 0) {
            int iMin = (int) Math.min(j, vbVar.f15548c - vbVar.f15547b);
            outputStream.write(vbVar.f15546a, vbVar.f15547b, iMin);
            vbVar.f15547b += iMin;
            long j2 = iMin;
            this.f14653b -= j2;
            j -= j2;
            if (vbVar.f15547b == vbVar.f15548c) {
                vb vbVarB = vbVar.b();
                this.f14652a = vbVarB;
                wb.a(vbVar);
                vbVar = vbVarB;
            }
        }
        return this;
    }

    public final bb a(OutputStream outputStream) throws IOException {
        return a(outputStream, 0L, this.f14653b);
    }

    public final bb a(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            a(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public final bb a(InputStream inputStream) throws IOException {
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(eb ebVar) {
        if (ebVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        ebVar.a(this);
        return this;
    }

    public final bb a(bb bbVar, long j, long j2) {
        if (bbVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        cc.a(this.f14653b, j, j2);
        if (j2 != 0) {
            bbVar.f14653b += j2;
            vb vbVar = this.f14652a;
            while (true) {
                long j3 = vbVar.f15548c - vbVar.f15547b;
                if (j < j3) {
                    break;
                }
                j -= j3;
                vbVar = vbVar.f;
            }
            while (j2 > 0) {
                vb vbVarC = vbVar.c();
                vbVarC.f15547b = (int) (((long) vbVarC.f15547b) + j);
                vbVarC.f15548c = Math.min(vbVarC.f15547b + ((int) j2), vbVarC.f15548c);
                vb vbVar2 = bbVar.f14652a;
                if (vbVar2 == null) {
                    vbVarC.g = vbVarC;
                    vbVarC.f = vbVarC;
                    bbVar.f14652a = vbVarC;
                } else {
                    vbVar2.g.a(vbVarC);
                }
                j2 -= (long) (vbVarC.f15548c - vbVarC.f15547b);
                vbVar = vbVar.f;
                j = 0;
            }
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(long j) {
        boolean z;
        int i;
        if (j == 0) {
            return writeByte(48);
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return a("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    i = j < 10 ? 1 : 2;
                } else {
                    i = j < 1000 ? 3 : 4;
                }
            } else if (j < 1000000) {
                i = j < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        vb vbVarE = e(i);
        byte[] bArr = vbVarE.f15546a;
        int i2 = vbVarE.f15548c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f14651c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        vbVarE.f15548c += i;
        this.f14653b += (long) i;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a(int i) {
        return writeInt(cc.a(i));
    }

    public final c a(c cVar) {
        if (cVar.f14656a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        cVar.f14656a = this;
        cVar.f14657b = true;
        return cVar;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public long a(zb zbVar) throws IOException {
        if (zbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = zbVar.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(yb ybVar) throws IOException {
        long j = this.f14653b;
        if (j > 0) {
            ybVar.write(this, j);
        }
        return j;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(eb ebVar, long j) throws IOException {
        if (ebVar.j() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        vb vbVar = this.f14652a;
        long j3 = -1;
        if (vbVar == null) {
            return -1L;
        }
        long j4 = this.f14653b;
        if (j4 - j < j) {
            while (j4 > j) {
                vbVar = vbVar.g;
                j4 -= (long) (vbVar.f15548c - vbVar.f15547b);
            }
        } else {
            while (true) {
                long j5 = ((long) (vbVar.f15548c - vbVar.f15547b)) + j2;
                if (j5 >= j) {
                    break;
                }
                vbVar = vbVar.f;
                j2 = j5;
            }
            j4 = j2;
        }
        byte bA = ebVar.a(0);
        int iJ = ebVar.j();
        long j6 = 1 + (this.f14653b - ((long) iJ));
        long j7 = j;
        vb vbVar2 = vbVar;
        long j8 = j4;
        while (j8 < j6) {
            byte[] bArr = vbVar2.f15546a;
            int iMin = (int) Math.min(vbVar2.f15548c, (((long) vbVar2.f15547b) + j6) - j8);
            int i = (int) ((((long) vbVar2.f15547b) + j7) - j8);
            while (i < iMin) {
                if (bArr[i] == bA) {
                    if (a(vbVar2, i + 1, ebVar, 1, iJ)) {
                        return ((long) (i - vbVar2.f15547b)) + j8;
                    }
                }
                i++;
                bArr = bArr;
            }
            j8 += (long) (vbVar2.f15548c - vbVar2.f15547b);
            vbVar2 = vbVar2.f;
            j7 = j8;
            j3 = -1;
        }
        return j3;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2, long j, long j2) {
        vb vbVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f14653b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f14653b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (vbVar = this.f14652a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                vbVar = vbVar.g;
                j4 -= (long) (vbVar.f15548c - vbVar.f15547b);
            }
        } else {
            while (true) {
                long j6 = ((long) (vbVar.f15548c - vbVar.f15547b)) + j3;
                if (j6 >= j) {
                    break;
                }
                vbVar = vbVar.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = vbVar.f15546a;
            int iMin = (int) Math.min(vbVar.f15548c, (((long) vbVar.f15547b) + j5) - j4);
            for (int i = (int) ((((long) vbVar.f15547b) + j7) - j4); i < iMin; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - vbVar.f15547b)) + j4;
                }
            }
            j4 += (long) (vbVar.f15548c - vbVar.f15547b);
            vbVar = vbVar.f;
            j7 = j4;
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2, long j) {
        return a(b2, j, Long.MAX_VALUE);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[LOOP:0: B:9:0x001f->B:51:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[SYNTHETIC] */
    public int a(pb pbVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        vb vbVar;
        vb vbVar2 = this.f14652a;
        if (vbVar2 == null) {
            if (z) {
                return -2;
            }
            return pbVar.indexOf(eb.f);
        }
        byte[] bArr = vbVar2.f15546a;
        int i5 = vbVar2.f15547b;
        int i6 = vbVar2.f15548c;
        int[] iArr = pbVar.f15210b;
        int i7 = -1;
        vb vbVar3 = vbVar2;
        int i8 = -1;
        int i9 = 0;
        loop0: while (true) {
            int i10 = iArr[i9];
            int i11 = i9 + 2;
            int i12 = iArr[i9 + 1];
            if (i12 != i7) {
                i8 = i12;
            }
            if (vbVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                byte b2 = bArr[i5];
                for (int i14 = i11; i14 != i11 + i10; i14++) {
                    if ((b2 & 255) == iArr[i14]) {
                        i = iArr[i14 + i10];
                        if (i13 == i6) {
                            vbVar3 = vbVar3.f;
                            int i15 = vbVar3.f15547b;
                            byte[] bArr2 = vbVar3.f15546a;
                            i2 = vbVar3.f15548c;
                            if (vbVar3 == vbVar2) {
                                vbVar3 = null;
                            }
                            i3 = i15;
                            bArr = bArr2;
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        i9 = -i;
                        i5 = i3;
                        i6 = i2;
                        i7 = -1;
                    }
                }
                return i8;
            }
            int i16 = i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i16 + 1;
                if ((bArr[i5] & 255) == iArr[i16]) {
                    boolean z2 = i18 == (i10 * (-1)) + i11;
                    if (i17 == i6) {
                        vb vbVar4 = vbVar3.f;
                        i3 = vbVar4.f15547b;
                        byte[] bArr3 = vbVar4.f15546a;
                        i4 = vbVar4.f15548c;
                        if (vbVar4 != vbVar2) {
                            vbVar = vbVar4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            vbVar = null;
                        }
                    } else {
                        vb vbVar5 = vbVar3;
                        i4 = i6;
                        i3 = i17;
                        vbVar = vbVar5;
                    }
                    if (z2) {
                        i = iArr[i18];
                        int i19 = i4;
                        vbVar3 = vbVar;
                        i2 = i19;
                        break;
                    }
                    i5 = i3;
                    i16 = i18;
                    i6 = i4;
                    vbVar3 = vbVar;
                }
                return i8;
            }
            if (i >= 0) {
                return i;
            }
            i9 = -i;
            i5 = i3;
            i6 = i2;
            i7 = -1;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int a(pb pbVar) {
        int iA = a(pbVar, false);
        if (iA == -1) {
            return -1;
        }
        try {
            skip(pbVar.f15209a[iA].j());
            return iA;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final eb C() {
        long j = this.f14653b;
        if (j <= 2147483647L) {
            return d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f14653b);
    }

    public final long B() {
        return this.f14653b;
    }

    public class a extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            bb.this.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            bb.this.writeByte((int) ((byte) i));
        }

        public String toString() {
            return bb.this + ".outputStream()";
        }

        public a() {
        }
    }

    public class b extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public String toString() {
            return bb.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return bb.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int read() {
            bb bbVar = bb.this;
            if (bbVar.f14653b > 0) {
                return bbVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(bb.this.f14653b, 2147483647L);
        }

        public b() {
        }
    }

    public static final class c implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public bb f14656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public vb f14658c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int g = -1;

        public final int s() {
            long j = this.d;
            if (j != this.f14656a.f14653b) {
                return k(j == -1 ? 0L : j + ((long) (this.g - this.f)));
            }
            throw new IllegalStateException();
        }

        public final int k(long j) {
            if (j >= -1) {
                bb bbVar = this.f14656a;
                long j2 = bbVar.f14653b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f14658c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.g = -1;
                        return -1;
                    }
                    vb vbVarA = bbVar.f14652a;
                    vb vbVar = this.f14658c;
                    long j3 = 0;
                    if (vbVar != null) {
                        long j4 = this.d - ((long) (this.f - vbVar.f15547b));
                        if (j4 > j) {
                            j2 = j4;
                        } else {
                            j3 = j4;
                            vbVar = vbVarA;
                            vbVarA = vbVar;
                        }
                    } else {
                        vbVar = vbVarA;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = ((long) (vbVarA.f15548c - vbVarA.f15547b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            vbVarA = vbVarA.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            vbVar = vbVar.g;
                            j2 -= (long) (vbVar.f15548c - vbVar.f15547b);
                        }
                        vbVarA = vbVar;
                        j3 = j2;
                    }
                    if (this.f14657b && vbVarA.d) {
                        vb vbVarD = vbVarA.d();
                        bb bbVar2 = this.f14656a;
                        if (bbVar2.f14652a == vbVarA) {
                            bbVar2.f14652a = vbVarD;
                        }
                        vbVarA = vbVarA.a(vbVarD);
                        vbVarA.g.b();
                    }
                    this.f14658c = vbVarA;
                    this.d = j;
                    this.e = vbVarA.f15546a;
                    this.f = vbVarA.f15547b + ((int) (j - j3));
                    int i = vbVarA.f15548c;
                    this.g = i;
                    return i - this.f;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f14656a.f14653b)));
        }

        public final long j(long j) {
            bb bbVar = this.f14656a;
            if (bbVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f14657b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = bbVar.f14653b;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException("newSize < 0: " + j);
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    bb bbVar2 = this.f14656a;
                    vb vbVar = bbVar2.f14652a.g;
                    int i = vbVar.f15548c;
                    long j4 = i - vbVar.f15547b;
                    if (j4 > j3) {
                        vbVar.f15548c = (int) (((long) i) - j3);
                        break;
                    }
                    bbVar2.f14652a = vbVar.b();
                    wb.a(vbVar);
                    j3 -= j4;
                }
                this.f14658c = null;
                this.d = j;
                this.e = null;
                this.f = -1;
                this.g = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    vb vbVarE = this.f14656a.e(1);
                    int iMin = (int) Math.min(j5, 8192 - vbVarE.f15548c);
                    vbVarE.f15548c += iMin;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f14658c = vbVarE;
                        this.d = j2;
                        this.e = vbVarE.f15546a;
                        int i2 = vbVarE.f15548c;
                        this.f = i2 - iMin;
                        this.g = i2;
                        z = false;
                    }
                }
            }
            this.f14656a.f14653b = j;
            return j2;
        }

        public final long d(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i);
            }
            if (i > 8192) {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i);
            }
            bb bbVar = this.f14656a;
            if (bbVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f14657b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j = bbVar.f14653b;
            vb vbVarE = bbVar.e(i);
            int i2 = 8192 - vbVarE.f15548c;
            vbVarE.f15548c = 8192;
            long j2 = i2;
            this.f14656a.f14653b = j + j2;
            this.f14658c = vbVarE;
            this.d = j;
            this.e = vbVarE.f15546a;
            this.f = 8192 - i2;
            this.g = 8192;
            return j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f14656a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f14656a = null;
            this.f14658c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.g = -1;
        }
    }

    public final eb A() {
        return b("SHA-512");
    }

    private eb b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            vb vbVar = this.f14652a;
            if (vbVar != null) {
                messageDigest.update(vbVar.f15546a, this.f14652a.f15547b, this.f14652a.f15548c - this.f14652a.f15547b);
                vb vbVar2 = this.f14652a;
                while (true) {
                    vbVar2 = vbVar2.f;
                    if (vbVar2 == this.f14652a) {
                        break;
                    }
                    messageDigest.update(vbVar2.f15546a, vbVar2.f15547b, vbVar2.f15548c - vbVar2.f15547b);
                }
            }
            return eb.e(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private boolean a(vb vbVar, int i, eb ebVar, int i2, int i3) {
        int i4 = vbVar.f15548c;
        byte[] bArr = vbVar.f15546a;
        while (i2 < i3) {
            if (i == i4) {
                vbVar = vbVar.f;
                byte[] bArr2 = vbVar.f15546a;
                bArr = bArr2;
                i = vbVar.f15547b;
                i4 = vbVar.f15548c;
            }
            if (bArr[i] != ebVar.a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private void a(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            vb vbVarE = e(1);
            int i = inputStream.read(vbVarE.f15546a, vbVarE.f15548c, (int) Math.min(j, 8192 - vbVarE.f15548c));
            if (i == -1) {
                if (vbVarE.f15547b == vbVarE.f15548c) {
                    this.f14652a = vbVarE.b();
                    wb.a(vbVarE);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            vbVarE.f15548c += i;
            long j2 = i;
            this.f14653b += j2;
            j -= j2;
        }
    }

    private eb a(String str, eb ebVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(ebVar.m(), str));
            vb vbVar = this.f14652a;
            if (vbVar != null) {
                mac.update(vbVar.f15546a, this.f14652a.f15547b, this.f14652a.f15548c - this.f14652a.f15547b);
                vb vbVar2 = this.f14652a;
                while (true) {
                    vbVar2 = vbVar2.f;
                    if (vbVar2 == this.f14652a) {
                        break;
                    }
                    mac.update(vbVar2.f15546a, vbVar2.f15547b, vbVar2.f15548c - vbVar2.f15547b);
                }
            }
            return eb.e(mac.doFinal());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
