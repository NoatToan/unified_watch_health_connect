package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.view.View;
import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/EcgVisibility;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgVisibility implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        boolean zW = k1Var.W();
        boolean zB = ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c().b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Feature visibility [" + zW + "]");
        sb3.append("\nInternal Associate Build [false]\n");
        s3.f23252a.getClass();
        sb3.append("ROLE_TESTER_ASSOCIATE [" + s3.a("ROLE_TESTER_ASSOCIATE") + "]");
        sb3.append("\n");
        sb3.append("ROLE_SAMD_TESTER [" + s3.a("ROLE_SAMD_TESTER") + "]");
        sb3.append("\n");
        sb3.append("SAMD feature available (device/data) on the account [" + zB + "]");
        sb3.append("\n");
        lg1.d dVar = lg1.d.SAMD_VISIBILITY;
        return new mg1.a(dVar.f112244a, dVar.f112245b, sb3.toString(), false, k1Var.W());
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_SWITCH;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleClick(View view2, e23.a<Unit> aVar, e23.l<? super Boolean, Unit> lVar, mg1.a aVar2) {
        super.handleClick(view2, aVar, lVar, aVar2);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
