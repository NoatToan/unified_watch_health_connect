package cq0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import yr.c0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f55118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55119c;

    public /* synthetic */ a(int i14, List list, int i15) {
        this.f55117a = 2;
        this.f55119c = i14;
        this.f55118b = list;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f55117a) {
            case 0:
                num.intValue();
                b.a(this.f55118b, mVar, p0.t(this.f55119c | 1));
                break;
            case 1:
                num.intValue();
                b.a(this.f55118b, mVar, p0.t(this.f55119c | 1));
                break;
            default:
                num.getClass();
                c0.g(this.f55119c, this.f55118b, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(List list, int i14, int i15) {
        this.f55117a = i15;
        this.f55118b = list;
        this.f55119c = i14;
    }
}
