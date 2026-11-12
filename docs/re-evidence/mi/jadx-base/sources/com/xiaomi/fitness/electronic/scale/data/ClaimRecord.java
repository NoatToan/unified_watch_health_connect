package com.xiaomi.fitness.electronic.scale.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Entity(primaryKeys = {"createTime"}, tableName = "claim_record")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WBÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b\u001c\u0010 J\u0018\u0010S\u001a\u00020T2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\rH\u0016J\b\u0010V\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010-\"\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00105\"\u0004\bG\u00107R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00105\"\u0004\bM\u00107R\u001a\u0010\u0019\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00105\"\u0004\bQ\u00107R\u001a\u0010\u001b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010-\"\u0004\bR\u0010/¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "Landroid/os/Parcelable;", "did", "", "type", "weight", "", "unit", "isChecked", "", "createTime", "", "heartRate", "", "lfz12", "lfz13", "lfz14", "lfz23", "lfz24", "lfz34", "hfz12", "hfz13", "hfz14", "hfz23", "hfz24", "hfz34", "id", "isCloud", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;ZJIIIIIIIIIIIIIIZ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getType", "setType", "getWeight", "()F", "setWeight", "(F)V", "getUnit", "setUnit", "()Z", "setChecked", "(Z)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getHeartRate", "()I", "setHeartRate", "(I)V", "getLfz12", "setLfz12", "getLfz13", "setLfz13", "getLfz14", "setLfz14", "getLfz23", "setLfz23", "getLfz24", "setLfz24", "getLfz34", "setLfz34", "getHfz12", "setHfz12", "getHfz13", "setHfz13", "getHfz14", "setHfz14", "getHfz23", "setHfz23", "getHfz24", "setHfz24", "getHfz34", "setHfz34", "getId", "setId", "setCloud", "writeToParcel", "", "flags", "describeContents", "CREATOR", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClaimRecord implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private long createTime;

    @NotNull
    private String did;
    private int heartRate;
    private int hfz12;
    private int hfz13;
    private int hfz14;
    private int hfz23;
    private int hfz24;
    private int hfz34;
    private int id;
    private boolean isChecked;
    private boolean isCloud;
    private int lfz12;
    private int lfz13;
    private int lfz14;
    private int lfz23;
    private int lfz24;
    private int lfz34;

    @NotNull
    private String type;

    @NotNull
    private String unit;
    private float weight;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.data.ClaimRecord$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ClaimRecord> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ClaimRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClaimRecord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ClaimRecord[] newArray(int size) {
            return new ClaimRecord[size];
        }
    }

    public ClaimRecord() {
        this(null, null, 0.0f, null, false, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 2097151, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHfz12() {
        return this.hfz12;
    }

    public final int getHfz13() {
        return this.hfz13;
    }

    public final int getHfz14() {
        return this.hfz14;
    }

    public final int getHfz23() {
        return this.hfz23;
    }

    public final int getHfz24() {
        return this.hfz24;
    }

    public final int getHfz34() {
        return this.hfz34;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLfz12() {
        return this.lfz12;
    }

    public final int getLfz13() {
        return this.lfz13;
    }

    public final int getLfz14() {
        return this.lfz14;
    }

    public final int getLfz23() {
        return this.lfz23;
    }

    public final int getLfz24() {
        return this.lfz24;
    }

    public final int getLfz34() {
        return this.lfz34;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: isCloud, reason: from getter */
    public final boolean getIsCloud() {
        return this.isCloud;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setCloud(boolean z) {
        this.isCloud = z;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setHfz12(int i) {
        this.hfz12 = i;
    }

    public final void setHfz13(int i) {
        this.hfz13 = i;
    }

    public final void setHfz14(int i) {
        this.hfz14 = i;
    }

    public final void setHfz23(int i) {
        this.hfz23 = i;
    }

    public final void setHfz24(int i) {
        this.hfz24 = i;
    }

    public final void setHfz34(int i) {
        this.hfz34 = i;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLfz12(int i) {
        this.lfz12 = i;
    }

    public final void setLfz13(int i) {
        this.lfz13 = i;
    }

    public final void setLfz14(int i) {
        this.lfz14 = i;
    }

    public final void setLfz23(int i) {
        this.lfz23 = i;
    }

    public final void setLfz24(int i) {
        this.lfz24 = i;
    }

    public final void setLfz34(int i) {
        this.lfz34 = i;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.did);
        parcel.writeString(this.type);
        parcel.writeFloat(this.weight);
        parcel.writeString(this.unit);
        parcel.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.heartRate);
        parcel.writeInt(this.lfz12);
        parcel.writeInt(this.lfz13);
        parcel.writeInt(this.lfz14);
        parcel.writeInt(this.lfz23);
        parcel.writeInt(this.lfz24);
        parcel.writeInt(this.lfz34);
        parcel.writeInt(this.hfz12);
        parcel.writeInt(this.hfz13);
        parcel.writeInt(this.hfz14);
        parcel.writeInt(this.hfz23);
        parcel.writeInt(this.hfz24);
        parcel.writeInt(this.hfz34);
        parcel.writeInt(this.id);
        parcel.writeByte(this.isCloud ? (byte) 1 : (byte) 0);
    }

    public ClaimRecord(@NotNull String did, @NotNull String type, float f, @NotNull String unit, boolean z, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z2) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.did = did;
        this.type = type;
        this.weight = f;
        this.unit = unit;
        this.isChecked = z;
        this.createTime = j;
        this.heartRate = i;
        this.lfz12 = i2;
        this.lfz13 = i3;
        this.lfz14 = i4;
        this.lfz23 = i5;
        this.lfz24 = i6;
        this.lfz34 = i7;
        this.hfz12 = i8;
        this.hfz13 = i9;
        this.hfz14 = i10;
        this.hfz23 = i11;
        this.hfz24 = i12;
        this.hfz34 = i13;
        this.id = i14;
        this.isCloud = z2;
    }

    public /* synthetic */ ClaimRecord(String str, String str2, float f, String str3, boolean z, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) == 0 ? str2 : "", (i15 & 4) != 0 ? 0.0f : f, (i15 & 8) != 0 ? "Kg" : str3, (i15 & 16) != 0 ? false : z, (i15 & 32) != 0 ? 0L : j, (i15 & 64) != 0 ? 0 : i, (i15 & 128) != 0 ? 0 : i2, (i15 & 256) != 0 ? 0 : i3, (i15 & 512) != 0 ? 0 : i4, (i15 & 1024) != 0 ? 0 : i5, (i15 & 2048) != 0 ? 0 : i6, (i15 & 4096) != 0 ? 0 : i7, (i15 & 8192) != 0 ? 0 : i8, (i15 & 16384) != 0 ? 0 : i9, (i15 & 32768) != 0 ? 0 : i10, (i15 & 65536) != 0 ? 0 : i11, (i15 & 131072) != 0 ? 0 : i12, (i15 & 262144) != 0 ? 0 : i13, (i15 & 524288) != 0 ? 0 : i14, (i15 & EventRecurrence.TH) != 0 ? true : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClaimRecord(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        float f = parcel.readFloat();
        String string3 = parcel.readString();
        Intrinsics.checkNotNull(string3);
        this(string, string2, f, string3, parcel.readByte() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readByte() != 0);
    }
}
