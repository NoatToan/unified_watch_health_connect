package com.google.accompanist.permissions;

import e23.a;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MutableMultiplePermissionsState$shouldShowRationale$2 extends w implements a<Boolean> {
    final /* synthetic */ MutableMultiplePermissionsState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsState$shouldShowRationale$2(MutableMultiplePermissionsState mutableMultiplePermissionsState) {
        super(0);
        this.this$0 = mutableMultiplePermissionsState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Boolean invoke() {
        List<PermissionState> permissions = this.this$0.getPermissions();
        boolean z14 = false;
        if (permissions == null || !permissions.isEmpty()) {
            Iterator<T> it = permissions.iterator();
            while (it.hasNext()) {
                if (PermissionsUtilKt.getShouldShowRationale(((PermissionState) it.next()).getStatus())) {
                    z14 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
