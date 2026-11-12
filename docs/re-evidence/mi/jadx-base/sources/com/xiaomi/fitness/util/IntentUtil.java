package com.xiaomi.fitness.util;

import android.app.NotificationChannel;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.cxg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/util/IntentUtil;", "", "<init>", "()V", "isNotifyEnable", "", "channelId", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentUtil {

    @NotNull
    public static final IntentUtil INSTANCE = new IntentUtil();

    private IntentUtil() {
    }

    public final boolean isNotifyEnable(@Nullable String channelId) {
        cxg cxgVarB = cxg.b(AppUtil.getApp());
        Intrinsics.checkNotNullExpressionValue(cxgVarB, "from(...)");
        if (!cxgVarB.a()) {
            return false;
        }
        Intrinsics.checkNotNull(channelId);
        NotificationChannel notificationChannelD = cxgVarB.d(channelId);
        return notificationChannelD == null || notificationChannelD.getImportance() != 0;
    }
}
