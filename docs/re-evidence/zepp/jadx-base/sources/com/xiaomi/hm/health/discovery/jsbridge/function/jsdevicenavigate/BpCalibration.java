package com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate;

import android.content.Context;
import android.content.Intent;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.discovery.jsbridge.function.NavigateToHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/BpCalibration;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/IJsDeviceNavigate;", "", "position", "", "match", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "data", "", Type.JUMP_MESSAGE, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BpCalibration implements IJsDeviceNavigate {
    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.IJsDeviceNavigate
    public void jump(@NotNull Context context, @NotNull String position, @Nullable String data) {
        NavigateToHandler.startActivity(context, new Intent(context, (Class<?>) BloodPressureCorrectActivity.class));
    }

    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.IJsDeviceNavigate
    public boolean match(@NotNull String position) {
        return Intrinsics.areEqual(position, NavigateContent.APP_GOTO_BP_CALIBRATION);
    }
}
