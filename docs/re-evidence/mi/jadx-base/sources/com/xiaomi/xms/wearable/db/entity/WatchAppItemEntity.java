package com.xiaomi.xms.wearable.db.entity;

import androidx.room.Entity;
import com.mibi.sdk.common.CommonConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Entity(primaryKeys = {"packageName", "did"}, tableName = "watch_app_item")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "", "packageName", "", "did", "fingerprint", "", "canRemove", "", "appName", CommonConstants.KEY_VERSION_CODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BZLjava/lang/String;I)V", "getPackageName", "()Ljava/lang/String;", "getDid", "getFingerprint", "()[B", "getCanRemove", "()Z", "getAppName", "getVersionCode", "()I", "equals", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "toString", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchAppItemEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appName;
    private final boolean canRemove;

    @NotNull
    private final String did;

    @NotNull
    private final byte[] fingerprint;

    @NotNull
    private final String packageName;
    private final int versionCode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity$Companion;", "", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WatchAppItemEntity(@NotNull String packageName, @NotNull String did, @NotNull byte[] fingerprint, boolean z, @NotNull String appName, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.packageName = packageName;
        this.did = did;
        this.fingerprint = fingerprint;
        this.canRemove = z;
        this.appName = appName;
        this.versionCode = i;
    }

    public static /* synthetic */ WatchAppItemEntity copy$default(WatchAppItemEntity watchAppItemEntity, String str, String str2, byte[] bArr, boolean z, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = watchAppItemEntity.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = watchAppItemEntity.did;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            bArr = watchAppItemEntity.fingerprint;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            z = watchAppItemEntity.canRemove;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = watchAppItemEntity.appName;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            i = watchAppItemEntity.versionCode;
        }
        return watchAppItemEntity.copy(str, str4, bArr2, z2, str5, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanRemove() {
        return this.canRemove;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final WatchAppItemEntity copy(@NotNull String packageName, @NotNull String did, @NotNull byte[] fingerprint, boolean canRemove, @NotNull String appName, int versionCode) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new WatchAppItemEntity(packageName, did, fingerprint, canRemove, appName, versionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(WatchAppItemEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity");
        WatchAppItemEntity watchAppItemEntity = (WatchAppItemEntity) other;
        return Intrinsics.areEqual(this.packageName, watchAppItemEntity.packageName) && Intrinsics.areEqual(this.did, watchAppItemEntity.did) && Arrays.equals(this.fingerprint, watchAppItemEntity.fingerprint) && this.canRemove == watchAppItemEntity.canRemove && Intrinsics.areEqual(this.appName, watchAppItemEntity.appName) && this.versionCode == watchAppItemEntity.versionCode;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final boolean getCanRemove() {
        return this.canRemove;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final byte[] getFingerprint() {
        return this.fingerprint;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.did.hashCode()) * 31) + Arrays.hashCode(this.fingerprint)) * 31) + Boolean.hashCode(this.canRemove)) * 31) + this.appName.hashCode()) * 31) + this.versionCode;
    }

    @NotNull
    public String toString() {
        return "WatchAppItemEntity(packageName=" + this.packageName + ", did=" + this.did + ", fingerprint=" + Arrays.toString(this.fingerprint) + ", canRemove=" + this.canRemove + ", appName=" + this.appName + ", versionCode=" + this.versionCode + ")";
    }
}
