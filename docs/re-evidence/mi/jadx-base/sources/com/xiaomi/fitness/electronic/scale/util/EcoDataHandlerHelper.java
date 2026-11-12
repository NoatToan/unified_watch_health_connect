package com.xiaomi.fitness.electronic.scale.util;

import android.app.Activity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import defpackage.ld8;
import defpackage.u7r;
import defpackage.vw7;
import defpackage.ww7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/EcoDataHandlerHelper;", "", "<init>", "()V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDataHandlerHelper {

    @NotNull
    private static final String TAG = "EcoDataHandlerHelper";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static EcoDataHandlerWrapper scaleDataHandler = new EcoDataHandlerWrapper() { // from class: com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper$Companion$scaleDataHandler$1
        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
        public boolean handleEcoPacket(String did, int type, u7r packet) {
            vw7 vw7VarW;
            Intrinsics.checkNotNullParameter(did, "did");
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Integer numValueOf = null;
            boolean z = !Intrinsics.areEqual(KeepAliveService.MAIN_ACTIVITY, currentActivity != null ? currentActivity.getClass().getName() : null);
            Logger.i("EcoDataHandlerHelper", "isInBackground " + z);
            Logger.i("EcoDataHandlerHelper", "scaleDataHandler" + packet);
            if (!z && packet != null && packet.f == 13) {
                ww7 ww7VarT = packet.t();
                if (ww7VarT != null && (vw7VarW = ww7VarT.w()) != null) {
                    numValueOf = Integer.valueOf(vw7VarW.c);
                }
                if (numValueOf != null && numValueOf.intValue() > 0) {
                    return ScaleUtil.INSTANCE.handleMainWeightProduce(did, packet);
                }
            }
            ScaleUtil scaleUtil = ScaleUtil.INSTANCE;
            Logger.i("EcoDataHandlerHelper", "isWeightActivity " + scaleUtil.isInWeight());
            if (!scaleUtil.isInWeight() && packet != null && packet.f == 12) {
                scaleUtil.handleBackgroundUploadBodyComposition(did, packet);
            }
            ld8.c().l(new ScaleEventBusIds.OnEcoPaketEvent(did, type, packet));
            return false;
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/EcoDataHandlerHelper$Companion;", "", "<init>", "()V", "TAG", "", "scaleDataHandler", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "addDataHandler", "", "updateDataHandler", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addDataHandler() {
            EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).addDataHandler(32, EcoDataHandlerHelper.scaleDataHandler);
        }

        public final void updateDataHandler() {
            EcoDeviceContact.Companion companion = EcoDeviceContact.INSTANCE;
            EcoDeviceSyncExtKt.getInstance(companion).removeDataHandler(32, EcoDataHandlerHelper.scaleDataHandler);
            EcoDeviceSyncExtKt.getInstance(companion).addDataHandler(32, EcoDataHandlerHelper.scaleDataHandler);
        }
    }
}
