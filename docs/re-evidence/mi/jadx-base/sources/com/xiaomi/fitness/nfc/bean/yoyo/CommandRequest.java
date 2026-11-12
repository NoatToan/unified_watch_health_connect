package com.xiaomi.fitness.nfc.bean.yoyo;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010(\u001a\u00020)2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J'\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020+HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000e¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "Landroid/os/Parcelable;", "cplc", "", "device_id", "device_model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "getDevice_id", "setDevice_id", "getDevice_model", "setDevice_model", "action_type", "getAction_type", "setAction_type", "resp_apdu", "Ljava/util/ArrayList;", "getResp_apdu", "()Ljava/util/ArrayList;", "setResp_apdu", "(Ljava/util/ArrayList;)V", "service_operation", "getService_operation", "setService_operation", "order_no", "getOrder_no", "setOrder_no", "face_no", "getFace_no", "setFace_no", "logical_no", "getLogical_no", "setLogical_no", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommandRequest implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String action_type;

    @NotNull
    private String cplc;

    @NotNull
    private String device_id;

    @NotNull
    private String device_model;

    @Nullable
    private String face_no;

    @Nullable
    private String logical_no;

    @Nullable
    private String order_no;

    @NotNull
    private ArrayList<String> resp_apdu;

    @NotNull
    private String service_operation;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CommandRequest> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommandRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommandRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommandRequest[] newArray(int size) {
            return new CommandRequest[size];
        }
    }

    public CommandRequest(@NotNull String cplc, @NotNull String device_id, @NotNull String device_model) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(device_model, "device_model");
        this.cplc = cplc;
        this.device_id = device_id;
        this.device_model = device_model;
        this.action_type = "00";
        this.resp_apdu = new ArrayList<>();
        this.service_operation = "1";
    }

    public static /* synthetic */ CommandRequest copy$default(CommandRequest commandRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandRequest.cplc;
        }
        if ((i & 2) != 0) {
            str2 = commandRequest.device_id;
        }
        if ((i & 4) != 0) {
            str3 = commandRequest.device_model;
        }
        return commandRequest.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevice_model() {
        return this.device_model;
    }

    @NotNull
    public final CommandRequest copy(@NotNull String cplc, @NotNull String device_id, @NotNull String device_model) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(device_model, "device_model");
        return new CommandRequest(cplc, device_id, device_model);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandRequest)) {
            return false;
        }
        CommandRequest commandRequest = (CommandRequest) other;
        return Intrinsics.areEqual(this.cplc, commandRequest.cplc) && Intrinsics.areEqual(this.device_id, commandRequest.device_id) && Intrinsics.areEqual(this.device_model, commandRequest.device_model);
    }

    @NotNull
    public final String getAction_type() {
        return this.action_type;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    public final String getDevice_model() {
        return this.device_model;
    }

    @Nullable
    public final String getFace_no() {
        return this.face_no;
    }

    @Nullable
    public final String getLogical_no() {
        return this.logical_no;
    }

    @Nullable
    public final String getOrder_no() {
        return this.order_no;
    }

    @NotNull
    public final ArrayList<String> getResp_apdu() {
        return this.resp_apdu;
    }

    @NotNull
    public final String getService_operation() {
        return this.service_operation;
    }

    public int hashCode() {
        return (((this.cplc.hashCode() * 31) + this.device_id.hashCode()) * 31) + this.device_model.hashCode();
    }

    public final void setAction_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action_type = str;
    }

    public final void setCplc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cplc = str;
    }

    public final void setDevice_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_id = str;
    }

    public final void setDevice_model(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_model = str;
    }

    public final void setFace_no(@Nullable String str) {
        this.face_no = str;
    }

    public final void setLogical_no(@Nullable String str) {
        this.logical_no = str;
    }

    public final void setOrder_no(@Nullable String str) {
        this.order_no = str;
    }

    public final void setResp_apdu(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.resp_apdu = arrayList;
    }

    public final void setService_operation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.service_operation = str;
    }

    @NotNull
    public String toString() {
        return "CommandRequest(cplc=" + this.cplc + ", device_id=" + this.device_id + ", device_model=" + this.device_model + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.cplc);
        parcel.writeString(this.device_id);
        parcel.writeString(this.device_model);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CommandRequest(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        String string3 = parcel.readString();
        Intrinsics.checkNotNull(string3);
        this(string, string2, string3);
    }
}
