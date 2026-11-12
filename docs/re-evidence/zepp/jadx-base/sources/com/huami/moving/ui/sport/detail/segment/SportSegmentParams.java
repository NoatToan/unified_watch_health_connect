package com.huami.moving.ui.sport.detail.segment;

/* JADX INFO: loaded from: classes4.dex */
public class SportSegmentParams {
    private long a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;

    public static class Builder {
        private long a = -1;
        private int b = -1;
        private int c = -1;
        private int d = 0;
        private boolean e = false;
        private boolean f = false;
        private boolean g = false;

        public SportSegmentParams build() {
            return new SportSegmentParams(this);
        }

        public Builder deviceSource(int i) {
            this.b = i;
            return this;
        }

        public Builder isEdit(boolean z) {
            this.f = z;
            return this;
        }

        public Builder isMetric(boolean z) {
            this.e = z;
            return this;
        }

        public Builder showEditBox(boolean z) {
            this.g = z;
            return this;
        }

        public Builder sportMode(int i) {
            this.d = i;
            return this;
        }

        public Builder sportType(int i) {
            this.c = i;
            return this;
        }

        public Builder trackId(long j) {
            this.a = j;
            return this;
        }
    }

    public SportSegmentParams(Builder builder) {
        this.a = -1L;
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
    }

    public int getDeviceSource() {
        return this.b;
    }

    public int getSportMode() {
        return this.d;
    }

    public int getSportType() {
        return this.c;
    }

    public long getTrackId() {
        return this.a;
    }

    public boolean isEdit() {
        return this.f;
    }

    public boolean isMetric() {
        return this.e;
    }

    public boolean isShowEditBox() {
        return this.g;
    }
}
