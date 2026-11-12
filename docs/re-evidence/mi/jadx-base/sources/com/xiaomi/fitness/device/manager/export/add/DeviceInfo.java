package com.xiaomi.fitness.device.manager.export.add;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 r2\u00020\u0001:\u0001rB÷\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010J\u001a\u00020K2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010L\u001a\u00020\u0010J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\t\u0010]\u001a\u00020\u0010HÆ\u0003J\t\u0010^\u001a\u00020\u0010HÆ\u0003J\t\u0010_\u001a\u00020\u0010HÆ\u0003J\t\u0010`\u001a\u00020\u0010HÆ\u0003J\t\u0010a\u001a\u00020\u0010HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0010HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003Jù\u0001\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0001J\u0006\u0010h\u001a\u00020\u0003J\u0013\u0010i\u001a\u00020\u00102\b\u0010j\u001a\u0004\u0018\u00010kHÖ\u0003J\t\u0010l\u001a\u00020\u0003HÖ\u0001J\t\u0010m\u001a\u00020\u0005HÖ\u0001J\u0016\u0010n\u001a\u00020K2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u00107\"\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u00107\"\u0004\b:\u00109R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u00107\"\u0004\b;\u00109R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u00107\"\u0004\b<\u00109R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u00107\"\u0004\b=\u00109R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u00107\"\u0004\b>\u00109R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010.R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010.R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010.R\u001a\u0010\u0019\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u00107\"\u0004\bE\u00109R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0011\u0010M\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bM\u00107R\u0011\u0010N\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bN\u00107R\u0011\u0010O\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bO\u00107R\u0011\u0010P\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bP\u00107¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "Landroid/os/Parcelable;", "itemType", "", "name", "", "subName", HabitShareActivity.KEY_BIG_ICON, "bigPreview", "smallIcon", "scanMode", "model", "productId", "alias", "bltNamePrefix", "isWearOs", "", "isWatch", "isHuami", "isBand", "isSportMachine", "isEarPhone", "status", "type", CardInfo.KEY_CARD_GROUP_ID, "isVersionSupport", "productIds", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZZZZIIIZLjava/util/List;)V", "getItemType", "()I", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSubName", "setSubName", "getBigIcon", "setBigIcon", "getBigPreview", "setBigPreview", "getSmallIcon", "setSmallIcon", "getScanMode", "setScanMode", "(I)V", "getModel", "setModel", "getProductId", "setProductId", "getAlias", "setAlias", "getBltNamePrefix", "setBltNamePrefix", "()Z", "setWearOs", "(Z)V", "setWatch", "setHuami", "setBand", "setSportMachine", "setEarPhone", "getStatus", "setStatus", "getType", "setType", "getGroupId", "setGroupId", "setVersionSupport", "getProductIds", "()Ljava/util/List;", "setProductIds", "(Ljava/util/List;)V", "addProductId", "", "needSortByRSSI", "isKongMing", "isDual", "isBle", "isBloodSugar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceInfo implements Parcelable {
    public static final int SCAN_MODE_MIX = 1;
    public static final int SCAN_MODE_SPECIAL = 0;
    public static final int TYPE_ITEM_DEVICE = 12;
    public static final int TYPE_ITEM_LABEL = 11;

    @Nullable
    private String alias;

    @Nullable
    private String bigIcon;

    @Nullable
    private String bigPreview;

    @NotNull
    private String bltNamePrefix;
    private int groupId;
    private boolean isBand;
    private boolean isEarPhone;
    private boolean isHuami;
    private boolean isSportMachine;
    private boolean isVersionSupport;
    private boolean isWatch;
    private boolean isWearOs;
    private final int itemType;

    @Nullable
    private String model;

    @NotNull
    private String name;
    private int productId;

    @Nullable
    private List<Integer> productIds;
    private int scanMode;

    @Nullable
    private String smallIcon;
    private int status;

    @Nullable
    private String subName;
    private int type;

    @NotNull
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            String string6 = parcel.readString();
            int i3 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    i8++;
                    i7 = i7;
                }
                arrayList = arrayList2;
            }
            return new DeviceInfo(i, string, string2, string3, string4, string5, i2, string6, i3, string7, string8, z, z2, z3, z4, z5, z6, i4, i5, i6, z7, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    public DeviceInfo() {
        this(0, null, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, false, 0, 0, 0, false, null, 4194303, null);
    }

    public final void addProductId(int productId) {
        if (this.productIds == null) {
            ArrayList arrayList = new ArrayList();
            this.productIds = arrayList;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add(Integer.valueOf(this.productId));
        }
        List<Integer> list = this.productIds;
        Intrinsics.checkNotNull(list);
        if (list.contains(Integer.valueOf(productId))) {
            return;
        }
        list.add(Integer.valueOf(productId));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBltNamePrefix() {
        return this.bltNamePrefix;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsWearOs() {
        return this.isWearOs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsWatch() {
        return this.isWatch;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsHuami() {
        return this.isHuami;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsBand() {
        return this.isBand;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsSportMachine() {
        return this.isSportMachine;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsEarPhone() {
        return this.isEarPhone;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsVersionSupport() {
        return this.isVersionSupport;
    }

    @Nullable
    public final List<Integer> component22() {
        return this.productIds;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubName() {
        return this.subName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBigIcon() {
        return this.bigIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBigPreview() {
        return this.bigPreview;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getScanMode() {
        return this.scanMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    @NotNull
    public final DeviceInfo copy(int itemType, @NotNull String name, @Nullable String subName, @Nullable String bigIcon, @Nullable String bigPreview, @Nullable String smallIcon, int scanMode, @Nullable String model, int productId, @Nullable String alias, @NotNull String bltNamePrefix, boolean isWearOs, boolean isWatch, boolean isHuami, boolean isBand, boolean isSportMachine, boolean isEarPhone, int status, int type, int groupId, boolean isVersionSupport, @Nullable List<Integer> productIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bltNamePrefix, "bltNamePrefix");
        return new DeviceInfo(itemType, name, subName, bigIcon, bigPreview, smallIcon, scanMode, model, productId, alias, bltNamePrefix, isWearOs, isWatch, isHuami, isBand, isSportMachine, isEarPhone, status, type, groupId, isVersionSupport, productIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
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
        return this.itemType == deviceInfo.itemType && Intrinsics.areEqual(this.name, deviceInfo.name) && Intrinsics.areEqual(this.subName, deviceInfo.subName) && Intrinsics.areEqual(this.bigIcon, deviceInfo.bigIcon) && Intrinsics.areEqual(this.bigPreview, deviceInfo.bigPreview) && Intrinsics.areEqual(this.smallIcon, deviceInfo.smallIcon) && this.scanMode == deviceInfo.scanMode && Intrinsics.areEqual(this.model, deviceInfo.model) && this.productId == deviceInfo.productId && Intrinsics.areEqual(this.alias, deviceInfo.alias) && Intrinsics.areEqual(this.bltNamePrefix, deviceInfo.bltNamePrefix) && this.isWearOs == deviceInfo.isWearOs && this.isWatch == deviceInfo.isWatch && this.isHuami == deviceInfo.isHuami && this.isBand == deviceInfo.isBand && this.isSportMachine == deviceInfo.isSportMachine && this.isEarPhone == deviceInfo.isEarPhone && this.status == deviceInfo.status && this.type == deviceInfo.type && this.groupId == deviceInfo.groupId && this.isVersionSupport == deviceInfo.isVersionSupport && Intrinsics.areEqual(this.productIds, deviceInfo.productIds);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final String getBigIcon() {
        return this.bigIcon;
    }

    @Nullable
    public final String getBigPreview() {
        return this.bigPreview;
    }

    @NotNull
    public final String getBltNamePrefix() {
        return this.bltNamePrefix;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getProductId() {
        return this.productId;
    }

    @Nullable
    public final List<Integer> getProductIds() {
        return this.productIds;
    }

    public final int getScanMode() {
        return this.scanMode;
    }

    @Nullable
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubName() {
        return this.subName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.itemType) * 31) + this.name.hashCode()) * 31;
        String str = this.subName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bigIcon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bigPreview;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.smallIcon;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.scanMode)) * 31;
        String str5 = this.model;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.productId)) * 31;
        String str6 = this.alias;
        int iHashCode7 = (((((((((((((((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.bltNamePrefix.hashCode()) * 31) + Boolean.hashCode(this.isWearOs)) * 31) + Boolean.hashCode(this.isWatch)) * 31) + Boolean.hashCode(this.isHuami)) * 31) + Boolean.hashCode(this.isBand)) * 31) + Boolean.hashCode(this.isSportMachine)) * 31) + Boolean.hashCode(this.isEarPhone)) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.groupId)) * 31) + Boolean.hashCode(this.isVersionSupport)) * 31;
        List<Integer> list = this.productIds;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isBand() {
        return this.isBand;
    }

    public final boolean isBle() {
        return (this.isWearOs || this.isHuami) ? false : true;
    }

    public final boolean isBloodSugar() {
        return Intrinsics.areEqual(this.model, BloodGlucoseAllDayItemFragment.MODEL_CGM);
    }

    public final boolean isDual() {
        int i = this.type;
        return i == 6 || i == 7;
    }

    public final boolean isEarPhone() {
        return this.isEarPhone;
    }

    public final boolean isHuami() {
        return this.isHuami;
    }

    public final boolean isKongMing() {
        return StringsKt__StringsJVMKt.equals(Product.KONG_MING_NAME, this.bltNamePrefix, true) || StringsKt__StringsJVMKt.startsWith$default(this.bltNamePrefix, Product.KONG_MING_NAME_2, false, 2, null);
    }

    public final boolean isSportMachine() {
        return this.isSportMachine;
    }

    public final boolean isVersionSupport() {
        return this.isVersionSupport;
    }

    public final boolean isWatch() {
        return this.isWatch;
    }

    public final boolean isWearOs() {
        return this.isWearOs;
    }

    public final boolean needSortByRSSI() {
        return this.isHuami || this.isSportMachine;
    }

    public final void setAlias(@Nullable String str) {
        this.alias = str;
    }

    public final void setBand(boolean z) {
        this.isBand = z;
    }

    public final void setBigIcon(@Nullable String str) {
        this.bigIcon = str;
    }

    public final void setBigPreview(@Nullable String str) {
        this.bigPreview = str;
    }

    public final void setBltNamePrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bltNamePrefix = str;
    }

    public final void setEarPhone(boolean z) {
        this.isEarPhone = z;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setHuami(boolean z) {
        this.isHuami = z;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final void setProductIds(@Nullable List<Integer> list) {
        this.productIds = list;
    }

    public final void setScanMode(int i) {
        this.scanMode = i;
    }

    public final void setSmallIcon(@Nullable String str) {
        this.smallIcon = str;
    }

    public final void setSportMachine(boolean z) {
        this.isSportMachine = z;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSubName(@Nullable String str) {
        this.subName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVersionSupport(boolean z) {
        this.isVersionSupport = z;
    }

    public final void setWatch(boolean z) {
        this.isWatch = z;
    }

    public final void setWearOs(boolean z) {
        this.isWearOs = z;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(itemType=" + this.itemType + ", name=" + this.name + ", subName=" + this.subName + ", bigIcon=" + this.bigIcon + ", bigPreview=" + this.bigPreview + ", smallIcon=" + this.smallIcon + ", scanMode=" + this.scanMode + ", model=" + this.model + ", productId=" + this.productId + ", alias=" + this.alias + ", bltNamePrefix=" + this.bltNamePrefix + ", isWearOs=" + this.isWearOs + ", isWatch=" + this.isWatch + ", isHuami=" + this.isHuami + ", isBand=" + this.isBand + ", isSportMachine=" + this.isSportMachine + ", isEarPhone=" + this.isEarPhone + ", status=" + this.status + ", type=" + this.type + ", groupId=" + this.groupId + ", isVersionSupport=" + this.isVersionSupport + ", productIds=" + this.productIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.itemType);
        dest.writeString(this.name);
        dest.writeString(this.subName);
        dest.writeString(this.bigIcon);
        dest.writeString(this.bigPreview);
        dest.writeString(this.smallIcon);
        dest.writeInt(this.scanMode);
        dest.writeString(this.model);
        dest.writeInt(this.productId);
        dest.writeString(this.alias);
        dest.writeString(this.bltNamePrefix);
        dest.writeInt(this.isWearOs ? 1 : 0);
        dest.writeInt(this.isWatch ? 1 : 0);
        dest.writeInt(this.isHuami ? 1 : 0);
        dest.writeInt(this.isBand ? 1 : 0);
        dest.writeInt(this.isSportMachine ? 1 : 0);
        dest.writeInt(this.isEarPhone ? 1 : 0);
        dest.writeInt(this.status);
        dest.writeInt(this.type);
        dest.writeInt(this.groupId);
        dest.writeInt(this.isVersionSupport ? 1 : 0);
        List<Integer> list = this.productIds;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            dest.writeInt(it.next().intValue());
        }
    }

    public DeviceInfo(int i, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable String str5, int i3, @Nullable String str6, @NotNull String bltNamePrefix, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, int i5, int i6, boolean z7, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bltNamePrefix, "bltNamePrefix");
        this.itemType = i;
        this.name = name;
        this.subName = str;
        this.bigIcon = str2;
        this.bigPreview = str3;
        this.smallIcon = str4;
        this.scanMode = i2;
        this.model = str5;
        this.productId = i3;
        this.alias = str6;
        this.bltNamePrefix = bltNamePrefix;
        this.isWearOs = z;
        this.isWatch = z2;
        this.isHuami = z3;
        this.isBand = z4;
        this.isSportMachine = z5;
        this.isEarPhone = z6;
        this.status = i4;
        this.type = i5;
        this.groupId = i6;
        this.isVersionSupport = z7;
        this.productIds = list;
    }

    public /* synthetic */ DeviceInfo(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, int i3, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, int i5, int i6, boolean z7, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 12 : i, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? null : str6, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? null : str7, (i7 & 1024) == 0 ? str8 : "", (i7 & 2048) != 0 ? false : z, (i7 & 4096) != 0 ? false : z2, (i7 & 8192) != 0 ? false : z3, (i7 & 16384) != 0 ? false : z4, (i7 & 32768) != 0 ? false : z5, (i7 & 65536) != 0 ? false : z6, (i7 & 131072) != 0 ? 0 : i4, (i7 & 262144) != 0 ? 0 : i5, (i7 & 524288) != 0 ? 0 : i6, (i7 & EventRecurrence.TH) != 0 ? false : z7, (i7 & 2097152) != 0 ? null : list);
    }
}
