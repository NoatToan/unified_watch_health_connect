package da0;

import l72.h3;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f58673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f58675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58676e;

    public /* synthetic */ b0(e23.a aVar, u4.d dVar, String str, int i14) {
        this.f58672a = 2;
        this.f58673b = dVar;
        this.f58675d = aVar;
        this.f58674c = str;
        this.f58676e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f58672a) {
            case 0:
                num.intValue();
                m0.b(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            case 1:
                num.intValue();
                m0.b(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            case 2:
                num.getClass();
                k82.c.a(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            case 3:
                num.intValue();
                h3.b(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            case 4:
                num.intValue();
                h3.b(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            case 5:
                num.intValue();
                wg2.l.a(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
            default:
                num.intValue();
                wg2.l.a(p0.t(this.f58676e | 1), this.f58675d, this.f58674c, mVar, this.f58673b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b0(int i14, int i15, e23.a aVar, String str, u4.d dVar) {
        this.f58672a = i15;
        this.f58673b = dVar;
        this.f58674c = str;
        this.f58675d = aVar;
        this.f58676e = i14;
    }
}
