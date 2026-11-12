package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes46.dex */
public class ykf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f53575a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53576c;
    private File d;
    private String e;

    protected ykf(d dVar) {
        this.e = dVar.e;
        this.f53575a = dVar.f53578b;
        this.d = dVar.f53577a;
        this.f53576c = dVar.d;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f53577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f53578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53579c = 0;
        private boolean d = true;
        String e;

        public d d(byte[] bArr) {
            int i = this.f53579c;
            if (i == 0 || i == 1) {
                this.f53578b = bArr == null ? null : (byte[]) bArr.clone();
                this.f53579c = 1;
                return this;
            }
            throw new yib(5);
        }

        public d d(File file) {
            int i = this.f53579c;
            if (i == 0 || i == 2) {
                this.f53577a = file;
                this.f53579c = 2;
                return this;
            }
            throw new yib(5);
        }

        public ykf b() {
            return new ykf(this);
        }
    }

    public byte[] a() {
        byte[] bArr = this.f53575a;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public File d() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public int c() {
        if (this.f53575a != null) {
            return 1;
        }
        return this.d != null ? 2 : 0;
    }

    public boolean e() {
        return this.f53576c;
    }
}
