package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class chg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f1598a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1599c;
    private int d;

    public chg(c cVar) {
        this.f1598a = -1.0f;
        this.f1599c = -1.0f;
        this.d = -1;
        this.f1598a = cVar.f1600b;
        this.f1599c = cVar.e;
        this.d = cVar.d;
    }

    public float a() {
        return this.f1598a;
    }

    public float e() {
        return this.f1599c;
    }

    public int b() {
        return this.d;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f1600b = -1.0f;
        private float e = -1.0f;
        private int d = -1;

        public c e(float f) {
            this.f1600b = f;
            return this;
        }

        public c b(float f) {
            this.e = f;
            return this;
        }

        public chg b() {
            return new chg(this);
        }
    }
}
