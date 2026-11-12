package com.huawei.hms.network.file.a.j.a;

import com.huawei.hms.network.file.core.util.FLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0163a f15686a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<Double> f15687b;

    /* JADX INFO: renamed from: com.huawei.hms.network.file.a.j.a.a$a, reason: collision with other inner class name */
    static class C0163a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f15688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0163a f15690c;
        public C0163a d;
        public int e;
        public double f;
        public double g;
    }

    public ArrayList<Double> a(ArrayList<double[]> arrayList) {
        ArrayList<Double> arrayList2 = new ArrayList<>();
        for (double[] dArr : arrayList) {
            double dA = a(dArr);
            if (dA == -1.0d || dA == -100.0d) {
                FLogger.e("DecisionTree", "predict error,  error for:" + Arrays.toString(dArr) + ",name:" + this.f15686a.f15688a);
            }
            arrayList2.add(Double.valueOf(dA));
        }
        this.f15687b = arrayList2;
        return arrayList2;
    }

    private double a(double[] dArr) {
        C0163a c0163a = this.f15686a;
        C0163a c0163a2 = c0163a;
        while (c0163a2 != null) {
            if (c0163a2.f15689b) {
                return c0163a2.f;
            }
            C0163a c0163a3 = c0163a2.f15690c;
            c0163a2 = (c0163a3 == null || dArr[c0163a2.e] >= c0163a2.g) ? c0163a2.d : c0163a3;
        }
        FLogger.e("DecisionTree", "predict error, parent:" + c0163a.f15688a);
        return -1.0d;
    }
}
