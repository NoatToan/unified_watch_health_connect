package com.huami.utils.permissionx;

import android.app.Activity;
import com.huami.utils.permissionx.rationale.PermissionRationaleInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/utils/permissionx/PermissionRationaleConfig;", "", "Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "info", "", "addRationale", "addAppSettingRationale", "Lkotlin/Function1;", "Landroid/app/Activity;", "router", "setPermissionDetailsRouter", "", "", "a", "Ljava/util/Map;", "getRationalesMap$permissionx_release", "()Ljava/util/Map;", "rationalesMap", "b", "getAppSettingsMap$permissionx_release", "appSettingsMap", "c", "Lkotlin/jvm/functions/Function1;", "getGoPermissionDetails$permissionx_release", "()Lkotlin/jvm/functions/Function1;", "setGoPermissionDetails$permissionx_release", "(Lkotlin/jvm/functions/Function1;)V", "goPermissionDetails", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionRationaleConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, PermissionRationaleInfo> rationalesMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, PermissionRationaleInfo> appSettingsMap = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Activity, Unit> goPermissionDetails;

    public final void addAppSettingRationale(@NotNull PermissionRationaleInfo info) {
        this.appSettingsMap.put(PermissionRationaleConfigKt.getId(info.getPermissions()), info);
    }

    public final void addRationale(@NotNull PermissionRationaleInfo info) {
        this.rationalesMap.put(PermissionRationaleConfigKt.getId(info.getPermissions()), info);
    }

    @NotNull
    public final Map<String, PermissionRationaleInfo> getAppSettingsMap$permissionx_release() {
        return this.appSettingsMap;
    }

    @Nullable
    public final Function1<Activity, Unit> getGoPermissionDetails$permissionx_release() {
        return this.goPermissionDetails;
    }

    @NotNull
    public final Map<String, PermissionRationaleInfo> getRationalesMap$permissionx_release() {
        return this.rationalesMap;
    }

    public final void setGoPermissionDetails$permissionx_release(@Nullable Function1<? super Activity, Unit> function1) {
        this.goPermissionDetails = function1;
    }

    public final void setPermissionDetailsRouter(@NotNull Function1<? super Activity, Unit> router) {
        this.goPermissionDetails = router;
    }
}
