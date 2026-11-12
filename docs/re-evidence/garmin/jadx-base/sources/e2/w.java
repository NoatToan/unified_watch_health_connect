package e2;

import f5.v1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f62537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f62538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f62539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f62540e;

    public /* synthetic */ w(p1 p1Var, ArrayList arrayList, List list, boolean z14, int i14) {
        this.f62536a = i14;
        this.f62537b = p1Var;
        this.f62538c = arrayList;
        this.f62539d = list;
        this.f62540e = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f62536a;
        boolean z14 = this.f62540e;
        List list = this.f62539d;
        ArrayList arrayList = this.f62538c;
        p1 p1Var = this.f62537b;
        v1.a aVar = (v1.a) obj;
        switch (i14) {
            case 0:
                aVar.f69149a = true;
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ((y) arrayList.get(i15)).d(aVar, z14);
                }
                int size2 = list.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((y) list.get(i16)).d(aVar, z14);
                }
                Unit unit = Unit.INSTANCE;
                aVar.f69149a = false;
                p1Var.getF182175a();
                break;
            default:
                aVar.f69149a = true;
                int size3 = arrayList.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    ((f2.a0) arrayList.get(i17)).q(aVar, z14);
                }
                int size4 = list.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    ((f2.a0) list.get(i18)).q(aVar, z14);
                }
                Unit unit2 = Unit.INSTANCE;
                aVar.f69149a = false;
                p1Var.getF182175a();
                break;
        }
        return Unit.INSTANCE;
    }
}
