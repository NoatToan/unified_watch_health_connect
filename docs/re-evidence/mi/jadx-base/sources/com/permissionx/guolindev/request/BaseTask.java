package com.permissionx.guolindev.request;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import defpackage.bt3;
import defpackage.enk;
import defpackage.g1a;
import defpackage.lj8;
import defpackage.psh;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/permissionx/guolindev/request/BaseTask;", "Lbt3;", "Llj8;", "getExplainScope", "()Llj8;", "Lg1a;", "getForwardScope", "()Lg1a;", "", "finish", "()V", "next", "Lbt3;", "explainReasonScope", "Llj8;", "forwardToSettingsScope", "Lg1a;", "Lcom/permissionx/guolindev/request/PermissionBuilder;", "pb", "Lcom/permissionx/guolindev/request/PermissionBuilder;", "<init>", "(Lcom/permissionx/guolindev/request/PermissionBuilder;)V", "permissionx_release"}, k = 1, mv = {1, 4, 2})
public abstract class BaseTask implements bt3 {
    private lj8 explainReasonScope;
    private g1a forwardToSettingsScope;

    @JvmField
    @Nullable
    public bt3 next;

    @JvmField
    @NotNull
    public PermissionBuilder pb;

    public BaseTask(@NotNull PermissionBuilder pb) {
        Intrinsics.checkNotNullParameter(pb, "pb");
        this.pb = pb;
        this.explainReasonScope = new lj8(pb, this);
        this.forwardToSettingsScope = new g1a(this.pb, this);
        this.explainReasonScope = new lj8(this.pb, this);
        this.forwardToSettingsScope = new g1a(this.pb, this);
    }

    @Override // defpackage.bt3
    public void finish() {
        bt3 bt3Var = this.next;
        if (bt3Var != null) {
            bt3Var.request();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.pb.deniedPermissions);
        arrayList.addAll(this.pb.permanentDeniedPermissions);
        arrayList.addAll(this.pb.permissionsWontRequest);
        if (this.pb.shouldRequestBackgroundLocationPermission()) {
            if (psh.c(this.pb.getActivity(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                this.pb.grantedPermissions.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            } else {
                arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
        }
        if (this.pb.shouldRequestSystemAlertWindowPermission() && this.pb.getTargetSdkVersion() >= 23) {
            if (Settings.canDrawOverlays(this.pb.getActivity())) {
                this.pb.grantedPermissions.add("android.permission.SYSTEM_ALERT_WINDOW");
            } else {
                arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
            }
        }
        if (this.pb.shouldRequestWriteSettingsPermission() && this.pb.getTargetSdkVersion() >= 23) {
            if (Settings.System.canWrite(this.pb.getActivity())) {
                this.pb.grantedPermissions.add("android.permission.WRITE_SETTINGS");
            } else {
                arrayList.add("android.permission.WRITE_SETTINGS");
            }
        }
        if (this.pb.shouldRequestManageExternalStoragePermission()) {
            if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            } else {
                this.pb.grantedPermissions.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            }
        }
        enk enkVar = this.pb.requestCallback;
        if (enkVar != null) {
            Intrinsics.checkNotNull(enkVar);
            enkVar.onResult(arrayList.isEmpty(), new ArrayList(this.pb.grantedPermissions), arrayList);
        }
        this.pb.removeInvisibleFragment$permissionx_release();
    }

    @NotNull
    /* JADX INFO: renamed from: getExplainScope, reason: from getter */
    public lj8 getExplainReasonScope() {
        return this.explainReasonScope;
    }

    @NotNull
    /* JADX INFO: renamed from: getForwardScope, reason: from getter */
    public g1a getForwardToSettingsScope() {
        return this.forwardToSettingsScope;
    }

    @Override // defpackage.bt3
    public abstract /* synthetic */ void request();

    @Override // defpackage.bt3
    public abstract /* synthetic */ void requestAgain(List list);
}
