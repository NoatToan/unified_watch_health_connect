package com.xiaomi.xms.wearable.extensions;

import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import defpackage.acp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity$Companion;", "Lacp;", "appItem", "", "did", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "valueOf", "(Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity$Companion;Lacp;Ljava/lang/String;)Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "xmswearable_release"}, k = 2, mv = {2, 0, 0})
public final class WatchAppItemEntityExtKt {
    @NotNull
    public static final WatchAppItemEntity valueOf(@NotNull WatchAppItemEntity.Companion companion, @NotNull acp appItem, @NotNull String did) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(appItem, "appItem");
        Intrinsics.checkNotNullParameter(did, "did");
        String packageName = appItem.c;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        byte[] fingerprint = appItem.d;
        Intrinsics.checkNotNullExpressionValue(fingerprint, "fingerprint");
        boolean z = appItem.f;
        String appName = appItem.g;
        Intrinsics.checkNotNullExpressionValue(appName, "appName");
        return new WatchAppItemEntity(packageName, did, fingerprint, z, appName, appItem.e);
    }
}
