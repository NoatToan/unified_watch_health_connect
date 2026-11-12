package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPVersion;", "", "", "component1", "version", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getVersion", "()I", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GDSPVersion {
    public static final int VERSION_0 = 0;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final GDSPVersion b = new GDSPVersion(-1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPVersion$Companion;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPVersion;", "INVALID_VERSION", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPVersion;", "getINVALID_VERSION", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPVersion;", "", "VERSION_0", LogUtil.I, "VERSION_1", "VERSION_2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GDSPVersion getINVALID_VERSION() {
            return GDSPVersion.b;
        }
    }

    public GDSPVersion(int i) {
        this.version = i;
    }

    public static /* synthetic */ GDSPVersion copy$default(GDSPVersion gDSPVersion, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gDSPVersion.version;
        }
        return gDSPVersion.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final GDSPVersion copy(int version) {
        return new GDSPVersion(version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GDSPVersion) && this.version == ((GDSPVersion) other).version;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version;
    }

    @NotNull
    public String toString() {
        return "GDSPVersion(version=" + this.version + ')';
    }
}
