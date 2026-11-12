package com.google.accompanist.permissions;

import e23.a;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/accompanist/permissions/PermissionState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MutableMultiplePermissionsState$revokedPermissions$2 extends w implements a<List<? extends PermissionState>> {
    final /* synthetic */ MutableMultiplePermissionsState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsState$revokedPermissions$2(MutableMultiplePermissionsState mutableMultiplePermissionsState) {
        super(0);
        this.this$0 = mutableMultiplePermissionsState;
    }

    @Override // e23.a
    public final List<? extends PermissionState> invoke() {
        List<PermissionState> permissions = this.this$0.getPermissions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (!s.g(((PermissionState) obj).getStatus(), PermissionStatus.Granted.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
