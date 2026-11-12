package com.xiaomi.fitness.common.permission;

import com.mi.health.permission.PermissionAspectJ;
import defpackage.b4s;
import defpackage.nrd;
import defpackage.s69;
import defpackage.srh;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/permission/PermissionCheck;", "", "<init>", "()V", "permissionOnResult", "", "grantedList", "", "", "deniedList", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionCheck {

    @NotNull
    public static final PermissionCheck INSTANCE;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    static {
        ajc$preClinit();
        INSTANCE = new PermissionCheck();
    }

    private PermissionCheck() {
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("PermissionCheck.kt", PermissionCheck.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "permissionOnResult", "com.xiaomi.fitness.common.permission.PermissionCheck", "java.util.List:java.util.List", "grantedList:deniedList", "", "void"), 6);
    }

    public static final /* synthetic */ void permissionOnResult_aroundBody0(PermissionCheck permissionCheck, List list, List list2, nrd nrdVar) {
    }

    public final void permissionOnResult(@Nullable List<String> grantedList, @Nullable List<String> deniedList) {
        PermissionAspectJ.aspectOf().permissionStat(new srh(new Object[]{this, grantedList, deniedList, s69.d(ajc$tjp_0, this, this, grantedList, deniedList)}).c(69648));
    }
}
