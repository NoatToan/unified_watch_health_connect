package aq1;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.v1;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.b f12356b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.startup.b bVar, int i14) {
        this.f12355a = i14;
        this.f12356b = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f12355a;
        com.garmin.android.apps.connectmobile.startup.b bVar = this.f12356b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.startup.b.a aVar = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                bVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.startup.b.a aVar2 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                p2 p2Var = ((com.garmin.android.apps.connectmobile.startup.e) bVar.f44802a.getValue()).f44833f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e.a((e) value, null, 1)));
                break;
            default:
                com.garmin.android.apps.connectmobile.startup.b.a aVar3 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                com.garmin.android.apps.connectmobile.startup.e eVar = (com.garmin.android.apps.connectmobile.startup.e) bVar.f44802a.getValue();
                eVar.getClass();
                ge1.b.T(v1.a(eVar), null, null, new com.garmin.android.apps.connectmobile.startup.g(eVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
