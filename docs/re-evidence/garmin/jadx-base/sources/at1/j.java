package at1;

import e23.p;
import p005kotlin.Unit;
import p3.p0;
import wv0.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f12786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12787d;

    public /* synthetic */ j(String str, e23.a aVar, int i14, int i15) {
        this.f12784a = i15;
        this.f12785b = str;
        this.f12786c = aVar;
        this.f12787d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f12784a) {
            case 0:
                num.intValue();
                dh.b.k(p0.t(this.f12787d | 1), this.f12786c, this.f12785b, mVar);
                break;
            case 1:
                num.intValue();
                c12.d.e(p0.t(this.f12787d | 1), this.f12786c, this.f12785b, mVar);
                break;
            case 2:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.K(this.f12785b, this.f12786c, mVar, p0.t(1), this.f12787d);
                break;
            case 3:
                num.getClass();
                ux1.j.d(p0.t(this.f12787d | 1), this.f12786c, this.f12785b, mVar);
                break;
            default:
                num.getClass();
                x.a(this.f12785b, this.f12786c, mVar, p0.t(1), this.f12787d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(String str, e23.a aVar, int i14, int i15, int i16) {
        this.f12784a = i16;
        this.f12785b = str;
        this.f12786c = aVar;
        this.f12787d = i15;
    }
}
