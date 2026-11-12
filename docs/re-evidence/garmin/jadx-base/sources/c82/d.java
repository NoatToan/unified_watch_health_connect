package c82;

import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import yt.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f25720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25721d;

    public /* synthetic */ d(r rVar, List list, int i14, int i15) {
        this.f25718a = 2;
        this.f25719b = rVar;
        this.f25720c = list;
        this.f25721d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f25718a) {
            case 0:
                num.getClass();
                g.c(this.f25719b, this.f25720c, mVar, p0.t(this.f25721d | 1));
                break;
            case 1:
                num.intValue();
                sn0.c.b(this.f25719b, this.f25720c, mVar, p0.t(this.f25721d | 1));
                break;
            default:
                num.getClass();
                f0.c(this.f25719b, this.f25720c, this.f25721d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(r rVar, List list, int i14, int i15, byte b14) {
        this.f25718a = i15;
        this.f25719b = rVar;
        this.f25720c = list;
        this.f25721d = i14;
    }
}
