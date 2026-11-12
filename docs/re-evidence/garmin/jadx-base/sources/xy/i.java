package xy;

import e23.p;
import java.util.TreeMap;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TreeMap f192625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f192626c;

    public /* synthetic */ i(TreeMap treeMap, e23.l lVar, int i14, int i15) {
        this.f192624a = i15;
        this.f192625b = treeMap;
        this.f192626c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f192624a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j.a(this.f192625b, this.f192626c, mVar, p0.t(1));
                break;
            default:
                l.a(this.f192625b, this.f192626c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
