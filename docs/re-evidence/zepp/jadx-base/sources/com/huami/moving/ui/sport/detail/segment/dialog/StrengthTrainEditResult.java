package com.huami.moving.ui.sport.detail.segment.dialog;

/* JADX INFO: loaded from: classes4.dex */
public class StrengthTrainEditResult {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;

    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private String i;

        public StrengthTrainEditResult build() {
            return new StrengthTrainEditResult(this);
        }

        public Builder createBuilder(StrengthTrainEditResult strengthTrainEditResult) {
            Builder builder = new Builder();
            builder.g = strengthTrainEditResult.getIndex();
            builder.a = strengthTrainEditResult.getResultCount();
            builder.b = strengthTrainEditResult.getOldCount();
            builder.c = strengthTrainEditResult.getResultWeight();
            builder.d = strengthTrainEditResult.getOldWeight();
            builder.e = strengthTrainEditResult.getResultCount();
            builder.f = strengthTrainEditResult.getOldUnit();
            builder.h = strengthTrainEditResult.getCurrentPosition();
            builder.i = strengthTrainEditResult.getOldLap();
            return builder;
        }

        public Builder currentPosition(int i) {
            this.h = i;
            return this;
        }

        public Builder index(int i) {
            this.g = i;
            return this;
        }

        public Builder oldCount(int i) {
            this.b = i;
            return this;
        }

        public Builder oldLap(String str) {
            this.i = str;
            return this;
        }

        public Builder oldUnit(int i) {
            this.f = i;
            return this;
        }

        public Builder oldWeight(int i) {
            this.d = i;
            return this;
        }

        public Builder resultCount(int i) {
            this.a = i;
            return this;
        }

        public Builder resultUnit(int i) {
            this.e = i;
            return this;
        }

        public Builder resultWeight(int i) {
            this.c = i;
            return this;
        }
    }

    public StrengthTrainEditResult(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public int getCurrentPosition() {
        return this.h;
    }

    public int getIndex() {
        return this.g;
    }

    public int getOldCount() {
        return this.b;
    }

    public String getOldLap() {
        return this.i;
    }

    public int getOldUnit() {
        return this.f;
    }

    public int getOldWeight() {
        return this.d;
    }

    public int getResultCount() {
        return this.a;
    }

    public int getResultUnit() {
        return this.e;
    }

    public int getResultWeight() {
        return this.c;
    }
}
