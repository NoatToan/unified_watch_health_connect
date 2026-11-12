package com.huami.utils.permissionx;

import android.app.Activity;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/utils/permissionx/PlatformApi;", "", "Landroid/app/Activity;", "hostActivity", "", PointCategory.PERMISSION, "", "isGranted", "shouldShowRationale", "", "permissions", "", "isAllGranted", "requestPermission", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMultiplePermission", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "navigationAppDetailsSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public interface PlatformApi {
    @NotNull
    Activity hostActivity();

    @NotNull
    Map<String, Boolean> isAllGranted(@NotNull List<String> permissions);

    boolean isGranted(@NotNull String permission);

    @Nullable
    Object navigationAppDetailsSetting(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object requestMultiplePermission(@NotNull List<String> list, @NotNull Continuation<? super Map<String, Boolean>> continuation);

    @Nullable
    Object requestPermission(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    boolean shouldShowRationale(@NotNull String permission);

    boolean shouldShowRationale(@NotNull List<String> permissions);
}
