package com.huami.bluetooth.profile.channel.module.assistant.response;

import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated(message = "不再向后兼容")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsUpdateRequest;", "", "", "toBytes", "", "toString", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "component1", "", "component2", "type", "isEnable", "copy", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "getType", "()Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "b", "Z", "()Z", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppCardsUpdateRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final CardType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isEnable;

    public AppCardsUpdateRequest(@NotNull CardType cardType, boolean z) {
        this.type = cardType;
        this.isEnable = z;
    }

    public static /* synthetic */ AppCardsUpdateRequest copy$default(AppCardsUpdateRequest appCardsUpdateRequest, CardType cardType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cardType = appCardsUpdateRequest.type;
        }
        if ((i & 2) != 0) {
            z = appCardsUpdateRequest.isEnable;
        }
        return appCardsUpdateRequest.copy(cardType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final AppCardsUpdateRequest copy(@NotNull CardType type, boolean isEnable) {
        return new AppCardsUpdateRequest(type, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCardsUpdateRequest)) {
            return false;
        }
        AppCardsUpdateRequest appCardsUpdateRequest = (AppCardsUpdateRequest) other;
        return this.type == appCardsUpdateRequest.type && this.isEnable == appCardsUpdateRequest.isEnable;
    }

    @NotNull
    public final CardType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    @NotNull
    public final byte[] toBytes() {
        return ArraysKt___ArraysJvmKt.plus(this.type.tyBytes(), ByteUtilsKt.toByte(this.isEnable));
    }

    @NotNull
    public String toString() {
        return "AppCardsUpdateRequest(type=" + this.type + ", isEnable=" + this.isEnable + ") \n";
    }
}
