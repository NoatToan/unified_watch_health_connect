package defpackage;

import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class emh {
    public static void a(List<bmh> list, int i, GpsValues gpsValues, int i2, boolean z) {
        List<Location> list2;
        if (i == 0) {
            List<Location> list3 = gpsValues.swimLocationList;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            bmh bmhVar = new bmh(gpsValues.timeStamp, 0, e(gpsValues.swimLocationList, z), i2);
            bmhVar.e = x44.a(vii.B);
            list.add(bmhVar);
            return;
        }
        if (i != 1) {
            if (i == 2 && (list2 = gpsValues.runLocationList) != null && list2.size() > 0) {
                bmh bmhVar2 = new bmh(gpsValues.timeStamp, 0, e(gpsValues.runLocationList, z), i2);
                bmhVar2.e = x44.a(vii.A);
                list.add(bmhVar2);
                return;
            }
            return;
        }
        List<Location> list4 = gpsValues.cycleLocationList;
        if (list4 == null || list4.size() <= 0) {
            return;
        }
        bmh bmhVar3 = new bmh(gpsValues.timeStamp, 0, e(gpsValues.cycleLocationList, z), i2);
        bmhVar3.e = x44.a(vii.z);
        list.add(bmhVar3);
    }

    public static List<bmh> b(GpsValues gpsValues, boolean z) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        List<Location> list = gpsValues.locationList;
        if (list != null && list.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Location location = null;
            int i3 = 0;
            int i4 = 1;
            while (i3 < list.size()) {
                Location location2 = list.get(i3);
                if (location == null) {
                    location2 = location2;
                    arrayList2.add(location2);
                } else if (!location2.flagSegment || location2.isPause) {
                    location2 = location2;
                    if (location2.isPause) {
                        if (!arrayList2.isEmpty()) {
                            bmh bmhVar = new bmh(gpsValues.timeStamp, 0, e(arrayList2, z), i4);
                            bmhVar.e = x44.a(vii.y);
                            arrayList.add(bmhVar);
                            arrayList2.clear();
                            i4++;
                        }
                        arrayList3.add(location2);
                    } else {
                        if (!arrayList3.isEmpty()) {
                            bmh bmhVar2 = new bmh(gpsValues.timeStamp, 2, e(arrayList3, z), i4);
                            bmhVar2.e = x44.a(vii.y);
                            arrayList.add(bmhVar2);
                            arrayList3.clear();
                            i4++;
                        }
                        arrayList2.add(location2);
                    }
                } else {
                    if (arrayList2.size() > 0) {
                        bmh bmhVar3 = new bmh(gpsValues.timeStamp, 0, e(arrayList2, z), i4);
                        bmhVar3.e = x44.a(vii.y);
                        arrayList.add(bmhVar3);
                        i = i4 + 1;
                    } else {
                        i = i4;
                    }
                    arrayList2.clear();
                    arrayList2.add(location);
                    arrayList2.add(location2);
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 < 2 && (i2 = i3 + 1) < list.size()) {
                        arrayList2.add(list.get(i2));
                        i5++;
                        i3 = i2;
                        z2 = true;
                    }
                    if (z2) {
                        i3--;
                    }
                    bmh bmhVar4 = new bmh(gpsValues.timeStamp, 1, e(arrayList2, z), i);
                    bmhVar4.e = x44.a(vii.y);
                    arrayList.add(bmhVar4);
                    arrayList2.clear();
                    i4 = i + 1;
                }
                i3++;
                location = location2;
            }
            if (arrayList2.size() > 0) {
                bmh bmhVar5 = new bmh(gpsValues.timeStamp, 0, e(arrayList2, z), i4);
                bmhVar5.e = x44.a(vii.y);
                arrayList.add(bmhVar5);
            }
        }
        return arrayList;
    }

    public static List<bmh> c(SportBasicReport sportBasicReport, GpsValues gpsValues, boolean z) {
        return (sportBasicReport == null || sportBasicReport.getSportType() != 17) ? b(gpsValues, z) : d(sportBasicReport, gpsValues, z);
    }

    public static List<bmh> d(SportBasicReport sportBasicReport, GpsValues gpsValues, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<Location> list = gpsValues.locationList;
        if (list != null && list.size() != 0) {
            int i = 1;
            if (sportBasicReport.getFirstSport() != null) {
                a(arrayList, sportBasicReport.getFirstSport().intValue(), gpsValues, 1, z);
                i = 2;
            } else {
                Logger.i("createTriathlonRecordList", "sportValues.getFirstSport()  null");
            }
            if (sportBasicReport.getSecondSport() != null) {
                a(arrayList, sportBasicReport.getSecondSport().intValue(), gpsValues, i, z);
                i++;
            } else {
                Logger.i("createTriathlonRecordList", "sportValues.getSecondSport()  null");
            }
            if (sportBasicReport.getThirdSport() != null) {
                a(arrayList, sportBasicReport.getThirdSport().intValue(), gpsValues, i, z);
            } else {
                Logger.i("createTriathlonRecordList", "sportValues.getThirdSport()  null");
            }
        }
        return arrayList;
    }

    public static List<s2b> e(List<Location> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Location location = list.get(i);
            if (z) {
                arrayList.add(t4i.b(location.latitude, location.longitude));
            } else {
                arrayList.add(new s2b(location.latitude, location.longitude, location.speed));
            }
        }
        return arrayList;
    }

    public static int f(float f) {
        if (f >= 9.0f) {
            return x44.a(vii.i);
        }
        double d = f;
        if (d >= 8.5d) {
            return x44.a(vii.p);
        }
        if (f >= 8.0f) {
            return x44.a(vii.q);
        }
        if (d >= 7.5d) {
            return x44.a(vii.f36930r);
        }
        if (f >= 7.0f) {
            return x44.a(vii.s);
        }
        if (d >= 6.5d) {
            return x44.a(vii.t);
        }
        if (f >= 6.0f) {
            return x44.a(vii.u);
        }
        if (d >= 5.8d) {
            return x44.a(vii.v);
        }
        if (d >= 5.6d) {
            return x44.a(vii.w);
        }
        if (d >= 5.4d) {
            return x44.a(vii.j);
        }
        if (d >= 5.2d) {
            return x44.a(vii.f36929k);
        }
        if (d >= 5.1d) {
            return x44.a(vii.l);
        }
        if (f >= 5.0f) {
            return x44.a(vii.m);
        }
        if (d >= 4.8d) {
            return x44.a(vii.n);
        }
        return d >= 4.7d ? x44.a(vii.o) : x44.a(vii.o);
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return x44.a(vii.i);
            case 1:
                return x44.a(vii.p);
            case 2:
                return x44.a(vii.q);
            case 3:
                return x44.a(vii.f36930r);
            case 4:
                return x44.a(vii.s);
            case 5:
                return x44.a(vii.t);
            case 6:
                return x44.a(vii.u);
            case 7:
                return x44.a(vii.v);
            case 8:
                return x44.a(vii.w);
            case 9:
                return x44.a(vii.j);
            default:
                return x44.a(vii.j);
        }
    }

    public static float h(float f) {
        if (f == 0.0f) {
            return 1000.0f;
        }
        return 1000.0f / (f * 60.0f);
    }

    public static int i(float f, float f2, float f3) {
        float f4 = f3 - f2;
        float f5 = f * 3.6f;
        if (f4 == 0.0f || f5 <= f2) {
            return 0;
        }
        if (f5 >= f3) {
            return 10;
        }
        return (int) (((f5 - f2) * 10.0f) / f4);
    }
}
