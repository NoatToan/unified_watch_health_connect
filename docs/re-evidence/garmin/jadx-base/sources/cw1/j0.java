package cw1;

import java.util.Iterator;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56070a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f56071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f56072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f56073d;

    public /* synthetic */ j0(e23.l lVar, i53.c cVar, p3.n1 n1Var) {
        this.f56072c = lVar;
        this.f56071b = cVar;
        this.f56073d = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f56070a) {
            case 0:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                this.f56072c.invoke(localDate);
                Iterator<E> it = this.f56071b.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    if (((jv1.q) it.next()).f101113a.equals(localDate)) {
                        this.f56073d.t(i14);
                    } else {
                        i14++;
                    }
                    break;
                }
                i14 = -1;
                this.f56073d.t(i14);
                break;
            default:
                int iIntValue = ((Number) this.f56071b.get(((Integer) obj).intValue())).intValue();
                p3.n1 n1Var = this.f56073d;
                n1Var.t(iIntValue);
                this.f56072c.invoke(Integer.valueOf(n1Var.getIntValue()));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j0(i53.c cVar, e23.l lVar, p3.n1 n1Var) {
        this.f56071b = cVar;
        this.f56072c = lVar;
        this.f56073d = n1Var;
    }
}
