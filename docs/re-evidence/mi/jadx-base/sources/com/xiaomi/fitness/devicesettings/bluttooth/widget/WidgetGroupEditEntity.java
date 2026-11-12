package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.devicesettings.utils.SportInfoUtil;
import com.xiaomi.onetrack.c.q;
import defpackage.kyo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106B\u0011\b\u0016\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b5\u00104B9\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b5\u00107J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0012R*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0012R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010\u0004\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupEditEntity;", "Landroid/os/Parcelable;", "", "isSportFunction", "()Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "style", "I", "getStyle", "setStyle", "(I)V", "function", "getFunction", "setFunction", "subType", "getSubType", "setSubType", "value", DailyRecordKey.sportType, "getSportType", "setSportType", "", "sportName", "Ljava/lang/String;", "getSportName", "()Ljava/lang/String;", "setSportName", "(Ljava/lang/String;)V", q.f13858b, "getAppId", "setAppId", "name", "getName", "setName", "isAdded", "Z", "setAdded", "(Z)V", "Lkyo;", "widgetItem", "Lkyo;", "getWidgetItem", "()Lkyo;", "setWidgetItem", "(Lkyo;)V", "<init>", "()V", "(IIILjava/lang/String;Ljava/lang/String;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetGroupEditEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WidgetGroupEditEntity> CREATOR = new Creator();

    @Nullable
    private String appId;
    private int function;
    private boolean isAdded;

    @Nullable
    private String name;

    @Nullable
    private String sportName;
    private int sportType;
    private int style;
    private int subType;

    @Nullable
    private kyo widgetItem;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WidgetGroupEditEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetGroupEditEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new WidgetGroupEditEntity();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetGroupEditEntity[] newArray(int i) {
            return new WidgetGroupEditEntity[i];
        }
    }

    public WidgetGroupEditEntity() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetGroupEditEntity(@NotNull kyo widgetItem) {
        Intrinsics.checkNotNullParameter(widgetItem, "widgetItem");
        int i = widgetItem.c;
        int i2 = widgetItem.d;
        int i3 = widgetItem.e;
        String appId = widgetItem.h;
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        String name = widgetItem.f;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        this(i, i2, i3, appId, name, widgetItem.g);
        this.widgetItem = widgetItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final int getFunction() {
        return this.function;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSportName() {
        return this.sportName;
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

    @Nullable
    public final kyo getWidgetItem() {
        return this.widgetItem;
    }

    /* JADX INFO: renamed from: isAdded, reason: from getter */
    public final boolean getIsAdded() {
        return this.isAdded;
    }

    public final boolean isSportFunction() {
        return this.function == 16;
    }

    public final void setAdded(boolean z) {
        this.isAdded = z;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setFunction(int i) {
        this.function = i;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSportName(@Nullable String str) {
        this.sportName = str;
    }

    public final void setSportType(int i) {
        this.sportType = i;
        this.sportName = SportInfoUtil.getName(i);
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setSubType(int i) {
        this.subType = i;
    }

    public final void setWidgetItem(@Nullable kyo kyoVar) {
        this.widgetItem = kyoVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetGroupEditEntity(int i, int i2, int i3, @NotNull String appId, @NotNull String name, int i4) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.style = i;
        this.function = i2;
        this.subType = i3;
        this.appId = appId;
        this.name = name;
        setSportType(i4);
    }
}
