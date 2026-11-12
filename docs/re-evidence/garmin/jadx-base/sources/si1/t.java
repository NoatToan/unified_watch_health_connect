package si1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import gg1.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsi1/t;", "Lg/a;", "", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends g.a<Long, Unit> {
    @Override // g.a
    public final Intent a(Context context, Long l14) {
        long jLongValue = l14.longValue();
        context.getClass();
        v0.T.getClass();
        v0 v0VarB = v0.a.b();
        v0VarB.getClass();
        Uri uri = Uri.parse(fb1.c.n("https://", v0VarB.F) + "/app/addDevice?unitId=" + jLongValue);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
