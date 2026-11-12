package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class el extends ep {
    private static final eu l = new eu();
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f170a;
    public boolean b;
    public boolean c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;

    public static class a implements er {
        public int a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f171a;
        public boolean b;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f171a = false;
            this.b = true;
            this.f171a = z;
            this.b = z2;
            this.a = i;
        }

        @Override // com.xiaomi.push.er
        public ep a(ey eyVar) {
            el elVar = new el(eyVar, this.f171a, this.b);
            int i = this.a;
            if (i != 0) {
                elVar.b(i);
            }
            return elVar;
        }
    }

    public el(ey eyVar, boolean z, boolean z2) {
        super(eyVar);
        this.f170a = false;
        this.b = true;
        this.c = false;
        this.d = new byte[1];
        this.e = new byte[2];
        this.f = new byte[4];
        this.g = new byte[8];
        this.h = new byte[1];
        this.i = new byte[2];
        this.j = new byte[4];
        this.k = new byte[8];
        this.f170a = z;
        this.b = z2;
    }

    private int l(byte[] bArr, int i, int i2) throws ej {
        c(i2);
        return ((ep) this).a.b(bArr, i, i2);
    }

    @Override // com.xiaomi.push.ep
    public byte a() throws ej {
        if (((ep) this).a.b() < 1) {
            l(this.h, 0, 1);
            return this.h[0];
        }
        byte b = ((ep) this).a.mo3785a()[((ep) this).a.a()];
        ((ep) this).a.a(1);
        return b;
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public double mo3770a() {
        return Double.longBitsToDouble(mo3772a());
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int mo3771a() throws ej {
        byte[] bArrMo3785a = this.j;
        int iA = 0;
        if (((ep) this).a.b() >= 4) {
            bArrMo3785a = ((ep) this).a.mo3785a();
            iA = ((ep) this).a.a();
            ((ep) this).a.a(4);
        } else {
            l(this.j, 0, 4);
        }
        return (bArrMo3785a[iA + 3] & 255) | ((bArrMo3785a[iA] & 255) << 24) | ((bArrMo3785a[iA + 1] & 255) << 16) | ((bArrMo3785a[iA + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long mo3772a() throws ej {
        byte[] bArrMo3785a = this.k;
        int iA = 0;
        if (((ep) this).a.b() >= 8) {
            bArrMo3785a = ((ep) this).a.mo3785a();
            iA = ((ep) this).a.a();
            ((ep) this).a.a(8);
        } else {
            l(this.k, 0, 8);
        }
        return ((long) (bArrMo3785a[iA + 7] & 255)) | (((long) (bArrMo3785a[iA] & 255)) << 56) | (((long) (bArrMo3785a[iA + 1] & 255)) << 48) | (((long) (bArrMo3785a[iA + 2] & 255)) << 40) | (((long) (bArrMo3785a[iA + 3] & 255)) << 32) | (((long) (bArrMo3785a[iA + 4] & 255)) << 24) | (((long) (bArrMo3785a[iA + 5] & 255)) << 16) | (((long) (bArrMo3785a[iA + 6] & 255)) << 8);
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public em mo3773a() throws ej {
        byte bA = a();
        return new em("", bA, bA == 0 ? (short) 0 : mo3780a());
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public en mo3774a() {
        return new en(a(), mo3771a());
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public eo mo3775a() {
        return new eo(a(), a(), mo3771a());
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public et mo3776a() {
        return new et(a(), mo3771a());
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public eu mo3777a() {
        return l;
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo3778a() throws ej {
        int iMo3771a = mo3771a();
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

    public String a(int i) throws ej {
        try {
            c(i);
            byte[] bArr = new byte[i];
            ((ep) this).a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new ej("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo3779a() throws ej {
        int iMo3771a = mo3771a();
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

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public short mo3780a() throws ej {
        byte[] bArrMo3785a = this.i;
        int iA = 0;
        if (((ep) this).a.b() >= 2) {
            bArrMo3785a = ((ep) this).a.mo3785a();
            iA = ((ep) this).a.a();
            ((ep) this).a.a(2);
        } else {
            l(this.i, 0, 2);
        }
        return (short) ((bArrMo3785a[iA + 1] & 255) | ((bArrMo3785a[iA] & 255) << 8));
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3781a() {
    }

    public void a(byte b) {
        byte[] bArr = this.d;
        bArr[0] = b;
        ((ep) this).a.mo3784a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3782a(int i) {
        byte[] bArr = this.f;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        ((ep) this).a.mo3784a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.ep
    public void a(long j) {
        byte[] bArr = this.g;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        ((ep) this).a.mo3784a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.ep
    public void a(em emVar) {
        a(emVar.a);
        a(emVar.f173a);
    }

    @Override // com.xiaomi.push.ep
    public void a(en enVar) {
        a(enVar.a);
        mo3782a(enVar.f174a);
    }

    @Override // com.xiaomi.push.ep
    public void a(eo eoVar) {
        a(eoVar.a);
        a(eoVar.b);
        mo3782a(eoVar.f175a);
    }

    @Override // com.xiaomi.push.ep
    public void a(eu euVar) {
    }

    @Override // com.xiaomi.push.ep
    public void a(String str) throws ej {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo3782a(bytes.length);
            ((ep) this).a.mo3784a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new ej("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ep
    public void a(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo3782a(iLimit);
        ((ep) this).a.mo3784a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // com.xiaomi.push.ep
    public void a(short s) {
        byte[] bArr = this.e;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        ((ep) this).a.mo3784a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.ep
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.ep
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo3783a() {
        return a() == 1;
    }

    @Override // com.xiaomi.push.ep
    public void b() {
    }

    public void b(int i) {
        this.a = i;
        this.c = true;
    }

    @Override // com.xiaomi.push.ep
    public void c() {
        a((byte) 0);
    }

    public void c(int i) throws ej {
        if (i < 0) {
            throw new ej("Negative length: " + i);
        }
        if (this.c) {
            int i2 = this.a - i;
            this.a = i2;
            if (i2 >= 0) {
                return;
            }
            throw new ej("Message length exceeded: " + i);
        }
    }

    @Override // com.xiaomi.push.ep
    public void d() {
    }

    @Override // com.xiaomi.push.ep
    public void e() {
    }

    @Override // com.xiaomi.push.ep
    public void f() {
    }

    @Override // com.xiaomi.push.ep
    public void g() {
    }

    @Override // com.xiaomi.push.ep
    public void h() {
    }

    @Override // com.xiaomi.push.ep
    public void i() {
    }

    @Override // com.xiaomi.push.ep
    public void j() {
    }
}
