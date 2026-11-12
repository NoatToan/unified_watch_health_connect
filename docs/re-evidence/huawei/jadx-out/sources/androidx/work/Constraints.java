package androidx.work;

import android.net.Uri;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.work.impl.utils.DurationApi26Impl;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.network.embedded.r3;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yzp;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B/\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bB9\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\nB]\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011B\u000f\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0002\u0010\u0013J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0097\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0017J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0005H\u0007J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020 H\u0017R\u0016\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/work/Constraints;", "", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresCharging", "", "requiresBatteryNotLow", "requiresStorageNotLow", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "contentTriggerUpdateDelayMillis", "", "contentTriggerMaxDelayMillis", "contentUriTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/Constraints;)V", "getContentTriggerMaxDelayMillis", "()J", "getContentTriggerUpdateDelayMillis", "getContentUriTriggers", "()Ljava/util/Set;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "equals", "hasContentUriTriggers", WatchFaceConstant.HASHCODE, "", "toString", "", "Builder", "Companion", "ContentUriTrigger", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Constraints {
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final Set<ContentUriTrigger> contentUriTriggers;
    private final NetworkType requiredNetworkType;
    private final boolean requiresBatteryNotLow;
    private final boolean requiresCharging;
    private final boolean requiresDeviceIdle;
    private final boolean requiresStorageNotLow;

    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, int i, zcm zcmVar) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3) {
        this(networkType, z, false, z2, z3);
        zcp.c(networkType, "");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, int i, zcm zcmVar) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(networkType, z, z2, z3, z4, -1L, 0L, null, PsExtractor.AUDIO_STREAM, null);
        zcp.c(networkType, "");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, zcm zcmVar) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? zaj.d() : set);
    }

    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<ContentUriTrigger> set) {
        zcp.c(networkType, "");
        zcp.c(set, "");
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public Constraints(Constraints constraints) {
        zcp.c(constraints, "");
        this.requiresCharging = constraints.requiresCharging;
        this.requiresDeviceIdle = constraints.requiresDeviceIdle;
        this.requiredNetworkType = constraints.requiredNetworkType;
        this.requiresBatteryNotLow = constraints.requiresBatteryNotLow;
        this.requiresStorageNotLow = constraints.requiresStorageNotLow;
        this.contentUriTriggers = constraints.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = constraints.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = constraints.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: requiresCharging, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: requiresDeviceIdle, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: requiresBatteryNotLow, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* JADX INFO: renamed from: requiresStorageNotLow, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !zcp.b(getClass(), other.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) other;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && this.requiredNetworkType == constraints.requiredNetworkType) {
            return zcp.b(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.requiredNetworkType.hashCode();
        boolean z = this.requiresCharging;
        boolean z2 = this.requiresDeviceIdle;
        boolean z3 = this.requiresBatteryNotLow;
        boolean z4 = this.requiresStorageNotLow;
        long j = this.contentTriggerUpdateDelayMillis;
        long j2 = this.contentTriggerMaxDelayMillis;
        return (((((((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.contentUriTriggers.hashCode();
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "()V", "constraints", "Landroidx/work/Constraints;", "(Landroidx/work/Constraints;)V", "contentUriTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresBatteryNotLow", "", "requiresCharging", "requiresDeviceIdle", "requiresStorageNotLow", "triggerContentMaxDelay", "", "triggerContentUpdateDelay", "addContentUriTrigger", "uri", "Landroid/net/Uri;", "triggerForDescendants", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setRequiredNetworkType", r3.y, "setRequiresBatteryNotLow", "setRequiresCharging", "setRequiresDeviceIdle", "setRequiresStorageNotLow", "setTriggerContentMaxDelay", "duration", "Ljava/time/Duration;", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "setTriggerContentUpdateDelay", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        public Builder(Constraints constraints) {
            zcp.c(constraints, "");
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.getRequiresCharging();
            this.requiresDeviceIdle = constraints.getRequiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.getRequiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.getRequiresStorageNotLow();
            this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
            this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
            this.contentUriTriggers = yzp.f(constraints.getContentUriTriggers());
        }

        public final Builder setRequiresCharging(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        public final Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        public final Builder setRequiredNetworkType(NetworkType networkType) {
            zcp.c(networkType, "");
            this.requiredNetworkType = networkType;
            return this;
        }

        public final Builder setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        public final Builder setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        public final Builder addContentUriTrigger(Uri uri, boolean triggerForDescendants) {
            zcp.c(uri, "");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, triggerForDescendants));
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(long duration, TimeUnit timeUnit) {
            zcp.c(timeUnit, "");
            this.triggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(Duration duration) {
            zcp.c(duration, "");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(long duration, TimeUnit timeUnit) {
            zcp.c(timeUnit, "");
            this.triggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(Duration duration) {
            zcp.c(duration, "");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final Constraints build() {
            Set setG = yzp.g(this.contentUriTriggers);
            long j = this.triggerContentUpdateDelay;
            long j2 = this.triggerContentMaxDelay;
            return new Constraints(this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j, j2, setG);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "uri", "Landroid/net/Uri;", "isTriggeredForDescendants", "", "(Landroid/net/Uri;Z)V", "()Z", "getUri", "()Landroid/net/Uri;", "equals", "other", WatchFaceConstant.HASHCODE, "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        public ContentUriTrigger(Uri uri, boolean z) {
            zcp.c(uri, "");
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: isTriggeredForDescendants, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            zcp.e(other, "");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) other;
            return zcp.b(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }
}
