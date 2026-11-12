package w0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f180994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f180995b;

    public e(Context context) {
        String string;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f180995b = new c(context);
        }
        f fVar = null;
        try {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 132).services;
            if (serviceInfoArr != null) {
                String str = null;
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    Bundle bundle = serviceInfo.metaData;
                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                        if (str != null) {
                            h.z("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                            throw null;
                        }
                        str = string;
                    }
                }
                if (str != null) {
                    try {
                        fVar = (f) Class.forName(str).getConstructor(Context.class).newInstance(context);
                    } catch (Exception e4) {
                        com.airbnb.lottie.animation.keyframe.a.x("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e4);
                        throw null;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f180994a = fVar;
    }
}
