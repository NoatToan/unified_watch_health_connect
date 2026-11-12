package defpackage;

import com.mibi.sdk.common.CommonConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lo4;", "", "", "toString", "", "hashCode", "other", "", "equals", CommonConstants.KEY_VERSION_CODE, "I", PluginDeviceInfo.FDESC, "()I", "encryptEnable", "Ljava/lang/Boolean;", PluginDeviceInfo.FMODEL, "()Ljava/lang/Boolean;", "<init>", "(ILjava/lang/Boolean;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ChannelVersion {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int versionCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final Boolean encryptEnable;

    /* JADX INFO: renamed from: o4$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lo4$a;", "", "", "byteArray", "Lo4;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ChannelVersion a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (byteArray.length == 0) {
                return new ChannelVersion(i, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            }
            w2 w2Var = new w2(byteArray, 0, 2, null);
            return new ChannelVersion(w2Var.c(), w2Var.h() > 0 ? Boolean.valueOf(w2Var.b()) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelVersion() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
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

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.versionCode) * 31;
        Boolean bool = this.encryptEnable;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChannelVersion(versionCode=" + this.versionCode + ", encryptEnable=" + this.encryptEnable + ')';
    }

    public ChannelVersion(int i, @Nullable Boolean bool) {
        this.versionCode = i;
        this.encryptEnable = bool;
    }

    public /* synthetic */ ChannelVersion(int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? Boolean.FALSE : bool);
    }
}
