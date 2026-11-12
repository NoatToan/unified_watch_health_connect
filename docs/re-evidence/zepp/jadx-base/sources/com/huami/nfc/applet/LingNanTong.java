package com.huami.nfc.applet;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0015\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/nfc/applet/LingNanTong;", "Lcom/huami/nfc/applet/BusCard;", "", "appCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/huami/nfc/applet/ALL;", "Lcom/huami/nfc/applet/GuangZhou;", "Lcom/huami/nfc/applet/FoShan;", "Lcom/huami/nfc/applet/ZhuHai;", "Lcom/huami/nfc/applet/ShanWei;", "Lcom/huami/nfc/applet/JiangMen;", "Lcom/huami/nfc/applet/ZhaoQing;", "Lcom/huami/nfc/applet/ZhongShan;", "Lcom/huami/nfc/applet/DongGuan;", "Lcom/huami/nfc/applet/HuiZhou;", "Lcom/huami/nfc/applet/ZhanJiang;", "Lcom/huami/nfc/applet/ShanTou;", "Lcom/huami/nfc/applet/ShaoGuan;", "Lcom/huami/nfc/applet/HeYuan;", "Lcom/huami/nfc/applet/YangJiang;", "Lcom/huami/nfc/applet/QingYuan;", "Lcom/huami/nfc/applet/MaoMing;", "Lcom/huami/nfc/applet/MeiZhou;", "Lcom/huami/nfc/applet/ChaoZhou;", "Lcom/huami/nfc/applet/JieYang;", "Lcom/huami/nfc/applet/YunFu;", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public abstract class LingNanTong extends BusCard {
    private LingNanTong(String str, String str2) {
        super(str, ConstantKt.AID_LING_NAN_TONG, ConstantKt.MI_CARD_NAME_LING_NAN_TONG, str2, null);
    }

    public /* synthetic */ LingNanTong(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
