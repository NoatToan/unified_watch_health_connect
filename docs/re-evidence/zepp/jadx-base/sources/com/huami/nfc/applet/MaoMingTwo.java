package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/applet/MaoMingTwo;", "Lcom/huami/nfc/applet/LingNanTongTwo;", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class MaoMingTwo extends LingNanTongTwo {

    @NotNull
    public static final MaoMingTwo INSTANCE = new MaoMingTwo();

    private MaoMingTwo() {
        super(ConstantKt.APP_CODE_TWO_MAO_MING, ConstantKt.CARD_NAME_LNT_TWO_IN_ONE, null);
    }
}
