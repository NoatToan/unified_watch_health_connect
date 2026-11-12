package com.garmin.android.apps.connectmobile.connectiq;

import android.app.Activity;
import android.content.res.Resources;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/n;", "Lla2/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f31905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31906b;

    public final void a(com.garmin.android.apps.connectmobile.c cVar, long j8) {
        cVar.getClass();
        this.f31905a = cVar;
        this.f31906b = j8;
        da2.d.b().f58886a.b(this);
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        Activity activity = this.f31905a;
        if (activity == null) {
            p005kotlin.jvm.internal.s.m("mActivity");
            throw null;
        }
        Resources resources = activity.getResources();
        if (hk0.p.k(this.f31906b)) {
            return;
        }
        c22.f fVar = c22.f.f23050a;
        Activity activity2 = this.f31905a;
        if (activity2 != null) {
            c22.f.d(fVar, activity2, resources.getString(R.string.connect_iq_device_has_disconnected_title), resources.getString(R.string.connect_iq_device_has_disconnected_msg), new o13.p(resources.getString(R.string.lbl_ok), new m1(this, 14)), null, null, false, 48).show();
        } else {
            p005kotlin.jvm.internal.s.m("mActivity");
            throw null;
        }
    }
}
