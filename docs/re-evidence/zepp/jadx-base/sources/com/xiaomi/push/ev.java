package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class ev extends el {
    private static int m = 10000;
    private static int n = 10000;
    private static int o = 10000;
    private static int p = 10485760;
    private static int q = 104857600;

    public static class a extends el.a {
        public a() {
            super(false, true);
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        @Override // com.xiaomi.push.el.a, com.xiaomi.push.er
        public ep a(ey eyVar) {
            ev evVar = new ev(eyVar, ((el.a) this).f171a, this.b);
            int i = ((el.a) this).a;
            if (i != 0) {
                evVar.b(i);
            }
            return evVar;
        }
    }

    public ev(ey eyVar, boolean z, boolean z2) {
        super(eyVar, z, z2);
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ep
    /* JADX INFO: renamed from: a */
    public en mo3774a() throws ej {
        byte bA = a();
        int iMo3771a = mo3771a();
        if (iMo3771a <= n) {
            return new en(bA, iMo3771a);
        }
        throw new eq(3, "Thrift list size " + iMo3771a + " out of range!");
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ep
    /* JADX INFO: renamed from: a */
    public eo mo3775a() throws ej {
        byte bA = a();
        byte bA2 = a();
        int iMo3771a = mo3771a();
        if (iMo3771a <= m) {
            return new eo(bA, bA2, iMo3771a);
        }
        throw new eq(3, "Thrift map size " + iMo3771a + " out of range!");
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ep
    /* JADX INFO: renamed from: a */
    public et mo3776a() throws ej {
        byte bA = a();
        int iMo3771a = mo3771a();
        if (iMo3771a <= o) {
            return new et(bA, iMo3771a);
        }
        throw new eq(3, "Thrift set size " + iMo3771a + " out of range!");
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ep
    /* JADX INFO: renamed from: a */
    public String mo3778a() throws ej {
        int iMo3771a = mo3771a();
        if (iMo3771a > p) {
            throw new eq(3, "Thrift string size " + iMo3771a + " out of range!");
        }
        if (((ep) this).a.b() < iMo3771a) {
            return a(iMo3771a);
        }
        try {
            String str = new String(((ep) this).a.mo3785a(), ((ep) this).a.a(), iMo3771a, "UTF-8");
            ((ep) this).a.a(iMo3771a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new ej("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ep
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo3779a() throws ej {
        int iMo3771a = mo3771a();
        if (iMo3771a > q) {
            throw new eq(3, "Thrift binary size " + iMo3771a + " out of range!");
        }
        c(iMo3771a);
        if (((ep) this).a.b() >= iMo3771a) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(((ep) this).a.mo3785a(), ((ep) this).a.a(), iMo3771a);
            ((ep) this).a.a(iMo3771a);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo3771a];
        ((ep) this).a.b(bArr, 0, iMo3771a);
        return ByteBuffer.wrap(bArr);
    }
}
