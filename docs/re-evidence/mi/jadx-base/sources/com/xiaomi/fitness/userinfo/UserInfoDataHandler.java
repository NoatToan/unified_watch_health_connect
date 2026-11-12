package com.xiaomi.fitness.userinfo;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.s7r;
import defpackage.tu9;
import defpackage.ur9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInfoDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "", "requestList", "", "handleUserInfoRequest", "(Ljava/util/List;)V", "", "did", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "()V", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UserInfoDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final String TAG = "UserInfoDataHandler";

    private final void handleUserInfoRequest(List<Integer> requestList) {
        Logger.i(TAG, "handleUserInfoRequest list: " + requestList);
        if (requestList.isEmpty()) {
            return;
        }
        boolean zIsAppForeground = AppManager.INSTANCE.getInstance().isAppForeground();
        Logger.i(TAG, "appForeground " + zIsAppForeground);
        if (zIsAppForeground) {
            SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).requestUserInfoGuide(requestList);
        } else {
            UserInfoNotify.INSTANCE.showNotification(CollectionsKt___CollectionsKt.toIntArray(requestList));
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        int i;
        Intrinsics.checkNotNullParameter(did, "did");
        int i2 = 0;
        if (type == 8 && packet != null && packet.f == 7) {
            ur9 ur9VarU = packet.u();
            tu9.b bVarX = ur9VarU != null ? ur9VarU.X() : null;
            if (bVarX != null && (i = bVarX.c) != 0) {
                Logger.i(TAG, "request basicInfo " + i + " source " + bVarX.d);
                ArrayList arrayList = new ArrayList();
                while (i != 0) {
                    if ((i & 1) == 1) {
                        arrayList.add(Integer.valueOf(1 << i2));
                    }
                    i >>= 1;
                    i2++;
                }
                handleUserInfoRequest(CollectionsKt___CollectionsKt.toList(arrayList));
                return true;
            }
        }
        return false;
    }
}
