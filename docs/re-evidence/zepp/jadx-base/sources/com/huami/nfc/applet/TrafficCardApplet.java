package com.huami.nfc.applet;

import com.huami.nfc.applet.city.ICityApplet;
import com.huami.nfc.applet.city.LingNanTongMot;
import com.huami.nfc.base.INfcChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/nfc/applet/TrafficCardApplet;", "Lcom/huami/nfc/applet/ITrafficCardApplet;", "", "Lcom/huami/nfc/applet/city/ICityApplet;", "a", "aid", "getCity$nfc_applet_release", "(Ljava/lang/String;)Lcom/huami/nfc/applet/city/ICityApplet;", "getCity", "", "isInstalled", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "", "b", "Ljava/util/Map;", "cityMap", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class TrafficCardApplet implements ITrafficCardApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, ICityApplet> cityMap = new LinkedHashMap();

    public TrafficCardApplet(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final ICityApplet a(String str) {
        BusCard busCardFromAid = BusCardExtensions.fromAid(str);
        if (Intrinsics.areEqual(busCardFromAid, JiNanMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.JiNanMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShaoXingMotNew.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShaoXingMotNew(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntYctMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_YCT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntSztMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_SZT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntZstMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_ZST, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntZhtMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_ZHT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntDgtMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_DGT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntGftMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_GFT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntHztMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_HZT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntSttMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_STT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntWytMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_WYT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntMctMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_MCT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntZqtMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_ZQT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntZjtMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_ZJT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntJytMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_JYT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntHhtMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_HHT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntHyyzfMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_HYYZF, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntQysmkMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_QYSMK, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntShaoZhouMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_SHAOZHOUTONG, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntRJMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_RJT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntMJMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_MJT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntCZMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_CZT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LntLYMot.INSTANCE)) {
            return new LingNanTongMot(ConstantKt.AID_LNT_LYT, this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShangHaiMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShangHaiMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ZhenJiang.INSTANCE)) {
            return new com.huami.nfc.applet.city.ZhenJiang(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, YangZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.YangZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, JsTaiZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.JsTaiZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HuaiAn.INSTANCE)) {
            return new com.huami.nfc.applet.city.HuaiAn(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, SuQian.INSTANCE)) {
            return new com.huami.nfc.applet.city.SuQian(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, YanCheng.INSTANCE)) {
            return new com.huami.nfc.applet.city.YanCheng(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, XuZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.XuZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, LianYunGang.INSTANCE)) {
            return new com.huami.nfc.applet.city.LianYunGang(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShenZhenMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShenZhenMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, TaiZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.TaiZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, NingBo.INSTANCE)) {
            return new com.huami.nfc.applet.city.NingBo(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, NanTong.INSTANCE)) {
            return new com.huami.nfc.applet.city.NanTong(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, XiaMen.INSTANCE)) {
            return new com.huami.nfc.applet.city.XiaMen(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, QingDao.INSTANCE)) {
            return new com.huami.nfc.applet.city.QingDao(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HaiNan.INSTANCE)) {
            return new com.huami.nfc.applet.city.HaiNan(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HaErBin.INSTANCE)) {
            return new com.huami.nfc.applet.city.HaErBin(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShangHai.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShangHai(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, BeiJing.INSTANCE)) {
            return new com.huami.nfc.applet.city.BeiJing(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HeFei.INSTANCE)) {
            return new com.huami.nfc.applet.city.HeFei(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, XiAn.INSTANCE)) {
            return new com.huami.nfc.applet.city.XiAn(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShenZhen.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShenZhen(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, JiLin.INSTANCE)) {
            return new com.huami.nfc.applet.city.JiLin(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, SuZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.SuZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, JiangSu.INSTANCE)) {
            return new com.huami.nfc.applet.city.JiangSu(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, WuHan.INSTANCE)) {
            return new com.huami.nfc.applet.city.WuHan(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ChongQing.INSTANCE)) {
            return new com.huami.nfc.applet.city.ChongQing(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, JingJinJi.INSTANCE)) {
            return new com.huami.nfc.applet.city.JingJinJi(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, GuangXi.INSTANCE)) {
            return new com.huami.nfc.applet.city.GuangXi(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ZhengZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.ZhengZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, DaLian.INSTANCE)) {
            return new com.huami.nfc.applet.city.DaLian(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShenYang.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShenYang(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShiJiaZhuang.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShiJiaZhuang(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, TianJin.INSTANCE)) {
            return new com.huami.nfc.applet.city.TianJin(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HeFeiMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.HeFeiMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, XiAnMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.XiAnMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShiYan.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShiYan(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ChangZhou.INSTANCE)) {
            return new com.huami.nfc.applet.city.ChangZhou(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, WuXi.INSTANCE)) {
            return new com.huami.nfc.applet.city.WuXi(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ShaoXing.INSTANCE)) {
            return new com.huami.nfc.applet.city.ShaoXing(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, XiZang.INSTANCE)) {
            return new com.huami.nfc.applet.city.XiZang(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, NanJing.INSTANCE)) {
            return new com.huami.nfc.applet.city.NanJing(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, HeBei.INSTANCE)) {
            return new com.huami.nfc.applet.city.HeBei(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, YuLin.INSTANCE)) {
            return new com.huami.nfc.applet.city.YuLin(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ChangSha.INSTANCE)) {
            return new com.huami.nfc.applet.city.ChangSha(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ZhuHaiMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.ZhuHaiMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, GanZhouMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.GanZhouMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, ZhengZhouMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.ZhengZhouMot(this.channel);
        }
        if (Intrinsics.areEqual(busCardFromAid, WeiFangMot.INSTANCE)) {
            return new com.huami.nfc.applet.city.WeiFangMot(this.channel);
        }
        if (busCardFromAid instanceof LingNanTongTwo) {
            return new com.huami.nfc.applet.city.LingNanTongTwo(this.channel);
        }
        if (busCardFromAid instanceof LingNanTong) {
            return new com.huami.nfc.applet.city.LingNanTong(this.channel);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    public int getBalance(@NotNull String aid) {
        return getCity$nfc_applet_release(aid).getBalance();
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public CardInfo getCardInfo(@NotNull String aid) {
        return getCity$nfc_applet_release(aid).getCardInfo();
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public List<TransEntity> getChargeRecord(@NotNull String aid) {
        return getCity$nfc_applet_release(aid).getChargeRecord();
    }

    @NotNull
    public final ICityApplet getCity$nfc_applet_release(@NotNull String aid) {
        ICityApplet iCityApplet = this.cityMap.get(aid);
        if (iCityApplet != null) {
            return iCityApplet;
        }
        ICityApplet iCityAppletA = a(aid);
        this.cityMap.put(aid, iCityAppletA);
        return iCityAppletA;
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public List<TransEntity> getTransRecord(@NotNull String aid) {
        return getCity$nfc_applet_release(aid).getTransRecord();
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    public boolean isInstalled(@NotNull String aid) {
        return getCity$nfc_applet_release(aid).isInstalled();
    }
}
