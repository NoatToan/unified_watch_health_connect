package com.garmin.android.apps.connectmobile.smartnotification;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.util.concurrent.Callable;
import un1.e;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f44347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.y f44348b;

    public c(a.y yVar, e eVar) {
        this.f44348b = yVar;
        this.f44347a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        Context contextCreatePackageContext;
        e eVar = this.f44347a;
        StatusBarNotification statusBarNotification = eVar.f172054b;
        if (statusBarNotification.getNotification().bigContentView == null) {
            return null;
        }
        a.y yVar = this.f44348b;
        a aVar = a.this;
        a aVar2 = a.this;
        aVar.getClass();
        try {
            contextCreatePackageContext = GarminConnectMobileApp.f28688j.getApplicationContext().createPackageContext(eVar.f172054b.getPackageName(), 2);
        } catch (Exception unused) {
            contextCreatePackageContext = GarminConnectMobileApp.f28688j;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(contextCreatePackageContext);
        int layoutId = statusBarNotification.getNotification().bigContentView.getLayoutId();
        Context context = GarminConnectMobileApp.f28688j;
        RemoteViews remoteViews = statusBarNotification.getNotification().bigContentView;
        aVar2.getClass();
        ViewGroup viewGroupD = a.d(context, remoteViews, layoutId, layoutInflaterFrom, true);
        StringBuilder sb3 = new StringBuilder();
        aVar2.getClass();
        a.c(sb3, viewGroupD, 0);
        return sb3.toString();
    }
}
