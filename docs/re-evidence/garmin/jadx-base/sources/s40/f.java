package s40;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f157054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointOfInterestDTO f157055c;

    public /* synthetic */ f(g gVar, PointOfInterestDTO pointOfInterestDTO, int i14) {
        this.f157053a = i14;
        this.f157054b = gVar;
        this.f157055c = pointOfInterestDTO;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157053a;
        PointOfInterestDTO pointOfInterestDTO = this.f157055c;
        g gVar = this.f157054b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g.a aVar = g.f157056i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1135835802, new f(gVar, pointOfInterestDTO, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g.a aVar2 = g.f157056i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String name = pointOfInterestDTO.getName();
                    if (name == null) {
                        com.garmin.android.apps.connectmobile.courses.model.h hVar = pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                        name = hVar != null ? dh.b.B(gVar, hVar.f32967c) : null;
                        if (name == null) {
                            name = "";
                        }
                    }
                    com.garmin.android.apps.connectmobile.courses.model.h hVar2 = pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                    boolean zR = mVar2.r(gVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new d(gVar, 1);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new d(gVar, 1);
                            mVar2.K(objQ);
                        }
                    }
                    j.a(name, hVar2, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
