package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "stopReason", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getStopReason", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "writeToParcel", "", ParamConstants.Param.FLAGS, "Companion", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ParcelableInterruptRequest implements Parcelable {
    private final String id;
    private final int stopReason;
    public static final Parcelable.Creator<ParcelableInterruptRequest> CREATOR = new Parcelable.Creator<ParcelableInterruptRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableInterruptRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest createFromParcel(Parcel parcel) {
            zcp.c(parcel, "");
            return new ParcelableInterruptRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableInterruptRequest[] newArray(int size) {
            return new ParcelableInterruptRequest[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableInterruptRequest(String str, int i) {
        zcp.c(str, "");
        this.id = str;
        this.stopReason = i;
    }

    public final String getId() {
        return this.id;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParcelableInterruptRequest(Parcel parcel) {
        zcp.c(parcel, "");
        String string = parcel.readString();
        zcp.e((Object) string);
        this(string, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zcp.c(parcel, "");
        parcel.writeString(this.id);
        parcel.writeInt(this.stopReason);
    }

    public String toString() {
        return "ParcelableInterruptRequest(id=" + this.id + ", stopReason=" + this.stopReason + g4.l;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Integer.hashCode(this.stopReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelableInterruptRequest)) {
            return false;
        }
        ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) other;
        return zcp.b((Object) this.id, (Object) parcelableInterruptRequest.id) && this.stopReason == parcelableInterruptRequest.stopReason;
    }

    public final ParcelableInterruptRequest copy(String id, int stopReason) {
        zcp.c(id, "");
        return new ParcelableInterruptRequest(id, stopReason);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public static /* synthetic */ ParcelableInterruptRequest copy$default(ParcelableInterruptRequest parcelableInterruptRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = parcelableInterruptRequest.id;
        }
        if ((i2 & 2) != 0) {
            i = parcelableInterruptRequest.stopReason;
        }
        return parcelableInterruptRequest.copy(str, i);
    }
}
