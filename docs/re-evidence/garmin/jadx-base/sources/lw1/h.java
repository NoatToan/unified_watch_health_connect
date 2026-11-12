package lw1;

import e23.p;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115121a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f115122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f115124d;

    public /* synthetic */ h(int i14, int i15, e23.l lVar, ArrayList arrayList) {
        this.f115122b = arrayList;
        this.f115123c = i14;
        this.f115124d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f115121a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                j.a(this.f115122b, this.f115124d, mVar, p0.t(this.f115123c | 1));
                break;
            default:
                z21.f.g(this.f115122b, this.f115123c, this.f115124d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(ArrayList arrayList, e23.l lVar, int i14) {
        this.f115122b = arrayList;
        this.f115124d = lVar;
        this.f115123c = i14;
    }
}
