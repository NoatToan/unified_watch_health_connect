package com.garmin.android.library.mobileauth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p005kotlin.Metadata;
import re2.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/AuthenticatorService;", "Landroid/app/Service;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticatorService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f50336a = new f0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder = this.f50336a.getIBinder();
        iBinder.getClass();
        return iBinder;
    }
}
