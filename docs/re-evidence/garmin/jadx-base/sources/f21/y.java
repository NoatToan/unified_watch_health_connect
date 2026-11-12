package f21;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f68632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f68633c;

    public /* synthetic */ y(e23.l lVar, ArrayList arrayList) {
        this.f68631a = 0;
        this.f68632b = arrayList;
        this.f68633c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f68631a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                ((List) obj).getClass();
                this.f68633c.invoke((g21.r) this.f68632b.get(iIntValue));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                gr2.f.b(this.f68632b, this.f68633c, (p3.m) obj, iT);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                kh0.w.b(this.f68632b, this.f68633c, (p3.m) obj, iT2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                rr0.j.b(this.f68632b, this.f68633c, (p3.m) obj, iT3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(1);
                rr0.j.b(this.f68632b, this.f68633c, (p3.m) obj, iT4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT5 = p0.t(1);
                yy1.v.b(this.f68632b, this.f68633c, (p3.m) obj, iT5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(int i14, int i15, e23.l lVar, ArrayList arrayList) {
        this.f68631a = i15;
        this.f68632b = arrayList;
        this.f68633c = lVar;
    }
}
