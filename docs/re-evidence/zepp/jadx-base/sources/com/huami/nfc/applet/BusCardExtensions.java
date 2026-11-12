package com.huami.nfc.applet;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u001a\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u001a\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000\u001a\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0000\u001a\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002\u001a\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0000H\u0002\"(\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"(\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"", "appCode", "", "isLingNanTong", "isLingNanTongTwo", "", "getLingNanTongAppCodeList", "getLingNanTongTwoAppCodeList", "Lcom/huami/nfc/applet/BusCard;", "fromAppCode", "aid", "fromAid", "name", "fromMiCardName", "aidList", "a", "b", "", "Lcom/huami/nfc/applet/LingNanTong;", "Ljava/util/Map;", "getLingNanTongBusCardMap", "()Ljava/util/Map;", "lingNanTongBusCardMap", "Lcom/huami/nfc/applet/LingNanTongTwo;", "getLingNanTongTwoBusCardMap", "lingNanTongTwoBusCardMap", "c", "busCardMap", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getLNT_CITYS", "()Ljava/util/List;", "LNT_CITYS", "e", "getSnowballAccessDoorAidList", "snowballAccessDoorAidList", "f", "getAllAppletAids", "allAppletAids", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "BusCardExtensions")
public final class BusCardExtensions {

    @NotNull
    private static final Map<String, LingNanTong> a;

    @NotNull
    private static final Map<String, LingNanTongTwo> b;

    @NotNull
    private static final Map<String, BusCard> c;

    @NotNull
    private static final List<String> d;

    @NotNull
    private static final List<String> e;

    @NotNull
    private static final List<String> f;

    static {
        ALL all = ALL.INSTANCE;
        GuangZhou guangZhou = GuangZhou.INSTANCE;
        FoShan foShan = FoShan.INSTANCE;
        ZhuHai zhuHai = ZhuHai.INSTANCE;
        ShanWei shanWei = ShanWei.INSTANCE;
        JiangMen jiangMen = JiangMen.INSTANCE;
        ZhaoQing zhaoQing = ZhaoQing.INSTANCE;
        ZhongShan zhongShan = ZhongShan.INSTANCE;
        DongGuan dongGuan = DongGuan.INSTANCE;
        HuiZhou huiZhou = HuiZhou.INSTANCE;
        ZhanJiang zhanJiang = ZhanJiang.INSTANCE;
        ShanTou shanTou = ShanTou.INSTANCE;
        ShaoGuan shaoGuan = ShaoGuan.INSTANCE;
        HeYuan heYuan = HeYuan.INSTANCE;
        YangJiang yangJiang = YangJiang.INSTANCE;
        QingYuan qingYuan = QingYuan.INSTANCE;
        MaoMing maoMing = MaoMing.INSTANCE;
        MeiZhou meiZhou = MeiZhou.INSTANCE;
        ChaoZhou chaoZhou = ChaoZhou.INSTANCE;
        JieYang jieYang = JieYang.INSTANCE;
        YunFu yunFu = YunFu.INSTANCE;
        a = r.mutableMapOf(TuplesKt.to(all.getAppCode(), all), TuplesKt.to(guangZhou.getAppCode(), guangZhou), TuplesKt.to(foShan.getAppCode(), foShan), TuplesKt.to(zhuHai.getAppCode(), zhuHai), TuplesKt.to(shanWei.getAppCode(), shanWei), TuplesKt.to(jiangMen.getAppCode(), jiangMen), TuplesKt.to(zhaoQing.getAppCode(), zhaoQing), TuplesKt.to(zhongShan.getAppCode(), zhongShan), TuplesKt.to(dongGuan.getAppCode(), dongGuan), TuplesKt.to(huiZhou.getAppCode(), huiZhou), TuplesKt.to(zhanJiang.getAppCode(), zhanJiang), TuplesKt.to(shanTou.getAppCode(), shanTou), TuplesKt.to(shaoGuan.getAppCode(), shaoGuan), TuplesKt.to(heYuan.getAppCode(), heYuan), TuplesKt.to(yangJiang.getAppCode(), yangJiang), TuplesKt.to(qingYuan.getAppCode(), qingYuan), TuplesKt.to(maoMing.getAppCode(), maoMing), TuplesKt.to(meiZhou.getAppCode(), meiZhou), TuplesKt.to(chaoZhou.getAppCode(), chaoZhou), TuplesKt.to(jieYang.getAppCode(), jieYang), TuplesKt.to(yunFu.getAppCode(), yunFu));
        GuangZhouTwo guangZhouTwo = GuangZhouTwo.INSTANCE;
        FoShanTwo foShanTwo = FoShanTwo.INSTANCE;
        ZhuHaiTwo zhuHaiTwo = ZhuHaiTwo.INSTANCE;
        ShanWeiTwo shanWeiTwo = ShanWeiTwo.INSTANCE;
        JiangMenTwo jiangMenTwo = JiangMenTwo.INSTANCE;
        ZhaoQingTwo zhaoQingTwo = ZhaoQingTwo.INSTANCE;
        ZhongShanTwo zhongShanTwo = ZhongShanTwo.INSTANCE;
        DongGuanTwo dongGuanTwo = DongGuanTwo.INSTANCE;
        HuiZhouTwo huiZhouTwo = HuiZhouTwo.INSTANCE;
        ZhanJiangTwo zhanJiangTwo = ZhanJiangTwo.INSTANCE;
        ShanTouTwo shanTouTwo = ShanTouTwo.INSTANCE;
        ShaoGuanTwo shaoGuanTwo = ShaoGuanTwo.INSTANCE;
        HeYuanTwo heYuanTwo = HeYuanTwo.INSTANCE;
        YangJiangTwo yangJiangTwo = YangJiangTwo.INSTANCE;
        QingYuanTwo qingYuanTwo = QingYuanTwo.INSTANCE;
        MaoMingTwo maoMingTwo = MaoMingTwo.INSTANCE;
        MeiZhouTwo meiZhouTwo = MeiZhouTwo.INSTANCE;
        ChaoZhouTwo chaoZhouTwo = ChaoZhouTwo.INSTANCE;
        JieYangTwo jieYangTwo = JieYangTwo.INSTANCE;
        YunFuTwo yunFuTwo = YunFuTwo.INSTANCE;
        b = r.mutableMapOf(TuplesKt.to(guangZhouTwo.getAppCode(), guangZhouTwo), TuplesKt.to(foShanTwo.getAppCode(), foShanTwo), TuplesKt.to(zhuHaiTwo.getAppCode(), zhuHaiTwo), TuplesKt.to(shanWeiTwo.getAppCode(), shanWeiTwo), TuplesKt.to(jiangMenTwo.getAppCode(), jiangMenTwo), TuplesKt.to(zhaoQingTwo.getAppCode(), zhaoQingTwo), TuplesKt.to(zhongShanTwo.getAppCode(), zhongShanTwo), TuplesKt.to(dongGuanTwo.getAppCode(), dongGuanTwo), TuplesKt.to(huiZhouTwo.getAppCode(), huiZhouTwo), TuplesKt.to(zhanJiangTwo.getAppCode(), zhanJiangTwo), TuplesKt.to(shanTouTwo.getAppCode(), shanTouTwo), TuplesKt.to(shaoGuanTwo.getAppCode(), shaoGuanTwo), TuplesKt.to(heYuanTwo.getAppCode(), heYuanTwo), TuplesKt.to(yangJiangTwo.getAppCode(), yangJiangTwo), TuplesKt.to(qingYuanTwo.getAppCode(), qingYuanTwo), TuplesKt.to(maoMingTwo.getAppCode(), maoMingTwo), TuplesKt.to(meiZhouTwo.getAppCode(), meiZhouTwo), TuplesKt.to(chaoZhouTwo.getAppCode(), chaoZhouTwo), TuplesKt.to(jieYangTwo.getAppCode(), jieYangTwo), TuplesKt.to(yunFuTwo.getAppCode(), yunFuTwo));
        JiNanMot jiNanMot = JiNanMot.INSTANCE;
        TaiZhou taiZhou = TaiZhou.INSTANCE;
        NingBo ningBo = NingBo.INSTANCE;
        NanTong nanTong = NanTong.INSTANCE;
        XiaMen xiaMen = XiaMen.INSTANCE;
        QingDao qingDao = QingDao.INSTANCE;
        HaiNan haiNan = HaiNan.INSTANCE;
        HaErBin haErBin = HaErBin.INSTANCE;
        ShangHai shangHai = ShangHai.INSTANCE;
        BeiJing beiJing = BeiJing.INSTANCE;
        XiAn xiAn = XiAn.INSTANCE;
        HeFei heFei = HeFei.INSTANCE;
        ShenZhen shenZhen = ShenZhen.INSTANCE;
        JiLin jiLin = JiLin.INSTANCE;
        SuZhou suZhou = SuZhou.INSTANCE;
        JiangSu jiangSu = JiangSu.INSTANCE;
        WuHan wuHan = WuHan.INSTANCE;
        ChongQing chongQing = ChongQing.INSTANCE;
        JingJinJi jingJinJi = JingJinJi.INSTANCE;
        ZhengZhou zhengZhou = ZhengZhou.INSTANCE;
        GuangXi guangXi = GuangXi.INSTANCE;
        DaLian daLian = DaLian.INSTANCE;
        ShenYang shenYang = ShenYang.INSTANCE;
        ShiJiaZhuang shiJiaZhuang = ShiJiaZhuang.INSTANCE;
        TianJin tianJin = TianJin.INSTANCE;
        HeFeiMot heFeiMot = HeFeiMot.INSTANCE;
        XiAnMot xiAnMot = XiAnMot.INSTANCE;
        ShiYan shiYan = ShiYan.INSTANCE;
        ChangZhou changZhou = ChangZhou.INSTANCE;
        WuXi wuXi = WuXi.INSTANCE;
        ShaoXing shaoXing = ShaoXing.INSTANCE;
        XiZang xiZang = XiZang.INSTANCE;
        NanJing nanJing = NanJing.INSTANCE;
        HeBei heBei = HeBei.INSTANCE;
        YuLin yuLin = YuLin.INSTANCE;
        ChangSha changSha = ChangSha.INSTANCE;
        ZhuHaiMot zhuHaiMot = ZhuHaiMot.INSTANCE;
        GanZhouMot ganZhouMot = GanZhouMot.INSTANCE;
        ZhengZhouMot zhengZhouMot = ZhengZhouMot.INSTANCE;
        WeiFangMot weiFangMot = WeiFangMot.INSTANCE;
        ShenZhenMot shenZhenMot = ShenZhenMot.INSTANCE;
        LianYunGang lianYunGang = LianYunGang.INSTANCE;
        XuZhou xuZhou = XuZhou.INSTANCE;
        YanCheng yanCheng = YanCheng.INSTANCE;
        SuQian suQian = SuQian.INSTANCE;
        HuaiAn huaiAn = HuaiAn.INSTANCE;
        JsTaiZhou jsTaiZhou = JsTaiZhou.INSTANCE;
        YangZhou yangZhou = YangZhou.INSTANCE;
        ZhenJiang zhenJiang = ZhenJiang.INSTANCE;
        ShangHaiMot shangHaiMot = ShangHaiMot.INSTANCE;
        LntYctMot lntYctMot = LntYctMot.INSTANCE;
        LntSztMot lntSztMot = LntSztMot.INSTANCE;
        LntZstMot lntZstMot = LntZstMot.INSTANCE;
        LntZhtMot lntZhtMot = LntZhtMot.INSTANCE;
        LntDgtMot lntDgtMot = LntDgtMot.INSTANCE;
        LntGftMot lntGftMot = LntGftMot.INSTANCE;
        LntHztMot lntHztMot = LntHztMot.INSTANCE;
        LntSttMot lntSttMot = LntSttMot.INSTANCE;
        LntWytMot lntWytMot = LntWytMot.INSTANCE;
        LntMctMot lntMctMot = LntMctMot.INSTANCE;
        LntZqtMot lntZqtMot = LntZqtMot.INSTANCE;
        LntZjtMot lntZjtMot = LntZjtMot.INSTANCE;
        LntJytMot lntJytMot = LntJytMot.INSTANCE;
        LntHhtMot lntHhtMot = LntHhtMot.INSTANCE;
        LntHyyzfMot lntHyyzfMot = LntHyyzfMot.INSTANCE;
        LntQysmkMot lntQysmkMot = LntQysmkMot.INSTANCE;
        LntShaoZhouMot lntShaoZhouMot = LntShaoZhouMot.INSTANCE;
        LntMJMot lntMJMot = LntMJMot.INSTANCE;
        LntRJMot lntRJMot = LntRJMot.INSTANCE;
        LntCZMot lntCZMot = LntCZMot.INSTANCE;
        LntLYMot lntLYMot = LntLYMot.INSTANCE;
        ShaoXingMotNew shaoXingMotNew = ShaoXingMotNew.INSTANCE;
        Map<String, BusCard> mapMutableMapOf = r.mutableMapOf(TuplesKt.to(jiNanMot.getAppCode(), jiNanMot), TuplesKt.to(taiZhou.getAppCode(), taiZhou), TuplesKt.to(ningBo.getAppCode(), ningBo), TuplesKt.to(nanTong.getAppCode(), nanTong), TuplesKt.to(xiaMen.getAppCode(), xiaMen), TuplesKt.to(qingDao.getAppCode(), qingDao), TuplesKt.to(haiNan.getAppCode(), haiNan), TuplesKt.to(haErBin.getAppCode(), haErBin), TuplesKt.to(shangHai.getAppCode(), shangHai), TuplesKt.to(beiJing.getAppCode(), beiJing), TuplesKt.to(xiAn.getAppCode(), xiAn), TuplesKt.to(heFei.getAppCode(), heFei), TuplesKt.to(shenZhen.getAppCode(), shenZhen), TuplesKt.to(jiLin.getAppCode(), jiLin), TuplesKt.to(suZhou.getAppCode(), suZhou), TuplesKt.to(jiangSu.getAppCode(), jiangSu), TuplesKt.to(wuHan.getAppCode(), wuHan), TuplesKt.to(chongQing.getAppCode(), chongQing), TuplesKt.to(jingJinJi.getAppCode(), jingJinJi), TuplesKt.to(zhengZhou.getAppCode(), zhengZhou), TuplesKt.to(guangXi.getAppCode(), guangXi), TuplesKt.to(daLian.getAppCode(), daLian), TuplesKt.to(shenYang.getAppCode(), shenYang), TuplesKt.to(shiJiaZhuang.getAppCode(), shiJiaZhuang), TuplesKt.to(tianJin.getAppCode(), tianJin), TuplesKt.to(heFeiMot.getAppCode(), heFeiMot), TuplesKt.to(xiAnMot.getAppCode(), xiAnMot), TuplesKt.to(shiYan.getAppCode(), shiYan), TuplesKt.to(changZhou.getAppCode(), changZhou), TuplesKt.to(wuXi.getAppCode(), wuXi), TuplesKt.to(shaoXing.getAppCode(), shaoXing), TuplesKt.to(xiZang.getAppCode(), xiZang), TuplesKt.to(nanJing.getAppCode(), nanJing), TuplesKt.to(heBei.getAppCode(), heBei), TuplesKt.to(yuLin.getAppCode(), yuLin), TuplesKt.to(changSha.getAppCode(), changSha), TuplesKt.to(zhuHaiMot.getAppCode(), zhuHaiMot), TuplesKt.to(ganZhouMot.getAppCode(), ganZhouMot), TuplesKt.to(zhengZhouMot.getAppCode(), zhengZhouMot), TuplesKt.to(weiFangMot.getAppCode(), weiFangMot), TuplesKt.to(shenZhenMot.getAppCode(), shenZhenMot), TuplesKt.to(lianYunGang.getAppCode(), lianYunGang), TuplesKt.to(xuZhou.getAppCode(), xuZhou), TuplesKt.to(yanCheng.getAppCode(), yanCheng), TuplesKt.to(suQian.getAppCode(), suQian), TuplesKt.to(huaiAn.getAppCode(), huaiAn), TuplesKt.to(jsTaiZhou.getAppCode(), jsTaiZhou), TuplesKt.to(yangZhou.getAppCode(), yangZhou), TuplesKt.to(zhenJiang.getAppCode(), zhenJiang), TuplesKt.to(shangHaiMot.getAppCode(), shangHaiMot), TuplesKt.to(lntYctMot.getAppCode(), lntYctMot), TuplesKt.to(lntSztMot.getAppCode(), lntSztMot), TuplesKt.to(lntZstMot.getAppCode(), lntZstMot), TuplesKt.to(lntZhtMot.getAppCode(), lntZhtMot), TuplesKt.to(lntDgtMot.getAppCode(), lntDgtMot), TuplesKt.to(lntGftMot.getAppCode(), lntGftMot), TuplesKt.to(lntHztMot.getAppCode(), lntHztMot), TuplesKt.to(lntSttMot.getAppCode(), lntSttMot), TuplesKt.to(lntWytMot.getAppCode(), lntWytMot), TuplesKt.to(lntMctMot.getAppCode(), lntMctMot), TuplesKt.to(lntZqtMot.getAppCode(), lntZqtMot), TuplesKt.to(lntZjtMot.getAppCode(), lntZjtMot), TuplesKt.to(lntJytMot.getAppCode(), lntJytMot), TuplesKt.to(lntHhtMot.getAppCode(), lntHhtMot), TuplesKt.to(lntHyyzfMot.getAppCode(), lntHyyzfMot), TuplesKt.to(lntQysmkMot.getAppCode(), lntQysmkMot), TuplesKt.to(lntShaoZhouMot.getAppCode(), lntShaoZhouMot), TuplesKt.to(lntMJMot.getAppCode(), lntMJMot), TuplesKt.to(lntRJMot.getAppCode(), lntRJMot), TuplesKt.to(lntCZMot.getAppCode(), lntCZMot), TuplesKt.to(lntLYMot.getAppCode(), lntLYMot), TuplesKt.to(shaoXingMotNew.getAppCode(), shaoXingMotNew));
        mapMutableMapOf.putAll(getLingNanTongBusCardMap());
        mapMutableMapOf.putAll(getLingNanTongTwoBusCardMap());
        c = mapMutableMapOf;
        List<String> lingNanTongAppCodeList = getLingNanTongAppCodeList();
        lingNanTongAppCodeList.addAll(getLingNanTongTwoAppCodeList());
        d = lingNanTongAppCodeList;
        e = CollectionsKt__CollectionsKt.mutableListOf("A0000053424D344D5F4855414D490000", "A0000053424D344D5F4855414D490001", "A0000053424D344D5F4855414D490002", "A0000053424D344D5F4855414D490003", "A0000053424D344D5F4855414D490004", "A0000053424D344D5F4855414D490005", "A0000053424D344D5F4855414D490006", "A0000053424D344D5F4855414D490007", "A0000053424D344D5F4855414D490008", "A0000053424D344D5F4855414D490009");
        List<String> listAidList = aidList();
        listAidList.addAll(getSnowballAccessDoorAidList());
        f = listAidList;
    }

    private static final BusCard a(String str) {
        Iterator<Map.Entry<String, BusCard>> it2 = c.entrySet().iterator();
        while (it2.hasNext()) {
            BusCard value = it2.next().getValue();
            if (Intrinsics.areEqual(value.getAid(), str)) {
                return value;
            }
        }
        return null;
    }

    @NotNull
    public static final List<String> aidList() {
        Map<String, BusCard> map = c;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, BusCard>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue().getAid());
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.distinct(arrayList));
    }

    private static final BusCard b(String str) {
        Iterator<Map.Entry<String, BusCard>> it2 = c.entrySet().iterator();
        while (it2.hasNext()) {
            BusCard value = it2.next().getValue();
            if (Intrinsics.areEqual(value.getMiCardName(), str)) {
                return value;
            }
        }
        return null;
    }

    @NotNull
    public static final BusCard fromAid(@NotNull String str) {
        BusCard busCardA = a(str);
        if (busCardA != null) {
            return busCardA;
        }
        throw new IllegalArgumentException(("BusCard中未支持此城市（aid=" + str + (char) 65289).toString());
    }

    @NotNull
    public static final BusCard fromAppCode(@NotNull String str) {
        BusCard busCard = c.get(str);
        if (busCard != null) {
            return busCard;
        }
        throw new IllegalArgumentException(("BusCard中未支持此城市（appCode=" + str + (char) 65289).toString());
    }

    @NotNull
    public static final BusCard fromMiCardName(@NotNull String str) {
        BusCard busCardB = b(str);
        if (busCardB != null) {
            return busCardB;
        }
        throw new IllegalArgumentException(("BusCard中未支持此城市（miCardName=" + str + (char) 65289).toString());
    }

    @NotNull
    public static final List<String> getAllAppletAids() {
        return f;
    }

    @NotNull
    public static final List<String> getLNT_CITYS() {
        return d;
    }

    @NotNull
    public static final List<String> getLingNanTongAppCodeList() {
        return CollectionsKt___CollectionsKt.toMutableList((Collection) a.keySet());
    }

    @NotNull
    public static final Map<String, LingNanTong> getLingNanTongBusCardMap() {
        return a;
    }

    @NotNull
    public static final List<String> getLingNanTongTwoAppCodeList() {
        return CollectionsKt___CollectionsKt.toMutableList((Collection) b.keySet());
    }

    @NotNull
    public static final Map<String, LingNanTongTwo> getLingNanTongTwoBusCardMap() {
        return b;
    }

    @NotNull
    public static final List<String> getSnowballAccessDoorAidList() {
        return e;
    }

    public static final boolean isLingNanTong(@NotNull String str) {
        return a.containsKey(str);
    }

    public static final boolean isLingNanTongTwo(@NotNull String str) {
        return b.containsKey(str);
    }
}
