package com.xiaomi.ai.streamplayer;

/* JADX INFO: loaded from: classes18.dex */
abstract class a {

    /* JADX INFO: renamed from: com.xiaomi.ai.streamplayer.a$a, reason: collision with other inner class name */
    public static class C0772a {
        public int a;
        public int b;
        public int c;
        public boolean d;
        public byte[] e;

        public boolean a(C0772a c0772a) {
            return c0772a != null && c0772a.a == this.a && c0772a.c == this.c && c0772a.b == this.b;
        }
    }

    public abstract void a();

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract C0772a e();
}
