package com.xiaomi.fit.fitness.device.cgm.receiver;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import defpackage.gcp;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/receiver/WearThirdPartyDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "TAG", "Ljava/lang/String;", "<init>", "()V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public final class WearThirdPartyDataHandler extends DataHandlerWrapper {

    @NotNull
    private final String TAG = "WearThirdPartyDataHandler";

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (TextUtils.isEmpty(did)) {
            FitnessLogUtils.i(this.TAG, "handlePacket, empty did(did = " + did + ", type = " + type + ")");
            return false;
        }
        if (packet == null || type != 20 || packet.f != 9) {
            return false;
        }
        ThirdPartyDataManager companion = ThirdPartyDataManager.INSTANCE.getInstance();
        gcp gcpVarT = packet.F().t();
        Intrinsics.checkNotNullExpressionValue(gcpVarT, "getMessageContent(...)");
        boolean zHandleBloodSugarThirdParty = companion.handleBloodSugarThirdParty(did, gcpVarT);
        FitnessLogUtils.i(this.TAG, "handleBloodSugarThirdParty: handled=" + zHandleBloodSugarThirdParty);
        return zHandleBloodSugarThirdParty;
    }
}
