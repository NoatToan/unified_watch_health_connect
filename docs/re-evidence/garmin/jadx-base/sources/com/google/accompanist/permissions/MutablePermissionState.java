package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import f.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@ExperimentalPermissionsApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/google/accompanist/permissions/MutablePermissionState;", "Lcom/google/accompanist/permissions/PermissionState;", "", "permission", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V", "Lcom/google/accompanist/permissions/PermissionStatus;", "getPermissionStatus", "()Lcom/google/accompanist/permissions/PermissionStatus;", "", "launchPermissionRequest", "()V", "refreshPermissionStatus$permissions_release", "refreshPermissionStatus", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "Landroid/content/Context;", "Landroid/app/Activity;", "<set-?>", "status$delegate", "Lp3/p1;", "getStatus", "setStatus", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "status", "Lf/c;", "launcher", "Lf/c;", "getLauncher$permissions_release", "()Lf/c;", "setLauncher$permissions_release", "(Lf/c;)V", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutablePermissionState implements PermissionState {
    public static final int $stable = 0;
    private final Activity activity;
    private final Context context;
    private c<String> launcher;
    private final String permission;

    /* JADX INFO: renamed from: status$delegate, reason: from kotlin metadata */
    private final p1 status;

    public MutablePermissionState(String str, Context context, Activity activity) {
        str.getClass();
        context.getClass();
        activity.getClass();
        this.permission = str;
        this.context = context;
        this.activity = activity;
        this.status = p0.n(getPermissionStatus());
    }

    private final PermissionStatus getPermissionStatus() {
        return PermissionsUtilKt.checkPermission(this.context, getPermission()) ? PermissionStatus.Granted.INSTANCE : new PermissionStatus.Denied(PermissionsUtilKt.shouldShowRationale(this.activity, getPermission()));
    }

    public final c<String> getLauncher$permissions_release() {
        return this.launcher;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public String getPermission() {
        return this.permission;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public PermissionStatus getStatus() {
        return (PermissionStatus) this.status.getF182175a();
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public void launchPermissionRequest() {
        c<String> cVar = this.launcher;
        Unit unit = null;
        if (cVar != null) {
            cVar.a(getPermission(), null);
            unit = Unit.INSTANCE;
        }
        if (unit != null) {
            return;
        }
        h.z("ActivityResultLauncher cannot be null");
    }

    public final void refreshPermissionStatus$permissions_release() {
        setStatus(getPermissionStatus());
    }

    public final void setLauncher$permissions_release(c<String> cVar) {
        this.launcher = cVar;
    }

    public void setStatus(PermissionStatus permissionStatus) {
        permissionStatus.getClass();
        this.status.setValue(permissionStatus);
    }
}
