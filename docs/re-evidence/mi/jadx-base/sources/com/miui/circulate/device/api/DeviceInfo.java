package com.miui.circulate.device.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.transport.layerl1.TransportL1;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ^2\u00020\u0001:\u0002]^B«\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0017J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J»\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0001J\b\u0010O\u001a\u00020\u000bH\u0016J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020\u000bHÖ\u0001J\u0006\u0010U\u001a\u00020QJ\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0018\u0010[\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u000bH\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010%R\u0017\u0010\u0015\u001a\u00020\u0013¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u0017\u0010\u0014\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u001bR\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0019\u001a\u0004\b7\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u0019\u001a\u0004\b9\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u0019\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u0013¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u0019\u001a\u0004\b=\u0010.¨\u0006_"}, d2 = {"Lcom/miui/circulate/device/api/DeviceInfo;", "Landroid/os/Parcelable;", "id", "", "category", "deviceType", "title", Column.SUBTITLE, "icon", "Lcom/miui/circulate/device/api/Icon;", "state", "", Column.ACCOUNT_ID, "mac", Column.BATTERY, "Lcom/miui/circulate/device/api/BatteryInfo;", "ssid", Column.PRIVATE_DATA, "updateTime", "", "priority", Column.PIN_TIME, Column.PIN_ICON, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/miui/circulate/device/api/Icon;ILjava/lang/String;Ljava/lang/String;Lcom/miui/circulate/device/api/BatteryInfo;Ljava/lang/String;Ljava/lang/String;JIJLcom/miui/circulate/device/api/Icon;)V", "getAccountId$annotations", "()V", "getAccountId", "()Ljava/lang/String;", "getBattery$annotations", "getBattery", "()Lcom/miui/circulate/device/api/BatteryInfo;", "getCategory$annotations", "getCategory", "getDeviceType$annotations", "getDeviceType", "getIcon$annotations", "getIcon", "()Lcom/miui/circulate/device/api/Icon;", "getId$annotations", "getId", "getMac$annotations", "getMac", "getPinIcon$annotations", "getPinIcon", "getPinTime$annotations", "getPinTime", "()J", "getPriority$annotations", "getPriority", "()I", "getPrivateData$annotations", "getPrivateData", "getSsid$annotations", "getSsid", "getState$annotations", "getState", "getSubtitle$annotations", "getSubtitle", "getTitle$annotations", "getTitle", "getUpdateTime$annotations", "getUpdateTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "isPin", "toString", "writePropertyToParcel", "", "parcel", "Landroid/os/Parcel;", "writeToParcel", "flags", "Builder", "CREATOR", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DeviceInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String accountId;

    @Nullable
    private final BatteryInfo battery;

    @NotNull
    private final String category;

    @NotNull
    private final String deviceType;

    @Nullable
    private final Icon icon;

    @NotNull
    private final String id;

    @Nullable
    private final String mac;

    @Nullable
    private final Icon pinIcon;
    private final long pinTime;
    private final int priority;

    @Nullable
    private final String privateData;

    @Nullable
    private final String ssid;
    private final int state;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;
    private final long updateTime;

    /* JADX INFO: renamed from: com.miui.circulate.device.api.DeviceInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Lcom/miui/circulate/device/api/DeviceInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/miui/circulate/device/api/DeviceInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/miui/circulate/device/api/DeviceInfo;", "readPropertyFromParcel", "version", "Versions", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<DeviceInfo> {

        /* JADX INFO: renamed from: com.miui.circulate.device.api.DeviceInfo$CREATOR$Versions */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/miui/circulate/device/api/DeviceInfo$CREATOR$Versions;", "", "()V", "V1", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Versions {

            @NotNull
            public static final Versions INSTANCE = new Versions();
            public static final int V1 = 1;

            private Versions() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DeviceInfo readPropertyFromParcel(Parcel parcel, int version) {
            String string = parcel.readString();
            Intrinsics.checkNotNull(string);
            String string2 = parcel.readString();
            Intrinsics.checkNotNull(string2);
            String string3 = parcel.readString();
            Intrinsics.checkNotNull(string3);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Icon.Companion companion = Icon.INSTANCE;
            return new DeviceInfo(string, string2, string3, string4, string5, companion.parse(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), BatteryInfo.INSTANCE.parse(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readLong(), companion.parse(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iDataPosition = parcel.dataPosition();
            int i = parcel.readInt();
            DeviceInfo propertyFromParcel = readPropertyFromParcel(parcel, parcel.readInt());
            parcel.setDataPosition(iDataPosition + i);
            return propertyFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfo[] newArray(int size) {
            return new DeviceInfo[size];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i) {
        this(id, category, deviceType, str, str2, icon, i, null, null, null, null, null, 0L, 0, 0L, null, 65408, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    public static /* synthetic */ void getAccountId$annotations() {
    }

    public static /* synthetic */ void getBattery$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getDeviceType$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getMac$annotations() {
    }

    public static /* synthetic */ void getPinIcon$annotations() {
    }

    public static /* synthetic */ void getPinTime$annotations() {
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getPrivateData$annotations() {
    }

    public static /* synthetic */ void getSsid$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    private final void writePropertyToParcel(Parcel parcel) {
        String strFlat;
        String strFlat2;
        String strFlat3;
        parcel.writeString(this.id);
        parcel.writeString(this.category);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Icon icon = this.icon;
        String str = "";
        if (icon == null || (strFlat = icon.flat()) == null) {
            strFlat = "";
        }
        parcel.writeString(strFlat);
        parcel.writeInt(this.state);
        parcel.writeString(this.accountId);
        parcel.writeString(this.mac);
        BatteryInfo batteryInfo = this.battery;
        if (batteryInfo == null || (strFlat2 = batteryInfo.flat()) == null) {
            strFlat2 = "";
        }
        parcel.writeString(strFlat2);
        parcel.writeString(this.ssid);
        parcel.writeString(this.privateData);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.priority);
        parcel.writeLong(this.pinTime);
        Icon icon2 = this.pinIcon;
        if (icon2 != null && (strFlat3 = icon2.flat()) != null) {
            str = strFlat3;
        }
        parcel.writeString(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BatteryInfo getBattery() {
        return this.battery;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPrivateData() {
        return this.privateData;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getPinTime() {
        return this.pinTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Icon getPinIcon() {
        return this.pinIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String title, @Nullable String subtitle, @Nullable Icon icon, int state, @Nullable String accountId, @Nullable String mac, @Nullable BatteryInfo battery, @Nullable String ssid, @Nullable String privateData, long updateTime, int priority, long pinTime, @Nullable Icon pinIcon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return new DeviceInfo(id, category, deviceType, title, subtitle, icon, state, accountId, mac, battery, ssid, privateData, updateTime, priority, pinTime, pinIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.id, deviceInfo.id) && Intrinsics.areEqual(this.category, deviceInfo.category) && Intrinsics.areEqual(this.deviceType, deviceInfo.deviceType) && Intrinsics.areEqual(this.title, deviceInfo.title) && Intrinsics.areEqual(this.subtitle, deviceInfo.subtitle) && Intrinsics.areEqual(this.icon, deviceInfo.icon) && this.state == deviceInfo.state && Intrinsics.areEqual(this.accountId, deviceInfo.accountId) && Intrinsics.areEqual(this.mac, deviceInfo.mac) && Intrinsics.areEqual(this.battery, deviceInfo.battery) && Intrinsics.areEqual(this.ssid, deviceInfo.ssid) && Intrinsics.areEqual(this.privateData, deviceInfo.privateData) && this.updateTime == deviceInfo.updateTime && this.priority == deviceInfo.priority && this.pinTime == deviceInfo.pinTime && Intrinsics.areEqual(this.pinIcon, deviceInfo.pinIcon);
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final BatteryInfo getBattery() {
        return this.battery;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final Icon getPinIcon() {
        return this.pinIcon;
    }

    public final long getPinTime() {
        return this.pinTime;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getPrivateData() {
        return this.privateData;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + this.deviceType.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (((iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31) + Integer.hashCode(this.state)) * 31;
        String str3 = this.accountId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mac;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BatteryInfo batteryInfo = this.battery;
        int iHashCode7 = (iHashCode6 + (batteryInfo == null ? 0 : batteryInfo.hashCode())) * 31;
        String str5 = this.ssid;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.privateData;
        int iHashCode9 = (((((((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.priority)) * 31) + Long.hashCode(this.pinTime)) * 31;
        Icon icon2 = this.pinIcon;
        return iHashCode9 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final boolean isPin() {
        return this.pinTime > 0;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(id=" + this.id + ", category=" + this.category + ", deviceType=" + this.deviceType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", state=" + this.state + ", accountId=" + this.accountId + ", mac=" + this.mac + ", battery=" + this.battery + ", ssid=" + this.ssid + ", privateData=" + this.privateData + ", updateTime=" + this.updateTime + ", priority=" + this.priority + ", pinTime=" + this.pinTime + ", pinIcon=" + this.pinIcon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(1);
        writePropertyToParcel(parcel);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3) {
        this(id, category, deviceType, str, str2, icon, i, str3, null, null, null, null, 0L, 0, 0L, null, 65280, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, null, null, null, 0L, 0, 0L, null, 65024, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, null, null, 0L, 0, 0L, null, TransportL1.SAR_DEFAULT_MPS, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, str5, null, 0L, 0, 0L, null, 63488, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5, @Nullable String str6) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, str5, str6, 0L, 0, 0L, null, 61440, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5, @Nullable String str6, long j) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, str5, str6, j, 0, 0L, null, 57344, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5, @Nullable String str6, long j, int i2) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, str5, str6, j, i2, 0L, null, 49152, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5, @Nullable String str6, long j, int i2, long j2) {
        this(id, category, deviceType, str, str2, icon, i, str3, str4, batteryInfo, str5, str6, j, i2, j2, null, 32768, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String id, @NotNull String category, @NotNull String deviceType, @Nullable String str, @Nullable String str2, @Nullable Icon icon, int i, @Nullable String str3, @Nullable String str4, @Nullable BatteryInfo batteryInfo, @Nullable String str5, @Nullable String str6, long j, int i2, long j2, @Nullable Icon icon2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.id = id;
        this.category = category;
        this.deviceType = deviceType;
        this.title = str;
        this.subtitle = str2;
        this.icon = icon;
        this.state = i;
        this.accountId = str3;
        this.mac = str4;
        this.battery = batteryInfo;
        this.ssid = str5;
        this.privateData = str6;
        this.updateTime = j;
        this.priority = i2;
        this.pinTime = j2;
        this.pinIcon = icon2;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/miui/circulate/device/api/DeviceInfo$Builder;", "", "()V", "copy", "Lcom/miui/circulate/device/api/DeviceInfo;", "(Lcom/miui/circulate/device/api/DeviceInfo;)V", Column.ACCOUNT_ID, "", Column.BATTERY, "Lcom/miui/circulate/device/api/BatteryInfo;", "category", "deviceType", "icon", "Lcom/miui/circulate/device/api/Icon;", "id", "mac", Column.PRIVATE_DATA, "privateDataJson", "Lorg/json/JSONObject;", "ssid", "state", "", Column.SUBTITLE, "title", OneTrack.Param.BUILD, "putPrivateData", "key", "value", "setAccountId", "setBattery", "setCategory", "setDeviceType", "setIcon", "setId", "setMac", "setPrivateData", "setSSID", "setState", "setSubtitle", "setTitle", "PrivateDataKey", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String accountId;

        @Nullable
        private BatteryInfo battery;
        private String category;
        private String deviceType;

        @Nullable
        private Icon icon;
        private String id;

        @Nullable
        private String mac;

        @Nullable
        private String privateData;

        @NotNull
        private final JSONObject privateDataJson;

        @Nullable
        private String ssid;
        private int state;

        @Nullable
        private String subtitle;

        @Nullable
        private String title;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/miui/circulate/device/api/DeviceInfo$Builder$PrivateDataKey;", "", "()V", "BLUETOOTH_MAC", "", "BLUETOOTH_MAC_HASH", "CAN_ALONE_PLAY_CTRL", "IP", "MODEL", "P2PMAC", "PROTOCOL_TYPE", "SAME_ACCOUNT", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class PrivateDataKey {

            @NotNull
            public static final String BLUETOOTH_MAC = "bluetoothMac";

            @NotNull
            public static final String BLUETOOTH_MAC_HASH = "btHash";

            @NotNull
            public static final String CAN_ALONE_PLAY_CTRL = "canAlonePlayCtrl";

            @NotNull
            public static final PrivateDataKey INSTANCE = new PrivateDataKey();

            @NotNull
            public static final String IP = "ip";

            @NotNull
            public static final String MODEL = "model";

            @NotNull
            public static final String P2PMAC = "p2pMac";

            @NotNull
            public static final String PROTOCOL_TYPE = "protocolType";

            @NotNull
            public static final String SAME_ACCOUNT = "sameAccount";

            private PrivateDataKey() {
            }
        }

        public Builder(@Nullable DeviceInfo deviceInfo) {
            this.privateDataJson = new JSONObject();
            if (deviceInfo != null) {
                this.id = deviceInfo.getId();
            }
            if (deviceInfo != null) {
                this.category = deviceInfo.getCategory();
            }
            if (deviceInfo != null) {
                this.deviceType = deviceInfo.getDeviceType();
            }
            this.title = deviceInfo != null ? deviceInfo.getTitle() : null;
            this.subtitle = deviceInfo != null ? deviceInfo.getSubtitle() : null;
            this.icon = deviceInfo != null ? deviceInfo.getIcon() : null;
            this.state = deviceInfo != null ? deviceInfo.getState() : 0;
            this.mac = deviceInfo != null ? deviceInfo.getMac() : null;
            this.ssid = deviceInfo != null ? deviceInfo.getSsid() : null;
            this.battery = deviceInfo != null ? deviceInfo.getBattery() : null;
            this.accountId = deviceInfo != null ? deviceInfo.getAccountId() : null;
            this.privateData = deviceInfo != null ? deviceInfo.getPrivateData() : null;
        }

        @NotNull
        public final DeviceInfo build() {
            String str;
            String str2;
            String str3;
            String str4;
            if (this.privateDataJson.length() > 0 && (str4 = this.privateData) != null && str4.length() != 0) {
                throw new IllegalArgumentException("do NOT use 'putPrivateData(key, value)' and 'setPrivateData(value)' at same time");
            }
            if (this.privateDataJson.length() > 0) {
                this.privateData = this.privateDataJson.toString();
            }
            String str5 = this.id;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("id");
                str = null;
            } else {
                str = str5;
            }
            String str6 = this.category;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("category");
                str2 = null;
            } else {
                str2 = str6;
            }
            String str7 = this.deviceType;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceType");
                str3 = null;
            } else {
                str3 = str7;
            }
            return new DeviceInfo(str, str2, str3, this.title, this.subtitle, this.icon, this.state, this.accountId, this.mac, this.battery, this.ssid, this.privateData, 0L, 0, 0L, null, 61440, null);
        }

        @NotNull
        public final Builder putPrivateData(@NotNull String key, @NotNull Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.privateDataJson.put(key, value);
            return this;
        }

        @NotNull
        public final Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        @NotNull
        public final Builder setBattery(@Nullable BatteryInfo battery) {
            this.battery = battery;
            return this;
        }

        @NotNull
        public final Builder setCategory(@NotNull String category) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.category = category;
            return this;
        }

        @NotNull
        public final Builder setDeviceType(@NotNull String deviceType) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            this.deviceType = deviceType;
            return this;
        }

        @NotNull
        public final Builder setIcon(@Nullable Icon icon) {
            this.icon = icon;
            return this;
        }

        @NotNull
        public final Builder setId(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            return this;
        }

        @NotNull
        public final Builder setMac(@Nullable String mac) {
            this.mac = mac;
            return this;
        }

        @NotNull
        public final Builder setPrivateData(@Nullable String privateData) {
            this.privateData = privateData;
            return this;
        }

        @NotNull
        public final Builder setSSID(@Nullable String ssid) {
            this.ssid = ssid;
            return this;
        }

        @NotNull
        public final Builder setState(int state) {
            this.state = state;
            return this;
        }

        @NotNull
        public final Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @NotNull
        public final Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder() {
            this(null);
        }
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, String str5, Icon icon, int i, String str6, String str7, BatteryInfo batteryInfo, String str8, String str9, long j, int i2, long j2, Icon icon2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, icon, i, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : batteryInfo, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? 0L : j, (i3 & 8192) != 0 ? 0 : i2, (i3 & 16384) != 0 ? 0L : j2, (i3 & 32768) != 0 ? null : icon2);
    }
}
