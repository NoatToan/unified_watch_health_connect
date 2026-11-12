package com.huami.bluetooth.profile.generic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÂ\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\u0011\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericNotify;", "", "", "a", "b", "c", GoogleApiAvailabilityLight.a, "", "isEnd", "", "component5$bluetooth_release", "()[B", "component5", "opCode", "version", "type", "index", "data", "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "e", "[B", "getData$bluetooth_release", "<init>", "(IIII[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GenericNotify {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int opCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    public GenericNotify(int i, int i2, int i3, int i4, @NotNull byte[] bArr) {
        this.opCode = i;
        this.version = i2;
        this.type = i3;
        this.index = i4;
        this.data = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getOpCode() {
        return this.opCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final int getType() {
        return this.type;
    }

    public static /* synthetic */ GenericNotify copy$default(GenericNotify genericNotify, int i, int i2, int i3, int i4, byte[] bArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = genericNotify.opCode;
        }
        if ((i5 & 2) != 0) {
            i2 = genericNotify.version;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = genericNotify.type;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = genericNotify.index;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            bArr = genericNotify.data;
        }
        return genericNotify.copy(i, i6, i7, i8, bArr);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component5$bluetooth_release, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final GenericNotify copy(int opCode, int version, int type, int index, @NotNull byte[] data) {
        return new GenericNotify(opCode, version, type, index, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericNotify)) {
            return false;
        }
        GenericNotify genericNotify = (GenericNotify) other;
        return this.opCode == genericNotify.opCode && this.version == genericNotify.version && this.type == genericNotify.type && this.index == genericNotify.index && Intrinsics.areEqual(this.data, genericNotify.data);
    }

    @NotNull
    public final byte[] getData$bluetooth_release() {
        return this.data;
    }

    public int hashCode() {
        return (((((((this.opCode * 31) + this.version) * 31) + this.type) * 31) + this.index) * 31) + Arrays.hashCode(this.data);
    }

    public final boolean isEnd() {
        int i = this.type;
        return i == 2 || i == 3;
    }

    @NotNull
    public String toString() {
        return "GenericNotify(opCode=" + this.opCode + ", version=" + this.version + ", type=" + this.type + ", index=" + this.index + ", data=" + Arrays.toString(this.data) + ')';
    }
}
