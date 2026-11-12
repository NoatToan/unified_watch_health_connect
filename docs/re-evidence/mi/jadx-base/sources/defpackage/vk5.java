package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vk5 implements kl5, jl5.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<pzd> f36971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as5<?> f36972b;
    public final kl5.a c;
    public int d;
    public pzd e;
    public List<d7g<File, ?>> f;
    public int g;
    public volatile d7g.a<?> h;
    public File i;

    public vk5(as5<?> as5Var, kl5.a aVar) {
        this(as5Var.c(), as5Var, aVar);
    }

    @Override // defpackage.kl5
    public boolean a() {
        d0b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f != null && b()) {
                    this.h = null;
                    while (!z && b()) {
                        List<d7g<File, ?>> list = this.f;
                        int i = this.g;
                        this.g = i + 1;
                        this.h = list.get(i).b(this.i, this.f36972b.t(), this.f36972b.f(), this.f36972b.k());
                        if (this.h != null && this.f36972b.u(this.h.c.a())) {
                            this.h.c.c(this.f36972b.l(), this);
                            z = true;
                        }
                    }
                    d0b.e();
                    return z;
                }
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= this.f36971a.size()) {
                    d0b.e();
                    return false;
                }
                pzd pzdVar = this.f36971a.get(this.d);
                File fileA = this.f36972b.d().a(new wk5(pzdVar, this.f36972b.p()));
                this.i = fileA;
                if (fileA != null) {
                    this.e = pzdVar;
                    this.f = this.f36972b.j(fileA);
                    this.g = 0;
                }
            } catch (Throwable th) {
                d0b.e();
                throw th;
            }
        }
    }

    public final boolean b() {
        return this.g < this.f.size();
    }

    @Override // defpackage.kl5
    public void cancel() {
        d7g.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // jl5.a
    public void e(Object obj) {
        this.c.b(this.e, obj, this.h.c, DataSource.DATA_DISK_CACHE, this.e);
    }

    @Override // jl5.a
    public void f(Exception exc) {
        this.c.c(this.e, exc, this.h.c, DataSource.DATA_DISK_CACHE);
    }

    public vk5(List<pzd> list, as5<?> as5Var, kl5.a aVar) {
        this.d = -1;
        this.f36971a = list;
        this.f36972b = as5Var;
        this.c = aVar;
    }
}
