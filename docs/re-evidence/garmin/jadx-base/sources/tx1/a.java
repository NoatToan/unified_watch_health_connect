package tx1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.e3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx1/a;", "Lg/a;", "Ltx1/c;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g.a<c, Boolean> {
    @Override // g.a
    public final Intent a(Context context, c cVar) {
        c cVar2 = cVar;
        context.getClass();
        cVar2.getClass();
        return ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).B((Activity) context, cVar2.f166843a, cVar2.f166844b, cVar2.f166845c);
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}
