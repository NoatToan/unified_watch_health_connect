package defpackage;

import com.xiaomi.miot.ble.ByteUtil;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class phh {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f30394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30395b;
        public int c;

        public a(byte[] bArr, int i) {
            this(bArr, i, bArr.length);
        }

        public int a() {
            return this.c - this.f30395b;
        }

        public a(byte[] bArr, int i, int i2) {
            this.f30394a = bArr;
            this.f30395b = i;
            this.c = i2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public short f30396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f30397b;
        public byte c;
        public List<Short> d;
        public byte[] e;

        public b() {
        }
    }

    public static phh a(b bVar) {
        return new nm5(bVar.f30396a, new a(bVar.e, 2));
    }

    public static phh b(b bVar) {
        byte b2 = bVar.f30397b;
        if (b2 == 0) {
            return new w83(bVar.c, bVar.d.get(0).shortValue());
        }
        if (b2 == 1) {
            return new q(bVar.c, bVar.d);
        }
        if (b2 != 2) {
            return b2 != 3 ? new dhd() : new zdm(bVar.c);
        }
        return new bem(bVar.c, ByteUtil.get(bVar.e, 4));
    }

    public static phh d(byte[] bArr) {
        b bVarE;
        try {
            bVarE = e(bArr);
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
            bVarE = null;
        }
        if (bVarE == null) {
            return new dhd();
        }
        if (bVarE.f30396a != 0) {
            return a(bVarE);
        }
        try {
            return b(bVarE);
        } catch (Exception unused) {
            return new dhd();
        }
    }

    public static b e(byte[] bArr) throws BufferUnderflowException {
        b bVar = new b();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        short s = byteBufferOrder.getShort();
        bVar.f30396a = s;
        bVar.e = bArr;
        if (s == 0) {
            bVar.f30397b = byteBufferOrder.get();
            bVar.c = byteBufferOrder.get();
            bVar.d = new ArrayList();
            while (byteBufferOrder.hasRemaining()) {
                try {
                    bVar.d.add(Short.valueOf(byteBufferOrder.getShort()));
                } catch (BufferUnderflowException unused) {
                }
            }
        }
        return bVar;
    }

    public abstract String c();

    public abstract byte[] f();
}
