package com.huami.nfc.door;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/nfc/door/Block;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "header", "index", "flag", "data", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", LogUtil.I, "getHeader", "()I", "b", "getIndex", "c", "getFlag", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "<init>", "(IIILjava/lang/String;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Block implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Block> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int flag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String data;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<Block> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Block createFromParcel(@NotNull Parcel parcel) {
            return new Block(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Block[] newArray(int i) {
            return new Block[i];
        }
    }

    public Block(int i, int i2, int i3, @NotNull String str) {
        this.header = i;
        this.index = i2;
        this.flag = i3;
        this.data = str;
    }

    public static /* synthetic */ Block copy$default(Block block, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = block.header;
        }
        if ((i4 & 2) != 0) {
            i2 = block.index;
        }
        if ((i4 & 4) != 0) {
            i3 = block.flag;
        }
        if ((i4 & 8) != 0) {
            str = block.data;
        }
        return block.copy(i, i2, i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Block copy(int header, int index, int flag, @NotNull String data) {
        return new Block(header, index, flag, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Block)) {
            return false;
        }
        Block block = (Block) other;
        return this.header == block.header && this.index == block.index && this.flag == block.flag && Intrinsics.areEqual(this.data, block.data);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getHeader() {
        return this.header;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((((this.header * 31) + this.index) * 31) + this.flag) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "Block(header=" + this.header + ", index=" + this.index + ", flag=" + this.flag + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(this.header);
        parcel.writeInt(this.index);
        parcel.writeInt(this.flag);
        parcel.writeString(this.data);
    }
}
