package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.m0;
import p13.o0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/MapProviderSetting;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "", FirebaseAnalytics.Param.INDEX, "Lcom/garmin/android/library/mapsdkadapter/i$d;", "getMapProviderFromOption", "(I)Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "getOptionIndex", "(Lcom/garmin/android/library/mapsdkadapter/i$d;)I", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "", "", "itemsList", "Ljava/util/Map;", "getItemsList", "()Ljava/util/Map;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapProviderSetting implements IDeveloperItemStrategy {
    public static final int $stable = 8;
    private final Map<com.garmin.android.library.mapsdkadapter.i.d, String> itemsList = u0.e(new p(com.garmin.android.library.mapsdkadapter.i.d.NULL, "Default"), new p(com.garmin.android.library.mapsdkadapter.i.d.GOOGLE, "Google Map"), new p(com.garmin.android.library.mapsdkadapter.i.d.MAPBOX, "Mapbox Map"));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.BAIDU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.AMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.MAPBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final com.garmin.android.library.mapsdkadapter.i.d getMapProviderFromOption(int index) {
        if (index == 1) {
            return com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        }
        if (index == 2) {
            return com.garmin.android.library.mapsdkadapter.i.d.BAIDU;
        }
        if (index != 3) {
            return index != 4 ? com.garmin.android.library.mapsdkadapter.i.d.NULL : com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
        }
        return com.garmin.android.library.mapsdkadapter.i.d.AMAP;
    }

    private final int getOptionIndex(com.garmin.android.library.mapsdkadapter.i.d mapProvider) {
        int i14 = WhenMappings.$EnumSwitchMapping$0[mapProvider.ordinal()];
        int i15 = 1;
        if (i14 != 1) {
            i15 = 2;
            if (i14 != 2) {
                i15 = 3;
                if (i14 != 3) {
                    i15 = 4;
                    if (i14 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i15;
    }

    private static final boolean handleClick$lambda$1(com.garmin.android.library.mapsdkadapter.i.d dVar, p pVar) {
        pVar.getClass();
        return pVar.f128594a == dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleClick$lambda$3(List list, e23.a aVar, mg1.a aVar2, DialogInterface dialogInterface, int i14) {
        p pVar = (p) h0.e0(i14, list);
        if (pVar != null) {
            kg1.a.f104701a.getClass();
            kg1.a.C2003a.a().z((com.garmin.android.library.mapsdkadapter.i.d) pVar.f128594a);
            aVar2.f118373c = (String) pVar.f128595b;
        }
        aVar.invoke();
        dialogInterface.dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.MAP_PROVIDER;
        kg1.a.f104701a.getClass();
        String str = this.itemsList.get(kg1.a.C2003a.a().a());
        if (str == null) {
            str = this.itemsList.get(com.garmin.android.library.mapsdkadapter.i.d.NULL);
        }
        return new mg1.a(dVar.f112244a, dVar.f112245b, str, false, false, 24, null);
    }

    public final Map<com.garmin.android.library.mapsdkadapter.i.d, String> getItemsList() {
        return this.itemsList;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Object next;
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        Set<Map.Entry<com.garmin.android.library.mapsdkadapter.i.d, String>> setEntrySet = this.itemsList.entrySet();
        ArrayList arrayList = new ArrayList(y.r(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new p(entry.getKey(), entry.getValue()));
        }
        kg1.a.f104701a.getClass();
        com.garmin.android.library.mapsdkadapter.i.d dVarA = kg1.a.C2003a.a().a();
        Iterator it3 = h0.j1(arrayList).iterator();
        do {
            o0 o0Var = (o0) it3;
            if (!o0Var.f134956a.hasNext()) {
                next = null;
                break;
            }
            next = o0Var.next();
        } while (!handleClick$lambda$1(dVarA, (p) ((m0) next).f134952b));
        m0 m0Var = (m0) next;
        int i14 = m0Var != null ? m0Var.f134951a : -1;
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add((String) ((p) it4.next()).f128595b);
        }
        new androidx.appcompat.app.e.a(contextA).setTitle("Set Map Provider").setSingleChoiceItems((String[]) arrayList2.toArray(new String[0]), i14, new bi2.k(arrayList, 5, notifyChange, modelItem)).show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
