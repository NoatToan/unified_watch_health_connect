package com.xiaomi.fitness.mine.v4;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineItemListModel;", "", "<init>", "()V", "MineItem", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineItemListModel {
    public static final int MINE_ITEM_TYPE_ABOUT = 11;
    public static final int MINE_ITEM_TYPE_APP_SETTING = 3;
    public static final int MINE_ITEM_TYPE_APP_VERSION_UPDATE = 10;
    public static final int MINE_ITEM_TYPE_COMPANY_EXCLUSIVE_ENTRANCE = 2;
    public static final int MINE_ITEM_TYPE_COURSE_VIP = 5;
    public static final int MINE_ITEM_TYPE_DEVICES_SHARE = 7;
    public static final int MINE_ITEM_TYPE_DEVICE_AUTHORIZATION = 6;
    public static final int MINE_ITEM_TYPE_HELP_FEEDBACK = 9;
    public static final int MINE_ITEM_TYPE_SYSTEM_PERMISSION = 8;
    public static final int MINE_ITEM_TYPE_THIRD_PERSONAL_DATA_MANAGER = 4;
    public static final int MINE_ITEM_TYPE_TRACK = 1;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "", "type", "", "title", "", "icon", "showMode", "", "remindText", "sunTitle", "rightText", "remindDotColor", "<init>", "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()I", "getTitle", "()Ljava/lang/String;", "getIcon", "getShowMode", "()Z", "getRemindText", "setRemindText", "(Ljava/lang/String;)V", "getSunTitle", "setSunTitle", "getRightText", "setRightText", "getRemindDotColor", "()Ljava/lang/Integer;", "setRemindDotColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "equals", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MineItem {
        private final int icon;

        @Nullable
        private Integer remindDotColor;

        @Nullable
        private String remindText;

        @Nullable
        private String rightText;
        private final boolean showMode;

        @Nullable
        private String sunTitle;

        @NotNull
        private final String title;
        private final int type;

        public MineItem(int i, @NotNull String title, int i2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = i;
            this.title = title;
            this.icon = i2;
            this.showMode = z;
            this.remindText = str;
            this.sunTitle = str2;
            this.rightText = str3;
            this.remindDotColor = num;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowMode() {
            return this.showMode;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRemindText() {
            return this.remindText;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSunTitle() {
            return this.sunTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRightText() {
            return this.rightText;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getRemindDotColor() {
            return this.remindDotColor;
        }

        @NotNull
        public final MineItem copy(int type, @NotNull String title, int icon, boolean showMode, @Nullable String remindText, @Nullable String sunTitle, @Nullable String rightText, @Nullable Integer remindDotColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new MineItem(type, title, icon, showMode, remindText, sunTitle, rightText, remindDotColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MineItem)) {
                return false;
            }
            MineItem mineItem = (MineItem) other;
            return this.type == mineItem.type && Intrinsics.areEqual(this.title, mineItem.title) && this.icon == mineItem.icon && this.showMode == mineItem.showMode && Intrinsics.areEqual(this.remindText, mineItem.remindText) && Intrinsics.areEqual(this.sunTitle, mineItem.sunTitle) && Intrinsics.areEqual(this.rightText, mineItem.rightText) && Intrinsics.areEqual(this.remindDotColor, mineItem.remindDotColor);
        }

        public final int getIcon() {
            return this.icon;
        }

        @Nullable
        public final Integer getRemindDotColor() {
            return this.remindDotColor;
        }

        @Nullable
        public final String getRemindText() {
            return this.remindText;
        }

        @Nullable
        public final String getRightText() {
            return this.rightText;
        }

        public final boolean getShowMode() {
            return this.showMode;
        }

        @Nullable
        public final String getSunTitle() {
            return this.sunTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.type) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Boolean.hashCode(this.showMode)) * 31;
            String str = this.remindText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sunTitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.rightText;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.remindDotColor;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final void setRemindDotColor(@Nullable Integer num) {
            this.remindDotColor = num;
        }

        public final void setRemindText(@Nullable String str) {
            this.remindText = str;
        }

        public final void setRightText(@Nullable String str) {
            this.rightText = str;
        }

        public final void setSunTitle(@Nullable String str) {
            this.sunTitle = str;
        }

        @NotNull
        public String toString() {
            return "MineItem(type=" + this.type + ", title=" + this.title + ", icon=" + this.icon + ", showMode=" + this.showMode + ", remindText=" + this.remindText + ", sunTitle=" + this.sunTitle + ", rightText=" + this.rightText + ", remindDotColor=" + this.remindDotColor + ")";
        }

        public /* synthetic */ MineItem(int i, String str, int i2, boolean z, String str2, String str3, String str4, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : num);
        }
    }
}
