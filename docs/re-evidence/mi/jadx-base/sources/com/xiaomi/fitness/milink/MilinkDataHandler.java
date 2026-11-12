package com.xiaomi.fitness.milink;

import androidx.annotation.RequiresApi;
import com.miui.circulate.api.exception.CirculateException;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.gdd;
import defpackage.led;
import defpackage.red;
import defpackage.s7r;
import defpackage.sdd;
import defpackage.udd;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/milink/MilinkDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "()V", "milink_release"}, k = 1, mv = {2, 0, 0})
public final class MilinkDataHandler extends DataHandlerWrapper {
    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    @RequiresApi(24)
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) throws CirculateException {
        List<Integer> fullPadProtocolTypes;
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("MilinkDataHandler receive packet: " + type + " id: " + (packet != null ? Integer.valueOf(packet.f) : null), new Object[0]);
        if (type == 23) {
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                if (!milinkHelper.isSupportMilink()) {
                    return true;
                }
                udd uddVarW = packet.w();
                led ledVarS = uddVarW != null ? uddVarW.s() : null;
                boolean z = ledVarS != null ? ledVarS.c : false;
                if (z) {
                    fullPadProtocolTypes = MilinkConstants.INSTANCE.getLocalOnlyProtocolTypes();
                } else {
                    fullPadProtocolTypes = UIUtils.INSTANCE.isTablet() ? MilinkConstants.INSTANCE.getFullPadProtocolTypes() : MilinkConstants.INSTANCE.getFullProtocolTypes();
                }
                milinkHelper.requestShareDevice(fullPadProtocolTypes, z);
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 5) {
                gdd gddVarO = packet.w().o();
                MilinkHelper milinkHelper2 = MilinkHelper.INSTANCE;
                Intrinsics.checkNotNull(gddVarO);
                milinkHelper2.handleAudioControl(gddVarO);
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 6) {
                red redVarT = packet.w().t();
                MilinkHelper milinkHelper3 = MilinkHelper.INSTANCE;
                Intrinsics.checkNotNull(redVarT);
                milinkHelper3.handleTvControl(redVarT);
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 7) {
                sdd sddVarP = packet.w().p();
                MilinkHelper milinkHelper4 = MilinkHelper.INSTANCE;
                Intrinsics.checkNotNull(sddVarP);
                milinkHelper4.handleHeadsetControl(sddVarP);
                return true;
            }
        }
        return false;
    }
}
