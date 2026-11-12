package p008y1;

import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import r1.n2;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/r2;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2 f193614a = new r2();

    private r2() {
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public static b0 a(m mVar) {
        x1 x1Var = n.f135158a;
        y yVarA = n2.a(mVar);
        boolean zB = mVar.B(yVarA);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new b0(yVarA, null, 2, null);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b0(yVarA, null, 2, null);
                mVar.K(objQ);
            }
        }
        return (b0) objQ;
    }
}
