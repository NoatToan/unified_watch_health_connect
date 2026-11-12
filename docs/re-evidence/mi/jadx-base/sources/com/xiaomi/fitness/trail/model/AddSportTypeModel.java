package com.xiaomi.fitness.trail.model;

import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/trail/model/AddSportTypeModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "DetailItem", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddSportTypeModel extends BaseModel {
    public static final int ADD_TRAIL_CONSUME = 4;
    public static final int ADD_TRAIL_DISTANCE = 3;
    public static final int ADD_TRAIL_DURATION = 1;
    public static final int ADD_TRAIL_INTENSITY = 7;
    public static final int ADD_TRAIL_POSTURE = 6;
    public static final int ADD_TRAIL_START_TIME = 2;
    public static final int ADD_TRAIL_STEP = 5;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "", "itemType", "", "name", "", "unit", "value", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getItemType", "()I", "getName", "()Ljava/lang/String;", "getUnit", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailItem {
        private final int itemType;

        @NotNull
        private final String name;

        @NotNull
        private final String unit;

        @Nullable
        private Integer value;

        public DetailItem(int i, @NotNull String name, @NotNull String unit, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.itemType = i;
            this.name = name;
            this.unit = unit;
            this.value = num;
        }

        public static /* synthetic */ DetailItem copy$default(DetailItem detailItem, int i, String str, String str2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = detailItem.itemType;
            }
            if ((i2 & 2) != 0) {
                str = detailItem.name;
            }
            if ((i2 & 4) != 0) {
                str2 = detailItem.unit;
            }
            if ((i2 & 8) != 0) {
                num = detailItem.value;
            }
            return detailItem.copy(i, str, str2, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getItemType() {
            return this.itemType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        @NotNull
        public final DetailItem copy(int itemType, @NotNull String name, @NotNull String unit, @Nullable Integer value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new DetailItem(itemType, name, unit, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailItem)) {
                return false;
            }
            DetailItem detailItem = (DetailItem) other;
            return this.itemType == detailItem.itemType && Intrinsics.areEqual(this.name, detailItem.name) && Intrinsics.areEqual(this.unit, detailItem.unit) && Intrinsics.areEqual(this.value, detailItem.value);
        }

        public final int getItemType() {
            return this.itemType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.itemType) * 31) + this.name.hashCode()) * 31) + this.unit.hashCode()) * 31;
            Integer num = this.value;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final void setValue(@Nullable Integer num) {
            this.value = num;
        }

        @NotNull
        public String toString() {
            return "DetailItem(itemType=" + this.itemType + ", name=" + this.name + ", unit=" + this.unit + ", value=" + this.value + ")";
        }

        public /* synthetic */ DetailItem(int i, String str, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? null : num);
        }
    }
}
