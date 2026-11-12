package com.huami.moving.maps;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.devicekit.SportDeviceKit;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.observer.IServiceDataObserver;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;
import com.huami.mifit.sportlib.services.GPSServiceConn;
import com.huami.mifit.sportlib.services.IGPSServiceConn;
import com.huami.moving.device.SportDeviceProxy;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.tools.log.HMLog;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSportController implements IMapLoadedCallback {
    private GPSServiceConn a;
    private IGPSSolution b;
    private int c;
    private int d;
    private int e;
    private Context f;
    private boolean g;
    private boolean h;

    public GPSSportController(Context context) {
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.g = false;
        this.h = false;
        this.f = context.getApplicationContext();
        this.c = SportUIKeeper.getSelectSportType(context);
        this.a = new GPSServiceConn(context, this.c);
        SportDeviceKit.getInstance().setDeviceClient(SportDeviceProxy.getInstance());
        this.g = false;
    }

    private void a(int i) {
        if (MapMode.isValidMode(i)) {
            IGPSSolution iGPSSolution = this.b;
            if (iGPSSolution != null) {
                iGPSSolution.setMapViewMode(i);
                return;
            }
            return;
        }
        HMLog.i("IllegalArgumentException", "GPSSportController setMapViewMode", new Object[0]);
        throw new IllegalArgumentException("Dont support type =" + i);
    }

    private void b(boolean z) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setRouteTrackVisibility(z);
        }
    }

    public void addLineMarker(List list, List list2, List list3, List list4) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.addLineMarkerPoint(list, list2, list3, list4);
        }
    }

    @Override // com.huami.moving.maps.IMapLoadedCallback
    public void afterMapLoaded() {
        a(this.d);
        b(true);
        Location lastLocationLatLng = SportUIKeeper.getLastLocationLatLng(this.f);
        if (lastLocationLatLng != null) {
            locationChanged(new GPSPoint(lastLocationLatLng));
        }
        this.g = true;
        if (this.h) {
            setDarkBackgroundColor(Color.argb(200, 0, 0, 0));
            setAllGesturesEnabled(false);
        }
    }

    public void changeSportType(int i) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.changeSportType(i);
        }
    }

    public void clearMap() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.clearMap();
        }
    }

    public void connect() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.connect();
        }
    }

    public void destroy(Context context) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.destroy();
        }
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.destroy(context);
            this.a = null;
        }
    }

    public void destroyMap() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.destroyMap();
        }
    }

    public IGPSServiceConn.ServiceState executeSportCmd(int i, int i2) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn == null) {
            return IGPSServiceConn.ServiceState.DEFAULT;
        }
        this.e = i2;
        return gPSServiceConn.executeSportCmd(i, i2);
    }

    public void follow() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.follow();
        }
    }

    public int getEmitter() {
        return this.e;
    }

    public String getGPSProvider() {
        GPSServiceConn gPSServiceConn = this.a;
        return gPSServiceConn != null ? gPSServiceConn.getGPSProvider() : "";
    }

    public int getGPSSignalLevel() {
        GPSServiceConn gPSServiceConn = this.a;
        return gPSServiceConn != null ? gPSServiceConn.getGPSSignalLevel() : GPSSignal.SignalLevel.DEFAULT.getValue();
    }

    public int getSportState() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            return gPSServiceConn.getSportState();
        }
        return -1;
    }

    public long getTickerTimeInMillisecond() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            return gPSServiceConn.getTickerTimeInMillisecond();
        }
        return -1L;
    }

    public long getTrackId() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            return gPSServiceConn.getTrackId();
        }
        return -1L;
    }

    public int getUserOpState() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            return gPSServiceConn.getUserOpState();
        }
        return -1;
    }

    public void initGPSSolution(Context context, FragmentManager fragmentManager, View view, Bundle bundle, int i, boolean z) {
        if (fragmentManager == null || view == null || !DataTypeSource.isNeedGpsListener(this.c)) {
            return;
        }
        this.d = i;
        this.b = GPSSolutionFactory.a(context, fragmentManager, view, bundle, z, this);
    }

    public void initLocation(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GPSSportController initLocation", new Object[0]);
            throw new IllegalArgumentException();
        }
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setEndPoint(gPSPoint);
            this.b.setCenter(gPSPoint);
        }
    }

    public boolean isMapLoaded() {
        return this.g;
    }

    public void locate() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.locate();
        }
    }

    public void locationChanged(GPSPoint gPSPoint) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setILocationChanged(gPSPoint);
            this.b.setLocation(gPSPoint);
        }
    }

    public void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.isEmpty()) {
            HMLog.i("IllegalArgumentException", "GPSSportController onGPSLineInfoChanged", new Object[0]);
            throw new IllegalArgumentException();
        }
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.drawGPSLine(list, routeLineInfo);
        }
    }

    public void onRouteGPSLineInfoChanged(List<GPSPoint> list, int i, boolean z, RouteLineInfo routeLineInfo) {
        if (list == null || list.isEmpty()) {
            HMLog.i("IllegalArgumentException", "GPSSportController onRouteGPSLineInfoChanged", new Object[0]);
            throw new IllegalArgumentException();
        }
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.drawRouteGPSLine(list, i, z, routeLineInfo);
        }
    }

    public void onTestLocationChanged(GPSPoint gPSPoint) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setTestLocation(gPSPoint);
        }
    }

    public void pauseMap() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.pauseMap();
        }
    }

    public void recoverRun(long j) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.recoverRun(j);
        }
    }

    public void registerDataObserver(IServiceDataObserver iServiceDataObserver) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.registerDataObserver(iServiceDataObserver);
        }
    }

    public void registerSportObserver(IServiceSportObserver iServiceSportObserver) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.registerSportObserver(iServiceSportObserver);
        }
    }

    public void removeAllLineMarker() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.removeAllLineMarkerPoint();
        }
    }

    public void restoreGpsLine() {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.restoreGpsLine();
        }
    }

    public void resumeMap() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.resumeMap();
        }
    }

    public void saveInstanceStateMap(Bundle bundle) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.saveInstanceStateMap(bundle);
        }
    }

    public void setAllGesturesEnabled(boolean z) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setAllGesturesEnabled(z);
        }
    }

    public void setCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GPSSportController setCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setCenter(gPSPoint);
        }
    }

    public void setDarkBackgroundColor(int i) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setDarkBackgroundColor(i);
        }
    }

    public void setRouteCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GPSSportController setCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.setRouteCenter(gPSPoint);
        }
    }

    public void setServiceStateListener(IGPSServiceConn.IServiceStateListener iServiceStateListener) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.setServiceStateListener(iServiceStateListener);
        }
    }

    public void startFollow() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.startFollow();
        }
    }

    public void stopFollow() {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.stopFollow();
        }
    }

    public void unregisterDataObserver(IServiceDataObserver iServiceDataObserver) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.unregisterDataObserver(iServiceDataObserver);
        }
    }

    public void unregisterSportObserver(IServiceSportObserver iServiceSportObserver) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.unregisterSportObserver(iServiceSportObserver);
        }
    }

    public void verifyDistance(int i) {
        GPSServiceConn gPSServiceConn = this.a;
        if (gPSServiceConn != null) {
            gPSServiceConn.verifyDistance(i);
        }
    }

    public void zoomToShowEntireTrack(List<GPSPoint> list) {
        IGPSSolution iGPSSolution = this.b;
        if (iGPSSolution != null) {
            iGPSSolution.zoomToShowEntireTrack(list);
        }
    }

    public void initGPSSolution(Context context, FragmentManager fragmentManager, View view, Bundle bundle, int i, boolean z, boolean z2) {
        if (fragmentManager == null || view == null || !DataTypeSource.isNeedGpsListener(this.c)) {
            return;
        }
        this.h = z2;
        this.d = i;
        this.b = GPSSolutionFactory.a(context, fragmentManager, view, bundle, z, this);
    }

    public GPSSportController(Context context, int i) {
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.g = false;
        this.h = false;
        this.f = context.getApplicationContext();
        this.c = i;
        this.a = new GPSServiceConn(context, this.c);
        SportDeviceKit.getInstance().setDeviceClient(SportDeviceProxy.getInstance());
    }
}
