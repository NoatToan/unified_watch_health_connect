package defpackage;

import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class fdu extends fdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fcz f33915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33916b;

    public fdu(a aVar) {
        super(aVar.f33917a, aVar.f33918b, aVar.d, aVar.e, aVar.h);
        this.f33916b = aVar.f33919c;
        this.f33915a = aVar.j;
    }

    @Override // defpackage.fdv, com.huawei.networkclient.ProgressListener
    public void onFinish(Object obj) {
        super.onFinish(this.f33915a);
        if (this.f33916b.equals("-1")) {
            return;
        }
        fdy.e(this.e + this.d, this.f33916b);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33919c;
        private String d;
        private File e;
        private DownloadCallback h;
        private fcz j;

        public a d(String str) {
            this.f33917a = str;
            return this;
        }

        public a c(String str) {
            this.f33918b = str;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(File file) {
            this.e = file;
            return this;
        }

        public a b(DownloadCallback downloadCallback) {
            this.h = downloadCallback;
            return this;
        }

        public a b(String str) {
            this.f33919c = str;
            return this;
        }

        public a b(fcz fczVar) {
            this.j = fczVar;
            return this;
        }

        public fdu e() {
            return new fdu(this);
        }
    }
}
