package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.health.ITrackDataReport;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.open.TrackDataRemoteProxy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jck implements ITrackDataReport {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38378c = izn.e(BaseApplication.getContext());
    TrackDataRemoteProxy.d d = null;
    private int f = 0;
    private int h = 0;
    private int g = 0;
    private int j = 0;
    private int e = 0;
    private float l = 0.0f;
    private int i = 0;
    private int s = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38380b = 0;
    private int m = 0;
    private int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f38379a = 0.0d;
    private int k = 0;
    private int o = 0;

    @Override // com.huawei.health.ITrackDataReport
    public void report(Bundle bundle) throws RemoteException {
        TrackDataRemoteProxy.d dVar = this.d;
        if (dVar != null) {
            dVar.report(b());
        } else {
            LogUtil.a("Track_LogicalTrackData", "mLocalReportProxy is null");
        }
    }

    public Bundle b() {
        if (this.k == 264) {
            this.f = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(GeocodeSearch.GPS, this.f);
        bundle.putInt("distance", this.h);
        bundle.putInt("duration", this.g);
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, this.j);
        bundle.putInt("calorie", this.e);
        bundle.putFloat("speed", this.l);
        bundle.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, this.o);
        int i = this.o;
        if (i == 0) {
            bundle.putInt("timeTarget", this.s);
        } else if (i == 1) {
            bundle.putInt("distanceTarget", this.i);
        } else if (i == 2) {
            bundle.putInt("calorieTarget", this.f38380b);
        }
        bundle.putInt("pace", this.m);
        bundle.putDouble("altitude", this.f38379a);
        bundle.putInt("sportState", this.n);
        bundle.putInt(BleConstants.SPORT_TYPE, this.k);
        if (UnitUtil.f()) {
            bundle.putString("disUnit", BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi));
            return bundle;
        }
        bundle.putString("disUnit", BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km));
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return (IBinder) this;
    }

    public void e(TrackDataRemoteProxy.d dVar) {
        this.d = dVar;
    }

    public void a() {
        iwy iwyVarA = iwy.a(BaseApplication.getContext());
        this.f = iwyVarA.ad();
        this.h = 0;
        this.g = 0;
        this.j = 0;
        this.e = 0;
        this.l = 0.0f;
        Bundle bundleAh = iwyVarA.ah();
        if (bundleAh == null) {
            LogUtil.j("Track_LogicalTrackData", "init(), sportDataBundle == null");
            return;
        }
        int i = bundleAh.getInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -1);
        this.o = i;
        if (i == 0) {
            this.s = bundleAh.getInt(WorkoutRecord.Extend.COURSE_TARGET_VALUE);
        } else if (i == 1) {
            this.i = bundleAh.getInt(WorkoutRecord.Extend.COURSE_TARGET_VALUE) * 1000;
        } else if (i == 2) {
            this.f38380b = bundleAh.getInt(WorkoutRecord.Extend.COURSE_TARGET_VALUE);
        }
        this.m = 0;
        this.f38379a = 0.0d;
        this.n = bundleAh.getInt("sportState");
        this.k = bundleAh.getInt(BleConstants.SPORT_TYPE);
    }

    public void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        e(bundle.getLong("duration_digital"));
        j(bundle.getString("distance"));
        d(bundle.getString("speed"));
        b(bundle.getString(IndoorEquipManagerApi.KEY_HEART_RATE));
        e(bundle.getString("pace"));
        c(bundle.getString("calorie"));
        a("0");
        this.k = bundle.getInt(BleConstants.SPORT_TYPE);
    }

    private void j(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.h = Math.round(Float.parseFloat(str) * 1000.0f);
            } else {
                this.h = 0;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    private void e(long j) {
        if (j > 0) {
            this.g = Math.round(j / 1000.0f);
        } else {
            this.g = 0;
        }
    }

    private void b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.j = Integer.parseInt(str);
            } else {
                this.j = 0;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    private void c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.e = Math.round(Float.parseFloat(str) * 1000.0f);
            } else {
                this.e = 0;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    private void d(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !f38378c.equals(str)) {
                this.l = (Float.parseFloat(str) * 1000.0f) / 3600.0f;
            } else {
                this.l = 0.0f;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    private void e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !f38378c.equals(str)) {
                this.m = Integer.parseInt(str);
            } else {
                this.m = 0;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    private void a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f38379a = Double.parseDouble(str);
            } else {
                this.f38379a = 0.0d;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LogicalTrackData", "numberFormatException numberFormatException = ", e.getMessage());
        }
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.n = i;
        try {
            report(b());
        } catch (RemoteException e) {
            LogUtil.e("Track_LogicalTrackData", "ProcessFused()", e.getMessage());
        }
    }

    public int d() {
        return this.n;
    }
}
