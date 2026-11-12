package com.huami.bluetooth.profile.gdsp;

import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\f\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspControl;", "", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeader", "Lkotlin/Function1;", "", "", "result", "startTransfer", "stopTransfer", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GdspControl {
    @Nullable
    DataHeader getDataHeader(@NotNull Calendar calendar, @NotNull HMGDSPType type);

    boolean startTransfer(@NotNull Function1<? super Boolean, Unit> result);

    boolean stopTransfer();
}
