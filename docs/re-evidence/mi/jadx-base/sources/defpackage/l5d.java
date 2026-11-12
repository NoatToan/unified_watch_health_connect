package defpackage;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class l5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24682b;
    public final hcr c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public boolean h;
    public final int i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24683k;
    public final d l;
    public final tpo<Boolean> m;
    public final boolean n;
    public final boolean o;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k5d.b f24684a;
        public hcr d;
        public d m;
        public tpo<Boolean> n;
        public boolean o;
        public boolean p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24685b = false;
        public boolean c = false;
        public boolean e = false;
        public boolean f = false;
        public int g = 0;
        public int h = 0;
        public boolean i = false;
        public int j = 2048;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f24686k = false;
        public boolean l = false;

        public b(k5d.b bVar) {
            this.f24684a = bVar;
        }

        public static /* synthetic */ hcr.a b(b bVar) {
            bVar.getClass();
            return null;
        }

        public l5d m() {
            return new l5d(this);
        }
    }

    public static class c implements d {
        @Override // l5d.d
        public gbi a(Context context, v63 v63Var, n3d n3dVar, kci kciVar, boolean z, boolean z2, boolean z3, bg8 bg8Var, n3i n3iVar, gpf<c93, u14> gpfVar, gpf<c93, PooledByteBuffer> gpfVar2, z53 z53Var, z53 z53Var2, f93 f93Var, f0i f0iVar, int i, int i2, boolean z4, int i3, x14 x14Var) {
            return new gbi(context, v63Var, n3dVar, kciVar, z, z2, z3, bg8Var, n3iVar, gpfVar, gpfVar2, z53Var, z53Var2, f93Var, f0iVar, i, i2, z4, i3, x14Var);
        }
    }

    public interface d {
        gbi a(Context context, v63 v63Var, n3d n3dVar, kci kciVar, boolean z, boolean z2, boolean z3, bg8 bg8Var, n3i n3iVar, gpf<c93, u14> gpfVar, gpf<c93, PooledByteBuffer> gpfVar2, z53 z53Var, z53 z53Var2, f93 f93Var, f0i f0iVar, int i, int i2, boolean z4, int i3, x14 x14Var);
    }

    public boolean a() {
        return this.h;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.i;
    }

    public d e() {
        return this.l;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.d;
    }

    public hcr h() {
        return this.c;
    }

    public hcr.a i() {
        return null;
    }

    public boolean j() {
        return this.f24682b;
    }

    public boolean k() {
        return this.n;
    }

    public tpo<Boolean> l() {
        return this.m;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.f24683k;
    }

    public boolean o() {
        return this.f24681a;
    }

    public boolean p() {
        return this.o;
    }

    public l5d(b bVar) {
        this.f24681a = bVar.f24685b;
        b.b(bVar);
        this.f24682b = bVar.c;
        this.c = bVar.d;
        this.d = bVar.e;
        this.e = bVar.f;
        this.f = bVar.g;
        this.g = bVar.h;
        this.h = bVar.i;
        this.i = bVar.j;
        this.j = bVar.f24686k;
        this.f24683k = bVar.l;
        if (bVar.m == null) {
            this.l = new c();
        } else {
            this.l = bVar.m;
        }
        this.m = bVar.n;
        this.n = bVar.o;
        this.o = bVar.p;
    }
}
