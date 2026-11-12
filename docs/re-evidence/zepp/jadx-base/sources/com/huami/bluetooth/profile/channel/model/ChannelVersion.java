package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "", "", "component1", "", "component2", "()Ljava/lang/Boolean;", "versionCode", "encryptEnable", "copy", "(ILjava/lang/Boolean;)Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersionCode", "()I", "b", "Ljava/lang/Boolean;", "getEncryptEnable", "<init>", "(ILjava/lang/Boolean;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChannelVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int versionCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean encryptEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelVersion$Companion;", "", "", "byteArray", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ChannelVersion parse(@NotNull byte[] byteArray) {
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (byteArray.length == 0) {
                return new ChannelVersion(i, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            }
            BufByteDecoder bufByteDecoder = new BufByteDecoder(byteArray, 0, 2, null);
            return new ChannelVersion(bufByteDecoder.readByte(), bufByteDecoder.remain() > 0 ? Boolean.valueOf(bufByteDecoder.readBoolean()) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelVersion() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public ChannelVersion(int i, @Nullable Boolean bool) {
        this.versionCode = i;
        this.encryptEnable = bool;
    }

    public static /* synthetic */ ChannelVersion copy$default(ChannelVersion channelVersion, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = channelVersion.versionCode;
        }
        if ((i2 & 2) != 0) {
            bool = channelVersion.encryptEnable;
        }
        return channelVersion.copy(i, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    @NotNull
    public final ChannelVersion copy(int versionCode, @Nullable Boolean encryptEnable) {
        return new ChannelVersion(versionCode, encryptEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelVersion)) {
            return false;
        }
        ChannelVersion channelVersion = (ChannelVersion) other;
        return this.versionCode == channelVersion.versionCode && Intrinsics.areEqual(this.encryptEnable, channelVersion.encryptEnable);
    }

    @Nullable
    public final Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        int i = this.versionCode * 31;
        Boolean bool = this.encryptEnable;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChannelVersion(versionCode=" + this.versionCode + ", encryptEnable=" + this.encryptEnable + ')';
    }

    public /* synthetic */ ChannelVersion(int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? Boolean.FALSE : bool);
    }
}
