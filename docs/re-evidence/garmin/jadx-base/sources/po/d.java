package po;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements com.garmin.android.library.mapsdkadapter.i.f, com.garmin.android.library.mapsdkadapter.i.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f138828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe2.h f138829b;

    public /* synthetic */ d(h hVar, qe2.h hVar2) {
        this.f138828a = hVar;
        this.f138829b = hVar2;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.f
    public void i(com.garmin.android.library.mapsdkadapter.e eVar) {
        int i14 = h.E1;
        ie2.c cameraState = this.f138829b.f144584a.getCameraState();
        if (cameraState != null) {
            this.f138828a.M0.a((float) cameraState.f93112b);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.k
    public void onMapLoaded() {
        h hVar = this.f138828a;
        ie2.c cVar = hVar.f138872x1;
        qe2.h hVar2 = this.f138829b;
        if (cVar != null) {
            hVar2.getClass();
            hVar2.f144584a.o(cVar);
        }
        hVar2.B(hVar);
        hVar2.O(hVar);
        hVar2.E(hVar);
    }
}
