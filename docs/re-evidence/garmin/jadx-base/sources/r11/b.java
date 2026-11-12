package r11;

import b63.z;
import i3.k4;
import i3.m4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f149361b;

    public /* synthetic */ b(m4 m4Var, int i14) {
        this.f149360a = i14;
        this.f149361b = m4Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f149360a) {
            case 0:
                Long lG = this.f149361b.g();
                if (lG == null) {
                    return null;
                }
                long jLongValue = lG.longValue();
                b63.l.INSTANCE.getClass();
                b63.l lVarA = b63.l.Companion.a(jLongValue);
                z.INSTANCE.getClass();
                return b63.b.d(lVarA, z.f16226b).b();
            default:
                return this.f149361b.g();
        }
    }
}
