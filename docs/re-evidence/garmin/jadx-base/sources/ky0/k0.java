package ky0;

import android.content.Context;
import java.util.List;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f107400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.q f107401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f107402d;

    public /* synthetic */ k0(Context context, c.q qVar, x3 x3Var, int i14) {
        this.f107399a = i14;
        this.f107400b = context;
        this.f107401c = qVar;
        this.f107402d = x3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f107399a) {
            case 0:
                list.getClass();
                s0.b(this.f107400b, this.f107401c, this.f107402d, list);
                break;
            default:
                list.getClass();
                s0.b(this.f107400b, this.f107401c, this.f107402d, list);
                break;
        }
        return Unit.INSTANCE;
    }
}
