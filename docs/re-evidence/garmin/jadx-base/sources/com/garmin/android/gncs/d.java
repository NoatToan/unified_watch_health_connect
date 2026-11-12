package com.garmin.android.gncs;

import com.garmin.android.gncs.datasource.GncsDataSourceSender;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49895a;

    public /* synthetic */ d(int i14) {
        this.f49895a = i14;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f49895a) {
            case 0:
                SmartNotificationsDataHandler.C39081.C09871.invokeSuspend$lambda$0((GncsDataSourceSender.Failure) obj);
                break;
            case 1:
                ((SmartNotifOSServiceLifecycleCallback) obj).onConnected();
                break;
            default:
                ((SmartNotifOSServiceLifecycleCallback) obj).onDisconnected();
                break;
        }
    }
}
