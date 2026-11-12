package com.huami.utils.permissionx.business;

import android.app.Activity;
import com.huami.utils.permissionx.AppSettingRationaleKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J1\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "", "Landroid/app/Activity;", "activity", "", "", "permissions", "code", "", "shouldShowAppSettingRationale", "showAppSettingRationale", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public interface AppSettingsRationaleWithCode {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean shouldShowAppSettingRationale(@NotNull AppSettingsRationaleWithCode appSettingsRationaleWithCode, @NotNull Activity activity, @NotNull List<String> list, @NotNull String str) {
            return AppSettingRationaleKt.shouldShowAppSettingRationale(activity, list);
        }
    }

    boolean shouldShowAppSettingRationale(@NotNull Activity activity, @NotNull List<String> permissions, @NotNull String code);

    @Nullable
    Object showAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
