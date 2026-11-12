package com.huami.ecg.chart.pdf;

import android.content.Context;
import com.huami.ecg.chart.model.EcgLostData;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class EcgInfo {
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private long f;
    private int g;
    private int h;
    private int i;
    private List<Float> j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private List<EcgLostData> o;
    private Context p;
    private int q;
    private String r;

    public static class Builder {
        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private long f;
        private int g;
        private List<Float> h;
        private long i;
        private boolean j;
        private int k;
        private int l;
        private List<EcgLostData> m;
        private int n;
        private String o;
        private Context p;

        public Builder(String str) {
            this.a = str;
        }

        private void q(Builder builder) {
            if (this.j) {
                return;
            }
            builder.a = "--";
        }

        public EcgInfo build() {
            q(this);
            return new EcgInfo(this);
        }

        public Builder setAfib(int i) {
            this.l = i;
            return this;
        }

        public Builder setAfibResult(String str) {
            this.o = str;
            return this;
        }

        public Builder setAge(int i) {
            this.c = i;
            return this;
        }

        public Builder setAppIconResId(int i) {
            this.n = i;
            return this;
        }

        public Builder setAvgHr(int i) {
            this.g = i;
            return this;
        }

        public Builder setContext(Context context) {
            this.p = context;
            return this;
        }

        public Builder setDevicesource(int i) {
            this.k = i;
            return this;
        }

        public Builder setEcgData(List<Float> list) {
            this.h = list;
            return this;
        }

        public Builder setEcgLostData(List<EcgLostData> list) {
            this.m = list;
            return this;
        }

        public Builder setGender(int i) {
            this.b = i;
            return this;
        }

        public Builder setHeight(int i) {
            this.d = i;
            return this;
        }

        public Builder setOneself(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setRawDataLength(long j) {
            this.i = j;
            return this;
        }

        public Builder setTimeStamps(long j) {
            this.f = j;
            return this;
        }

        public Builder setWeight(int i) {
            this.e = i;
            return this;
        }
    }

    public EcgInfo(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.p = builder.p;
        this.l = builder.j;
        this.n = builder.l;
        this.m = builder.k;
        this.o = builder.m;
        this.q = builder.n;
        this.r = builder.o;
    }

    public int getAfib() {
        return this.n;
    }

    public String getAfibResult() {
        return this.r;
    }

    public int getAge() {
        return this.c;
    }

    public int getAppIconResId() {
        return this.q;
    }

    public int getAvgHr() {
        return this.g;
    }

    public Context getContext() {
        return this.p;
    }

    public int getDeviceSource() {
        return this.m;
    }

    public List<Float> getEcgData() {
        return this.j;
    }

    public List<EcgLostData> getEcgLostDataList() {
        return this.o;
    }

    public int getGender() {
        return this.b;
    }

    public int getHeight() {
        return this.d;
    }

    public String getName() {
        return this.a;
    }

    public long getRawDataLength() {
        return this.k;
    }

    public long getTimeStamps() {
        return this.f;
    }

    public int getWeight() {
        return this.e;
    }

    public boolean isOneself() {
        return this.l;
    }
}
