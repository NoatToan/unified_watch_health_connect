package com.airbnb.lottie.compose;

import am.j;
import b71.i;
import com.airbnb.lottie.LottieComposition;
import hb.a;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "()V", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "Frame", "Marker", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LottieClipSpec {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "marker", "", "(Ljava/lang/String;)V", "getMarker", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Marker extends LottieClipSpec {
        public static final int $stable = 0;
        private final String marker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Marker(String str) {
            super(null);
            str.getClass();
            this.marker = str;
        }

        public static /* synthetic */ Marker copy$default(Marker marker, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = marker.marker;
            }
            return marker.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMarker() {
            return this.marker;
        }

        public final Marker copy(String marker) {
            marker.getClass();
            return new Marker(marker);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Marker) && s.g(this.marker, ((Marker) other).marker);
        }

        public final String getMarker() {
            return this.marker;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            if (marker == null) {
                return 1.0f;
            }
            return t.d((marker.startFrame + marker.durationFrames) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            return t.d((marker != null ? marker.startFrame : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        public String toString() {
            return j.m("Marker(marker=", this.marker, ")");
        }
    }

    public /* synthetic */ LottieClipSpec(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract float getMaxProgress$lottie_compose_release(LottieComposition composition);

    public abstract float getMinProgress$lottie_compose_release(LottieComposition composition);

    private LottieClipSpec() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "(FF)V", "getMax", "()F", "getMin", "component1", "component2", "copy", "equals", "", "other", "", "getMaxProgress", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Progress extends LottieClipSpec {
        public static final int $stable = 0;
        private final float max;
        private final float min;

        public /* synthetic */ Progress(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? 0.0f : f14, (i14 & 2) != 0 ? 1.0f : f15);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f14, float f15, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                f14 = progress.min;
            }
            if ((i14 & 2) != 0) {
                f15 = progress.max;
            }
            return progress.copy(f14, f15);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        public final Progress copy(float min, float max) {
            return new Progress(min, max);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.min, progress.min) == 0 && Float.compare(this.max, progress.max) == 0;
        }

        public final float getMax() {
            return this.max;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            return this.min;
        }

        public int hashCode() {
            return Float.hashCode(this.max) + (Float.hashCode(this.min) * 31);
        }

        public String toString() {
            return j.l("Progress(min=", this.min, ", max=", this.max, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Progress() {
            float f14 = 0.0f;
            this(f14, f14, 3, null);
        }

        public Progress(float f14, float f15) {
            super(null);
            this.min = f14;
            this.max = f15;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "maxInclusive", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMax", "()Ljava/lang/String;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", "copy", "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Markers extends LottieClipSpec {
        public static final int $stable = 0;
        private final String max;
        private final boolean maxInclusive;
        private final String min;

        public /* synthetic */ Markers(String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? true : z14);
        }

        public static /* synthetic */ Markers copy$default(Markers markers, String str, String str2, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = markers.min;
            }
            if ((i14 & 2) != 0) {
                str2 = markers.max;
            }
            if ((i14 & 4) != 0) {
                z14 = markers.maxInclusive;
            }
            return markers.copy(str, str2, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        public final Markers copy(String min, String max, boolean maxInclusive) {
            return new Markers(min, max, maxInclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Markers)) {
                return false;
            }
            Markers markers = (Markers) other;
            return s.g(this.min, markers.min) && s.g(this.max, markers.max) && this.maxInclusive == markers.maxInclusive;
        }

        public final String getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            String str = this.max;
            if (str == null) {
                return 1.0f;
            }
            int i14 = this.maxInclusive ? 0 : -1;
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            return t.d((marker != null ? marker.startFrame + i14 : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public final String getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            String str = this.min;
            if (str == null) {
                return 0.0f;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            return t.d((marker != null ? marker.startFrame : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            String str = this.min;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.max;
            return Boolean.hashCode(this.maxInclusive) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.min;
            String str2 = this.max;
            return a.k(b.i("Markers(min=", str, ", max=", str2, ", maxInclusive="), this.maxInclusive, ")");
        }

        public Markers() {
            this(null, null, false, 7, null);
        }

        public Markers(String str, String str2, boolean z14) {
            super(null);
            this.min = str;
            this.max = str2;
            this.maxInclusive = z14;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "maxInclusive", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "actualMaxFrame", "Ljava/lang/Integer;", "getMax", "()Ljava/lang/Integer;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "toString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Frame extends LottieClipSpec {
        public static final int $stable = 0;
        private final Integer actualMaxFrame;
        private final Integer max;
        private final boolean maxInclusive;
        private final Integer min;

        public Frame(Integer num, Integer num2, boolean z14) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z14;
            if (num2 == null) {
                num2 = null;
            } else if (!z14) {
                num2 = i.e(1, num2);
            }
            this.actualMaxFrame = num2;
        }

        public static /* synthetic */ Frame copy$default(Frame frame, Integer num, Integer num2, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                num = frame.min;
            }
            if ((i14 & 2) != 0) {
                num2 = frame.max;
            }
            if ((i14 & 4) != 0) {
                z14 = frame.maxInclusive;
            }
            return frame.copy(num, num2, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        public final Frame copy(Integer min, Integer max, boolean maxInclusive) {
            return new Frame(min, max, maxInclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return s.g(this.min, frame.min) && s.g(this.max, frame.max) && this.maxInclusive == frame.maxInclusive;
        }

        public final Integer getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            Integer num = this.actualMaxFrame;
            if (num == null) {
                return 1.0f;
            }
            return t.d(num.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public final Integer getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(LottieComposition composition) {
            composition.getClass();
            Integer num = this.min;
            if (num == null) {
                return 0.0f;
            }
            return t.d(num.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            Integer num = this.min;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return Boolean.hashCode(this.maxInclusive) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public String toString() {
            Integer num = this.min;
            Integer num2 = this.max;
            return a.k(com.airbnb.lottie.animation.keyframe.a.l(num, "Frame(min=", ", max=", ", maxInclusive=", num2), this.maxInclusive, ")");
        }

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? true : z14);
        }

        public Frame() {
            this(null, null, false, 7, null);
        }
    }
}
