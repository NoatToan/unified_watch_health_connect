package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class qio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46276c;
    public int d;
    public int e;

    private qio() {
        this.f46276c = 9728;
        this.e = 9729;
        this.d = 33071;
        this.f46275b = 33071;
        this.f46274a = false;
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46279c = 9728;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46278b = 9729;
        public int d = 33071;
        public int e = 33071;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46277a = false;

        public c d(int i) {
            this.f46279c = i;
            return this;
        }

        public c a(int i) {
            this.f46278b = i;
            return this;
        }

        public c d(boolean z) {
            this.f46277a = z;
            return this;
        }

        public qio e() {
            int i;
            qio qioVar = new qio();
            qioVar.f46276c = this.f46279c;
            qioVar.e = this.f46278b;
            qioVar.d = this.d;
            qioVar.f46275b = this.e;
            qioVar.f46274a = this.f46277a;
            if (!this.f46277a || ((i = this.f46279c) != 9728 && i != 9729)) {
                return qioVar;
            }
            qid.e("TextureOptions", "The value not good for texture when you wanna use mipmap.");
            throw new RuntimeException("the value GLES20.GL_NEAREST or GLES20.GL_LINEAR for GL_TEXTURE_MIN_FILTER is not good for texture when you wanna use mipmap");
        }
    }

    public static qio c() {
        return new c().e();
    }

    public static qio d() {
        return new c().d(true).d(9987).a(9987).e();
    }
}
