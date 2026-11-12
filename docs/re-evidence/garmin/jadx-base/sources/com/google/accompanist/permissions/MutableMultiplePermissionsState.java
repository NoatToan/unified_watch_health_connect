package com.google.accompanist.permissions;

import f.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.p0;
import p3.x3;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@ExperimentalPermissionsApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u001cR0\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\"\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "", "Lcom/google/accompanist/permissions/MutablePermissionState;", "mutablePermissions", "<init>", "(Ljava/util/List;)V", "", "launchMultiplePermissionRequest", "()V", "", "", "", "permissionsStatus", "updatePermissionsStatus$permissions_release", "(Ljava/util/Map;)V", "updatePermissionsStatus", "Ljava/util/List;", "Lcom/google/accompanist/permissions/PermissionState;", "permissions", "getPermissions", "()Ljava/util/List;", "revokedPermissions$delegate", "Lp3/x3;", "getRevokedPermissions", "revokedPermissions", "allPermissionsGranted$delegate", "getAllPermissionsGranted", "()Z", "allPermissionsGranted", "shouldShowRationale$delegate", "getShouldShowRationale", "shouldShowRationale", "Lf/c;", "", "launcher", "Lf/c;", "getLauncher$permissions_release", "()Lf/c;", "setLauncher$permissions_release", "(Lf/c;)V", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableMultiplePermissionsState implements MultiplePermissionsState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: allPermissionsGranted$delegate, reason: from kotlin metadata */
    private final x3 allPermissionsGranted;
    private c<String[]> launcher;
    private final List<MutablePermissionState> mutablePermissions;
    private final List<PermissionState> permissions;

    /* JADX INFO: renamed from: revokedPermissions$delegate, reason: from kotlin metadata */
    private final x3 revokedPermissions;

    /* JADX INFO: renamed from: shouldShowRationale$delegate, reason: from kotlin metadata */
    private final x3 shouldShowRationale;

    public MutableMultiplePermissionsState(List<MutablePermissionState> list) {
        list.getClass();
        this.mutablePermissions = list;
        this.permissions = list;
        this.revokedPermissions = p0.f(new MutableMultiplePermissionsState$revokedPermissions$2(this));
        this.allPermissionsGranted = p0.f(new MutableMultiplePermissionsState$allPermissionsGranted$2(this));
        this.shouldShowRationale = p0.f(new MutableMultiplePermissionsState$shouldShowRationale$2(this));
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getAllPermissionsGranted() {
        return ((Boolean) this.allPermissionsGranted.getF182175a()).booleanValue();
    }

    public final c<String[]> getLauncher$permissions_release() {
        return this.launcher;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getPermissions() {
        return this.permissions;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getRevokedPermissions() {
        return (List) this.revokedPermissions.getF182175a();
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getShouldShowRationale() {
        return ((Boolean) this.shouldShowRationale.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public void launchMultiplePermissionRequest() {
        c<String[]> cVar = this.launcher;
        Unit unit = null;
        if (cVar != 0) {
            List<PermissionState> permissions = getPermissions();
            ArrayList arrayList = new ArrayList(y.r(permissions, 10));
            Iterator<T> it = permissions.iterator();
            while (it.hasNext()) {
                arrayList.add(((PermissionState) it.next()).getPermission());
            }
            cVar.a(arrayList.toArray(new String[0]), null);
            unit = Unit.INSTANCE;
        }
        if (unit != null) {
            return;
        }
        h.z("ActivityResultLauncher cannot be null");
    }

    public final void setLauncher$permissions_release(c<String[]> cVar) {
        this.launcher = cVar;
    }

    public final void updatePermissionsStatus$permissions_release(Map<String, Boolean> permissionsStatus) {
        Object next;
        permissionsStatus.getClass();
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.mutablePermissions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((MutablePermissionState) next).getPermission(), str));
            MutablePermissionState mutablePermissionState = (MutablePermissionState) next;
            if (mutablePermissionState != null && permissionsStatus.get(str) != null) {
                mutablePermissionState.refreshPermissionStatus$permissions_release();
            }
        }
    }
}
