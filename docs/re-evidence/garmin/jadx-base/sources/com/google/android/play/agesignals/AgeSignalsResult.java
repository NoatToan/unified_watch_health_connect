package com.google.android.play.agesignals;

import android.os.Bundle;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AgeSignalsResult {

    public static abstract class Builder {
        public abstract AgeSignalsResult build();

        public abstract Builder setAgeLower(Integer num);

        public abstract Builder setAgeRangeSource(Integer num);

        public abstract Builder setAgeUpper(Integer num);

        public abstract Builder setInstallId(String str);

        public abstract Builder setSignificantChangeApprovalDate(Date date);

        public abstract Builder setSignificantChangeStatus(Integer num);
    }

    public static Builder builder() {
        return new zzq();
    }

    public static AgeSignalsResult zza(Bundle bundle) {
        Builder builder = builder();
        builder.setAgeRangeSource(zzb(bundle, "age.range.source"));
        builder.setAgeLower(zzb(bundle, "age.range.lower"));
        builder.setAgeUpper(zzb(bundle, "age.range.upper"));
        builder.setSignificantChangeApprovalDate(bundle.containsKey("significant.change.approval.date") ? new Date(bundle.getLong("significant.change.approval.date")) : null);
        builder.setSignificantChangeStatus(zzb(bundle, "significant.change.status"));
        builder.setInstallId(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return builder.build();
    }

    private static Integer zzb(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public abstract Integer ageLower();

    public abstract Integer ageRangeSource();

    public abstract Integer ageUpper();

    public abstract String installId();

    public abstract Date significantChangeApprovalDate();

    public abstract Integer significantChangeStatus();
}
