package com.huami.bluetooth.profile.channel.module.auth;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "", "", "allowLocalBind", "", "component1", "component2", "component3", "version", "apiLevel", "allowLocalBinding", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "getApiLevel", "c", "getAllowLocalBinding", "<init>", "(III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthorizationProtocolInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int apiLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int allowLocalBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo$Companion;", "", "", "byteArray", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "fromBytes", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AuthorizationProtocolInfo fromBytes(@Nullable byte[] byteArray) {
            if (byteArray == null) {
                return null;
            }
            ByteDecoder byteDecoder = new ByteDecoder(byteArray);
            return new AuthorizationProtocolInfo(byteDecoder.readByte(), byteDecoder.readShort(), byteDecoder.readByte());
        }
    }

    public AuthorizationProtocolInfo(int i, int i2, int i3) {
        this.version = i;
        this.apiLevel = i2;
        this.allowLocalBinding = i3;
    }

    public static /* synthetic */ AuthorizationProtocolInfo copy$default(AuthorizationProtocolInfo authorizationProtocolInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = authorizationProtocolInfo.version;
        }
        if ((i4 & 2) != 0) {
            i2 = authorizationProtocolInfo.apiLevel;
        }
        if ((i4 & 4) != 0) {
            i3 = authorizationProtocolInfo.allowLocalBinding;
        }
        return authorizationProtocolInfo.copy(i, i2, i3);
    }

    public final boolean allowLocalBind() {
        return this.allowLocalBinding == 1;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getApiLevel() {
        return this.apiLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAllowLocalBinding() {
        return this.allowLocalBinding;
    }

    @NotNull
    public final AuthorizationProtocolInfo copy(int version, int apiLevel, int allowLocalBinding) {
        return new AuthorizationProtocolInfo(version, apiLevel, allowLocalBinding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationProtocolInfo)) {
            return false;
        }
        AuthorizationProtocolInfo authorizationProtocolInfo = (AuthorizationProtocolInfo) other;
        return this.version == authorizationProtocolInfo.version && this.apiLevel == authorizationProtocolInfo.apiLevel && this.allowLocalBinding == authorizationProtocolInfo.allowLocalBinding;
    }

    public final int getAllowLocalBinding() {
        return this.allowLocalBinding;
    }

    public final int getApiLevel() {
        return this.apiLevel;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + this.apiLevel) * 31) + this.allowLocalBinding;
    }

    @NotNull
    public String toString() {
        return "AuthorizationProtocolInfo(version=" + this.version + ", apiLevel=" + this.apiLevel + ", allowLocalBinding=" + this.allowLocalBinding + ')';
    }
}
