package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/bus/MiShiftActionToken;", "", "", "component1", "", "component2", "token", "type", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", LogUtil.I, "getType", "()I", "<init>", "(Ljava/lang/String;I)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MiShiftActionToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @Nullable
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    private final int type;

    public MiShiftActionToken(@Nullable String str, int i) {
        this.token = str;
        this.type = i;
    }

    public static /* synthetic */ MiShiftActionToken copy$default(MiShiftActionToken miShiftActionToken, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = miShiftActionToken.token;
        }
        if ((i2 & 2) != 0) {
            i = miShiftActionToken.type;
        }
        return miShiftActionToken.copy(str, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final MiShiftActionToken copy(@Nullable String token, int type) {
        return new MiShiftActionToken(token, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiShiftActionToken)) {
            return false;
        }
        MiShiftActionToken miShiftActionToken = (MiShiftActionToken) other;
        return Intrinsics.areEqual(this.token, miShiftActionToken.token) && this.type == miShiftActionToken.type;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.token;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "MiShiftActionToken(token=" + ((Object) this.token) + ", type=" + this.type + ')';
    }
}
