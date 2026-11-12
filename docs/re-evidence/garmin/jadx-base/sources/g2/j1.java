package g2;

import ch.qos.logback.core.CoreConstants;
import g2.l1.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f75144b;

    public /* synthetic */ j1(l1 l1Var, int i14) {
        this.f75143a = i14;
        this.f75144b = l1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f75143a) {
            case 0:
                i0 i0VarInvoke = this.f75144b.f75156a.invoke();
                int itemCount = i0VarInvoke.getItemCount();
                int i14 = 0;
                while (i14 < itemCount) {
                    if (i0VarInvoke.getKey(i14).equals(obj)) {
                        return Integer.valueOf(i14);
                    }
                    i14++;
                }
                i14 = -1;
                return Integer.valueOf(i14);
            default:
                int iIntValue = ((Integer) obj).intValue();
                l1 l1Var = this.f75144b;
                i0 i0VarInvoke2 = l1Var.f75156a.invoke();
                if (iIntValue < 0 || iIntValue >= i0VarInvoke2.getItemCount()) {
                    StringBuilder sbI = b71.i.i(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbI.append(i0VarInvoke2.getItemCount());
                    sbI.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    b2.e.a(sbI.toString());
                }
                ge1.b.T(l1Var.getCoroutineScope(), null, null, l1Var.new a(iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
