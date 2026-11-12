package com.xiaomi.fitness.habit.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.example.habit.export.PunchTime;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0006\u0010'\u001a\u00020\u0005J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/Share;", "Landroid/os/Parcelable;", HabitShareActivity.KEY_BIG_ICON, "", "continuousPunch", "", "middleIcon", "name", "punchTime", "", "Lcom/example/habit/export/PunchTime;", "smallIcon", "shareIcon", "type", "typeId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V", "getBigIcon", "()Ljava/lang/String;", "getContinuousPunch", "()I", "getMiddleIcon", "getName", "getPunchTime", "()Ljava/util/List;", "getSmallIcon", "getShareIcon", "getType", "getTypeId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Share implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Share> CREATOR = new Creator();

    @NotNull
    private final String bigIcon;
    private final int continuousPunch;

    @NotNull
    private final String middleIcon;

    @NotNull
    private final String name;

    @NotNull
    private final List<PunchTime> punchTime;

    @NotNull
    private final String shareIcon;

    @NotNull
    private final String smallIcon;
    private final int type;
    private final int typeId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Share> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Share createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(Share.class.getClassLoader()));
            }
            return new Share(string, i, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Share[] newArray(int i) {
            return new Share[i];
        }
    }

    public Share(@NotNull String bigIcon, int i, @NotNull String middleIcon, @NotNull String name, @NotNull List<PunchTime> punchTime, @NotNull String smallIcon, @NotNull String shareIcon, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bigIcon, "bigIcon");
        Intrinsics.checkNotNullParameter(middleIcon, "middleIcon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(punchTime, "punchTime");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(shareIcon, "shareIcon");
        this.bigIcon = bigIcon;
        this.continuousPunch = i;
        this.middleIcon = middleIcon;
        this.name = name;
        this.punchTime = punchTime;
        this.smallIcon = smallIcon;
        this.shareIcon = shareIcon;
        this.type = i2;
        this.typeId = i3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBigIcon() {
        return this.bigIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getContinuousPunch() {
        return this.continuousPunch;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMiddleIcon() {
        return this.middleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PunchTime> component5() {
        return this.punchTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShareIcon() {
        return this.shareIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    @NotNull
    public final Share copy(@NotNull String bigIcon, int continuousPunch, @NotNull String middleIcon, @NotNull String name, @NotNull List<PunchTime> punchTime, @NotNull String smallIcon, @NotNull String shareIcon, int type, int typeId) {
        Intrinsics.checkNotNullParameter(bigIcon, "bigIcon");
        Intrinsics.checkNotNullParameter(middleIcon, "middleIcon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(punchTime, "punchTime");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(shareIcon, "shareIcon");
        return new Share(bigIcon, continuousPunch, middleIcon, name, punchTime, smallIcon, shareIcon, type, typeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Share)) {
            return false;
        }
        Share share = (Share) other;
        return Intrinsics.areEqual(this.bigIcon, share.bigIcon) && this.continuousPunch == share.continuousPunch && Intrinsics.areEqual(this.middleIcon, share.middleIcon) && Intrinsics.areEqual(this.name, share.name) && Intrinsics.areEqual(this.punchTime, share.punchTime) && Intrinsics.areEqual(this.smallIcon, share.smallIcon) && Intrinsics.areEqual(this.shareIcon, share.shareIcon) && this.type == share.type && this.typeId == share.typeId;
    }

    @NotNull
    public final String getBigIcon() {
        return this.bigIcon;
    }

    public final int getContinuousPunch() {
        return this.continuousPunch;
    }

    @NotNull
    public final String getMiddleIcon() {
        return this.middleIcon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PunchTime> getPunchTime() {
        return this.punchTime;
    }

    @NotNull
    public final String getShareIcon() {
        return this.shareIcon;
    }

    @NotNull
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final int getType() {
        return this.type;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        return (((((((((((((((this.bigIcon.hashCode() * 31) + Integer.hashCode(this.continuousPunch)) * 31) + this.middleIcon.hashCode()) * 31) + this.name.hashCode()) * 31) + this.punchTime.hashCode()) * 31) + this.smallIcon.hashCode()) * 31) + this.shareIcon.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.typeId);
    }

    @NotNull
    public String toString() {
        return "Share(bigIcon=" + this.bigIcon + ", continuousPunch=" + this.continuousPunch + ", middleIcon=" + this.middleIcon + ", name=" + this.name + ", punchTime=" + this.punchTime + ", smallIcon=" + this.smallIcon + ", shareIcon=" + this.shareIcon + ", type=" + this.type + ", typeId=" + this.typeId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bigIcon);
        dest.writeInt(this.continuousPunch);
        dest.writeString(this.middleIcon);
        dest.writeString(this.name);
        List<PunchTime> list = this.punchTime;
        dest.writeInt(list.size());
        Iterator<PunchTime> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.smallIcon);
        dest.writeString(this.shareIcon);
        dest.writeInt(this.type);
        dest.writeInt(this.typeId);
    }
}
