package com.miui.headset.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\b\u0010\"\u001a\u00020\u0003H\u0016J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, d2 = {"Lcom/miui/headset/api/HeadsetInfo;", "Landroid/os/Parcelable;", Home.JSON_KEY_ADDRESS, "", "name", "deviceId", "powers", "", "", "mode", "volume", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;II)V", "getAddress", "()Ljava/lang/String;", "getDeviceId", "getMode", "()I", "getName", "getPowers", "()Ljava/util/List;", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Api.kt\ncom/miui/headset/api/HeadsetInfo\n+ 2 Kit.kt\ncom/miui/headset/api/KitKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Api.kt\ncom/miui/headset/api/ApiKt\n*L\n1#1,982:1\n14#2,2:983\n1#3:985\n892#4,7:986\n*S KotlinDebug\n*F\n+ 1 Api.kt\ncom/miui/headset/api/HeadsetInfo\n*L\n385#1:983,2\n385#1:985\n388#1:986,7\n*E\n"})
public final /* data */ class HeadsetInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeadsetInfo> CREATOR = new Creator();

    @NotNull
    private final String address;

    @NotNull
    private final String deviceId;
    private final int mode;

    @NotNull
    private final String name;

    @NotNull
    private final List<Integer> powers;
    private final int volume;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeadsetInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeadsetInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                int i3 = parcel.readInt();
                if (i2 == i) {
                    return new HeadsetInfo(string, string2, string3, arrayList, i3, parcel.readInt());
                }
                arrayList.add(Integer.valueOf(i3));
                i2++;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeadsetInfo[] newArray(int i) {
            return new HeadsetInfo[i];
        }
    }

    public HeadsetInfo(@NotNull String address, @NotNull String name, @NotNull String deviceId, @NotNull List<Integer> powers, int i, @IntRange(from = -1, to = 100) int i2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(powers, "powers");
        this.address = address;
        this.name = name;
        this.deviceId = deviceId;
        this.powers = powers;
        this.mode = i;
        this.volume = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeadsetInfo copy$default(HeadsetInfo headsetInfo, String str, String str2, String str3, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = headsetInfo.address;
        }
        if ((i3 & 2) != 0) {
            str2 = headsetInfo.name;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = headsetInfo.deviceId;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            list = headsetInfo.powers;
        }
        List list2 = list;
        if ((i3 & 16) != 0) {
            i = headsetInfo.mode;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = headsetInfo.volume;
        }
        return headsetInfo.copy(str, str4, str5, list2, i4, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.powers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    @NotNull
    public final HeadsetInfo copy(@NotNull String address, @NotNull String name, @NotNull String deviceId, @NotNull List<Integer> powers, int mode, @IntRange(from = -1, to = 100) int volume) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(powers, "powers");
        return new HeadsetInfo(address, name, deviceId, powers, mode, volume);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetInfo)) {
            return false;
        }
        HeadsetInfo headsetInfo = (HeadsetInfo) other;
        return Intrinsics.areEqual(this.address, headsetInfo.address) && Intrinsics.areEqual(this.name, headsetInfo.name) && Intrinsics.areEqual(this.deviceId, headsetInfo.deviceId) && Intrinsics.areEqual(this.powers, headsetInfo.powers) && this.mode == headsetInfo.mode && this.volume == headsetInfo.volume;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Integer> getPowers() {
        return this.powers;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return (((((((((this.address.hashCode() * 31) + this.name.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.powers.hashCode()) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.volume);
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HeadsetInfo(");
        sb.append(this.name);
        sb.append(", address=");
        String str2 = this.address;
        String hexString = Integer.toHexString(str2 != null ? str2.hashCode() : 0);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
        sb.append(hexString);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", powers=");
        sb.append(this.powers);
        sb.append(", mode=");
        int i = this.mode;
        if (i == -1) {
            str = "AncNotSupport";
        } else if (i == 0) {
            str = "AncClose";
        } else if (i == 1) {
            str = "AncOn";
        } else if (i != 2) {
            str = "?(" + i + ')';
        } else {
            str = "TransparentOn";
        }
        sb.append(str);
        sb.append(", volume=");
        sb.append(this.volume);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.address);
        parcel.writeString(this.name);
        parcel.writeString(this.deviceId);
        List<Integer> list = this.powers;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.mode);
        parcel.writeInt(this.volume);
    }
}
