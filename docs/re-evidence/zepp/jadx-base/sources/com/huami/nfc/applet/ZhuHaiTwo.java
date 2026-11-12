package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/applet/ZhuHaiTwo;", "Lcom/huami/nfc/applet/LingNanTongTwo;", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class ZhuHaiTwo extends LingNanTongTwo {

    @NotNull
    public static final ZhuHaiTwo INSTANCE = new ZhuHaiTwo();

    private ZhuHaiTwo() {
        super(ConstantKt.APP_CODE_TWO_ZHU_HAI, ConstantKt.CARD_NAME_LNT_TWO_IN_ONE, null);
    }
}
