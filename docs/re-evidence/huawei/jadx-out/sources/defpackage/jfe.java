package defpackage;

import android.util.Pair;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
public class jfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38527a;
    private b d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<LatLong> f38529c = null;
    private double e = 0.0d;
    private double i = 1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38528b = 0;

    public jfe() {
        this.f38527a = new b();
        this.d = new b();
    }

    public void d() {
        LogUtil.a("Track_MotionTrackProcess", "Go into handle");
        ArrayList<LatLong> arrayList = this.f38529c;
        if (arrayList == null) {
            LogUtil.j("Track_MotionTrackProcess", "GPS Data is null");
            this.f38529c = new ArrayList<>(16);
            return;
        }
        ArrayList<LatLong> arrayListA = a(arrayList);
        this.f38529c = arrayListA;
        ArrayList<LatLong> arrayListD = d(arrayListA);
        this.f38529c = arrayListD;
        ArrayList<LatLong> arrayListC = c(arrayListD);
        this.f38529c = arrayListC;
        this.f38529c = b(arrayListC);
        LogUtil.a("Track_MotionTrackProcess", "Go out handle");
    }

    public ArrayList<LatLong> c() {
        return this.f38529c;
    }

    public double e() {
        return this.e;
    }

    public jfe e(ArrayList<LatLong> arrayList) {
        this.f38529c = arrayList;
        return this;
    }

    public jfe d(double d) {
        this.i = d;
        return this;
    }

    public jfe e(int i) {
        this.f38528b = i;
        return this;
    }

    public Pair<Integer, Double> a() {
        return new Pair<>(Integer.valueOf(this.f38527a.e), Double.valueOf(this.f38527a.d));
    }

    public Pair<Integer, Double> b() {
        return new Pair<>(Integer.valueOf(this.f38527a.f38531c), Double.valueOf(this.f38527a.f38530a));
    }

    private ArrayList<LatLong> a(ArrayList<LatLong> arrayList) {
        String str;
        int i;
        boolean z;
        ArrayList<LatLong> arrayList2 = arrayList;
        String str2 = "Track_MotionTrackProcess";
        LogUtil.a("Track_MotionTrackProcess", "Go into gpsDataUpSample");
        ArrayList<LatLong> arrayList3 = new ArrayList<>(200);
        this.d = new b();
        if (arrayList2 == null || arrayList.size() < 2) {
            LogUtil.j("Track_MotionTrackProcess", "GPS Data is null");
            return arrayList3;
        }
        arrayList3.add(arrayList2.get(0));
        boolean z2 = true;
        this.d.e(arrayList3.size() - 1, arrayList3.get(arrayList3.size() - 1).getMultiplexField());
        this.e = 0.0d;
        LatLong latLong = arrayList2.get(0);
        arrayList2.get(0);
        int i2 = 1;
        while (i2 < arrayList.size()) {
            LatLong latLong2 = arrayList2.get(i2);
            jfa.c(latLong, latLong2);
            if (latLong.getDistance() < this.i) {
                latLong.setLineStatus(latLong2.getLineStatus());
                str = str2;
                i = i2;
                z = z2;
            } else {
                this.e += latLong.getDistance();
                int distance = (int) (latLong.getDistance() / this.i);
                double d = distance;
                double d2 = (latLong2.getLatLng().d - latLong.getLatLng().d) / d;
                double d3 = (latLong2.getLatLng().f38787a - latLong.getLatLng().f38787a) / d;
                double multiplexField = (latLong2.getMultiplexField() - latLong.getMultiplexField()) / d;
                int i3 = 1;
                while (i3 < distance) {
                    LatLong latLong3 = latLong2;
                    double d4 = i3;
                    arrayList3.add(new LatLong(latLong.getLatLng().d + (d2 * d4), latLong.getLatLng().f38787a + (d3 * d4), latLong.getMultiplexField() + (d4 * multiplexField)).setLineStatus(latLong.getLineStatus()));
                    this.d.e(arrayList3.size() - 1, arrayList3.get(arrayList3.size() - 1).getMultiplexField());
                    i3++;
                    latLong2 = latLong3;
                    str2 = str2;
                    i2 = i2;
                    distance = distance;
                    multiplexField = multiplexField;
                }
                str = str2;
                i = i2;
                LatLong lineStatus = new LatLong(latLong.getLatLng().d + (d2 * d), latLong.getLatLng().f38787a + (d3 * d), latLong.getMultiplexField() + (multiplexField * d)).setLineStatus(latLong2.getLineStatus());
                arrayList3.add(lineStatus);
                z = true;
                this.d.e(arrayList3.size() - 1, arrayList3.get(arrayList3.size() - 1).getMultiplexField());
                latLong = lineStatus;
            }
            i2 = i + 1;
            arrayList2 = arrayList;
            z2 = z;
            str2 = str;
        }
        LogUtil.a(str2, "Go out gpsDataUpSample");
        return arrayList3;
    }

    private ArrayList<LatLong> d(ArrayList<LatLong> arrayList) {
        jfe jfeVar = this;
        ArrayList<LatLong> arrayList2 = arrayList;
        String str = "Track_MotionTrackProcess";
        LogUtil.a("Track_MotionTrackProcess", "Go into gpsDataDownSample");
        if (arrayList2 != null) {
            int i = 1;
            if (arrayList.size() >= 1) {
                int size = arrayList.size();
                LogUtil.a("Track_MotionTrackProcess", "original data size is " + size);
                int i2 = jfeVar.f38528b;
                if (size < i2) {
                    return arrayList2;
                }
                int i3 = size - 1;
                ArrayList<LatLong> arrayList3 = new ArrayList<>(200);
                arrayList3.add(arrayList2.get(0));
                double d = (((double) i3) * 1.0d) / ((double) (i2 - 1));
                double d2 = 0.0d;
                int i4 = 1;
                while (i4 < jfeVar.f38528b - i) {
                    double d3 = d2 + d;
                    int i5 = (int) d3;
                    int i6 = i5 + 1;
                    double d4 = d;
                    int i7 = i3;
                    double d5 = d3 - ((double) i5);
                    arrayList3.add(new LatLong(arrayList2.get(i5).getLatLng().d + ((arrayList2.get(i6).getLatLng().d - arrayList2.get(i5).getLatLng().d) * d5), arrayList2.get(i5).getLatLng().f38787a + ((arrayList2.get(i6).getLatLng().f38787a - arrayList2.get(i5).getLatLng().f38787a) * d5), arrayList.get(i5).getMultiplexField() + ((arrayList2.get(i6).getMultiplexField() - arrayList2.get(i5).getMultiplexField()) * d5)).setLineStatus(arrayList.get(i5).getLineStatus()));
                    i4++;
                    arrayList2 = arrayList;
                    d = d4;
                    str = str;
                    i3 = i7;
                    d2 = d3;
                    i = 1;
                    jfeVar = this;
                }
                String str2 = str;
                arrayList3.add(arrayList2.get(i3));
                b bVar = this.d;
                bVar.e = (bVar.e * (arrayList3.size() - 1)) / (arrayList.size() - 1);
                if (this.d.e >= 0 && this.d.e < arrayList3.size()) {
                    arrayList3.get(this.d.e).setMultiplexField(this.d.d);
                }
                b bVar2 = this.d;
                bVar2.f38531c = (bVar2.f38531c * (arrayList3.size() - 1)) / (arrayList.size() - 1);
                LogUtil.a(str2, "data size is " + arrayList3.size());
                LogUtil.a(str2, "Go out gpsDataDownSample");
                return arrayList3;
            }
        }
        LogUtil.j("Track_MotionTrackProcess", "GPS Down Sample Data is null");
        return new ArrayList<>(16);
    }

    private ArrayList<LatLong> c(ArrayList<LatLong> arrayList) {
        LogUtil.a("Track_MotionTrackProcess", "go into gpsBearAnalysis");
        if (arrayList == null || arrayList.size() < 1) {
            LogUtil.j("Track_MotionTrackProcess", "up sample data is null");
            return new ArrayList<>(16);
        }
        int i = 0;
        while (i < arrayList.size() - 1) {
            arrayList.get(i).setIndex(i);
            LatLong latLong = arrayList.get(i);
            i++;
            jfa.c(latLong, arrayList.get(i));
        }
        arrayList.get(arrayList.size() - 1).setIndex(arrayList.size() - 1);
        arrayList.get(arrayList.size() - 1).setAngle(0.0d);
        arrayList.get(arrayList.size() - 1).setDistance(0.0d);
        arrayList.get(arrayList.size() - 1).setLineStatus(1);
        LogUtil.a("Track_MotionTrackProcess", "go out gpsBearAnalysis");
        return arrayList;
    }

    private ArrayList<LatLong> b(ArrayList<LatLong> arrayList) {
        double multiplexField;
        double multiplexField2;
        LogUtil.a("Track_MotionTrackProcess", "go into smoothMultiplexField");
        if (arrayList != null) {
            int i = 1;
            if (arrayList.size() >= 1) {
                LinkedList linkedList = new LinkedList();
                jfo jfoVar = new jfo();
                double dDoubleValue = 0.0d;
                for (int i2 = -3; i2 <= 3; i2++) {
                    if (i2 < 0) {
                        multiplexField2 = arrayList.get(0).getMultiplexField();
                    } else if (i2 >= arrayList.size()) {
                        multiplexField2 = arrayList.get(arrayList.size() - 1).getMultiplexField();
                    } else {
                        multiplexField2 = arrayList.get(i2).getMultiplexField();
                    }
                    double dC = jfoVar.c(multiplexField2);
                    dDoubleValue += dC;
                    linkedList.offer(Double.valueOf(dC));
                }
                double d = 7;
                e(arrayList, 0, dDoubleValue / d);
                this.f38527a.e(0, arrayList.get(0).getMultiplexField());
                int i3 = 4;
                while (i3 < arrayList.size() + 3) {
                    if (i3 >= arrayList.size()) {
                        multiplexField = arrayList.get(arrayList.size() - i).getMultiplexField();
                    } else {
                        multiplexField = arrayList.get(i3).getMultiplexField();
                    }
                    double dC2 = jfoVar.c(multiplexField);
                    dDoubleValue = (dDoubleValue - ((Double) linkedList.remove()).doubleValue()) + dC2;
                    linkedList.offer(Double.valueOf(dC2));
                    int i4 = i3 - 3;
                    e(arrayList, i4, dDoubleValue / d);
                    this.f38527a.e(i4, arrayList.get(i4).getMultiplexField());
                    i3++;
                    jfoVar = jfoVar;
                    i = 1;
                }
                LogUtil.a("Track_MotionTrackProcess", "data size is " + arrayList.size());
                LogUtil.a("Track_MotionTrackProcess", "go into smoothMultiplexField");
                return arrayList;
            }
        }
        LogUtil.j("Track_MotionTrackProcess", "gps data is null");
        return new ArrayList<>(16);
    }

    private void e(ArrayList<LatLong> arrayList, int i, double d) {
        int i2 = this.d.e;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.get(i).setMultiplexField(d);
            return;
        }
        double multiplexField = arrayList.get(i).getMultiplexField();
        if (i < i2 - 3 || i > i2 + 3 || Double.isNaN(multiplexField) || Double.isInfinite(multiplexField)) {
            arrayList.get(i).setMultiplexField(d);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f38530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38531c;
        private double d;
        private int e;

        private b() {
            this.e = 0;
            this.d = -1.7976931348623157E308d;
            this.f38531c = 0;
            this.f38530a = Double.MAX_VALUE;
        }

        public void e(int i, double d) {
            if (d > this.d) {
                this.e = i;
                this.d = d;
            }
            if (d < this.f38530a) {
                this.f38531c = i;
                this.f38530a = d;
            }
        }
    }
}
