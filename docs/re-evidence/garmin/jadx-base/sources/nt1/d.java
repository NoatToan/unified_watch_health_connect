package nt1;

import android.content.Context;
import android.content.Intent;
import c80.q;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnt1/d;", "Lg/a;", "", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends g.a<Object, Unit> {
    @Override // g.a
    public final Intent a(Context context, Object obj) {
        context.getClass();
        obj.getClass();
        return ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, q.GARMIN_TRAILS, false);
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return null;
    }
}
