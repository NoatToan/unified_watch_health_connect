package gv0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f79356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f79357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f79358d;

    public /* synthetic */ p0(e23.l lVar, Context context, c.q qVar, int i14) {
        this.f79355a = i14;
        this.f79356b = lVar;
        this.f79357c = context;
        this.f79358d = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f79355a) {
            case 0:
                this.f79356b.invoke(new fv0.d(this.f79357c, this.f79358d, 2));
                break;
            case 1:
                this.f79356b.invoke(new fv0.d(this.f79357c, this.f79358d, 1));
                break;
            case 2:
                this.f79356b.invoke(new fv0.d(this.f79357c, this.f79358d, 3));
                break;
            default:
                this.f79356b.invoke(new fv0.d(this.f79357c, this.f79358d, 4));
                break;
        }
        return Unit.INSTANCE;
    }
}
