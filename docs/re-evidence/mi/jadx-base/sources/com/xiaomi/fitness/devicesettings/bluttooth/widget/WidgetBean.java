package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetBean;", "Landroid/os/Parcelable;", "subType", "", "style", "function", q.f13858b, "", DailyRecordKey.sportType, "<init>", "(IIILjava/lang/String;I)V", "getSubType", "()I", "getStyle", "getFunction", "getAppId", "()Ljava/lang/String;", "getSportType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WidgetBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WidgetBean> CREATOR = new Creator();

    @NotNull
    private final String appId;
    private final int function;
    private final int sportType;
    private final int style;
    private final int subType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WidgetBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetBean(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetBean[] newArray(int i) {
            return new WidgetBean[i];
        }
    }

    public WidgetBean(int i, int i2, int i3, @NotNull String appId, int i4) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.subType = i;
        this.style = i2;
        this.function = i3;
        this.appId = appId;
        this.sportType = i4;
    }

    public static /* synthetic */ WidgetBean copy$default(WidgetBean widgetBean, int i, int i2, int i3, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = widgetBean.subType;
        }
        if ((i5 & 2) != 0) {
            i2 = widgetBean.style;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = widgetBean.function;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = widgetBean.appId;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            i4 = widgetBean.sportType;
        }
        return widgetBean.copy(i, i6, i7, str2, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFunction() {
        return this.function;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final WidgetBean copy(int subType, int style, int function, @NotNull String appId, int sportType) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new WidgetBean(subType, style, function, appId, sportType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetBean)) {
            return false;
        }
        WidgetBean widgetBean = (WidgetBean) other;
        return this.subType == widgetBean.subType && this.style == widgetBean.style && this.function == widgetBean.function && Intrinsics.areEqual(this.appId, widgetBean.appId) && this.sportType == widgetBean.sportType;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public final int getFunction() {
        return this.function;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getStyle() {
        return this.style;
    }

    public final int getSubType() {
        return this.subType;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.subType) * 31) + Integer.hashCode(this.style)) * 31) + Integer.hashCode(this.function)) * 31) + this.appId.hashCode()) * 31) + Integer.hashCode(this.sportType);
    }

    @NotNull
    public String toString() {
        return "WidgetBean(subType=" + this.subType + ", style=" + this.style + ", function=" + this.function + ", appId=" + this.appId + ", sportType=" + this.sportType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.subType);
        dest.writeInt(this.style);
        dest.writeInt(this.function);
        dest.writeString(this.appId);
        dest.writeInt(this.sportType);
    }
}
