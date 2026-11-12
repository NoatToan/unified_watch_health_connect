package defpackage;

import com.facebook.imagepipeline.memory.a;
import com.facebook.imagepipeline.memory.b;

/* JADX INFO: loaded from: classes4.dex */
public class i3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3i f20740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bq2 f20741b;
    public w53 c;
    public jx9 d;
    public whg e;
    public n3i f;
    public q3i g;
    public v63 h;

    public i3i(h3i h3iVar) {
        this.f20740a = (h3i) b6i.g(h3iVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    public bq2 a() {
        byte b2;
        if (this.f20741b == null) {
            switch (this.f20740a.e()) {
                case "legacy_default_params":
                    b2 = 2;
                    break;
                case "legacy":
                    b2 = 3;
                    break;
                case "experimental":
                    b2 = 1;
                    break;
                case "dummy":
                    b2 = 0;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.f20741b = new n67();
            } else if (b2 == 1) {
                this.f20741b = new vve(this.f20740a.b(), this.f20740a.a(), zug.h(), this.f20740a.l() ? this.f20740a.i() : null);
            } else if (b2 != 2) {
                this.f20741b = new t53(this.f20740a.i(), this.f20740a.c(), this.f20740a.d());
            } else {
                this.f20741b = new t53(this.f20740a.i(), tt5.a(), this.f20740a.d());
            }
        }
        return this.f20741b;
    }

    public w53 b() {
        if (this.c == null) {
            this.c = new w53(this.f20740a.i(), this.f20740a.g(), this.f20740a.h());
        }
        return this.c;
    }

    public jx9 c() {
        if (this.d == null) {
            this.d = new jx9(this.f20740a.i(), this.f20740a.f());
        }
        return this.d;
    }

    public int d() {
        return this.f20740a.f().g;
    }

    public final b e(int i) {
        if (i == 0) {
            return f();
        }
        if (i == 1) {
            return b();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    public whg f() {
        if (this.e == null) {
            this.e = new whg(this.f20740a.i(), this.f20740a.g(), this.f20740a.h());
        }
        return this.e;
    }

    public n3i g() {
        return h(0);
    }

    public n3i h(int i) {
        if (this.f == null) {
            this.f = new opf(e(i), i());
        }
        return this.f;
    }

    public q3i i() {
        if (this.g == null) {
            this.g = new q3i(j());
        }
        return this.g;
    }

    public v63 j() {
        if (this.h == null) {
            this.h = new a(this.f20740a.i(), this.f20740a.j(), this.f20740a.k());
        }
        return this.h;
    }
}
