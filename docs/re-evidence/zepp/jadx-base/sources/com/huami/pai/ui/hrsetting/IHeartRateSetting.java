package com.huami.pai.ui.hrsetting;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "showHrSetting", "Landroidx/lifecycle/LiveData;", "setHeartRate", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateSetting {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean showHrSetting(@NotNull IHeartRateSetting iHeartRateSetting, @NotNull Context context) {
            return false;
        }
    }

    @Nullable
    LiveData<Boolean> setHeartRate(@Nullable Context context);

    boolean showHrSetting(@NotNull Context context);
}
