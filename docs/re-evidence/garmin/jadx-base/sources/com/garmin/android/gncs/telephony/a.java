package com.garmin.android.gncs.telephony;

import com.google.androidbrowserhelper.trusted.QualityEnforcer;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f49909b;

    public /* synthetic */ a(String str, int i14) {
        this.f49908a = i14;
        this.f49909b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49908a) {
            case 0:
                PhoneCallListener.onIncomingCallEnded$lambda$20(this.f49909b);
                break;
            case 1:
                PhoneCallListener.onIncomingCallStarted$lambda$5(this.f49909b);
                break;
            case 2:
                PhoneCallListener.onIncomingCallAnswered$lambda$14(this.f49909b);
                break;
            default:
                QualityEnforcer.lambda$new$0(this.f49909b);
                break;
        }
    }
}
