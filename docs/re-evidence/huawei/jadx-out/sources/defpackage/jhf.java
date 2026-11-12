package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class jhf {
    private MotionPath f;
    private int h;
    private List<PhotoModel> i;
    private MotionPathSimplify j;
    private HashMap<Integer, List<PhotoModel>> e = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<PhotoModel, Double> f38629b = new HashMap<>();
    private HashMap<PhotoModel, Double> g = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f38628a = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38630c = 0;
    private LatLong d = null;

    public jhf(List<PhotoModel> list, MotionPath motionPath, MotionPathSimplify motionPathSimplify, int i) {
        this.f = null;
        this.j = null;
        this.f = motionPath;
        this.j = motionPathSimplify;
        this.h = i;
        this.i = list;
    }

    public HashMap<Integer, List<PhotoModel>> a() {
        e();
        c();
        return this.e;
    }

    private void e() {
        List<PhotoModel> list;
        this.f38629b.clear();
        if (this.f == null || (list = this.i) == null || list.size() == 0) {
            return;
        }
        long jD = d();
        while (this.f38630c < this.i.size() && this.i.get(this.f38630c).getTime() - jD < 20000) {
            this.f38629b.put(this.i.get(this.f38630c), Double.valueOf(this.f38628a));
            this.f38630c++;
        }
        e(this.f38628a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    private long d() {
        int i;
        double d;
        char c2 = 0;
        boolean z = false;
        long j = 0;
        for (Map.Entry<Long, double[]> entry : this.f.requestLbsDataMap().entrySet()) {
            if (entry.getValue() != null && entry.getValue().length >= 2) {
                int i2 = 1;
                if (jfn.a(entry.getValue()[c2], entry.getValue()[1])) {
                    c(j, this.f38628a, entry);
                    z = true;
                } else {
                    long jE = e(entry.getKey().longValue(), entry.getValue());
                    if (!jfn.b(entry.getValue()[c2], entry.getValue()[1]) && jE >= 0) {
                        LatLong latLong = new LatLong(entry.getValue()[0], entry.getValue()[1]);
                        if (this.d == null) {
                            this.d = latLong;
                            while (this.f38630c < this.i.size() && jE > this.i.get(this.f38630c).getTime()) {
                                this.f38630c++;
                            }
                            j = jE;
                        }
                        boolean z2 = z ? false : z;
                        double dB = jfa.b(this.d, latLong);
                        while (this.f38630c < this.i.size() && jE >= this.i.get(this.f38630c).getTime()) {
                            if (z) {
                                i = i2;
                                d = dB;
                                this.f38630c += i;
                            } else {
                                long j2 = jE - j;
                                if (j2 > 20000 && dB > 20.0d) {
                                    i = i2;
                                    d = dB;
                                    this.f38630c += i;
                                } else {
                                    d = dB;
                                    this.f38629b.put(this.i.get(this.f38630c), Double.valueOf(this.f38628a + (((this.i.get(this.f38630c).getTime() - j) * d) / j2)));
                                    i = 1;
                                    this.f38630c++;
                                }
                            }
                            i2 = i;
                            z = z;
                            dB = d;
                            jE = jE;
                        }
                        this.f38628a += dB;
                        this.d = latLong;
                        z = z2;
                        j = jE;
                    }
                    c2 = 0;
                }
            }
            z = z;
            c2 = 0;
        }
        return j;
    }

    private void c(long j, double d, Map.Entry<Long, double[]> entry) {
        long jE = e(entry.getKey().longValue(), entry.getValue());
        while (this.f38630c < this.i.size() && jE >= this.i.get(this.f38630c).getTime() && Math.abs(this.i.get(this.f38630c).getTime() - j) < 20000) {
            this.f38629b.put(this.i.get(this.f38630c), Double.valueOf(d));
            this.f38630c++;
        }
    }

    private long e(long j, double[] dArr) {
        if (dArr.length == 4) {
            j = (long) dArr[3];
        }
        if (String.valueOf(j).length() == 10) {
            return j * 1000;
        }
        if (String.valueOf(j).length() == 13) {
            return j;
        }
        return -1L;
    }

    private void e(double d) {
        this.g.clear();
        for (Map.Entry<PhotoModel, Double> entry : this.f38629b.entrySet()) {
            this.g.put(entry.getKey(), Double.valueOf(entry.getValue().doubleValue() / d));
        }
    }

    private void c() {
        int i;
        this.e.clear();
        TreeMap treeMap = new TreeMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<PhotoModel, Double> entry : this.g.entrySet()) {
            int iRound = Math.round(entry.getValue().floatValue() * (this.h - 1));
            if (iRound >= 0) {
                if (treeMap.containsKey(Integer.valueOf(iRound))) {
                    ((List) treeMap.get(Integer.valueOf(iRound))).add(entry.getKey());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(entry.getKey());
                    treeMap.put(Integer.valueOf(iRound), arrayList2);
                }
                if (!arrayList.contains(Integer.valueOf(iRound))) {
                    arrayList.add(Integer.valueOf(iRound));
                }
            }
        }
        Collections.sort(arrayList);
        double dB = b();
        TreeMap treeMap2 = new TreeMap();
        for (int i2 = 0; i2 < arrayList.size(); i2 = i) {
            Integer num = (Integer) arrayList.get(i2);
            num.intValue();
            treeMap2.put(num, (List) treeMap.get(num));
            i = i2 + 1;
            while (i < arrayList.size() && ((double) (((Integer) arrayList.get(i)).intValue() - ((Integer) arrayList.get(i2)).intValue())) * dB < 25.0d) {
                Integer num2 = (Integer) arrayList.get(i);
                num2.intValue();
                treeMap2.get(num).addAll((Collection) treeMap.get(num2));
                i++;
            }
        }
        a(treeMap2);
    }

    private void a(Map<Integer, List<PhotoModel>> map) {
        int i = 0;
        for (Map.Entry<Integer, List<PhotoModel>> entry : map.entrySet()) {
            List<PhotoModel> value = entry.getValue();
            Collections.sort(value, new Comparator<PhotoModel>(this) { // from class: jhf.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(PhotoModel photoModel, PhotoModel photoModel2) {
                    if (photoModel.getRowId() > photoModel2.getRowId()) {
                        return 1;
                    }
                    return photoModel.getRowId() < photoModel2.getRowId() ? -1 : 0;
                }
            });
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < value.size() && i2 < 3; i2++) {
                arrayList.add(value.get(i2));
                i++;
                if (i == 9) {
                    break;
                }
            }
            if (arrayList.size() > 0) {
                this.e.put(entry.getKey(), arrayList);
            }
            if (i == 9) {
                return;
            }
        }
    }

    private double b() {
        return (Math.round(((double) Math.abs(this.j.requestTotalDistance())) / 10.0d) * 10.0d) / ((double) this.h);
    }
}
