package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.view.View;
import bz0.o;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/HttpLogger;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "", "newValue", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleToggle", "(ZLandroid/view/View;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HttpLogger implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.HTTP_LOGGER;
        String str = dVar.f112244a;
        String str2 = dVar.f112245b;
        String str3 = dVar.f112246c;
        kg1.a.f104701a.getClass();
        return new mg1.a(str, str2, str3, false, kg1.a.C2003a.a().m(), 8, null);
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
    public void handleToggle(boolean newValue, View view2, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        showProgress.getClass();
        modelItem.getClass();
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().b(newValue);
        int i14 = zy0.k.f207457a;
        o.f22274a.getClass();
        if (newValue != o.f22282i) {
            o.f22282i = newValue;
            if (newValue) {
                OkHttpClient okHttpClientJ = o.j();
                jd2.a aVar = jd2.a.HTTP_EVENTS;
                jd2.b.b(okHttpClientJ, aVar);
                jd2.b.b(o.e(), aVar);
                jd2.b.b(o.f(), aVar);
                jd2.b.b(o.b(), aVar);
                jd2.b.b(o.c(), aVar);
                jd2.b.b(o.d(), aVar);
                jd2.b.b(o.g(), aVar);
            } else {
                OkHttpClient okHttpClientJ2 = o.j();
                jd2.a aVar2 = jd2.a.HTTP_EVENTS;
                jd2.b.a(okHttpClientJ2, aVar2);
                jd2.b.a(o.e(), aVar2);
                jd2.b.a(o.f(), aVar2);
                jd2.b.a(o.b(), aVar2);
                jd2.b.a(o.c(), aVar2);
                jd2.b.a(o.d(), aVar2);
                jd2.b.a(o.g(), aVar2);
            }
        }
        if (he2.a.f83532d != newValue) {
            he2.a.f83532d = newValue;
            if (newValue) {
                OkHttpClient okHttpClient = he2.a.f83530b;
                if (okHttpClient != null) {
                    jd2.b.b(okHttpClient, jd2.a.HTTP_EVENTS);
                }
            } else {
                OkHttpClient okHttpClient2 = he2.a.f83530b;
                if (okHttpClient2 != null) {
                    jd2.b.a(okHttpClient2, jd2.a.HTTP_EVENTS);
                }
            }
        }
        ln2.e eVar = ln2.e.f113687a;
        OkHttpClient okHttpClient3 = ln2.e.f113689c;
        if (okHttpClient3 != null) {
            eVar.getClass();
            if (newValue) {
                jd2.b.b(okHttpClient3, jd2.a.HTTP_EVENTS);
            } else {
                jd2.b.a(okHttpClient3, jd2.a.HTTP_EVENTS);
            }
        }
        OkHttpClient okHttpClient4 = ln2.e.f113690d;
        if (okHttpClient4 == null) {
            eVar.getClass();
            return;
        }
        eVar.getClass();
        if (newValue) {
            jd2.b.b(okHttpClient4, jd2.a.HTTP_EVENTS);
        } else {
            jd2.b.a(okHttpClient4, jd2.a.HTTP_EVENTS);
        }
    }
}
