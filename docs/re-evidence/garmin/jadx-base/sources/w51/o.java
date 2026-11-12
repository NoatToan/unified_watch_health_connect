package w51;

import android.content.Context;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class o implements e23.l<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f182313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f182314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f182315c;

    public o(h0 h0Var, Context context, b63.o oVar) {
        this.f182313a = h0Var;
        this.f182314b = context;
        this.f182315c = oVar;
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        h0 h0Var = this.f182313a;
        h0Var.getClass();
        Context context = this.f182314b;
        context.getClass();
        b63.o oVar = this.f182315c;
        oVar.getClass();
        ge1.b.T(v1.a(h0Var), null, null, new y(h0Var, oVar, context, str2, null), 3);
        return Unit.INSTANCE;
    }
}
