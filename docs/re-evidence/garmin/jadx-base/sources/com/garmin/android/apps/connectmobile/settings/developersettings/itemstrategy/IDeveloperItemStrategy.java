package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.view.View;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nJA\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "newValue", "handleToggle", "(ZLandroid/view/View;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface IDeveloperItemStrategy {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void handleClick(IDeveloperItemStrategy iDeveloperItemStrategy, View view2, e23.a<Unit> aVar, e23.l<? super Boolean, Unit> lVar, mg1.a aVar2) {
            view2.getClass();
            aVar.getClass();
            lVar.getClass();
            aVar2.getClass();
            IDeveloperItemStrategy.super.handleClick(view2, aVar, lVar, aVar2);
        }

        @Deprecated
        public static void handleToggle(IDeveloperItemStrategy iDeveloperItemStrategy, boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
            view2.getClass();
            lVar.getClass();
            aVar.getClass();
            IDeveloperItemStrategy.super.handleToggle(z14, view2, lVar, aVar);
        }
    }

    mg1.a getDeveloperItem(e23.a<? extends Context> getContext);

    mg1.b getViewType();

    default void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        notifyChange.getClass();
        showProgress.getClass();
        modelItem.getClass();
    }

    default void handleToggle(boolean newValue, View view2, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        showProgress.getClass();
        modelItem.getClass();
    }
}
