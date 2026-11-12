package defpackage;

import health.compact.a.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes20.dex */
public class xiu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f53080c;
    private String d;
    private byte[] e;

    protected xiu(c cVar) {
        this.d = cVar.e;
        this.e = cVar.f53082b;
        this.f53080c = cVar.f53081a;
        this.f53079b = cVar.d;
        this.f53078a = cVar.f53083c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f53081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f53082b;
        String e;
        private int h = 0;
        private boolean d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53083c = 1;

        public c a(byte[] bArr) {
            int i = this.h;
            if (i == 0 || i == 1) {
                this.f53082b = bArr;
                this.h = 1;
                return this;
            }
            LogUtil.e("P2pMessage", "Data setPayload type: ", Integer.valueOf(i));
            return this;
        }

        public c a(File file) {
            int i = this.h;
            if (i == 0 || i == 2) {
                this.f53081a = file;
                this.h = 2;
                return this;
            }
            LogUtil.e("P2pMessage", "File setPayload type: ", Integer.valueOf(i));
            return this;
        }

        public c e(String str) {
            this.e = str;
            return this;
        }

        public c c(boolean z) {
            this.d = z;
            return this;
        }

        public c b(int i) {
            this.f53083c = i;
            return this;
        }

        public xiu c() {
            return new xiu(this);
        }
    }

    public byte[] b() {
        return this.e;
    }

    public File e() {
        return this.f53080c;
    }

    public String a() {
        return this.d;
    }

    public int c() {
        if (this.e != null) {
            return 1;
        }
        return this.f53080c != null ? 2 : 0;
    }

    public boolean h() {
        return this.f53079b;
    }

    public int d() {
        return this.f53078a;
    }
}
