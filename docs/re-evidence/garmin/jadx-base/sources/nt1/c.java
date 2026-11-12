package nt1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnt1/c;", "Lg/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends g.a<com.garmin.android.apps.connectmobile.courses.model.e, Unit> {
    @Override // g.a
    public final Intent a(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = eVar;
        context.getClass();
        eVar2.getClass();
        return ((ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null)).b((Activity) context, eVar2);
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
