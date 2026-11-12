package com.huami.nfc.applet;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\by\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bz¨\u0006{"}, d2 = {"Lcom/huami/nfc/applet/City;", "", "", "appCode", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "JiNanMot", "ShaoXingMotNew", "LntYctMot", "LntSztMot", "LntZstMot", "LntZhtMot", "LntDgtMot", "LntGftMot", "LntHztMot", "LntSttMot", "LntWytMot", "LntMctMot", "LntZqtMot", "LntZjtMot", "LntJytMot", "LntHhtMot", "LntHyyzfMot", "LntQysmkMot", "LntShaoZhouMot", "LntRJMot", "LntMJMot", "LntCZMot", "LntLYMot", "ShangHaiMot", "ZhenJiang", "YangZhou", "JsTaiZhou", "HuaiAn", "SuQian", "YanCheng", "XuZhou", "LianYunGang", "ShenZhenMot", "WeiFangMot", "ZhengZhouMot", "GanZhou", "ZhuHaiMot", "ChangSha", "YuLin", "HeBei", "NanJing", "XiZang", "ShaoXing", "WuXi", "ChangZhou", "ShiYan", "XiAnMot", "HeFeiMot", "TianJin", "ShiJiaZhuang", "ShenYang", "DaLian", "Taizhou", "NingBo", "NanTong", "XiaMen", "QingDao", "HaiNan", "HaErBin", "ShangHai", "BeiJin", "Xian", "HeFei", "ShenZhen", "JiLin", "Suzhou", "Jiangsu", "WuHan", "ChongQing", "Jingjinji", "GuangXi", "ZhengZhou", "LingNanTong", "GuangZhou", "Foshan", "Zhuhai", "ShanWei", "JiangMen", "ZhaoQing", "ZhongShan", "DongGuan", "HuiZhou", "ZhanJiang", "ShanTou", "ShaoGuan", "HeYuan", "YangJiang", "QingYuan", "MaoMing", "MeiZhou", "ChaoZhou", "JieYang", "YunFu", "GuangZhouTwo", "FoShanTwo", "ZhuHaiTwo", "ShanWeiTwo", "JiangMenTwo", "ZhaoQingTwo", "ZhongShanTwo", "DongGuanTwo", "HuiZhouTwo", "ZhanJiangTwo", "ShanTouTwo", "ShaoGuanTwo", "HeYuanTwo", "YangJiangTwo", "QingYuanTwo", "MaoMingTwo", "MeiZhouTwo", "ChaoZhouTwo", "JieYangTwo", "YunFuTwo", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public enum City {
    JiNanMot(ConstantKt.APP_CODE_QUAN_CHENG_TONG),
    ShaoXingMotNew(ConstantKt.APP_CODE_SHAO_XING_NEW),
    LntYctMot(ConstantKt.APP_CODE_LNT_YCT),
    LntSztMot(ConstantKt.APP_CODE_LNT_SZT),
    LntZstMot(ConstantKt.APP_CODE_LNT_ZST),
    LntZhtMot(ConstantKt.APP_CODE_LNT_ZHT),
    LntDgtMot(ConstantKt.APP_CODE_LNT_DGT),
    LntGftMot(ConstantKt.APP_CODE_LNT_GFT),
    LntHztMot(ConstantKt.APP_CODE_LNT_HZT),
    LntSttMot(ConstantKt.APP_CODE_LNT_STT),
    LntWytMot(ConstantKt.APP_CODE_LNT_WYT),
    LntMctMot(ConstantKt.APP_CODE_LNT_MCT),
    LntZqtMot(ConstantKt.APP_CODE_LNT_ZQT),
    LntZjtMot(ConstantKt.APP_CODE_LNT_ZJT),
    LntJytMot(ConstantKt.APP_CODE_LNT_JYT),
    LntHhtMot(ConstantKt.APP_CODE_LNT_HHT),
    LntHyyzfMot(ConstantKt.APP_CODE_LNT_HYYZF),
    LntQysmkMot(ConstantKt.APP_CODE_LNT_QYSMK),
    LntShaoZhouMot(ConstantKt.APP_CODE_LNT_SHAOZHOUTONG),
    LntRJMot(ConstantKt.APP_CODE_LNT_RJT),
    LntMJMot(ConstantKt.APP_CODE_LNT_MJT),
    LntCZMot(ConstantKt.APP_CODE_LNT_CZT),
    LntLYMot(ConstantKt.APP_CODE_LNT_LYT),
    ShangHaiMot(ConstantKt.APP_CODE_SHANG_HAI_MOT),
    ZhenJiang(ConstantKt.APP_CODE_ZHEN_JIANG),
    YangZhou(ConstantKt.APP_CODE_YANG_ZHOU),
    JsTaiZhou(ConstantKt.APP_CODE_JS_TAI_ZHOU),
    HuaiAn(ConstantKt.APP_CODE_HUAI_AN),
    SuQian(ConstantKt.APP_CODE_SU_QIAN),
    YanCheng(ConstantKt.APP_CODE_YAN_CHENG),
    XuZhou(ConstantKt.APP_CODE_XU_ZHOU),
    LianYunGang(ConstantKt.APP_CODE_LIAN_YUN_GANG),
    ShenZhenMot(ConstantKt.APP_CODE_SHEN_ZHEN_MOT),
    WeiFangMot(ConstantKt.APP_CODE_WEI_FANG_MOT),
    ZhengZhouMot(ConstantKt.APP_CODE_ZHENG_ZHOU_MOT),
    GanZhou(ConstantKt.APP_CODE_GAN_ZHOU_MOT),
    ZhuHaiMot(ConstantKt.APP_CODE_ZHU_HAI_MOT),
    ChangSha(ConstantKt.APP_CODE_CHANG_SHA),
    YuLin(ConstantKt.APP_CODE_YU_LIN),
    HeBei(ConstantKt.APP_CODE_HE_BEI),
    NanJing(ConstantKt.APP_CODE_NAN_JING),
    XiZang(ConstantKt.APP_CODE_XI_ZANG),
    ShaoXing(ConstantKt.APP_CODE_SHAO_XING),
    WuXi(ConstantKt.APP_CODE_WU_XI),
    ChangZhou(ConstantKt.APP_CODE_CHANG_ZHOU),
    ShiYan(ConstantKt.APP_CODE_SHI_YAN),
    XiAnMot(ConstantKt.APP_CODE_XI_AN_MOT),
    HeFeiMot(ConstantKt.APP_CODE_HE_FEI_MOT),
    TianJin(ConstantKt.APP_CODE_TIAN_JIN),
    ShiJiaZhuang(ConstantKt.APP_CODE_SHI_JIA_ZHUANG),
    ShenYang(ConstantKt.APP_CODE_SHEN_YANG),
    DaLian(ConstantKt.APP_CODE_DA_LIAN),
    Taizhou(ConstantKt.APP_CODE_TAI_ZHOU),
    NingBo(ConstantKt.APP_CODE_NING_BO),
    NanTong(ConstantKt.APP_CODE_NAN_TONG),
    XiaMen(ConstantKt.APP_CODE_XIA_MEN),
    QingDao(ConstantKt.APP_CODE_QING_DAO),
    HaiNan(ConstantKt.APP_CODE_HAI_NAN),
    HaErBin(ConstantKt.APP_CODE_HA_ER_BIN),
    ShangHai(ConstantKt.APP_CODE_SHANG_HAI),
    BeiJin("0010"),
    Xian(ConstantKt.APP_CODE_XI_AN),
    HeFei(ConstantKt.APP_CODE_HE_FEI),
    ShenZhen(ConstantKt.APP_CODE_SHEN_ZHEN),
    JiLin(ConstantKt.APP_CODE_JI_LIN),
    Suzhou(ConstantKt.APP_CODE_SU_ZHOU),
    Jiangsu(ConstantKt.APP_CODE_JIANG_SU),
    WuHan(ConstantKt.APP_CODE_WU_HAN),
    ChongQing(ConstantKt.APP_CODE_CHONG_QING),
    Jingjinji(ConstantKt.APP_CODE_JJJ),
    GuangXi(ConstantKt.APP_CODE_GUNAG_XI),
    ZhengZhou(ConstantKt.APP_CODE_ZHENG_ZHOU),
    LingNanTong("9000"),
    GuangZhou(ConstantKt.APP_CODE_GUANG_ZHOU),
    Foshan(ConstantKt.APP_CODE_FO_SHAN),
    Zhuhai(ConstantKt.APP_CODE_ZHU_HAI),
    ShanWei(ConstantKt.APP_CODE_SHAN_WEI),
    JiangMen(ConstantKt.APP_CODE_JIANG_MEN),
    ZhaoQing(ConstantKt.APP_CODE_ZHAO_QING),
    ZhongShan(ConstantKt.APP_CODE_ZHONG_SHAN),
    DongGuan(ConstantKt.APP_CODE_DONG_GUAN),
    HuiZhou(ConstantKt.APP_CODE_HUI_ZHOU),
    ZhanJiang(ConstantKt.APP_CODE_ZHAN_JIANG),
    ShanTou(ConstantKt.APP_CODE_SHAN_TOU),
    ShaoGuan(ConstantKt.APP_CODE_SHAO_GUAN),
    HeYuan(ConstantKt.APP_CODE_HE_YUAN),
    YangJiang(ConstantKt.APP_CODE_YANG_JIANG),
    QingYuan(ConstantKt.APP_CODE_QING_YUAN),
    MaoMing(ConstantKt.APP_CODE_MAO_MING),
    MeiZhou(ConstantKt.APP_CODE_MEI_ZHOU),
    ChaoZhou(ConstantKt.APP_CODE_CHAO_ZHOU),
    JieYang(ConstantKt.APP_CODE_JIE_YANG),
    YunFu(ConstantKt.APP_CODE_YUN_FU),
    GuangZhouTwo(ConstantKt.APP_CODE_TWO_GUANG_ZHOU),
    FoShanTwo(ConstantKt.APP_CODE_TWO_FO_SHAN),
    ZhuHaiTwo(ConstantKt.APP_CODE_TWO_ZHU_HAI),
    ShanWeiTwo(ConstantKt.APP_CODE_TWO_SHAN_WEI),
    JiangMenTwo(ConstantKt.APP_CODE_TWO_JIANG_MEN),
    ZhaoQingTwo(ConstantKt.APP_CODE_TWO_ZHAO_QING),
    ZhongShanTwo(ConstantKt.APP_CODE_TWO_ZHONG_SHAN),
    DongGuanTwo(ConstantKt.APP_CODE_TWO_DONG_GUAN),
    HuiZhouTwo(ConstantKt.APP_CODE_TWO_HUI_ZHOU),
    ZhanJiangTwo(ConstantKt.APP_CODE_TWO_ZHAN_JIANG),
    ShanTouTwo(ConstantKt.APP_CODE_TWO_SHAN_TOU),
    ShaoGuanTwo(ConstantKt.APP_CODE_TWO_SHAO_GUAN),
    HeYuanTwo(ConstantKt.APP_CODE_TWO_HE_YUAN),
    YangJiangTwo(ConstantKt.APP_CODE_TWO_YANG_JIANG),
    QingYuanTwo(ConstantKt.APP_CODE_TWO_QING_YUAN),
    MaoMingTwo(ConstantKt.APP_CODE_TWO_MAO_MING),
    MeiZhouTwo(ConstantKt.APP_CODE_TWO_MEI_ZHOU),
    ChaoZhouTwo(ConstantKt.APP_CODE_TWO_CHAO_ZHOU),
    JieYangTwo(ConstantKt.APP_CODE_TWO_JIE_YANG),
    YunFuTwo(ConstantKt.APP_CODE_TWO_YUN_FU);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/nfc/applet/City$Companion;", "", "", "appCode", "Lcom/huami/nfc/applet/City;", "from", "name", "fromXiaomiName", "<init>", "()V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        @JvmStatic
        @NotNull
        public final City from(@NotNull String appCode) {
            for (City city : City.values()) {
                if (Intrinsics.areEqual(city.getAppCode(), appCode)) {
                    if (city != null) {
                        return city;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("No City with appCode: ", appCode).toString());
                }
            }
            city = null;
            if (city != null) {
                return city;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No City with appCode: ", appCode).toString());
        }

        @JvmStatic
        @NotNull
        public final City fromXiaomiName(@NotNull String name) {
            return from(BusCardExtensions.fromMiCardName(name).getAppCode());
        }
    }

    City(String str) {
        this.appCode = str;
    }

    @JvmStatic
    @NotNull
    public static final City from(@NotNull String str) {
        return INSTANCE.from(str);
    }

    @JvmStatic
    @NotNull
    public static final City fromXiaomiName(@NotNull String str) {
        return INSTANCE.fromXiaomiName(str);
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }
}
