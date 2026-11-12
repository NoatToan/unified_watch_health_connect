package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fitness.zzkn;
import com.google.android.gms.internal.fitness.zzko;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionCreator")
@SafeParcelable.Reserved({1000})
public class Session extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Session> CREATOR = new zzaf();

    @RecentlyNonNull
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";

    @RecentlyNonNull
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long b;

    @Nullable
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String c;

    @SafeParcelable.Field(getter = "getIdentifier", id = 4)
    private final String d;

    @SafeParcelable.Field(getter = "getDescription", id = 5)
    private final String e;

    @SafeParcelable.Field(getter = "getActivityType", id = 7)
    private final int f;

    @SafeParcelable.Field(getter = "getApplication", id = 8)
    private final zza g;

    @Nullable
    @SafeParcelable.Field(getter = "getActiveTimeMillis", id = 9)
    private final Long h;

    public static class Builder {
        private String d;

        @Nullable
        private Long g;
        private long a = 0;
        private long b = 0;

        @Nullable
        private String c = null;
        private String e = "";
        private int f = 4;

        @RecentlyNonNull
        public Session build() {
            boolean z = true;
            Preconditions.checkState(this.a > 0, "Start time should be specified.");
            long j = this.b;
            if (j != 0 && j <= this.a) {
                z = false;
            }
            Preconditions.checkState(z, "End time should be later than start time.");
            if (this.d == null) {
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                long j2 = this.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
                sb.append(str);
                sb.append(j2);
                this.d = sb.toString();
            }
            return new Session(this);
        }

        @RecentlyNonNull
        public Builder setActiveTime(long j, @RecentlyNonNull TimeUnit timeUnit) {
            this.g = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        @RecentlyNonNull
        public Builder setActivity(@RecentlyNonNull String str) {
            int iZzo = zzko.zzo(str);
            zzkn zzknVarZza = zzkn.zza(iZzo, zzkn.UNKNOWN);
            Preconditions.checkArgument(!(zzknVarZza.zzdz() && !zzknVarZza.equals(zzkn.SLEEP)), "Unsupported session activity type %s.", Integer.valueOf(iZzo));
            this.f = iZzo;
            return this;
        }

        @RecentlyNonNull
        public Builder setDescription(@RecentlyNonNull String str) {
            Preconditions.checkArgument(str.length() <= 1000, "Session description cannot exceed %d characters", 1000);
            this.e = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setEndTime(long j, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkState(j >= 0, "End time should be positive.");
            this.b = timeUnit.toMillis(j);
            return this;
        }

        @RecentlyNonNull
        public Builder setIdentifier(@RecentlyNonNull String str) {
            Preconditions.checkArgument(str != null && TextUtils.getTrimmedLength(str) > 0);
            this.d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setName(@RecentlyNonNull String str) {
            Preconditions.checkArgument(str.length() <= 100, "Session name cannot exceed %d characters", 100);
            this.c = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setStartTime(long j, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkState(j > 0, "Start time should be positive.");
            this.a = timeUnit.toMillis(j);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public Session(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @Nullable @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) zza zzaVar, @Nullable @SafeParcelable.Param(id = 9) Long l) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = zzaVar;
        this.h = l;
    }

    @RecentlyNullable
    public static Session extract(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Session) SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_SESSION, CREATOR);
    }

    @RecentlyNonNull
    public static String getMimeType(@RecentlyNonNull String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? MIME_TYPE_PREFIX.concat(strValueOf) : new String(MIME_TYPE_PREFIX);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.a == session.a && this.b == session.b && Objects.equal(this.c, session.c) && Objects.equal(this.d, session.d) && Objects.equal(this.e, session.e) && Objects.equal(this.g, session.g) && this.f == session.f;
    }

    public long getActiveTime(@RecentlyNonNull TimeUnit timeUnit) {
        Long l = this.h;
        if (l != null) {
            return timeUnit.convert(l.longValue(), TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Active time is not set");
    }

    @RecentlyNonNull
    public String getActivity() {
        return zzko.getName(this.f);
    }

    @RecentlyNullable
    public String getAppPackageName() {
        zza zzaVar = this.g;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.getPackageName();
    }

    @RecentlyNonNull
    public String getDescription() {
        return this.e;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    @RecentlyNonNull
    public String getIdentifier() {
        return this.d;
    }

    @RecentlyNullable
    public String getName() {
        return this.c;
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public boolean hasActiveTime() {
        return this.h != null;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), this.d);
    }

    public boolean isOngoing() {
        return this.b == 0;
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("startTime", Long.valueOf(this.a)).add("endTime", Long.valueOf(this.b)).add("name", this.c).add("identifier", this.d).add("description", this.e).add("activity", Integer.valueOf(this.f)).add(MimeTypes.BASE_TYPE_APPLICATION, this.g).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIdentifier(), false);
        SafeParcelWriter.writeString(parcel, 5, getDescription(), false);
        SafeParcelWriter.writeInt(parcel, 7, this.f);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeLongObject(parcel, 9, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private Session(Builder builder) {
        this(builder.a, builder.b, builder.c, builder.d, builder.e, builder.f, null, builder.g);
    }
}
