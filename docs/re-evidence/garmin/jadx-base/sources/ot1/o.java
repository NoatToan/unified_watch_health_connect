package ot1;

import android.content.Context;
import java.util.Set;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;
import vs1.h0;
import vs1.i0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.k f133809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f133810c;

    public /* synthetic */ o(qt1.k kVar, Context context, int i14) {
        this.f133808a = i14;
        this.f133809b = kVar;
        this.f133810c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f133808a;
        Context context = this.f133810c;
        qt1.k kVar = this.f133809b;
        switch (i14) {
            case 0:
                u uVar = u.f133824a;
                context.getClass();
                vs1.l lVar = kVar.f147683r;
                Set<Long> set = kVar.f147684t.f179847f;
                lVar.getClass();
                set.getClass();
                b0 b0Var = lVar.f179848a;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.m(lVar, context, set, null), 2);
                break;
            case 1:
                y yVar = y.f133845a;
                context.getClass();
                h0 h0Var = kVar.f147686w;
                h0Var.getClass();
                ge1.b.T(h0Var.f179811a, null, null, new i0(h0Var, true, context, null), 3);
                break;
            default:
                h0 h0Var2 = kVar.f147686w;
                h0Var2.getClass();
                context.getClass();
                ge1.b.T(h0Var2.f179811a, null, null, new i0(h0Var2, true, context, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
