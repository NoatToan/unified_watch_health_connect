package com.huami.utils.permissionx.rationale;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006!"}, d2 = {"Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", "permissions", "messageResId", "titleResId", "copy", "(Ljava/util/List;ILjava/lang/Integer;)Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "b", LogUtil.I, "getMessageResId", "()I", "c", "Ljava/lang/Integer;", "getTitleResId", "<init>", "(Ljava/util/List;ILjava/lang/Integer;)V", "Companion", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PermissionRationaleInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> permissions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int messageResId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer titleResId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo$Companion;", "", "", PointCategory.PERMISSION, "", "message", "titleResId", "Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "create", "(Ljava/lang/String;ILjava/lang/Integer;)Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "", "permissions", "createMultiple", "(Ljava/util/List;ILjava/lang/Integer;)Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PermissionRationaleInfo create$default(Companion companion, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                num = null;
            }
            return companion.create(str, i, num);
        }

        public static /* synthetic */ PermissionRationaleInfo createMultiple$default(Companion companion, List list, int i, Integer num, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                num = null;
            }
            return companion.createMultiple(list, i, num);
        }

        @JvmStatic
        @NotNull
        public final PermissionRationaleInfo create(@NotNull String permission, int message, @Nullable Integer titleResId) {
            return new PermissionRationaleInfo(e.listOf(permission), message, titleResId);
        }

        @JvmStatic
        @NotNull
        public final PermissionRationaleInfo createMultiple(@NotNull List<String> permissions, int message, @Nullable Integer titleResId) {
            return new PermissionRationaleInfo(permissions, message, titleResId);
        }
    }

    public PermissionRationaleInfo(@NotNull List<String> list, int i, @Nullable Integer num) {
        this.permissions = list;
        this.messageResId = i;
        this.titleResId = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionRationaleInfo copy$default(PermissionRationaleInfo permissionRationaleInfo, List list, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = permissionRationaleInfo.permissions;
        }
        if ((i2 & 2) != 0) {
            i = permissionRationaleInfo.messageResId;
        }
        if ((i2 & 4) != 0) {
            num = permissionRationaleInfo.titleResId;
        }
        return permissionRationaleInfo.copy(list, i, num);
    }

    @JvmStatic
    @NotNull
    public static final PermissionRationaleInfo create(@NotNull String str, int i, @Nullable Integer num) {
        return INSTANCE.create(str, i, num);
    }

    @JvmStatic
    @NotNull
    public static final PermissionRationaleInfo createMultiple(@NotNull List<String> list, int i, @Nullable Integer num) {
        return INSTANCE.createMultiple(list, i, num);
    }

    @NotNull
    public final List<String> component1() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessageResId() {
        return this.messageResId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTitleResId() {
        return this.titleResId;
    }

    @NotNull
    public final PermissionRationaleInfo copy(@NotNull List<String> permissions, int messageResId, @Nullable Integer titleResId) {
        return new PermissionRationaleInfo(permissions, messageResId, titleResId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRationaleInfo)) {
            return false;
        }
        PermissionRationaleInfo permissionRationaleInfo = (PermissionRationaleInfo) other;
        return Intrinsics.areEqual(this.permissions, permissionRationaleInfo.permissions) && this.messageResId == permissionRationaleInfo.messageResId && Intrinsics.areEqual(this.titleResId, permissionRationaleInfo.titleResId);
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.permissions;
    }

    @Nullable
    public final Integer getTitleResId() {
        return this.titleResId;
    }

    public int hashCode() {
        int iHashCode = ((this.permissions.hashCode() * 31) + this.messageResId) * 31;
        Integer num = this.titleResId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "PermissionRationaleInfo(permissions=" + this.permissions + ", messageResId=" + this.messageResId + ", titleResId=" + this.titleResId + ')';
    }
}
