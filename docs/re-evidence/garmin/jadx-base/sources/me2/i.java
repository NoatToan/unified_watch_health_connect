package me2;

import android.graphics.Bitmap;
import com.google.android.gms.maps.GoogleMap;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.threading.AnimationThreadController;
import mt0.s1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements GoogleMap.SnapshotReadyCallback, SnapshotResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.o f118176a;

    public /* synthetic */ i(com.garmin.android.library.mapsdkadapter.i.o oVar) {
        this.f118176a = oVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
    public void onSnapshotReady(Bitmap bitmap) {
        int i14 = l.Z;
        this.f118176a.onSnapshotReady(bitmap);
    }

    @Override // com.mapbox.maps.SnapshotResultCallback
    public void onSnapshotResult(Bitmap bitmap, String str) {
        int i14 = ne2.s.M0;
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new s1(12, this.f118176a, bitmap));
    }
}
