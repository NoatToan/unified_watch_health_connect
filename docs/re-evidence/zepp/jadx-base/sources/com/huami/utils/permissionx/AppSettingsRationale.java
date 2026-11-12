package com.huami.utils.permissionx;

import android.app.Activity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J)\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/utils/permissionx/AppSettingsRationale;", "", "Landroid/app/Activity;", "activity", "", "", "permissions", "", "shouldShowAppSettingRationale", "showAppSettingRationale", "(Landroid/app/Activity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public interface AppSettingsRationale {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean shouldShowAppSettingRationale(@NotNull AppSettingsRationale appSettingsRationale, @NotNull Activity activity, @NotNull List<String> list) {
            return AppSettingRationaleKt.shouldShowAppSettingRationale(activity, list);
        }
    }

    boolean shouldShowAppSettingRationale(@NotNull Activity activity, @NotNull List<String> permissions);

    @Nullable
    Object showAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation);
}
