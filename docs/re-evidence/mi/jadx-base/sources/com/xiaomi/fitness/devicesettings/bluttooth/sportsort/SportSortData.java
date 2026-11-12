package com.xiaomi.fitness.devicesettings.bluttooth.sportsort;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortData;", "", "categoryName", "", DailyRecordKey.sportType, "name", "", "viewType", "isExpose", "", "isExpand", "<init>", "(IILjava/lang/String;IZZ)V", "getCategoryName", "()I", "setCategoryName", "(I)V", "getSportType", "setSportType", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getViewType", "setViewType", "()Z", "setExpose", "(Z)V", "setExpand", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSortData {
    private static int SPORT_SORT_ITEM;
    private int categoryName;
    private boolean isExpand;
    private boolean isExpose;

    @NotNull
    private String name;
    private int sportType;
    private int viewType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int SPORT_SORT_TYPE = 1;
    private static int SPORT_SORT_EXPOSE = 2;
    private static int SPORT_SORT_HIDE = 3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortData$Companion;", "", "<init>", "()V", "SPORT_SORT_ITEM", "", "getSPORT_SORT_ITEM", "()I", "setSPORT_SORT_ITEM", "(I)V", "SPORT_SORT_TYPE", "getSPORT_SORT_TYPE", "setSPORT_SORT_TYPE", "SPORT_SORT_EXPOSE", "getSPORT_SORT_EXPOSE", "setSPORT_SORT_EXPOSE", "SPORT_SORT_HIDE", "getSPORT_SORT_HIDE", "setSPORT_SORT_HIDE", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSPORT_SORT_EXPOSE() {
            return SportSortData.SPORT_SORT_EXPOSE;
        }

        public final int getSPORT_SORT_HIDE() {
            return SportSortData.SPORT_SORT_HIDE;
        }

        public final int getSPORT_SORT_ITEM() {
            return SportSortData.SPORT_SORT_ITEM;
        }

        public final int getSPORT_SORT_TYPE() {
            return SportSortData.SPORT_SORT_TYPE;
        }

        public final void setSPORT_SORT_EXPOSE(int i) {
            SportSortData.SPORT_SORT_EXPOSE = i;
        }

        public final void setSPORT_SORT_HIDE(int i) {
            SportSortData.SPORT_SORT_HIDE = i;
        }

        public final void setSPORT_SORT_ITEM(int i) {
            SportSortData.SPORT_SORT_ITEM = i;
        }

        public final void setSPORT_SORT_TYPE(int i) {
            SportSortData.SPORT_SORT_TYPE = i;
        }
    }

    public SportSortData(int i, int i2, @NotNull String name, int i3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.categoryName = i;
        this.sportType = i2;
        this.name = name;
        this.viewType = i3;
        this.isExpose = z;
        this.isExpand = z2;
    }

    public final int getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: isExpand, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    /* JADX INFO: renamed from: isExpose, reason: from getter */
    public final boolean getIsExpose() {
        return this.isExpose;
    }

    public final void setCategoryName(int i) {
        this.categoryName = i;
    }

    public final void setExpand(boolean z) {
        this.isExpand = z;
    }

    public final void setExpose(boolean z) {
        this.isExpose = z;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }
}
