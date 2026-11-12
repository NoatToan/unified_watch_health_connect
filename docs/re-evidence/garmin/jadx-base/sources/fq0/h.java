package fq0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import fq0.g.b;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq0/h;", "Lgq0/b;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends gq0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f73233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, SupportedCapability supportedCapability) {
        super(gVar, supportedCapability);
        this.f73233j = gVar;
    }

    @Override // gq0.b
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long f172494b = ((DeviceProfile) it.next()).getF172494b();
            g gVar = this.f73233j;
            gVar.b(gVar.new b(f172494b));
        }
    }
}
