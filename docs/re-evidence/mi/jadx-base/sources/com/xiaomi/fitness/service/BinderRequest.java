package com.xiaomi.fitness.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/service/BinderRequest;", "Landroid/os/Parcelable;", "clientVersion", "", "binderCode", "<init>", "(II)V", "getClientVersion", "()I", "getBinderCode", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BinderRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BinderRequest> CREATOR = new Creator();
    private final int binderCode;
    private final int clientVersion;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BinderRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinderRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinderRequest(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinderRequest[] newArray(int i) {
            return new BinderRequest[i];
        }
    }

    public BinderRequest(int i, int i2) {
        this.clientVersion = i;
        this.binderCode = i2;
    }

    public static /* synthetic */ BinderRequest copy$default(BinderRequest binderRequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = binderRequest.clientVersion;
        }
        if ((i3 & 2) != 0) {
            i2 = binderRequest.binderCode;
        }
        return binderRequest.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClientVersion() {
        return this.clientVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBinderCode() {
        return this.binderCode;
    }

    @NotNull
    public final BinderRequest copy(int clientVersion, int binderCode) {
        return new BinderRequest(clientVersion, binderCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinderRequest)) {
            return false;
        }
        BinderRequest binderRequest = (BinderRequest) other;
        return this.clientVersion == binderRequest.clientVersion && this.binderCode == binderRequest.binderCode;
    }

    public final int getBinderCode() {
        return this.binderCode;
    }

    public final int getClientVersion() {
        return this.clientVersion;
    }

    public int hashCode() {
        return (Integer.hashCode(this.clientVersion) * 31) + Integer.hashCode(this.binderCode);
    }

    @NotNull
    public String toString() {
        return "BinderRequest(clientVersion=" + this.clientVersion + ", binderCode=" + this.binderCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.clientVersion);
        dest.writeInt(this.binderCode);
    }
}
