package com.xiaomi.fitness.sport_capture;

import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import com.xiaomi.fitness.sport_capture.utils.DevicePreviewNotifyUtils;
import com.xiaomi.fitness.sport_capture.utils.SportStatusUtils;
import com.xiaomi.fitness.sport_capture.utils.VideoPreviewLauncher;
import defpackage.aje;
import defpackage.ded;
import defpackage.hed;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/SportProjectionHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "()V", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportProjectionHandler extends DataHandlerWrapper {

    @NotNull
    public static final String DEVICE_ID = "app";

    @NotNull
    public static final String STOP_PROJECTION_COMMAND = "com.xiaomi.fitness.stop_sport_capture";

    @NotNull
    private static final String TAG = "SportProjectionHandler";

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet != null && packet.e == 23) {
            int i = packet.f;
            if (i == 11) {
                hed hedVarR = packet.w().r();
                String str = hedVarR.c;
                int i2 = hedVarR.d;
                if (TextUtils.equals(str, "app")) {
                    if (i2 == 2) {
                        Logger.i(TAG, "action start");
                        SportCapturePreference sportCapturePreference = SportCapturePreference.INSTANCE;
                        if (sportCapturePreference.isAppProjecting()) {
                            Logger.i(TAG, "app is projecting, ignore start command!!");
                            DevicePreviewNotifyUtils.respFinished();
                        } else if (sportCapturePreference.isAppForeground()) {
                            VideoPreviewLauncher.INSTANCE.launch();
                        } else {
                            DevicePreviewNotifyUtils.respAppBackground();
                        }
                    } else if (i2 != 3) {
                        Logger.e(TAG, "unknown command!!");
                    } else {
                        Logger.i(TAG, "action stop");
                        if (SportCapturePreference.INSTANCE.isAppProjecting()) {
                            Logger.i(TAG, "stop preview");
                            aje.b(ApplicationExtKt.getApplication()).d(new Intent(STOP_PROJECTION_COMMAND));
                        } else {
                            Logger.i(TAG, "app is not projecting, ignore stop command!!");
                            DevicePreviewNotifyUtils.respFinished();
                        }
                    }
                    return true;
                }
            } else if (i == 13 && SportCapturePreference.INSTANCE.isAppProjecting()) {
                try {
                    Logger.d(TAG, "type:" + packet.w().q().c + "-speed:" + packet.w().q().f15440k);
                    SportStatusUtils sportStatusUtils = SportStatusUtils.INSTANCE;
                    ded dedVarQ = packet.w().q();
                    Intrinsics.checkNotNullExpressionValue(dedVarQ, "getProjectionData(...)");
                    sportStatusUtils.updateProjectionData(dedVarQ);
                } catch (Exception e) {
                    Logger.e(TAG, "handle projection data exception", e);
                }
                return true;
            }
        }
        return super.handlePacket(did, type, packet);
    }
}
