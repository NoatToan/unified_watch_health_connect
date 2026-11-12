package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class wuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hqc f38378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qxc f38379b;
    public lrc c;
    public atc d;
    public zvc e;
    public qtc f;
    public boolean g;
    public d0d h;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hqc f38380a = new au5();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public qxc f38381b = new tw5();
        public lrc c = new gu5();
        public atc d = new mv5();
        public zvc e = new lw5();
        public qtc f = new wv5();
        public d0d g = new ux5();
        public boolean h = false;

        public b h(hqc hqcVar) {
            this.f38380a = hqcVar;
            return this;
        }

        public b i(atc atcVar) {
            this.d = atcVar;
            return this;
        }

        public b j(qtc qtcVar) {
            this.f = qtcVar;
            return this;
        }

        public b k(zvc zvcVar) {
            this.e = zvcVar;
            return this;
        }

        public b l(qxc qxcVar) {
            this.f38381b = qxcVar;
            return this;
        }

        public b m(d0d d0dVar) {
            this.g = d0dVar;
            return this;
        }

        public wuk n() {
            return new wuk(this);
        }
    }

    public hqc a() {
        return this.f38378a;
    }

    public lrc b() {
        return this.c;
    }

    public atc c() {
        return this.d;
    }

    public qtc d() {
        return this.f;
    }

    public zvc e() {
        return this.e;
    }

    public qxc f() {
        return this.f38379b;
    }

    public d0d g() {
        return this.h;
    }

    public wuk(b bVar) {
        this.f38378a = bVar.f38380a;
        this.f38379b = bVar.f38381b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.h = bVar.g;
        this.g = bVar.h;
    }
}
