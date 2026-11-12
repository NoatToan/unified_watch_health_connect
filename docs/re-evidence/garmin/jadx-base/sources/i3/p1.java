package i3;

import android.graphics.PathMeasure;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/p1;", "", "Lo4/f1;", "checkPath", "Lo4/i1;", "pathMeasure", "pathToDraw", "<init>", "(Lo4/f1;Lo4/i1;Lo4/f1;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4.f1 f89257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.i1 f89258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.f1 f89259c;

    public p1(o4.f1 f1Var, o4.i1 i1Var, o4.f1 f1Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? o4.m.a() : f1Var, (i14 & 2) != 0 ? new o4.l(new PathMeasure()) : i1Var, (i14 & 4) != 0 ? o4.m.a() : f1Var2);
    }

    public p1(o4.f1 f1Var, o4.i1 i1Var, o4.f1 f1Var2) {
        this.f89257a = f1Var;
        this.f89258b = i1Var;
        this.f89259c = f1Var2;
    }

    public p1() {
        this(null, null, null, 7, null);
    }
}
