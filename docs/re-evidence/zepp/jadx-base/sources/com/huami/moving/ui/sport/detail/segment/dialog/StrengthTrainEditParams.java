package com.huami.moving.ui.sport.detail.segment.dialog;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class StrengthTrainEditParams implements Serializable {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;

        public StrengthTrainEditParams build() {
            return new StrengthTrainEditParams(this);
        }

        public Builder currentCount(int i) {
            this.a = i;
            return this;
        }

        public Builder currentIndex(int i) {
            this.d = i;
            return this;
        }

        public Builder currentPosition(int i) {
            this.e = i;
            return this;
        }

        public Builder currentUnit(int i) {
            this.c = i;
            return this;
        }

        public Builder currentWeight(int i) {
            this.b = i;
            return this;
        }
    }

    public StrengthTrainEditParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public int getCurrentCount() {
        return this.a;
    }

    public int getCurrentIndex() {
        return this.d;
    }

    public int getCurrentPosition() {
        return this.e;
    }

    public int getCurrentUnit() {
        return this.c;
    }

    public int getCurrentWeight() {
        return this.b;
    }
}
