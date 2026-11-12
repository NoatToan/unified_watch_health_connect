package com.garmin.android.apps.connectmobile.settings.devices.vivoactive4;

import android.os.Build;
import android.os.Bundle;
import ch1.a3;
import com.garmin.android.apps.connectmobile.R;
import java.util.Observable;
import lc.u0;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/NotificationPrivacyActivity;", "Lvg1/f0;", "<init>", "()V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationPrivacyActivity extends f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f43178i = b.DURING_ACTIVITY;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/NotificationPrivacyActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        DURING_ACTIVITY,
        NOT_DURING_ACTIVITY
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43182a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DURING_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.NOT_DURING_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43182a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // vg1.f0
    public final void da() {
        ca(new a3(this, this.f43178i), 0);
    }

    @Override // vg1.f0
    public final int ea() {
        return 2;
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        int i14 = c.f43182a[this.f43178i.ordinal()];
        if (i14 == 1) {
            String string = getString(R.string.device_settings_during_activity);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        String string2 = getString(R.string.device_settings_not_during_activity);
        string2.getClass();
        return string2;
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("EXTRA_VISIBILITY", b.class);
            } else {
                Object serializable2 = extras.getSerializable("EXTRA_VISIBILITY");
                if (!(serializable2 instanceof b)) {
                    serializable2 = null;
                }
                serializable = (b) serializable2;
            }
            b bVar = (b) serializable;
            if (bVar == null) {
                bVar = b.DURING_ACTIVITY;
            }
            this.f43178i = bVar;
        }
        super.onCreate(bundle);
    }

    @Override // vg1.f0, java.util.Observer
    @e
    public final void update(Observable observable, Object obj) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/NotificationPrivacyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_VISIBILITY", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
