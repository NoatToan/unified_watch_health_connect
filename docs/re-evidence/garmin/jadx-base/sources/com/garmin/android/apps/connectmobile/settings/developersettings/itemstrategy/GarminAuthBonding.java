package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/GarminAuthBonding;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminAuthBonding implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$0(mg1.a aVar, e23.a aVar2, DialogInterface dialogInterface, int i14) {
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().S(Build.VERSION.SDK_INT + 1);
        aVar.f118373c = y.r();
        aVar2.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$2(mg1.a aVar, e23.a aVar2, DialogInterface dialogInterface, int i14) {
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().S(24);
        aVar.f118373c = y.r();
        aVar2.invoke();
        dialogInterface.dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.GARMIN_AUTH_BONDING;
        return new mg1.a(dVar.f112244a, dVar.f112245b, y.r(), false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        notifyChange.getClass();
        showProgress.getClass();
        modelItem.getClass();
        Context context = view2.getContext();
        lm2.h.d();
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().E() == 24) {
            new androidx.appcompat.app.e.a(context).setTitle("Enable Garmin Auth Bonding").setMessage("This option will allow to use Garmin Auth Bond to pair any device into GCM").setPositiveButton(R.string.lbl_ok, new h(modelItem, notifyChange, 0)).setNegativeButton(R.string.lbl_cancel, new c(3)).setIcon(android.R.drawable.ic_dialog_alert).show();
        } else {
            new androidx.appcompat.app.e.a(context).setTitle("Disable Garmin Auth Bonding").setMessage("This option will return to use System Bonding to pair any device into GCM.").setPositiveButton(R.string.lbl_ok, new h(modelItem, notifyChange, 1)).setNegativeButton(R.string.lbl_cancel, new c(4)).setIcon(android.R.drawable.ic_dialog_alert).show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
