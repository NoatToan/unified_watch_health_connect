package si1;

import android.content.Context;
import android.content.Intent;
import c22.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsi1/u;", "Lg/a;", "Lhb2/g$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends g.a<hb2.g.a, Unit> {
    @Override // g.a
    public final Intent a(Context context, hb2.g.a aVar) {
        hb2.g.a aVar2 = aVar;
        context.getClass();
        aVar2.getClass();
        q0.f23203a.getClass();
        return new Intent("android.intent.action.VIEW", q0.a.a(context, aVar2));
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
