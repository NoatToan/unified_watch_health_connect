package com.huawei.hms.network.file.a.j.a;

import android.os.Build;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.core.util.FLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    private static final int[] g = {2, 3, 4, 5, 6, 7, 8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<com.huawei.hms.network.file.a.j.a.a> f15691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f15693c;
    volatile long d;
    int[] e;
    boolean f;

    /* JADX INFO: renamed from: com.huawei.hms.network.file.a.j.a.b$b, reason: collision with other inner class name */
    static class C0164b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f15694a = new b();
    }

    public static int a(int i) {
        if (i > 0) {
            return 0;
        }
        if (i > -60) {
            return 5;
        }
        if (i > -75) {
            return 4;
        }
        if (i > -90) {
            return 3;
        }
        if (i > -100) {
            return 2;
        }
        return i > -110 ? 1 : 0;
    }

    static boolean b(int i) {
        return 1 == i;
    }

    public int a(long j, long j2) {
        if (!this.f15693c || !this.f) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArrA = a();
        FLogger.i("DecisionTreeManager", "getCachedNetworkInfos timeused:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        if (iArrA == null) {
            FLogger.e("DecisionTreeManager", "predictSliceNum failed, networkInfo is null");
            return 0;
        }
        int i = iArrA[0];
        int i2 = iArrA[1];
        int i3 = iArrA[2];
        FLogger.d("DecisionTreeManager", "predictSliceNum networkType:" + i + ",wifiNum:" + i2 + ",mobileNum:" + i3, new Object[0]);
        return a(i, i2, i3, j, a(Build.MODEL), j2);
    }

    public static b b() {
        return C0164b.f15694a;
    }

    private int[] a() {
        synchronized (this.f15692b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.d == 0 || jCurrentTimeMillis - this.d > 30000) {
                if (this.e == null) {
                    this.e = new int[3];
                }
                this.e[0] = NetworkUtil.netWork(RequestManager.getAppContext());
                this.e[1] = NetworkUtil.getWifiRssi(RequestManager.getAppContext());
                this.e[2] = NetworkUtil.getMobileRsrp(RequestManager.getAppContext());
                this.d = System.currentTimeMillis();
            }
        }
        return this.e;
    }

    public static double[] a(double[] dArr, boolean z) {
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        if (z) {
            if (!a((int) dArrCopyOf[0], (int) dArrCopyOf[1], (int) dArrCopyOf[2])) {
                FLogger.e("DecisionTreeManager", "preProposeData invalidData:" + Arrays.toString(dArr));
                return new double[0];
            }
            if (b((int) dArrCopyOf[0])) {
                dArrCopyOf[2] = -127.0d;
            } else {
                dArrCopyOf[1] = -127.0d;
            }
            dArrCopyOf[1] = a((int) dArrCopyOf[1]);
            dArrCopyOf[2] = a((int) dArrCopyOf[2]);
        }
        return dArrCopyOf;
    }

    static boolean a(int i, int i2, int i3) {
        String str;
        if (i == 0) {
            str = "invalid network info: unknown  netType";
        } else if (b(i) && -127 == i2) {
            str = "invalid network info: unknown  wifi";
        } else {
            if (b(i) || -127 != i3) {
                return true;
            }
            str = "invalid network info: unknown  mobile";
        }
        FLogger.e("DecisionTreeManager", str);
        return false;
    }

    static boolean a(double d, double d2) {
        return Math.abs(d - d2) <= Math.abs(d2) * 0.20000000298023224d;
    }

    private ArrayList<Double> a(ArrayList<double[]> arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Double> arrayList3 = new ArrayList<>();
        if (z) {
            for (double[] dArr : arrayList) {
                arrayList2.add(Double.valueOf(dArr[dArr.length - 1]));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (com.huawei.hms.network.file.a.j.a.a aVar : this.f15691a) {
            aVar.a(arrayList);
            arrayList4.add(aVar.f15687b);
        }
        int size = arrayList.size();
        int size2 = this.f15691a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList5 = new ArrayList();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList5.add((Double) ((ArrayList) arrayList4.get(i3)).get(i2));
            }
            double dA = a((ArrayList<Double>) arrayList5);
            arrayList3.add(Double.valueOf(dA));
            if (z && a(dA, ((Double) arrayList2.get(i2)).doubleValue())) {
                i++;
            }
        }
        if (z) {
            FLogger.i("DecisionTreeManager", "Accuracy of Forest is : " + ((i * 100) / size) + ",score:" + a((ArrayList<Double>) arrayList2, arrayList3), new Object[0]);
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer a(double[] dArr, int i, long j) {
        int[] iArr;
        int i2;
        try {
            ArrayList<double[]> arrayList = new ArrayList<>(g.length);
            int i3 = 0;
            while (true) {
                iArr = g;
                if (i3 >= iArr.length) {
                    break;
                }
                arrayList.add(new double[]{dArr[0], dArr[1], dArr[2], dArr[3], iArr[i3]});
                i3++;
                FLogger.e("DecisionTreeManager", "predictException", th);
                return null;
            }
            FLogger.d("DecisionTreeManager", "predictSliceNum params:" + Arrays.toString(arrayList.get(0)) + ",model:" + i + ", timeout:" + j, new Object[0]);
            try {
                ArrayList<Double> arrayListA = a(arrayList, false);
                Double d = arrayListA.get(0);
                int i4 = iArr[0];
                for (i2 = 1; i2 < arrayListA.size(); i2++) {
                    if (arrayListA.get(i2).doubleValue() > d.doubleValue()) {
                        d = arrayListA.get(i2);
                        i4 = g[i2];
                    }
                }
                FLogger.d("DecisionTreeManager", "predictResult:" + arrayListA + ";bestSliceNum = " + i4, new Object[0]);
                return Integer.valueOf(i4);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int a(String str) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        int length = upperCase.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = upperCase.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i = (i * 26) + (cCharAt - '@');
            }
        }
        return i;
    }

    private int a(double d, double d2, double d3, long j, final int i, final long j2) {
        String str;
        int i2 = 0;
        final double[] dArrA = a(new double[]{d, d2, d3, j, i, 0.0d}, true);
        if (dArrA.length <= 0) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            int iIntValue = ((Integer) ExecutorsUtils.newSingleThreadExecutor("DecisionTreeManager").submit(new Callable() { // from class: com.huawei.hms.network.file.a.j.a.b$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.a(dArrA, i, j2);
                }
            }).get(j2, TimeUnit.MILLISECONDS)).intValue();
            try {
                FLogger.d("DecisionTreeManager", "predictSliceNum timeued:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                return iIntValue;
            } catch (InterruptedException e) {
                e = e;
                i2 = iIntValue;
                str = "predictException for InterruptedException";
                FLogger.e("DecisionTreeManager", str, e);
                return i2;
            } catch (ExecutionException e2) {
                e = e2;
                i2 = iIntValue;
                str = "predictException for ExecutionException";
                FLogger.e("DecisionTreeManager", str, e);
                return i2;
            } catch (TimeoutException e3) {
                e = e3;
                i2 = iIntValue;
                str = "predictException for TimeoutException";
                FLogger.e("DecisionTreeManager", str, e);
                return i2;
            }
        } catch (InterruptedException e4) {
            e = e4;
        } catch (ExecutionException e5) {
            e = e5;
        } catch (TimeoutException e6) {
            e = e6;
        }
    }

    static double a(ArrayList<Double> arrayList, ArrayList<Double> arrayList2) {
        int size = arrayList.size();
        double dA = a(arrayList);
        double dPow = 0.0d;
        double dPow2 = 0.0d;
        for (int i = 0; i < size; i++) {
            dPow += Math.pow(arrayList.get(i).doubleValue() - arrayList2.get(i).doubleValue(), 2.0d);
            dPow2 += Math.pow(arrayList.get(i).doubleValue() - dA, 2.0d);
        }
        return 1.0d - (dPow / dPow2);
    }

    static double a(ArrayList<Double> arrayList) {
        double dDoubleValue = 0.0d;
        for (int i = 0; i < arrayList.size(); i++) {
            dDoubleValue += arrayList.get(i).doubleValue();
        }
        return dDoubleValue / ((double) arrayList.size());
    }

    private b() {
        this.f15691a = new ArrayList<>();
        this.f15692b = new Object();
        this.f15693c = false;
        this.d = 0L;
        this.e = null;
        this.f = true;
    }
}
