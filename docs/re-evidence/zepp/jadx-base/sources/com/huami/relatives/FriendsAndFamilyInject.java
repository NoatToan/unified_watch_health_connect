package com.huami.relatives;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/huami/relatives/FriendsAndFamilyInject;", "", "Landroid/content/Context;", "getAppContext", "Lcom/huami/relatives/ConstantExternal;", "getConstantExternal", "Landroid/app/Activity;", "activity", "", "isMainTabActivityInTabOnCourse", "", "getFlavorProduction", "fromUsername", "", "deviceAlert", "relatives-service_release"}, k = 1, mv = {1, 4, 0})
public interface FriendsAndFamilyInject {
    void deviceAlert(@NotNull String fromUsername);

    @NotNull
    Context getAppContext();

    @NotNull
    ConstantExternal getConstantExternal();

    @NotNull
    String getFlavorProduction();

    boolean isMainTabActivityInTabOnCourse(@Nullable Activity activity);
}
