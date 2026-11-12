package y2;

import f5.c0;
import h5.c1;
import p005kotlin.Metadata;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ly2/p;", "", "Lf5/c0;", "layoutCoordinates", "Ls5/q0;", "textLayoutResult", "<init>", "(Lf5/c0;Ls5/q0;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f194136c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f194137d = new p(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f194138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f194139b;

    public p(c0 c0Var, q0 q0Var) {
        this.f194138a = c0Var;
        this.f194139b = q0Var;
    }

    public static p a(p pVar, c1 c1Var, q0 q0Var, int i14) {
        c0 c0Var = c1Var;
        if ((i14 & 1) != 0) {
            c0Var = pVar.f194138a;
        }
        if ((i14 & 2) != 0) {
            q0Var = pVar.f194139b;
        }
        pVar.getClass();
        return new p(c0Var, q0Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly2/p$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
