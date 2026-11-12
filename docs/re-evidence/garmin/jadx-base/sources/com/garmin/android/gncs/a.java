package com.garmin.android.gncs;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements ib2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49894a;

    public /* synthetic */ a(int i14) {
        this.f49894a = i14;
    }

    @Override // ib2.a
    public final Object b() {
        switch (this.f49894a) {
            case 0:
                return new GNCSNotificationManager(0);
            default:
                return StatusBarNotificationListenerManager.InjectorConfiguration.configure$lambda$0();
        }
    }
}
