package com.mapbox.maps.plugin.animation;

import e23.l;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0016\u0017B/\b\u0002\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "T", "", "targets", "", "startValue", "owner", "", "([Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getOwner", "()Ljava/lang/String;", "getStartValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargets", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "Builder", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimatorOptions<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String owner;
    private final T startValue;
    private final T[] targets;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0004\"\u00028\u0001¢\u0006\u0002\u0010\u0005J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", "T", "", "targets", "", "([Ljava/lang/Object;)V", "owner", "", "startValue", "Ljava/lang/Object;", "getTargets", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "build", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "(Ljava/lang/Object;)Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder<T> {
        private String owner;
        private T startValue;
        private final T[] targets;

        public Builder(T... tArr) {
            tArr.getClass();
            this.targets = tArr;
        }

        public final CameraAnimatorOptions<T> build() {
            T[] tArr = this.targets;
            return new CameraAnimatorOptions<>(Arrays.copyOf(tArr, tArr.length), this.startValue, this.owner, null);
        }

        public final T[] getTargets() {
            return this.targets;
        }

        public final Builder<T> owner(String owner) {
            owner.getClass();
            this.owner = owner;
            return this;
        }

        public final Builder<T> startValue(T startValue) {
            this.startValue = startValue;
            return this;
        }
    }

    private CameraAnimatorOptions(T[] tArr, T t7, String str) {
        this.targets = tArr;
        this.startValue = t7;
        this.owner = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !CameraAnimatorOptions.class.equals(other.getClass())) {
            return false;
        }
        CameraAnimatorOptions cameraAnimatorOptions = (CameraAnimatorOptions) other;
        return s.g(cameraAnimatorOptions.owner, this.owner) && Arrays.equals(cameraAnimatorOptions.targets, this.targets) && s.g(cameraAnimatorOptions.startValue, this.startValue);
    }

    public final String getOwner() {
        return this.owner;
    }

    public final T getStartValue() {
        return this.startValue;
    }

    public final T[] getTargets() {
        return this.targets;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.targets) * 31;
        String str = this.owner;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        T t7 = this.startValue;
        return iHashCode2 + (t7 != null ? t7.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u00028\u00012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Companion;", "", "<init>", "()V", "T", "", "targets", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions$Builder;", "", "block", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "cameraAnimatorOptions", "([Ljava/lang/Object;Le23/l;)Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ CameraAnimatorOptions cameraAnimatorOptions$default(Companion companion, Object[] objArr, l lVar, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                lVar = CameraAnimatorOptions$Companion$cameraAnimatorOptions$1.INSTANCE;
            }
            objArr.getClass();
            lVar.getClass();
            Builder builder = new Builder(Arrays.copyOf(objArr, objArr.length));
            lVar.invoke(builder);
            return builder.build();
        }

        public final <T> CameraAnimatorOptions<T> cameraAnimatorOptions(T[] targets, l<? super Builder<T>, Unit> block) {
            targets.getClass();
            block.getClass();
            Builder builder = new Builder(Arrays.copyOf(targets, targets.length));
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CameraAnimatorOptions(Object[] objArr, Object obj, String str, j jVar) {
        this(objArr, obj, str);
    }
}
