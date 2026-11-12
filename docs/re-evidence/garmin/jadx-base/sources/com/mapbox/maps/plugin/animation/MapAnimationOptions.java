package com.mapbox.maps.plugin.animation;

import android.animation.TimeInterpolator;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B/\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "", "owner", "", "duration", "", "startDelay", "interpolator", "Landroid/animation/TimeInterpolator;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Landroid/animation/TimeInterpolator;)V", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "getOwner", "()Ljava/lang/String;", "getStartDelay", "equals", "", "other", "hashCode", "", "Builder", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapAnimationOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long duration;
    private final TimeInterpolator interpolator;
    private final String owner;
    private final Long startDelay;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/animation/MapAnimationOptions$Builder;", "", "()V", "duration", "", "Ljava/lang/Long;", "interpolator", "Landroid/animation/TimeInterpolator;", "owner", "", "startDelay", "build", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Long duration;
        private TimeInterpolator interpolator;
        private String owner;
        private Long startDelay;

        public final MapAnimationOptions build() {
            return new MapAnimationOptions(this.owner, this.duration, this.startDelay, this.interpolator, null);
        }

        public final Builder duration(long duration) {
            this.duration = Long.valueOf(duration);
            return this;
        }

        public final Builder interpolator(TimeInterpolator interpolator) {
            interpolator.getClass();
            this.interpolator = interpolator;
            return this;
        }

        public final Builder owner(String owner) {
            owner.getClass();
            this.owner = owner;
            return this;
        }

        public final Builder startDelay(long startDelay) {
            this.startDelay = Long.valueOf(startDelay);
            return this;
        }
    }

    private MapAnimationOptions(String str, Long l14, Long l15, TimeInterpolator timeInterpolator) {
        this.owner = str;
        this.duration = l14;
        this.startDelay = l15;
        this.interpolator = timeInterpolator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MapAnimationOptions.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MapAnimationOptions mapAnimationOptions = (MapAnimationOptions) other;
        return s.g(this.owner, mapAnimationOptions.owner) && s.g(this.duration, mapAnimationOptions.duration) && s.g(this.startDelay, mapAnimationOptions.startDelay) && s.g(this.interpolator, mapAnimationOptions.interpolator);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final Long getStartDelay() {
        return this.startDelay;
    }

    public int hashCode() {
        String str = this.owner;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l14 = this.duration;
        int iHashCode2 = (iHashCode + (l14 != null ? l14.hashCode() : 0)) * 31;
        Long l15 = this.startDelay;
        int iHashCode3 = (iHashCode2 + (l15 != null ? l15.hashCode() : 0)) * 31;
        TimeInterpolator timeInterpolator = this.interpolator;
        return iHashCode3 + (timeInterpolator != null ? timeInterpolator.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/animation/MapAnimationOptions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions$Builder;", "", "block", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "mapAnimationOptions", "(Le23/l;)Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final MapAnimationOptions mapAnimationOptions(l<? super Builder, Unit> block) {
            block.getClass();
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MapAnimationOptions(String str, Long l14, Long l15, TimeInterpolator timeInterpolator, j jVar) {
        this(str, l14, l15, timeInterpolator);
    }
}
