package d;

import b.c;
import b.s;
import p005kotlin.Metadata;
import wc.e;
import wc.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld/a;", "", "Lwc/g;", "info", "<init>", "(Lwc/g;)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f56981a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1221a f56982b;

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"d/a$a", "Lwc/e;", "Lwc/g;", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1221a extends e<g> {
        public C1221a(g gVar) {
            super(gVar, false);
        }

        @Override // wc.e
        public final void c() {
            a.this.b();
        }

        @Override // wc.e
        public final void d() {
            a.this.c();
        }

        @Override // wc.e
        public final void e(wc.b bVar) {
            a.this.d(new c(bVar));
        }

        @Override // wc.e
        public final void f(wc.b bVar) {
            new c(bVar);
            a.this.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d/a$b", "Lb/s;", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(false);
        }

        @Override // b.s
        public final void a() {
            a.this.b();
        }

        @Override // b.s
        public final void b() {
            a.this.c();
        }

        @Override // b.s
        public final void c(c cVar) {
            a.this.d(cVar);
        }

        @Override // b.s
        public final void d(c cVar) {
            a.this.e();
        }
    }

    public a(g gVar) {
        this.f56982b = new C1221a(gVar);
    }

    public boolean a() {
        return this.f56981a.f13818b && this.f56982b.a();
    }

    public void b() {
    }

    public abstract void c();

    public void d(c cVar) {
    }

    public void e() {
    }
}
