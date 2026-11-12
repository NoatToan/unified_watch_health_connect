package com.garmin.android.apps.connectmobile;

import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/x2;", "", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f49759a;

    public x2(Intent intent) {
        intent.getClass();
        this.f49759a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2) && this.f49759a.equals(((x2) obj).f49759a);
    }

    public final int hashCode() {
        return this.f49759a.hashCode();
    }

    public final String toString() {
        return "ShowDeviceSetupDialog(intent=" + this.f49759a + ")";
    }
}
