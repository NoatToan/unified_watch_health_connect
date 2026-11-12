package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes46.dex */
public class ykd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f53572c;
    private String e;

    protected ykd(c cVar) {
        this.f53572c = cVar.e;
        this.e = cVar.f53573a;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f53573a;
        private File e;

        public c b(File file) {
            this.e = file;
            return this;
        }

        public ykd c() {
            return new ykd(this);
        }
    }

    public File c() {
        return this.f53572c;
    }

    public String a() {
        return this.e;
    }
}
