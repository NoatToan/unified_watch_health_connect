package com.huawei.hms.maps.internal;

import android.location.Location;
import android.os.RemoteException;
import com.huawei.hms.maps.LocationSource;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes34.dex */
public class maa extends ILocationSourceDelegate.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LocationSource f14178a;

    /* JADX INFO: renamed from: com.huawei.hms.maps.internal.maa$maa, reason: collision with other inner class name */
    public static class C0149maa implements LocationSource.OnLocationChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IOnLocationChangeListener f14179a;

        @Override // com.huawei.hms.maps.LocationSource.OnLocationChangedListener
        public void onLocationChanged(Location location) {
            try {
                this.f14179a.onLocationChange(location);
            } catch (RemoteException unused) {
                LogM.e("LocationSourceDelegate", "onLocationChanged RemoteException ");
            }
        }

        public C0149maa(IOnLocationChangeListener iOnLocationChangeListener) {
            this.f14179a = iOnLocationChangeListener;
        }
    }

    @Override // com.huawei.hms.maps.internal.ILocationSourceDelegate
    public void deactivate() {
        LogM.d("LocationSourceDelegate", "deactivate");
        this.f14178a.deactivate();
    }

    @Override // com.huawei.hms.maps.internal.ILocationSourceDelegate
    public void activate(IOnLocationChangeListener iOnLocationChangeListener) {
        LogM.d("LocationSourceDelegate", "active");
        this.f14178a.activate(new C0149maa(iOnLocationChangeListener));
    }

    public maa(LocationSource locationSource) {
        this.f14178a = locationSource;
    }
}
