package com.huami.nfc.applet;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0014\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/nfc/applet/LingNanTongTwo;", "Lcom/huami/nfc/applet/BusCard;", "", "appCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/huami/nfc/applet/GuangZhouTwo;", "Lcom/huami/nfc/applet/FoShanTwo;", "Lcom/huami/nfc/applet/ZhuHaiTwo;", "Lcom/huami/nfc/applet/ShanWeiTwo;", "Lcom/huami/nfc/applet/JiangMenTwo;", "Lcom/huami/nfc/applet/ZhaoQingTwo;", "Lcom/huami/nfc/applet/ZhongShanTwo;", "Lcom/huami/nfc/applet/DongGuanTwo;", "Lcom/huami/nfc/applet/HuiZhouTwo;", "Lcom/huami/nfc/applet/ZhanJiangTwo;", "Lcom/huami/nfc/applet/ShanTouTwo;", "Lcom/huami/nfc/applet/ShaoGuanTwo;", "Lcom/huami/nfc/applet/HeYuanTwo;", "Lcom/huami/nfc/applet/YangJiangTwo;", "Lcom/huami/nfc/applet/QingYuanTwo;", "Lcom/huami/nfc/applet/MaoMingTwo;", "Lcom/huami/nfc/applet/MeiZhouTwo;", "Lcom/huami/nfc/applet/ChaoZhouTwo;", "Lcom/huami/nfc/applet/JieYangTwo;", "Lcom/huami/nfc/applet/YunFuTwo;", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public abstract class LingNanTongTwo extends BusCard {
    private LingNanTongTwo(String str, String str2) {
        super(str, ConstantKt.AID_LNT_TWO_IN_ONE, ConstantKt.MI_CARD_NAME_LNT_TWO_IN_ONE, str2, null);
    }

    public /* synthetic */ LingNanTongTwo(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
