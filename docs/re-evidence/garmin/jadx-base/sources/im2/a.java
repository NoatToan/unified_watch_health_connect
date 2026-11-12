package im2;

import java.util.ArrayList;
import java.util.Iterator;
import o53.c2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements vm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f94213c;

    public /* synthetic */ a(ArrayList arrayList, c2 c2Var, int i14) {
        this.f94211a = i14;
        this.f94212b = arrayList;
        this.f94213c = c2Var;
    }

    @Override // vm2.b
    public final void cancel() {
        int i14 = this.f94211a;
        c2 c2Var = this.f94213c;
        ArrayList arrayList = this.f94212b;
        switch (i14) {
            case 0:
                c.a aVar = c.f94215e;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c83.d) it.next()).cancel();
                }
                c2Var.c(null);
                break;
            case 1:
                c.a aVar2 = c.f94215e;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((c83.d) it3.next()).cancel();
                }
                c2Var.c(null);
                break;
            case 2:
                c.a aVar3 = c.f94215e;
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((c83.d) it4.next()).cancel();
                }
                c2Var.c(null);
                break;
            default:
                c.a aVar4 = c.f94215e;
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((c83.d) it5.next()).cancel();
                }
                c2Var.c(null);
                break;
        }
    }
}
