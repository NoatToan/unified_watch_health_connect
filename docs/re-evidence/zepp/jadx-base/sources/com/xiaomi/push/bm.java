package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes22.dex */
public class bm {
    public static final byte[] a = {SettingsModule.VALUE_TYPE_FLAG, 85, 83, 72};
    private short b;
    private byte c;
    private int d;
    private byte[] e;

    public static class a {
        public static final c a = new c();

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public static final d f49a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f49a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!bm.m3602a(bArr)) {
                return bArr;
            }
            bm bmVarA = bm.a(bArr);
            return (bmVarA.c == 0 || bmVarA.c != bVar.a()) ? bmVarA.e : bVar.a(bmVarA.e, bmVarA.d);
        }
    }

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    public static final class c {
    }

    public static final class d implements b {
        @Override // com.xiaomi.push.bm.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.bm.b
        public byte[] a(byte[] bArr, int i) throws Throwable {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public bm(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    public bm(short s, byte b2, int i, byte[] bArr) {
        this.b = (short) 1;
        this.b = s;
        this.c = b2;
        this.d = i;
        this.e = bArr;
    }

    public static bm a(byte b2, int i, byte[] bArr) {
        return new bm(b2, i, bArr);
    }

    public static bm a(short s, byte b2, int i, byte[] bArr) {
        return new bm(s, b2, i, bArr);
    }

    public static bm a(byte[] bArr) {
        if (!m3602a(bArr)) {
            return a((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s = byteBufferOrder.getShort();
        byte b2 = byteBufferOrder.get();
        int i = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return a(s, b2, i, bArr2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3602a(byte[] bArr) {
        byte[] bArr2 = a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
