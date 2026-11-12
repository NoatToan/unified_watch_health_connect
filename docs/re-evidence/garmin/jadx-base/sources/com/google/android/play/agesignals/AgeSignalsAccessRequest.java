package com.google.android.play.agesignals;

import android.app.Activity;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AgeSignalsAccessRequest {

    public static abstract class Builder {
        public abstract AgeSignalsAccessRequest build();

        public abstract Builder setActivity(Activity activity);
    }

    public static Builder builder() {
        return new zzk();
    }

    public abstract Activity activity();
}
