package com.huawei.hms.ads;

/* JADX INFO: loaded from: classes10.dex */
public class VideoConfiguration {
    int autoPlayNetwork;
    boolean isMute;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12745a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12746b = true;

        private boolean a(int i) {
            return (i == 2 || i == 0 || i == 1) ? false : true;
        }

        public Builder setMute(boolean z) {
            this.f12746b = z;
            return this;
        }

        public Builder setAutoPlayNetwork(int i) {
            if (a(i)) {
                this.f12745a = -1;
                return this;
            }
            this.f12745a = i;
            return this;
        }

        public VideoConfiguration build() {
            return new VideoConfiguration(this);
        }
    }

    public boolean isMute() {
        return this.isMute;
    }

    public int getAutoPlayNetwork() {
        return this.autoPlayNetwork;
    }

    public VideoConfiguration(Builder builder) {
        this.autoPlayNetwork = 0;
        this.isMute = true;
        this.autoPlayNetwork = builder.f12745a;
        this.isMute = builder.f12746b;
    }

    public VideoConfiguration() {
        this.autoPlayNetwork = 0;
        this.isMute = true;
    }
}
