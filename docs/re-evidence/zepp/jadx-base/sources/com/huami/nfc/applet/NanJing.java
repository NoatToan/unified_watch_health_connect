package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/applet/NanJing;", "Lcom/huami/nfc/applet/BusCard;", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class NanJing extends BusCard {

    @NotNull
    public static final NanJing INSTANCE = new NanJing();

    private NanJing() {
        super(ConstantKt.APP_CODE_NAN_JING, ConstantKt.AID_NAN_JING, ConstantKt.MI_CARD_NAME_NAN_JING, ConstantKt.CARD_NAME_NAN_JING, null);
    }
}
