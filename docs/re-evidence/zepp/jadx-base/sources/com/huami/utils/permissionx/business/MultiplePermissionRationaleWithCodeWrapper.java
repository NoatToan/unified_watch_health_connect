package com.huami.utils.permissionx.business;

import android.app.Activity;
import com.huami.utils.permissionx.MultiplePermissionRationale;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/utils/permissionx/business/MultiplePermissionRationaleWithCodeWrapper;", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "Landroid/app/Activity;", "activity", "", "", "permissions", "", "shouldShowRationale", "(Landroid/app/Activity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRationale", "a", "Ljava/lang/String;", "code", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "b", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "api", "<init>", "(Ljava/lang/String;Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class MultiplePermissionRationaleWithCodeWrapper implements MultiplePermissionRationale {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PermissionsRationaleWithCode api;

    public MultiplePermissionRationaleWithCodeWrapper(@NotNull String str, @NotNull PermissionsRationaleWithCode permissionsRationaleWithCode) {
        this.code = str;
        this.api = permissionsRationaleWithCode;
    }

    @Override // com.huami.utils.permissionx.MultiplePermissionRationale
    @Nullable
    public Object shouldShowRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return this.api.shouldShowRationale(activity, list, this.code, continuation);
    }

    @Override // com.huami.utils.permissionx.MultiplePermissionRationale
    @Nullable
    public Object showRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return this.api.showRationale(activity, list, this.code, continuation);
    }
}
