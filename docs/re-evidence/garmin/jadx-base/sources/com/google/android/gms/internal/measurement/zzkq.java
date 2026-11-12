package com.google.android.gms.internal.measurement;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public enum zzkq implements zzmj {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    private final int zzf;

    zzkq(int i14) {
        this.zzf = i14;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        h.s("Can't get the number of an unknown enum value.");
        return 0;
    }
}
