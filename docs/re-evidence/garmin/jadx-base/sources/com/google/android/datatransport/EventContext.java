package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class EventContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract EventContext build();

        public abstract Builder setExperimentIdsClear(byte[] bArr);

        public abstract Builder setExperimentIdsEncrypted(byte[] bArr);

        public abstract Builder setPseudonymousId(String str);
    }

    public static Builder builder() {
        return new AutoValue_EventContext.Builder();
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract String getPseudonymousId();
}
