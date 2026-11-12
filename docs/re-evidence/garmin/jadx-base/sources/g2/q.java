package g2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u000fB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lg2/q;", "Lh4/r$c;", "Lh5/c0;", "Lf5/i;", "Lf5/g;", "Lg2/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lg2/n;", "beyondBoundsInfo", "", "reverseLayout", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Lg2/r;Lg2/n;ZLy1/b2;)V", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends h4.r.c implements h5.c0, f5.i, f5.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f75200e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f75201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f75202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p008y1.b2 f75204d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g2/q$a", "Lf5/g$a;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.g.a {
        @Override // f5.g.a
        public final boolean a() {
            return false;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75205a;

        static {
            int[] iArr = new int[g6.o.values().length];
            try {
                iArr[g6.o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g6.o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75205a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g2/q$d", "Lf5/g$a;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements f5.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<n.a> f75207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f75208c;

        public d(p005kotlin.jvm.internal.r0<n.a> r0Var, int i14) {
            this.f75207b = r0Var;
            this.f75208c = i14;
        }

        @Override // f5.g.a
        public final boolean a() {
            n.a aVar = this.f75207b.f105810a;
            a aVar2 = q.f75200e;
            return q.this.U1(aVar, this.f75208c);
        }
    }

    static {
        new b(null);
        f75200e = new a();
    }

    public q(r rVar, n nVar, boolean z14, p008y1.b2 b2Var) {
        this.f75201a = rVar;
        this.f75202b = nVar;
        this.f75203c = z14;
        this.f75204d = b2Var;
    }

    @Override // f5.g
    public final <T> T J0(int i14, e23.l<? super f5.g.a, ? extends T> lVar) {
        if (this.f75201a.getItemCount() <= 0 || !this.f75201a.a() || !getIsAttached()) {
            return lVar.invoke(f75200e);
        }
        boolean zV1 = V1(i14);
        r rVar = this.f75201a;
        int iD = zV1 ? rVar.d() : rVar.b();
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        n nVar = this.f75202b;
        nVar.getClass();
        T t7 = (T) new n.a(iD, iD);
        nVar.f75177a.b(t7);
        r0Var.f105810a = t7;
        int iC = this.f75201a.c() * 2;
        int itemCount = this.f75201a.getItemCount();
        if (iC > itemCount) {
            iC = itemCount;
        }
        T tInvoke = null;
        int i15 = 0;
        while (tInvoke == null && U1((n.a) r0Var.f105810a, i14) && i15 < iC) {
            n.a aVar = (n.a) r0Var.f105810a;
            int i16 = aVar.f75178a;
            int i17 = aVar.f75179b;
            if (V1(i14)) {
                i17++;
            } else {
                i16--;
            }
            n nVar2 = this.f75202b;
            nVar2.getClass();
            T t14 = (T) new n.a(i16, i17);
            nVar2.f75177a.b(t14);
            this.f75202b.f75177a.j((n.a) r0Var.f105810a);
            r0Var.f105810a = t14;
            i15++;
            h5.k.g(this).l();
            tInvoke = lVar.invoke(new d(r0Var, i14));
        }
        this.f75202b.f75177a.j((n.a) r0Var.f105810a);
        h5.k.g(this).l();
        return tInvoke;
    }

    @Override // f5.i
    public final q T() {
        return this;
    }

    public final boolean U1(n.a aVar, int i14) {
        f5.g.b.f68944b.getClass();
        if (i14 == f5.g.b.f68949g || i14 == f5.g.b.f68950h) {
            if (this.f75204d == p008y1.b2.Horizontal) {
                return false;
            }
        } else if (i14 == f5.g.b.f68947e || i14 == f5.g.b.f68948f) {
            if (this.f75204d == p008y1.b2.Vertical) {
                return false;
            }
        } else if (i14 != f5.g.b.f68945c && i14 != f5.g.b.f68946d) {
            vb.h.z("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (V1(i14)) {
            if (aVar.f75179b >= this.f75201a.getItemCount() - 1) {
                return false;
            }
        } else if (aVar.f75178a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean V1(int i14) {
        f5.g.b.f68944b.getClass();
        if (i14 == f5.g.b.f68945c) {
            return false;
        }
        if (i14 != f5.g.b.f68946d) {
            if (i14 == f5.g.b.f68949g) {
                return this.f75203c;
            }
            if (i14 == f5.g.b.f68950h) {
                if (this.f75203c) {
                    return false;
                }
            } else if (i14 == f5.g.b.f68947e) {
                int i15 = c.f75205a[h5.k.g(this).B.ordinal()];
                if (i15 == 1) {
                    return this.f75203c;
                }
                if (i15 != 2) {
                    lc.u0.r();
                    return false;
                }
                if (this.f75203c) {
                    return false;
                }
            } else {
                if (i14 != f5.g.b.f68948f) {
                    vb.h.z("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int i16 = c.f75205a[h5.k.g(this).B.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        return this.f75203c;
                    }
                    lc.u0.r();
                    return false;
                }
                if (this.f75203c) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 9));
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/q$b;", "", "<init>", "()V", "g2/q$a", "emptyBeyondBoundsScope", "Lg2/q$a;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
