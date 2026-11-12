package qb0;

import ca0.u1;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f144010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o90.a f144011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d90.f f144012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f144013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f144014f;

    public /* synthetic */ m(String str, o90.a aVar, d90.f fVar, u1 u1Var, e23.l lVar, int i14, int i15) {
        this.f144009a = i15;
        this.f144010b = str;
        this.f144011c = aVar;
        this.f144012d = fVar;
        this.f144013e = u1Var;
        this.f144014f = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f144009a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                n.a(this.f144010b, this.f144011c, this.f144012d, this.f144013e, this.f144014f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                u.a(this.f144010b, this.f144011c, this.f144012d, this.f144013e, this.f144014f, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
