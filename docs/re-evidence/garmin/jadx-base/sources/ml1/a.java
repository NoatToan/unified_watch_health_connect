package ml1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import wn0.g;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119296c;

    public /* synthetic */ a(String str, e eVar, int i14, int i15) {
        this.f119294a = i15;
        this.f119295b = str;
        this.f119296c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f119294a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                b.a(this.f119295b, this.f119296c, mVar, p0.t(49));
                break;
            default:
                g.i(this.f119295b, this.f119296c, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }
}
