package com.google.android.play.agesignals;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AgeSignalsAccessResult {

    public static abstract class Builder {
        public abstract AgeSignalsAccessResult build();

        public abstract Builder setAgeSignalsStatus(Integer num);
    }

    public static Builder builder() {
        return new zzn();
    }

    public abstract Integer ageSignalsStatus();
}
