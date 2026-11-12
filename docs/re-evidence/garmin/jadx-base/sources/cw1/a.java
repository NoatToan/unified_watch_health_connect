package cw1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f55958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f55960d;

    public /* synthetic */ a(List list, String str, h4.r rVar, int i14, int i15) {
        this.f55957a = i15;
        this.f55958b = list;
        this.f55959c = str;
        this.f55960d = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55957a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.d(p3.p0.t(1), this.f55960d, this.f55959c, this.f55958b, mVar);
                break;
            default:
                q1.a(p3.p0.t(1), this.f55960d, this.f55959c, this.f55958b, mVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
