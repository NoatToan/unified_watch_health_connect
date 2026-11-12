package vg1;

import am.a2;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvg1/i;", "Lvg1/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements a0<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f178111a;

    static {
        new a(null);
    }

    @Override // vg1.a0
    public final void b(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("GCM_deviceActivityOptions", com.garmin.android.apps.connectmobile.devices.model.f.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("GCM_deviceActivityOptions");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.devices.model.f)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.devices.model.f) parcelable2;
            }
            this.f178111a = (com.garmin.android.apps.connectmobile.devices.model.f) parcelable;
        }
    }

    @Override // vg1.a0
    public final void c(dc0.a aVar) {
        if (aVar != null) {
            this.f178111a = null;
        }
    }

    @Override // vg1.a0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.garmin.android.apps.connectmobile.devices.model.f getF178111a() {
        return this.f178111a;
    }

    @Override // vg1.a0
    public final boolean e() {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f178111a;
        if (fVar != null) {
            if (!TextUtils.isEmpty(fVar != null ? fVar.h() : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // vg1.a0
    public final void f(r0 r0Var) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f178111a;
        if (fVar != null) {
            r0Var.f178151a = fVar.h();
        }
    }

    @Override // vg1.a0
    public final int g() {
        return 8;
    }

    @Override // vg1.a0
    public final void h(Bundle bundle) {
        a2.b(bundle, "GCM_deviceActivityOptions", this.f178111a);
    }

    @Override // vg1.a0
    public final boolean hasModel() {
        return this.f178111a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.a0
    public final void i(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) deviceSettingsDTO;
        if (fVar != null) {
            this.f178111a = fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg1/i$a;", "", "<init>", "()V", "", "EXTRA_KEY", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
