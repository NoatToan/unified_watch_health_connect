package com.xiaomi.hm.health.bt.profile.nfc;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", "Ljava/io/Serializable;", "", "isPasswordHaveSetUpSe", "isPasswordHaveNotSetUpSe", "isPasswordIsSetUp", "isPasswordHaveSetUpFlash", "", "component1", "type", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getType", "()I", "<init>", "(I)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PasswordInteractionResponse implements Serializable {
    private static final long serialVersionUID = 1;
    private final int type;

    public PasswordInteractionResponse(int i) {
        this.type = i;
    }

    public static /* synthetic */ PasswordInteractionResponse copy$default(PasswordInteractionResponse passwordInteractionResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = passwordInteractionResponse.type;
        }
        return passwordInteractionResponse.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final PasswordInteractionResponse copy(int type) {
        return new PasswordInteractionResponse(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PasswordInteractionResponse) && this.type == ((PasswordInteractionResponse) other).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.type);
    }

    public final boolean isPasswordHaveNotSetUpSe() {
        return this.type == 1;
    }

    public final boolean isPasswordHaveSetUpFlash() {
        return this.type == 3;
    }

    public final boolean isPasswordHaveSetUpSe() {
        return this.type == 0;
    }

    public final boolean isPasswordIsSetUp() {
        return this.type == 2;
    }

    @NotNull
    public String toString() {
        return "PasswordInteractionResponse(type=" + this.type + ')';
    }
}
