package com.huami.pai.device;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/pai/device/IPaiDevice;", "", "Landroidx/lifecycle/LiveData;", "", "supportPaiInDevice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "supportPaiButDisabled", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IPaiDevice {
    @NotNull
    LiveData<Boolean> supportPaiButDisabled(@NotNull Context context);

    @NotNull
    LiveData<Boolean> supportPaiInDevice();
}
