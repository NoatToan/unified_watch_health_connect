package com.google.android.datatransport.runtime;

import am.j;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(byte[] bArr);

        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        String backendName = getBackendName();
        Priority priority = getPriority();
        String strEncodeToString = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        StringBuilder sb3 = new StringBuilder("TransportContext(");
        sb3.append(backendName);
        sb3.append(", ");
        sb3.append(priority);
        sb3.append(", ");
        return j.o(strEncodeToString, ")", sb3);
    }

    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
