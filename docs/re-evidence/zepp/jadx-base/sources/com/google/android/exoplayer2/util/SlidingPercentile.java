package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingPercentile {
    private static final Comparator<b> h = new Comparator() { // from class: com.google.android.exoplayer2.util.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.e((SlidingPercentile.b) obj, (SlidingPercentile.b) obj2);
        }
    };
    private static final Comparator<b> i = new Comparator() { // from class: com.google.android.exoplayer2.util.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.f((SlidingPercentile.b) obj, (SlidingPercentile.b) obj2);
        }
    };
    private static final int j = -1;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 5;
    private final int a;
    private int e;
    private int f;
    private int g;
    private final b[] c = new b[5];
    private final ArrayList<b> b = new ArrayList<>();
    private int d = -1;

    public static class b {
        public int a;
        public int b;
        public float c;

        private b() {
        }
    }

    public SlidingPercentile(int maxWeight) {
        this.a = maxWeight;
    }

    private void c() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    private void d() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(b bVar, b bVar2) {
        return bVar.a - bVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(b bVar, b bVar2) {
        return Float.compare(bVar.c, bVar2.c);
    }

    public void addSample(int weight, float value) {
        b bVar;
        c();
        int i2 = this.g;
        if (i2 > 0) {
            b[] bVarArr = this.c;
            int i3 = i2 - 1;
            this.g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new b();
        }
        int i4 = this.e;
        this.e = i4 + 1;
        bVar.a = i4;
        bVar.b = weight;
        bVar.c = value;
        this.b.add(bVar);
        this.f += weight;
        while (true) {
            int i5 = this.f;
            int i6 = this.a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            b bVar2 = this.b.get(0);
            int i8 = bVar2.b;
            if (i8 <= i7) {
                this.f -= i8;
                this.b.remove(0);
                int i9 = this.g;
                if (i9 < 5) {
                    b[] bVarArr2 = this.c;
                    this.g = i9 + 1;
                    bVarArr2[i9] = bVar2;
                }
            } else {
                bVar2.b = i8 - i7;
                this.f -= i7;
            }
        }
    }

    public float getPercentile(float percentile) {
        d();
        float f = percentile * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            b bVar = this.b.get(i3);
            i2 += bVar.b;
            if (i2 >= f) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.b;
        return arrayList.get(arrayList.size() - 1).c;
    }

    public void reset() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }
}
