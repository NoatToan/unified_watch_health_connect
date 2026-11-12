package com.xiaomi.fitness.pay.export.data.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.mibi.sdk.component.Constants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "Landroid/os/Parcelable;", Constants.KEY_PAY_RESULT_RET, "", Constants.KEY_PAY_RESULT_SENDERSIGN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getRet", "()Ljava/lang/String;", "getSenderSign", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MibiPayResult implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String ret;

    @Nullable
    private final String senderSign;

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.export.data.response.MibiPayResult$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<MibiPayResult> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MibiPayResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MibiPayResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MibiPayResult[] newArray(int size) {
            return new MibiPayResult[size];
        }
    }

    public MibiPayResult(@Nullable String str, @Nullable String str2) {
        this.ret = str;
        this.senderSign = str2;
    }

    public static /* synthetic */ MibiPayResult copy$default(MibiPayResult mibiPayResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mibiPayResult.ret;
        }
        if ((i & 2) != 0) {
            str2 = mibiPayResult.senderSign;
        }
        return mibiPayResult.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSenderSign() {
        return this.senderSign;
    }

    @NotNull
    public final MibiPayResult copy(@Nullable String ret, @Nullable String senderSign) {
        return new MibiPayResult(ret, senderSign);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MibiPayResult)) {
            return false;
        }
        MibiPayResult mibiPayResult = (MibiPayResult) other;
        return Intrinsics.areEqual(this.ret, mibiPayResult.ret) && Intrinsics.areEqual(this.senderSign, mibiPayResult.senderSign);
    }

    @Nullable
    public final String getRet() {
        return this.ret;
    }

    @Nullable
    public final String getSenderSign() {
        return this.senderSign;
    }

    public int hashCode() {
        String str = this.ret;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderSign;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MibiPayResult(ret=" + this.ret + ", senderSign=" + this.senderSign + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.ret);
        parcel.writeString(this.senderSign);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MibiPayResult(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
