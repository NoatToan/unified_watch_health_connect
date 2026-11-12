package p006l2;

import d4.l;
import j23.t;
import ky0.c;
import n4.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p008y1.b2;
import p3.a2;
import p3.a4;
import p3.c2;
import p3.z1;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ll2/f3;", "", "Ly1/b2;", "initialOrientation", "", "initial", "<init>", "(Ly1/b2;F)V", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f108478g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f108479h = d4.a.b(new c(12), new w2(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f108480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f108481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f108482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f108483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f108484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f108485f;

    public f3(b2 b2Var, float f14) {
        this.f108480a = new z1(f14);
        this.f108481b = new z1(0.0f);
        this.f108482c = new a2(0);
        d.f123545e.getClass();
        this.f108483d = d.f123546f;
        w0.f157315b.getClass();
        this.f108484e = w0.f157316c;
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f108485f = new c2(b2Var, a4Var);
    }

    public final void a(b2 b2Var, d dVar, int i14, int i15) {
        float f14;
        float f15 = i15 - i14;
        this.f108481b.i(f15);
        float f16 = dVar.f123547a;
        float f17 = dVar.f123548b;
        d dVar2 = this.f108483d;
        float f18 = dVar2.f123547a;
        z1 z1Var = this.f108480a;
        if (f16 != f18 || f17 != dVar2.f123548b) {
            boolean z14 = b2Var == b2.Vertical;
            if (z14) {
                f16 = f17;
            }
            float f19 = z14 ? dVar.f123550d : dVar.f123549c;
            float floatValue = z1Var.getFloatValue();
            float f22 = i14;
            float f24 = floatValue + f22;
            if (f19 <= f24 && (f16 >= floatValue || f19 - f16 <= f22)) {
                f14 = (f16 >= floatValue || f19 - f16 > f22) ? 0.0f : f16 - floatValue;
            } else {
                f14 = f19 - f24;
            }
            z1Var.i(z1Var.getFloatValue() + f14);
            this.f108483d = dVar;
        }
        z1Var.i(t.d(z1Var.getFloatValue(), 0.0f, f15));
        this.f108482c.t(i14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/f3$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f3(b2 b2Var, float f14, int i14, j jVar) {
        this(b2Var, (i14 & 2) != 0 ? 0.0f : f14);
    }

    public f3() {
        this(b2.Vertical, 0.0f, 2, null);
    }
}
