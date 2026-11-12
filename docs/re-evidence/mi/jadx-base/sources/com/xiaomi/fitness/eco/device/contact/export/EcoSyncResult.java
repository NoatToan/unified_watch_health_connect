package com.xiaomi.fitness.eco.device.contact.export;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.dsf;
import defpackage.qm5;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B#\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b'\u0010(B\t\b\u0016¢\u0006\u0004\b'\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b&\u0010%¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "readPacket", "(Landroid/os/Parcel;)V", "readFromParcel", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "datas", "Ljava/lang/String;", "getDatas", "setDatas", "(Ljava/lang/String;)V", "code", "I", "getCode", "setCode", "(I)V", "Lu7r;", "packet", "Lu7r;", "getPacket", "()Lu7r;", "setPacket", "(Lu7r;)V", "", "isSuccess", "()Z", "isNotSupport", "<init>", "(Ljava/lang/String;ILu7r;)V", "()V", "CREATOR", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public final class EcoSyncResult implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int code;

    @NotNull
    private String datas;

    @Nullable
    private u7r packet;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EcoSyncResult> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoSyncResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoSyncResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoSyncResult[] newArray(int size) {
            return new EcoSyncResult[size];
        }
    }

    public EcoSyncResult(@NotNull String datas, int i, @Nullable u7r u7rVar) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        this.datas = datas;
        this.code = i;
        this.packet = u7rVar;
    }

    private final void readPacket(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            this.packet = qm5.a(bArrCreateByteArray);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDatas() {
        return this.datas;
    }

    @Nullable
    public final u7r getPacket() {
        return this.packet;
    }

    public final boolean isNotSupport() {
        return this.code == 1;
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public final void readFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.datas = String.valueOf(parcel.readString());
        this.code = parcel.readInt();
        readPacket(parcel);
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDatas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.datas = str;
    }

    public final void setPacket(@Nullable u7r u7rVar) {
        this.packet = u7rVar;
    }

    @NotNull
    public String toString() {
        return "EcoSyncResult(code=" + this.code + ", datas=" + this.datas + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.datas);
        dest.writeInt(this.code);
        u7r u7rVar = this.packet;
        if (u7rVar != null) {
            dest.writeByteArray(dsf.i(u7rVar));
        }
    }

    public /* synthetic */ EcoSyncResult(String str, int i, u7r u7rVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, u7rVar);
    }

    public EcoSyncResult() {
        this("", -1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcoSyncResult(@NotNull Parcel parcel) {
        this(String.valueOf(parcel.readString()), parcel.readInt(), null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readPacket(parcel);
    }
}
