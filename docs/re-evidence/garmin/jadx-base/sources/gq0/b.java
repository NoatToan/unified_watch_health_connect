package gq0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.library.backgroundtaskmanagement.d;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.HashSet;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgq0/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "mCapability", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Lcom/garmin/android/gfdi/configuration/SupportedCapability;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SupportedCapability f78505i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, SupportedCapability supportedCapability) {
        super(bVar);
        bVar.getClass();
        supportedCapability.getClass();
        this.f78505i = supportedCapability;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        ArrayList<DeviceProfile> arrayListW = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).w();
        HashSet hashSet = new HashSet(arrayListW.size());
        for (DeviceProfile deviceProfile : arrayListW) {
            if (l2.q(this.f78505i, deviceProfile.getConfigurationFlags())) {
                hashSet.add(deviceProfile);
            }
        }
        d(new ArrayList(hashSet));
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }

    public void d(ArrayList arrayList) {
    }
}
