package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a {
    public static Context a(View view2, e23.a aVar, e23.l lVar, mg1.a aVar2) {
        view2.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        return view2.getContext();
    }

    public static void b(View view2, e23.a aVar, e23.l lVar, mg1.a aVar2, Class cls) {
        view2.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        Context context = view2.getContext();
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) cls));
    }
}
