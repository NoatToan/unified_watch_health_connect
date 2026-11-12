package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;

/* JADX INFO: loaded from: classes7.dex */
public class fdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadCallback f33876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fda f33877c;
    private boolean d;
    private String e;

    private fdc(b bVar) {
        this.d = false;
        this.f33877c = bVar.f33879b;
        this.e = bVar.f33878a;
        this.f33875a = bVar.f33880c;
        this.d = bVar.d;
        this.f33876b = bVar.e;
    }

    public fda a() {
        return this.f33877c;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f33875a;
    }

    public boolean e() {
        return this.d;
    }

    public DownloadCallback d() {
        return this.f33876b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private fda f33879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33880c;
        private boolean d;
        private DownloadCallback e;

        public b b(fda fdaVar) {
            this.f33879b = fdaVar;
            return this;
        }

        public b b(String str) {
            this.f33878a = str;
            return this;
        }

        public b a(String str) {
            this.f33880c = str;
            return this;
        }

        public b e(boolean z) {
            this.d = z;
            return this;
        }

        public b a(DownloadCallback downloadCallback) {
            this.e = downloadCallback;
            return this;
        }

        public fdc a() {
            return new fdc(this);
        }
    }
}
