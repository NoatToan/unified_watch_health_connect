package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes11.dex */
public class uvs {
    public static final byte[] e = {SettingsModule.VALUE_TYPE_FLAG, 85, 83, 72};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f36198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f36199b;
    public int c;
    public byte[] d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f36200a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f36201b = new d();

        public static byte[] a(byte[] bArr) {
            return b(bArr, f36201b);
        }

        public static byte[] b(byte[] bArr, b bVar) {
            if (!uvs.f(bArr)) {
                return bArr;
            }
            uvs uvsVarE = uvs.e(bArr);
            return (uvsVarE.f36199b == 0 || uvsVarE.f36199b != bVar.a()) ? uvsVarE.d : bVar.a(uvsVarE.d, uvsVarE.c);
        }
    }

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    public static final class c {
    }

    public static final class d implements b {
        @Override // uvs.b
        public byte a() {
            return (byte) 2;
        }

        @Override // uvs.b
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

    public uvs(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    public static uvs c(byte b2, int i, byte[] bArr) {
        return new uvs(b2, i, bArr);
    }

    public static uvs d(short s, byte b2, int i, byte[] bArr) {
        return new uvs(s, b2, i, bArr);
    }

    public static uvs e(byte[] bArr) {
        if (!f(bArr)) {
            return c((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s = byteBufferOrder.getShort();
        byte b2 = byteBufferOrder.get();
        int i = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return d(s, b2, i, bArr2);
    }

    public static boolean f(byte[] bArr) {
        byte[] bArr2 = e;
        return g(bArr2, bArr, bArr2.length);
    }

    public static boolean g(byte[] bArr, byte[] bArr2, int i) {
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

    public uvs(short s, byte b2, int i, byte[] bArr) {
        this.f36198a = s;
        this.f36199b = b2;
        this.c = i;
        this.d = bArr;
    }
}
