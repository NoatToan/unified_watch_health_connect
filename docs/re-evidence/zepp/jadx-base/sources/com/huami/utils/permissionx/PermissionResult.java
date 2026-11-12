package com.huami.utils.permissionx;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "", "AppSettingCancel", "AppSettingDenied", "Granted", "RationaleDenied", "SystemDenied", "Lcom/huami/utils/permissionx/PermissionResult$Granted;", "Lcom/huami/utils/permissionx/PermissionResult$RationaleDenied;", "Lcom/huami/utils/permissionx/PermissionResult$SystemDenied;", "Lcom/huami/utils/permissionx/PermissionResult$AppSettingDenied;", "Lcom/huami/utils/permissionx/PermissionResult$AppSettingCancel;", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public interface PermissionResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult$AppSettingCancel;", "Lcom/huami/utils/permissionx/PermissionResult;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class AppSettingCancel implements PermissionResult {

        @NotNull
        public static final AppSettingCancel INSTANCE = new AppSettingCancel();

        private AppSettingCancel() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult$AppSettingDenied;", "Lcom/huami/utils/permissionx/PermissionResult;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class AppSettingDenied implements PermissionResult {

        @NotNull
        public static final AppSettingDenied INSTANCE = new AppSettingDenied();

        private AppSettingDenied() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult$Granted;", "Lcom/huami/utils/permissionx/PermissionResult;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class Granted implements PermissionResult {

        @NotNull
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult$RationaleDenied;", "Lcom/huami/utils/permissionx/PermissionResult;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class RationaleDenied implements PermissionResult {

        @NotNull
        public static final RationaleDenied INSTANCE = new RationaleDenied();

        private RationaleDenied() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult$SystemDenied;", "Lcom/huami/utils/permissionx/PermissionResult;", "", "a", "Z", "isNeverAsk", "()Z", "<init>", "(Z)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class SystemDenied implements PermissionResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isNeverAsk;

        public SystemDenied(boolean z) {
            this.isNeverAsk = z;
        }

        /* JADX INFO: renamed from: isNeverAsk, reason: from getter */
        public final boolean getIsNeverAsk() {
            return this.isNeverAsk;
        }
    }
}
