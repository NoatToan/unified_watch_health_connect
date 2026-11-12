package ly0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements com.garmin.android.library.mapsdkadapter.i.h, com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe2.h f115314a;

    @Override // com.garmin.android.library.mapsdkadapter.i.h
    public void I1(com.garmin.android.library.mapsdkadapter.f fVar) {
        qe2.h hVar = this.f115314a;
        hVar.V(fVar, hVar.f144584a.getF50270z() + 1, 500);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i
    public boolean v2(me2.f fVar) {
        fVar.getClass();
        com.garmin.android.library.mapsdkadapter.f position = fVar.getPosition();
        qe2.h hVar = this.f115314a;
        com.garmin.android.library.mapsdkadapter.i.a.b(hVar, position, hVar.f144584a.getF50270z() + 1, 4);
        return true;
    }
}
