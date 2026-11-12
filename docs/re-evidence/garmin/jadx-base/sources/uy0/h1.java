package uy0;

import android.os.Bundle;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy0/h1;", "", "Lbn/a;", "historicalActivityTypesRepository", "<init>", "(Lbn/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn.a f173189a;

    public h1(bn.a aVar) {
        aVar.getClass();
        this.f173189a = aVar;
    }

    public final Object a(com.garmin.android.apps.connectmobile.navigation.more.b bVar, v13.i iVar) {
        ty0.b bVar2;
        Object objB;
        if (bVar instanceof com.garmin.android.apps.connectmobile.navigation.more.b.l) {
            bVar2 = ((com.garmin.android.apps.connectmobile.navigation.more.b.l) bVar).f39421c;
        } else {
            bVar2 = bVar instanceof com.garmin.android.apps.connectmobile.navigation.more.b.e ? ((com.garmin.android.apps.connectmobile.navigation.more.b.e) bVar).f39406d : null;
        }
        if (bVar2 == null) {
            return Unit.INSTANCE;
        }
        String str = bVar2.f166943i;
        if (str != null) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("Screen", "MainMenu");
            bundle.putString("Action", str);
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "UserAction");
        }
        return (bVar2 == ty0.b.K1 && (objB = bn.a.b(this.f173189a, true, iVar, 1)) == u13.a.COROUTINE_SUSPENDED) ? objB : Unit.INSTANCE;
    }
}
