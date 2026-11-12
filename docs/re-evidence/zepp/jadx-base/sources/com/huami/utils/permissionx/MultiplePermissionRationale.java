package com.huami.utils.permissionx;

import android.app.Activity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "", "Landroid/app/Activity;", "activity", "", "", "permissions", "", "shouldShowRationale", "(Landroid/app/Activity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRationale", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public interface MultiplePermissionRationale {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static Object shouldShowRationale(@NotNull MultiplePermissionRationale multiplePermissionRationale, @NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(PermissionRationaleKt.shouldShowRationale(activity, list));
        }
    }

    @Nullable
    Object shouldShowRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object showRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation);
}
