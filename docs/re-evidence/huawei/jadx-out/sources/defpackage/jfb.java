package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jfb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<LatLong> f38520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38521c = new e();

    public void e() {
        LogUtil.a("Track_AreaProcess", "Go into handle");
        ArrayList<LatLong> arrayList = this.f38520b;
        if (arrayList == null) {
            LogUtil.j("Track_AreaProcess", "GPS Data is null");
            this.f38520b = new ArrayList<>(16);
        } else {
            this.f38520b = a(arrayList);
            LogUtil.a("Track_AreaProcess", "Go out handle");
        }
    }

    public jfb d(ArrayList<LatLong> arrayList) {
        this.f38520b = arrayList;
        return this;
    }

    public ArrayList<LatLong> d() {
        return this.f38520b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<LatLong> a(ArrayList<LatLong> arrayList) {
        jpg latLng;
        if (arrayList == null) {
            return new ArrayList<>();
        }
        a aVar = null;
        e eVar = new e();
        ArrayList arrayList2 = new ArrayList();
        for (LatLong latLong : arrayList) {
            if (latLong != null && (latLng = latLong.getLatLng()) != null) {
                a aVar2 = new a(latLng.d, latLng.f38787a);
                eVar.e(aVar2);
                a aVarB = eVar.b();
                if (aVarB != null) {
                    if (aVar == null) {
                        aVar = new a(aVarB.d(), aVarB.b());
                        arrayList2.add(Double.valueOf(0.0d));
                    } else {
                        a aVar3 = new a(aVarB.d(), aVarB.b());
                        double dA = jfa.a(aVar.d(), aVar.b(), aVar3.d(), aVar3.b());
                        arrayList2.add(Double.valueOf(dA > 0.05d ? dA : 0.0d));
                        this.f38521c.e(aVar2);
                        aVar = aVar3;
                    }
                }
            }
        }
        boolean[] zArr = new boolean[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            if (!zArr[i]) {
                zArr[i] = true;
                if (arrayList2.get(i).doubleValue() <= 1.0E-6d) {
                    b(arrayList2, arrayList, zArr, i);
                }
            }
        }
        return arrayList;
    }

    private void b(List<Double> list, ArrayList<LatLong> arrayList, boolean[] zArr, int i) {
        LatLong latLong;
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        e eVar = new e();
        e eVar2 = new e();
        e eVar3 = new e();
        for (int i2 = i; i2 < list.size(); i2++) {
            if (i2 < zArr.length) {
                zArr[i2] = true;
            }
            if (njy.e(arrayList, i2) || (latLong = arrayList.get(i2)) == null) {
                break;
            }
            jpg latLng = latLong.getLatLng();
            if (latLng != null) {
                a aVar = new a(latLng.d, latLng.f38787a);
                if (list.get(i2).doubleValue() <= 1.0E-6d) {
                    arrayList2.add(Integer.valueOf(i2));
                    eVar.e(aVar);
                    if (arrayList4.size() > 0) {
                        arrayList3.addAll(arrayList4);
                        eVar2.e(eVar3.e());
                        eVar2.e(eVar3.a());
                        arrayList4 = new ArrayList();
                        eVar3 = new e();
                    }
                } else {
                    arrayList4.add(Integer.valueOf(i2));
                    eVar3.e(aVar);
                    if (arrayList4.size() + arrayList3.size() > arrayList2.size() / 5) {
                        break;
                    }
                }
            }
        }
        if (arrayList2.size() > arrayList.size() / 10 || arrayList2.size() >= 15) {
            e(arrayList, i, arrayList3, eVar, eVar2);
            d(arrayList, arrayList3, arrayList2, eVar2);
        }
    }

    private void e(ArrayList<LatLong> arrayList, int i, List<Integer> list, e eVar, e eVar2) {
        jpg latLng;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!njy.e(arrayList, i) && (latLng = arrayList.get(i).getLatLng()) != null) {
                a aVar = new a(latLng.d, latLng.f38787a);
                list.add(Integer.valueOf(i));
                eVar2.e(aVar);
                if (b(eVar2, eVar)) {
                    return;
                }
            }
        }
    }

    private boolean b(e eVar, e eVar2) {
        return eVar.a().d() - eVar2.a().d() > -1.0E-6d && eVar.a().b() - eVar2.a().b() > -1.0E-6d && eVar2.e().d() - eVar.e().d() > -1.0E-6d && eVar2.e().b() - eVar.e().b() > -1.0E-6d;
    }

    private void d(ArrayList<LatLong> arrayList, List<Integer> list, List<Integer> list2, e eVar) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.j("Track_AreaProcess", "setAreaToTrackData point list is empty");
            return;
        }
        jfc jfcVar = new jfc(list.get(0).intValue(), list2.get(list2.size() - 1).intValue(), new jpg(eVar.e().d(), eVar.e().b()), new jpg(eVar.a().d(), eVar.a().b()));
        double dB = b(jfcVar);
        if (dB >= 0.8d) {
            return;
        }
        a(arrayList, list, list2, jfcVar, dB);
    }

    private void a(ArrayList<LatLong> arrayList, List<Integer> list, List<Integer> list2, jfc jfcVar, double d) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (njy.e(arrayList, iIntValue)) {
                break;
            }
            LatLong latLong = arrayList.get(iIntValue);
            if (latLong != null) {
                if (!z) {
                    latLong.setAreaStart(true);
                    z = true;
                } else {
                    latLong.setAreaStart(false);
                    latLong.setAreaEnd(false);
                }
                latLong.setIsInArea(true);
                latLong.setLatLongArea(jfcVar);
                latLong.setAreaFraction(d);
            }
        }
        boolean z2 = false;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            int iIntValue2 = list2.get(size2).intValue();
            if (njy.e(arrayList, iIntValue2)) {
                return;
            }
            LatLong latLong2 = arrayList.get(iIntValue2);
            if (latLong2 != null) {
                if (!z2) {
                    latLong2.setAreaEnd(true);
                    z2 = true;
                } else {
                    latLong2.setAreaStart(false);
                    latLong2.setAreaEnd(false);
                }
                latLong2.setIsInArea(true);
                latLong2.setLatLongArea(jfcVar);
                latLong2.setAreaFraction(d);
            }
        }
    }

    private double b(jfc jfcVar) {
        return (jfa.a(jfcVar.e().d, jfcVar.e().f38787a, jfcVar.a().d, jfcVar.e().f38787a) + jfa.a(jfcVar.e().d, jfcVar.e().f38787a, jfcVar.e().d, jfcVar.a().f38787a)) / (jfa.a(this.f38521c.a().d(), this.f38521c.a().b(), this.f38521c.e().d(), this.f38521c.a().b()) + jfa.a(this.f38521c.a().d(), this.f38521c.a().b(), this.f38521c.a().d(), this.f38521c.e().b()));
    }

    public int a() {
        int i = 0;
        if (njy.e(this.f38520b)) {
            return 0;
        }
        boolean isInArea = false;
        for (LatLong latLong : this.f38520b) {
            if (latLong.getIsInArea() != isInArea) {
                if (!isInArea) {
                    i++;
                }
                isInArea = latLong.getIsInArea();
            }
        }
        return i;
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f38522b;
        private double d;

        a(double d, double d2) {
            this.f38522b = d;
            this.d = d2;
        }

        public void a(double d) {
            this.f38522b = d;
        }

        public void b(double d) {
            this.d = d;
        }

        public double d() {
            return this.f38522b;
        }

        public double b() {
            return this.d;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f38523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f38524b;
        private a d;

        private e() {
        }

        public a e() {
            return this.f38524b;
        }

        public a a() {
            return this.d;
        }

        public a b() {
            return this.f38523a;
        }

        public e e(a aVar) {
            if (aVar == null) {
                return this;
            }
            if (this.f38524b == null) {
                this.f38524b = new a(aVar.d(), aVar.b());
            }
            if (this.d == null) {
                this.d = new a(aVar.d(), aVar.b());
            }
            c(aVar);
            c();
            return this;
        }

        private void c(a aVar) {
            if (aVar.d() < this.f38524b.d()) {
                this.f38524b.a(aVar.d());
            } else if (aVar.d() > this.d.d()) {
                this.d.a(aVar.d());
            }
            if (aVar.b() < this.f38524b.b()) {
                this.f38524b.b(aVar.b());
            } else if (aVar.b() > this.d.b()) {
                this.d.b(aVar.b());
            }
        }

        private void c() {
            a aVar;
            if (this.f38524b == null || (aVar = this.d) == null) {
                LogUtil.j("Track_AreaProcess", "calculateCenterPoint get null latlng");
            } else {
                this.f38523a = new a(((aVar.d() - this.f38524b.d()) / 2.0d) + this.f38524b.d(), ((this.d.b() - this.f38524b.b()) / 2.0d) + this.f38524b.b());
            }
        }
    }
}
