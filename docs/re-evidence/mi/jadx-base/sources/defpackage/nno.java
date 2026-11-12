package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nno extends xz9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jgj f28097b;
    public int c;

    public nno(jgj jgjVar) {
        this(jgjVar, null);
    }

    public jgj h() {
        return this.f28097b;
    }

    public int i() {
        return this.c;
    }

    public void j(int i) {
        this.c = i;
    }

    public static abstract class a<T extends nno> extends xz9.a<T> {
        public jgj f;

        public a(jgj jgjVar, jgj jgjVar2) {
            super(jgjVar);
            this.f = jgjVar2;
        }

        public jgj t() {
            return this.f;
        }

        public a(apr aprVar) {
            super(aprVar);
        }

        public a(jgj jgjVar) {
            super(jgjVar);
        }
    }

    public nno(jgj jgjVar, jgj jgjVar2) {
        super(jgjVar);
        this.c = 0;
        this.f28097b = jgjVar2;
    }

    public nno(jgj jgjVar, int i, int i2) {
        this(jgjVar.A(i, i2));
    }
}
