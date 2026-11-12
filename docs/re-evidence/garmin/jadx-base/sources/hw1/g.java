package hw1;

import e23.p;
import h4.r;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import s70.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f85957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f85958c;

    public /* synthetic */ g(r rVar, ArrayList arrayList, int i14, int i15) {
        this.f85956a = i15;
        this.f85957b = rVar;
        this.f85958c = arrayList;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85956a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.a(this.f85957b, this.f85958c, mVar, p0.t(7));
                break;
            default:
                u.a(this.f85957b, this.f85958c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
