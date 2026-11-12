package com.xiaomi.fitness.nfc.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "Landroid/os/Parcelable;", "type", "", "aid", "", "name", "cardFace", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getType", "()I", "getAid", "()Ljava/lang/String;", "getName", "getCardFace", "isSelected", "", "()Z", "setSelected", "(Z)V", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "CREATOR", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AutoSwitchCardBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String aid;

    @NotNull
    private final String cardFace;
    private boolean isSelected;

    @NotNull
    private final String name;
    private final int type;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<AutoSwitchCardBean> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AutoSwitchCardBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoSwitchCardBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AutoSwitchCardBean[] newArray(int size) {
            return new AutoSwitchCardBean[size];
        }
    }

    public AutoSwitchCardBean(int i, @NotNull String aid, @NotNull String name, @NotNull String cardFace) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cardFace, "cardFace");
        this.type = i;
        this.aid = aid;
        this.name = name;
        this.cardFace = cardFace;
    }

    public static /* synthetic */ AutoSwitchCardBean copy$default(AutoSwitchCardBean autoSwitchCardBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = autoSwitchCardBean.type;
        }
        if ((i2 & 2) != 0) {
            str = autoSwitchCardBean.aid;
        }
        if ((i2 & 4) != 0) {
            str2 = autoSwitchCardBean.name;
        }
        if ((i2 & 8) != 0) {
            str3 = autoSwitchCardBean.cardFace;
        }
        return autoSwitchCardBean.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardFace() {
        return this.cardFace;
    }

    @NotNull
    public final AutoSwitchCardBean copy(int type, @NotNull String aid, @NotNull String name, @NotNull String cardFace) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cardFace, "cardFace");
        return new AutoSwitchCardBean(type, aid, name, cardFace);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSwitchCardBean)) {
            return false;
        }
        AutoSwitchCardBean autoSwitchCardBean = (AutoSwitchCardBean) other;
        return this.type == autoSwitchCardBean.type && Intrinsics.areEqual(this.aid, autoSwitchCardBean.aid) && Intrinsics.areEqual(this.name, autoSwitchCardBean.name) && Intrinsics.areEqual(this.cardFace, autoSwitchCardBean.cardFace);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getCardFace() {
        return this.cardFace;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + this.aid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.cardFace.hashCode();
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "AutoSwitchCardBean(type=" + this.type + ", aid=" + this.aid + ", name=" + this.name + ", cardFace=" + this.cardFace + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeString(this.aid);
        parcel.writeString(this.name);
        parcel.writeString(this.cardFace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AutoSwitchCardBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        String string3 = parcel.readString();
        Intrinsics.checkNotNull(string3);
        this(i, string, string2, string3);
    }
}
