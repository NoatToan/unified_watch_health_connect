package kh0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f104769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gh0.a f104770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f104771d;

    public /* synthetic */ u(c.q qVar, gh0.a aVar, Context context, int i14) {
        this.f104768a = i14;
        this.f104769b = qVar;
        this.f104770c = aVar;
        this.f104771d = context;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f104768a) {
            case 0:
                this.f104769b.a(this.f104770c.i(this.f104771d), null);
                break;
            case 1:
                this.f104769b.a(this.f104770c.h(this.f104771d), null);
                break;
            default:
                this.f104769b.a(this.f104770c.h(this.f104771d), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
