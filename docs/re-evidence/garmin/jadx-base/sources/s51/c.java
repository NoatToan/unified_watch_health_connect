package s51;

import androidx.lifecycle.t1;
import androidx.lifecycle.y0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.e0;
import vb.h;
import yc.h2;
import yc.h3;
import yc.m2;
import yc.n4;
import yc.x;
import yc.x0;
import yc.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ls51/c;", "", "Key", "Value", "Lyc/h2;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Key, Value> extends h2<Key, Value> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<e> f157379c = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<e> f157380d = new y0<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls51/c$a;", "", "Key", "Value", "Lyc/x$c;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a<Key, Value> extends x.c<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0<c<Key, Value>> f157381a = new y0<>();

        /* JADX INFO: renamed from: s51.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"s51/c$a$a", "Lyc/m2$a;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2965a extends m2.a<Value> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0<Boolean> f157382a;

            public C2965a(y0<Boolean> y0Var) {
                this.f157382a = y0Var;
            }

            @Override // yc.m2.a
            public final void a(Value value) {
                value.getClass();
                this.f157382a.j(Boolean.FALSE);
            }

            @Override // yc.m2.a
            public final void b() {
                this.f157382a.j(Boolean.TRUE);
            }
        }

        @Override // yc.x.c
        public final c a() {
            c<Key, Value> cVarB = b();
            this.f157381a.j(cVarB);
            return cVarB;
        }

        public abstract c<Key, Value> b();

        public final s51.a<Value> c(int i14) {
            e23.a<h3<Key, Value>> n4Var;
            y0 y0Var = new y0();
            m2.d.a aVar = new m2.d.a();
            if (i14 < 1) {
                h.s("Page size must be a positive number");
                return null;
            }
            aVar.f196233a = i14;
            aVar.f196234b = i14;
            aVar.f196235c = i14;
            yc.y0 y0Var2 = new yc.y0(this, aVar.a());
            y0Var2.f196630e = new C2965a(y0Var);
            e23.a<h3<Key, Value>> aVar2 = y0Var2.f196626a;
            if (aVar2 != null) {
                n4Var = aVar2;
            } else {
                x.c<Key, Value> cVar = y0Var2.f196627b;
                if (cVar != null) {
                    z zVar = y0Var2.f196631f;
                    zVar.getClass();
                    n4Var = new n4(zVar, new y(zVar, cVar));
                } else {
                    aVar2 = null;
                    n4Var = aVar2;
                }
            }
            if (n4Var == null) {
                h.z("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
                return null;
            }
            x0 x0Var = new x0(y0Var2.f196629d, null, y0Var2.f196628c, y0Var2.f196630e, n4Var, gl1.y.o(n.a.f122011c), y0Var2.f196631f);
            e0 e0Var = new e0(9);
            y0<c<Key, Value>> y0Var3 = this.f157381a;
            final int i15 = 0;
            final int i16 = 1;
            return new s51.a<>(x0Var, t1.b(y0Var3, e0Var), t1.b(y0Var3, new e0(10)), new e23.a(this) { // from class: s51.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c.a f157378b;

                {
                    this.f157378b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            c cVar2 = (c) this.f157378b.f157381a.d();
                            if (cVar2 != null) {
                                cVar2.g();
                            }
                            break;
                        default:
                            c cVar3 = (c) this.f157378b.f157381a.d();
                            if (cVar3 != null) {
                                cVar3.i();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new e23.a(this) { // from class: s51.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c.a f157378b;

                {
                    this.f157378b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            c cVar2 = (c) this.f157378b.f157381a.d();
                            if (cVar2 != null) {
                                cVar2.g();
                            }
                            break;
                        default:
                            c cVar3 = (c) this.f157378b.f157381a.d();
                            if (cVar3 != null) {
                                cVar3.i();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new qw0.y(this, 29), y0Var);
        }
    }

    public abstract void g();

    public abstract void h(Value value);

    public abstract void i();
}
