package n01;

import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln01/g;", "Lyc/h3;", "", "Lg01/n;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g extends h3<Integer, g01.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122127b;

    @Override // yc.h3
    public final Integer c(i3<Integer, g01.n> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        h3.b.c<Integer, g01.n> cVarA = i3Var.a(num3.intValue());
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return wr.g.m(1, num2);
        }
        if (cVarA == null || (num = cVarA.f196018c) == null) {
            return null;
        }
        return b71.i.e(1, num);
    }

    public final int f(int i14, int i15) {
        int i16 = (i14 * i15) - this.f122127b;
        if (i16 < 0) {
            return 0;
        }
        return i16;
    }

    public final void g(boolean z14) {
        if (z14) {
            this.f122127b = 0;
        }
    }
}
