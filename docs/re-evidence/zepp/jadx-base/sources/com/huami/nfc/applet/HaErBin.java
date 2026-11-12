package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/applet/HaErBin;", "Lcom/huami/nfc/applet/BusCard;", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class HaErBin extends BusCard {

    @NotNull
    public static final HaErBin INSTANCE = new HaErBin();

    private HaErBin() {
        super(ConstantKt.APP_CODE_HA_ER_BIN, ConstantKt.AID_HA_ER_BIN, ConstantKt.MI_CARD_NAME_HA_ER_BIN, ConstantKt.CARD_NAME_HA_ER_BIN, null);
    }
}
