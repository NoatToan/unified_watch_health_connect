package com.xiaomi.hm.health.training.entity;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingListAdapterParams {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public static class Builder {
        private boolean a = true;
        private boolean b = true;
        private boolean c = false;
        private boolean d = false;

        public TrainingListAdapterParams build() {
            return new TrainingListAdapterParams(this);
        }

        public Builder setFullItem(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setJoinedList(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setMale(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setOnlyOneItem(boolean z) {
            this.d = z;
            return this;
        }
    }

    private TrainingListAdapterParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public boolean isFullItem() {
        return this.b;
    }

    public boolean isJoinedList() {
        return this.c;
    }

    public boolean isMale() {
        return this.a;
    }

    public boolean isOnlyOneItem() {
        return this.d;
    }

    public void setOnlyOneItem(boolean z) {
        this.d = z;
    }
}
