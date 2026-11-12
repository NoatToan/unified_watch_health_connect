package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import gg1.u0;
import i3.e5;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/RemoteConfigEnv;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RemoteConfigEnv implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.FIREBASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.GCM_PROD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.GCM_PROD_CHINA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.GCM_DEV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u0.GCM_DEV_CHINA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$0(mg1.a aVar, e23.a aVar2, DialogInterface dialogInterface, int i14) {
        dialogInterface.getClass();
        u0 u0Var = u0.values()[i14];
        int i15 = WhenMappings.$EnumSwitchMapping$0[u0Var.ordinal()];
        if (i15 == 1) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.l.a(true);
        } else if (i15 == 2) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.l.b("garmin-connect-mobile", false, true, null);
        } else if (i15 == 3) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.l.b("garmin-connect-mobile", true, true, null);
        } else if (i15 == 4) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.l.b("garmin-connect-mobile-dev", false, true, null);
        } else if (i15 != 5) {
            lc.u0.r();
            return;
        } else {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.l.b("garmin-connect-mobile-dev", true, true, null);
        }
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().u(u0Var);
        aVar.f118373c = u0Var.f77328a;
        aVar2.invoke();
        dialogInterface.dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        String strG;
        getContext.getClass();
        lg1.d dVar = lg1.d.REMOTE_CONFIG_ENV;
        kg1.a.f104701a.getClass();
        u0 u0VarJ = kg1.a.C2003a.a().j();
        if (u0VarJ == null || (strG = u0VarJ.f77328a) == null) {
            gh2.i iVar = gh2.i.f77458c;
            strG = e5.g(iVar.f77459a.name(), StringUtils.SPACE, iVar.a().f77477b.h("firebase_env"));
        }
        return new mg1.a(dVar.f112244a, dVar.f112245b, strG, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        u0.f77321d.getClass();
        u0[] u0VarArrValues = u0.values();
        ArrayList arrayList = new ArrayList(u0VarArrValues.length);
        int length = u0VarArrValues.length;
        for (int i14 = 0; i14 < length; i14++) {
            u0 u0Var = u0VarArrValues[i14];
            arrayList.add(u0Var == u0.FIREBASE ? tn.k.g(u0Var.f77328a, " Production") : u0Var.f77328a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        u0.a aVar = u0.f77321d;
        kg1.a.f104701a.getClass();
        u0 u0VarJ = kg1.a.C2003a.a().j();
        aVar.getClass();
        new androidx.appcompat.app.e.a(contextA).setTitle("Set Remote Config Provider").setSingleChoiceItems(strArr, u0VarJ != null ? u.i0(u0.values()).indexOf(u0VarJ) : -1, new h(modelItem, notifyChange, 2)).show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
