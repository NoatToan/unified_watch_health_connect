package cg1;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import java.util.Iterator;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27119a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27122d;

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.segments.presentation.a aVar, int i14, long j8) {
        this.f27122d = aVar;
        this.f27121c = i14;
        this.f27120b = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14 = true;
        switch (this.f27119a) {
            case 0:
                com.garmin.android.apps.connectmobile.segments.presentation.a aVar = (com.garmin.android.apps.connectmobile.segments.presentation.a) this.f27122d;
                int i14 = this.f27121c;
                long j8 = this.f27120b;
                g3 g3Var = (g3) obj;
                int i15 = com.garmin.android.apps.connectmobile.segments.presentation.a.f41418g;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                String str = g3Var.f35302c;
                int i16 = com.garmin.android.apps.connectmobile.segments.presentation.a.b.f41421a[pVar.ordinal()];
                if (i16 == 1) {
                    aVar.showProgressOverlay();
                } else if (i16 == 2) {
                    aVar.hideProgressOverlay();
                    i2.a.c(i2.f36769a, "AbstractGCMSegmentsSenderActivity", "putSegmentsInDownloadQueue: segment(s) added to GC's download queue");
                    if (!aVar.isFinishing()) {
                        q0.b bVar = q0.f149800b;
                        View viewFindViewById = aVar.findViewById(R.id.content_frame);
                        viewFindViewById.getClass();
                        bVar.getClass();
                        q0.b.a(viewFindViewById, i14, 1).show();
                    }
                    rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
                    if (mVar.a(j8)) {
                        mVar.B(j8, "AbstractGCMSegmentsSenderActivity");
                    }
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    aVar.hideProgressOverlay();
                    i2.a.c(i2.f36769a, "AbstractGCMSegmentsSenderActivity", "putSegmentsInDownloadQueue: " + str);
                    if (!aVar.isFinishing()) {
                        q0.b bVar2 = q0.f149800b;
                        View viewFindViewById2 = aVar.findViewById(R.id.content_frame);
                        viewFindViewById2.getClass();
                        bVar2.getClass();
                        q0.b.a(viewFindViewById2, R.string.txt_something_went_wrong_try_again, 1).show();
                    }
                }
                return Unit.INSTANCE;
            default:
                dt2.d dVar = (dt2.d) this.f27122d;
                long j14 = this.f27120b;
                int i17 = this.f27121c;
                o13.q qVar = (o13.q) obj;
                synchronized (dVar.f61155j) {
                }
                Object obj2 = qVar.f128597a;
                Throwable thB = o13.q.b(obj2);
                if (thB == null) {
                    GDISmartProto.Smart smart = (GDISmartProto.Smart) obj2;
                    dt2.f fVar = new dt2.f(dVar, i17);
                    Logger logger = dVar.f61153h;
                    ct2.c.f55534a.getClass();
                    String strA = ct2.c.a(5043);
                    String strG = dVar.g(smart);
                    StringBuilder sbK = androidx.core.view.j.k(i17, "Incoming ", strA, " [", "] complete: ");
                    sbK.append(strG);
                    logger.debug(sbK.toString());
                    rs2.g gVar = dVar.f61149d;
                    if (gVar != null) {
                        gVar.onProtobufRequest(i17, smart);
                    }
                    Iterator<dt2.h> it = dVar.f61154i.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        try {
                            if (it.next().onProtobufRequest(smart, fVar)) {
                            }
                        } catch (Exception e4) {
                            logger.error("Failed to notify listener", (Throwable) e4);
                        }
                    }
                    z14 = false;
                } else {
                    Logger logger2 = dVar.f61153h;
                    ct2.c.f55534a.getClass();
                    logger2.error(c22.t.e(i17, "Incoming ", ct2.c.a(5043), " [", "] failed"), thB);
                }
                return Boolean.valueOf(z14);
        }
    }

    public /* synthetic */ a(dt2.d dVar, long j8, int i14) {
        this.f27122d = dVar;
        this.f27120b = j8;
        this.f27121c = i14;
    }
}
