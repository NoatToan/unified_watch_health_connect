package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pqk implements kl5, jl5.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl5.a f30649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as5<?> f30650b;
    public int c;
    public int d = -1;
    public pzd e;
    public List<d7g<File, ?>> f;
    public int g;
    public volatile d7g.a<?> h;
    public File i;
    public qqk j;

    public pqk(as5<?> as5Var, kl5.a aVar) {
        this.f30650b = as5Var;
        this.f30649a = aVar;
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override // defpackage.kl5
    public boolean a() {
        d0b.a("ResourceCacheGenerator.startNext");
        try {
            List<pzd> listC = this.f30650b.c();
            boolean z = false;
            if (listC.isEmpty()) {
                d0b.e();
                return false;
            }
            List<Class<?>> listM = this.f30650b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f30650b.r())) {
                    d0b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f30650b.i() + " to " + this.f30650b.r());
            }
            while (true) {
                if (this.f != null && b()) {
                    this.h = null;
                    while (!z && b()) {
                        List<d7g<File, ?>> list = this.f;
                        int i = this.g;
                        this.g = i + 1;
                        this.h = list.get(i).b(this.i, this.f30650b.t(), this.f30650b.f(), this.f30650b.k());
                        if (this.h != null && this.f30650b.u(this.h.c.a())) {
                            this.h.c.c(this.f30650b.l(), this);
                            z = true;
                        }
                    }
                    d0b.e();
                    return z;
                }
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= listM.size()) {
                    int i3 = this.c + 1;
                    this.c = i3;
                    if (i3 >= listC.size()) {
                        d0b.e();
                        return false;
                    }
                    this.d = 0;
                }
                pzd pzdVar = listC.get(this.c);
                Class<?> cls = listM.get(this.d);
                this.j = new qqk(this.f30650b.b(), pzdVar, this.f30650b.p(), this.f30650b.t(), this.f30650b.f(), this.f30650b.s(cls), cls, this.f30650b.k());
                File fileA = this.f30650b.d().a(this.j);
                this.i = fileA;
                if (fileA != null) {
                    this.e = pzdVar;
                    this.f = this.f30650b.j(fileA);
                    this.g = 0;
                }
            }
        } catch (Throwable th) {
            d0b.e();
            throw th;
        }
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
        this.f30649a.b(this.e, obj, this.h.c, DataSource.RESOURCE_DISK_CACHE, this.j);
    }

    @Override // jl5.a
    public void f(Exception exc) {
        this.f30649a.c(this.j, exc, this.h.c, DataSource.RESOURCE_DISK_CACHE);
    }
}
