package defpackage;

import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public class izp implements IOriginalGpsStatusListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38258b;
    private Location e;
    private long g;
    private int j;
    private long l;
    private long m;
    private final Object i = new Object();
    private long h = 0;
    private long n = 0;
    private long q = 0;
    private long f = 0;
    private long s = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38259c = 0;
    private int o = 1;
    private long k = 0;
    private int[] d = new int[21];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f38257a = new int[11];

    public izp() {
        this.f38258b = 0L;
        this.f38258b = System.currentTimeMillis();
    }

    public long[] c() {
        long[] jArr = {this.f38259c, this.h, this.n, this.q, this.f, this.s};
        LogUtil.a("Track_GPSPointBIUtil", Arrays.toString(jArr));
        return jArr;
    }

    @Override // com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener
    public void updateGpsStatus(GpsStatus gpsStatus) {
        if (gpsStatus == null) {
            int i = this.o;
            if (i != 1) {
                e(i, 1);
                return;
            }
            return;
        }
        int iB = b(gpsStatus);
        int i2 = this.o;
        if (iB != i2) {
            e(i2, iB);
        }
    }

    @Override // com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener
    public void updateGnssStatus(GnssStatus gnssStatus) {
        if (gnssStatus == null) {
            int i = this.o;
            if (i != 1) {
                e(i, 1);
                return;
            }
            return;
        }
        int iD = d(gnssStatus);
        int i2 = this.o;
        if (iD != i2) {
            e(i2, iD);
        }
    }

    @Override // com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener
    public void updateGpsStatus(int i) {
        int i2 = this.o;
        if (i2 != i) {
            e(i2, i);
        }
    }

    private void e(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 0) {
            this.f38259c += (jCurrentTimeMillis - this.f38258b) - this.k;
        } else if (i == 1) {
            this.h += (jCurrentTimeMillis - this.f38258b) - this.k;
        } else if (i == 3) {
            this.n += (jCurrentTimeMillis - this.f38258b) - this.k;
        } else if (i == 4) {
            this.q += (jCurrentTimeMillis - this.f38258b) - this.k;
        } else if (i == 5) {
            this.f += (jCurrentTimeMillis - this.f38258b) - this.k;
        } else if (i == 6) {
            this.s += (jCurrentTimeMillis - this.f38258b) - this.k;
        }
        this.k = 0L;
        this.f38258b = jCurrentTimeMillis;
        this.o = i2;
    }

    private int d(GnssStatus gnssStatus) {
        int satelliteCount = gnssStatus.getSatelliteCount();
        if (satelliteCount < 4) {
            return 3;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < satelliteCount; i4++) {
            try {
                if (gnssStatus.usedInFix(i4)) {
                    if (gnssStatus.getCn0DbHz(i4) >= 35.0f) {
                        i2++;
                    } else {
                        if (gnssStatus.getCn0DbHz(i4) < 30.0f) {
                            if (gnssStatus.getCn0DbHz(i4) <= 0.0f) {
                                LogUtil.a("Track_GPSPointBIUtil", "useless satellite singal");
                            }
                        }
                        i3++;
                    }
                    i++;
                    i3++;
                }
            } catch (NoSuchElementException e) {
                LogUtil.j("Track_GPSPointBIUtil", e.getMessage());
            }
        }
        if (i2 >= 4) {
            return 6;
        }
        if (i >= 4) {
            return 5;
        }
        return i3 > 0 ? 4 : 3;
    }

    private int b(GpsStatus gpsStatus) {
        int i;
        int i2;
        if (gpsStatus.getMaxSatellites() < 4) {
            return 3;
        }
        int i3 = 0;
        try {
            if (gpsStatus.getSatellites() != null) {
                int i4 = 0;
                i = 0;
                i2 = 0;
                for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
                    try {
                        if (gpsSatellite != null && gpsSatellite.usedInFix()) {
                            if (gpsSatellite.getSnr() >= 35.0f) {
                                i4++;
                            } else if (gpsSatellite.getSnr() < 30.0f) {
                                if (gpsSatellite.getSnr() > 0.0f) {
                                    i++;
                                } else {
                                    LogUtil.a("Track_GPSPointBIUtil", "useless satellite singal");
                                }
                            }
                            i2++;
                            i++;
                        }
                    } catch (NoSuchElementException e) {
                        e = e;
                        i3 = i4;
                        LogUtil.j("Track_GPSPointBIUtil", e.getMessage());
                    }
                }
                i3 = i4;
            } else {
                i = 0;
                i2 = 0;
            }
        } catch (NoSuchElementException e2) {
            e = e2;
            i = 0;
            i2 = 0;
        }
        if (i3 >= 4) {
            return 6;
        }
        if (i2 >= 4) {
            return 5;
        }
        return i > 0 ? 4 : 3;
    }

    public void d() {
        synchronized (this.i) {
            this.m = System.currentTimeMillis();
        }
    }

    public void b() {
        synchronized (this.i) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.m;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            this.l += jCurrentTimeMillis;
            this.k += jCurrentTimeMillis;
        }
    }

    public void b(Location location) {
        synchronized (this.i) {
            if (location != null) {
                if (!"network".equals(location.getProvider())) {
                    int accuracy = (int) (location.getAccuracy() / 5.0f);
                    int i = 0;
                    if (accuracy > 20) {
                        accuracy = 20;
                    } else if (accuracy < 0) {
                        accuracy = 0;
                    }
                    int[] iArr = this.d;
                    iArr[accuracy] = iArr[accuracy] + 1;
                    if (this.e != null) {
                        long time = (location.getTime() - this.e.getTime()) - this.l;
                        if (time >= 20000) {
                            this.j++;
                            this.g += time;
                        }
                        int i2 = (int) (time / 1000);
                        if (i2 > 10) {
                            i = 10;
                        } else if (i2 >= 0) {
                            i = i2;
                        }
                        int[] iArr2 = this.f38257a;
                        iArr2[i] = iArr2[i] + 1;
                        this.l = 0L;
                    }
                    this.e = location;
                }
            }
        }
    }

    public void e(Context context) {
        if (context == null) {
            LogUtil.a("Track_GPSPointBIUtil", "updateBi ", "context is null");
        }
        HashMap map = new HashMap(5);
        map.put("gpsAccArray", Arrays.toString(this.d));
        map.put("gpsTimeArray", Arrays.toString(this.f38257a));
        map.put("gpsLostCount", Integer.valueOf(this.j));
        map.put("gpsLostTotalTime", Long.valueOf(this.g));
        long[] jArrC = c();
        map.put("gpsStateStat", Arrays.toString(jArrC));
        lmf.d().c(context, AnalyticsValue.MOTION_TRACK_1040015.value(), map, 0);
        String string = Arrays.toString(this.d);
        String string2 = Arrays.toString(this.f38257a);
        int i = this.j;
        long j = this.g;
        LogUtil.a("Track_GPSPointBIUtil", string, " ", string2, " ", Integer.valueOf(i), " ", Long.valueOf(j), " ", Arrays.toString(jArrC));
    }
}
