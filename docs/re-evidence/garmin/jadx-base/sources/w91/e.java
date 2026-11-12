package w91;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f183591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f183592d;

    public /* synthetic */ e(ba1.d dVar, Context context, c.q qVar, int i14) {
        this.f183589a = i14;
        this.f183590b = dVar;
        this.f183591c = context;
        this.f183592d = qVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Long l14 = (Long) obj;
        switch (this.f183589a) {
            case 0:
                this.f183590b.getClass();
                ba1.d.E4(this.f183591c, this.f183592d, l14.longValue(), (String) obj2);
                break;
            default:
                this.f183590b.getClass();
                ba1.d.E4(this.f183591c, this.f183592d, l14.longValue(), (String) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
