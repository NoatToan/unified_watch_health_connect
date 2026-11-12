package com.huami.moving.ui.sport.detail.segment.dialog;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class StrengthTrainEditOption implements Serializable {
    private int a;
    private int b;
    private int c;
    private int d;
    private StrengthTrainEditParams e;

    public static class Builder {
        private int b;
        private int d;
        private StrengthTrainEditParams e;
        private int a = 0;
        private int c = 0;

        public StrengthTrainEditOption build() {
            return new StrengthTrainEditOption(this);
        }

        public Builder editParams(StrengthTrainEditParams strengthTrainEditParams) {
            this.e = strengthTrainEditParams;
            return this;
        }

        public Builder maxCount(int i) {
            this.b = i;
            return this;
        }

        public Builder maxWeight(int i) {
            this.d = i;
            return this;
        }

        public Builder minCount(int i) {
            this.a = i;
            return this;
        }

        public Builder minWeight(int i) {
            this.c = i;
            return this;
        }
    }

    public StrengthTrainEditOption(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public StrengthTrainEditParams getEditParams() {
        return this.e;
    }

    public int getMaxCount() {
        return this.b;
    }

    public int getMaxWeight() {
        return this.d;
    }

    public int getMinCount() {
        return this.a;
    }

    public int getMinWeight() {
        return this.c;
    }
}
