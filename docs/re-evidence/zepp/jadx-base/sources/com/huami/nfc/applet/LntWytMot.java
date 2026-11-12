package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/applet/LntWytMot;", "Lcom/huami/nfc/applet/BusCard;", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class LntWytMot extends BusCard {

    @NotNull
    public static final LntWytMot INSTANCE = new LntWytMot();

    private LntWytMot() {
        super(ConstantKt.APP_CODE_LNT_WYT, ConstantKt.AID_LNT_WYT, ConstantKt.MI_CARD_NAME_LNT_WYT, ConstantKt.CARD_NAME_LNT_WYT, null);
    }
}
