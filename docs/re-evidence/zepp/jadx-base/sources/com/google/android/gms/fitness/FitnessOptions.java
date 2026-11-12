package com.google.android.gms.fitness;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class FitnessOptions implements GoogleSignInOptionsExtension {
    public static final int ACCESS_READ = 0;
    public static final int ACCESS_WRITE = 1;
    private final Set<Scope> a;

    public static final class Builder {
        private final Set<Scope> a;

        private Builder() {
            this.a = new HashSet();
        }

        @RecentlyNonNull
        public final Builder accessActivitySessions(int i) {
            if (i == 0) {
                this.a.add(new Scope("https://www.googleapis.com/auth/fitness.activity.read"));
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
                }
                this.a.add(new Scope("https://www.googleapis.com/auth/fitness.activity.write"));
            }
            return this;
        }

        @RecentlyNonNull
        public final Builder accessSleepSessions(int i) {
            Preconditions.checkArgument(i == 0 || i == 1, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
            if (i == 0) {
                this.a.add(new Scope("https://www.googleapis.com/auth/fitness.sleep.read"));
            } else if (i == 1) {
                this.a.add(new Scope("https://www.googleapis.com/auth/fitness.sleep.write"));
            }
            return this;
        }

        @RecentlyNonNull
        public final Builder addDataType(@RecentlyNonNull DataType dataType) {
            return addDataType(dataType, 0);
        }

        @RecentlyNonNull
        public final FitnessOptions build() {
            return new FitnessOptions(this);
        }

        @RecentlyNonNull
        public final Builder addDataType(@RecentlyNonNull DataType dataType, int i) {
            Preconditions.checkArgument(i == 0 || i == 1, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
            String strZzk = dataType.zzk();
            String strZzl = dataType.zzl();
            if (i == 0 && strZzk != null) {
                this.a.add(new Scope(strZzk));
            } else if (i == 1 && strZzl != null) {
                this.a.add(new Scope(strZzl));
            }
            return this;
        }
    }

    private FitnessOptions(Builder builder) {
        this.a = builder.a;
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new Builder();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FitnessOptions) {
            return this.a.equals(((FitnessOptions) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final int getExtensionType() {
        return 3;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    @RecentlyNonNull
    public final List<Scope> getImpliedScopes() {
        return new ArrayList(this.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    @RecentlyNonNull
    public final Bundle toBundle() {
        return new Bundle();
    }
}
