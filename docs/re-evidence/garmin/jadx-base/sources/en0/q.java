package en0;

import com.garmin.proto.generated.GDIHandCalibration;
import q03.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements u, q03.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.handalignment.f f64716b;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.handalignment.f fVar, int i14) {
        this.f64715a = i14;
        this.f64716b = fVar;
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) {
        int i14 = this.f64715a;
        com.garmin.android.apps.connectmobile.handalignment.f fVar = this.f64716b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                com.garmin.android.apps.connectmobile.handalignment.b bVar = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
                long j8 = fVar.f36615a;
                GDIHandCalibration.CommandRequest.Command command = GDIHandCalibration.CommandRequest.Command.START;
                com.garmin.android.apps.connectmobile.handalignment.f.g gVar = new com.garmin.android.apps.connectmobile.handalignment.f.g(c1312a, fVar);
                bVar.getClass();
                com.garmin.android.apps.connectmobile.handalignment.b.b(j8, command, gVar);
                break;
            default:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar2 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                com.garmin.android.apps.connectmobile.handalignment.b bVar2 = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
                long j14 = fVar.f36615a;
                GDIHandCalibration.CommandRequest.Command command2 = GDIHandCalibration.CommandRequest.Command.IMAGE_START;
                com.garmin.android.apps.connectmobile.handalignment.f.C0650f c0650f = new com.garmin.android.apps.connectmobile.handalignment.f.C0650f(c1312a, fVar);
                bVar2.getClass();
                com.garmin.android.apps.connectmobile.handalignment.b.b(j14, command2, c0650f);
                break;
        }
    }

    @Override // q03.e
    public void f(z03.c.a aVar) {
        int i14 = this.f64715a;
        com.garmin.android.apps.connectmobile.handalignment.f fVar = this.f64716b;
        switch (i14) {
            case 1:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar2 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                com.garmin.android.apps.connectmobile.handalignment.b bVar = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
                long j8 = fVar.f36615a;
                GDIHandCalibration.CommandRequest.Command command = GDIHandCalibration.CommandRequest.Command.ABORT;
                com.garmin.android.apps.connectmobile.handalignment.f.c cVar = new com.garmin.android.apps.connectmobile.handalignment.f.c(aVar, fVar);
                bVar.getClass();
                com.garmin.android.apps.connectmobile.handalignment.b.b(j8, command, cVar);
                break;
            default:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar3 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                com.garmin.android.apps.connectmobile.handalignment.b bVar2 = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
                long j14 = fVar.f36615a;
                GDIHandCalibration.CommandRequest.Command command2 = GDIHandCalibration.CommandRequest.Command.SAVE;
                com.garmin.android.apps.connectmobile.handalignment.f.e eVar = new com.garmin.android.apps.connectmobile.handalignment.f.e(aVar, fVar);
                bVar2.getClass();
                com.garmin.android.apps.connectmobile.handalignment.b.b(j14, command2, eVar);
                break;
        }
    }
}
