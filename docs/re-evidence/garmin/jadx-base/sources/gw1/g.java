package gw1;

import android.content.Context;
import androidx.fragment.app.m;
import c.q;
import li0.b0;
import li0.d0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f79849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f79851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79852f;

    public /* synthetic */ g(boolean z14, li0.f fVar, Context context, d0 d0Var, boolean z15) {
        this.f79847a = 2;
        this.f79850d = z14;
        this.f79848b = fVar;
        this.f79849c = context;
        this.f79852f = d0Var;
        this.f79851e = z15;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f79847a;
        Context context = this.f79849c;
        boolean z14 = this.f79851e;
        Object obj = this.f79852f;
        Object obj2 = this.f79848b;
        boolean z15 = this.f79850d;
        switch (i14) {
            case 0:
                k.e((iw1.a) obj2, (m) context, z15, z14, (q) obj);
                break;
            case 1:
                k.e((iw1.a) obj2, (m) context, z15, z14, (q) obj);
                break;
            default:
                li0.f fVar = (li0.f) obj2;
                d0 d0Var = (d0) obj;
                Context context2 = this.f79849c;
                if (z15) {
                    fVar.e(context2, d0Var);
                } else if (z14) {
                    b0 b0Var = d0Var.f112649b;
                    if (b0Var == b0.FOLLOW || b0Var == b0.FOLLOW_BACK) {
                        fVar.l(8, d0Var.f112650c);
                    } else {
                        li0.f.a aVar = li0.f.f112657g;
                        fVar.getClass();
                        context2.getClass();
                        ge1.b.T(fVar.f112660a, null, null, new li0.j(new li0.f.b(), fVar, d0Var, context2, null), 3);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(iw1.a aVar, m mVar, boolean z14, boolean z15, q qVar, int i14) {
        this.f79847a = i14;
        this.f79848b = aVar;
        this.f79849c = mVar;
        this.f79850d = z14;
        this.f79851e = z15;
        this.f79852f = qVar;
    }
}
