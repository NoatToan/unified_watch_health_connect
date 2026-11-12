package kotlin;

import e23.p;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f91396a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f91397b = new e(-1759434350, false, a.f91398a);

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements p<m, Integer, p005kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91398a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final p005kotlin.Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
            } else {
                mVar2.e();
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }
}
