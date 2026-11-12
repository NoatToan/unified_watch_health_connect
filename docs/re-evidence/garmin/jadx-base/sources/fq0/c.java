package fq0;

import android.app.ActivityManager;
import c22.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;
import cq0.j;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq0/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f73215i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar);
        this.f73215i = bVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        boolean z14;
        String name = EdgeIncidentDetectionService.class.getName();
        Object systemService = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c().getSystemService("activity");
        systemService.getClass();
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = false;
                break;
            } else if (name.equals(it.next().service.getClassName())) {
                z14 = true;
                break;
            }
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SendCurrentIncidentStateToDeviceOperation", name + " is running " + z14);
        if (!z14) {
            GDIIncidentDetectionProto.IncidentStatusNotification.Status status = GDIIncidentDetectionProto.IncidentStatusNotification.Status.FINISHED;
            int i14 = b.f73213m;
            b bVar = this.f73215i;
            bVar.getClass();
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setIncidentStatusNotification(GDIIncidentDetectionProto.IncidentStatusNotification.newBuilder().setStatus(status)).build()).build();
            j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            smartBuild.getClass();
            jVar.c(smartBuild, bVar.f73214l);
        }
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }
}
