package com.huami.devicestylepower;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle;", "", "<init>", "()V", "Bracelet", "Chopin", "Circle", "Haydn", "Mozart", "Shoes", "Square", SportAnalytics.ParamValue.SportType.TREADMILL, "Venice", "Weight", "Lcom/huami/devicestylepower/DeviceStyle$Square;", "Lcom/huami/devicestylepower/DeviceStyle$Circle;", "Lcom/huami/devicestylepower/DeviceStyle$Bracelet;", "Lcom/huami/devicestylepower/DeviceStyle$Venice;", "Lcom/huami/devicestylepower/DeviceStyle$Weight;", "Lcom/huami/devicestylepower/DeviceStyle$Chopin;", "Lcom/huami/devicestylepower/DeviceStyle$Mozart;", "Lcom/huami/devicestylepower/DeviceStyle$Haydn;", "Lcom/huami/devicestylepower/DeviceStyle$Treadmill;", "Lcom/huami/devicestylepower/DeviceStyle$Shoes;", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
public abstract class DeviceStyle {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Bracelet;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "electricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getElectricityRatio", "()I", "<init>", "(I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Bracelet extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int electricityRatio;

        public Bracelet(int i) {
            super(null);
            this.electricityRatio = i;
        }

        public static /* synthetic */ Bracelet copy$default(Bracelet bracelet, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bracelet.electricityRatio;
            }
            return bracelet.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        @NotNull
        public final Bracelet copy(int electricityRatio) {
            return new Bracelet(electricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bracelet) && this.electricityRatio == ((Bracelet) other).electricityRatio;
        }

        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        public int hashCode() {
            return this.electricityRatio;
        }

        @NotNull
        public String toString() {
            return "Bracelet(electricityRatio=" + this.electricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Chopin;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "component2", "leftElectricityRatio", "rightElectricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getLeftElectricityRatio", "()I", "b", "getRightElectricityRatio", "<init>", "(II)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Chopin extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int leftElectricityRatio;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int rightElectricityRatio;

        public Chopin(int i, int i2) {
            super(null);
            this.leftElectricityRatio = i;
            this.rightElectricityRatio = i2;
        }

        public static /* synthetic */ Chopin copy$default(Chopin chopin, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = chopin.leftElectricityRatio;
            }
            if ((i3 & 2) != 0) {
                i2 = chopin.rightElectricityRatio;
            }
            return chopin.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        @NotNull
        public final Chopin copy(int leftElectricityRatio, int rightElectricityRatio) {
            return new Chopin(leftElectricityRatio, rightElectricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chopin)) {
                return false;
            }
            Chopin chopin = (Chopin) other;
            return this.leftElectricityRatio == chopin.leftElectricityRatio && this.rightElectricityRatio == chopin.rightElectricityRatio;
        }

        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        public int hashCode() {
            return (this.leftElectricityRatio * 31) + this.rightElectricityRatio;
        }

        @NotNull
        public String toString() {
            return "Chopin(leftElectricityRatio=" + this.leftElectricityRatio + ", rightElectricityRatio=" + this.rightElectricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Circle;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "electricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getElectricityRatio", "()I", "<init>", "(I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Circle extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int electricityRatio;

        public Circle(int i) {
            super(null);
            this.electricityRatio = i;
        }

        public static /* synthetic */ Circle copy$default(Circle circle, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = circle.electricityRatio;
            }
            return circle.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        @NotNull
        public final Circle copy(int electricityRatio) {
            return new Circle(electricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Circle) && this.electricityRatio == ((Circle) other).electricityRatio;
        }

        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        public int hashCode() {
            return this.electricityRatio;
        }

        @NotNull
        public String toString() {
            return "Circle(electricityRatio=" + this.electricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Haydn;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "component2", "component3", "leftElectricityRatio", "rightElectricityRatio", "boxElectricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getLeftElectricityRatio", "()I", "b", "getRightElectricityRatio", "c", "getBoxElectricityRatio", "<init>", "(III)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Haydn extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int leftElectricityRatio;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int rightElectricityRatio;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int boxElectricityRatio;

        public Haydn(int i, int i2, int i3) {
            super(null);
            this.leftElectricityRatio = i;
            this.rightElectricityRatio = i2;
            this.boxElectricityRatio = i3;
        }

        public static /* synthetic */ Haydn copy$default(Haydn haydn, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = haydn.leftElectricityRatio;
            }
            if ((i4 & 2) != 0) {
                i2 = haydn.rightElectricityRatio;
            }
            if ((i4 & 4) != 0) {
                i3 = haydn.boxElectricityRatio;
            }
            return haydn.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBoxElectricityRatio() {
            return this.boxElectricityRatio;
        }

        @NotNull
        public final Haydn copy(int leftElectricityRatio, int rightElectricityRatio, int boxElectricityRatio) {
            return new Haydn(leftElectricityRatio, rightElectricityRatio, boxElectricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Haydn)) {
                return false;
            }
            Haydn haydn = (Haydn) other;
            return this.leftElectricityRatio == haydn.leftElectricityRatio && this.rightElectricityRatio == haydn.rightElectricityRatio && this.boxElectricityRatio == haydn.boxElectricityRatio;
        }

        public final int getBoxElectricityRatio() {
            return this.boxElectricityRatio;
        }

        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        public int hashCode() {
            return (((this.leftElectricityRatio * 31) + this.rightElectricityRatio) * 31) + this.boxElectricityRatio;
        }

        @NotNull
        public String toString() {
            return "Haydn(leftElectricityRatio=" + this.leftElectricityRatio + ", rightElectricityRatio=" + this.rightElectricityRatio + ", boxElectricityRatio=" + this.boxElectricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Mozart;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "component2", "component3", "leftElectricityRatio", "rightElectricityRatio", "boxElectricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getLeftElectricityRatio", "()I", "b", "getRightElectricityRatio", "c", "getBoxElectricityRatio", "<init>", "(III)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Mozart extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int leftElectricityRatio;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int rightElectricityRatio;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int boxElectricityRatio;

        public Mozart(int i, int i2, int i3) {
            super(null);
            this.leftElectricityRatio = i;
            this.rightElectricityRatio = i2;
            this.boxElectricityRatio = i3;
        }

        public static /* synthetic */ Mozart copy$default(Mozart mozart, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = mozart.leftElectricityRatio;
            }
            if ((i4 & 2) != 0) {
                i2 = mozart.rightElectricityRatio;
            }
            if ((i4 & 4) != 0) {
                i3 = mozart.boxElectricityRatio;
            }
            return mozart.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBoxElectricityRatio() {
            return this.boxElectricityRatio;
        }

        @NotNull
        public final Mozart copy(int leftElectricityRatio, int rightElectricityRatio, int boxElectricityRatio) {
            return new Mozart(leftElectricityRatio, rightElectricityRatio, boxElectricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mozart)) {
                return false;
            }
            Mozart mozart = (Mozart) other;
            return this.leftElectricityRatio == mozart.leftElectricityRatio && this.rightElectricityRatio == mozart.rightElectricityRatio && this.boxElectricityRatio == mozart.boxElectricityRatio;
        }

        public final int getBoxElectricityRatio() {
            return this.boxElectricityRatio;
        }

        public final int getLeftElectricityRatio() {
            return this.leftElectricityRatio;
        }

        public final int getRightElectricityRatio() {
            return this.rightElectricityRatio;
        }

        public int hashCode() {
            return (((this.leftElectricityRatio * 31) + this.rightElectricityRatio) * 31) + this.boxElectricityRatio;
        }

        @NotNull
        public String toString() {
            return "Mozart(leftElectricityRatio=" + this.leftElectricityRatio + ", rightElectricityRatio=" + this.rightElectricityRatio + ", boxElectricityRatio=" + this.boxElectricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Shoes;", "Lcom/huami/devicestylepower/DeviceStyle;", "<init>", "()V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shoes extends DeviceStyle {

        @NotNull
        public static final Shoes INSTANCE = new Shoes();

        private Shoes() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Square;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "electricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getElectricityRatio", "()I", "<init>", "(I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Square extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int electricityRatio;

        public Square(int i) {
            super(null);
            this.electricityRatio = i;
        }

        public static /* synthetic */ Square copy$default(Square square, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = square.electricityRatio;
            }
            return square.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        @NotNull
        public final Square copy(int electricityRatio) {
            return new Square(electricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Square) && this.electricityRatio == ((Square) other).electricityRatio;
        }

        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        public int hashCode() {
            return this.electricityRatio;
        }

        @NotNull
        public String toString() {
            return "Square(electricityRatio=" + this.electricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Treadmill;", "Lcom/huami/devicestylepower/DeviceStyle;", "<init>", "()V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final class Treadmill extends DeviceStyle {

        @NotNull
        public static final Treadmill INSTANCE = new Treadmill();

        private Treadmill() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Venice;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "electricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getElectricityRatio", "()I", "<init>", "(I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Venice extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int electricityRatio;

        public Venice(int i) {
            super(null);
            this.electricityRatio = i;
        }

        public static /* synthetic */ Venice copy$default(Venice venice, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = venice.electricityRatio;
            }
            return venice.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        @NotNull
        public final Venice copy(int electricityRatio) {
            return new Venice(electricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Venice) && this.electricityRatio == ((Venice) other).electricityRatio;
        }

        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        public int hashCode() {
            return this.electricityRatio;
        }

        @NotNull
        public String toString() {
            return "Venice(electricityRatio=" + this.electricityRatio + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle$Weight;", "Lcom/huami/devicestylepower/DeviceStyle;", "", "component1", "electricityRatio", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getElectricityRatio", "()I", "<init>", "(I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Weight extends DeviceStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int electricityRatio;

        public Weight(int i) {
            super(null);
            this.electricityRatio = i;
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = weight.electricityRatio;
            }
            return weight.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        @NotNull
        public final Weight copy(int electricityRatio) {
            return new Weight(electricityRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Weight) && this.electricityRatio == ((Weight) other).electricityRatio;
        }

        public final int getElectricityRatio() {
            return this.electricityRatio;
        }

        public int hashCode() {
            return this.electricityRatio;
        }

        @NotNull
        public String toString() {
            return "Weight(electricityRatio=" + this.electricityRatio + ')';
        }
    }

    private DeviceStyle() {
    }

    public /* synthetic */ DeviceStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
