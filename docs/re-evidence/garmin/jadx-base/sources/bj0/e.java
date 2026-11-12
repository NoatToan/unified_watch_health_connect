package bj0;

import android.content.Context;
import b71.o;
import d81.t;
import e23.l;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gj0.e f18346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f18347c;

    public /* synthetic */ e(gj0.e eVar, Context context, int i14) {
        this.f18345a = i14;
        this.f18346b = eVar;
        this.f18347c = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f18345a) {
            case 0:
                k0Var.getClass();
                String str = this.f18346b.f77506j;
                h0.n(k0Var, oi0.c.A(this.f18347c, new o(19), str));
                break;
            case 1:
                k0Var.getClass();
                String str2 = this.f18346b.f77497a;
                h0.n(k0Var, oi0.c.A(this.f18347c, new t(12), str2));
                break;
            default:
                k0Var.getClass();
                String str3 = this.f18346b.f77506j;
                h0.n(k0Var, oi0.c.A(this.f18347c, new t(13), str3));
                break;
        }
        return Unit.INSTANCE;
    }
}
